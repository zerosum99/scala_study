package com {
  package scala {
    class Packages {
      var name = "test package"

    }
    package www {

      class Emp extends Packages {
        def getName = name
      }
    }
  }

}
