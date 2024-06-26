package kr.ac.kopo.realglow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TabHost

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SkinFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SkinFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_skin, container, false)

        // TabHost 초기화
        val tabHost = view.findViewById<TabHost>(R.id.tabHost)
        tabHost.setup()

        // Tab1 설정
        var spec = tabHost.newTabSpec("Tab 1")
        spec.setContent(R.id.tabproduct1)
        spec.setIndicator("제품명1")
        tabHost.addTab(spec)

        // Tab2 설정
        spec = tabHost.newTabSpec("Tab 2")
        spec.setContent(R.id.tabproduct2)
        spec.setIndicator("제품명2")
        tabHost.addTab(spec)

        // Tab3 설정
        spec = tabHost.newTabSpec("Tab 3")
        spec.setContent(R.id.tabproduct3)
        spec.setIndicator("제품명3")
        tabHost.addTab(spec)

        // Tab3 설정
        spec = tabHost.newTabSpec("Tab 4")
        spec.setContent(R.id.tabproduct4)
        spec.setIndicator("제품명4")
        tabHost.addTab(spec)

        // Tab3 설정
        spec = tabHost.newTabSpec("Tab 5")
        spec.setContent(R.id.tabproduct5)
        spec.setIndicator("제품명5")
        tabHost.addTab(spec)

        // Tab3 설정
        spec = tabHost.newTabSpec("Tab 6")
        spec.setContent(R.id.tabproduct6)
        spec.setIndicator("제품명6")
        tabHost.addTab(spec)

        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SkinFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SkinFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}