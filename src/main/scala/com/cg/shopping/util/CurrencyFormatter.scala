package com.cg.shopping.util

import java.util.{Currency, Locale}

/**
  * Created by Ali on 8/20/2017.
  */
object CurrencyFormatter {

  def formatGB(currency : Double) : String = {

    val formatter = java.text.NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("en").setRegion("GB").build())

    formatter.format(currency)
  }

}
