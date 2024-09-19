package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val textSizeList: List<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        // Return the total number of items in the list
        return textSizeList.size
    }

    override fun getItem(position: Int): Any {
        // Return the item at the specified position
        return textSizeList[position]
    }

    override fun getItemId(position: Int): Long {
        // Return the position as a unique ID
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Inflate or reuse the view for each item
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_item, parent, false)
        val textView = view.findViewById<TextView>(android.R.id.text1)

        // Set the text and font size based on the position
        val textSize = textSizeList[position]
        textView.text = textSize.toString()
        textView.textSize = textSize.toFloat() // Set the text size

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Inflate or reuse the dropdown view
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_dropdown_item, parent, false)
        val textView = view.findViewById<TextView>(android.R.id.text1)

        // Set the text and font size for the dropdown item
        val textSize = textSizeList[position]
        textView.text = textSize.toString()
        textView.textSize = textSize.toFloat() // Set the font size

        return view
    }
}
