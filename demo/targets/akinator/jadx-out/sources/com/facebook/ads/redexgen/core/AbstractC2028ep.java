package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2028ep {
    public static byte[] A05;
    public static String[] A06 = {"cXHhWS2U0AEbFhhmPHmVuH", "wVYzC7Nkmxeng7LXEltnvgZwmBeHxDlH", "QdB4DFNTOqs3kzyCIXC3RbQ0s8ofNHfi", "NfO94uVHpQsZyAD7D3sB88", "Qb7NVaH0CDkMRhWHzZDzGB0JzykCOgpa", "79nTtHn72qGvVt6br", "vvJx1YlMdzFVt9WMGmsv2mWYh0j6ZH0a", "LFbWjj4EQG077AWDW1GPYYaHkUkOcLUG"};
    public C2024el A00;
    public EnumC2027eo A01;
    public String A02;
    public String A03;
    public byte[] A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-121};
        String[] strArr = A06;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "4G6bp2JlnqCaKfrAR3d18U2njy0G4HP7";
        strArr2[6] = "szJTv6Q1Z3W9cwFEkaj97Hf7uwsDfHCt";
        A05 = bArr;
    }

    static {
        A01();
    }

    public AbstractC2028ep(String str, C2030er c2030er, C2024el c2024el) {
        this.A03 = A00(0, 0, 34);
        if (str != null) {
            this.A03 = str;
        }
        if (c2030er != null && !c2030er.A06().isEmpty()) {
            this.A03 += A00(0, 1, 55) + c2030er.A06();
        }
        this.A00 = c2024el;
    }

    public final C2024el A02() {
        return this.A00;
    }

    public final EnumC2027eo A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
