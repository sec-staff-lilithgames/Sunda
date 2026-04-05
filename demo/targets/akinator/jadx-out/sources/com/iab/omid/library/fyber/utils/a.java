package com.iab.omid.library.fyber.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.fyber.adsession.DeviceCategory;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f30695a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f30695a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f30695a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
