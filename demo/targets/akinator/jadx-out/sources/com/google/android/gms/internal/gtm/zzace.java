package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzace extends zzabo {
    final zzadl zza;
    final Object zzb;
    final zzadl zzc;
    final zzacd zzd;

    public zzace(zzadl zzadlVar, Object obj, zzadl zzadlVar2, zzacd zzacdVar, Class cls) {
        if (zzadlVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (zzacdVar.zzc == zzaex.zzk && zzadlVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.zza = zzadlVar;
        this.zzb = obj;
        this.zzc = zzadlVar2;
        this.zzd = zzacdVar;
    }

    public final Object zza(Object obj) {
        if (this.zzd.zzc.zza() != zzaey.ENUM) {
            return obj;
        }
        zzacd zzacdVar = this.zzd;
        return zzacdVar.zza.zza(((Integer) obj).intValue());
    }
}
