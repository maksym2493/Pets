package com.example.pets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var pets = listOf<Animal>(
        Animal(cat[0], cat[1], cat[2], R.drawable.cat),
        Animal(dog[0], dog[1], dog[2], R.drawable.dog),
        Animal(fish[0], fish[1], fish[2], R.drawable.fish)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding){
            catName.text = pets[0].name
            dogName.text = pets[1].name
            fishName.text = pets[2].name

            catImage.setImageResource(pets[0].image)
            dogImage.setImageResource(pets[1].image)
            fishImage.setImageResource(pets[2].image)

            catDescription.text = pets[0].description
            dogDescrioption.text = pets[1].description
            fishDescription.text = pets[2].description

            catButton.setOnClickListener{
                startActivity(Intent(this@MainActivity, Details::class.java).apply{ putExtra("data", pets[0]) })
            }

            dogButton.setOnClickListener{
                startActivity(Intent(this@MainActivity, Details::class.java).apply{ putExtra("data", pets[1]) })
            }

            fishButton.setOnClickListener{
                startActivity(Intent(this@MainActivity, Details::class.java).apply{ putExtra("data", pets[2]) })
            }
        }
    }

    companion object{
        var cat = listOf(
            "Лісовий кіт",
            "Лісовий кіт — близький родич домашнього кота.",
            "У самців довжина тіла 40-90 см, вага до 7 кг (самки трохи менші), хвіст близько половини довжини тіла. Тулуб витягнутий, на невисоких лапах, корпус трохи піднятий в області тазу. Голова витягнута слабо, порівняно з очеретяним або амурським котом. Біля основи хвоста є пара анальних залоз, секретом яких коти-самці позначають свою територію."
        )

        var dog = listOf(
            "Шакал звичайний",
            "Шакал звичайний або шакал азійський (Canis aureus) — вид родини псових (Canidae), ряду хижих.",
            "Вид, що активно розселюється принаймні в останні 20 років на північ, і наразі відомий на більшій частині країн Східної Європи до Естонії включно. Цей соціальний хижак всеїдний, споживає від плодів і комах до малих копитних. У 2015 році дослідження ДНК показали, що шість африканських підвидів C. aureus мають бути виділені в окремий вид, Canis anthus."
        )

        var fish = listOf(
            "Риба Групер",
            "Групер, або Мероу (Epinephelus) — рід риб родини Серранові (Serranidae).",
            "Довжина і маса риб коливається від 20 см і 100 г, до більше 2,5 метрів і масою більше 450 кг. У водах тропічної частини Індійського і Тихого океанів мешкає велетенський групер 'Epinephelus lanceolatus' довжиною 270 см і вагою 400 кг В західній частині Тихого океану водиться групер Epinephelus itajara, 250 см завдовжки і вагою 455 кг. Це переважно великі риби, що мають масивне, злегка стисле з боків тіло і дещо сплюснуту зверху вниз голову. Луска дрібна, зазублена, щільно сидить. Нижня щелепа зазвичай сильно видасться вперед і має одну або декілька пар сильних зубів, на верхній щелепі розташовані також зуби (частіше всього одна пара). Передкришка сильно зазублена. Рідкісні короткі і товсті зяброві тичинки покриті гострими дрібними шпильками, які можуть поранити руку, якщо рибу узяти голою рукою під зябра. Забарвлення груперів, як правило, дуже яскраве і різноманітне, типове для мешканців коралових рифів, в яких вони зазвичай тримаються."
        )
    }
}