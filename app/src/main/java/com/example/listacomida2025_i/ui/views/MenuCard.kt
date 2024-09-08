package com.example.listacomida2025_i.ui.views

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGesturesPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo
import com.example.listacomida2025_i.ui.theme.ListaComida2025ITheme

@Composable
fun MenuCard(platillo: Platillo,modifier: Modifier = Modifier){
    Card(modifier = Modifier) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically // Alinea la imagen y el texto verticalmente
            ) {
                // Imagen dentro de un cuadro de 90x90 dp, alineada a la izquierda
                Image(
                    painter = painterResource(id = platillo.drawableResourceId),
                    contentDescription = stringResource(id = platillo.StringResourceId),
                    modifier = Modifier
                        .size(90.dp) // Tamaño exacto de 90x90 dp
                        .clip(CircleShape) // Forma circular
                        .border(2.dp, Color.Cyan, CircleShape), // borde para el cuadro
                    contentScale = ContentScale.Crop // Ajusta la imagen para llenar el cuadro
                )

                Spacer(modifier = Modifier.width(16.dp)) // Espacio entre la imagen y el texto

                Column(


                ) {

                    //nombre del platillo tamaño título
                    Text(
                        text = LocalContext.current.getString(platillo.StringResourceId),
                        modifier = Modifier.padding(bottom = 4.dp), // Espacio debajo del texto
                        style = TextStyle(
                            fontSize = 24.sp, // Tamaño grande para el título
                            fontWeight = FontWeight.ExtraBold,// Grosor de fuente para el título
                            color = Color.Black
                            )
                    )

                    // Precio tipo normal
                    Text(
                        text = LocalContext.current.getString(platillo.precioResourceId),
                        modifier = Modifier.padding(bottom = 4.dp), // Espacio debajo del texto
                        style = TextStyle(
                            fontSize = 20.sp, // Tamaño de texto normal
                            fontWeight = FontWeight.Normal // Grosor de fuente normal
                        )
                    )

                    // Oferta del platillo con diferente color
                    Text(
                        text = LocalContext.current.getString(platillo.ofertaResourceId),
                        style = TextStyle(
                            fontSize = 20.sp, // Tamaño de texto más pequeño
                            fontWeight = FontWeight.SemiBold, // Grosor de fuente en negritas
                            color = Color.Red
                        )
                    )
                }
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun MenuCardDisplay(){
    ListaComida2025ITheme {
    //strings
        MenuCard(platillo = Platillo(
            R.string.tacos,            // Nombre del platillo (referencia a strings.xml)
            R.drawable.tacos,          // Imagen del platillo (referencia a un recurso drawable)
            R.string.precio_tacos,     // Precio (referencia a strings.xml)
            R.string.promo_tacos       // Promoción (referencia a strings.xml)
     ) )
    }
}