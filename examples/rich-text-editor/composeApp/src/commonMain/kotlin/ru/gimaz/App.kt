package ru.gimaz

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.mohamedrejeb.richeditor.model.rememberRichTextState
import com.mohamedrejeb.richeditor.ui.material3.RichText
import com.mohamedrejeb.richeditor.ui.material3.RichTextEditor
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            val state = rememberRichTextState()
            LaunchedEffect(Unit){
                state.setHtml("<p ><strong ><span >Криты и блокеры по мобильному приложению</span></strong><span >. По каждому</span><br></p><ol style=\"list-style-type: decimal;\"><li ><span >% вероятности решения до конца года</span></li><li ><span >Воспроизводимость</span></li><li ><span >Либо ссылка на разрабов, либо краткое описание проблемы.</span></li><li ><span >Какие шаги можем предпринять - затратный ресерч, разработка примитивного приложения для воспроизведения, доп. логгирование, посмотреть другим людям, и др..</span></li></ol>")
            }
            RichTextEditor(
                state = state,
            )
        }
    }
}