package com.google.android.gms.internal.ads;

import com.ironsource.C3191e4;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgpf {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgpf(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        com.google.android.gms.internal.play_billing.a.B(sb2, "Multiple entries with same key: ", strValueOf, C3191e4.i.f36525b, strValueOf2);
        return new IllegalArgumentException(o2.r(sb2, " and ", strValueOf3, C3191e4.i.f36525b, strValueOf4));
    }
}
