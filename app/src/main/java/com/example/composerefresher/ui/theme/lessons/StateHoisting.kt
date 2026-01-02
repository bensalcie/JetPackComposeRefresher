package com.example.composerefresher.ui.theme.lessons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/***
 *
 * In Composable functions, state that is read or modified by multiple
 * functions should live in a common ancestor—this process is called state hoisting.
 * To hoist means to lift or elevate.
 *
 */

/** [MyApp]  `shouldShowOnBoarding`  is the Hoisted State **/

@Composable
fun MyApp(modifier: Modifier = Modifier.fillMaxSize()) {
    var shouldShowOnBoarding by remember {
        mutableStateOf(true)
    }
    Surface(modifier) {
        if (shouldShowOnBoarding) {
            OnBoardingScreen(onContinueClicked = { shouldShowOnBoarding = false })
        } else {
            Greetings()
        }
    }
}

@Composable
fun Greetings(modifier: Modifier = Modifier, names: List<String> = listOf("World", "Compose")) {
    Column(modifier.padding(vertical = 4.dp)) {
        for (name in names) {
            Greeting(name)
        }

    }

}


@Composable
fun OnBoardingScreen(
    onContinueClicked: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        Text("Welcome to Code Basics! ")
        Button(onClick = onContinueClicked, modifier = Modifier.padding(top = 24.dp)) {
            Text("Continue")
        }

    }
}

@Preview
@Composable
fun MyAppPreview() {
    MyApp()
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    OnBoardingScreen(onContinueClicked = {})
}

@Preview
@Composable
fun GreetingsPreview() {
    Greetings()
}
