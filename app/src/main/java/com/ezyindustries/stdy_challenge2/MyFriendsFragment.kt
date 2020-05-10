package com.ezyindustries.stdy_challenge2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_myfriends.*

class MyFriendsFragment : Fragment() {

    lateinit var listTeman: ArrayList<MyFriend>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {

        return inflater.inflate(R.layout.fragment_myfriends,

            container, false)
    }

    override fun onViewCreated( view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("reyhan", "Laki-laki", "reyhan2002@gmail.com", "085123123123", "Malang"))
        listTeman.add(MyFriend("ivan", "Laki-laki", "ivanreyhan2002@gmail.com", "081336227548", "Malang"))
    }

    private fun tampilTeman() {
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendAdapter(activity!!,listTeman)
    }

}