n1 = []
for _ in range(10): 
    notas = []
    for _ in range(4):  
        nota = float(input("Digite a nota: "))
        notas.append(nota)   
    n1 = sum(notas) / 4 
    n1.append(me)
for n1 in n1:
    if n1 > 7:
        print("Média maior que 7:", n1)