package com.gmail.in2horizon.aescore.views

import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.gmail.in2horizon.aescore.R
import com.gmail.in2horizon.aescore.model.LoginViewModel

@Composable
fun TabCompetitions():Unit{


    Text(text = stringResource(id = R.string.competitions_tab)+"Compose")
}