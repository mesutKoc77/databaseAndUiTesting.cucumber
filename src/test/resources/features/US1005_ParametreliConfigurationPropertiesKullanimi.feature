Feature: US1005 Parametreli Configuration.properties Kullanimi

  #3 farklı senaryo oluşturup
  #amazon, mycoursedemy ve wisequarter anasayfalarına gidip
  #url in bu kelimleri içerdigini test edin

  Scenario: TC09 kullanici trendYol sayfasina gidebilmeli
    Given Kullanici "trendYol" anasayfaya gider
    Then url'in "trendyol" icerdigini test eder
    And Sayfayi kapatir

  Scenario: TC10 kullanici mycoursedemy sayfasina gidebilmeli
    Given Kullanici "myUrl" anasayfaya gider
    Then url'in "qualitydemy" icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC11 kullanici wisequarter sayfasina gidebilmeli
    Given Kullanici "wiseUrl" anasayfaya gider
    Then url'in "wisequarter" icerdigini test eder
    And Sayfayi kapatir




