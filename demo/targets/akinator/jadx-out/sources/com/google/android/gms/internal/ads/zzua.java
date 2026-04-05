package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzua implements zzvf, zzrv {
    final /* synthetic */ zzuc zza;
    private final Object zzb;
    private zzve zzc;
    private zzru zzd;

    public zzua(zzuc zzucVar, Object obj) {
        Objects.requireNonNull(zzucVar);
        this.zza = zzucVar;
        this.zzc = zzucVar.zzf(null);
        this.zzd = zzucVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i10, zzuu zzuuVar) {
        zzuu zzuuVarZzx;
        if (zzuuVar != null) {
            zzuuVarZzx = this.zza.zzx(this.zzb, zzuuVar);
            if (zzuuVarZzx == null) {
                return false;
            }
        } else {
            zzuuVarZzx = null;
        }
        zzuc zzucVar = this.zza;
        zzucVar.zzw(this.zzb, 0);
        zzve zzveVar = this.zzc;
        int i11 = zzveVar.zza;
        if (!Objects.equals(zzveVar.zzb, zzuuVarZzx)) {
            this.zzc = zzucVar.zzg(0, zzuuVarZzx);
        }
        zzru zzruVar = this.zzd;
        int i12 = zzruVar.zza;
        if (Objects.equals(zzruVar.zzb, zzuuVarZzx)) {
            return true;
        }
        this.zzd = zzucVar.zzi(0, zzuuVarZzx);
        return true;
    }

    private final zzuq zzg(zzuq zzuqVar, zzuu zzuuVar) {
        zzuc zzucVar = this.zza;
        Object obj = this.zzb;
        zzucVar.zzy(obj, zzuqVar.zzc, zzuuVar);
        zzucVar.zzy(obj, zzuqVar.zzd, zzuuVar);
        return zzuqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcT(int i10, zzuu zzuuVar, zzul zzulVar, zzuq zzuqVar, int i11) {
        if (zzf(0, zzuuVar)) {
            zzve zzveVar = this.zzc;
            zzg(zzuqVar, zzuuVar);
            zzveVar.zzd(zzulVar, zzuqVar, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcU(int i10, zzuu zzuuVar, zzul zzulVar, zzuq zzuqVar) {
        if (zzf(0, zzuuVar)) {
            zzve zzveVar = this.zzc;
            zzg(zzuqVar, zzuuVar);
            zzveVar.zze(zzulVar, zzuqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcV(int i10, zzuu zzuuVar, zzul zzulVar, zzuq zzuqVar) {
        if (zzf(0, zzuuVar)) {
            zzve zzveVar = this.zzc;
            zzg(zzuqVar, zzuuVar);
            zzveVar.zzf(zzulVar, zzuqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcW(int i10, zzuu zzuuVar, zzul zzulVar, zzuq zzuqVar, IOException iOException, boolean z10) {
        if (zzf(0, zzuuVar)) {
            zzve zzveVar = this.zzc;
            zzg(zzuqVar, zzuuVar);
            zzveVar.zzg(zzulVar, zzuqVar, iOException, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzcX(int i10, zzuu zzuuVar, zzuq zzuqVar) {
        if (zzf(0, zzuuVar)) {
            zzve zzveVar = this.zzc;
            zzg(zzuqVar, zzuuVar);
            zzveVar.zzh(zzuqVar);
        }
    }
}
