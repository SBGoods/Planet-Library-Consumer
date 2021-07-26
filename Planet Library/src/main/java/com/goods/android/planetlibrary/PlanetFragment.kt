package com.goods.android.mylibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.goods.android.planetlibrary.R

class PlanetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_planet, container, false)
        val planetNameTextView = view.findViewById<TextView>(R.id.planetNameTextView)
        val planetImageView = view.findViewById<ImageView>(R.id.planetImageView)

        planetImageView.setImageResource(R.drawable.mercury)
        planetNameTextView.setText(R.string.mercury_planet_name)


        return view
    }

}