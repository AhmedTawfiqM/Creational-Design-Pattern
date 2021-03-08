package ex2.priviliges.types

import ex2.priviliges.UserPrivileges

class BlockUsersPrivilege : UserPrivileges {
    override fun enable(): Boolean {
        return true
    }

    override fun disable(): Boolean {
       return true
    }
}