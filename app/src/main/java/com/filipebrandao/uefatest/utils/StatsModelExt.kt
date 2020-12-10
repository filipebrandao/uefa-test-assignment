package com.filipebrandao.uefatest.utils

import com.filipebrandao.uefatest.api.model.StatsDTO
import com.filipebrandao.uefatest.ui.main.stats.model.StatsView

// maps a network Stats model to a StatsView UI model
fun StatsDTO.toUiModel(): StatsView = StatsView(title, homeValue, awayValue)