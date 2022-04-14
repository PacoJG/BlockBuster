package com.example.blockbuster.data

import com.example.blockbuster.model.Movie

class DBMovie {
    companion object{
        val moviesList = listOf<Movie>(
            Movie(
                1,
                "Spider-Man: No Way Home",
                "Superhéroes",
                "Tras descubrirse la identidad secreta de Peter Parker como Spider-Man, la vida del joven se vuelve una locura.",
                "15/Dic/2021"
            ),
            Movie(
                2,
                "Red",
                "Infantil/Comedia",
                "Mei Lee, una niña de 13 años un poco rara pero segura de sí misma, que se debate entre seguir siendo la hija obediente que su madre quiere....",
                "21/Feb/2022"
            ),
            Movie(
                3,
                "Scream",
                "Terror",
                "Courtney Cox y compañía han regresado para intentar sobrevivir a duras penas a Ghostface.",
                "14/Ene/2022"
            ),
            Movie(
                4,
                "Uncharted: Fuera del mapa",
                "Acción/Aventura",
                "El cazador de tesoros Victor Sullivan recluta a Nathan Drake para que lo ayude a recuperar una fortuna de 500 años de antigüedad.",
                "15/Dic/2022"
            ),
            Movie(
                5,
                "The Batman",
                "Superhéroes",
                "En su segundo año luchando contra el crimen, Batman explora la corrupción existente en la ciudad de Gotham",
                "03/Mar/2022"
            ),
            Movie(
                6,
                "Sonic 2",
                "Aventura/Ciencia ficción",
                "Después de establecerse en Green Hills, Sonic quiere demostrar que tiene madera de héroe.",
                "02/Abr/2022"
            ),
            Movie(
                7,
                "Ambulance: Plan de huida",
                "Acción/Suspenso",
                "Unos hermanos ladrones intentan dejar a atrás a la policía de Los Ángeles después de secuestrar una ambulancia para escapar del robo de un banco.",
                "08/Abr/2022"
            ),
            Movie(
                8,
                "Ruega por nosotros",
                "Terror",
                "Un periodista con poca suerte descubre una serie de milagros en un pueblo de Nueva Inglaterra. Después de investigar los acontecimientos con el objetivo",
                "02/Abr/2021"
            ),
            Movie(
                9,
                "Cosas Imposibles",
                "Drama",
                "La vida es tan impredecible que la felicidad puede estar donde menos se espera. Matilde es una mujer que, tras la muerte de su esposo abusivo..",
                "17/Jun/2021"
            ),
            Movie(
                10,
                "Sing 2",
                "Infantil/Comedia",
                "Buster Moon y su elenco de animales artistas se preparan para lanzar un deslumbrante espectáculo escénico en la capital mundial del entretenimiento. ",
                "22/Dic/2021"
            ),
        )
    }
}