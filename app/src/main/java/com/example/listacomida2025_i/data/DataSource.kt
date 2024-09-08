package com.example.listacomida2025_i.data

import com.example.listacomida2025_i.R
import com.example.listacomida2025_i.model.Platillo

public class DataSource {
    fun loadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, R.drawable.desayuno, R.string.precio_desayuno, R.string.promo_desayuno),
            Platillo(R.string.hamburger, R.drawable.hamburger, R.string.precio_hamburger, R.string.promo_hamburger),
            Platillo(R.string.pizza, R.drawable.pizza, R.string.precio_pizza, R.string.promo_pizza),
            Platillo(R.string.postre, R.drawable.postre, R.string.precio_postre, R.string.promo_postre),
            Platillo(R.string.pozole, R.drawable.pozole, R.string.precio_pozole, R.string.promo_pozole),
            Platillo(R.string.tacos, R.drawable.tacos, R.string.precio_tacos, R.string.promo_tacos)

        )
    }
}