package com.project.recyclerviewpager

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_recyclerview.*

/**
 * Created by sonseongbin on 2017. 11. 27..
 */
class RecyclerViewFragment : Fragment() {

    private lateinit var manager: LinearLayoutManager
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(RecyclerViewFragment::class.java.simpleName, "onViewCreated")

        manager = LinearLayoutManager(context)
        adapter = RecyclerViewAdapter(context!!)
        recyclerView.layoutManager = manager
        recyclerView.adapter = adapter
    }

    fun setScroll(scrollY: Int) {
        Log.e(RecyclerViewFragment::class.java.simpleName, scrollY.toString())
        recyclerView?.scrollY = scrollY
        recyclerView?.scrollTo(0, scrollY)
        recyclerView?.smoothScrollBy(0, scrollY)
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(RecyclerViewFragment::class.java.simpleName, "onDetach")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(RecyclerViewFragment::class.java.simpleName, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(RecyclerViewFragment::class.java.simpleName, "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d(RecyclerViewFragment::class.java.simpleName, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(RecyclerViewFragment::class.java.simpleName, "onResume")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(RecyclerViewFragment::class.java.simpleName, "onAttach")
    }

}