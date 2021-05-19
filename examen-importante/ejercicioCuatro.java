def examen4():
 #definir datos y varibales
 print ("indica que operacion desea realizar")
 operacionGYV=0
 #ingrese datos de entrada
 numeroGYV=int(input("ingrese el primer numero:"))
 numero1GYV=int(input("ingrese el segundo numero:"))
 signoGYV=input("ingrese el signo de la operacion que quieres realizar:")
 #proceso
 if signoGYV=="+":
   operacionGYV=numeroGYV+numero1GYV
 if signoGYV=="-":
   operacionGYV=numeroGYV-numero1GYV
 if signoGYV=="*":
   operacionGYV=numeroMLOA*numero1GYV
 if signoGYV=="/":
   operacionGYV=numero/numero1GYV
 if signoGYV=="^":
   operacionGYV=numeroMLOA^numero1GYV
  #datos de salida
 print("El resultado de su operacion es :",operacionGYV)
examen4()