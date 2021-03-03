package com.example.coffeeloka.data

import com.example.coffeeloka.R
import com.example.coffeeloka.model.Coffee

object CoffeeData {

    private var dataTitle = arrayOf(
        "BlackBarn Coffee",
        "Ada Apa Dengan Kopi",
        "TBRK Rumah Kopi",
        "Thirty Three Brew Tunjungan",
        "Caturra Espresso",
        "Volks Coffee",
        "Kudos Cafe",
        "Titik Koma Coffee",
        "Calibre Coffee Roaster",
        "Jokopi"
    )

    private var dataAddress = arrayOf(
        "Jalan Untung Suropati No.79, Surabaya",
        "Jl. Tegalsari No.24, Kedungdoro, Kec. Tegalsari, Kota SBY",
        "Jl. Manukan Dalam No.12, Manukan Kulon, Kec. Tandes, Kota Surabaya",
        "Tunjungan St No.88, Genteng, Surabaya City",
        "Jalan Anjasmoro No.32",
        "Jl. MH. Thamrin No. 34, Surabaya",
        "Pakuwon Square AK 2 No.3 Surabaya",
        "Jl. Juwono No.25, Surabaya",
        "Jl. Walikota Mustajab No. 67-69",
        "Jl. Ketabang Kali No.51 A, Kel. Ketebang, Kec. Genteng, Kota SBY"
    )

    private var dataDetail = arrayOf(
        //1
        "Lokasinya di Jalan Untung Suropati No.79, Surabaya. BlackBarn Coffee buka setiap hari, pukul 11.00-22.30 setiap -Kamis dan pukul 11.00-23.30 pada Jumat-Minggu. Harga minuman mulai Rp 14 ribu hingga Rp 35 ribu. Makanannya dipatok sekitar Rp 29-50 ribu.\n" +
                "\n" +
                "Bangunan coffee shop ini sekilas seperti rumah gaya kolonial Belanda yang disulap jadi lebih modern. Dekorasi ruang indoor begitu estetik, sedangkan outdoor-nya bisa dimanfaatkan untuk smooking area.\n" +
                "\n" +
                "Waktu terbaik untuk mampir di BlackBarn adalah saat sore hari menjelang petang. Golden hour-nya dijamin bikin mulut menganga!",

        //2
        "Salah satu kafé yang layak dikunjungi ketika sedang berada di Surabaya adalah AADK (Ada Apa Dengan Kopi). AADK cocok untuk para remaja yang ingin mencari spot foto bagus namun dengan menu hidangan yang tidak terlalu mahal.\n" +
                "\n" +
                "AADK Café terletak di Jl. Tegalsari No.24, Kedungdoro, Kec. Tegalsari, kota Surabaya, Jawa Timur. Lokasinya tak jauh dengan Taman Bungkul yang dikenal sebagai pusat Kota Surabaya, hanya berjarak sejauh 3,7 km. Dapat ditempuh dengan menggunakan rute Jl. Raya Darmo/Jl. Raya Surabaya-Malang selama 8 menit perjalanan. Rute lain yang bisa dipilih adalah melalui Jl. Diponegoro dengan waktu tempuh 13 menit.\n" +
                "\n" +
                "AADK buka setiap hari dari pukul 07.00-22.00 . Jam-jam padat di kafé ini adalah saat sore hari dan malam hari, ketika cuaca Kota Surabaya tidak terlalu panas\n. " +
                "\n" +
                "Menu minuman lebih lengkapnya antara lain kopi aren, kopi pisang, kopi matcha, kopi Americano, lemonade, honey lime, cokelat klasik, latte, dan masih banyak lagi. Rasa dari kopinya tidak terlalu menyengat sehingga bisa dinikmati oleh semua orang. Aneka minuman di sini kisaran harganya Rp13.000 – 24.000.",

        //3
        "Untuk mendapatkan suasana cafe layaknya di pulau dewata sebenarnya tak perlu jauh jauh karena kamu juga bisa menemukannya di Surabaya. TBRK Rumah Kopi menyajikan sudut ruangan yang didominasi dengan warna putih dengan hiasan aksesoris dari kerang dan anyaman sehingga tampak lebih menarik. Hampir setiap sudut cafe ini bisa dijadikan spot foto  yang keren. Setiap tempat duduknya ditata cantik sehingga membuat pengunjung betah berlama lama.\n" +
                "\n" +
                "Tak hanya kopi, cafe ini juga menyajikan aneka minuman yang lain. Sajian kopinya pun sangat cantik sehingga kamu pun bisa mengabadikan tampilan menu di cafe ini. Salah satu minuman cafe ini yang banyak diminati yaitu Es Kopi susu Aren dan Green tea Latte. Untuk harganya sendiri cukup ramah di kantong sehingga cocok untuk kamu yang minim budget. Nongki di cafe ini akan membuat pikiran semakin fresh dan bersemangat.",

        //4
        "Millennials Surabaya pasti gak asing sama spot foto di Thirty Three Brew ini. Lampu neonnya begitu ikonik dan kece banget. Coffee shop ini berada di Jalan Opak No.45 Surabaya. Buka setiap hari mulai pukul 10 pagi hingga 11 malam.\n" +
                "\n" +
                "Meski tempatnya tidak begitu luas, tetapi spot fotonya benar-benar menarik minat pengunjung. Pasti kamu sering menjumpainya di timeline Instagram kan? Thirty Three Brew bekerja sama dengan Matchbox Too, sehingga menu makanan tersedia dalam banyak varian. Bisa pilih sesuka hati dan sesuai seleramu.",

        //5
        "Spot foto di coffee shop ini bakal bikin foto kamu keren banget. Ada spot foto di ruang indoor  dan outdoor. Lokasinya di Jalan Anjasmoro No.32. Tenang saja, kamu bisa mampir ke coffee shop ini antara pukul 10 pagi hingga 10 malam setiap hari.\n" +
                "\n" +
                "Kafe dengan interior minimalis dan meja kayunya ini cocok banget buat bersantai. Bisa juga kamu ajak rekan bisnis untuk meeting di Caturra Espresso. Harga makanan dan minumannya dipatok antara Rp 24-75 ribu. Ada juga beberapa minuman manis non-coffee yang disediakan, seperti teh dan jus.",

        //6
        "Coffee shop satu ini bisa kamu temukan di Jalan MH. Thamrin No. 34, Surabaya. Lokasinya sangat strategis karena berada di pusat kota Surabaya. Volks Coffee buka setiap hari mulai pukul 8.30 hingga 20.00. Harga minuman berkisar antara Rp 24-40 ribu.\n" +
                "\n" +
                "Ada pula berbagai makanan yang bisa disandingkan bersama kopimu. Harganya berkisar antara Rp 25 ribu hingga Rp 55 ribu.\n" +
                "\n" +
                "Desain interiornya didominasi warna monochrome hitam putih. Penggunaan warnanya membuat suasana coffee shop ini begitu menenangkan. Ada area indoor  dan outdoor yang bisa dimanfaatkan.\n" +
                "\n" +
                "Berbagai spot foto Instagramable  bisa kamu temukan. Latar belakang fotomu pasti kece abis kalau diambil di sini!",

        //7
        "Dekat dengan Redback, Kudos Cafe berada di Surabaya Barat. Tepatnya di Pakuwon Square AK 2 No.3 Surabaya. Coffee shop ini buka mulai pukul 08.00 hingga 22.00 pada  hingga Kamis. Kalau akhir pekan, tutupnya lebih malam, yakni pukul 23.00.\n" +
                "\n" +
                "Harga makanan di sini mulai Rp 28-58 ribu. Sedangkan, minumannya berkisar Rp 10-50 ribu. Berbagai spot foto menarik membuat Kudos Cafe dikenal banyak orang.\n" +
                "\n" +
                "Memang desain interiornya begitu Instagramable. Penggunaan warna hitam putih membuatnya terlihat bersih dan kekinian. Tak hanya itu, dekorasi warna hijau dari macam-macam tanaman juga bikin mata segar. Enak banget dibuat nongkrong dan ngobrol lama bareng sahabat.",

        //8
        "Menawarkan suasana kafe yang nyaman untuk nongkrong, Titik Koma Coffee berada di jalan Juwono No.25, Surabaya. Coffee shop ini buka setiap hari, yakni pukul 08.00-21.00 setiap  sampai Sabtu. Sedangkan, pada hari Minggu, mereka mulai buka pukul 11.0 hingga 21.00.\n" +
                "\n" +
                "Harga minumannya berkisar Rp 20 ribu hingga Rp 40 ribu. Sedangkan, makanannya dibanderol dengan harga Rp 21 ribu sampai Rp 70 ribu.\n" +
                "\n" +
                "Ruangannya memang tak terlalu besar, tetapi tata letak dan pemilihan warnanya yang minimalis menjadikannya pas banget. Suasana dalam kafe jadi santai, tenang, dan bikin betah buat ngobrol berlama-lama. Spot foto terbaik bisa kamu ambil dari samping atau luar kaca jendela!",

        //9
        "Berada di Jalan Walikota Mustajab No. 67-69, berdiri kokoh bangunan Calibre Coffee Roaster. Lokasinya strategis karena di pinggir jalan dan dekat dengan salah satu mall  besar Surabaya.\n" +
                "\n" +
                "Coffee shop ini buka setiap hari mulai pukul 10 pagi. Berbagai menu enak dan menarik bisa kamu pesan. Nah, yang paling wajib, kamu harus cobain kopi racikan para barista Calibre Coffee Roaster.\n" +
                "\n" +
                "Suasana di dalamnya begitu teduh dengan interior yang sungguh menawan. Meski tak terlalu lebar, tetapi Calibre tetap nyaman untuk kerja mau pun nongkrong. Apalagi spot fotonya yang keren abis dan berbeda dari coffee shop lainnya. Macam-macam menunya dibanderol mulai harga Rp 22-45 ribu.",

        //10
        "Lokasinya di Jalan Ketabang Kali Nomor 51A dan Jalan Untung Suropati Nomor 85. " +
                "Menggunakan biji kopi asli Indonesia dengan kemasan yang unik berlambang kepala seseorang berpeci."
    )

    private val dataHours = arrayOf(
        //1
        """
                11.00-22.30
                 
                11.00-22.30
                 
                11.00-22.30 
                
                11.00-22.30 
                
                11.00-23.30 
                
                11.00-23.30 
                
                11.00-23.30 
            """.trimIndent(),

        //2
        """
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
            """.trimIndent(),

        //3
        """
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
            """.trimIndent(),

        //4
        """
                07.00–22.00
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
                
                07.00–22.00 
            """.trimIndent(),

        //5
        """
                10.00–22.00 
                  
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
                
                10.00–22.00 
            """.trimIndent(),

        //6
        """
                08.30–20.00 
                  
                08.30–20.00 
                
                08.30–20.00 
                
                08.30–20.00 

                08.30–20.00 
                
                08.30–20.00 
                
                08.30–20.00 
            """.trimIndent(),
        //7
        """
                08.00–22.00 
                  
                08.00–22.00 
                
                08.00–22.00 
                
                08.00–22.00 
                
                08.00–23.00 
                
                08.00–23.00 
                
                08.00–23.00 
            """.trimIndent(),

        //8
        """
                08.00-21.00 
                
                08.00-21.00 
                
                08.00-21.00 
                
                08.00-21.00 
                
                11.00–21.00 
                
                11.00–21.00 
                
                11.00–21.00 
            """.trimIndent(),

        //9
        """ 
                10.00-21.00 
                  
                10.00-21.00 
                
                10.00-21.00 
                
                10.00-21.00 
                
                10.00–22.00 
                
                07.00–22.00 

                07.00–21.00 
            """.trimIndent(),

        //10
        """
                07.00-20.30 
                  
                07.00-20.30 
                
                07.00-20.30 
                
                07.00-20.30  
                
                07.00-20.30  
                
                07.00-23.00  
                
                09.00–23.00 
            """.trimIndent()

    )

    private val dataPrice = arrayOf(
        "Rp. 29.000 - Rp. 50.000",
        "Rp. 13.000 – Rp. 24.000",
        "Rp. 25.000 - Rp. 50.000",
        "Rp. 20.000 - Rp. 40.000",
        "Rp. 24.000 - Rp. 75.000",
        "Rp. 25.000 - Rp. 55.000",
        "Rp. 10.000 - Rp. 50.000",
        "Rp. 20.000 - Rp. 40.000",
        "Rp. 22.000 - Rp. 45.000",
        "Rp. 25.000 - Rp. 50.000"
    )

    private val dataRate = doubleArrayOf(
            4.3,
            4.2,
            5.0,
            3.5,
            4.7,
            3.9,
            4.3,
            5.0,
            4.4,
            4.0
    )

    private val dataCall = arrayOf(
        "0315671066",
        "08998000099",
        "08113073334",
        "03199532288",
        "081234127332",
        "081357658829",
        "03199016791",
        "081357405500",
        "0315454801",
        "081217107975"
    )

    private val dataImage = intArrayOf(
        R.drawable.blackbarn,
        R.drawable.aadk,
        R.drawable.tbrk,
        R.drawable.thirtybrew,
        R.drawable.catura,
        R.drawable.volks,
        R.drawable.kudos,
        R.drawable.titikkoma,
        R.drawable.calibre,
        R.drawable.jokopi
    )

    val listData: ArrayList<Coffee>
        get() {
            val list = ArrayList<Coffee>()
            for (position in dataTitle.indices) {
                val coffee = Coffee()

                coffee.apply {
                    titleCoffee = dataTitle[position]
                    addressCoffee = dataAddress[position]
                    detailCoffee = dataDetail[position]
                    hoursCoffee = dataHours[position]
                    priceCoffee = dataPrice[position]
                    rateCoffee = dataRate[position]
                    callCoffe = dataCall[position]
                    imageCoffe = dataImage[position]
                }
                list.add(coffee)

            }
            return list
        }

}