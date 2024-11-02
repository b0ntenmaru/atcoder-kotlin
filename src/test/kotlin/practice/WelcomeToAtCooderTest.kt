package practice

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


class WelcomeToAtCooderTest : FreeSpec( {
    "array.size should return size of array" {

        val result = arrayOf("a", "b", "c")
        val expected = 3
        result.size shouldBe expected
    }
})