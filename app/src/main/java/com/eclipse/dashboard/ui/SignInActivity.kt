package com.eclipse.dashboard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eclipse.dashboard.databinding.ActivitySignInBinding
import com.eclipse.dashboard.util.getAuthUri
import com.eclipse.dashboard.util.launchUri

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInButton.setOnClickListener {
            launchUri(this, getAuthUri())
        }
    }
}
