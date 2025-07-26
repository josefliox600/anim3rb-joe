package ar.anime3rb

import eu.kanade.tachiyomi.animeextension.model.AnimeSource
import eu.kanade.tachiyomi.animeextension.AnimeHttpSource

class Anime3rb : AnimeHttpSource() {
    override val name = "Anime3rb (AR)"
    override val baseUrl = "https://anime3rb.com"
    override val lang = "ar"
}