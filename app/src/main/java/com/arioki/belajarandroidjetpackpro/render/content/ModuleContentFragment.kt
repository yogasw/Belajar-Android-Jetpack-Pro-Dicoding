package com.arioki.belajarandroidjetpackpro.render.content


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arioki.belajarandroidjetpackpro.R
import com.arioki.belajarandroidjetpackpro.data.ContentEntity
import kotlinx.android.synthetic.main.fragment_module_content.*


class ModuleContentFragment : Fragment() {
    companion object{
        val TAG = ModuleContentFragment::class.java.simpleName

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_module_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.let {
            val entity =
                ContentEntity("<h3 class=\\\"fr-text-bordered\\\">Contoh Content</h3><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>")
            populateWebView(entity)
        }
    }

    private fun populateWebView(content: ContentEntity) {
        web_view.loadData(content.content, "text/html", "UTF-8")
    }
}
