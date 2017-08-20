package com.cg.shopping.service

import org.scalatest.FunSuite

/**
  * Created by Ali on 8/20/2017.
  */
class PriceCalculatorImplTest extends FunSuite {

  test("should return total cost for given list of fruits") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl

    val checkoutList = List("Apple","Apple","Orange","Apple")

    assert(priceCalculator.caclulatePrice(checkoutList) == 2.05)

  }

  test("should return 0 when list of fruits is empty") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl

    val checkoutList = List()

    assert(priceCalculator.caclulatePrice(checkoutList) == 0.00)

  }


}
