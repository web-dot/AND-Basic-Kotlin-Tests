
/**
	?what is infix function 	: infix function is a type of a function that allows you to call it using a special infix notation(can be called without dot-notation and parenthesis)
	?how to define infix fun 	: defined using `infix` keyword
	<RecieverType>				: type on which you can call the function
	<FunctionName>				: name of the infix function
	parameter					: parameter passed to the function
	ReturnType					: return type

	infix fun <RecieverType>.<FunctionName>(parameter: ParameterType): ReturnType { // body }
*/

fun main(){
	infix fun Int.times(str: String) = str.repeat(this)
	println(2 times "Bye ")

	val pair = "Ferrari" to "Sudipto"
	println(pair)

	val vijay = Person("Vijay")
	val ajay = Person("Ajay")
	vijay friendOf ajay
}


class Person(val name: String){
	val likedPeople = mutableListOf<Person>()
	infix fun friendOf(other: Person){likedPeople.add(other)}
}



