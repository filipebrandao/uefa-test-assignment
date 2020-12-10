package com.filipebrandao.uefatest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.filipebrandao.uefatest.R

/**
 * A placeholder fragment containing a simple text view.
 */
class PlaceholderFragment : Fragment() {

    companion object {
        /**
         * The fragment argument representing the section name for this
         * fragment.
         */
        private const val ARG_SECTION_NAME = "section_name"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionName: String): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_SECTION_NAME, sectionName)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_placeholder, container, false)
        root.findViewById<TextView>(R.id.title).text = arguments!!.getString(ARG_SECTION_NAME)
        return root
    }

}