package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcf extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzcf(String str, zzcd zzcdVar) {
        String strValueOf = String.valueOf(zzcdVar);
        super(a.b.o(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
