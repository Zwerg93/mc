package at.htl.leonding.bhitm5.learnfortest8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class RunnerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_runner, container, false)
        val savebutton : Button = view.findViewById(R.id.saveButton)
        val firstnamedt : EditText = view.findViewById(R.id.firstname)
        val lastnamedt : EditText = view.findViewById(R.id.lastname)
        val age : EditText = view.findViewById(R.id.age)

        savebutton.setOnClickListener{
            val name = firstnamedt.text.toString()
            val lastname = lastnamedt.text.toString()
            val age = age.text.toString().toInt()
            val bundle = Bundle()

            bundle.putString("name", name)
            bundle.putString("lastname", lastname)
            bundle.putInt("age", age)

            val fragment = HomeFragment()
            fragment.arguments = bundle

            fragmentManager?.beginTransaction()?.replace(R.id.nav_container, fragment)?.commit()

        }

        return view
    }

}