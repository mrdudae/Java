hora = int(input("Que horas são? "))

if hora >= 5 and hora < 11:
    print("Bom dia")
elif hora >= 12 and hora < 18:
    print("Boa tarde!")
elif hora >= 19 and hora < 23:
    print("Boa noite!")
else:
    print("vá dormir!")