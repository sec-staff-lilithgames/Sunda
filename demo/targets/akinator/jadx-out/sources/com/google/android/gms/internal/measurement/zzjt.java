package com.google.android.gms.internal.measurement;

import android.net.Uri;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjt {
    private final t1 zza;

    public zzjt(t1 t1Var) {
        this.zza = t1Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        t1 t1Var = uri != null ? (t1) this.zza.get(uri.toString()) : null;
        if (t1Var == null) {
            return null;
        }
        return (String) t1Var.get("".concat(str3));
    }
}
