package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hg extends ha<View.OnClickListener> implements View.OnClickListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2483 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2484 = -7586403987514378242L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2485;

    /* renamed from: ｋ, reason: contains not printable characters */
    private a f2486;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        /* renamed from: ﾇ */
        void mo2157(hg hgVar, View view);
    }

    public hg(View.OnClickListener onClickListener, a aVar) {
        super(onClickListener);
        this.f2486 = aVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2572(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2484);
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f2483 = (f2485 + 45) % 128;
        try {
            this.f2486.mo2157(this, view);
        } catch (Throwable th2) {
            kd.m3203(m2572("㞱欷軳≧䔋\uf8de᱿뼣튯癒ꤌ첶恄菠⚮婳\ufdebႊ됯ퟩઓ긹쇋撍", 23719 - (Process.myPid() >> 22)).intern(), m2572("㞻줓쪲챌췰컅쀭쇉쌦쐄얜읉\ud8c6\ud984\udfcdb\ude6b\udf1f킵퉁펲풚혺ퟴ\ue97a\uea10\uebbb\ued50", (Process.myPid() >> 22) + 65183).intern(), th2, false);
        }
        if (mo1115() != null) {
            int i10 = f2485 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f2483 = i10 % 128;
            if (i10 % 2 != 0) {
                mo1115().onClick(view);
            } else {
                mo1115().onClick(view);
                throw null;
            }
        }
    }
}
