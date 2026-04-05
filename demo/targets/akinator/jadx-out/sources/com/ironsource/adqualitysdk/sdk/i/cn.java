package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cn {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1550 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1551 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static short[] f1552 = null;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static byte[] f1553 = {72, 77, 69, 65, 122, 39, 57, 87, Utf8.REPLACEMENT_BYTE, 93, 61, -1, -7, 10, 1, -13, 9, -44, -50, -33, -42, -61, -33, -38, 0, 0, 0};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1554 = 67;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1555 = 1504678843;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1556 = 967891582;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private List<cp> f1557 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private dn f1558;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private de f1559;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Context f1560;

    /* renamed from: ｋ, reason: contains not printable characters */
    private bb f1561;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private dh f1562;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private bg f1563;

    public cn(Context context, dh dhVar, bb bbVar, de deVar, bg bgVar) {
        this.f1562 = dhVar;
        this.f1561 = bbVar;
        this.f1559 = deVar;
        this.f1563 = bgVar;
        this.f1560 = context.getApplicationContext();
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private synchronized List<cp> m1931() {
        try {
            f1550 = (f1551 + 73) % 128;
            if (this.f1557 == null) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList(this.f1557);
            int i10 = f1550 + 13;
            f1551 = i10 % 128;
            if (i10 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m1932(cn cnVar) {
        int i10 = (f1550 + 93) % 128;
        f1551 = i10;
        List<cp> list = cnVar.f1557;
        int i11 = i10 + 27;
        f1550 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 30 / 0;
        }
        return list;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m1935(dn dnVar) {
        try {
            int i10 = (f1550 + 23) % 128;
            f1551 = i10;
            if (dnVar != null) {
                int i11 = i10 + 83;
                f1550 = i11 % 128;
                if (i11 % 2 == 0) {
                    this.f1558 = dnVar;
                    throw null;
                }
                this.f1558 = dnVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r0 = r0 + 41;
        com.ironsource.adqualitysdk.sdk.i.cn.f1551 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r0 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        return new com.ironsource.adqualitysdk.sdk.i.hr(r4, m1936(r3.f1562.m2233().get(r4.m2358())));
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.hr m1936(com.ironsource.adqualitysdk.sdk.i.dp r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cn.f1550
            int r1 = r0 + 47
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f1551 = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L13
            r1 = 33
            int r1 = r1 / 0
            if (r4 == 0) goto L2f
            goto L15
        L13:
            if (r4 == 0) goto L2f
        L15:
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r3.f1562
            java.util.Map r0 = r0.m2233()
            java.lang.String r1 = r4.m2358()
            java.lang.Object r0 = r0.get(r1)
            com.ironsource.adqualitysdk.sdk.i.dp r0 = (com.ironsource.adqualitysdk.sdk.i.dp) r0
            com.ironsource.adqualitysdk.sdk.i.hr r1 = new com.ironsource.adqualitysdk.sdk.i.hr
            com.ironsource.adqualitysdk.sdk.i.hr r0 = r3.m1936(r0)
            r1.<init>(r4, r0)
            return r1
        L2f:
            int r0 = r0 + 41
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f1551 = r4
            int r0 = r0 % 2
            r4 = 0
            if (r0 == 0) goto L3e
            r0 = 69
            int r0 = r0 / 0
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cn.m1936(com.ironsource.adqualitysdk.sdk.i.dp):com.ironsource.adqualitysdk.sdk.i.hr");
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final Context m1939() {
        int i10 = f1551;
        Context context = this.f1560;
        int i11 = i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1550 = i11 % 128;
        if (i11 % 2 != 0) {
            return context;
        }
        throw null;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final synchronized boolean m1940() {
        boolean zMo1154;
        try {
            int i10 = f1551 + 17;
            f1550 = i10 % 128;
            if (i10 % 2 == 0) {
                zMo1154 = this.f1563.mo1154();
                int i11 = 70 / 0;
            } else {
                zMo1154 = this.f1563.mo1154();
            }
            int i12 = f1550 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f1551 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zMo1154;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final bb m1941() {
        int i10 = (f1551 + 15) % 128;
        f1550 = i10;
        bb bbVar = this.f1561;
        f1551 = (i10 + 115) % 128;
        return bbVar;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final synchronized dn m1942() {
        dn dnVar;
        int i10 = (f1551 + 5) % 128;
        f1550 = i10;
        dnVar = this.f1558;
        f1551 = (i10 + 9) % 128;
        return dnVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final String m1943() {
        f1551 = (f1550 + 27) % 128;
        String strM2236 = this.f1562.m2236();
        f1551 = (f1550 + 79) % 128;
        return strM2236;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String m1944() {
        f1551 = (f1550 + 73) % 128;
        String strM2238 = this.f1562.m2238();
        int i10 = f1551 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1550 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 1 / 0;
        }
        return strM2238;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m1945() {
        f1550 = (f1551 + 45) % 128;
        String strM1167 = this.f1563.m1167();
        int i10 = f1551 + 9;
        f1550 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1167;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m1946() {
        f1550 = (f1551 + 101) % 128;
        String strM1945 = m1945();
        if (TextUtils.isEmpty(strM1945) || m1937((ViewConfiguration.getFadingEdgeLength() >> 16) - 60, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-967891571) - TextUtils.getOffsetAfter("", 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-1504678774) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern().equals(strM1945)) {
            return null;
        }
        f1550 = (f1551 + 95) % 128;
        if (m1937((-59) - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (KeyEvent.getDeadChar(0, 0) + 43), (ViewConfiguration.getWindowTouchSlop() >> 8) - 967891565, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1504678776) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern().equals(strM1945)) {
            return null;
        }
        return this.f1562.m2241(m1945());
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m1947() {
        f1550 = (f1551 + 7) % 128;
        String strMo1165 = this.f1563.mo1165();
        f1551 = (f1550 + 17) % 128;
        return strMo1165;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m1951() {
        int i10 = f1551 + 7;
        f1550 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1562.m2239();
        }
        this.f1562.m2239();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m1953() {
        f1551 = (f1550 + 95) % 128;
        String strM2237 = this.f1562.m2237();
        int i10 = f1551 + 37;
        f1550 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 36 / 0;
        }
        return strM2237;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m1938(dn dnVar) {
        int i10 = f1551 + 77;
        f1550 = i10 % 128;
        int i11 = i10 % 2;
        m1935(dnVar);
        if (i11 == 0) {
            throw null;
        }
        f1550 = (f1551 + 71) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m1948() {
        int i10 = f1551 + 111;
        f1550 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1557.iterator();
            throw null;
        }
        Iterator<cp> it = this.f1557.iterator();
        while (it.hasNext()) {
            it.next().m2002();
        }
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                cn.m1932(cn.this).clear();
            }
        });
        f1551 = (f1550 + 89) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r0
      0x0021: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.dn) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dn), (r0v14 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1949() {
        /*
            r10 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cn.f1550
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f1551 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r10.f1562
            com.ironsource.adqualitysdk.sdk.i.dn r0 = r0.m2234()
            r2 = 38
            int r2 = r2 / r1
            if (r0 == 0) goto L2f
            goto L21
        L19:
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r10.f1562
            com.ironsource.adqualitysdk.sdk.i.dn r0 = r0.m2234()
            if (r0 == 0) goto L2f
        L21:
            r10.m1938(r0)
            com.ironsource.adqualitysdk.sdk.i.bg r2 = r10.f1563
            boolean r2 = r2.mo1156()
            if (r2 == 0) goto L2f
            com.ironsource.adqualitysdk.sdk.i.jq.m3043(r0)
        L2f:
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r10.f1562
            com.ironsource.adqualitysdk.sdk.i.ds r0 = r0.m2235()
            float r2 = android.media.AudioTrack.getMinVolume()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = r2 + (-55)
            int r1 = android.graphics.Color.green(r1)
            int r1 = (-74) - r1
            short r1 = (short) r1
            float r4 = android.view.ViewConfiguration.getScrollFriction()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r4 = -967891583(0xffffffffc64f2581, float:-13257.376)
            int r3 = r3 + r4
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r4 = 1 - r4
            byte r4 = (byte) r4
            long r8 = android.os.SystemClock.uptimeMillis()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = -1504678732(0xffffffffa6506cb4, float:-7.2311817E-16)
            int r6 = r6 - r5
            java.lang.String r1 = m1937(r2, r1, r3, r4, r6)
            java.lang.String r1 = r1.intern()
            com.ironsource.adqualitysdk.sdk.i.bg r2 = r10.f1563
            r0.m2419(r1, r2)
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r10.f1562
            java.util.Map r0 = r0.m2233()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            int r1 = com.ironsource.adqualitysdk.sdk.i.cn.f1551
            int r1 = r1 + 117
            int r1 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cn.f1550 = r1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.ironsource.adqualitysdk.sdk.i.dh r2 = r10.f1562
            java.util.Map r2 = r2.m2233()
            java.lang.Object r1 = r2.get(r1)
            com.ironsource.adqualitysdk.sdk.i.dp r1 = (com.ironsource.adqualitysdk.sdk.i.dp) r1
            boolean r2 = r1.m2361()
            if (r2 != 0) goto Lbd
            com.ironsource.adqualitysdk.sdk.i.hr r7 = r10.m1936(r1)
            com.ironsource.adqualitysdk.sdk.i.cp r3 = new com.ironsource.adqualitysdk.sdk.i.cp
            com.ironsource.adqualitysdk.sdk.i.de r5 = r10.f1559
            com.ironsource.adqualitysdk.sdk.i.bg r6 = r10.f1563
            com.ironsource.adqualitysdk.sdk.i.dh r1 = r10.f1562
            com.ironsource.adqualitysdk.sdk.i.ds r8 = r1.m2235()
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r10.m1934(r3)
            goto L7f
        Lbd:
            r4 = r10
            goto L7f
        Lbf:
            r4 = r10
            com.ironsource.adqualitysdk.sdk.i.dh r0 = r4.f1562
            com.ironsource.adqualitysdk.sdk.i.bg r1 = r4.f1563
            r10.m1933(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cn.m1949():void");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m1952(String str, List<Object> list) {
        Iterator<cp> it;
        int i10 = f1550 + 95;
        f1551 = i10 % 128;
        if (i10 % 2 != 0) {
            it = m1931().iterator();
            int i11 = 24 / 0;
        } else {
            it = m1931().iterator();
        }
        while (it.hasNext()) {
            f1551 = (f1550 + 95) % 128;
            it.next().m2009(str, list);
            f1550 = (f1551 + 15) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1937(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1554;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1553;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1556 + i11] + i13);
                    } else {
                        i14 = (short) (f1552[f1556 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f1556 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f1555);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f1553;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f1552;
                            int i17 = n.f3165;
                            n.f3165 = i17 - 1;
                            n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                        }
                        sb2.append(n.f3162);
                        n.f3161 = n.f3162;
                        n.f3164++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m1950() {
        int i10 = f1550 + 81;
        f1551 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1562.m2240();
            throw null;
        }
        String strM2240 = this.f1562.m2240();
        f1551 = (f1550 + 31) % 128;
        return strM2240;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m1933(dh dhVar, bg bgVar) {
        try {
            if (bgVar.mo1154()) {
                f1550 = (f1551 + 99) % 128;
                for (cp cpVar : m1931()) {
                    dhVar.m2235().m2422().m2419(cpVar.m2016().m2636(), cpVar);
                }
            }
            f1550 = (f1551 + 93) % 128;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m1934(cp cpVar) {
        f1550 = (f1551 + 47) % 128;
        this.f1557.add(cpVar);
        f1551 = (f1550 + 87) % 128;
    }
}
