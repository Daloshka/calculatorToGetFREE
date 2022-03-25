fun main(args: Array<String>) {
    val cardPrice: Int = 65000
    var salary: Int = 70000
    var videoIncome: Int = 5400
    var passiveIncome: Int = 2550
    var balance: Int = 111_000
    var month: Int = 0
    var counterCards: Int = 0

    var expense: Int = 0
    val mobileTariff: Int = 120
    val internetTariff: Int = 399
    val averageSpending: Int = 5000


    // Do you want quite your job when salary < passiveIncome?
    var isQuiteJob : Boolean  =true

    // General spending
    expense += mobileTariff + internetTariff + averageSpending

    println("Start: Balance = $balance Income = $passiveIncome  Salary = $salary")
    while (passiveIncome < 70000){
        if (isQuiteJob){
            if (salary < passiveIncome){
                isQuiteJob = false
                salary = 0
                println("\n -----------FUCK THIS JOB!---------------- \n")
            }

        }
        month += 1
        println("$month")
        while (balance > cardPrice){
            balance -= cardPrice
            counterCards++
            println("Videocard is bought!")
            passiveIncome += videoIncome
        }
        balance += salary + passiveIncome - expense

        println("Balance is $balance, $month month")
        println("Actually salary + passive income is ${salary+passiveIncome}")


    }
    println("\n-----------------------------------------------------------------------\nYou need $month months to rich it!")
    println("You have $counterCards videocards\nIt worths ${counterCards * 65_000} RUB")
}