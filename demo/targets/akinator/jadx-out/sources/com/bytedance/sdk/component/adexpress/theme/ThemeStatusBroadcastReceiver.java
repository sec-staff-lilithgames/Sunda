package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<jpo> jpo;

    public void jpo(jpo jpoVar) {
        this.jpo = new WeakReference<>(jpoVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<jpo> weakReference = this.jpo;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.jpo.get().onThemeChanged(intExtra);
    }
}
