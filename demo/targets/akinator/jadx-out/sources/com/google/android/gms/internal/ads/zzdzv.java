package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzdzv extends Exception {
    private final int zza;

    public zzdzv(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzv(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdzv(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
