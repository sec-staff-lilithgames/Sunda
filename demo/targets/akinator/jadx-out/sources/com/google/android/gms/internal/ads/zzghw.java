package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzghw implements zzght {
    private final zzgjd zza;
    private final long zzb;

    public zzghw(zzfxa zzfxaVar, zzgjd zzgjdVar, long j10) {
        this.zza = zzgjdVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final boolean zza(zzgaa zzgaaVar) {
        if (zzgaaVar == null || zzgaaVar.equals(zzgaa.zze())) {
            this.zza.zzb(20202);
            return true;
        }
        boolean z10 = zzgaaVar.zzb().zzb() - System.currentTimeMillis() <= this.zzb;
        if (z10) {
            this.zza.zzb(20203);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final boolean zzb(zzgaa zzgaaVar) {
        if (zzgaaVar != null && !zzgaaVar.equals(zzgaa.zze())) {
            return true;
        }
        this.zza.zzb(20204);
        return false;
    }
}
