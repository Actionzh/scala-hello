package com.actionzh

object TestList {
  def main(args: Array[String]): Unit = {
    //创建一个不可变集合
    val list1 = List(1, 2, 3)
    //将0插入到集合list1的前面生成一个新的list
    val list2 = 0 :: list1
    val list3 = list1.::(0)
    val list4 = 0 +: list1
    val list5 = list1.+:(0)
    println("list2=" + list2)
    println("list3=" + list3)
    println("list4=" + list4)
    println("list5=" + list5)

    //将3插入到集合list1的后面生成一个新的list
    val list6 = list1 :+ 3
    println("list6=" + list6)

  }

}
