/**
  * Created by Administrator on 06/06/2017.
  */
class Garage {



}

 class Person (a: Int){

  var personID
  var name
  var contactNum
  var address
  var wallet

  //Get
   def personID: Int
   def name: String
   def contactNum: Int
   def address: String
   def wallet: Int

   //Set
   def personID = (a: Int)
   def name = (a: String)
}

abstract class Employee (a: Int) extends Person(a: Int) {

  personID
}

abstract class Customer (a: Int) extends Person(a: Int) {}
