package com.example.composerefresher.ui.theme.lessons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/***
 * Learn how compose updates state, keeps state and prevents re composition
 *
 */
@Composable
fun Greeting(name: String) {
    var isExpanded by rememberSaveable { mutableStateOf(false) }
    Surface(
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(24.dp)
                .padding(bottom = if (isExpanded) 48.dp else 0.dp)
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text("Hello")
                Text(text = name)
            }
            ElevatedButton(onClick = { isExpanded = !isExpanded }) {
                Text(if (isExpanded) "Show less" else "Show more")
            }
        }
    }

}

@Preview
@Composable
fun GreetingPreview() {
    Greeting("Ben Salcie")
}