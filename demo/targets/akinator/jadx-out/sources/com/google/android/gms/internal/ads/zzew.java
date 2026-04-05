package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzew {
    public final int zzd;

    public static String zze(int i10) {
        char c10 = (char) ((i10 >> 24) & 255);
        char c11 = (char) ((i10 >> 16) & 255);
        char c12 = (char) ((i10 >> 8) & 255);
        char c13 = (char) (i10 & 255);
        StringBuilder sb2 = new StringBuilder(o2.c(String.valueOf(c10).length(), String.valueOf(c11).length(), String.valueOf(c12).length(), String.valueOf(c13).length()));
        sb2.append(c10);
        sb2.append(c11);
        sb2.append(c12);
        sb2.append(c13);
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
