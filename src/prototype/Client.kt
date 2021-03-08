package prototype

import kotlin.jvm.JvmStatic
import ex1.Employee
import ex2.Address
import ex2.ProfileData
import ex2.User
import ex2.priviliges.types.BlockUsersPrivilege
import ex2.priviliges.types.WebUserPrivilege

object Client {
    @JvmStatic
    fun main(args: Array<String>) {

        //Over Engineering... Example
        val mohamed = Employee("12", "Mohamed")
        val ahmed = mohamed.clone() //clone
        println("$mohamed : $ahmed") //note the 2 instatnces are different NOW

        //.............Real Scenario World  .......................
        val samia = User.Builder("AH-12")
            .setProfileData(ProfileData("Ahmed", 12.2, Address(1.2, 1.2), "", ""))
            .addPrivilege(BlockUsersPrivilege())
            .addPrivilege(WebUserPrivilege())
            .build()
        println(samia)
        val magda = samia.clone()
        println(magda)
        val said = magda.clone()
        println(said)

        //User tasneem = new User().clone(); //todo id u use Secondary Constructor in kotlin , TOO in java u can make it easily

        //Summery  >Problems to be solved
        //todo Application "hard wires" the class of object to create in each "new" expression.

        //references
        //https://sourcemaking.com/design_patterns/prototype
        //https://refactoring.guru/design-patterns/prototype
    }
}