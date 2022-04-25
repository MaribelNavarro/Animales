package com.example.animales

class AnimalOrganized {
    var listaAnimales = listOf<DataAnimales>()

    constructor(){
        listaAnimales = listOf(
            DataAnimales("https://media.istockphoto.com/photos/african-elephant-standing-in-grassland-at-sunset-picture-id1201463812?k=20&m=1201463812&s=612x612&w=0&h=Ki_jdv54RnI28m5ZYBxJBI9dkj_mU-HzzCUYze9m2II=","Elefante", "MAMÍFEROS", "https://www.youtube.com/watch?v=yPUxDfKSZgs"),
            DataAnimales("https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/purina-por-que-los-perros-mueven-la-cola.png?itok=Kw0lwckl", "Perro", "MAMÍFEROS", "https://www.youtube.com/watch?v=-CQ0Xjhgzjs"),
            DataAnimales("https://www.zooplus.es/magazine/wp-content/uploads/2018/07/Parasitos-en-gatos-768x515.jpeg", "Gato", "MAMÍFEROS", "https://www.youtube.com/watch?v=NrIfsoxv1OU"),
            DataAnimales("https://misanimales.com/wp-content/uploads/2021/01/rana-ardilla.jpg","Rana", "ANFIBIOS", "https://www.youtube.com/watch?v=QMYpXmvhRwo"),
            DataAnimales("https://www.ranchomagico.com.mx/blog/wp-content/uploads/2018/02/ajolote1-1.jpg", "Ajolote", "ANFIBIOS", "https://www.youtube.com/watch?v=3WIxtVtK8So"),
            DataAnimales("https://www.lavanguardia.com/files/og_thumbnail/uploads/2020/10/21/5fb2937607a2b.jpeg", "Salamandra", "ANFIBIOS", "https://www.youtube.com/watch?v=ojcd-lwWAYI"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeaaCveUu9P2cYinbK6w4B80lrpvrp6YedZw&usqp=CAU", "Tortuga", "REPTILES", "https://www.youtube.com/watch?v=Pom6nyPR7_Y"),
            DataAnimales("https://atlasanimal.com/wp-content/uploads/2021/02/Caiman.jpg", "Caimán", "REPTILES", "https://www.youtube.com/watch?v=UMOB7Km-gnI"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSw_LjKSGeWj2_IGcd7kDErlQHfhHuKY1B8xA&usqp=CAU", "Pitón", "REPTILES", "https://www.youtube.com/watch?v=5qyqwhrJoD8"),
            DataAnimales("https://www.nationalgeographic.com.es/medio/2018/02/27/tiburon__1280x720.jpg", "Tiburón", "PECES", "https://www.youtube.com/watch?v=qb8ulwUBRBA"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROIJLT5bmMUsRu5maPluB3q77Kem_fzRh1Jw&usqp=CAU", "Piraña", "PECES", "https://www.youtube.com/watch?v=NCKIjY28MSo"),
            DataAnimales("https://www.bioenciclopedia.com/wp-content/uploads/2013/11/pez-payaso4.jpg", "Pez payaso", "PECES", "https://www.youtube.com/watch?v=6gMZm1yRak0"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRo6MN8DbO68VZqsvTykRl4pH4GM-qMnai99A&usqp=CAU", "Loro", "AVES", "https://www.youtube.com/watch?v=giTtRLv66MI"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSst0NFWPU72mZ6kKaGPjRENpsTrr_0667zxg&usqp=CAU", "Paloma", "AVES", "https://www.youtube.com/watch?v=dv_1B-loq2c"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQekKtJ9IagZaZpQGHa0CLokX7XZnwHhlijQEt2SjG3Lnz0c6gpw0erO5TU2HAqkHFxmPs&usqp=CAU", "Colibri", "AVES", "https://www.youtube.com/watch?v=jcG7KS7sPwI"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTowRVH_Fyrpe5CdnawxSAqYV6Tdzv6sBWq-Q&usqp=CAU", "Mariposa", "INSECTOS", "https://www.youtube.com/watch?v=FMcNMQirWms"),
            DataAnimales("https://misanimales.com/wp-content/uploads/2017/11/mantis-religiosa.jpg", "Mantis", "INSECTOS", "https://www.youtube.com/watch?v=PWcKJWNToyE"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUHfY58bFGagJ44NxHYOhGKhoQkYGsUSXFVA&usqp=CAU", "Mariquita", "INSECTOS", "https://www.youtube.com/watch?v=SQSH28298YM"),
            DataAnimales("https://es.mercopress.com/data/cache/noticias/85769/0x0/camaron.jpg", "Camarón", "ANTRÓPODOS", "https://www.youtube.com/watch?v=C10XIgrHm2I"),
            DataAnimales("https://static8.depositphotos.com/1361307/912/i/600/depositphotos_9121169-stock-photo-red-knee-tarantula.jpg", "Araña", "ANTRÓPODOS", "https://www.youtube.com/watch?v=G8C2VYlghcw"),
            DataAnimales("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOZAZ3KZmGuOikCA0OxXNRyT-8VxVEXlGqbw&usqp=CAU", "Cangrejo", "ANTRÓPODOS", "https://www.youtube.com/watch?v=hUNSP9kLX2c")

        )
    }

    public fun obtenerAnimalPorTipo(tipo : String) : ArrayList<DataAnimales>{
        var result = arrayListOf<DataAnimales>()

        for(animal in listaAnimales){
            if (animal.tipo.equals(tipo)){
               result.add(animal)
            }
        }

        return result
    }
}