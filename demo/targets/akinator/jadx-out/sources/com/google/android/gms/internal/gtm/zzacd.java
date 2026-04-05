package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzacd implements zzabu {
    final zzaci zza;
    final int zzb;
    final zzaex zzc;
    final boolean zzd;

    public zzacd(zzaci zzaciVar, int i10, zzaex zzaexVar, boolean z10, boolean z11) {
        this.zza = zzaciVar;
        this.zzb = i10;
        this.zzc = zzaexVar;
        this.zzd = z10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzacd) obj).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final zzadk zzb(zzadk zzadkVar, zzadl zzadlVar) {
        zzaca zzacaVar = (zzaca) zzadkVar;
        zzacaVar.zzA((zzacf) zzadlVar);
        return zzacaVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final zzadq zzc(zzadq zzadqVar, zzadq zzadqVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final zzaex zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final zzaey zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzabu
    public final boolean zzg() {
        return this.zzd;
    }
}
