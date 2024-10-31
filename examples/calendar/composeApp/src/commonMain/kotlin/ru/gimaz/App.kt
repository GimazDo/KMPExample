package ru.gimaz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.wojciechosak.calendar.config.rememberCalendarState
import io.wojciechosak.calendar.view.CalendarView
import io.wojciechosak.calendar.view.HorizontalCalendarView
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            val initPage = 100 / 2
            val pagerState = rememberPagerState(
                initialPage = initPage,
                pageCount = { 100 },
            )
            val startDate = LocalDate.parse("2020-01-01")
            HorizontalCalendarView(pagerState = pagerState, startDate = startDate) { monthOffset ->
                CalendarView(
                    config = rememberCalendarState(
                        startDate = startDate,
                        monthOffset = monthOffset,
                        showHeader = false,
                        showNextMonthDays = false,
                        showPreviousMonthDays = false
                    ),
                )
            }
        }
    }
}