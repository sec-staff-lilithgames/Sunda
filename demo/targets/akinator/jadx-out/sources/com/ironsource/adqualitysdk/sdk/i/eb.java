package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class eb extends ec {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2116 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2117 = 5;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2118 = {GMTDateParser.SECONDS, AbstractJsonLexerKt.UNICODE_ESC, 'p', 'e', 'r', 'E', 'o', ' ', 'x', 'c', 't', 'i', 'n', 'g', GMTDateParser.MINUTES, GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, '.', '(', ')', '<', '>', 'v', 'w', 'y'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2119;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee[] f2120;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee f2121;

    public eb(ee eeVar, String str, List<ee> list, List<ee> list2, Cdo cdo) {
        super(str, list2, cdo);
        this.f2121 = eeVar;
        if (list != null) {
            ee[] eeVarArr = new ee[list.size()];
            this.f2120 = eeVarArr;
            list.toArray(eeVarArr);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List<Class> m2464(ee[] eeVarArr, ds dsVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        int length = eeVarArr.length;
        f2116 = (f2119 + 25) % 128;
        int i10 = 0;
        while (i10 < length) {
            arrayList.add((Class) eeVarArr[i10].m2473(dsVar, cpVar).m2437());
            i10++;
            f2116 = (f2119 + 51) % 128;
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ec
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        eb ebVar = (eb) obj;
        ee eeVar = this.f2121;
        if (eeVar == null ? ebVar.f2121 != null : !eeVar.equals(ebVar.f2121)) {
            return false;
        }
        ee[] eeVarArr = this.f2120;
        ee[] eeVarArr2 = ebVar.f2120;
        if (eeVarArr != null) {
            return eeVarArr.equals(eeVarArr2);
        }
        if (eeVarArr2 == null) {
            f2116 = (f2119 + 3) % 128;
            return true;
        }
        f2119 = (f2116 + 109) % 128;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r0
      0x0029: PHI (r0v11 int) = (r0v4 int), (r0v13 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r0
      0x0022: PHI (r0v5 int) = (r0v4 int), (r0v13 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.eb.f2116
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eb.f2119 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L18
            int r0 = super.hashCode()
            int r0 = r0 << 22
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2121
            if (r2 == 0) goto L29
            goto L22
        L18:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2121
            if (r2 == 0) goto L29
        L22:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f2121
            int r2 = r2.hashCode()
            goto L2a
        L29:
            r2 = r1
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee[] r2 = r4.f2120
            if (r2 == 0) goto L47
            int r1 = com.ironsource.adqualitysdk.sdk.i.eb.f2119
            int r1 = r1 + 23
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.eb.f2116 = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L42
            int r1 = r2.hashCode()
            goto L47
        L42:
            r2.hashCode()
            r0 = 0
            throw r0
        L47:
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eb.hashCode():int");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ec
    public final String toString() {
        int i10 = f2119 + 3;
        f2116 = i10 % 128;
        if (i10 % 2 != 0) {
            return mo2465(m2468());
        }
        mo2465(m2468());
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ec, com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        Method methodM3126;
        List<Object> listM2469 = m2469(dsVar, cpVar);
        ee eeVar = this.f2121;
        if ((eeVar instanceof em) && ((em) eeVar).m2492().equals(m2463(View.MeasureSpec.getSize(0) + 5, (byte) (61 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0001\u0002\u0003\u0004¯").intern())) {
            return cpVar.m2016().m2635().m2637(m2467()).m2365(dsVar, cpVar, listM2469).m2433(false);
        }
        Object objM2437 = this.f2121.m2473(dsVar, cpVar).m2437();
        if (objM2437 instanceof ci) {
            return new du(((ci) objM2437).mo1170(m2467(), listM2469, cpVar.m2004()));
        }
        if (objM2437 instanceof cl) {
            String strM2467 = m2467();
            cpVar.m2004();
            return new du(((cl) objM2437).mo1920(cpVar, strM2467, listM2469, dsVar));
        }
        if (objM2437 instanceof cp) {
            synchronized (objM2437) {
                try {
                    cp cpVar2 = (cp) objM2437;
                    dq dqVarM2013 = cpVar2.m2013(m2467());
                    if (dqVarM2013 != null) {
                        return dqVarM2013.m2365(cpVar2.m2006(), cpVar2, listM2469).m2433(false);
                    }
                    String strM2007 = cpVar.m2007();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2463(23 - (ViewConfiguration.getScrollBarSize() >> 8), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 17), "\t\u0000\u0001\t\u0002\t\b\r\u0004\b\u0000\u000b\f\r\f\b\r\u0004\u000f\u0014\u000b\u00151").intern());
                    sb2.append(m2467());
                    co.m1955(strM2007, sb2.toString(), new NoSuchMethodException());
                } finally {
                }
            }
        }
        try {
            ee[] eeVarArr = this.f2120;
            if (eeVarArr != null) {
                methodM3126 = jz.m3131(objM2437, m2467(), m2464(eeVarArr, dsVar, cpVar));
            } else {
                methodM3126 = jz.m3126(objM2437, m2467(), listM2469);
            }
            if (methodM3126 != null) {
                return new du(methodM3126.invoke(objM2437, listM2469.toArray()));
            }
            listM2469.add(0, objM2437);
            de deVarM2003 = cpVar.m2003();
            String strM24672 = m2467();
            cpVar.m2004();
            return new du(deVarM2003.mo1920(cpVar, strM24672, listM2469, dsVar));
        } catch (IllegalAccessException e10) {
            String strM20072 = cpVar.m2007();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2463(23 - Color.argb(0, 0, 0, 0), (byte) (TextUtils.lastIndexOf("", '0') + 18), "\t\u0000\u0001\t\u0002\t\b\r\u0004\b\u0000\u000b\f\r\f\b\r\u0004\u000f\u0014\u000b\u00151").intern());
            sb3.append(this);
            co.m1955(strM20072, sb3.toString(), e10);
            return null;
        } catch (IllegalArgumentException e11) {
            String strM20073 = cpVar.m2007();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2463(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16), "\t\u0000\u0001\t\u0002\t\b\r\u0004\b\u0000\u000b\f\r\f\b\r\u0004\u000f\u0014\u000b\u00151").intern());
            sb4.append(this);
            co.m1955(strM20073, sb4.toString(), e11);
            return null;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m2462() {
        int i10 = f2116 + 107;
        f2119 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f2120 == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2463(TextUtils.indexOf("", "") + 1, (byte) (15 - TextUtils.indexOf("", "")), "K").intern());
        sb2.append(ee.m2472(this.f2120));
        String strI = com.google.android.gms.internal.play_billing.a.i(m2463((ViewConfiguration.getLongPressTimeout() >> 16) + 1, (byte) (162 - AndroidCharacter.getMirror('0')), "°"), sb2);
        int i11 = f2119 + 75;
        f2116 = i11 % 128;
        if (i11 % 2 != 0) {
            return strI;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2463(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f2118;
                char c10 = f2117;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    h.f2448 = 0;
                    while (true) {
                        int i11 = h.f2448;
                        if (i11 >= i10) {
                            break;
                        }
                        h.f2450 = cArr[i11];
                        h.f2449 = cArr[h.f2448 + 1];
                        if (h.f2450 == h.f2449) {
                            cArr3[h.f2448] = (char) (h.f2450 - b10);
                            cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                        } else {
                            h.f2447 = h.f2450 / c10;
                            h.f2444 = h.f2450 % c10;
                            h.f2446 = h.f2449 / c10;
                            h.f2443 = h.f2449 % c10;
                            if (h.f2444 == h.f2443) {
                                h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                int i12 = (h.f2447 * c10) + h.f2444;
                                int i13 = (h.f2446 * c10) + h.f2443;
                                int i14 = h.f2448;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (h.f2447 == h.f2446) {
                                h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                int i15 = (h.f2447 * c10) + h.f2444;
                                int i16 = (h.f2446 * c10) + h.f2443;
                                int i17 = h.f2448;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (h.f2447 * c10) + h.f2443;
                                int i19 = (h.f2446 * c10) + h.f2444;
                                int i20 = h.f2448;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        h.f2448 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ec
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String mo2465(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2121);
        sb2.append(m2463(1 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (51 - Gravity.getAbsoluteGravity(0, 0)), "a").intern());
        sb2.append(m2467());
        sb2.append(m2462());
        sb2.append(m2463((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, (byte) (65 - Color.argb(0, 0, 0, 0)), "i").intern());
        sb2.append(ee.m2472(objArr));
        String strI = com.google.android.gms.internal.play_billing.a.i(m2463(View.MeasureSpec.getMode(0) + 1, (byte) (99 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u008c"), sb2);
        int i10 = f2116 + 55;
        f2119 = i10 % 128;
        if (i10 % 2 == 0) {
            return strI;
        }
        throw null;
    }
}
