def examen2():
  #Definir variable y otros
  print("ingrese sus datos:")
  bonoObtenidoGYV=0.0
  #Datos de Entrada
  salarioMinimoGYV=float(input("Ingrese el salario:"))
  puntuacionObtenidaGYV=float(input("Ingrese la puntuación:"))
  #Proceso
  if puntuacionObtenidaGYV<=100 and puntuacionObtenidaGYV>=50:
    bonoObtenidoGYV=salarioMinimoGYV*10/100
  elif puntuacionObtenidaGYV >=101 and puntuacionObtenidaGYV<=150:
    bonoObtenidoGYV=salarioMinimoGYV*40/100
  elif puntuacionObtenidaGYV>=151:
    bonoObtenidoGYV=salarioMinimoGYV*70/100
  #Datos de salida
  print("El docente obtendra un bono de:", bonoObtenidoGYV )
examen2()