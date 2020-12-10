package com.filipebrandao.uefatest.api.model

/**
 * Network responde model for statistics. Will likely change since the API is not implemented yet.
 * Values should be Double but I'll skip that because of time restrictions
 */
data class StatsDTO(val title: String, val homeValue: Int, val awayValue: Int)