package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidUnityInfoDataSource {
    private final String prefName;

    public AndroidUnityInfoDataSource(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    private final String getPlayerPrefId(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String string = AndroidPreferences.getString(this.prefName, str);
        if (string == null || n0.isBlank(string)) {
            return null;
        }
        return string;
    }

    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}
