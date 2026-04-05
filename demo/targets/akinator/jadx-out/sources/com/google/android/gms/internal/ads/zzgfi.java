package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgfi extends RuntimeException {
    public zzgfi() {
        this(0);
    }

    public zzgfi(int i10) {
        super(o2.l(i10, "r: ", new StringBuilder(String.valueOf(i10).length() + 3)));
    }

    public zzgfi(int i10, Throwable th2) {
        super("r: 2", th2);
    }
}
