package com.cg.shopping.util

import org.scalatest.FunSuite

/**
  * Created by Ali on 8/20/2017.
  */
class CurrencyFormatter$Test extends FunSuite {

  test("should convert given Decimal number to Pound Currency Format") {

    assert(CurrencyFormatter.formatGB(2.05) == "£2.05")

  }

}
