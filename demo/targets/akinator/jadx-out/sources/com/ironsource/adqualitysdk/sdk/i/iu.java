package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class iu implements Runnable {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2764 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2765 = 54003;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2766 = 51652;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2767 = 61960;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2768 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2769 = 23952;

    @Override // java.lang.Runnable
    public final void run() {
        f2764 = (f2768 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        try {
            mo590();
            int i10 = f2764 + 69;
            f2768 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 0;
            }
        } catch (Throwable th2) {
            try {
                mo1003(th2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ﻐ */
    public abstract void mo590() throws Exception;

    /* renamed from: ﾒ */
    public void mo1003(Throwable th2) {
        String strIntern = m2844("풎꺘韓賱磨ƽ⥤⼓㴁\ud85d皷歫늦\ue233", 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2844("睐ㄤ숆礰ፃ㭌Ᾰ맞♉䩬댂ҭ蕧옶爗ﵝ", 14 - ExpandableListView.getPackedPositionChild(0L)).intern());
        sb2.append(getClass().getName());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2844("篑騼\uf27d갱袦萦", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5).intern());
        sb3.append(getClass().getName());
        sb3.append(m2844("\uf0dc䄆", 1 - View.MeasureSpec.getSize(0)).intern());
        kd.m3200(strIntern, string, sb3.toString(), th2);
        String strIntern2 = m2844("풎꺘韓賱磨ƽ⥤⼓㴁\ud85d皷歫늦\ue233", Color.red(0) + 14).intern();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m2844("睐ㄤ숆礰ፃ㭌Ᾰ맞♉䩬댂ҭ蕧옶爗ﵝ", TextUtils.indexOf("", "", 0) + 15).intern());
        sb4.append(getClass().getName());
        k.m3147(strIntern2, sb4.toString());
        k.m3145(m2844("풎꺘韓賱磨ƽ⥤⼓㴁\ud85d皷歫늦\ue233", (ViewConfiguration.getTouchSlop() >> 8) + 14).intern(), m2844("扳큗拓\uded6䦣呱\uf125≎", MotionEvent.axisFromString("") + 9).intern(), th2);
        int i10 = f2764 + 41;
        f2768 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2844(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2765)) ^ ((c11 >>> 5) + f2767)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2769) ^ ((c12 + i12) ^ ((c12 << 4) + f2766))));
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
