package com.google.android.gms.internal.location;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    public zzbr(zzbs zzbsVar, int i10, int i11) {
        this.zzc = zzbsVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbs subList(int i10, int i11) {
        zzbm.zzc(i10, i11, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i12 = this.zza;
        return zzbsVar.subList(i10 + i12, i11 + i12);
    }
}
