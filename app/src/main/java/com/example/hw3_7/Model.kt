package com.example.hw3_7

class Model {
    companion object{
        private var list = arrayListOf<PersModel>(
            PersModel("Рик Санчез", "Жив", "https://static.wikia.nocookie.net/rickandmorty/images/f/f6/%D0%A0%D0%B8%D0%BA_%D0%A1%D0%B0%D0%BD%D1%87%D0%B5%D0%B7_004.jpg/revision/latest/scale-to-width-down/270?cb=20190714103849&path-prefix=ru"),
            PersModel("Морти Смит", "Жив", "https://static.wikia.nocookie.net/rickandmorty/images/d/d3/%D0%9C%D0%BE%D1%80%D1%82%D0%B8_%D0%A1%D0%BC%D0%B8%D1%82_001.jpg/revision/latest/scale-to-width-down/270?cb=20190714105326&path-prefix=ru"),
            PersModel("Джерри Смит", "Жив", "https://static.wikia.nocookie.net/rickandmorty/images/2/27/%D0%94%D0%B6%D0%B5%D1%80%D1%80%D0%B8_%D0%A1%D0%BC%D0%B8%D1%82_002.jpg/revision/latest/scale-to-width-down/270?cb=20230425124526&path-prefix=ru"),
            PersModel("Александр", "Мёртв", "https://static.wikia.nocookie.net/rickandmorty/images/b/be/%D0%90%D0%BB%D0%B5%D0%BA%D1%81%D0%B0%D0%BD%D0%B4%D1%80_001.jpg/revision/latest/scale-to-width-down/270?cb=20200629112212&path-prefix=ru"),
            PersModel("Тэмми Гутерман", "Мертва", "https://static.wikia.nocookie.net/rickandmorty/images/c/c3/%D0%A2%D1%8D%D0%BC%D0%BC%D0%B8_%D0%93%D1%83%D1%82%D0%B5%D1%80%D0%BC%D0%B0%D0%BD_001.jpg/revision/latest/scale-to-width-down/270?cb=20191001010204&path-prefix=ru"),
            PersModel("Алан Райлс", "Мертв", "https://static.wikia.nocookie.net/rickandmorty/images/5/59/%D0%90%D0%BB%D0%B0%D0%BD_%D0%A0%D0%B0%D0%B9%D0%BB%D1%81_001.jpg/revision/latest/scale-to-width-down/300?cb=20200430093732&path-prefix=ru"),
            PersModel("Саммер Смит", "Жива", "https://static.wikia.nocookie.net/rickandmorty/images/3/31/%D0%A1%D0%B0%D0%BC%D0%BC%D0%B5%D1%80_%D0%A1%D0%BC%D0%B8%D1%82_001.jpg/revision/latest/scale-to-width-down/250?cb=20190714103010&path-prefix=ru")
        )

        fun getList() = list
    }
}