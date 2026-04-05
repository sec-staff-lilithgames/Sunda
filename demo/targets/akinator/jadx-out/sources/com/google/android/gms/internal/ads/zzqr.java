package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqr {
    private final zzcg[] zza;
    private final zzrn zzb;
    private final zzcj zzc;

    public zzqr(zzcg... zzcgVarArr) {
        zzrn zzrnVar = new zzrn();
        zzcj zzcjVar = new zzcj();
        zzcg[] zzcgVarArr2 = {zzrnVar, zzcjVar};
        this.zza = zzcgVarArr2;
        System.arraycopy(zzcgVarArr, 0, zzcgVarArr2, 0, 0);
        this.zzb = zzrnVar;
        this.zzc = zzcjVar;
    }

    public final zzcg[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcj zzcjVar = this.zzc;
        zzcjVar.zzk(zzavVar.zzb);
        zzcjVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z10) {
        this.zzb.zzq(z10);
        return z10;
    }

    public final long zzd(long j10) {
        zzcj zzcjVar = this.zzc;
        return zzcjVar.zzc() ? zzcjVar.zzm(j10) : j10;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
