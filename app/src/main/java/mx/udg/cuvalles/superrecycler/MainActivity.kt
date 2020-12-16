package mx.udg.cuvalles.superrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.udg.cuvalles.superrecycler.adapters.PaisAdapter
import mx.udg.cuvalles.superrecycler.modelo.Pais

class MainActivity : AppCompatActivity() {
    var miRecycler:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miRecycler = findViewById(R.id.miRecycler)

        val listaPaises =  ArrayList<Pais>()

        listaPaises.add(Pais("México","https://www.tamaulipas.gob.mx/fomentocivico/wp-content/uploads/sites/20/2017/04/bandera-mexico-portavox-e1492461746506.jpg"))
        listaPaises.add(Pais("Estados Unidos","https://curiosfera-historia.com/wp-content/uploads/historia-bandera-de-Estados-Unidos.jpg"))

        miRecycler!!.layoutManager = GridLayoutManager(this,1)
        miRecycler!!.setHasFixedSize(true)
        miRecycler!!.adapter= PaisAdapter(listaPaises,this)
    }
}