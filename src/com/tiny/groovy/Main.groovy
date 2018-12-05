package com.tiny.groovy

class Main {
    String name
    String title

    Main(name, title) {
        this.name = name
        this.title = title
    }

    def print() {
        println name + " " + title
    }
}
