package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class au {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f614 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f616 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<String> f619;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private d f620;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f621;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f618 = {22808, 32415, 5640, 12183, 'v', 10212, 30865, 24332, 14230, 3598, 59044, 48447, 'e', 10226, 20341, 30461, 40540, 'n', 10239, 20344, 30450, 'C', 10213, 20346, 30448, 40525, 50641, 60744, 5289, 15394, 25502, 35597, 45725, 55833, 608, 10720, 20851, 30947, 41029, 51162, 61272, 5793, 15925, 'E', 10232, 20326, 30449, 40538, 50578, 60757, 5288, 15472, 25513, 35596, 45697, 55821, 622, 10728, 20818, 30921, 41049, 51157, 61276, 5796, 15927};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f617 = -1689655379036723318L;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f615 = 97;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.au$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: ﾇ, reason: contains not printable characters */
        static final /* synthetic */ int[] f622;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f622 = iArr;
            try {
                iArr[d.f632.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f622[d.f630.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f622[d.f631.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f622[d.f633.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        f632,
        f633,
        f631,
        f630;


        /* renamed from: ﮉ, reason: contains not printable characters */
        private static int f623 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f624;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f625;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f626;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f627;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f628;

        static {
            m921();
            f628 = (f623 + 21) % 128;
        }

        public static d valueOf(String str) {
            f628 = (f623 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i10 = f628 + 61;
            f623 = i10 % 128;
            if (i10 % 2 != 0) {
                return dVar;
            }
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f628 = (f623 + 91) % 128;
            d[] dVarArr = (d[]) values().clone();
            int i10 = f628 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f623 = i10 % 128;
            if (i10 % 2 != 0) {
                return dVarArr;
            }
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m920(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (o.f3166) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3167 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3167;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f624)) ^ ((c11 >>> 5) + f626)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f627) ^ ((c12 + i12) ^ ((c12 << 4) + f625))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3167;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3167 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static void m921() {
            f624 = (char) 53151;
            f627 = (char) 48610;
            f626 = (char) 36980;
            f625 = (char) 709;
        }
    }

    public au(JSONObject jSONObject) {
        this.f620 = m913(jSONObject.optString(m914((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22892), 4 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.getOffsetBefore("", 0)).intern()));
        this.f619 = m917(jSONObject.optString(m914((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 2, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3).intern()));
        this.f621 = m915(jSONObject.optString(m914((char) (30947 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.getDefaultSize(0, 0) + 6, View.combineMeasuredStates(0, 0) + 6).intern()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.ironsource.adqualitysdk.sdk.i.au.d m913(java.lang.String r10) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.au.f614
            int r0 = r0 + 119
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.au.f616 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 96946943(0x5c74aff, float:1.8741419E-35)
            r4 = 93621297(0x5948c31, float:1.3969351E-35)
            r5 = 92611485(0x585239d, float:1.2520342E-35)
            java.lang.String r6 = ""
            r7 = -1
            r8 = 0
            if (r0 != 0) goto L29
            int r0 = r10.hashCode()
            r9 = 83
            int r9 = r9 / r8
            if (r0 == r5) goto L86
            if (r0 == r4) goto L58
            if (r0 == r3) goto L35
            goto Lb9
        L29:
            int r0 = r10.hashCode()
            if (r0 == r5) goto L86
            if (r0 == r4) goto L58
            if (r0 == r3) goto L35
            goto Lb9
        L35:
            int r0 = android.text.TextUtils.indexOf(r6, r6, r8)
            char r0 = (char) r0
            int r3 = android.text.TextUtils.getOffsetBefore(r6, r8)
            int r3 = r3 + 5
            int r4 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r4 = r4 >> 16
            int r4 = 12 - r4
            java.lang.String r0 = m914(r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto Lb9
            r7 = r8
            goto Lb9
        L58:
            r0 = 48
            int r3 = android.text.TextUtils.lastIndexOf(r6, r0, r8, r8)
            int r3 = 203 - r3
            int r0 = android.text.TextUtils.indexOf(r6, r0)
            int r0 = r0 + 6
            int r4 = android.view.KeyEvent.getDeadChar(r8, r8)
            int r4 = 2 - r4
            java.lang.String r5 = "\u0004\f\ufff7\ufffa\u0001"
            java.lang.String r0 = m916(r3, r0, r5, r4, r8)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto Lb9
            int r10 = com.ironsource.adqualitysdk.sdk.i.au.f614
            int r10 = r10 + 9
            int r10 = r10 % 128
            com.ironsource.adqualitysdk.sdk.i.au.f616 = r10
            r7 = r1
            goto Lb9
        L86:
            long r3 = android.os.Process.getElapsedCpuTime()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r0 = 203 - r0
            int r3 = android.view.ViewConfiguration.getTouchSlop()
            int r3 = r3 >> 8
            int r3 = 5 - r3
            int r4 = android.os.Process.myPid()
            int r4 = r4 >> 22
            int r4 = r4 + 3
            java.lang.String r5 = "\u0006\r￼\ufff8\ufff9"
            java.lang.String r0 = m916(r0, r3, r5, r4, r8)
            java.lang.String r0 = r0.intern()
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto Lb9
            int r10 = com.ironsource.adqualitysdk.sdk.i.au.f616
            int r10 = r10 + 7
            int r10 = r10 % 128
            com.ironsource.adqualitysdk.sdk.i.au.f614 = r10
            r7 = r2
        Lb9:
            if (r7 == 0) goto Lc8
            if (r7 == r2) goto Lc5
            if (r7 == r1) goto Lc2
            com.ironsource.adqualitysdk.sdk.i.au$d r10 = com.ironsource.adqualitysdk.sdk.i.au.d.f632
            return r10
        Lc2:
            com.ironsource.adqualitysdk.sdk.i.au$d r10 = com.ironsource.adqualitysdk.sdk.i.au.d.f631
            return r10
        Lc5:
            com.ironsource.adqualitysdk.sdk.i.au$d r10 = com.ironsource.adqualitysdk.sdk.i.au.d.f633
            return r10
        Lc8:
            com.ironsource.adqualitysdk.sdk.i.au$d r10 = com.ironsource.adqualitysdk.sdk.i.au.d.f630
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.au.m913(java.lang.String):com.ironsource.adqualitysdk.sdk.i.au$d");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m915(String str) {
        f614 = (f616 + 7) % 128;
        if (!TextUtils.isEmpty(str)) {
            f614 = (f616 + 51) % 128;
            if (!str.equals(m914((char) ((-1) - TextUtils.lastIndexOf("", '0')), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 18).intern())) {
                return str;
            }
        }
        f616 = (f614 + 43) % 128;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> m917(String str) {
        List<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            f614 = (f616 + 3) % 128;
            arrayList = Arrays.asList(str.split(m916(141 - View.MeasureSpec.getSize(0), 1 - View.resolveSize(0, 0), "\u0000", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), true).intern()));
        }
        f616 = (f614 + 53) % 128;
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m918(String str) {
        int i10;
        try {
            i10 = AnonymousClass4.f622[this.f620.ordinal()];
        } catch (Exception e10) {
            kd.m3203(m914((char) View.getDefaultSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 21 - Drawable.resolveOpacity(0, 0)).intern(), m914((char) View.combineMeasuredStates(0, 0), 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 43).intern(), e10, false);
        }
        if (i10 == 1) {
            f616 = (f614 + 3) % 128;
            return true;
        }
        if (i10 == 2) {
            boolean zContains = this.f619.contains(str);
            int i11 = f614 + 115;
            f616 = i11 % 128;
            if (i11 % 2 != 0) {
                return zContains;
            }
            throw null;
        }
        if (i10 != 3) {
            if (i10 != 4) {
            }
            return false;
        }
        if (this.f619.size() > 0) {
            return ka.m3158(str, this.f619.get(0)) < 0;
        }
        if (this.f619.size() > 0) {
            if (ka.m3158(str, this.f619.get(0)) < 0) {
                f616 = (f614 + 87) % 128;
                return false;
            }
            int i12 = f616 + 49;
            f614 = i12 % 128;
            return i12 % 2 == 0;
        }
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m916(int i10, int i11, String str, int i12, boolean z10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (e.f2108) {
            try {
                char[] cArr2 = new char[i11];
                e.f2107 = 0;
                while (true) {
                    int i13 = e.f2107;
                    if (i13 >= i11) {
                        break;
                    }
                    e.f2110 = cArr[i13];
                    cArr2[e.f2107] = (char) (e.f2110 + i10);
                    int i14 = e.f2107;
                    cArr2[i14] = (char) (cArr2[i14] - f615);
                    e.f2107 = i14 + 1;
                }
                if (i12 > 0) {
                    e.f2109 = i12;
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr2, 0, cArr3, 0, i11);
                    int i15 = e.f2109;
                    System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                    int i16 = e.f2109;
                    System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i17 = e.f2107;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i11 - i17) - 1];
                        e.f2107 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m919() {
        int i10 = f614;
        String str = this.f621;
        f616 = (i10 + 103) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m914(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f618[i11 + i12] ^ (i12 * f617)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
