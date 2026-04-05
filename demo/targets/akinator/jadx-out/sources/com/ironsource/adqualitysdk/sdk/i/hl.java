package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hl extends ha<View.OnTouchListener> implements View.OnTouchListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2518 = -3594642600123577954L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2519 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2520;

    /* renamed from: ｋ, reason: contains not printable characters */
    private c f2521;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        /* renamed from: ﻛ */
        boolean mo2158(hl hlVar, View view, MotionEvent motionEvent);
    }

    public hl(View.OnTouchListener onTouchListener, c cVar) {
        super(onTouchListener);
        this.f2521 = cVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2587(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2518);
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = f2519 + 109;
        f2520 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2587("집\udcaf\ue374觬鲗ꌦ䧌屋挏\u09baᱜ⋮즄\udc28\ue2de襋鰋ꊲ䥟忡抓डΊ≥", 5471 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m2587("짛钁猶톶뱘\u1a9f凉䐋⋖脦澈쩓꣎睾툛낉Ἣ\ufdcd塑⛻蔺怀캮괁\u0bc9홎듯ᎉ", 23917 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2521.mo2158(this, view, motionEvent);
            throw null;
        }
        this.f2521.mo2158(this, view, motionEvent);
        if (mo1115() == null) {
            f2519 = (f2520 + 71) % 128;
            return false;
        }
        int i11 = f2520 + 59;
        f2519 = i11 % 128;
        if (i11 % 2 != 0) {
            return mo1115().onTouch(view, motionEvent);
        }
        mo1115().onTouch(view, motionEvent);
        throw null;
    }
}
