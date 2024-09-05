package com.Emirkanmaz.superherodictionary

import java.io.Serializable

class Superhero(val name: String, val job: String, val image: Int) : Serializable {

}

//import android.os.Parcel
//import android.os.Parcelable
//
//class Superhero(val name: String, val job: String, val image: Int) : Parcelable {
//
//    // Parcel'den veriyi okuyan constructor
//    private constructor(parcel: Parcel) : this(
//        parcel.readString() ?: "",
//        parcel.readString() ?: "",
//        parcel.readInt()
//    )
//
//    // Parcel'a veriyi yazan fonksiyon
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(name)
//        parcel.writeString(job)
//        parcel.writeInt(image)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Superhero> {
//        // Parcel'den veriyi okuyarak Superhero nesnesi oluşturan fonksiyon
//        override fun createFromParcel(parcel: Parcel): Superhero {
//            return Superhero(parcel)
//        }
//
//        // Superhero dizisi oluşturan fonksiyon
//        override fun newArray(size: Int): Array<Superhero?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
