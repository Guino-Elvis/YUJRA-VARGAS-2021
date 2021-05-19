def examen3():
  #definir variables
  print ("consulta que vacuna te toca")
  resultadoGYV=0
  #datos de entrada
  añosGYV=int(input("ingresa tu edad:"))
  #proceso
  if añosMLOA>=70:
    resultadoGYV="se le aplica la vacuna tipo C"
  if añosMLOA>16 and añosMLOA<=69:
     sexoMLOA=input("ingresar sexo:") 
     if sexoGYV=="hombre":
       resultadoGYV="se le aplica la vacuna A"
     if sexoMLOA=="mujer":
       resultadoGYV="se le aplica la vacuna B"
  if añosMLOA<=16:
    resultadoGYV="se le aplica la vacuna tipo A"
  #datos de salida
  print("A la persona:",resultadoMLOA)
examen3()