package com.zunzum.uikotilnpractice_zun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        확인 버튼이 눌리면 이벤트 달아주자
        okBtn.setOnClickListener {
//            입력한 내용을 변수에 저장(set)
            val inputContent = contentEdt.text.toString()
//            저장해둔 입력값 => 텍스트뷰의 내용으로 반영(get)
            resultTxt.text = inputContent
        }
    }
}