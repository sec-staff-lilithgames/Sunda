package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzxq extends zzya implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxq(int i10, zzbg zzbgVar, int i11, zzxt zzxtVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = zzlp.zzaa(i12, zzxtVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxq zzxqVar) {
        return Integer.compare(this.zzf, zzxqVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final /* bridge */ /* synthetic */ boolean zzc(zzya zzyaVar) {
        return false;
    }
}
