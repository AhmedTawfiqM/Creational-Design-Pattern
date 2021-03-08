package ex2.priviliges

import ex2.priviliges.types.NetworkUserPrivilege

class Privileges {
    val allPrivileges: ArrayList<UserPrivileges> =   ArrayList()

    init {
        allPrivileges.add(NetworkUserPrivilege())
    }
}