package com.arfin.mupicompose.presentation.hall.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ChooseDaySection(modifier: Modifier=Modifier) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
    ) {
        items(generateDateList()) { day ->
            DayCard(day.first.dayOfMonth.toString(), day.second)
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
fun generateDateList(): List<Pair<LocalDate, String>> {
    val today = LocalDate.now()
    val endDate = today.plusDays(30)
    val dateList = mutableListOf<Pair<LocalDate, String>>()

    var currentDate = today
    while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
        val day = currentDate.dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault())
        dateList.add(currentDate to day)
        currentDate = currentDate.plusDays(1)
    }

    return dateList
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun ChooseDaySectionPreview() {
    ChooseDaySection()
}