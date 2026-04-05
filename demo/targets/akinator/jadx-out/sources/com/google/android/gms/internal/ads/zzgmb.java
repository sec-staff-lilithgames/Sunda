package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgmb implements Serializable {
    public static zzgmb zzc() {
        return zzglk.zza;
    }

    public static zzgmb zzd(Object obj) {
        return obj == null ? zzglk.zza : new zzgmi(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgmb zzb(zzglu zzgluVar);
}
