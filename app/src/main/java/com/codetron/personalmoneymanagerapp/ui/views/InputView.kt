package com.codetron.personalmoneymanagerapp.ui.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputView(
    modifier: Modifier = Modifier,
    label: String,
    value: String,
    enabled: Boolean = true,
    errorMessage: String? = null,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    keyboardActions: KeyboardActions = KeyboardActions()
) {

    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            color = if (errorMessage.isNullOrEmpty()) {
                Color.Black
            } else {
                Color.Red
            }
        )
        Spacer(modifier = Modifier.height(4.dp))
        BasicTextField(
            value = TextFieldValue(
                text = value,
                selection = TextRange(value.length)
            ),
            visualTransformation = if (keyboardOptions.keyboardType == KeyboardType.Password) {
                PasswordVisualTransformation()
            } else VisualTransformation.None,
            enabled = enabled,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            maxLines = 1,
            singleLine = true,
            cursorBrush = SolidColor(MaterialTheme.colors.primary),
            modifier = Modifier
                .fillMaxWidth()
                .background(shape = RoundedCornerShape(4.dp), color = Color.Transparent)
                .border(
                    border = BorderStroke(
                        width = 1.dp,
                        color =
                        if (errorMessage.isNullOrEmpty()) {
                            MaterialTheme.colors.primary
                        } else {
                            Color.Red
                        }
                    ),
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(horizontal = 10.dp, vertical = 14.dp),
            onValueChange = {
                onValueChange(it.text)
            }
        )

        errorMessage?.let {
            Text(text = it, color = Color.Red, fontSize = 14.sp)
        }
    }
}