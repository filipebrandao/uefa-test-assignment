package com.filipebrandao.uefatest.api

import com.filipebrandao.uefatest.api.model.StatsDTO

/**
 * Interface for the Stats API
 */
interface IStatsApi {
    /**
     * Fetches the Attacking Stats (should be asynchronous in a real scenario)
     */
    fun getAttackingStats(): List<StatsDTO>
}