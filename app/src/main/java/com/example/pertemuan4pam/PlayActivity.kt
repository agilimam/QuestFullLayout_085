package com.example.pertemuan4pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns

@Preview(showBackground = true)
@Composable
fun PlayActivity( modifier: Modifier = Modifier){
    Column (
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth")
        Text(text = "Jodi")
        Spacer(modifier = Modifier.padding(8.dp))
        MainSection(judulParam = "Nama", Isiparams = "Agil Imam Alhafizi")
        MainSection(judulParam = "Kelas", Isiparams = "Teknologi Informasi")
        MainSection(judulParam = " NIM", Isiparams = "20220140085")
        MainSection(judulParam = "Ket", Isiparams = "Mantap")


    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(Color.DarkGray)) {
        Row (
            modifier = Modifier.padding(15.dp)
        ) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = "", Modifier.size(100.dp)
                )
                Icon(
                    Icons.Filled.Check, contentDescription = " ",
                    Modifier.padding(end = 10.dp).size(25.dp),
                    tint = Color.Red,
                )
            }
            Column (Modifier.padding(15.dp)){
                Text(text="Teknologi Informasi", color = Color.White
                )
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas muhammadiyah yogyakarta", color =Color.White
                )
            }
        }

    }

}


@Composable
fun MainSection(judulParam : String, Isiparams :String){
    Column (horizontalAlignment = Alignment.Start
    ){
//        Spacer(modifier = Modifier.padding(8.dp))
//        Text(text = "Kepada Yth")
//        Text(text = "Jodi")

        Row(modifier = Modifier.fillMaxWidth().padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = judulParam, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = "$Isiparams", modifier = Modifier.weight(2f))
        }
//        Row(modifier = Modifier.fillMaxWidth().padding(15.dp),
//
//            horizontalArrangement = Arrangement.SpaceBetween
//        ){
//            Text(text = "Kelas", modifier = Modifier.weight(0.8f))
//            Text(text = ":", modifier = Modifier.weight(0.2f))
//            Text(text = "Teknologi Informasi", modifier = Modifier.weight(2f))
//        }
    }

}