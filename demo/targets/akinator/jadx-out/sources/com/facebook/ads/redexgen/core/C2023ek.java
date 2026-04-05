package com.facebook.ads.redexgen.core;

import com.amazon.device.ads.DtbConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2023ek {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public InterfaceC2014eb A05;
    public int A04 = DtbConstants.NETWORK_READ_TIMEOUT;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 100);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, 44, 61, 59, 32, 44, 58, 105, 36, 60, 58, 61, 105, 43, 44, 105, 43, 44, 61, 62, 44, 44, 39, 105, 120, 105, 40, 39, 45, 105, 120, 113};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final C2023ek A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2023ek A03(int i10) {
        if (i10 >= 1 && i10 <= 18) {
            this.A01 = i10;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final C2023ek A04(int i10) {
        this.A02 = i10;
        return this;
    }

    public final C2023ek A05(int i10) {
        this.A03 = i10;
        return this;
    }

    public final C2023ek A06(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C2023ek A07(InterfaceC2014eb interfaceC2014eb) {
        this.A05 = interfaceC2014eb;
        return this;
    }

    public final C2023ek A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C2024el A09() {
        return new C2024el(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
