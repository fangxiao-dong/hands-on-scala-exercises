def flexibleFizzBuzz(cb: String => Unit): Unit = {
    for (i <- Range.inclusive(1, 100)) {
        var temp: String = (
            if (i % 3 == 0 && i % 5 == 0) {
                "FizzBuzz"
            } else if (i % 3 == 0) {
                "Fizz"
            } else if (i % 5 == 0) {
                "Buzz"
            } else {
                i.toString()
            }
        )
        cb(temp)
    }
}

// flexibleFizzBuzz(s => println(s))

var i = 0
val output = new Array[String](100)

flexibleFizzBuzz{s =>
  output(i) = s
  i += 1
}

println(output.mkString("\n"))
