package com.example.onlinemoviestore

abstract class ProductInfo(){
    abstract val type:String
    abstract val price:Int
    abstract val name:String
    abstract val amount:Double
}
class Horror_1 : ProductInfo(){
    override val type = "Horror"
    override val name = "The Conjuring"
    override val price = 225
    override var amount = 1.0

}
class Horror_2 : ProductInfo(){
    override val type = "Horror"
    override val name = "Insidious"
    override val price = 220
    override var amount = 1.0

}
class Horror_3 : ProductInfo(){
    override val type = "Horror"
    override val name = "The Shining"
    override val price = 220
    override var amount = 1.0

}
class Horror_4 : ProductInfo(){
    override val type = "Horror"
    override val name = "Halloween"
    override val price = 225
    override var amount = 1.0

}
class Horror_5 : ProductInfo(){
    override val type = "Horror"
    override val name = "The Thing"
    override val price = 225
    override var amount = 1.0

}
class Horror_6 : ProductInfo(){
    override val type = "Horror"
    override val name = "Frankenstein"
    override val price = 250
    override var amount = 1.0

}
class Horror_7 : ProductInfo(){
    override val type = "Horror"
    override val name = "A Nightmare on Elm Street"
    override val price = 250
    override var amount = 1.0

}
class Horror_8 : ProductInfo(){
    override val type = "Horror"
    override val name = "Psycho"
    override val price = 250
    override var amount = 1.0

}
class Comedy_1 : ProductInfo(){
    override val type = "Comedy"
    override val name = "Paddington"
    override val price = 220
    override var amount = 1.0

}
class Comedy_2 : ProductInfo(){
    override val type = "Comedy"
    override val name = "Guardians of the Galaxy"
    override val price = 250
    override var amount = 1.0

}
class Comedy_3 : ProductInfo(){
    override val type = "Comedy"
    override val name = "A Serious Man"
    override val price = 220
    override var amount = 1.0

}
class Comedy_4 : ProductInfo(){
    override val type = "Comedy"
    override val name = "Night at the Museum"
    override val price = 225
    override var amount = 1.0

}
class Comedy_5 : ProductInfo(){
    override val type = "Comedy"
    override val name = "Back to the Future"
    override val price = 235
    override var amount = 1.0

}
class Comedy_6 : ProductInfo(){
    override val type = "Comedy"
    override val name = "The Big Short"
    override val price = 235
    override var amount = 1.0

}
class Comedy_7 : ProductInfo(){
    override val type = "Comedy"
    override val name = "Megamind"
    override val price = 220
    override var amount = 1.0

}
class Comedy_8 : ProductInfo(){
    override val type = "Comedy"
    override val name = "His Girl Friday"
    override val price = 225
    override var amount = 1.0

}
class Romance_1 : ProductInfo(){
    override val type = "Romance"
    override val name = "Roman Holiday"
    override val price = 200
    override var amount = 1.0

}
class Romance_2 : ProductInfo(){
    override val type = "Romance"
    override val name = "La La Land"
    override val price = 200
    override var amount = 1.0

}
class Romance_3 : ProductInfo(){
    override val type = "Romance"
    override val name = "The Notebook"
    override val price = 180
    override var amount = 1.0

}
class Romance_4 : ProductInfo(){
    override val type = "Romance"
    override val name = "Pride and Prejudice"
    override val price = 150
    override var amount = 1.0

}
class Romance_5 : ProductInfo(){
    override val type = "Romance"
    override val name = "An Affair to Remember"
    override val price = 250
    override var amount = 1.0

}
class Romance_6 : ProductInfo(){
    override val type = "Romance"
    override val name = "The Curious Case Of Benjamin Button"
    override val price = 275
    override var amount = 1.0

}
class Romance_7 : ProductInfo(){
    override val type = "Romance"
    override val name = "Say Anything"
    override val price = 200
    override var amount = 1.0

}
class Romance_8 : ProductInfo(){
    override val type = "Romance"
    override val name = "The African Queen"
    override val price = 250
    override var amount = 1.0

}