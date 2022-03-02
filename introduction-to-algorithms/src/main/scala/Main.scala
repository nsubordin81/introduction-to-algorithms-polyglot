@main def hello: Unit = 
  println("Hello world!")
  println(insertionSort(2::4::3::1::Nil))


// simpler instance of unordered list, don't like so much
// it is a faithful more or less reproduction of the psuedocode 
// but it breaks some scala rules abou mutable state
// I'd rather have this accomplished with recursion than assignment
def place(unordered: List[Int], j: Int, key: Int): List[Int] = 
  var i = j - 1
  var unsorted: List[Int] = unordered
  while (i >= 0 && unsorted(i) > key) do
    unsorted = unsorted.updated(i+1, unsorted(i))
    i = i - 1
  unsorted.updated(i + 1, key)


def insertionSort(unsorted: List[Int]) =
  var returnList: List[Int] = unsorted
  for (x, j) <- unsorted.zipWithIndex
    if j >= 1
  do returnList = place(returnList, j, x)
  returnList