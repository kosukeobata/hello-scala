package com.example.scala.sample

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

    describe("concat list List(1,2,3) List(4,5,6)") {
      it("should returns List(1,2,3,4,5,6)") {
        assert(target.concatList(List(1,2,3), List(4,5,6)) == List(1, 2, 3, 4, 5, 6))
      }
    }

  }

}
