package com.cg.shopping.service

import com.cg.shopping.checkout.CheckoutImpl
import com.cg.shopping.offer.{AppleOffer, OrangeOffer}
import org.scalatest.FunSuite

/**
  * Created by Ali on 8/20/2017.
  */
class PriceCalculatorImplTest extends FunSuite {

  test("should return total cost for given list of fruits") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl(new AppleOffer, new OrangeOffer )

    val checkoutList = List("Apple","Apple","Orange","Apple")

    /*
      discount offer price should be
      2 apple for price of 1
      1 Orange for price of 1
      remaining 1 Apple for price of 1
    total = 2 apple + 1 orange = 2 * 60 + 25 = 145p = 1.45 pound
     */

    assert(priceCalculator.caclulatePrice(checkoutList) == 1.45)

  }

  test("should return discounted cost for given list of fruits") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl(new AppleOffer, new OrangeOffer )

    val checkoutList = List("Apple","Apple","Orange","Orange", "Orange")

    /*
      discount offer price should be
      2 apple for price of 1
      3 Orange for price of 2

    total = 1 apple + 2 orange = 60 + 2 * 25 = 110p = 1.10 pound
     */

    assert(priceCalculator.caclulatePrice(checkoutList) == 1.10)

  }

  test("should return discounted cost for different list of fruits") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl(new AppleOffer, new OrangeOffer )

    val checkoutList = List("Apple","Apple","Apple","Orange","Orange", "Orange", "Orange", "Orange")

    /*
      discount offer price should be
      2 apple for price of 1
      remaining 1 apple for price of 1  --> total 2 apple
      3 Orange for price of 2
      remaining 2 orange 1 price each  --> total 4 oranges

    total = 2 apple + 4 orange = 2 * 60 +  4 * 25 = 220p = 2.20 pound
     */

    assert(priceCalculator.caclulatePrice(checkoutList) == 2.20)

  }

  test("should return 0 when list of fruits is empty") {

    val priceCalculator : PriceCalculator = new PriceCalculatorImpl(new AppleOffer, new OrangeOffer )

    val checkoutList = List()

    assert(priceCalculator.caclulatePrice(checkoutList) == 0.00)

  }


}
