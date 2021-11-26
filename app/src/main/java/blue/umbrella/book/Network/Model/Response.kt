package blue.umbrella.book.Network

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("data")
	val data: List<MainData>? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("links")
	val links: Links? = null
)

data class Staff(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Dimensions(

	@field:SerializedName("small")
	val small: Small? = null,

	@field:SerializedName("large")
	val large: Large? = null,

	@field:SerializedName("tiny")
	val tiny: Tiny? = null,

	@field:SerializedName("medium")
	val medium: Medium? = null,

	@field:SerializedName("small_webp")
	val smallWebp: SmallWebp? = null,

	@field:SerializedName("tiny_webp")
	val tinyWebp: TinyWebp? = null,

	@field:SerializedName("large_webp")
	val largeWebp: LargeWebp? = null
)

data class Small(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Categories(

	@field:SerializedName("links")
	val links: Links? = null
)

data class RatingFrequencies(

	@field:SerializedName("11")
	val jsonMember11: String? = null,

	@field:SerializedName("12")
	val jsonMember12: String? = null,

	@field:SerializedName("13")
	val jsonMember13: String? = null,

	@field:SerializedName("14")
	val jsonMember14: String? = null,

	@field:SerializedName("15")
	val jsonMember15: String? = null,

	@field:SerializedName("16")
	val jsonMember16: String? = null,

	@field:SerializedName("17")
	val jsonMember17: String? = null,

	@field:SerializedName("18")
	val jsonMember18: String? = null,

	@field:SerializedName("19")
	val jsonMember19: String? = null,

	@field:SerializedName("2")
	val jsonMember2: String? = null,

	@field:SerializedName("3")
	val jsonMember3: String? = null,

	@field:SerializedName("4")
	val jsonMember4: String? = null,

	@field:SerializedName("5")
	val jsonMember5: String? = null,

	@field:SerializedName("6")
	val jsonMember6: String? = null,

	@field:SerializedName("7")
	val jsonMember7: String? = null,

	@field:SerializedName("8")
	val jsonMember8: String? = null,

	@field:SerializedName("9")
	val jsonMember9: String? = null,

	@field:SerializedName("20")
	val jsonMember20: String? = null,

	@field:SerializedName("10")
	val jsonMember10: String? = null
)

data class MediaRelationships(

	@field:SerializedName("links")
	val links: Links? = null
)

data class MainData(

	@field:SerializedName("relationships")
	val relationships: Relationships? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("attributes")
	val attributes: Attributes? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Quotes(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Relationships(

	@field:SerializedName("chapters")
	val chapters: Chapters? = null,

	@field:SerializedName("mangaStaff")
	val mangaStaff: MangaStaff? = null,

	@field:SerializedName("staff")
	val staff: Staff? = null,

	@field:SerializedName("quotes")
	val quotes: Quotes? = null,

	@field:SerializedName("mangaCharacters")
	val mangaCharacters: MangaCharacters? = null,

	@field:SerializedName("characters")
	val characters: Characters? = null,

	@field:SerializedName("castings")
	val castings: Castings? = null,

	@field:SerializedName("mappings")
	val mappings: Mappings? = null,

	@field:SerializedName("reviews")
	val reviews: Reviews? = null,

	@field:SerializedName("installments")
	val installments: Installments? = null,

	@field:SerializedName("genres")
	val genres: Genres? = null,

	@field:SerializedName("mediaRelationships")
	val mediaRelationships: MediaRelationships? = null,

	@field:SerializedName("categories")
	val categories: Categories? = null,

	@field:SerializedName("productions")
	val productions: Productions? = null
)

data class Medium(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Reviews(

	@field:SerializedName("links")
	val links: Links? = null
)

data class MangaStaff(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Installments(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Genres(

	@field:SerializedName("links")
	val links: Links? = null
)

data class SmallWebp(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class PosterImage(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("tiny")
	val tiny: String? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("medium")
	val medium: String? = null
)

data class MangaCharacters(

	@field:SerializedName("links")
	val links: Links? = null
)

data class LargeWebp(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Tiny(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class TinyWebp(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Castings(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Links(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("last")
	val last: String? = null,

	@field:SerializedName("first")
	val first: String? = null,

	@field:SerializedName("self")
	val self: String? = null,

	@field:SerializedName("related")
	val related: String? = null
)

data class Mappings(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Chapters(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Attributes(

	@field:SerializedName("nextRelease")
	val nextRelease: Any? = null,

	@field:SerializedName("endDate")
	val endDate: Any? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("ratingRank")
	val ratingRank: Int? = null,

	@field:SerializedName("posterImage")
	val posterImage: PosterImage? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("subtype")
	val subtype: String? = null,

	@field:SerializedName("averageRating")
	val averageRating: String? = "-",

	@field:SerializedName("coverImage")
	val coverImage: Any? = null,

	@field:SerializedName("ratingFrequencies")
	val ratingFrequencies: RatingFrequencies? = null,

	@field:SerializedName("volumeCount")
	val volumeCount: Int? = null,

	@field:SerializedName("abbreviatedTitles")
	val abbreviatedTitles: List<String?>? = null,

	@field:SerializedName("slug")
	val slug: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null,

	@field:SerializedName("chapterCount")
	val chapterCount: Int? = null,

	@field:SerializedName("mangaType")
	val mangaType: String? = null,

	@field:SerializedName("synopsis")
	val synopsis: String? = null,

	@field:SerializedName("titles")
	val titles: Titles? = null,

	@field:SerializedName("ageRating")
	val ageRating: Any? = null,

	@field:SerializedName("favoritesCount")
	val favoritesCount: Int? = null,

	@field:SerializedName("serialization")
	val serialization: String? = null,

	@field:SerializedName("coverImageTopOffset")
	val coverImageTopOffset: Int? = null,

	@field:SerializedName("canonicalTitle")
	val canonicalTitle: String? = null,

	@field:SerializedName("tba")
	val tba: Any? = null,

	@field:SerializedName("userCount")
	val userCount: Int? = null,

	@field:SerializedName("popularityRank")
	val popularityRank: Int? = null,

	@field:SerializedName("ageRatingGuide")
	val ageRatingGuide: Any? = null,

	@field:SerializedName("startDate")
	val startDate: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Productions(

	@field:SerializedName("links")
	val links: Links? = null
)

data class CoverImage(

	@field:SerializedName("small")
	val small: String? = null,

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("large")
	val large: String? = null,

	@field:SerializedName("small_webp")
	val smallWebp: String? = null,

	@field:SerializedName("tiny")
	val tiny: String? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("tiny_webp")
	val tinyWebp: String? = null,

	@field:SerializedName("large_webp")
	val largeWebp: String? = null
)

data class Large(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Characters(

	@field:SerializedName("links")
	val links: Links? = null
)

data class Meta(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("dimensions")
	val dimensions: Dimensions? = null
)

data class Titles(

	@field:SerializedName("en")
	val en: Any? = null,

	@field:SerializedName("ja_jp")
	val jaJp: String? = null,

	@field:SerializedName("en_jp")
	val enJp: String? = null,

	@field:SerializedName("en_us")
	val enUs: String? = null
)
