package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdi {
    final zzhdh zza;
    final long[] zzb;

    public zzhdi(zzhdh zzhdhVar, long[] jArr) {
        this.zza = zzhdhVar;
        this.zzb = jArr;
    }

    public static /* synthetic */ zzhdi zza(zzhdi zzhdiVar, zzhdg zzhdgVar) {
        zzb(zzhdiVar, zzhdgVar);
        return zzhdiVar;
    }

    private static zzhdi zzb(zzhdi zzhdiVar, zzhdg zzhdgVar) {
        zzhdh zzhdhVar = zzhdgVar.zza;
        zzhdh zzhdhVar2 = zzhdiVar.zza;
        long[] jArr = zzhdhVar2.zza;
        long[] jArr2 = zzhdhVar.zza;
        long[] jArr3 = zzhdgVar.zzb;
        zzhdq.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhdhVar2.zzb;
        long[] jArr5 = zzhdhVar.zzb;
        long[] jArr6 = zzhdhVar.zzc;
        zzhdq.zze(jArr4, jArr5, jArr6);
        zzhdq.zze(zzhdhVar2.zzc, jArr6, jArr3);
        zzhdq.zze(zzhdiVar.zzb, jArr2, jArr5);
        return zzhdiVar;
    }

    public zzhdi() {
        this(new zzhdh(), new long[10]);
    }

    public zzhdi(zzhdg zzhdgVar) {
        this();
        zzb(this, zzhdgVar);
    }
}
