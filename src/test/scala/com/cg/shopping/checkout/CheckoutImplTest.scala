package com.cg.shopping.checkout

import com.cg.shopping.service.PriceCalculatorImpl
import org.scalatest.FunSuite

/**
  * Created by Ali on 8/20/2017.
  */
class CheckoutImplTest extends FunSuite {

  test("should return total cost for given list of fruits") {

    val checkout = new CheckoutImpl(new PriceCalculatorImpl)

    val checkoutList = List("Apple","Apple","Orange","Apple")

    assert(checkout.doCheckout(checkoutList) == "£2.05")

  }

  test("should return 0 when list of fruits is empty") {

    val checkout = new CheckoutImpl(new PriceCalculatorImpl)

    val checkoutList = List()

    assert(checkout.doCheckout(checkoutList) == "£0.00")

  }

}
