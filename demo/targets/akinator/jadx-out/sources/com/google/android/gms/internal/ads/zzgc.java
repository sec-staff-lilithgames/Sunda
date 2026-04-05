package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzgc extends IOException {
    public final int zza;

    public zzgc(int i10) {
        this.zza = i10;
    }

    public zzgc(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzgc(String str, Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzgc(Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
