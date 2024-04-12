
print("selecione operação:")

def soma(num, num2):
    return num + num2
def subtracao(num, num2):
    return num - num2
def multiplicacao(num, num2):
    return num * num2
def divisao(num, num2):
    if num2 != 0:
        return num / num2
    else:
        return "não é possivel divisao por 0"
print("1. Soma")
print("2. subtração")
print("3. multiplicação")
print("4. Divisao")

opç = input("\033[1;49;37mescolha um valor de 1 a 4: \033[m")
num = int(input("digite o primeiro numero:"))
num2 = int(input("digite segundo numero:"))



if opç == '1':
    print("resultado:", soma(num, num2))
elif opç == '2':
    print("resultado:", subtracao(num, num2))
elif opç == '3':
   print("resultado:", multiplicacao(num, num2))
elif opç == '4':
      print("resultado:", divisao(num, num2))
else:
    print("\033[1;49;91mEscolha uma opção valida!\033[m")

