package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzieu extends zziez {
    final String zza;

    public zzieu(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zziez
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}
