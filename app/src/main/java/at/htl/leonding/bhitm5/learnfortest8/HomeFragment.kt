package at.htl.leonding.bhitm5.learnfortest8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val button : Button = view.findViewById(R.id.addButton)
        val textvview : TextView = view.findViewById(R.id.runners)
        val args = this.arguments

        val name = args?.get("name")
        val lastname = args?.get("lastname")
        val age = args?.get("age")

        textvview.text = name.toString()




        button.setOnClickListener{
            val fragment = RunnerFragment()
            fragmentManager?.beginTransaction()?.replace(R.id.nav_container, fragment)?.commit()
        }
        return view
    }


}