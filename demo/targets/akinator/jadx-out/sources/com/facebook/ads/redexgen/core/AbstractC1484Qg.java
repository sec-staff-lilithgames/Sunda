package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Qg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1484Qg {
    public static byte[] A0I;
    public static String[] A0J = {"elFBINX9KCZeeh3GuBtXNkrnzvQO2EpS", "90eRnITlqXrODLYCktUoA3f94MaN8E2n", "frZa4xykTTwKCwTkBfcIIin", "72h0olRZUROZW521vLa1lYqHWLi1sRbG", "kk2D46k9ZSS3Lo8lOZQg", "QRz6bzRDBRAzmbOrrZDxPPvKGEinNos5", "9IkI3xtzDHMbybABrSkeOgSSTxMSP2eR", "o2K5Iq3zbWnsvhRLVQUneLMfyrath7l2"};
    public static final List<Object> A0K;
    public C09846g A08;
    public WeakReference<C09846g> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AbstractC1484Qg A06 = null;
    public AbstractC1484Qg A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public QW A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    public int A02 = -1;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
            String[] strArr = A0J;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "UeRrU6VIZhMUvjXaMrLT2TysGAtdmGOb";
            strArr2[1] = "zACgjBXCZF9ewGg4NUIKbeNCvKdUEEL0";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0I = new byte[]{3, 74, 71, 30, 126, 55, 57, 48, 49, 44, 59, 58, 86, 31, 24, 0, 23, 26, 31, 18, 25, 87, 86, 25, 73, 88, 75, 92, 87, 77, 60, 114, 115, 104, 60, 110, 121, AbstractJsonLexerKt.TC_INVALID, 101, AbstractJsonLexerKt.TC_INVALID, 112, 125, 126, 112, 121, 52, 24, 72, 87, 75, 81, 76, 81, 87, 86, 5, 33, 115, 100, 108, 110, 119, 100, 101, 85, 6, 22, 7, 20, 5, 85, 18, 70, 95, 66, 118, 87, 70, 83, 81, 90, 87, 86, 122, 47, 52, 56, 53, 47, 52, 62, 26, 79, 84, 94, 95, 92, 83, 84, 95, 94, 26, 91, 94, 91, 74, 78, 95, 72, 26, 74, 85, 73, 83, 78, 83, 85, 84, 2, 87, 82, 70, 67, 86, 71, 50, 32, 44, 99, 96, 104, 92, 99, AbstractJsonLexerKt.TC_INVALID, 49, 27, 23, 71, 123, 71, 88, 68, 13, 34, 29, 17, 3, 38, 25, 21, 7, 56, 31, 28, 20, 21, 2, 11, 61, 7, 18, 18, 7, 5, 14, 3, 2, 53, 5, 20, 7, 22, 59, 58, 2, 9, 0, 15, 6, 4, 50, 2, 19, 0, 17, 60, 46, 52, 21, 34, 36, 62, 36, 43, 38, 37, 43, 34, 103, 35, 34, 36, 53, 34, 42, 34, 41, 51, 34, 35, 103, 37, 34, 43, 40, 48, 103, 119, 125, 103, 50, 41, 42, 38, 51, 36, 47, 34, 35, 103, 55, 38, 46, 53, 103, 40, 33, 103, 52, 34, 51, 14, 52, 21, 34, 36, 62, 38, 37, 43, 34, 111, 110, 103, 36, 38, 43, 43, 52, 103, 33, 40, 53, 103, 29, 0, 17, 25, 34, 29, 17, 3, 84, 25, 21, 13, 84, 26, 27, 0, 84, 22, 17, 84, 26, 1, 24, 24, 123};
    }

    static {
        A0A();
        A0K = Collections.EMPTY_LIST;
    }

    public AbstractC1484Qg(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A08(264, 24, 66));
    }

    private void A09() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C09846g c09846g) {
        this.A0E = P3.A00(this.A0H);
        c09846g.A1z(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C09846g c09846g) {
        c09846g.A1z(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0F() {
        return (this.A0C & 16) == 0 && P3.A0G(this.A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0H() {
        if ((this.A0C & 512) == 0) {
            boolean zA0f = A0f();
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[4] = "dSQQEa0elVuDjjqhtuiH";
            if (!zA0f) {
                return false;
            }
        }
        return true;
    }

    public final int A0M() {
        if (this.A08 == null) {
            return -1;
        }
        int iA1C = this.A08.A1C(this);
        String[] strArr = A0J;
        if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
            throw new RuntimeException();
        }
        A0J[2] = "FYB2N4b61bNhg9cwpN00hgm";
        return iA1C;
    }

    public final int A0N() {
        return this.A00;
    }

    public final int A0O() {
        return this.A04 == -1 ? this.A03 : this.A04;
    }

    public final int A0P() {
        return this.A01;
    }

    public final long A0Q() {
        return this.A05;
    }

    public final List<Object> A0R() {
        if ((this.A0C & 1024) == 0) {
            if (this.A0A == null || this.A0A.size() == 0) {
                List<Object> list = A0K;
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[2] = "hQ1JLXyYGxOkcwlW4dXhMkD";
                return list;
            }
            List<Object> list2 = this.A0B;
            String[] strArr2 = A0J;
            if (strArr2[0].charAt(4) == strArr2[1].charAt(4)) {
                return list2;
            }
            String[] strArr3 = A0J;
            strArr3[7] = "12FReyGhr0Gy9SAr2o7QhiY2oo1Ever4";
            strArr3[3] = "Q2P3QGMLTw8PDNq5VpeXaAuVADEzryB4";
            return list2;
        }
        return A0K;
    }

    public final void A0S() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0T() {
        if (this.A0A != null) {
            this.A0A.clear();
        }
        this.A0C &= -1025;
        String[] strArr = A0J;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "zfgIUpP6NOwkKkp2713xr48Icx9i2htm";
        strArr2[1] = "7toV51THczyutnu9dsZIYiPQpALa8FIp";
    }

    public final void A0U() {
        this.A0C &= -33;
    }

    public final void A0V() {
        this.A0C &= -257;
    }

    public final void A0W() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0T();
        this.A0E = 0;
        this.A02 = -1;
        C09846g.A0s(this);
    }

    public final void A0X() {
        if (this.A01 == -1) {
            int i10 = this.A03;
            if (A0J[4].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "ZtNXNLZ2mB5tglrdrkplF8NneRyyOdxT";
            strArr[5] = "cQ2wGPgO9l4ITB75rCj9hGEnqQmfMy7J";
            this.A01 = i10;
        }
    }

    public final void A0Y() {
        this.A0F.A0Y(this);
    }

    public final void A0Z(int i10) {
        this.A0C |= i10;
    }

    public final void A0a(int i10, int i11) {
        this.A0C = (this.A0C & (~i11)) | (i10 & i11);
    }

    public final void A0b(QW qw2, boolean z10) {
        this.A0F = qw2;
        this.A0G = z10;
    }

    public final void A0c(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A09();
            this.A0A.add(obj);
            return;
        }
        A0Z(1024);
    }

    public final void A0d(boolean z10) {
        int i10;
        int i11 = this.A0D;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.A0D = i10;
        int i12 = this.A0D;
        if (A0J[2].length() != 23) {
            throw new RuntimeException();
        }
        A0J[2] = "rX8ZXsodik0buiwUD3KFOeS";
        if (i12 < 0) {
            this.A0D = 0;
            Log.e(A08(143, 4, 66), A08(186, 78, 113) + this);
        } else if (!z10 && this.A0D == 1) {
            this.A0C |= 16;
        } else {
            if (!z10 || this.A0D != 0) {
                return;
            }
            this.A0C &= -17;
        }
    }

    public final boolean A0e() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0h() {
        return this.A0F != null;
    }

    public final boolean A0i() {
        return (this.A0C & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean A0j() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0k() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0l() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0m() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0n() {
        if ((this.A0C & 16) == 0) {
            View view = this.A0H;
            String[] strArr = A0J;
            if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[6] = "oGhVpGrwcoPRlkZsrOks4DxLuVnWzLrQ";
            strArr2[5] = "RzFlIrJ9otd57SLzr7ci506FuBBONCMw";
            if (!P3.A0G(view)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0o(int i10) {
        return (this.A0C & i10) != 0;
    }

    public final String toString() {
        String strA08;
        StringBuilder sb2 = new StringBuilder(A08(147, 11, 70) + Integer.toHexString(hashCode()) + A08(46, 10, 14) + this.A03 + A08(0, 4, 21) + this.A05 + A08(126, 9, 58) + this.A01 + A08(135, 8, 1) + this.A04);
        if (A0h()) {
            StringBuilder sbAppend = sb2.append(A08(64, 7, 67));
            boolean z10 = this.A0G;
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[2] = "PPawOVKlLlIRUbnpb4vzMoP";
            if (z10) {
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[4] = "lFbF3LZCiVqyeVLEGjED";
                strA08 = A08(173, 13, 87);
            } else {
                strA08 = A08(158, 15, 80);
            }
            sbAppend.append(strA08);
        }
        if (A0f()) {
            sb2.append(A08(12, 8, 64));
        }
        if (!A0e()) {
            sb2.append(A08(83, 8, 108));
        }
        if (A0k()) {
            sb2.append(A08(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 7, 20));
        }
        if (A0g()) {
            sb2.append(A08(56, 8, 55));
        }
        if (A0l()) {
            sb2.append(A08(4, 8, 104));
        }
        if (A0i()) {
            sb2.append(A08(71, 12, 4));
        }
        if (!A0n()) {
            StringBuilder sb3 = new StringBuilder().append(A08(30, 16, 42)).append(this.A0D).append(A08(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 1, 45));
            sb2.append(sb3.toString());
        }
        if (A0H()) {
            sb2.append(A08(91, 27, 12));
        }
        if (this.A0H.getParent() == null) {
            sb2.append(A08(20, 10, 15));
        }
        sb2.append(A08(288, 1, 48));
        return sb2.toString();
    }
}
