Algoritmo Reto6
	// Se declara el tama�o del arreglo
	Dimension numeros[9]
	// Se asignan los n�meros del 1 al 8 al arreglo
	Para i<-1 hasta 8 Hacer
		numeros[i]<-i
	FinPara
	// Se recorre el arreglo y se determina si el n�mero 
	// en el �ndice actual es par o impar.
	Para j<-1 hasta 8 Hacer
		Si numeros[j] mod 2 == 0 Entonces
			Escribir numeros[j],': El valor es par'
		SiNo
			Escribir numeros[j],': El valor es impar'
		FinSi
	FinPara
	// Por �ltimo se manipula el arreglo, agregando
	// el n�mero 9 en el �ltimo �ndice
	numeros[9]<-9
FinAlgoritmo
