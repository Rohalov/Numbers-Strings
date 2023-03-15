fun main(args: Array<String>) {
    //Дано номер телефону
    var phoneNumber = "+38(099)519-54-70"
    //Вивести в консоль номер без коду країни(у такому форматі: (ххх)ххх-хх-хх
    println("Номер без коду країни: ${phoneNumber.removePrefix("+38")}")
    //Вивести в консоль код оператора (099) без дужок
    println("Номер коду оператора: ${phoneNumber.removeSurrounding("+38(", ")519-54-70")}")
    //Порахувати кількість цифр у номері(попередньо) видаливши усі зайві символи зі строки,
    // а саме "+", "(", ")", "-". Результат вивести в консоль
    var phoneNumberWithoutChar = ""
    var numberOfDigits = 0
    var sum = 0
    for (char in phoneNumber) {
        if (char.isDigit()) {
            phoneNumberWithoutChar += char
            numberOfDigits++
            sum += char.digitToInt()
        }
    }
    println("Кількість цифр у номері: $numberOfDigits")
    //Вивести в консоль номер без коду країни та оператора(у такому форматі: ххххххх - без розділових дефісів)
    println("Номер без коду країни та оператора: ${phoneNumberWithoutChar.removePrefix("38099")}")
    //Порівняти першу та передостанню цифру номера телефону, результат вивести у консоль
    var firstNumber = phoneNumberWithoutChar.first()
    var penultimateТumber = phoneNumberWithoutChar[phoneNumberWithoutChar.length - 2]
    if (firstNumber > penultimateТumber){
        println("Перша цифра більша ніж передостання")
    }else if (firstNumber < penultimateТumber){
        println("Перша цифра менша ніж передостання")
    }else{
        println("Перша цифра рівна передостанній")
    }
    //Знайти середнє арифметичне усіх чисел номера та піднести отримане число до степеня "2/3". Отриманий результат вивести у консоль
    var average = sum/numberOfDigits
    var exponent = 2.0/3.0
    var result = Math.pow(average.toDouble(), exponent)
    println("Середнє арифметичне усіх чисел номера піднесене до степеня \"2/3\": $result")
}

