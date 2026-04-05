package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class eo extends el {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2176 = {'C', 18462, 37008, 55571, 8595, 27151, 45786, 64282, 17303, 35866, 54406, 7444, 25990, 44566, 63186, 30280, 15990, 59128, 44913, 22452};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2175 = 2753404354581842047L;

    public eo(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2494(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2176[i11 + i12] ^ (i12 * f2175)) ^ c10);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ﻛ */
    public final boolean mo2488(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2494((char) ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') - '!', ViewConfiguration.getKeyRepeatDelay() >> 16).intern());
        sb2.append(obj);
        sb2.append(m2494((char) (TextUtils.getOffsetAfter("", 0) + 30312), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14).intern());
        sb2.append(obj2);
        throw new RuntimeException(sb2.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* renamed from: ｋ */
    public final boolean mo2490(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2494((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 14 - TextUtils.lastIndexOf("", '0', 0), ViewConfiguration.getPressedStateDuration() >> 16).intern());
        sb2.append(str);
        throw new RuntimeException(com.google.android.gms.internal.play_billing.a.k(sb2, m2494((char) (30313 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 5, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15), str2));
    }
}
