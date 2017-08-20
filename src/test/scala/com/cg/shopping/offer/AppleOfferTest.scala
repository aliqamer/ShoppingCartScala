package com.cg.shopping.offer

import org.scalatest.FunSuite

/**
  * Created by Ali on 8/21/2017.
  */
class AppleOfferTest extends FunSuite {

  test("ApplyOffer for 1 Apple should return discount cost of 1 apple") { //cost of 1 Apple = 60

    val offer = new AppleOffer

    assert(offer.applyOffer(1) == 60.00)

  }

  test("ApplyOffer for 2 Apple should return discount cost of 1 apple") {

    val offer = new AppleOffer

    assert(offer.applyOffer(2) == 60.00)

  }

  test("ApplyOffer for 3 Apple should return discount cost of 2 apple (1 for BOGO + 1 )") {

    val offer = new AppleOffer

    assert(offer.applyOffer(3) == 120.00)

  }



}
