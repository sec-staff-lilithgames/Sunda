package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzlp {
    static boolean zzaa(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar) throws zzib;

    int zzu() throws zzib;

    default void zzw() {
    }

    default void zzv(zzlo zzloVar) {
    }
}
