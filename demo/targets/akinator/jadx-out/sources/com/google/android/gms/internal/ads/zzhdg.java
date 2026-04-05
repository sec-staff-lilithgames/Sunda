package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhdg {
    final zzhdh zza;
    final long[] zzb;

    public zzhdg(zzhdh zzhdhVar, long[] jArr) {
        this.zza = zzhdhVar;
        this.zzb = jArr;
    }

    public zzhdg() {
        this(new zzhdh(), new long[10]);
    }

    public zzhdg(zzhdg zzhdgVar) {
        this.zza = new zzhdh(zzhdgVar.zza);
        this.zzb = Arrays.copyOf(zzhdgVar.zzb, 10);
    }
}
