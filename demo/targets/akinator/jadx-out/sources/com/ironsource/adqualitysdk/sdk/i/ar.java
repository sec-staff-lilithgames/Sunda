package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.aq;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ar extends aq.AnonymousClass1 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f595 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f598;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f599 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f597 = {2089360450, -1179128170, -1289311320, 1734615361, -1791190540, 615014278, 144141020, 1857450806, 1974857075, -38114740, 646624792, 1475090293, 777460066, 1250427740, -721861962, 1742615024, 1254257618, 677994917};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f596 = -4163521717169148991L;

    public ar(ax axVar) {
        m884(new int[]{-360766167, 1926551849, 1504456421, -1301286124}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern();
        m885("⮤ဈ峮饍씡Ɗ买訬\uf69a", 15269 - Color.red(0)).intern();
        m850(axVar);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final long m886() {
        f598 = (f595 + 37) % 128;
        long jOptLong = m849().optLong(m884(new int[]{1194568379, 208661044}, 3 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), 0L);
        int i10 = f598 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f595 = i10 % 128;
        if (i10 % 2 != 0) {
            return jOptLong;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final String m887() {
        f595 = (f598 + 113) % 128;
        JSONObject jSONObjectOptJSONObject = m849().optJSONObject(m885("⮴埔퍣", KeyEvent.keyCodeFromString("") + 31847).intern());
        if (jSONObjectOptJSONObject == null) {
            return m884(new int[]{-360766167, 1926551849, 1504456421, -1301286124}, 7 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
        }
        int i10 = f598 + 89;
        f595 = i10 % 128;
        return i10 % 2 == 0 ? jSONObjectOptJSONObject.optString(m885("⮱", 13765 >>> ExpandableListView.getPackedPositionType(0L)).intern(), m884(new int[]{-360766167, 1926551849, 1504456421, -1301286124}, (ViewConfiguration.getDoubleTapTimeout() % 88) * 62).intern()) : jSONObjectOptJSONObject.optString(m885("⮱", 7529 - ExpandableListView.getPackedPositionType(0L)).intern(), m884(new int[]{-360766167, 1926551849, 1504456421, -1301286124}, 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final long m888() {
        JSONObject jSONObjectM849;
        String strIntern;
        long j10;
        int i10 = f598 + 57;
        f595 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{458384271, -1112428692}, 3 >> Color.green(1)).intern();
            j10 = 1;
        } else {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{458384271, -1112428692}, 3 - Color.green(0)).intern();
            j10 = 0;
        }
        return jSONObjectM849.optLong(strIntern, j10);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final long m889() {
        JSONObject jSONObjectM849;
        String strIntern;
        long j10;
        int i10 = f598 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f595 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{1796884369, -1734959409}, 2 % ((Process.getThreadPriority(0) >> 91) >> 56)).intern();
            j10 = 1;
        } else {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{1796884369, -1734959409}, 2 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
            j10 = 0;
        }
        return jSONObjectM849.optLong(strIntern, j10);
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m890() {
        JSONObject jSONObjectOptJSONObject;
        int i10 = f598 + 115;
        f595 = i10 % 128;
        if (i10 % 2 != 0 ? (jSONObjectOptJSONObject = m849().optJSONObject(m885("⮴埔퍣", 31847 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) != null : (jSONObjectOptJSONObject = m849().optJSONObject(m885("⮴埔퍣", (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)) * 26162).intern())) != null) {
            return jSONObjectOptJSONObject.optString(m884(new int[]{1551814106, 1394714337}, View.MeasureSpec.getMode(0) + 1).intern(), m885("⮤ဈ峮饍씡Ɗ买訬\uf69a", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15269).intern());
        }
        String strIntern = m885("⮤ဈ峮饍씡Ɗ买訬\uf69a", 15269 - Color.alpha(0)).intern();
        int i11 = f595 + 19;
        f598 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m891() {
        f595 = (f598 + 61) % 128;
        int iOptInt = m849().optInt(m884(new int[]{-319893108, 814841533}, Color.rgb(0, 0, 0) + 16777219).intern(), 40);
        int i10 = f595 + 97;
        f598 = i10 % 128;
        if (i10 % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m892() throws IllegalArgumentException {
        JSONObject jSONObjectM849;
        String strM884;
        int i10 = f598 + 65;
        f595 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM849 = m849();
            Process.getThreadPriority(0);
            strM884 = m884(new int[]{2018397849, 238262043}, 2);
        } else {
            jSONObjectM849 = m849();
            strM884 = m884(new int[]{2018397849, 238262043}, 3 - ((Process.getThreadPriority(0) + 20) >> 6));
        }
        return jSONObjectM849.optInt(strM884.intern(), this.f599);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m893() {
        List<String> listM1013 = m848().m1013();
        listM1013.addAll(kc.m3185(m849(), m885("⮤偈\udc43", 31741 - Drawable.resolveOpacity(0, 0)).intern(), new ArrayList()));
        int i10 = f595 + 67;
        f598 = i10 % 128;
        if (i10 % 2 == 0) {
            return listM1013;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m894() {
        JSONObject jSONObjectM849;
        String strIntern;
        int i10;
        int i11 = f595 + 3;
        f598 = i11 % 128;
        if (i11 % 2 != 0) {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{472075682, -55888423}, View.getDefaultSize(0, 0) + 5).intern();
            i10 = 9280;
        } else {
            jSONObjectM849 = m849();
            strIntern = m884(new int[]{472075682, -55888423}, View.getDefaultSize(0, 0) + 3).intern();
            i10 = 9850;
        }
        return jSONObjectM849.optInt(strIntern, i10);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m895() {
        List<String> listM1018 = m848().m1018();
        listM1018.addAll(kc.m3185(m849(), m885("⮧⅘㹣", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2797).intern(), new ArrayList()));
        int i10 = f598 + 103;
        f595 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 11 / 0;
        }
        return listM1018;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m884(int[] iArr, int i10) {
        String str;
        synchronized (d.f1845) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f597.clone();
                d.f1846 = 0;
                while (true) {
                    int i11 = d.f1846;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        d.f1844 = (c10 << 16) + c11;
                        d.f1847 = (c12 << 16) + c13;
                        d.m2179(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = d.f1844 ^ iArr2[i13];
                            d.f1844 = i14;
                            int iM2178 = d.m2178(i14) ^ d.f1847;
                            int i15 = d.f1844;
                            d.f1844 = iM2178;
                            d.f1847 = i15;
                        }
                        int i16 = d.f1844;
                        int i17 = d.f1847;
                        d.f1844 = i17;
                        d.f1847 = i16;
                        int i18 = i16 ^ iArr2[16];
                        d.f1847 = i18;
                        int i19 = i17 ^ iArr2[17];
                        d.f1844 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        d.m2179(iArr2);
                        int i20 = d.f1846;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        d.f1846 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m885(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f596);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
