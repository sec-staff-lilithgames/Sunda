package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaeo extends zzaem {
    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzacf zzacfVar = (zzacf) obj;
        zzaen zzaenVar = zzacfVar.zzc;
        if (zzaenVar != zzaen.zzc()) {
            return zzaenVar;
        }
        zzaen zzaenVarZzf = zzaen.zzf();
        zzacfVar.zzc = zzaenVarZzf;
        return zzaenVarZzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* synthetic */ Object zzb() {
        return zzaen.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* synthetic */ Object zzc(Object obj) {
        zzaen zzaenVar = (zzaen) obj;
        zzaenVar.zzh();
        return zzaenVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzaen) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j10) {
        ((zzaen) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzaen) obj).zzj((i10 << 3) | 3, (zzaen) obj2);
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzyx zzyxVar) {
        ((zzaen) obj).zzj((i10 << 3) | 2, zzyxVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j10) {
        ((zzaen) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final void zzi(Object obj) {
        ((zzacf) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzaem
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzacf) obj).zzc = (zzaen) obj2;
    }
}
