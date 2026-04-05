package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcr {
    private static final String zzc;
    private static final String zzd;
    public final String zza;
    public final int zzb;

    static {
        String str = zzep.zza;
        zzc = Integer.toString(0, 36);
        zzd = Integer.toString(1, 36);
    }

    public zzcr(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
