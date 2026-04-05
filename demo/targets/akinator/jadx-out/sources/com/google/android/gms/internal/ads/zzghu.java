package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzghu implements zzght {
    private final zzifb zza;
    private final zzgjd zzb;
    private final long zzc;

    public zzghu(zzifb zzifbVar, zzgjd zzgjdVar, zzfxa zzfxaVar, long j10) {
        this.zza = zzifbVar;
        this.zzb = zzgjdVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final boolean zza(zzgaa zzgaaVar) {
        if (zzgaaVar == null || zzgaaVar.equals(zzgaa.zze())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzgaaVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z10 = (zzgaaVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z10) {
            this.zzb.zzb(15106);
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzght
    public final boolean zzb(zzgaa zzgaaVar) {
        if (zzgaaVar == null || zzgaaVar.equals(zzgaa.zze())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzgaaVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
