package codes.draeger.fullstackdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform