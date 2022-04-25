package com.example.android.navigation.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.android.navigation.Adapter.TabAdapter
import com.example.android.navigation.R
import com.google.android.material.tabs.TabLayout

class  SecondFragment: Fragment() {


    var tabLayout: TabLayout?= null
    var viewPager: ViewPager?= null

    override fun onCreateView(inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.tabLayout)
        viewPager = view.findViewById(R.id.viewPager)

        viewPager?.adapter = TabAdapter(requireActivity().supportFragmentManager)
        tabLayout?.setupWithViewPager(viewPager)
    }




//    lateinit var btnProceed: Button

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//

//        val view = inflater.inflate(R.layout.fragment_second, container, false)
//        val display: TextView = view.findViewById(R.id.display)
//        val args = this.arguments
//
//        val inputData = args?.get("Welcome")
//        display.text = "Welcome  " + inputData.toString()

//        btnProceed = view.findViewById(R.id.btnProceed)
//
//        btnP roceed.setOnClickListener {
//            val thirdFragment = ThirdFragment()
//            fragmentManager?.beginTransaction()?.replace(R.id.container, thirdFragment)?.commit()
//        }
//        return view
//    }
}




