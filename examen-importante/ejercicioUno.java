def examenGYV():
  #Definir variable y otros
  print("Consulte su nota del curso de fundamentos de programacion segun la ponderacion")
  notafinalGYV=0
  #Datos de entrada
  unidad1GYV=int(input("Ingresa tu nota de la primera unidad: "))
  unidad2GYV=int(input("Ingresa tu nota de la segunda unidad: "))
  unidad3GYV=int(input("Ingresa tu nota de la tercera unidad: "))
  trabajofGYV=int(input("Ingresa tu nota de la cuarta unidad: "))
  #Proseso
  if unidad1GYV>=0 and unidad1GYV<=20:
    nota1GYV=unidad1GYV*20/100
  if unidad2GYV>=0 and unidad2GYV<=20:
    nota2GYV=unidad2GYV*15/100
  if unidad3GYV>=0 and unidad3GYV<=20:
    nota3MLOA=unidad3MLOA*15/100
  if trabajofGYV>=0 and trabajofGYV<=20:
    nota4GYV=trabajofGYV*50/100
  notafinalGYV=nota1MLOA+nota2MLOA+nota3GYV+nota4GYV
  #datos de salida
  print("Su nota final es:",notafinalGYV)
examenGYV()