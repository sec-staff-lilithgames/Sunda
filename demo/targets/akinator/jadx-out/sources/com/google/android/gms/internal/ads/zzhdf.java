package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdf extends zzhde {
    private final long[] zzd;

    public zzhdf() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhde
    public final void zza(long[] jArr, long[] jArr2) {
        zzhdq.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhdf(zzhdi zzhdiVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhdh zzhdhVar = zzhdiVar.zza;
        zzhdq.zza(jArr2, zzhdhVar.zzb, zzhdhVar.zza);
        long[] jArr3 = this.zzb;
        zzhdh zzhdhVar2 = zzhdiVar.zza;
        zzhdq.zzb(jArr3, zzhdhVar2.zzb, zzhdhVar2.zza);
        System.arraycopy(zzhdiVar.zza.zzc, 0, jArr, 0, 10);
        zzhdq.zze(this.zzc, zzhdiVar.zzb, zzhdl.zzb);
    }
}
