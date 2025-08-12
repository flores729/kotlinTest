fun main(args: Array<String>) {
    println("hello world!")
    var a = 10;
    val b = 11;
    //b는  수정 불가 읽기만 가능
    var i : Int = 10;
    var j : Int? = 10;
    //i = null; 불가능 null값이 들어가려면 ? 존재해야함
    j = null;
    val s = "abc";
    val I = 1;
    val l = 1L;
    val d = 1.0
    val f = 1.0f
    println("s = $s")
    println("I = $I")
    println("l = $l")
    println("d = $d")
    println("f = $f")
    val priceA: Int = 200
    val priceB: Int = 100
    if (priceA > priceB) {
        println("$priceA is bigger than $priceB")
        println("--------------------")
        //println("" + priceA + " is bigger than " + priceB)
    }
    else{
        println("$priceB is bigger than $priceA")
    }

    if(j == null){
        println("null check true")

    }
    else{
        println("null check false")
    }

    val price: Int = 1000
    if(price in arrayOf(100, 200, 300, 1000)){
        println("contain")
    }
    else{
        print("not contain")
    }
    for (i in arrayOf(100, 200, 103, 201, 1000, 1902)){
        println("$i ==================================")
        when(i) {
            100 -> println("1. price = $i")
            200 -> println("2. price = $i")
            1000 -> println("3. price = $i")
            else -> println("error")
        }
        println("============== Discrete ====================")
        when(i) {
            in 100..109 -> println("1. price = $i")
            in 200..299 -> println("2. price = $i")
            in 1000..2000 -> println("3. price = $i")
            else -> println("error")
        }
        println("=============== Range =====================")
        println("\n\n\n\n")

    }
}