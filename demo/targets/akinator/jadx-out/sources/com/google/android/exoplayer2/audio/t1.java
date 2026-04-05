package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t1 {
    public static int getPcmEncodingForType(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                return 0;
            }
        }
        return com.google.android.exoplayer2.util.n1.getPcmEncoding(i11);
    }

    public static int getTypeForPcmEncoding(int i10) {
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 536870912 || i10 == 805306368) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
