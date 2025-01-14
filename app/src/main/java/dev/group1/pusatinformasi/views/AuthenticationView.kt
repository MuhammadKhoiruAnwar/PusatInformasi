package dev.group1.pusatinformasi.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

// Halaman Login
@Composable
fun LoginView(navController: NavController) {
    var usernameInput by remember {
        mutableStateOf("")
    }
    var passwordInput by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Login", style = MaterialTheme.typography.h4)

        Column {
            OutlinedTextField(
                label = { Text(text = "Nama pengguna") },
                modifier = Modifier.padding(8.dp),
                value = usernameInput,
                onValueChange = {
                    usernameInput = it
                }
            )

            OutlinedTextField(
                label = { Text(text = "Kata sandi") },
                modifier = Modifier.padding(8.dp),
                value = passwordInput,
                onValueChange = {
                    passwordInput = it
                }
            )
        }

        Button(shape = MaterialTheme.shapes.medium, onClick = {
            // TODO: Kirim input login ke server dan ambil hasil tokennya, kemudian arahkan ke halaman utama.
        }) {
            Text(text = "Login")
        }

        TextButton(onClick = {
            navController.navigate(ViewRoutes.RegisterPage.route)
        }) {
            Text(text = "Daftar")
        }
    }
}

// Halaman Register
@Composable
fun RegisterView(navController: NavController) {

    // Variabel input
    var usernameInput by remember {
        mutableStateOf("")
    }
    var passwordInput by remember {
        mutableStateOf("")
    }

    var verifyPass by remember {
        mutableStateOf("")
    }

    var emailInput by remember {
        mutableStateOf("")
    }

    // Desain UI
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Daftar", style = MaterialTheme.typography.h4)

        Column {
            OutlinedTextField(
                label = { Text(text = "Nama pengguna") },
                modifier = Modifier.padding(8.dp),
                value = usernameInput,
                onValueChange = {
                    usernameInput = it
                }
            )

            OutlinedTextField(
                label = { Text(text = "Kata sandi") },
                modifier = Modifier.padding(8.dp),
                value = passwordInput,
                onValueChange = {
                    passwordInput = it
                }
            )

            OutlinedTextField(
                label = { Text(text = "Konfirmasi kata sandi") },
                modifier = Modifier.padding(8.dp),
                value = verifyPass,
                onValueChange = {
                    verifyPass = it
                }
            )

            OutlinedTextField(
                label = { Text(text = "Email") },
                modifier = Modifier.padding(8.dp),
                value = emailInput,
                onValueChange = {
                    emailInput = it
                }
            )
        }

        Button(shape = MaterialTheme.shapes.medium, onClick = {
            // TODO: Ketika pengguna menekan tombol "Daftar" arahkan ke halaman "Login".
        }) {
            Text(text = "Daftar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Login_Preview() {
    LoginView(rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun Register_View() {
    RegisterView(rememberNavController())
}