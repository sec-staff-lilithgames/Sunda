package com.google.android.gms.internal.ads;

import java.io.File;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzghi implements zzggu {
    private final zzfyz zza;
    private final zzfyz zzb;
    private final zzifb zzc;
    private final zzgjd zzd;

    public zzghi(zzfyz zzfyzVar, zzfyz zzfyzVar2, zzifb zzifbVar, zzgjd zzgjdVar) {
        this.zza = zzfyzVar;
        this.zzb = zzfyzVar2;
        this.zzc = zzifbVar;
        this.zzd = zzgjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final n1 zza() {
        n1 n1VarZzb = this.zza.zzb();
        this.zzd.zze(20302, n1VarZzb);
        return n1VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final n1 zzb(zzgaa zzgaaVar) {
        n1 n1VarZzc = this.zza.zzc(zzgaaVar);
        this.zzd.zze(20303, n1VarZzc);
        return n1VarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final n1 zzc() {
        n1 n1VarZzb = this.zzb.zzb();
        this.zzd.zze(20304, n1VarZzb);
        return n1VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final n1 zzd(byte[] bArr) {
        n1 n1VarZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, n1VarZzc);
        return n1VarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final File zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final n1 zzf(byte[] bArr) {
        n1 n1VarZzc = ((zzfyz) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, n1VarZzc);
        return n1VarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final File zzg() {
        return ((zzfyz) this.zzc.zzb()).zza();
    }
}
