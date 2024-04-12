import datetime

def mensagem_por_hora():
    agora = datetime.datetime.now()
    hora = agora.hour

    if hora >= 5 and hora < 11:
        return "Bom dia"
    elif hora >= 12 and hora < 18:
        return "\033[1;35mBoa tarde!\033[m"
    elif hora >= 19 and hora < 23:
        return "Boa noite!"
    else:
        return "vá dormir!"


print(mensagem_por_hora())