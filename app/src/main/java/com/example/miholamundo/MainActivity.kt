package com.example.miholamundo

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miholamundo.ui.theme.MiHolaMundoTheme
import androidx.compose.material.Text as Text1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Component()//llamamos la funcion que hemos creado
        }







    }

}

@Composable
fun Component() //creamos una funcion llamado component
{
    Column( //columna principal
        modifier = Modifier// etiqueta para modificar propiedades de columna
            .fillMaxSize(),// tamaño
        horizontalAlignment = Alignment.CenterHorizontally
        //verticalArrangement = Arrangement.Center
        //modifier = Modifier.fillMaxWidth()
        // modifier = Modifier.fillMaxHeight()
    )
    {


        //primera fila
        Row(
            modifier = Modifier
                .background(Color(0xFF5A885C))
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)

        ) {



            Column(modifier = Modifier
                .padding(start = 5.dp)
            )//colum para los dos textos
            {
                Text1(text = "IMSS Digital",
                    textAlign = TextAlign.Justify,
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp),//para dar espacio  asu alrededor
                    fontSize = 20.sp
                )
                Text1(text = "Bienvenido",
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp),//para dar espacio  asu alrededor
                    fontSize = 18.sp,
                    textAlign = TextAlign.Justify//texto justificado
                )

            }

            Column(modifier = Modifier.fillMaxWidth()
                .padding(end = 8.dp), //para dar tamaño a la columna
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center

            )
            {
                Text1(text="Consulta",
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 4.dp),//para dar espacio  asu alrededor
                    fontSize = 18.sp
                )


                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier
                        .padding(start = 1.dp, bottom = 6.dp),
                    shape=RoundedCornerShape(15.dp)

                    ) {
                    Text1(text = "NSS",
                        fontSize = 16.sp)
                }
            }


        } //fin primera fila

        //segunda fila
        Row() {


            //primer columna
            Column(modifier = Modifier
                .padding(top = 10.dp, start = 5.dp, end = 6.dp)
                .align(Alignment.CenterVertically)
                .size(160.dp)
                //.clip(RoundedCornerShape(20.dp))
                //.background(Color.Green)
                .border(width = 1.dp, color = Color.Black, shape = AbsoluteRoundedCornerShape(10.dp)),//para redondear el borde
            )
            {

                Image(painter = painterResource(id =  R.drawable.imge1),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Modulo Atencion " +
                        "Respiratorio (MARSS)",
                    modifier = Modifier,
                    textAlign = TextAlign.Center,//texto justificado
                )


            }

            //SEGUNDA COLUMNA
            Column(modifier = Modifier
                .padding(top = 10.dp, end = 5.dp, start = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp)
            )//colum para los dos textos
            {

                Image(painter = painterResource(id =  R.drawable.img2),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Permiso COVID 4.0",
                    modifier = Modifier
                        .width(180.dp),
                    textAlign = TextAlign.Center,//texto justificado


                )

            }




        }//FIN SEGUNDA FILA

        //TERCERA FILA
        Row() {


            //primer columna
            Column(modifier = Modifier
                .padding(top = 10.dp, start = 5.dp, end = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp),
            )
            {

                Image(painter = painterResource(id =  R.drawable.img3),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Cita medicina familiar",
                    modifier = Modifier.padding(4.dp)
                        .width(150.dp),
                    textAlign = TextAlign.Center,//texto justificado
                )

            }

            //SEGUNDA COLUMNA
            Column(modifier = Modifier
                .padding(top = 10.dp, end = 5.dp, start = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp)
            )//colum para los dos textos
            {

                Image(painter = painterResource(id =  R.drawable.img4),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "CHKT en linea",
                    modifier = Modifier
                        .width(180.dp),
                    textAlign = TextAlign.Center,//texto justificado


                )

            }




        }//FIN TERCERA FILA

        //CUARTA FILA
        Row() {


            //primer columna
            Column(modifier = Modifier
                .padding(top = 10.dp, start = 5.dp, end = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp),
            )
            {

                Image(painter = painterResource(id =  R.drawable.img5),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Vigencia de derechos",
                    modifier = Modifier
                        .width(160.dp),
                    textAlign = TextAlign.Center,//texto justificado
                )

            }

            //SEGUNDA COLUMNA
            Column(modifier = Modifier
                .padding(top = 10.dp, end = 5.dp, start = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp)
            )//colum para los dos textos
            {

                Image(painter = painterResource(id =  R.drawable.img6),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Alta o cambio de " +
                        "clinica",
                    modifier = Modifier
                        .width(120.dp)
                        .align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,//texto justificado


                )

            }




        }
        //FIN CUARTA FILA

        //QUINTA FILA
        Row() {


            //primer columna
            Column(modifier = Modifier
                .padding(top = 10.dp, start = 5.dp, end = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {

                Image(painter = painterResource(id =  R.drawable.img7),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Informate de tu " +
                        "familiar",
                    modifier = Modifier
                        .width(100.dp),
                    textAlign = TextAlign.Center,//texto justificado
                )

            }

            //SEGUNDA COLUMNA
            Column(modifier = Modifier
                .padding(top = 10.dp, end = 5.dp, start = 6.dp)
                .border(width = 1.dp, color = Color.Black,shape = AbsoluteRoundedCornerShape(10.dp))
                .align(Alignment.CenterVertically)
                .size(160.dp)
            )//colum para los dos textos
            {

                Image(painter = painterResource(id =  R.drawable.img8),//prametro para agregar una img
                    contentDescription = "1er. Image",//descripcion
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp)//para dar un contorno ala img
                        .size(80.dp)
                        .align(Alignment.CenterHorizontally)//tamaño
                )

                Text1(text = "Licencia 140 BIS",
                    modifier = Modifier
                        .width(180.dp),
                    textAlign = TextAlign.Center,//texto justificado


                )

            }




        }
        //FIN QUINTA FILA

        Row() {
            Image(painter = painterResource(id =  R.drawable.casita),//prametro para agregar una img
                contentDescription = "1er. Image",//descripcion
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(15.dp)//para dar un contorno ala img
                    .size(66.dp)

            )

            Image(painter = painterResource(id =  R.drawable.ubica),//prametro para agregar una img
                contentDescription = "1er. Image",//descripcion
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(15.dp)//para dar un contorno ala img
                    .size(66.dp)

            )

            Image(painter = painterResource(id =  R.drawable.nota),//prametro para agregar una img
                contentDescription = "1er. Image",//descripcion
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(15.dp)//para dar un contorno ala img
                    .size(55.dp)

            )
        }



    }
}




@Preview(showBackground = true)

@Composable
fun DefaultPreview(){
    Component()//llamamos la funcion que hemos creado para visualizar la  vista previa
}
