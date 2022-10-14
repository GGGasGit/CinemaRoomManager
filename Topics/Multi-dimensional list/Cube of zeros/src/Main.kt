const val LISTSIZE = 3

fun main() {
    val myList = MutableList(LISTSIZE) {
        MutableList(LISTSIZE) {
            MutableList<Int>(LISTSIZE) { 0 }
        }
    }
    print(myList)
}