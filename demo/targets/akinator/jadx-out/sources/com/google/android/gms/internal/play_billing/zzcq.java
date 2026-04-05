package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcp zzc;

    public final zzcq zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i11));
        }
        zzbw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzcr zzb() {
        zzcp zzcpVar = this.zzc;
        if (zzcpVar != null) {
            throw zzcpVar.zza();
        }
        zzdp zzdpVarZzg = zzdp.zzg(this.zzb, this.zza, this);
        zzcp zzcpVar2 = this.zzc;
        if (zzcpVar2 == null) {
            return zzdpVarZzg;
        }
        throw zzcpVar2.zza();
    }
}
