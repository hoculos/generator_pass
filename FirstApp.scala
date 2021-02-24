object FirstApp extends App {
  //tests pass generator
  val lenght = 15
  val foo = new Pass(lenght)
  println(foo.testPass())
  print(foo.testMd5())

}






