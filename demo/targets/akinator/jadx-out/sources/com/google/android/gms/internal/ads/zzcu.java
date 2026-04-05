package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcu {
    private static final String zzb;
    public final String zza;

    static {
        String str = zzep.zza;
        zzb = Integer.toString(0, 36);
    }

    public zzcu(String str) {
        this.zza = str;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
