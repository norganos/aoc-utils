package de.linkel.aoc.utils.grid

import de.linkel.aoc.utils.geometry.plain.discrete.Point

data class DataPoint<T>(
    val point: Point,
    val data: T
) {
    override fun toString(): String {
        return "$point -> $data"
    }
}
