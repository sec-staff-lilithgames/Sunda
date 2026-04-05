package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fk extends fr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2237 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2238 = 123;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2239;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private fr[] f2240;

    public fk(List<fr> list) {
        fr[] frVarArr = new fr[list.size()];
        this.f2240 = frVarArr;
        list.toArray(frVarArr);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2510(int i10, int i11, String str, int i12, boolean z10) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f2238);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            f2239 = (f2237 + 25) % 128;
            if (fk.class == obj.getClass()) {
                fr[] frVarArr = this.f2240;
                fr[] frVarArr2 = ((fk) obj).f2240;
                if (frVarArr != null) {
                    return frVarArr.equals(frVarArr2);
                }
                if (frVarArr2 == null) {
                    f2239 = (f2237 + 115) % 128;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f2237 + 63;
        f2239 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        fr[] frVarArr = this.f2240;
        if (frVarArr == null) {
            return 0;
        }
        int iHashCode = frVarArr.hashCode();
        f2237 = (f2239 + 29) % 128;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2510(ExpandableListView.getPackedPositionType(0L) + PsExtractor.PRIVATE_STREAM_1, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2, "9\uffc8", 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), true).intern());
        for (fr frVar : this.f2240) {
            f2237 = (f2239 + 39) % 128;
            sb2.append(m2510(156 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 4, "\u0000\u0000\u0000\u0000", (ViewConfiguration.getLongPressTimeout() >> 16) + 2, false).intern());
            sb2.append(frVar.toString());
            sb2.append(m2510((ViewConfiguration.getDoubleTapTimeout() >> 16) + Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true).intern());
        }
        String strI = com.google.android.gms.internal.play_billing.a.i(m2510(248 - (ViewConfiguration.getEdgeSlop() >> 16), 1 - Color.blue(0), "\u0000", View.MeasureSpec.getMode(0) + 1, false), sb2);
        int i10 = f2237 + 53;
        f2239 = i10 % 128;
        if (i10 % 2 == 0) {
            return strI;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        du duVar = new du(null);
        ds dsVar2 = new ds(dsVar);
        fr[] frVarArr = this.f2240;
        f2239 = (f2237 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        for (fr frVar : frVarArr) {
            f2237 = (f2239 + 1) % 128;
            duVar = frVar.mo2509(dsVar2, cpVar);
            if (duVar.m2435() || duVar.m2438()) {
                break;
            }
            f2237 = (f2239 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
            if (duVar.m2432()) {
                return duVar;
            }
        }
        return duVar;
    }
}
