Algoritmo Reto6
	// Se declara el tamaño del arreglo
	Dimension numeros[9]
	// Se asignan los números del 1 al 8 al arreglo
	Para i<-1 hasta 8 Hacer
		numeros[i]<-i
	FinPara
	// Se recorre el arreglo y se determina si el número 
	// en el índice actual es par o impar.
	Para j<-1 hasta 8 Hacer
		Si numeros[j] mod 2 == 0 Entonces
			Escribir numeros[j],': El valor es par'
		SiNo
			Escribir numeros[j],': El valor es impar'
		FinSi
	FinPara
	// Por último se manipula el arreglo, agregando
	// el número 9 en el último índice
	numeros[9]<-9
FinAlgoritmo
