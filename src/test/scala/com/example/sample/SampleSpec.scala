package com.example.sample


import org.scalatest.FunSpec


class SampleSpec extends FunSpec {

  describe("Sample") {

    val target = new Sample

    describe("plus 1 + 2") {
      it("should 3") {
        assert(target.plus(1, 2) == 3)
      }
    }

    describe("minus 1 - 2") {
      it("should -1") {
        assert(target.minus(1, 2) == -1)
      }
    }

  }

}
