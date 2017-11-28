La gramatica se encuentra en /PyLogic/src/Grammar/PyLogic.g4


La gramatica base es de python 3, por lo tanto, la sintaxis sera la misma, para cada funcion o ciclo se definira con 
sus respectivas palabras reservadas ('if', 'for', 'while',...), seguido por un ':', un salto de linea y una identacion.
Para finalizar las subrutinas, se debera debera devolver la identacion previamente.

Para declarar los hechos, se coloca la palabra reservada 'fact' seguido del nombre del hecho, luego ':', un salto de 
linea y una identacion. Los hechos se colocan entre parentesis.
	EJ:	fact human:
			(Gabriel)
			(David)
			   .
			   .

Para declarar las reglas, se coloca la palabra reservada 'rule' seguido del nombre de la regla, luego los parametros
de la regla, un ':' y un salto de lu=inea con identacion. Las reglas se colocan entre parentesis.
	EJ:	rule mortal(X):
			(human(X))
			   .
			   .

Para hacer consultas, se coloca la palabra reservada 'consult' seguido de la consulta que se desea hacer, esta 
consulta debera estar entre paremntesis. Las consultas retornaran 'True' o 'False' si se encuentra o no el valor
para la cual la sentencia de la consulta se cumple, o retornara un valor o una cadena con los respectivos valores
que cumples dicha consulta. 
	EJ:	consult (human(X))  =======> [Gabriel,David]
		consult (mortal(David)) ===> True 