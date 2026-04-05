package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzys {
    public final int zza;
    public final zzlq[] zzb;
    public final zzyk[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzys(zzlq[] zzlqVarArr, zzyk[] zzykVarArr, zzbn zzbnVar, Object obj) {
        int length = zzlqVarArr.length;
        zzgmd.zza(length == zzykVarArr.length);
        this.zzb = zzlqVarArr;
        this.zzc = (zzyk[]) zzykVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i10) {
        return this.zzb[i10] != null;
    }

    public final boolean zzb(zzys zzysVar, int i10) {
        return zzysVar != null && Objects.equals(this.zzb[i10], zzysVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzysVar.zzc[i10]);
    }
}
