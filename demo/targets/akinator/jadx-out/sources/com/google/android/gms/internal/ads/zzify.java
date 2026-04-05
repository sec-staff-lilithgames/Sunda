package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.d0;
import androidx.browser.customtabs.v;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzify extends d0 {
    private final WeakReference zza;

    public zzify(zzbfv zzbfvVar) {
        this.zza = new WeakReference(zzbfvVar);
    }

    @Override // androidx.browser.customtabs.d0
    public final void onCustomTabsServiceConnected(ComponentName componentName, v vVar) {
        zzbfv zzbfvVar = (zzbfv) this.zza.get();
        if (zzbfvVar != null) {
            zzbfvVar.zzf(vVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbfv zzbfvVar = (zzbfv) this.zza.get();
        if (zzbfvVar != null) {
            zzbfvVar.zzg();
        }
    }
}
