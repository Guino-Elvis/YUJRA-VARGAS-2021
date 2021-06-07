
def examen3():
  #definir variables
  print ("consulta que vacuna te toca")
  resultadoGYV=0
  #datos de entrada
  añosGYV=int(input("ingresa tu edad:"))
  #proceso
  if añosGYV>=70:
    resultadoGYV="se le aplica la vacuna tipo C"
  if añosGYV>16 and añosMLOA<=69:
     sexoGYV=input("ingresar sexo:") 
     if sexoGYV=="hombre":
       resultadoGYV="se le aplica la vacuna A"
     if sexoGYV=="mujer":
       resultadoGYV="se le aplica la vacuna B"
  if añosGYV<=16:
    resultadoGYV="se le aplica la vacuna tipo A"
  #datos de salida
  print("A la persona:",resultadoGYV)
examen3()