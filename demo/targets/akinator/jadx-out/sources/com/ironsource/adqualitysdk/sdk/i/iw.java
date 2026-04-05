package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.ja;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class iw {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2793 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2794 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2795;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String f2796;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f2797;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private iy f2798;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private jb f2799;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2800 = new ArrayList();

    static {
        m2863();
        f2796 = m2861(Color.blue(0) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 69, "\u0015ￔ\ufff7\u0019ￗ\u001d\uffd8\u000b\fￜ%\u001b\u000f\f\t\f\u001a\u001b%ￜ\f\n\u001c\u0019\u0010\ufffb \u0010\ufff5\u001b\uffef\f\ufffe\u0016\u0019\u0013\u000bￒￔￋￗ\ufff6\u0014\u0013ￛￎ\u001a\u0013\ufff6\u0015￠\ufff2\uffdd ￛ￩\f\uffde\uffde\f\u0019ￚ\u0015\n\u0019 \u0017\u001b\uffd8ￗ", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40, false).intern();
        int i10 = f2795 + 5;
        f2794 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public iw(Context context, iy iyVar, String str) {
        this.f2799 = new jb(context, m2861(Color.red(0) + 141, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, "\u000e\u0013\u0004\u0003\u0001\u0013\u0011\u0000\u0002\u0004\u0001\u0000\u0002\nￍ\n\u0015ￍ\u0003\u0001ￍ\u0011\u0004\f", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, false).intern(), m2861((ViewConfiguration.getTouchSlop() >> 8) + 140, 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0013\u0002\u0004ￔￍ\u0014\u0005\u0012\u0003\u0005\u0013ￍ\u0001\f\r\u000f\u000f", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), true).intern());
        this.f2798 = iyVar;
        this.f2797 = str;
        aq.m814().mo843(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.2
            @Override // com.ironsource.adqualitysdk.sdk.i.at
            /* renamed from: ﾇ */
            public final void mo667() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(iw.m2862(iw.this));
                    iw.m2862(iw.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m2863() {
        f2793 = 44;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ iy m2864(iw iwVar) {
        int i10 = f2794;
        f2795 = (i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        iy iyVar = iwVar.f2798;
        f2795 = (i10 + 43) % 128;
        return iyVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized String m2866() {
        String str;
        int i10 = (f2794 + 59) % 128;
        f2795 = i10;
        str = this.f2797;
        int i11 = i10 + 41;
        f2794 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2867() {
        int i10 = f2794;
        String str = f2796;
        int i11 = i10 + 15;
        f2795 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 74 / 0;
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ jb m2868(iw iwVar) {
        int i10 = (f2794 + 81) % 128;
        f2795 = i10;
        jb jbVar = iwVar.f2799;
        f2794 = (i10 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return jbVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m2862(iw iwVar) {
        int i10 = f2794 + 61;
        int i11 = i10 % 128;
        f2795 = i11;
        int i12 = i10 % 2;
        List<Runnable> list = iwVar.f2800;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 25;
        f2794 = i13 % 128;
        if (i13 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2865(final ja jaVar, final il ilVar) {
        String strMo2909 = jaVar.mo2909();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2866());
        final String strK = com.google.android.gms.internal.play_billing.a.k(sb2, m2861(View.MeasureSpec.getMode(0) + 91, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, true), strMo2909);
        final String strM2911 = jaVar.m2911();
        if (aq.m814().mo847()) {
            int i10 = f2794 + 95;
            f2795 = i10 % 128;
            if (i10 % 2 != 0) {
                aq.m814().mo840();
                throw null;
            }
            if (aq.m814().mo840() || this.f2799.m2921(strM2911) == null) {
                jv.m3091(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f2804 = 0;

                    /* renamed from: ﻏ, reason: contains not printable characters */
                    private static int f2805 = 1;

                    /* renamed from: ﱡ, reason: contains not printable characters */
                    private static char[] f2803 = {'U', 51510, 37607, 23662, 9671, 61114, 47127, 33162, 42043, 28009, 14030, 63529, 33161, 19189, 7283, 9704, 57066, 6062, 19463, 33523, 64323, 12327, 26244, 24328, 38370, 51715, 815, 31117, 44640, 58598, 56646, 4642, 18654, 33149, 63430, 11454, 25895, 23495, ' ', 51462, 37541, 23617, 9696, 61080, 47159, 33197, 19291, 5293, 56731, 42809, 28874, 14912, 1002, 52354, 38452, 24469, 10617, 61975, 48005, 34107, 20189, 18275, 36365, 54714, 6918, 39185, 20547, 3052, 50452, 48306, 30605, 8557, 6386, 53768, 36269, 17615, 15981, 59791, 41813, 39584, 21978, 3945, 50830, 45114, 27470, 8848, 7246, 55182, 33077, 30789, 13287, 60785, 42195, 40510, 18775, 237, 64002, 46548, 'e', 51467, 37545, 15798, 62668, 43826, 25157, 14823, 63258};

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static long f2802 = -7925279194686895771L;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private void m2875(final ja jaVar2, final il ilVar2) {
                        iw.m2864(iw.this).m2895().m2854(new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.iq
                            /* renamed from: ﻛ */
                            public final void mo765() {
                                iw.m2864(iw.this).m2895().m2857(this);
                                iw.m2869(iw.this, jaVar2, ilVar2);
                            }
                        });
                        f2805 = (f2804 + 39) % 128;
                    }

                    /* renamed from: ｋ, reason: contains not printable characters */
                    private static String m2876(String str) throws JSONException {
                        JSONObject jSONObject = new JSONObject(str);
                        String strOptString = jSONObject.optString(m2874((char) View.getDefaultSize(0, 0), (-16777213) - Color.rgb(0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98).intern());
                        if (TextUtils.isEmpty(strOptString)) {
                            int i11 = f2804 + 53;
                            f2805 = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 74 / 0;
                            }
                            return str;
                        }
                        String strM3086 = jv.m3086(strOptString, iw.m2867(), jSONObject.optString(m2874((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 15839), 1 - TextUtils.lastIndexOf("", '0'), View.combineMeasuredStates(0, 0) + 101).intern()), jSONObject.optString(m2874((char) (43840 - MotionEvent.axisFromString("")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, TextUtils.lastIndexOf("", '0', 0, 0) + 104).intern()));
                        f2805 = (f2804 + 65) % 128;
                        return strM3086;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        int i11 = f2804 + 39;
                        f2805 = i11 % 128;
                        if (i11 % 2 == 0) {
                            m2873(strK, jaVar, strM2911, ilVar);
                            throw null;
                        }
                        m2873(strK, jaVar, strM2911, ilVar);
                        f2804 = (f2805 + 43) % 128;
                    }

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private void m2873(String str, ja jaVar2, String str2, il ilVar2) {
                        if (!iw.m2864(iw.this).m2895().m2855()) {
                            int i11 = f2804 + 75;
                            f2805 = i11 % 128;
                            if (i11 % 2 == 0) {
                                m2875(jaVar2, ilVar2);
                                int i12 = 48 / 0;
                            } else {
                                m2875(jaVar2, ilVar2);
                            }
                            int i13 = f2805 + 105;
                            f2804 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 61 / 0;
                                return;
                            }
                            return;
                        }
                        try {
                            ir irVarM2888 = ix.m2888(str);
                            if (irVarM2888 == null || irVarM2888.m2841().m2842() != 200) {
                                if (!iw.m2864(iw.this).m2895().m2855()) {
                                    m2875(jaVar2, ilVar2);
                                    return;
                                } else {
                                    if ((irVarM2888.m2841().m2842() == 403 || irVarM2888.m2841().m2842() == 404) && str.contains(m2874((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18182), (Process.myTid() >> 22) + 4, ((byte) KeyEvent.getModifierMetaStateMask()) + 62).intern())) {
                                        jaVar2.m2910();
                                        iw.this.m2872(jaVar2, ilVar2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            f2804 = (f2805 + 89) % 128;
                            String strM2876 = m2876(ix.m2877(irVarM2888));
                            if (Charset.forName(m2874((char) Gravity.getAbsoluteGravity(0, 0), 8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern()).newEncoder().canEncode(strM2876)) {
                                if (TextUtils.isEmpty(strM2876)) {
                                    return;
                                }
                                iw.m2868(iw.this).m2929(str2, strM2876);
                                p.m3253(new iu(str2, strM2876) { // from class: com.ironsource.adqualitysdk.sdk.i.iw.3.4

                                    /* renamed from: ﾒ, reason: contains not printable characters */
                                    private /* synthetic */ String f2815;

                                    {
                                        this.f2815 = strM2876;
                                    }

                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* renamed from: ﻐ */
                                    public final void mo590() {
                                        this.f2814.mo1008(this.f2815);
                                    }
                                });
                                return;
                            }
                            String strIntern = m2874((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42088), 8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf("", "") + 8).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m2874((char) (57006 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, 16 - TextUtils.getCapsMode("", 0, 0)).intern());
                            sb3.append(str);
                            sb3.append(m2874((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, View.resolveSize(0, 0) + 38).intern());
                            kd.m3203(strIntern, sb3.toString(), null, false);
                        } catch (Exception e10) {
                            if (iw.m2864(iw.this).m2895().m2855()) {
                                kd.m3203(m2874((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42089), 8 - KeyEvent.getDeadChar(0, 0), 7 - TextUtils.lastIndexOf("", '0')).intern(), com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2874((char) (39252 - (ViewConfiguration.getLongPressTimeout() >> 16)), 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 65), str), e10, false);
                            } else {
                                m2875(jaVar2, ilVar2);
                            }
                        }
                    }

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static String m2874(char c10, int i11, int i12) {
                        String str;
                        synchronized (c.f1373) {
                            try {
                                char[] cArr = new char[i11];
                                c.f1374 = 0;
                                while (true) {
                                    int i13 = c.f1374;
                                    if (i13 < i11) {
                                        cArr[i13] = (char) ((f2803[i12 + i13] ^ (i13 * f2802)) ^ c10);
                                        c.f1374 = i13 + 1;
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
                });
            }
        }
        f2795 = (f2794 + 69) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2869(iw iwVar, ja jaVar, il ilVar) {
        int i10 = f2794 + 35;
        f2795 = i10 % 128;
        int i11 = i10 % 2;
        iwVar.m2865(jaVar, ilVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m2870(String str, String str2, il ilVar) {
        ja.c cVar = new ja.c(str, str2);
        if (aq.m814().mo827().m812()) {
            int i10 = f2794 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f2795 = i10 % 128;
            if (i10 % 2 != 0) {
                TextUtils.isEmpty(aq.m814().mo827().m811(str));
                throw null;
            }
            String strM811 = aq.m814().mo827().m811(str);
            if (TextUtils.isEmpty(strM811)) {
                int i11 = f2794 + 99;
                f2795 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            cVar = new ja.b(str, str2, strM811);
        }
        return m2872(cVar, ilVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2861(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2793);
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m2872(final ja jaVar, final il ilVar) {
        boolean z10;
        if (TextUtils.isEmpty(jaVar.m2912()) || TextUtils.isEmpty(jaVar.m2908())) {
            return null;
        }
        String strM2911 = jaVar.m2911();
        synchronized (this) {
            try {
                if (aq.m814().mo830()) {
                    z10 = true;
                } else {
                    this.f2800.add(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iw.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            iw.m2869(iw.this, jaVar, ilVar);
                        }
                    });
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            m2865(jaVar, ilVar);
        }
        return this.f2799.m2921(strM2911);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2871(ja jaVar) {
        int i10 = f2795 + 49;
        f2794 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 57 / 0;
            if (this.f2799.m2921(jaVar.m2911()) != null) {
                return true;
            }
        } else {
            if (this.f2799.m2921(jaVar.m2911()) != null) {
                return true;
            }
        }
        f2795 = (f2794 + 37) % 128;
        return false;
    }
}
