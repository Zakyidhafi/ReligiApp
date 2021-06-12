package com.zakyidhafi.religiapp;

import java.util.ArrayList;

public class RukunData {
    private static String[] rukunName = {
            "Dua Kalimat Syahadat",
            "Shalat",
            "Zakat",
            "Puasa",
            "Haji"
    };

    private static String[] rukunDetail = {
            "Syahadatain (dua kalimat syahadat) adalah kesaksian bahwa tidak ada ilah (sesembahan) yang berhak diibadahi dengan benar kecuali Allâh Azza wa Jalla , dan bahwasanya Muhammad Shallallahu ‘alaihi wa sallam adalah hamba serta Rasul-Nya. Kedua kesaksian ini merupakan keyakinan mantap yang diekspresikan dengan lisan.\n" +
                    "\n" +
                    "Dengan kemantapannya itu, seakan-akan orang yang mengikrarkannya dapat menyaksikan keberadaan Allâh Azza wa Jalla.",

            "Sholat berasal dari bahasa arab yang artinnya ‘’do’a’’.\n" +
                    "\n" +
                    "Sedangkan menurut isltilah sholat adalah ibadah yang dimulai dengan bacaan takbiratul ikhrom dan diakhiri dengan mengucap salam dengan syarat dan ketentuan tertentu. Segala perkataan dan perbuatan yang termasuk rukun sholat mempunyai arti dan makna tertentu yang bertujuan untuk mendekatkan hamba dengan Penciptannya.",

            "Dalam terminologi bahasa, zakat berarti ath-thaharah (suci) dan an-nama (berkembang). [an-Nihayah fi Gharib al-Hadits wa al-Atsar 2/307 dan Lisan al-Arab 14/358]\n" +
                    "\n" +
                    "Sedangkan dalam terminologi syari’at, zakat berarti beribadah kepada Allah dengan mengeluarkan bagian harta tertentu yang wajib dikeluarkan untuk diserahkan pada kelompok atau peruntukan tertentu. [asy-Syarh al-Mumti’ 6/13]",

            "Definisi dari Puasa (saum) menurut bahasa adalah menahan atau meninggalkan diri dari sesuatu.\n" +
                    "\n" +
                    "Sedangankan pengertian dari puasa menurut istilah ialah menahan diri dari kegiatan seperti makan, minum dan juga bersetubuh yang dimulai dari fajar hingga dengan waktu maghrib dengan syarat tertentu karena mengharap ridho Allah SWT dan menyiapkan diri untuk bertakwa kepadanya.",

            "Menurut bahasa, Haji (Arab), berarti mengunjungi, ziarah, atau menuju ke suatu lokasi yang tertentu.\n" +
                    "\n" +
                    "Menurut isti’lah pada syara’, Haji berarti mengunjungi ka’bah (Baitullah) di Mekkah dalam waktu tertentu, kemudian disertai dengan perbuatan-perbuatan yang tertentu  pula. (Matdawam, 1986: 20)"
    };

    private static int[] rukunImage = {
            R.drawable.syahadat,
            R.drawable.salat,
            R.drawable.zakat,
            R.drawable.puasa,
            R.drawable.haji
    };

    private static String[] rukunDalil = {
            "Dari ‘Ubâdah bin ash-Shâmit[1] Radhiyallahu anhu ia berkata, “Rasûlullâh Shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "\n" +
                    "مَنْ شَهِدَ أَنْ لَاإِلٰـهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ ، وَأَنَّ مُـحَمَّدًا عَبْدُهُ وَرَسُوْلُهُ ، وَأَنَّ عِيْسَى عَبْدُ اللهِ وَرَسُوْلُهُ وَكَلِمَتُهُ أَلْقَاهَا إِلَى مَرْيَمَ وَرُوْحٌ مِنْهُ ، وَالْـجَـنَّـةَ حَـقٌّ ، وَالنَّارَ حَـقٌّ ، أَدْخَلَهُ اللهُ الْـجَنَّـةَ عَلَى مَا كَانَ مِنَ الْعَمَلِ.\n" +
                    "\n" +
                    "Barangsiapa bersaksi bahwa tidak ada ilah yang berhak diibadahi dengan benar selain Allâh saja, tidak ada sekutu bagi-Nya, dan bersaksi bahwa Muhammad adalah hamba dan Rasul-Nya; dan bahwa ‘Isa adalah hamba Allâh dan Rasul-Nya dan kalimat-Nya yang disampaikan-Nya kepada Maryam serta ruh dari-Nya; dan bahwa surga adalah benar adanya dan neraka adalah benar adanya, maka Allâh pasti memasukkannya ke dalam surga bagaimanapun amal yang telah diperbuatnya.",

            "Dalil tujuan pelaksanaan sholat terdapat dalam Al-quran surat (20:14) yang tertera sebagai berikut :\n" +
                    "\n" +
                    "إِنَّنِي أَنَا اللَّهُ لَا إِلَٰهَ إِلَّا أَنَا فَاعْبُدْنِي وَأَقِمِ الصَّلَاةَ لِذِكْرِي – 20:14\n" +
                    "\n" +
                    "Artinya :\n" +
                    "\n" +
                    "Sungguh, Aku ini Allah, tidak ada tuhan selain Aku, maka sembahlah Aku dan laksanakanlah shalat untuk mengingat Aku. ( Surah Taha [20:14] )",

            "Rasulullah shallallahu ‘alaihi wa sallam juga berpesan pada Mu’adz radhiallahu ‘anhu ketika mengutusnya ke Yaman,\n" +
                    "\n" +
                    "أعْلِمْهم أنَّ اللهَ افتَرَض عليهم صدقةً في أموالِهم، تُؤخَذُ مِن أغنيائِهم فتردُّ على فُقرائِهم\n" +
                    "\n" +
                    "“Ajarkan mereka bahwa Allah mewajibkan mereka untuk menunaikan zakat pada harta mereka yang diambil dari kalangan yang kaya untuk dikembalikan kepada kalangan yang miskin” [HR. al-Bukhari: 1395 dan Muslim: 19].",

            "Perintah puasa Ramadan terkandung dalam Surat Al Baqarah ayat 183.\n" +
                    "\n" +
                    "يَا أَيُّهَا الَّذِينَ آمَنُوا كُتِبَ عَلَيْكُمُ الصِّيَامُ كَمَا كُتِبَ عَلَى الَّذِينَ مِنْ قَبْلِكُمْ لَعَلَّكُمْ تَتَّقُونَ\n" +
                    "\n" +
                    "\"Hai orang-orang yang beriman, diwajibkan atas kamu berpuasa sebagaimana diwajibkan atas orang-orang sebelum kamu agar kamu bertakwa.\"",

            "Allah berfirman dalam surah Ali Imran ayat 97,\n" +
                    "\n" +
                    "ولله على الناس حج البيت من استطاع إليه سبيلاً ومن كفر فإن الله غني عن العـالمين\n" +
                    "\n" +
                    "Artinya: Mengerjakan haji adalah kewajiban manusia terhadap Allah, yaitu (bagi) orang yang sanggup mengadakan perjalanan ke Baitullah; Barangsiapa mengingkari (kewajiban haji), maka sesungguhnya Allah Maha Kaya (tidak memerlukan sesuatu) dari semesta alam. (QS. Ali Imran, 97)"
    };

    static ArrayList<Rukun> getListData() {
        ArrayList<Rukun> list = new ArrayList<>();
        for (int position = 0; position < rukunName.length; position++ ) {
            Rukun rukun = new Rukun();
            rukun.setName(rukunName[position]);
            rukun.setDetail(rukunDetail[position]);
            rukun.setPhoto(rukunImage[position]);
            rukun.setDalil(rukunDalil[position]);
            list.add(rukun);
        }
        return list;
    }
}
