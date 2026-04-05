package com.google.android.gms.internal.ads;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzer {
    public final String zza;

    private zzer(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzer zza(zzeg zzegVar) {
        String str;
        zzegVar.zzk(2);
        int iZzs = zzegVar.zzs();
        int i10 = iZzs >> 1;
        int i11 = iZzs & 1;
        int iZzs2 = zzegVar.zzs() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iZzs2 | (i11 << 5);
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i12).length();
        String str2 = i10 < 10 ? ".0" : ".";
        int iC = o2.C(str.length(), length, str2);
        String str3 = i12 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(o2.C(iC, length2, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        sb2.append(i12);
        return new zzer(i10, i12, sb2.toString());
    }
}
