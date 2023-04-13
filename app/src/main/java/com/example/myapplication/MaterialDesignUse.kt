package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaterialDesignUse() {
    MaterialTheme {
        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()
        Scaffold (
            snackbarHost = { SnackbarHost(snackbarHostState) },
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("Material Design Use") },
                )

            },
            bottomBar = {
                BottomAppBar(
                    content = {
                        Text("Bottom Bar")
                    }
                )
            },
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    onClick = {
                        // show snackbar
                        scope.launch {
                            snackbarHostState.showSnackbar(
                                "Fab Button Pressed"
                            )
                        }
                    },
                    icon = {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favorite"
                        )
                    },
                    text = { Text("Like") }
                )
            },
            floatingActionButtonPosition = FabPosition.End,
            content = { contentPadding ->
                // Screen content
                Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            // show snackbar
                            scope.launch {
                                snackbarHostState.showSnackbar(
                                    "Like Button Pressed"
                                )
                            }
                        },
                        contentPadding = PaddingValues(
                            start = 20.dp,
                            top = 12.dp,
                            end = 20.dp,
                            bottom = 12.dp
                        )
                    ) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favorite",
                            modifier = Modifier.size(ButtonDefaults.IconSize)
                        )
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        Text("Like")
                    }
                }
            }
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun MaterialDesignUsePreview() {
    MyApplicationTheme {
        MaterialDesignUse()
    }
}