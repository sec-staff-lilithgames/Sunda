package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ax {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f776 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f778 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f779 = 11;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f781 = 1251088553;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f782 = -352306575;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f783;

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f786;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f787;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f788;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f780 = {9, -73, 18, -4, -13, 20, -3, -18, 73, -54, -5, -6, -3, 14, -10, 13, 51, -63, -2, 12, 30, 5, 11, -13, 13, -11, 17, 34, -35, 35, -40, 7, -13, 34, -33, 37, 27, -57, -7, 5, -9, 13, 1, -10, 9, -13, 68, -69, 15, 3, 51, -59, 7, -13, 2, -1, 5, 59, -63, -2, 12, 36, 5, 11, -13, 13, -11, 17, 34, -43, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 37, 27, -59, -12, 71, -62, 11, -8, -11, 11, -11, 1, 1, 13, -15, 6, 5, 59, -55, -2, 6, -18, 14, -13, 2, 66, -65, 6, -8, 13, -6, -8, 4, 15, -9, -6, -2, 8, 2, -1, -3, 2, 2, -17, -2, -8, -8, 19, -7, -3, -14, 16};

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f775 = 6;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char[] f777 = {'a', 'n', GMTDateParser.DAY_OF_MONTH, 'r', 'o', 'i', '.', 'w', 'e', 'b', 'k', 't', 'c', GMTDateParser.MINUTES, 'g', 'I', GMTDateParser.MONTH, 'A', 'v', 'y', 'p', GMTDateParser.SECONDS, 'l', 'f', 'x', '7', '0', GMTDateParser.HOURS, 'j', 'q', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.ZONE, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f785 = Arrays.asList(m1009((Process.myTid() >> 22) - 12, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 352306575 - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) - 1251088454).intern(), m1012(Color.blue(0) + 15, (byte) (View.getDefaultSize(0, 0) + 20), "\u0001\u0002\u0003\u0004\u0005\u0000\u0000\b\b\t\n\u000b\u000b\u0011B").intern(), "");

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f784 = new ArrayList();

    public ax() throws JSONException {
        List<String> listAsList = Arrays.asList(m1012((-16777179) - Color.rgb(0, 0, 0), (byte) (Color.alpha(0) + 61), "\u0010\u0000\f\u0007\u0000\u0002\u0010\u0001\u000b\u0003\t\u0000\u0007\u0002\b\u000e\u0004\u0000\u0002\r\t\f\u0004\r\u0003\n\u000b\u0017\u0005\u000e\u0011\u0006\u0000\u0017\u000b\u0011¶").intern(), m1009((-12) - KeyEvent.keyCodeFromString(""), (short) (ViewConfiguration.getTapTimeout() >> 16), 352306595 - TextUtils.indexOf("", "", 0), (byte) ExpandableListView.getPackedPositionGroup(0L), (-1251088454) - TextUtils.getOffsetAfter("", 0)).intern(), m1012((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (byte) (77 - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0005\b\u0012\u0002\t\u0012\u0003\u0014\u000e\u000b\u0000\u0005\u0007\t\u0002\u0017\t\u000b\u0011\u0000\u0001\u0012\n\r\u0003\u0006\t\t\u001b\u0011\u000b\u0011\u000b\u0004\u0012\f\r\u0011\u000b\u0017\u0000\u0007\u0017").intern(), m1009((-12) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), 352306636 - Color.blue(0), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1251088447).intern());
        this.f788 = listAsList;
        m1012(TextUtils.indexOf("", "", 0, 0) + 3, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 93), "\u0006\u0013Í").intern();
        m1012(4 - Color.green(0), (byte) (26 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0006\u0013\u0014\u0003").intern();
        m1009((-12) - View.resolveSizeAndState(0, 0, 0), (short) TextUtils.indexOf("", ""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 352306682, (byte) View.resolveSizeAndState(0, 0, 0), (-1251088448) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        m1012(4 - ExpandableListView.getPackedPositionType(0L), (byte) (View.MeasureSpec.getMode(0) + 96), "\u0000\u0011\u0014\u0003").intern();
        m1012(2 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (TextUtils.getOffsetBefore("", 0) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), "\u001d\u0011ò").intern();
        m1009((-12) - View.resolveSizeAndState(0, 0, 0), (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 352306686 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (Process.myPid() >> 22), (-1251088452) - (Process.myTid() >> 22)).intern();
        m1012((ViewConfiguration.getWindowTouchSlop() >> 8) + 4, (byte) (100 - TextUtils.getTrimmedLength("")), "\u0000\u0001\u0017\b").intern();
        this.f786 = new JSONObject();
        this.f787 = new JSONObject();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f787.put(it.next(), m1009(TextUtils.lastIndexOf("", '0', 0, 0) - 11, (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 352306689, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (KeyEvent.getMaxKeyCode() >> 16) - 1251088439).intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1010(ax axVar, String str) {
        f776 = (f778 + 111) % 128;
        axVar.m1011(str);
        f776 = (f778 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m1011(String str) {
        f776 = (f778 + 59) % 128;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f786 = new JSONObject(str);
                return;
            } catch (JSONException unused) {
            }
        }
        int i10 = f778 + 91;
        f776 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final List<String> m1013() {
        List<String> listM3185 = kc.m3185(this.f786, m1009((-12) - TextUtils.indexOf("", ""), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf("", "", 0) + 352306686, (byte) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 1251088451).intern(), new ArrayList());
        f776 = (f778 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        return listM3185;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final int m1014() {
        f778 = (f776 + 89) % 128;
        int iOptInt = this.f786.optInt(m1012((ViewConfiguration.getFadingEdgeLength() >> 16) + 4, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 102), "\r\u000e\u0004\u0003").intern(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        int i10 = f776 + 49;
        f778 = i10 % 128;
        if (i10 % 2 != 0) {
            return iOptInt;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m1015() {
        f778 = (f776 + 81) % 128;
        String strOptString = this.f786.optString(m1012(Gravity.getAbsoluteGravity(0, 0) + 4, (byte) (View.resolveSizeAndState(0, 0, 0) + 21), "\u0005\b\u0005\b").intern(), m1009((-11) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (ViewConfiguration.getScrollBarSize() >> 8), 352306700 - View.getDefaultSize(0, 0), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1251088455) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
        f776 = (f778 + 109) % 128;
        return strOptString;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m1016() {
        f776 = (f778 + 45) % 128;
        JSONObject jSONObjectOptJSONObject = this.f786.optJSONObject(m1009((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 13, (short) View.MeasureSpec.makeMeasureSpec(0, 0), 352306703 - Color.argb(0, 0, 0, 0), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1251088454) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        f776 = (f778 + 91) % 128;
        return this.f787;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m1017() {
        f776 = (f778 + 79) % 128;
        int iOptInt = this.f786.optInt(m1012((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25), "\u0006\u0013\u0014\u0003").intern(), 7);
        f778 = (f776 + 5) % 128;
        return iOptInt;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m1020() {
        JSONObject jSONObject;
        int iIndexOf;
        int iRed;
        int i10 = f776 + 59;
        f778 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject = this.f786;
            iIndexOf = 3 << TextUtils.indexOf("", "", 1);
            iRed = 4 << Color.red(0);
        } else {
            jSONObject = this.f786;
            iIndexOf = 3 - TextUtils.indexOf("", "", 0);
            iRed = Color.red(0) + 93;
        }
        List<String> listM3185 = kc.m3185(jSONObject, m1012(iIndexOf, (byte) iRed, "\u0006\u0013Í").intern(), this.f785);
        int i11 = f778 + 25;
        f776 = i11 % 128;
        if (i11 % 2 == 0) {
            return listM3185;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m1022(iw iwVar) {
        m1011(iwVar.m2870(m1009((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 12, (short) View.MeasureSpec.makeMeasureSpec(0, 0), Color.green(0) + 352306691, (byte) Color.blue(0), (-1251088438) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m1012((ViewConfiguration.getEdgeSlop() >> 16) + 3, (byte) (90 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0018\u0007\u008a").intern(), new il() { // from class: com.ironsource.adqualitysdk.sdk.i.ax.3
            @Override // com.ironsource.adqualitysdk.sdk.i.il
            /* renamed from: ﻐ */
            public final void mo1008(String str) {
                ax.m1010(ax.this, str);
            }
        }));
        f778 = (f776 + 21) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1012(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f777;
                char c10 = f775;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    h.f2448 = 0;
                    while (true) {
                        int i11 = h.f2448;
                        if (i11 >= i10) {
                            break;
                        }
                        h.f2450 = cArr[i11];
                        h.f2449 = cArr[h.f2448 + 1];
                        if (h.f2450 == h.f2449) {
                            cArr3[h.f2448] = (char) (h.f2450 - b10);
                            cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                        } else {
                            h.f2447 = h.f2450 / c10;
                            h.f2444 = h.f2450 % c10;
                            h.f2446 = h.f2449 / c10;
                            h.f2443 = h.f2449 % c10;
                            if (h.f2444 == h.f2443) {
                                h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                int i12 = (h.f2447 * c10) + h.f2444;
                                int i13 = (h.f2446 * c10) + h.f2443;
                                int i14 = h.f2448;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (h.f2447 == h.f2446) {
                                h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                int i15 = (h.f2447 * c10) + h.f2444;
                                int i16 = (h.f2446 * c10) + h.f2443;
                                int i17 = h.f2448;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (h.f2447 * c10) + h.f2443;
                                int i19 = (h.f2446 * c10) + h.f2444;
                                int i20 = h.f2448;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        h.f2448 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List<String> m1018() {
        List<String> listM3185 = kc.m3185(this.f786, m1012(3 - Color.green(0), (byte) (122 - View.MeasureSpec.getMode(0)), "\u001d\u0011ò").intern(), new ArrayList());
        int i10 = f776 + 81;
        f778 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM3185;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1009(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f779;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f780;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f782 + i11] + i13);
                    } else {
                        i14 = (short) (f783[f782 + i11] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f782 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f781);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f780;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f783;
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int m1021() {
        int i10 = f778 + 83;
        f776 = i10 % 128;
        int iOptInt = i10 % 2 != 0 ? this.f786.optInt(m1012(2 << (Process.myTid() >> 108), (byte) (KeyEvent.getDeadChar(1, 0) + 62), "\u0000\u0011\u0014\u0003").intern(), 4) : this.f786.optInt(m1012((Process.myTid() >> 22) + 4, (byte) (96 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0011\u0014\u0003").intern(), 2);
        int i11 = f778 + 29;
        f776 = i11 % 128;
        if (i11 % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m1019() {
        f778 = (f776 + 67) % 128;
        List<String> listM3185 = kc.m3185(this.f786, m1009((-12) - View.MeasureSpec.getMode(0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), 352306682 - TextUtils.lastIndexOf("", '0', 0), (byte) Color.blue(0), Process.getGidForName("") - 1251088447).intern(), this.f784);
        f776 = (f778 + 83) % 128;
        return listM3185;
    }
}
