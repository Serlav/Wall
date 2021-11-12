fun main() {
    Wall.add(Wall.Post(1, "Nice"))
    Wall.add(Wall.Post(2, "hi"))
    Wall.add(Wall.Post(3, "Hallo"))
    Wall.printWall()
    Wall.update(Wall.Post(1, "Change"))
    Wall.printWall()
}

object Wall {
    data class Post(
        var ownerId: Int,
        var cont: String
    )

    private var wall = emptyArray<Post>()

    fun add(post: Post) {
        wall += post
    }

    fun update(newPost: Post) {
        for (post in wall) {
            if (newPost.ownerId == post.ownerId) {
                post.cont = newPost.cont
            }
        }
    }

    fun printWall() {
        for (post in wall) {
            println(post)
        }
    }
}


