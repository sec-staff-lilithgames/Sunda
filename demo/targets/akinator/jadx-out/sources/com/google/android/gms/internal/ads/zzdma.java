package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdma {
    public static final zzdma zza = new zzdma(new zzdlz());
    private final zzbjj zzb;
    private final zzbjg zzc;
    private final zzbjw zzd;
    private final zzbjt zze;
    private final zzbor zzf;
    private final t1 zzg;
    private final t1 zzh;

    public /* synthetic */ zzdma(zzdlz zzdlzVar, byte[] bArr) {
        this(zzdlzVar);
    }

    public final zzbjj zza() {
        return this.zzb;
    }

    public final zzbjg zzb() {
        return this.zzc;
    }

    public final zzbjw zzc() {
        return this.zzd;
    }

    public final zzbjt zzd() {
        return this.zze;
    }

    public final zzbor zze() {
        return this.zzf;
    }

    public final zzbjp zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbjp) this.zzg.get(str);
    }

    public final zzbjm zzg(String str) {
        return (zzbjm) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        t1 t1Var = this.zzg;
        ArrayList arrayList = new ArrayList(t1Var.size());
        for (int i10 = 0; i10 < t1Var.size(); i10++) {
            arrayList.add((String) t1Var.keyAt(i10));
        }
        return arrayList;
    }

    private zzdma(zzdlz zzdlzVar) {
        this.zzb = zzdlzVar.zza;
        this.zzc = zzdlzVar.zzb;
        this.zzd = zzdlzVar.zzc;
        this.zzg = new t1(zzdlzVar.zzf);
        this.zzh = new t1(zzdlzVar.zzg);
        this.zze = zzdlzVar.zzd;
        this.zzf = zzdlzVar.zze;
    }
}
