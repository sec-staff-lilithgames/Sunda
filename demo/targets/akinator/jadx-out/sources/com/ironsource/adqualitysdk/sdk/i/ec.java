package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ec extends ee {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2122 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2123;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2124 = {23826, 44132, 49139, 'S', 61735, 58022, 54384, '(', ')'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2125 = -7410242619478052491L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee[] f2126;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2127;

    public ec(String str, List<ee> list, Cdo cdo) {
        super(cdo);
        this.f2127 = dy.m2458(str);
        ee[] eeVarArr = new ee[list.size()];
        this.f2126 = eeVarArr;
        list.toArray(eeVarArr);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2466(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2124[i11 + i12] ^ (i12 * f2125)) ^ c10);
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

    public boolean equals(Object obj) {
        f2122 = (f2123 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        if (this.f2127.equals(ecVar.f2127)) {
            return Arrays.equals(this.f2126, ecVar.f2126);
        }
        int i10 = (f2122 + 1) % 128;
        f2123 = i10;
        int i11 = i10 + 61;
        f2122 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 82 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str = this.f2127;
        if (str != null) {
            iHashCode = str.hashCode();
            f2122 = (f2123 + 9) % 128;
        } else {
            f2122 = (f2123 + 7) % 128;
            iHashCode = 0;
        }
        return Arrays.hashCode(this.f2126) + (iHashCode * 31);
    }

    public String toString() {
        f2123 = (f2122 + 9) % 128;
        String strMo2465 = mo2465(this.f2126);
        f2122 = (f2123 + 41) % 128;
        return strMo2465;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m2467() {
        int i10 = f2122 + 25;
        f2123 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f2127;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ee[] m2468() {
        int i10 = (f2122 + 75) % 128;
        f2123 = i10;
        ee[] eeVarArr = this.f2126;
        f2122 = (i10 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return eeVarArr;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<Object> m2469(ds dsVar, cp cpVar) {
        ArrayList arrayList = new ArrayList();
        ee[] eeVarArr = this.f2126;
        f2122 = (f2123 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        for (ee eeVar : eeVarArr) {
            f2123 = (f2122 + 103) % 128;
            arrayList.add(eeVar.m2473(dsVar, cpVar).m2437());
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public du mo2440(ds dsVar, cp cpVar) {
        f2122 = (f2123 + 75) % 128;
        List<Object> listM2469 = m2469(dsVar, cpVar);
        if (m2467().equals(m2466((char) (23934 - (ViewConfiguration.getTapTimeout() >> 16)), Drawable.resolveOpacity(0, 0) + 3, (-1) - ExpandableListView.getPackedPositionChild(0L)).intern())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2466((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 2 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb2.append(cpVar.m2007());
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(listM2469.get(0));
            k.m3147(string, sb3.toString());
            return new du(null);
        }
        try {
            du duVar = new du(((dq) dsVar.m2420(m2467())).m2365(dsVar, cpVar, listM2469));
            int i10 = f2122 + 27;
            f2123 = i10 % 128;
            if (i10 % 2 == 0) {
                return duVar;
            }
            throw null;
        } catch (Exception unused) {
            if (cpVar.m2016().m2637(m2467()) != null) {
                return cpVar.m2016().m2637(m2467()).m2365(dsVar, cpVar, listM2469).m2433(false);
            }
            de deVarM2003 = cpVar.m2003();
            String strM2467 = m2467();
            cpVar.m2004();
            return new du(deVarM2003.mo1920(cpVar, strM2467, listM2469, dsVar));
        }
    }

    /* renamed from: ﻛ */
    public String mo2465(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2127);
        sb2.append(m2466((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 1, 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
        sb2.append(ee.m2472(objArr));
        String strI = com.google.android.gms.internal.play_billing.a.i(m2466((char) (Process.myTid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 1, 8 - (ViewConfiguration.getJumpTapTimeout() >> 16)), sb2);
        int i10 = f2123 + 27;
        f2122 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 13 / 0;
        }
        return strI;
    }
}
