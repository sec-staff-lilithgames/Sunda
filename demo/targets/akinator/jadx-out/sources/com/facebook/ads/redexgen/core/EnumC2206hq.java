package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MediaCodecPoolTracker$Source;", "", "<init>", "(Ljava/lang/String;I)V", "PREALLOCATE", "RENDERER", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC2206hq {
    public static byte[] A00;
    public static String[] A01 = {"rZXWte666DrLsHPXoqDaJnENYxWgqi71", "qMs7Jpkjo6B4WXMo8buLNP4YVnGGOO84", "YRIecdWAq5cWjgqhOuL8Ww5BoTNcrIze", "AByNt8kh1UJ42iFdWHQ9AlvMpeOzBj1N", "TtlAFxYjvYaGMd2rBwLXiq144cixnhml", "0tQELiow6fswCTTeRUqvQMculdEzTfkG", "bUbYkP8pksg9sIq7o6TggR0molp8Rj4l", "BmPEJaYEGSD1ZlHIDmqiSE8I7JHRaK4U"};
    public static final /* synthetic */ InterfaceC10659w A02;
    public static final /* synthetic */ EnumC2206hq[] A03;
    public static final EnumC2206hq A04;
    public static final EnumC2206hq A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].charAt(16) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "OpZAEcbarzEwXZVKbMNcbnzwzo5b5CZv";
            strArr[7] = "K81mqq1BRjiJt0SW846JOs7Zv9TlCW8P";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 73);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-6, -4, -17, -21, -10, -10, -7, -19, -21, -2, -17, -63, -76, -67, -77, -76, -63, -76, -63};
    }

    public static final /* synthetic */ EnumC2206hq[] A02() {
        EnumC2206hq[] enumC2206hqArr = new EnumC2206hq[2];
        EnumC2206hq enumC2206hq = A04;
        String[] strArr = A01;
        if (strArr[5].charAt(11) == strArr[7].charAt(11)) {
            throw new RuntimeException();
        }
        A01[4] = "Fkm6UCeGNRQRi4wWDBIOpvvd9TujRbQP";
        enumC2206hqArr[0] = enumC2206hq;
        enumC2206hqArr[1] = A05;
        return enumC2206hqArr;
    }

    static {
        A01();
        A04 = new EnumC2206hq(A00(0, 11, 97), 0);
        A05 = new EnumC2206hq(A00(11, 8, 38), 1);
        A03 = A02();
        A02 = AbstractC2630pB.A01(A03);
    }

    public EnumC2206hq(String str, int i10) {
    }

    public static EnumC2206hq valueOf(String str) {
        return (EnumC2206hq) Enum.valueOf(EnumC2206hq.class, str);
    }

    public static EnumC2206hq[] values() {
        return (EnumC2206hq[]) A03.clone();
    }
}
