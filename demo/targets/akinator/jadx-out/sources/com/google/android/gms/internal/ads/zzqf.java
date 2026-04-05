package com.google.android.gms.internal.ads;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqf extends Exception {
    public zzqf(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        e2.A(sb2, "Unexpected audio track timestamp discontinuity: expected ", j11, ", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}
