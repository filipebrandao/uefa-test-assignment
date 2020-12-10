package com.filipebrandao.uefatest.ui.main.stats

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.filipebrandao.uefatest.api.IStatsApi
import com.filipebrandao.uefatest.api.MockStatsApi
import com.filipebrandao.uefatest.ui.main.stats.model.StatsView
import com.filipebrandao.uefatest.utils.toUiModel

class StatsViewModel : ViewModel() {

    // reference to the stats API : a synchronous mock  for now.
    private val statsApi: IStatsApi = MockStatsApi()

    /**
     *  Exposes the stats data to the View
     */
    fun getAttackingStats(): LiveData<List<StatsView>> {
        val liveData = MutableLiveData<List<StatsView>>()

        val stats = mutableListOf<StatsView>()
        statsApi.getAttackingStats().forEach {
            stats.add(it.toUiModel())
        }
        liveData.value = stats

        return liveData
    }
}