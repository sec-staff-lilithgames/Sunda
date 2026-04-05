package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfif {
    private final zzfie zza = new zzfie();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzfie zzf() {
        zzfie zzfieVar = this.zza;
        zzfie zzfieVarClone = zzfieVar.clone();
        zzfieVar.zza = false;
        zzfieVar.zzb = false;
        return zzfieVarClone;
    }

    public final String zzg() {
        StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
        sb2.append(this.zzd);
        sb2.append("\n\tNew pools created: ");
        sb2.append(this.zzb);
        sb2.append("\n\tPools removed: ");
        sb2.append(this.zzc);
        sb2.append("\n\tEntries added: ");
        sb2.append(this.zzf);
        sb2.append("\n\tNo entries retrieved: ");
        return a.b.f(this.zze, "\n", sb2);
    }
}
