package com.iab.omid.library.inmobi.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.inmobi.adsession.DeviceCategory;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f30831a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f30831a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f30831a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
