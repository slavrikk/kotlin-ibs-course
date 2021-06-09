package ibs.module_two

fun main(args: Array<String>) {
    var countAnswer: Int = 0;
    println("\tQ1 DELTREE command is used to delete: \n1.Directory \n2.Files \n3.Subdirectory \n4.All mentioned")
    var answerOne: String? = readLine();
    if (answerOne.equals("4")) countAnswer++;

    println("\tQ2. Extension of the DOS command files: \n1.EXE \n2.COM \n3.BAT \n4.BASS")
    var answerTwo: String? = readLine();
    if (answerTwo.equals("2")) countAnswer++;

    println("\tQ3. The data on each drive is organized in the form of: \n1.Directories \n2.Files \n3.A and B both \n4.None of these")
    var answerThree: String? = readLine();
    if (answerThree.equals("3")) countAnswer++;

    println("\tQ4. Dir *.*: \n1.Lists all files of extension .doc \n2.List all files \n3.List all files of name sample \n4.None of these")
    var answerFour: String? = readLine();
    if (answerFour.equals("2")) countAnswer++;

    println("\tQ5. Rmdir command: \n1.Remove directory \n2.Makes directory \n3.Copies files \n4.None of these")
    var answerFive: String? = readLine();
    if (answerFive.equals("1")) countAnswer++;

    when (countAnswer) {
        in 0..2 -> println("Sorry, your answers result is terrible, lets try it again!")
        in 3..4 -> println("Your result is satisfied, but You could archive more!")
        5 -> println("Your result is remarkable!")
    }
}