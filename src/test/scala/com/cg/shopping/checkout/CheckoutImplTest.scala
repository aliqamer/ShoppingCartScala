package com.cg.shopping.checkout

import com.cg.shopping.offer.{AppleOffer, OrangeOffer}
import com.cg.shopping.service.PriceCalculatorImpl
import org.scalatest.FunSuite

/**
  * Created by Ali on 8/20/2017.
  */
class CheckoutImplTest extends FunSuite {

  test("should return total cost for given list of fruits") {

    val checkout = new CheckoutImpl(new PriceCalculatorImpl(new AppleOffer, new OrangeOffer ))

    val checkoutList = List("Apple","Apple","Orange","Apple")

    assert(checkout.doCheckout(checkoutList) == "£1.45")

  }

  test("should return discounted cost for different list of fruits") {

    val checkout = new CheckoutImpl(new PriceCalculatorImpl(new AppleOffer, new OrangeOffer ))

    val checkoutList = List("Apple","Apple","Apple","Orange","Orange", "Orange", "Orange", "Orange")

    /*
      discount offer price should be
      2 apple for price of 1
      remaining 1 apple for price of 1  --> total 2 apple
      3 Orange for price of 2
      remaining 2 orange 1 price each  --> total 4 oranges

    total = 2 apple + 4 orange = 2 * 60 +  4 * 25 = 220p = 2.20 pound
     */

    assert(checkout.doCheckout(checkoutList) == "£2.20")

  }

  test("should return 0 when list of fruits is empty") {

    val checkout = new CheckoutImpl(new PriceCalculatorImpl(new AppleOffer, new OrangeOffer ))

    val checkoutList = List()

    assert(checkout.doCheckout(checkoutList) == "£0.00")

  }

}
