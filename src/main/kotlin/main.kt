fun main() {
    val one = Wall.Post(1, "Hallo")
    val two = Wall.Post(2, "hi")

    Wall.add(Wall.Post(1, "Nice"))
    Wall.add(one)
    Wall.add(two)
    Wall.printWall()

    Wall.update(one)
}

object Wall {
    data class Post(
        val ownerId: Int,
        val cont: String
    )

    private var wall = emptyArray<Post>()

    fun add(post: Post) {
        wall += post
    }

    fun update(post: Post) {
        if (post in wall ){
post=wall.set(2,"wow")
        }

    }

    fun printWall() {
        for (post in wall) {
            println(post)
        }
    }
}

