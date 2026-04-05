package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzlu {
    public static final zzlu zza = new zzlu(new zzlt());
    public final zzgpo zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzlu(zzlt zzltVar) {
        this.zzb = zzltVar.zza();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzlu) && this.zzb.equals(((zzlu) obj).zzb);
    }

    public final int hashCode() {
        zzgpo zzgpoVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(zzgpoVar, null, null, bool, bool, bool, bool, bool);
    }
}
