package com.example.blockbuster.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.blockbuster.R
import com.example.blockbuster.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding)
        {
            btnRegister.setOnClickListener {
                if(!tieName.text.toString().isEmpty() && !tieEmail.text.toString().isEmpty() && !tiePassword.text.toString().isEmpty()){
                    val restriccion = "^(?=.*[0-9])(?=.*[a-z]).{6}\$"
                    if(tiePassword.text.toString().matches(restriccion.toRegex())){
                        Toast.makeText(context,"El registro se hizo correctamente",Toast.LENGTH_SHORT).show()
                        tieName.setText("")
                        tieEmail.setText("")
                        tiePassword.setText("")
                    }else{
                        tiePassword.error = getString(R.string.error_password)
                    }

                }
                else {
                    if (tieName.text.toString() == ""){
                        tieName.error = getString(R.string.error_campo)
                    }
                    if (tieEmail.text.toString() == ""){
                        tieEmail.error = getString(R.string.error_campo)
                    }
                    if (tiePassword.text.toString() == ""){
                        tiePassword.error = getString(R.string.error_campo)
                    }
                    Toast.makeText(context, "Por favor llene todos los campos", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}