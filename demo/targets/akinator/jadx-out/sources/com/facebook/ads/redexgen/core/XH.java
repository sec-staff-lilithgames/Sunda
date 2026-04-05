package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class XH {
    public static byte[] A0I;
    public static String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, 12, 115, AbstractJsonLexerKt.TC_INVALID, 60, 51, 54, 60, 52, 56, 42, 62, 45, 59, 11, 54, 50, 58, 101, AbstractJsonLexerKt.TC_INVALID, 75, 78, 122, 69, 89, 67, 94, 67, 69, 68, 114, 94, 91, 111, 80, 76, 86, 75, 86, 80, 81, 102, 105, 102, 99, 105, 97, 78, 111, 102, 107, 115, 94, 99, 103, 111, 119, 120, 125, 119, AbstractJsonLexerKt.TC_INVALID, 76, 47, 32, 37, 47, 39, 21, 95, 80, 85, 95, 87, 89, 88, 106, 85, 89, 75, 104, 93, 91, 1, 10, 0, 48, 13, 9, 1, 115, 120, 114, 78, 46, 37, 47, 18, 20, 29, 0, 17, 23, 108, 97, 109, 99, 108, 112, 56, 34, 18, 61, 56, 50, 58, 22, 36, 48, 35, 53, 20, Utf8.REPLACEMENT_BYTE, 48, 51, 61, 52, 53, 107, 113, 84, 71, 66, 79, 83, 85, 126, 118, 101, 96, 109, 113, 119, 93, 14, 25, 31, 19, 14, 24, 21, 18, 27, 92, 21, 17, 12, 14, 25, 15, 15, 21, 19, 18, 70, 92, 99, 100, 113, 98, 100, 68, 121, 125, 117, 115, 116, 97, 114, 116, 88, 36, 35, 54, 37, 35, 14, 15, 17, 28, 12, 16};
    }

    static {
        A02();
        A0K = XH.class.getSimpleName();
    }

    private EnumC1645Wq A00() {
        if (this.A0G == null || this.A0F == null) {
            return EnumC1645Wq.A0J;
        }
        View view = this.A0G;
        String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                EnumC1645Wq enumC1645Wq = EnumC1645Wq.A0H;
                String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return enumC1645Wq;
            }
            Object tag = this.A0G.getTag(EnumC1645Wq.A02);
            if (tag == null) {
                return EnumC1645Wq.A0I;
            }
            if (!(tag instanceof EnumC1645Wq)) {
                EnumC1645Wq enumC1645Wq2 = EnumC1645Wq.A0K;
                if (A0J[2].charAt(2) == 'm') {
                    A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                    return enumC1645Wq2;
                }
            } else {
                return (EnumC1645Wq) tag;
            }
        }
        throw new RuntimeException();
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        long j10;
        if (!this.A0H) {
            return null;
        }
        String strValueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        if (this.A0C > 0 && this.A0D > this.A0C) {
            j10 = this.A0D - this.A0C;
        } else {
            j10 = -1;
        }
        HashMap map = new HashMap();
        String strValueOf2 = String.valueOf(this.A04);
        String radius = A01(20, 11, 76);
        map.put(radius, strValueOf2);
        String strValueOf3 = String.valueOf(this.A05);
        String radius2 = A01(31, 11, 89);
        map.put(radius2, strValueOf3);
        String strValueOf4 = String.valueOf(this.A06);
        String radius3 = A01(186, 5, 30);
        map.put(radius3, strValueOf4);
        String strValueOf5 = String.valueOf(this.A03);
        String radius4 = A01(102, 6, 98);
        map.put(radius4, strValueOf5);
        String strA01 = A01(42, 14, 108);
        String radius5 = String.valueOf(j10);
        map.put(strA01, radius5);
        String strValueOf6 = String.valueOf(this.A0E);
        String radius6 = A01(165, 9, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        map.put(radius6, strValueOf6);
        String strValueOf7 = String.valueOf(this.A0D);
        String radius7 = A01(82, 7, 2);
        map.put(radius7, strValueOf7);
        String strValueOf8 = String.valueOf(this.A0A);
        String radius8 = A01(174, 6, 102);
        map.put(radius8, strValueOf8);
        String strValueOf9 = String.valueOf(this.A0B);
        String radius9 = A01(180, 6, 49);
        map.put(radius9, strValueOf9);
        String strValueOf10 = String.valueOf(this.A07);
        String radius10 = A01(56, 6, 114);
        map.put(radius10, strValueOf10);
        String strValueOf11 = String.valueOf(this.A08);
        String radius11 = A01(62, 6, 42);
        map.put(radius11, strValueOf11);
        String strValueOf12 = String.valueOf(this.A07);
        String radius12 = A01(89, 4, 112);
        map.put(radius12, strValueOf12);
        String strValueOf13 = String.valueOf(this.A08);
        String radius13 = A01(93, 4, 45);
        map.put(radius13, strValueOf13);
        String strValueOf14 = String.valueOf(this.A00);
        String radius14 = A01(97, 5, 20);
        map.put(radius14, strValueOf14);
        String radius15 = A01(129, 7, 64);
        map.put(radius15, strValueOf);
        String radius16 = A01(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 7, 98);
        map.put(radius16, strValueOf);
        String strValueOf15 = String.valueOf(A00().A06());
        String radius17 = A01(68, 14, 90);
        map.put(radius17, strValueOf15);
        return map;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 26) + this.A0C;
        }
    }

    public final void A06(C1937dL c1937dL, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c1937dL.A0F().AK0();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                String[] strArr = A0J;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    String[] strArr2 = A0J;
                    strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                    strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                    if (motionRange != null && motionRange2 != null) {
                        this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / AbstractC1640Wl.A02);
                this.A05 = (int) (iArr[1] / AbstractC1640Wl.A02);
                this.A06 = (int) (view.getWidth() / AbstractC1640Wl.A02);
                this.A03 = (int) (view.getHeight() / AbstractC1640Wl.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC1640Wl.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / AbstractC1640Wl.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / AbstractC1640Wl.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / AbstractC1640Wl.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z10;
        int iA07 = U7.A07(context);
        long jA03 = A03();
        if (iA07 >= 0 && jA03 < iA07) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 55) + z10 + A01(2, 18, 57) + iA07 + A01(0, 2, 74) + jA03;
        }
        return z10;
    }
}
