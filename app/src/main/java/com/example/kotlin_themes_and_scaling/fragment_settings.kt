package com.example.kotlin_themes_and_scaling

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class fragment_settings : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}