fun main(args: Array<String>) {
    class Planteating //объявили класс "травоядные"
    class Meateating //объявили класс "плотоядные"

    class planteating (val name: String, val name1: String, val eat: String, var weight: Int)
    println("Введите название первого травоядного:")
    val name = readln() //Ввод названия 1 травоядного
    println("Введите название второго травоядного:")
    val name1 = readln() //Ввод названия 2 травоядного
    println("Введите корм, который они едят:")
    val eat = readln() //Ввод вида корма
    println("Введите суммарный вес травоядных в кг:")
    var weight = readln() //Ввод веса

    class meateating (val name2: String, val name3: String, val eat1: String, var weight1: Int)
    println("Введите название первого плотоядного:")
    val name2 = readln() //Ввод названия 1 плотоядного
    println("Введите название второго плотоядного:")
    val name3 = readln() //Ввод названия 2 плотоядного
    println("Введите корм, который они едят:")
    val eat1 = readln() //Ввод вида корма
    println("Введите суммарный вес плотоядных в кг:")
    var weight1 = readln() //Ввод веса
    println("Введеные травоядные: "+name+" и "+name1+", которые едят "+eat+" и весят "+weight+"кг") //Вывод получившегося значения
    println("Введеное плотоядное: "+name2+" и "+name3+", которые едят "+eat1+" и весят "+weight1+"кг") //Вывод получившегося значения
    
}