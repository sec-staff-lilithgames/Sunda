package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n {
    public static void a(Context context, w wVar) {
        String string = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
            if (!z) {
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (string != null) {
            synchronized (wVar) {
                v vVar = wVar.f23418b;
                vVar.f23414a = string;
                vVar.f23415b = z;
                vVar.f23416c = true;
            }
        }
    }
}
