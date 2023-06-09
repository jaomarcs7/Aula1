package com.example.aula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula1.ui.theme.Aula1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula1Theme {
                Welcome ()
                }
            }
        }
    }
@Composable
fun Welcome() {
    Row(
        modifier = Modifier.padding(16.dp),

    ) {

        Text(
            text = "Welcome Back, \n João Marcos",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.weight(1F)
        )
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Clear Transactions"
        )

    }
}


