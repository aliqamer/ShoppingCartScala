package com.cg.shopping.offer

import org.scalatest.FunSuite

/**
  * Created by Ali on 8/21/2017.
  */
class OrangeOfferTest extends FunSuite {

  test("ApplyOffer for 1 Oranges should return discount cost of 1 Oranges") {  //cost of 1 orange = 25

    val offer = new OrangeOffer

    assert(offer.applyOffer(1) == 25.00)

  }

  test("ApplyOffer for 2 Oranges should return discount cost of 2 Oranges") {

    val offer = new OrangeOffer

    assert(offer.applyOffer(2) == 50.00)

  }

  // 4 orange => offer is -> 3 orange for price of 2 + remaining 1 orange = total cost should be price of 3 oranges
  test("ApplyOffer for 4 Oranges should return discount cost of 3 Oranges") {  //cost of 1 orange = 25

    val offer = new OrangeOffer

    assert(offer.applyOffer(4) == 75.00)

  }

  test("ApplyOffer for 13 Oranges should return discount cost of 9 Oranges") {  //cost of 1 orange = 25

    val offer = new OrangeOffer

    assert(offer.applyOffer(13) == 225.00)

  }


}
