package com.example.listacomida2025_i.ui.views
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo

@Composable
fun MenuCardList(platilloList: List<Platillo>,
                 modifier: Modifier= Modifier){
    Scaffold(
        topBar = {
            MenuTopAppBar()
        }
    ) {
        it->
        LazyColumn(contentPadding = it  ,modifier = modifier) {
            items(platilloList) { platillo ->
                MenuCard(
                    platillo = platillo,
                    modifier = Modifier.padding(10.dp)
                    
                )

            }

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_commudel),
                    contentDescription = null,
                    modifier = modifier
                        .padding(8.dp)
                        .size(64.dp) // Directamente usando 64.dp
                )
                Text(
                    text =  "Comuddel", // Texto directo


                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    )
}


/*
@Preview( showBackground = true)
@Composable
fun ShowListCardMenu(){

    ListaComida2025ITheme {

        MenudCardList(platilloList =  ,
            modifier = )
    }
}
*/