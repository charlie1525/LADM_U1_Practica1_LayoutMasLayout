package mx.tecnm.ittepic.ladm_u1_practica1_layoutmaslayout

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import mx.tecnm.ittepic.ladm_u1_practica1_layoutmaslayout.ui.main.SectionsPagerAdapter
import mx.tecnm.ittepic.ladm_u1_practica1_layoutmaslayout.databinding.ActivityMainBinding
import mx.tecnm.ittepic.ladm_u1_practica1_layoutmaslayout.ui.main.PageViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var ventanaSettings:Intent
    lateinit var intentBasic : Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = binding.fab
        val exit: FloatingActionButton = binding.exit
        val photos: FloatingActionButton = binding.AlbumMainXML

        fab.setOnClickListener {
            ventanaSettings = Intent(this,SettingsActivity::class.java)
            startActivity(ventanaSettings)
        }

        exit.setOnClickListener{
            System.exit(0)
        }

        photos.setOnClickListener{
            intentBasic = Intent(this,BasicAlbumActivity::class.java)
            startActivity(intentBasic)
        }
    }
}