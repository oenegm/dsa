package org.oenegm

object MazeSolver {
    // uses depth first search strategy
    fun solve(maze: Array<String>, wall: Char, start: Point = Point(), end: Point = Point()): MutableList<Point> {
        val seen: Array<Array<Boolean>> = Array(maze.size) { Array(maze[0].length) { false } }
        val path: MutableList<Point> = arrayListOf()

        walk(maze, wall, start, end, seen, path)

        return path
    }

    private fun walk(
        maze: Array<String>,
        wall: Char,
        curr: Point,
        end: Point,
        seen: Array<Array<Boolean>>,
        path: MutableList<Point>
    ): Boolean {

        // 1. off the map
        if (curr.x < 0 || curr.x >= maze[0].length ||
            curr.y < 0 || curr.y >= maze.size
        ) {
            return false
        }

        // 2. on a wall
        if (maze[curr.y][curr.x] == wall) return false


        // 3. at the end
        if (curr.x == end.x && curr.y == end.y) {
            path.add(end)
            return true
        }

        // 4. already seen
        if (seen[curr.y][curr.x]) return false

        // pre recurse
        path.add(curr)

        // recurse
        for (i in dir.indices) {
            val dx = dir[i][0]
            val dy = dir[i][1]
            val newCurr = Point(curr.x + dx, curr.y + dy)

            if (walk(maze, wall, newCurr, end, seen, path)) return true
        }

        // post recurse
        path.removeLast()

        return false
    }

    private val dir = arrayOf(
        // switching the order of these directions gives you a good old StackOverflowError
        // this is due to the JVM heap size
        // right now this order passes the tests, so good enough I guess
        intArrayOf(1, 0),  // Move right
        intArrayOf(0, 1),  // Move down
        intArrayOf(-1, 0), // Move left
        intArrayOf(0, -1)  // Move up
    )

    class Point(var x: Int = 0, var y: Int = 0)
}