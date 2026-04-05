package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class ae {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f340 = 0;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f341 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static short[] f345 = null;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f347 = -55440258;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f349 = 26;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f350 = 2090261893;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private int f351;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Boolean f352 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f353;

    /* renamed from: ｋ, reason: contains not printable characters */
    private long f354;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private long f355;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private long f356;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f348 = {13, -21, 17, -5, -1, -3, 10, 5, -11, -11, 38, -29, 3, 12, -19, 1, 14, -8, 4, 21, -1, -1, 1, 0, 0, 0, 0};

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f343 = 55973;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f342 = 54129;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f344 = 39008;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f346 = 1073;

    public ae(int i10) {
        this.f351 = i10;
        aq.m814().mo843(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f357 = 0;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f358 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static long f359 = -6440169920918320696L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m666(String str, int i11) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (i.f2622) {
                    try {
                        char[] cArrM2781 = i.m2781(f359, cArr, i11);
                        i.f2623 = 4;
                        while (true) {
                            int i12 = i.f2623;
                            if (i12 < cArrM2781.length) {
                                i.f2624 = i12 - 4;
                                cArrM2781[i12] = (char) ((cArrM2781[i12] ^ cArrM2781[i12 % 4]) ^ (r2 * f359));
                                i.f2623 = i12 + 1;
                            } else {
                                str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.at
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo667() {
                f358 = (f357 + 5) % 128;
                ar arVarMo828 = aq.m814().mo828();
                long jM888 = arVarMo828.m888();
                if (jM888 == 0) {
                    ae.m660(ae.this, Boolean.FALSE);
                    jM888 = arVarMo828.m889();
                    kd.m3203(m666("䠲쎫訸䡦\uea21쨊駅\uf71c潡\uf337냩긴\u0602鯰\ueb91臗㴱볫ʺ磶퓜斊㩒厜诠", ExpandableListView.getPackedPositionGroup(0L)).intern(), m666("닥᭑덄늠ꆳያꂦ버閷⮙覝\ue5a5ﲅ䌾틱쩟쟱搐㯚㍬⹅뵪̱᠙焳활搆䅫塑\uefb0䵹\ua9ceꍶ\u008d陕軦讕", KeyEvent.normalizeMetaState(0)).intern(), null, false);
                } else {
                    ae.m660(ae.this, Boolean.TRUE);
                    f358 = (f357 + 95) % 128;
                }
                ae.m659(ae.this, arVarMo828.m886());
                ae.m662(ae.this, arVarMo828.m889());
                ae aeVar = ae.this;
                ae.m655(aeVar, jM888 - ae.m658(aeVar));
                ae aeVar2 = ae.this;
                ae.m652(aeVar2, jM888 - ae.m654(aeVar2));
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m652(ae aeVar, long j10) {
        int i10 = (f340 + 7) % 128;
        f341 = i10;
        aeVar.f355 = j10;
        int i11 = i10 + 5;
        f340 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 31 / 0;
        }
        return j10;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m654(ae aeVar) {
        int i10 = f341 + 15;
        f340 = i10 % 128;
        if (i10 % 2 == 0) {
            return aeVar.f354;
        }
        long j10 = aeVar.f354;
        int i11 = 60 / 0;
        return j10;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m658(ae aeVar) {
        int i10 = f341 + 59;
        f340 = i10 % 128;
        if (i10 % 2 == 0) {
            return aeVar.f353;
        }
        long j10 = aeVar.f353;
        int i11 = 74 / 0;
        return j10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m662(ae aeVar, long j10) {
        int i10 = f341 + 95;
        f340 = i10 % 128;
        int i11 = i10 % 2;
        aeVar.f354 = j10;
        if (i11 != 0) {
            int i12 = 57 / 0;
        }
        return j10;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m665(JSONObject jSONObject) {
        int i10 = f340 + 5;
        f341 = i10 % 128;
        if (i10 % 2 == 0) {
            m653(jSONObject);
            throw null;
        }
        if (!m653(jSONObject) && this.f352 != null) {
            try {
                m661(jSONObject);
                return true;
            } catch (Exception e10) {
                kd.m3203(m663((-5) - (Process.myTid() >> 22), (short) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55440257, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 2090261810).intern(), m651("邐岹牨郦萁⃒Ϋ帲뛴浭僧韼癈忌▔忏슉㺆容ᒏ\ue483ꩋ艃狆\ue633唈", 26 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), e10, false);
            }
        }
        int i11 = f340 + 107;
        f341 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m653(JSONObject jSONObject) {
        f341 = (f340 + 55) % 128;
        if (!jSONObject.has(m651("㠪ಞ워\uea76", 2 - TextUtils.indexOf((CharSequence) "", '0')).intern()) && !jSONObject.has(m651("驲ᾘ워\uea76", 3 - View.getDefaultSize(0, 0)).intern())) {
            return false;
        }
        int i10 = f341 + 69;
        f340 = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m655(ae aeVar, long j10) {
        int i10 = f341 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i11 = i10 % 128;
        f340 = i11;
        int i12 = i10 % 2;
        aeVar.f356 = j10;
        if (i12 != 0) {
            int i13 = 62 / 0;
        }
        int i14 = i11 + 43;
        f341 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 61 / 0;
        }
        return j10;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m659(ae aeVar, long j10) {
        int i10 = f340;
        int i11 = i10 + 115;
        f341 = i11 % 128;
        int i12 = i11 % 2;
        aeVar.f353 = j10;
        if (i12 == 0) {
            int i13 = 79 / 0;
        }
        f341 = (i10 + 79) % 128;
        return j10;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m664(JSONObject jSONObject, boolean z10) throws JSONException {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m651("袑\uf46e얍틠墫\u038d각筻茵ꏚ", 9 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (z10) {
                    f341 = (f340 + 105) % 128;
                    long jOptLong = jSONObjectOptJSONObject.optLong(m663(Color.green(0) - 25, (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 55440281 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (Process.myPid() >> 22) - 2090261776).intern());
                    if (jOptLong > 0) {
                        int i10 = f341 + 41;
                        f340 = i10 % 128;
                        lValueOf = i10 % 2 != 0 ? Long.valueOf(jOptLong - this.f356) : Long.valueOf(jOptLong + this.f356);
                    }
                    f340 = (f341 + 79) % 128;
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(m651("\ue633唈", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
                    if (jOptLong2 > 0) {
                        lValueOf = Long.valueOf(jOptLong2 + this.f355);
                    }
                }
                if (lValueOf != null) {
                    jSONObjectOptJSONObject.put(m651("\ue633唈", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m656(JSONObject jSONObject, boolean z10) throws JSONException {
        long jOptLong;
        long j10;
        f341 = (f340 + 25) % 128;
        if (jSONObject.has(m663((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 23, (short) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 55440279, (byte) Color.blue(0), View.resolveSize(0, 0) - 2090261778).intern())) {
            if (z10) {
                f341 = (f340 + 115) % 128;
                jOptLong = jSONObject.optLong(m651("㓳踞\ue633唈", 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
                j10 = this.f356;
            } else {
                jOptLong = jSONObject.optLong(m663((-24) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (ViewConfiguration.getScrollBarSize() >> 8), 38663063 - Color.rgb(0, 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 2090261778).intern());
                j10 = this.f355;
            }
            try {
                jSONObject.put(m663((-24) - TextUtils.lastIndexOf("", '0', 0), (short) (MotionEvent.axisFromString("") + 1), 55440279 - (ViewConfiguration.getTouchSlop() >> 8), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 2090261778).intern(), jOptLong + j10);
                return;
            } catch (JSONException unused) {
            }
        }
        int i10 = f341 + 73;
        f340 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 69 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m660(ae aeVar, Boolean bool) {
        int i10 = f340 + 35;
        int i11 = i10 % 128;
        f341 = i11;
        int i12 = i10 % 2;
        aeVar.f352 = bool;
        if (i12 == 0) {
            int i13 = 36 / 0;
        }
        f340 = (i11 + 31) % 128;
        return bool;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m661(JSONObject jSONObject) throws JSONException {
        long jOptLong;
        f340 = (f341 + 61) % 128;
        try {
            boolean z10 = true;
            if (jSONObject.optInt(m651("橜쀃渮䡶", Process.getGidForName("") + 4).intern(), 1) == this.f351) {
                jOptLong = jSONObject.optLong(m663(TextUtils.lastIndexOf("", '0', 0, 0) - 23, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55440278, (byte) Color.red(0), (-2090261776) - Gravity.getAbsoluteGravity(0, 0)).intern()) + this.f356;
                jSONObject.put(m651("㠪ಞ워\uea76", 3 - (Process.myPid() >> 22)).intern(), this.f356);
            } else {
                int i10 = f341 + 111;
                f340 = i10 % 128;
                if (i10 % 2 == 0) {
                    if (m657(jSONObject)) {
                        jOptLong = jSONObject.optLong(m663(TextUtils.lastIndexOf("", '0', 0, 0) - 23, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 55440278, (byte) Color.red(0), (-2090261776) - Gravity.getAbsoluteGravity(0, 0)).intern()) + this.f356;
                        jSONObject.put(m651("㠪ಞ워\uea76", 3 - (Process.myPid() >> 22)).intern(), this.f356);
                    } else {
                        jOptLong = jSONObject.optLong(m651("洗Ꚉ몂㎅", 2 - TextUtils.lastIndexOf("", '0', 0)).intern()) + this.f355;
                        jSONObject.put(m651("驲ᾘ워\uea76", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3).intern(), this.f355);
                        z10 = false;
                    }
                } else {
                    m657(jSONObject);
                    throw null;
                }
            }
            jSONObject.put(ig.f2701, jOptLong);
            if (!this.f352.booleanValue()) {
                jSONObject.put(m651("驲ᾘ몂㎅", 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), false);
            }
            m656(jSONObject, z10);
            m664(jSONObject, z10);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m651(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f343)) ^ ((c11 >>> 5) + f344)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f342) ^ ((c12 + i12) ^ ((c12 << 4) + f346))));
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m657(JSONObject jSONObject) {
        f340 = (f341 + 49) % 128;
        if (Math.abs((this.f354 - this.f353) - (jSONObject.optLong(m651("洗Ꚉ몂㎅", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2).intern()) - jSONObject.optLong(m663(View.MeasureSpec.makeMeasureSpec(0, 0) - 24, (short) View.resolveSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 55440278, (byte) TextUtils.getOffsetAfter("", 0), (-2090261775) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()))) > 10) {
            return false;
        }
        int i10 = (f341 + 37) % 128;
        f340 = i10;
        int i11 = i10 + 53;
        f341 = i11 % 128;
        if (i11 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m663(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f349;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f348;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f347 + i11] + i13);
                    } else {
                        i14 = (short) (f345[f347 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f347 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f350);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f348;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f345;
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
}
