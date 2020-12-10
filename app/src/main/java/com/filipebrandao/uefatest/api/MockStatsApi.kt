package com.filipebrandao.uefatest.api

import com.filipebrandao.uefatest.api.model.StatsDTO

class MockStatsApi : IStatsApi {
    override fun getAttackingStats(): List<StatsDTO> {
        val stats = mutableListOf<StatsDTO>()
        stats.add(StatsDTO("Penalties scored", 1, 0))
        stats.add(StatsDTO("Big chances", 2, 0))
        stats.add(StatsDTO("Attempts", 14, 5))
        stats.add(StatsDTO("On target", 5, 0))
        stats.add(StatsDTO("Off target", 5, 5))
        stats.add(StatsDTO("Attacks", 52, 43))
        stats.add(StatsDTO("Attacks organized", 34, 27))
        stats.add(StatsDTO("Dribbles", 10, 5))
        stats.add(StatsDTO("Run solo into penalty area", 10, 5))
        return stats
    }
}