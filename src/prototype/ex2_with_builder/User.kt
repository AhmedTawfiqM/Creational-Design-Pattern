package ex2

import ex2.priviliges.Privileges
import ex2.priviliges.UserPrivileges
import ex2.priviliges.types.BlockUsersPrivilege
import ex2.priviliges.types.WebUserPrivilege
import java.lang.Exception

data class User(
    val id: String,
    val profileData: ProfileData,
    val userPrivileges: Privileges,
) : UserProtoType {

    class Builder(idUser: String) {

        private var id: String = idUser
        private lateinit var profileData: ProfileData
        private var userPrivileges = Privileges()

        fun setID(id: String) = apply { this.id = id }
        fun setProfileData(profileData: ProfileData) = apply { this.profileData = profileData }
        fun setPrivileges(userPrivileges: Privileges) = apply { this.userPrivileges = userPrivileges }
        fun addPrivilege(privilege: UserPrivileges) = apply { this.userPrivileges.allPrivileges.add(privilege) }
        fun addPrivileges(allPrivileges: List<UserPrivileges>) =
            apply { this.userPrivileges.allPrivileges.addAll(allPrivileges) }

        fun build(): User {
            if (id == "" || !this::profileData.isInitialized) throw Exception("Not Valid Object.") else
                return User(id, profileData, userPrivileges)
        }
    }

    override fun clone(): User {

        //.............Real Scenario World  .......................
        return Builder("NOT EXISTED USER")
            .setProfileData(ProfileData("NAME", profileData.age, profileData.address, "", "")) //same age and Address
            .build()
    }

    override fun toString(): String {
        return "ID $id : ${userPrivileges.allPrivileges} \n ${profileData.name}"
    }
}