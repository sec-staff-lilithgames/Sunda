package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzke {
    public zzlf zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzke(zzlf zzlfVar) {
        this.zza = zzlfVar;
    }

    public final void zza(int i10) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(zzlf zzlfVar) {
        this.zze |= this.zza != zzlfVar;
        this.zza = zzlfVar;
    }

    public final void zzc(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzgmd.zza(i10 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i10;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
