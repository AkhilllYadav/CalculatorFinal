package com.example.calculatorfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorfinal.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.allClear.setOnClickListener {
            binding.enterid.text = ""
            binding.resultId.text = ""
        }
        binding.zeroBtn.setOnClickListener {
            binding.enterid.append("0")
        }
        binding.oneBtn.setOnClickListener {
            binding.enterid.append("1")
        }
        binding.twoBtn.setOnClickListener {
            binding.enterid.append("2")
        }
        binding.threeBtn.setOnClickListener {
            binding.enterid.append("3")
        }
        binding.fourBtn.setOnClickListener {
            binding.enterid.append("4")
        }
        binding.fiveBtn.setOnClickListener {
            binding.enterid.append("5")
        }
        binding.sixBtn.setOnClickListener {
            binding.enterid.append("6")
        }
        binding.sevenBtn.setOnClickListener {
            binding.enterid.append("7")
        }
        binding.eightBtn.setOnClickListener {
            binding.enterid.append("8")
        }
        binding.nineBtn.setOnClickListener {
            binding.enterid.append("9")
        }
        binding.dotBtn.setOnClickListener {
            binding.enterid.append(".")
        }
        binding.btn00.setOnClickListener {
            binding.enterid.append("00")
        }
        binding.btnPlus.setOnClickListener {
            binding.enterid.append(" + ")
        }
        binding.btnMinus.setOnClickListener {
            binding.enterid.append(" - ")
        }
        binding.btnMulti.setOnClickListener {
            binding.enterid.append(" x ")
        }
        binding.btnDiv.setOnClickListener {
            binding.enterid.append(" / ")
        }
        binding.btnMod.setOnClickListener {
            binding.enterid.append(" % ")
        }



        binding.btnEqual.setOnClickListener {
            val expression = ExpressionBuilder(binding.enterid.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.resultId.text = longresult.toString()
            } else {
                binding.resultId.text = result.toString()
            }

        }
    }
}

