package com.android.settings.gnome;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.provider.Settings;

import com.android.internal.util.gnome.DeviceUtils;

import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;

public class NavbarSettings extends SettingsPreferenceFragment implements OnPreferenceChangeListener {

    private static final String TAG = "NavBar";
    private static final String PREF_STYLE_DIMEN = "navbar_style_dimen_settings";

    PreferenceScreen mStyleDimenPreference;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.gnome_settings);

        PreferenceScreen prefs = getPreferenceScreen();

        mStyleDimenPreference = (PreferenceScreen) findPreference(PREF_STYLE_DIMEN);

    }

    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }

    private void updateNavbarPreferences(boolean show) {
        mStyleDimenPreference.setEnabled(show);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
