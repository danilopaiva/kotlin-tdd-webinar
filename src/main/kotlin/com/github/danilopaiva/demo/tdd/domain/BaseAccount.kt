package com.github.danilopaiva.demo.tdd.domain

import com.github.danilopaiva.demo.tdd.repository.AccountRepository

interface BaseAccount {

    fun create(repository: AccountRepository)

    fun deposit(repository: AccountRepository, value: Number)

    fun withdraw(repository: AccountRepository, value: Number)
}