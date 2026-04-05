package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class bg extends da implements ci {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f973 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f975 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f976 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f977 = 76;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f978 = 1970268237;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f981 = -921766532;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f982;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f983;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, a> f984;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f985;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f980 = {-59, -1, 6, -10, 1, 13, 15, -21, 7, 17, -25, 0, -9, 47, -46, 15, -14, -68, 0, 18, -11, 41, -49, 15, -2, -69, -1, -7, 10, 1, -13, 9, -75, -73, 6, 5, -71, 19, -14, 3, 6, -72, -15, -5, 23, -71, 2, 3, 7, -11, -70, -83, 0, 18, -11, 41};

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static char f974 = 43431;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f971 = 56180;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f972 = 62784;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f979 = 20631;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        /* renamed from: ﻐ */
        Object mo1112(List<Object> list, ch chVar);
    }

    public bg(String str) {
        this.f985 = str;
    }

    /* renamed from: Ꮭ, reason: contains not printable characters */
    public static /* synthetic */ Object m1158(List list, Class cls) {
        int i10 = f975 + 73;
        f973 = i10 % 128;
        return da.m2180((List<Object>) list, i10 % 2 != 0 ? 1 : 0, cls);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1160(bg bgVar) {
        int i10 = (f975 + 11) % 128;
        f973 = i10;
        String str = bgVar.f983;
        f975 = (i10 + 71) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Class m1161(bg bgVar, String str) {
        int i10 = f973 + 29;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM1159 = bgVar.m1159(str, false);
        f973 = (f975 + 81) % 128;
        return clsM1159;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m1164() {
        int i10 = (f973 + 81) % 128;
        f975 = i10;
        if (this.f983 != null) {
            return true;
        }
        f973 = (i10 + 21) % 128;
        return false;
    }

    /* renamed from: ﱡ */
    public boolean mo1154() {
        int i10 = f973;
        int i11 = i10 + 103;
        f975 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        f975 = (i10 + 19) % 128;
        return z10;
    }

    /* renamed from: ﻏ */
    public boolean mo1156() {
        int i10 = (f975 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        f973 = i10;
        int i11 = i10 + 21;
        f975 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public abstract String mo1109();

    /* renamed from: ﻛ */
    public abstract Class mo1110(String str);

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m1167() {
        try {
            if (TextUtils.isEmpty(this.f982)) {
                this.f982 = mo1109();
                f973 = (f975 + 35) % 128;
            } else {
                f973 = (f975 + 67) % 128;
                if (this.f982.equals(m1162(TextUtils.getTrimmedLength("") - 77, (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 921766558 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) Color.blue(0), View.MeasureSpec.getMode(0) - 1970268168).intern())) {
                    this.f982 = mo1109();
                    f973 = (f975 + 35) % 128;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f982;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.Prode.m533() == false) goto L9;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class m1168(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.bg.f975
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bg.f973 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.Prode.m533()     // Catch: java.lang.Throwable -> L2f
            r2 = 72
            int r2 = r2 / r1
            if (r0 != 0) goto L22
            goto L1d
        L17:
            boolean r0 = com.ironsource.adqualitysdk.sdk.i.Prode.m533()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L22
        L1d:
            java.lang.Class r4 = r3.m1159(r4, r1)     // Catch: java.lang.Throwable -> L2f
            return r4
        L22:
            java.lang.Class r4 = r3.mo1110(r4)     // Catch: java.lang.Throwable -> L2f
            int r0 = com.ironsource.adqualitysdk.sdk.i.bg.f973
            int r0 = r0 + 23
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.bg.f975 = r0
            return r4
        L2f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bg.m1168(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾇ */
    public abstract Map<String, a> mo1111();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m1171() {
        Map<String, a> mapMo1111 = mo1111();
        this.f984 = mapMo1111;
        mapMo1111.put(m1162(TextUtils.indexOf("", "", 0, 0) - 77, (short) Gravity.getAbsoluteGravity(0, 0), 921766531 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1970268121) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new a() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                bg.this.m1172((String) bg.m1158(list, String.class));
                return bg.m1160(bg.this);
            }
        });
        this.f984.put(m1163("㡤欌륆젣鋮\u202cậ鱬窲郹ꚸ츁诰嚛㼷ᰑབﰄ\uecf9칤", 19 - Gravity.getAbsoluteGravity(0, 0)).intern(), new a() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(bg.this.m1164());
            }
        });
        this.f984.put(m1162(TextUtils.getTrimmedLength("") - 77, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), 921766549 - TextUtils.getOffsetAfter("", 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-1970268134) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new a() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bg.m1161(bg.this, (String) list.get(0));
            }
        });
        f975 = (f973 + 17) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Class m1159(String str, boolean z10) {
        String str2 = LJjmO.NZHgjNegixXhWT;
        try {
            if (str.contains(m1162(MotionEvent.axisFromString(str2) - 76, (short) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 921766563 - ExpandableListView.getPackedPositionChild(0L), (byte) (Process.myPid() >> 22), KeyEvent.getDeadChar(0, 0) - 1970268191).intern())) {
                f975 = (f973 + 89) % 128;
                return jz.m3124(str, z10);
            }
            switch (str.hashCode()) {
                case -1325958191:
                    if (str.equals(m1163("쥙뭬ۄἄ췣蛜", 6 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        f973 = (f975 + 5) % 128;
                        return Double.TYPE;
                    }
                    return mo1110(str);
                case 104431:
                    if (str.equals(m1162(View.MeasureSpec.getMode(0) - 77, (short) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 921766565, (byte) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf(str2, str2, 0, 0) - 1970268132).intern())) {
                        f973 = (f975 + 93) % 128;
                        return Integer.TYPE;
                    }
                    return mo1110(str);
                case 3029738:
                    if (str.equals(m1163("ꄫᖉ谟\ue0f0", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3).intern())) {
                        int i10 = f973 + 23;
                        f975 = i10 % 128;
                        if (i10 % 2 != 0) {
                            return Boolean.TYPE;
                        }
                        return Float.TYPE;
                    }
                    return mo1110(str);
                case 3039496:
                    if (str.equals(m1162((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 77, (short) (Color.rgb(0, 0, 0) + 16777216), 921766573 - (KeyEvent.getMaxKeyCode() >> 16), (byte) Color.argb(0, 0, 0, 0), (-1970268139) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                        return Byte.TYPE;
                    }
                    return mo1110(str);
                case 3052374:
                    if (str.equals(m1163("닏캱ゅ霣", 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                        return Character.TYPE;
                    }
                    return mo1110(str);
                case 3327612:
                    if (str.equals(m1163("\ud9f0븏䙬碌", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4).intern())) {
                        return Long.TYPE;
                    }
                    return mo1110(str);
                case 3625364:
                    if (str.equals(m1163("ᯉ婼Ⱡങ", 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        int i11 = f975 + 59;
                        f973 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return Void.TYPE;
                        }
                    }
                    return mo1110(str);
                case 97526364:
                    if (str.equals(m1162((-76) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) Color.alpha(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921766568, (byte) (Process.myTid() >> 22), View.getDefaultSize(0, 0) - 1970268135).intern())) {
                        return Float.TYPE;
                    }
                    return mo1110(str);
                case 109413500:
                    if (str.equals(m1162(TextUtils.getOffsetAfter(str2, 0) - 77, (short) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getWindowTouchSlop() >> 8) + 921766577, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Color.green(0) - 1970268122).intern())) {
                        Class cls = Short.TYPE;
                        f975 = (f973 + 71) % 128;
                        return cls;
                    }
                    return mo1110(str);
                default:
                    return mo1110(str);
            }
        } catch (Throwable th2) {
            if (!z10) {
                return null;
            }
            String str3 = this.f985;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1162((-78) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) TextUtils.indexOf(str2, str2, 0, 0), 921766582 - View.resolveSizeAndState(0, 0, 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) - 1970268170).intern());
            sb2.append(str);
            sb2.append(m1163("ࣽ蹒⡢裃뭧꾷ⅇ딫˨퍏", (ViewConfiguration.getLongPressTimeout() >> 16) + 10).intern());
            co.m1955(str3, sb2.toString(), th2);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public String mo1165() {
        int i10 = (f973 + 91) % 128;
        f975 = i10;
        String str = this.f983;
        if (str == null) {
            return m1167();
        }
        int i11 = i10 + 1;
        f973 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m1172(String str) {
        int i10 = (f975 + 41) % 128;
        f973 = i10;
        this.f983 = str;
        int i11 = i10 + 63;
        f975 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 41 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m1166(String str) {
        f975 = (f973 + 67) % 128;
        Class clsM1159 = m1159(str, true);
        f973 = (f975 + 61) % 128;
        return clsM1159;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m1169(hc hcVar, ch chVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hcVar);
            chVar.mo1875(str, arrayList);
            f975 = (f973 + 111) % 128;
        } catch (Throwable th2) {
            String str2 = this.f985;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1163("\uf788滴\ue83e藱녜ꅰ嶀⊳팸ꓹ", (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern());
            sb2.append(this);
            co.m1955(str2, sb2.toString(), th2);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ci
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object mo1170(String str, List<Object> list, ch chVar) {
        f975 = (f973 + 109) % 128;
        a aVar = this.f984.get(str);
        try {
        } catch (Exception e10) {
            String str2 = this.f985;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1163("\uf788滴\ue83e藱녜ꅰﺣ\uaad0셦⚨㡓鏉嶀⊳䠍ᄀꍔ겈έ봡孩࿃럞ޣ뭆忈䬿ȱ䃎Ɡ☑䍊", 31 - Drawable.resolveOpacity(0, 0)).intern());
            sb2.append(str);
            sb2.append(m1163("☑䍊", 1 - TextUtils.getTrimmedLength("")).intern());
            co.m1955(str2, sb2.toString(), e10);
        }
        if (aVar != null) {
            f975 = (f973 + 95) % 128;
            return aVar.mo1112(list, chVar);
        }
        String str3 = this.f985;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m1163("\uf788滴\ue83e藱녜ꅰﺣ\uaad0셦⚨㡓鏉嶀⊳䠍ᄀꍔ겈έ봡孩࿃럞ޣ뭆忈䬿ȱ䃎Ɡ☑䍊", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31).intern());
        sb3.append(str);
        sb3.append(m1163("跬ូ럞ޣ뭆忈䬿ȱ䃎Ɡ\ue96f∑☾뵧햩\ua958唍㏧뙢⇍ᰁ䣑ஂ\u3102", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22).intern());
        co.m1955(str3, sb3.toString(), null);
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1162(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f977;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f980;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f981 + i11] + i13);
                    } else {
                        i14 = (short) (f976[f981 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f981 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f978);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f980;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f976;
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
    private static String m1163(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f974)) ^ ((c11 >>> 5) + f972)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f971) ^ ((c12 + i12) ^ ((c12 << 4) + f979))));
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
}
