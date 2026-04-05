package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class eg extends ee {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2145 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2146 = 57;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2147;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee f2148;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee f2149;

    public eg(ee eeVar, ee eeVar2, Cdo cdo) {
        super(cdo);
        this.f2149 = eeVar;
        this.f2148 = eeVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0.equals(r5.f2149) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r5.f2149 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r0 = r4.f2148;
        r5 = r5.f2148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return r0.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.eg.f2147 = (com.ironsource.adqualitysdk.sdk.i.eg.f2145 + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.eg.f2147
            int r0 = r0 + 69
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f2145 = r0
            r1 = 1
            if (r4 != r5) goto Lc
            return r1
        Lc:
            r2 = 0
            if (r5 == 0) goto L52
            int r0 = r0 + 91
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f2147 = r0
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r0 == r3) goto L20
            goto L52
        L20:
            com.ironsource.adqualitysdk.sdk.i.eg r5 = (com.ironsource.adqualitysdk.sdk.i.eg) r5
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f2149
            if (r0 == 0) goto L37
            int r3 = com.ironsource.adqualitysdk.sdk.i.eg.f2147
            int r3 = r3 + 39
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f2145 = r3
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f2149
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3c
            goto L3b
        L37:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r5.f2149
            if (r0 == 0) goto L3c
        L3b:
            return r2
        L3c:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f2148
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r5.f2148
            if (r0 == 0) goto L47
            boolean r5 = r0.equals(r5)
            return r5
        L47:
            if (r5 != 0) goto L52
            int r5 = com.ironsource.adqualitysdk.sdk.i.eg.f2145
            int r5 = r5 + 73
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.eg.f2147 = r5
            return r1
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.eg.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f2145 + 81;
        f2147 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        ee eeVar = this.f2149;
        int iHashCode = 0;
        int iHashCode2 = (eeVar != null ? eeVar.hashCode() : 0) * 31;
        ee eeVar2 = this.f2148;
        if (eeVar2 != null) {
            iHashCode = eeVar2.hashCode();
            f2145 = (f2147 + 89) % 128;
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2149);
        sb2.append(m2477(TextUtils.indexOf("", "", 0) + 89, -ExpandableListView.getPackedPositionChild(0L), "\u0000", -ExpandableListView.getPackedPositionChild(0L), false).intern());
        sb2.append(mo2479());
        sb2.append(m2477(88 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 1, "\u0000", Gravity.getAbsoluteGravity(0, 0) + 1, false).intern());
        sb2.append(this.f2148);
        String string = sb2.toString();
        f2145 = (f2147 + 47) % 128;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ee m2478() {
        int i10 = f2147 + 91;
        f2145 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2148;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo2479();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ee m2480() {
        int i10 = (f2147 + 27) % 128;
        f2145 = i10;
        ee eeVar = this.f2149;
        int i11 = i10 + 73;
        f2147 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 8 / 0;
        }
        return eeVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2477(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2146);
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
}
