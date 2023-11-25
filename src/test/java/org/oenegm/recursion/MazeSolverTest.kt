package org.oenegm.recursion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MazeSolverTest {

    @Test
    fun testBasicMaze() {
        val maze = arrayOf(
            "S....",
            ".###.",
            "...#.",
            "###..",
            "...E."
        )
        val start = MazeSolver.Point(0, 0)
        val end = MazeSolver.Point(4, 4)
        val solution = MazeSolver.solve(maze, '#', start, end)
        assertTrue(solution.isNotEmpty())
        assertEquals(end, solution.last())
    }

    @Test
    fun testNoSolution() {
        val maze = arrayOf(
            "S####",
            "#####",
            "#####",
            "#####",
            "E####"
        )
        val start = MazeSolver.Point(0, 0)
        val end = MazeSolver.Point(0, 4)
        val solution = MazeSolver.solve(maze, '#', start, end)
        assertTrue(solution.isEmpty())
    }

    @Test
    fun testSingleValidPath() {
        val maze = arrayOf(
            "S...E"
        )
        val start = MazeSolver.Point(0, 0)
        val end = MazeSolver.Point(4, 0)
        val solution = MazeSolver.solve(maze, '#', start, end)
        assertTrue(solution.isNotEmpty())
        assertEquals(end, solution.last())
    }

    @Test
    fun testMazeWithNoWalls() {
        val maze = arrayOf(
            "S...",
            "....",
            "....",
            "...E"
        )
        val start = MazeSolver.Point(0, 0)
        val end = MazeSolver.Point(3, 3)
        val solution = MazeSolver.solve(maze, '#', start, end)
        assertTrue(solution.isNotEmpty())
        assertEquals(end, solution.last())
    }
}