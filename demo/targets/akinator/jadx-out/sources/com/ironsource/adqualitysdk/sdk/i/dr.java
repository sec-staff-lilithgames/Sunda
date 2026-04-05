package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3129ae;
import com.ironsource.adqualitysdk.sdk.i.dx;
import com.ironsource.mediationsdk.demandOnly.j;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dr {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2013 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f2014 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2015 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2016 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<ee, ee> f2017;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map<fr, fr> f2018;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f2019;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f2020;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private int f2021 = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c<T> {
        /* renamed from: ﻛ */
        T mo2413(List<dx> list);
    }

    static {
        m2400();
        f2017 = new HashMap();
        f2018 = new HashMap();
        f2015 = (f2016 + 73) % 128;
    }

    public dr(String str, String str2) {
        this.f2019 = str;
        this.f2020 = str2;
    }

    /* renamed from: ヮ, reason: contains not printable characters */
    private dx m2367(List<dx> list) {
        int i10 = f2015 + 15;
        f2016 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                int i11 = 58 / 0;
                if (!m2369(list)) {
                    return null;
                }
            } else if (!m2369(list)) {
                return null;
            }
            int i12 = f2015 + 27;
            f2016 = i12 % 128;
            if (i12 % 2 != 0) {
                return list.get(this.f2021);
            }
            int i13 = 89 / 0;
            return list.get(this.f2021);
        } catch (Exception e10) {
            m2404(m2408((char) (Color.red(0) + 20864), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, (ViewConfiguration.getPressedStateDuration() >> 16) + InterfaceC3129ae.a.f35978c).intern(), e10);
            return null;
        }
    }

    /* renamed from: ヶ, reason: contains not printable characters */
    private dx m2368(List<dx> list) {
        f2015 = (f2016 + 107) % 128;
        try {
        } catch (Exception e10) {
            m2404(m2408((char) Drawable.resolveOpacity(0, 0), 34 - View.getDefaultSize(0, 0), 1167 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e10);
        }
        if (!m2369(list)) {
            m2404(m2408((char) (View.resolveSize(0, 0) + 16992), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getPressedStateDuration() >> 16) + 1144).intern(), (Throwable) null);
            return null;
        }
        int i10 = this.f2021;
        this.f2021 = i10 + 1;
        dx dxVar = list.get(i10);
        int i11 = f2016 + 31;
        f2015 = i11 % 128;
        if (i11 % 2 == 0) {
            return dxVar;
        }
        throw null;
    }

    /* renamed from: 乁, reason: contains not printable characters */
    private boolean m2369(List<dx> list) {
        f2016 = (f2015 + 93) % 128;
        if (this.f2021 >= list.size()) {
            return false;
        }
        f2016 = (f2015 + 103) % 128;
        return true;
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private Map<String, ee> m2370(List<dx> list) {
        HashMap map = new HashMap();
        Iterator it = m2399(list, m2408((char) (5239 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1 - Gravity.getAbsoluteGravity(0, 0), 764 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new c<Pair<String, ee>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dr.5
            @Override // com.ironsource.adqualitysdk.sdk.i.dr.c
            /* renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ Pair<String, ee> mo2413(List list2) {
                return dr.m2388(dr.this, list2);
            }
        }).iterator();
        while (it.hasNext()) {
            int i10 = f2016 + 61;
            f2015 = i10 % 128;
            if (i10 % 2 != 0) {
                Pair pair = (Pair) it.next();
                map.put(pair.first, pair.second);
                throw null;
            }
            Pair pair2 = (Pair) it.next();
            map.put(pair2.first, pair2.second);
        }
        return map;
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    private List<ee> m2371(List<dx> list) {
        List<ee> listM2399 = m2399(list, m2408((char) TextUtils.indexOf("", "", 0, 0), 1 - (ViewConfiguration.getLongPressTimeout() >> 16), 774 - Gravity.getAbsoluteGravity(0, 0)).intern(), new c<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.dr.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2022 = {16, 'B', GMTDateParser.DAY_OF_MONTH, GMTDateParser.MINUTES, 'o', 'g', GMTDateParser.DAY_OF_MONTH, GMTDateParser.DAY_OF_MONTH, 'k', 'I', 'J', 't', 'k', 'A', 'I', 'i', 'k', 'R', 'Q', GMTDateParser.SECONDS, 'j', 'f', 'g', 'A', 'B', GMTDateParser.DAY_OF_MONTH, 'l', 'k', GMTDateParser.DAY_OF_MONTH, 'j', 't', '^'};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f2023 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2024;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m2411(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
                String str2;
                byte[] bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                synchronized (g.f2307) {
                    try {
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int i12 = iArr[2];
                        int i13 = iArr[3];
                        char[] cArr = new char[i11];
                        System.arraycopy(f2022, i10, cArr, 0, i11);
                        if (bArr != null) {
                            char[] cArr2 = new char[i11];
                            g.f2306 = 0;
                            char c10 = 0;
                            while (true) {
                                int i14 = g.f2306;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (bArr[i14] == 1) {
                                    cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                                } else {
                                    cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                                }
                                c10 = cArr2[i14];
                                g.f2306 = i14 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i13 > 0) {
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr, 0, cArr3, 0, i11);
                            int i15 = i11 - i13;
                            System.arraycopy(cArr3, 0, cArr, i15, i13);
                            System.arraycopy(cArr3, i13, cArr, 0, i15);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i11];
                            g.f2306 = 0;
                            while (true) {
                                int i16 = g.f2306;
                                if (i16 >= i11) {
                                    break;
                                }
                                cArr4[i16] = cArr[(i11 - i16) - 1];
                                g.f2306 = i16 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i12 > 0) {
                            g.f2306 = 0;
                            while (true) {
                                int i17 = g.f2306;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr[i17] = (char) (cArr[i17] - iArr[2]);
                                g.f2306 = i17 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ee m2412(List<dx> list2) {
                f2024 = (f2023 + 9) % 128;
                ee eeVarM2405 = dr.m2405(dr.this, list2);
                if ((eeVarM2405 instanceof dv) || (eeVarM2405 instanceof em)) {
                    f2024 = (f2023 + 97) % 128;
                    return eeVarM2405;
                }
                dr drVar = dr.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2411("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{0, 32, 0, 0}).intern());
                sb2.append(eeVarM2405);
                dr.m2391(drVar, sb2.toString());
                f2023 = (f2024 + 45) % 128;
                return null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dr.c
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ ee mo2413(List list2) {
                int i10 = f2024 + 29;
                f2023 = i10 % 128;
                int i11 = i10 % 2;
                ee eeVarM2412 = m2412(list2);
                if (i11 == 0) {
                    int i12 = 84 / 0;
                }
                f2024 = (f2023 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                return eeVarM2412;
            }
        });
        f2016 = (f2015 + 57) % 128;
        return listM2399;
    }

    /* renamed from: טּ, reason: contains not printable characters */
    private ee m2372(List<dx> list) {
        dx dxVarM2368;
        Cdo cdoM2351;
        try {
            dxVarM2368 = m2368(list);
            cdoM2351 = Cdo.m2351(this.f2020, dxVarM2368.m2455());
        } catch (Exception e10) {
            m2404(m2408((char) (MotionEvent.axisFromString("") + 1), 16 - Gravity.getAbsoluteGravity(0, 0), 849 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), e10);
        }
        if (dxVarM2368.m2444()) {
            f2015 = (f2016 + 45) % 128;
            String strM2453 = dxVarM2368.m2453();
            String strM24532 = m2368(list).m2453();
            int iHashCode = strM24532.hashCode();
            if (iHashCode != 40) {
                if (iHashCode == 61 && strM24532.equals(m2408((char) (ImageFormat.getBitsPerPixel(0) + 42401), 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) + 790).intern())) {
                    return m2390(new dz((em) m2390(new em(strM2453, cdoM2351)), m2410(list), cdoM2351));
                }
            } else if (strM24532.equals(m2408((char) (View.MeasureSpec.getSize(0) + 18493), TextUtils.getOffsetBefore("", 0) + 1, 110 - Color.blue(0)).intern())) {
                return m2390(new ec(strM2453, m2398(list, m2408((char) (Color.alpha(0) + 31737), Drawable.resolveOpacity(0, 0) + 1, 151 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()), cdoM2351));
            }
            this.f2021--;
            return m2390(new em(strM2453, cdoM2351));
        }
        if (dxVarM2368.m2450()) {
            int i10 = f2016 + 19;
            f2015 = i10 % 128;
            if (i10 % 2 == 0) {
                return m2389(dxVarM2368);
            }
            m2389(dxVarM2368);
            throw null;
        }
        if (dxVarM2368.m2446()) {
            return m2390(new dv(dxVarM2368.m2453(), cdoM2351));
        }
        if (dxVarM2368.m2443()) {
            return m2395(dxVarM2368, list);
        }
        if (!dxVarM2368.m2449()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2408((char) (ViewConfiguration.getLongPressTimeout() >> 16), Process.getGidForName("") + 18, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 832).intern());
            sb2.append(dxVarM2368);
            m2392(sb2.toString());
            f2015 = (f2016 + 97) % 128;
            return null;
        }
        f2016 = (f2015 + 71) % 128;
        String strM24533 = dxVarM2368.m2453();
        int iHashCode2 = strM24533.hashCode();
        if (iHashCode2 == 33) {
            if (strM24533.equals(m2408((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1 - TextUtils.getTrimmedLength(""), 791 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                int i11 = f2015 + 91;
                f2016 = i11 % 128;
                if (i11 % 2 != 0) {
                    return m2390(new fa(m2373(list), cdoM2351));
                }
                return m2390(new ey(m2390(new ff(0, cdoM2351)), m2372(list), cdoM2351));
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2408((char) View.MeasureSpec.getMode(0), Color.blue(0) + 20, (ViewConfiguration.getEdgeSlop() >> 16) + 812).intern());
            sb3.append(dxVarM2368.m2453());
            m2392(sb3.toString());
            return null;
        }
        if (iHashCode2 != 40) {
            if (iHashCode2 != 45) {
                if (iHashCode2 != 91) {
                    if (iHashCode2 == 123 && strM24533.equals(m2408((char) (41193 - (KeyEvent.getMaxKeyCode() >> 16)), View.MeasureSpec.getMode(0) + 1, Process.myPid() >> 22).intern())) {
                        return m2390(new ed(m2370(list), cdoM2351));
                    }
                } else if (strM24533.equals(m2408((char) (TextUtils.indexOf("", "", 0, 0) + 12844), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 789).intern())) {
                    f2015 = (f2016 + 1) % 128;
                    return m2390(new dw(m2398(list, m2408((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42550), 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 810).intern()), cdoM2351));
                }
            } else if (strM24533.equals(m2408((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26839), 1 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 779).intern())) {
                return m2390(new ey(m2390(new ff(0, cdoM2351)), m2372(list), cdoM2351));
            }
        } else if (strM24533.equals(m2408((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 18493), 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 109 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
            ee eeVarM2390 = m2390(new eh(m2410(list), cdoM2351));
            m2393(list, m2408((char) (31738 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 1 - (Process.myTid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 150).intern(), eeVarM2390, m2408((char) TextUtils.getTrimmedLength(""), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), Gravity.getAbsoluteGravity(0, 0) + 792).intern());
            return eeVarM2390;
        }
        StringBuilder sb32 = new StringBuilder();
        sb32.append(m2408((char) View.MeasureSpec.getMode(0), Color.blue(0) + 20, (ViewConfiguration.getEdgeSlop() >> 16) + 812).intern());
        sb32.append(dxVarM2368.m2453());
        m2392(sb32.toString());
        return null;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private ee m2373(List<dx> list) {
        ee eeVarM2372 = m2372(list);
        while (m2369(list)) {
            f2015 = (f2016 + 71) % 128;
            String strM2453 = m2368(list).m2453();
            int iHashCode = strM2453.hashCode();
            if (iHashCode == 46) {
                if (!strM2453.equals(m2408((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 788 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    this.f2021--;
                    break;
                }
                f2016 = (f2015 + 39) % 128;
                eeVarM2372 = m2385(eeVarM2372, list);
            } else {
                if (iHashCode != 91 || !strM2453.equals(m2408((char) (TextUtils.indexOf("", "") + 12844), -TextUtils.lastIndexOf("", '0', 0), 789 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    this.f2021--;
                    break;
                }
                eeVarM2372 = m2401(eeVarM2372, list);
            }
        }
        return eeVarM2372;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private Pair<String, ee> m2374(List<dx> list) {
        f2016 = (f2015 + 105) % 128;
        dx dxVarM2368 = m2368(list);
        if (!dxVarM2368.m2452()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2408((char) (55803 - View.combineMeasuredStates(0, 0)), KeyEvent.getDeadChar(0, 0) + 24, 1047 - KeyEvent.getDeadChar(0, 0)).intern());
            sb2.append(dxVarM2368);
            m2404(sb2.toString(), (Throwable) null);
        }
        String strM2453 = dxVarM2368.m2453();
        m2393(list, m2408((char) (59123 - TextUtils.indexOf("", "", 0)), TextUtils.getOffsetBefore("", 0) + 1, TextUtils.indexOf("", "", 0) + j.a.f37457k).intern(), strM2453, m2408((char) ((-1) - MotionEvent.axisFromString("")), 48 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1071 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        Pair<String, ee> pair = new Pair<>(strM2453, m2410(list));
        f2015 = (f2016 + 83) % 128;
        return pair;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private ee m2375(List<dx> list) {
        ee eeVarM2379 = m2379(list);
        if (m2369(list)) {
            Cdo cdoM2351 = Cdo.m2351(this.f2020, eeVarM2379.m2475());
            String strM2453 = m2368(list).m2453();
            int iHashCode = strM2453.hashCode();
            if (iHashCode != 60) {
                if (iHashCode != 62) {
                    if (iHashCode != 1084) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode == 1983 && strM2453.equals(m2408((char) (TextUtils.indexOf("", "") + 29828), 2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 777 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                                    return m2390(new er(eeVarM2379, m2375(list), cdoM2351));
                                }
                            } else if (strM2453.equals(m2408((char) (ExpandableListView.getPackedPositionType(0L) + 40510), KeyEvent.getDeadChar(0, 0) + 2, (ViewConfiguration.getFadingEdgeLength() >> 16) + 769).intern())) {
                                return m2390(new es(eeVarM2379, m2375(list), cdoM2351));
                            }
                        } else if (strM2453.equals(m2408((char) (MotionEvent.axisFromString("") + 2174), 2 - (Process.myPid() >> 22), 775 - (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                            int i10 = (f2016 + 9) % 128;
                            f2015 = i10;
                            f2016 = (i10 + 37) % 128;
                            return m2390(new ev(eeVarM2379, m2375(list), cdoM2351));
                        }
                    } else if (strM2453.equals(m2408((char) (55789 - AndroidCharacter.getMirror('0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 3, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 771).intern())) {
                        f2015 = (f2016 + 57) % 128;
                        return m2390(new fc(eeVarM2379, m2375(list), cdoM2351));
                    }
                } else if (strM2453.equals(m2408((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), KeyEvent.keyCodeFromString("") + 1, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 773).intern())) {
                    return m2390(new eq(eeVarM2379, m2375(list), cdoM2351));
                }
            } else if (strM2453.equals(m2408((char) (Process.myPid() >> 22), -MotionEvent.axisFromString(""), KeyEvent.keyCodeFromString("") + 773).intern())) {
                return m2390(new ew(eeVarM2379, m2375(list), cdoM2351));
            }
            this.f2021--;
        }
        return eeVarM2379;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private fk m2376(List<dx> list) {
        ArrayList arrayList = new ArrayList();
        dx dxVarM2367 = m2367(list);
        f2016 = (f2015 + 91) % 128;
        while (!dxVarM2367.m2451(m2408((char) (5237 - TextUtils.lastIndexOf("", '0', 0, 0)), 1 - Color.red(0), View.resolveSize(0, 0) + 764).intern())) {
            f2016 = (f2015 + 103) % 128;
            arrayList.add(m2402(list));
            dxVarM2367 = m2367(list);
        }
        this.f2021++;
        return (fk) m2386(new fk(arrayList));
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private fr m2377(List<dx> list) {
        m2394(list, m2408((char) ((Process.myPid() >> 22) + 51080), TextUtils.indexOf("", "", 0) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42).intern(), m2408((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, Color.alpha(0) + 726).intern());
        fr frVarM2386 = m2386(new fj());
        int i10 = f2016 + 67;
        f2015 = i10 % 128;
        if (i10 % 2 == 0) {
            return frVarM2386;
        }
        throw null;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private ee m2378(List<dx> list) {
        int i10 = f2015 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            m2373(list);
            m2369(list);
            throw null;
        }
        ee eeVarM2373 = m2373(list);
        if (m2369(list)) {
            Cdo cdoM2351 = Cdo.m2351(this.f2020, eeVarM2373.m2475());
            String strM2453 = m2368(list).m2453();
            int iHashCode = strM2453.hashCode();
            if (iHashCode != 37) {
                if (iHashCode != 42) {
                    if (iHashCode == 47 && strM2453.equals(m2408((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23400), AndroidCharacter.getMirror('0') - '/', TextUtils.lastIndexOf("", '0') + 787).intern())) {
                        ee eeVarM2390 = m2390(new et(eeVarM2373, m2378(list), cdoM2351));
                        int i11 = f2015 + 63;
                        f2016 = i11 % 128;
                        if (i11 % 2 != 0) {
                            return eeVarM2390;
                        }
                        throw null;
                    }
                } else if (strM2453.equals(m2408((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63318), -TextUtils.indexOf((CharSequence) "", '0'), Color.red(0) + 785).intern())) {
                    f2016 = (f2015 + 61) % 128;
                    return m2390(new fb(eeVarM2373, m2378(list), cdoM2351));
                }
            } else if (strM2453.equals(m2408((char) (57352 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 787).intern())) {
                return m2390(new eu(eeVarM2373, m2378(list), cdoM2351));
            }
            this.f2021--;
        }
        return eeVarM2373;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r2.equals(m2408((char) (android.widget.ExpandableListView.getPackedPositionGroup(0) + 47018), 1 - android.widget.ExpandableListView.getPackedPositionChild(0), android.view.View.MeasureSpec.getMode(0) + 781).intern()) != false) goto L24;
     */
    /* renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.ee m2379(java.util.List<com.ironsource.adqualitysdk.sdk.i.dx> r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.m2379(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private fr m2380(List<dx> list) {
        m2394(list, m2408((char) (18493 - Drawable.resolveOpacity(0, 0)), 1 - TextUtils.indexOf("", ""), 110 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2408((char) (View.getDefaultSize(0, 0) + 54171), 43 - ExpandableListView.getPackedPositionGroup(0L), 310 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        ee eeVarM2410 = m2410(list);
        m2394(list, m2408((char) (View.resolveSizeAndState(0, 0, 0) + 31737), -TextUtils.lastIndexOf("", '0'), 150 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m2408((char) KeyEvent.normalizeMetaState(0), 46 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 353).intern());
        fr frVarM2386 = m2386(new fw(eeVarM2410, m2402(list)));
        f2015 = (f2016 + 21) % 128;
        return frVarM2386;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private fr m2381(List<dx> list) {
        m2394(list, m2408((char) (51081 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 43 - TextUtils.getOffsetBefore("", 0)).intern(), m2408((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, 692 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
        fr frVarM2386 = m2386(new fn());
        int i10 = f2015 + 29;
        f2016 = i10 % 128;
        if (i10 % 2 != 0) {
            return frVarM2386;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private fr m2382(List<dx> list) {
        m2394(list, m2408((char) (41193 - TextUtils.indexOf("", "")), 1 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0)).intern(), m2408((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12115), 44 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 400).intern());
        fk fkVarM2376 = m2376(list);
        m2394(list, m2408((char) ((Process.getThreadPriority(0) + 20) >> 6), Drawable.resolveOpacity(0, 0) + 5, TextUtils.getTrimmedLength("") + 444).intern(), m2408((char) (2185 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.lastIndexOf("", '0', 0, 0) + 54, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 448).intern());
        m2394(list, m2408((char) (Color.argb(0, 0, 0, 0) + 18493), (ViewConfiguration.getTouchSlop() >> 8) + 1, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 110).intern(), m2408((char) ExpandableListView.getPackedPositionGroup(0L), 41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 502 - View.resolveSize(0, 0)).intern());
        dx dxVarM2368 = m2368(list);
        m2403(dxVarM2368, dx.e.f2094, fkVarM2376, m2408((char) View.getDefaultSize(0, 0), 27 - (ViewConfiguration.getPressedStateDuration() >> 16), 542 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        em emVar = (em) m2390(new em(dxVarM2368.m2453(), Cdo.m2351(this.f2020, dxVarM2368.m2455())));
        m2394(list, m2408((char) (31737 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.getOffsetAfter("", 0) + 1, Color.alpha(0) + 151).intern(), m2408((char) (ViewConfiguration.getPressedStateDuration() >> 16), 39 - ExpandableListView.getPackedPositionType(0L), Color.green(0) + 570).intern());
        m2394(list, m2408((char) (View.MeasureSpec.getSize(0) + 41193), 1 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "")).intern(), m2408((char) (26663 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 46 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 608 - ImageFormat.getBitsPerPixel(0)).intern());
        fr frVarM2386 = m2386(new fu(fkVarM2376, m2376(list), emVar));
        f2016 = (f2015 + 109) % 128;
        return frVarM2386;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private fr m2383(List<dx> list) {
        fr frVarM2386 = m2386(new fv(m2399(list, m2408((char) (51081 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1 - (ViewConfiguration.getPressedStateDuration() >> 16), 43 - View.resolveSize(0, 0)).intern(), new c<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.dr.4

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f2027 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2028 = 1;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2029 = {319, 370, 362, 351, 349, 366, 350, 282, 368, 347, 364, 355, 348, 358, 367};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f2030 = true;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2031 = 250;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static boolean f2032 = true;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m2414(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
                byte[] bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = bytes;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (m.f3159) {
                    try {
                        char[] cArr2 = f2029;
                        int i11 = f2031;
                        if (f2032) {
                            int length = bArr.length;
                            m.f3157 = length;
                            char[] cArr3 = new char[length];
                            m.f3158 = 0;
                            while (m.f3158 < m.f3157) {
                                int i12 = m.f3158;
                                int i13 = m.f3157 - 1;
                                int i14 = m.f3158;
                                cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                                m.f3158 = i14 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f2030) {
                            int length2 = cArr.length;
                            m.f3157 = length2;
                            char[] cArr4 = new char[length2];
                            m.f3158 = 0;
                            while (m.f3158 < m.f3157) {
                                int i15 = m.f3158;
                                int i16 = m.f3157 - 1;
                                int i17 = m.f3158;
                                cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                                m.f3158 = i17 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        m.f3157 = length3;
                        char[] cArr5 = new char[length3];
                        m.f3158 = 0;
                        while (m.f3158 < m.f3157) {
                            int i18 = m.f3158;
                            int i19 = m.f3157 - 1;
                            int i20 = m.f3158;
                            cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                            m.f3158 = i20 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                if ((r6 instanceof com.ironsource.adqualitysdk.sdk.i.dz) != false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r0 = r5.f2033;
                r2 = new java.lang.StringBuilder();
                r2.append(m2414(null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), null, "\u0088\u0087\u0084\u0089\u008c\u0084\u0085\u0084\u008b\u0088\u0086\u008f\u008d\u0088\u0084\u008e\u008d\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                r2.append(r6);
                com.ironsource.adqualitysdk.sdk.i.dr.m2391(r0, r2.toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
            
                if ((r6 instanceof com.ironsource.adqualitysdk.sdk.i.dz) != false) goto L14;
             */
            /* renamed from: ﾇ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private com.ironsource.adqualitysdk.sdk.i.ee m2415(java.util.List<com.ironsource.adqualitysdk.sdk.i.dx> r6) {
                /*
                    r5 = this;
                    com.ironsource.adqualitysdk.sdk.i.dr r0 = com.ironsource.adqualitysdk.sdk.i.dr.this
                    com.ironsource.adqualitysdk.sdk.i.ee r6 = r0.m2410(r6)
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.em
                    if (r0 != 0) goto L4a
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dr.AnonymousClass4.f2028
                    int r0 = r0 + 13
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dr.AnonymousClass4.f2027 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 == 0) goto L1f
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dz
                    r2 = 59
                    int r2 = r2 / r1
                    if (r0 == 0) goto L24
                    goto L4a
                L1f:
                    boolean r0 = r6 instanceof com.ironsource.adqualitysdk.sdk.i.dz
                    if (r0 == 0) goto L24
                    goto L4a
                L24:
                    com.ironsource.adqualitysdk.sdk.i.dr r0 = com.ironsource.adqualitysdk.sdk.i.dr.this
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    int r1 = android.view.Gravity.getAbsoluteGravity(r1, r1)
                    int r1 = 127 - r1
                    java.lang.String r3 = "\u0088\u0087\u0084\u0089\u008c\u0084\u0085\u0084\u008b\u0088\u0086\u008f\u008d\u0088\u0084\u008e\u008d\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081"
                    r4 = 0
                    java.lang.String r1 = m2414(r4, r1, r4, r3)
                    java.lang.String r1 = r1.intern()
                    r2.append(r1)
                    r2.append(r6)
                    java.lang.String r6 = r2.toString()
                    com.ironsource.adqualitysdk.sdk.i.dr.m2391(r0, r6)
                    return r4
                L4a:
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dr.AnonymousClass4.f2027
                    int r0 = r0 + 15
                    int r0 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dr.AnonymousClass4.f2028 = r0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.AnonymousClass4.m2415(java.util.List):com.ironsource.adqualitysdk.sdk.i.ee");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dr.c
            /* renamed from: ﻛ */
            public final /* synthetic */ ee mo2413(List list2) {
                int i10 = f2027 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f2028 = i10 % 128;
                if (i10 % 2 == 0) {
                    m2415(list2);
                    throw null;
                }
                ee eeVarM2415 = m2415(list2);
                f2028 = (f2027 + 25) % 128;
                return eeVarM2415;
            }
        })));
        f2015 = (f2016 + 107) % 128;
        return frVarM2386;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.fr m2384(java.util.List<com.ironsource.adqualitysdk.sdk.i.dx> r11) {
        /*
            r10 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dr.f2015
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dr.f2016 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r4 = 51080(0xc788, float:7.1578E-41)
            if (r0 != 0) goto L39
            com.ironsource.adqualitysdk.sdk.i.dx r0 = r10.m2367(r11)
            r5 = 1
            int r7 = android.widget.ExpandableListView.getPackedPositionGroup(r5)
            int r7 = r4 >> r7
            char r7 = (char) r7
            android.view.ViewConfiguration.getKeyRepeatTimeout()
            long r8 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            int r5 = r5 + 94
            java.lang.String r5 = m2408(r7, r1, r5)
            java.lang.String r5 = r5.intern()
            boolean r0 = r0.m2451(r5)
            if (r0 == 0) goto L6c
            goto L61
        L39:
            com.ironsource.adqualitysdk.sdk.i.dx r0 = r10.m2367(r11)
            int r5 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
            int r5 = r5 + r4
            char r5 = (char) r5
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = 1 - r6
            long r7 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            int r7 = 44 - r7
            java.lang.String r5 = m2408(r5, r6, r7)
            java.lang.String r5 = r5.intern()
            boolean r0 = r0.m2451(r5)
            if (r0 == 0) goto L6c
        L61:
            com.ironsource.adqualitysdk.sdk.i.fs r0 = new com.ironsource.adqualitysdk.sdk.i.fs
            r5 = 0
            r0.<init>(r5)
            com.ironsource.adqualitysdk.sdk.i.fr r0 = m2386(r0)
            goto L79
        L6c:
            com.ironsource.adqualitysdk.sdk.i.fs r0 = new com.ironsource.adqualitysdk.sdk.i.fs
            com.ironsource.adqualitysdk.sdk.i.ee r5 = r10.m2410(r11)
            r0.<init>(r5)
            com.ironsource.adqualitysdk.sdk.i.fr r0 = m2386(r0)
        L79:
            java.lang.String r5 = ""
            int r6 = android.text.TextUtils.indexOf(r5, r5)
            int r6 = r6 + r4
            char r4 = (char) r6
            int r6 = android.view.MotionEvent.axisFromString(r5)
            int r6 = -r6
            int r7 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r7 = r7 >> 16
            int r7 = 43 - r7
            java.lang.String r4 = m2408(r4, r6, r7)
            java.lang.String r4 = r4.intern()
            int r6 = android.view.ViewConfiguration.getScrollBarSize()
            int r6 = r6 >> 8
            char r6 = (char) r6
            int r5 = android.view.MotionEvent.axisFromString(r5)
            int r5 = r5 + 37
            long r7 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            int r2 = 656 - r2
            java.lang.String r2 = m2408(r6, r5, r2)
            java.lang.String r2 = r2.intern()
            r10.m2393(r11, r4, r0, r2)
            int r11 = com.ironsource.adqualitysdk.sdk.i.dr.f2015
            int r11 = r11 + 95
            int r2 = r11 % 128
            com.ironsource.adqualitysdk.sdk.i.dr.f2016 = r2
            int r11 = r11 % 2
            if (r11 != 0) goto Lc5
            r11 = 29
            int r11 = r11 / r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.m2384(java.util.List):com.ironsource.adqualitysdk.sdk.i.fr");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static fr m2386(fr frVar) {
        fr frVar2 = f2018.get(frVar);
        if (frVar2 == null) {
            int i10 = f2016 + 113;
            f2015 = i10 % 128;
            if (i10 % 2 != 0) {
                f2018.put(frVar, frVar);
                int i11 = 58 / 0;
            } else {
                f2018.put(frVar, frVar);
            }
        } else {
            frVar = frVar2;
        }
        f2015 = (f2016 + 83) % 128;
        return frVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Pair m2388(dr drVar, List list) {
        int i10 = f2015 + 9;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            drVar.m2374(list);
            throw null;
        }
        Pair<String, ee> pairM2374 = drVar.m2374(list);
        int i11 = f2015 + 87;
        f2016 = i11 % 128;
        if (i11 % 2 != 0) {
            return pairM2374;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m2400() {
        char[] cArr = new char[1307];
        com.google.android.gms.internal.play_billing.a.y(" \u0092\u0000mç´ÏÖ·\u001b\u009f+\u0087qnÆVÕ>ç&=\u000eSõÛÝ¿Åõ\u00ad\u0001\u0095J}|d\u0085L\u00924á\u001c1\u0004\u0005ë\u0097Óç»û£\u0006\u008bWs{Z³BØ*\u0010\u0012+ú\u0000á\u0082É¶±ò\u0099\u0010\u0081PikP²8Æ \rÇ³\u0000iç·\u0000fç¾ÏÐ\rjê¤ÂÖº\u0002\u0092<\u0000rç´ÏÖ·\u0006\u009f6\u0087{T\u0087³F\u009b\"ã÷ËÊÌ\u000b+Ö\u0003¤{oSEK\u0013¢û\u009aº±;Vì~\u0094\u0000vç°ÏÐ\u0000mç¸ÏÑ·\u0000\u009f-\u0087{n\u0081V\u0097>¯&b\u000e\rõÛÝ\u00adÅé\u00adN\u0095Z}~d\u0085L\u00924ì\u001c2\u0004\u0005ë\u0085Ó³»ù£\u001d\u008b_sfZ¹BÃ*\nH\u0015\u0000iç·Ï\u0082·\u0000\u009f0\u0087tn\u0092VÒ>å&<\u000eDõ\u008fÝìÅî\u00ad\u0006\u0095P}ed\u008dLÖ4£\u001c6\u0004@ëÖÓ¡»÷£\u0005\u008bVsdZ«BÈ*\u001a\u0012oúBá\u0088Éâ±ò\u0099D\u0081\u0012i.Pð{Ð\u0000iç·Ï\u0082·\u0000\u009f0\u0087tn\u0092VÒ>å&<\u000eDõ\u008fÝìÅþ\u00ad\u0001\u0095Q}td\u0088LÆ4ê\u001c;\u0004KëÖÓ´»ð£\u0006\u008bOsgZ¸B\u008d*\u001c\u0012*ú\u0000á\u0098É¬±à\u0099\r\u0081QicP÷8\u008f Q\bcð<\u0000eç½ÏÑ·\u0016\u0000fç¾ÏÐ·S\u009f7\u0087an\u0087VÃ>í&4\u000eOõ\u0095Ý¸Å½\u00ad\u001d\u0095W}\u007fd\u0094LÞ4ç\u001ct\u0004Gë\u0093Óç»þ£\u0006\u008bVsgZ³BÚ*\u001b\u0012+ú\u0000á\u0093É»±³\u0099\u0005\u0081\u0015i!Pÿ8\u008fV¯±w\u0099\u0019á\u009aÉîÑ³8A\u0000\u001ah(päX\u008a£]\u008bk\u0093tûÔÃ\u009e+¶2]\u001a\u0017b.J½R\u0089½Q\u0085jíqõ×Ý\u009a%¶\f}\u0014D|\u0090D½¬Î\u0000oç¡ÏÖ·\u001a\u009f+\u0087{n\u0087VÛ>¨&<\u000eRõ\u008bÝ¾Åø\u00ad\u001d\u0095L}yd\u008eLÜ4£\u001c'\u0004Më\u0099Ó²»ô£\r\u008b\u001asnZ²BÉ*^\u00128úIá\u0085Éª±³Óì4\"\u001cPd\u0084LºT®½\u000e\u0085Xírõ¶ÝÔ&\r\u000e2\u0016h~\u0081F\u0084®ø·\u0012\u009fFçmÏ£×Ú8M\u0000>hfpÒXÇ ÿ\u0089+\u0091Zù\u008aÁ£)Þ2\u000e\u001aybjJ\u0086R\u008eºü\u0083lë\u0014óÊÛö\u0000wç¹ÏË·\u001f\u009f!\u00875n\u0095VÃ>é&-\u000eOõ\u0096Ý©Åó\u00ad\u001a\u0095\u001f}sd\u008eLÜ4ç\u001c=\u0004Që\u009fÓ¨»ö£I\u008bIscZ³BØ*\u0012\u0012+ú\u0000á\u0093É§±³\u0099\r\u0081[iuP¾8Ì \u001c\bjð<×Ä¿\u0094§©/ È÷à\u008f\u0098\u0007°c¨5AÓy\u0097\u0011¹\t`!\u001bÚÁòìêé\u0082Wº\u001eR7KÁcÆ\u001bµ3e+QÄÁüü\u0094¡\u008cM¤\u0001\\*uæm\u009d\u0005\n=3Õ\u001dÎËæå\u009e®¶T®\u0004Fr\u007f¤\u0017\u0087\u000fP'9ßf\u0000cç°ÏÖ·\u0010\u009f,\býï*ÇR¿Ú\u0097¾\u008fèf\u000e^J6d.½\u0006Æý\u001cÕ1Í4¥\u0094\u009dÞuöl\u001dDW<n\u0014ý\fÎã\u001aÛn³w«\u008f\u0083ß{îR:JS\"\u0092\u001a¢ò\u0089é\u001aÁ2¹:\u0091\u008c\u0089\u009caìX?0U(\u0093\u0000«ø²ß\u0016·@¯f\u0087¢\u007fÜWåN>&D\u001e\u0089\u0000cç°ÏÖ·\u0010\u009f,\u00875n\u008dVÒ>ñ&.\u000eEõ\u0089Ý¨Å½\u00ad\u001d\u0095W}\u007fd\u0094LÞ4ç\u001ct\u0004Gë\u0093Óç»þ£\u0006\u008bVsgZ³BÚ*\u001b\u0012+ú\u0000á\u0093É»±³\u0099\u0005\u0081\u0015i!Pÿ8\u008f\u0000mç¸ÏÑ·\u0000\u009f-\u0087{n\u0081V\u0097>ë&8\u000e^õ\u0098Ý¤Å½\u00ad\u0018\u0095^}bd\u0088LÓ4á\u001c8\u0004@ëÖÓ©»ù£\u0004\u008b_\u0000cç°ÏÖ·\u0010\u009f,\u00875n\u0096VÖ>ú&8\u000eGõÛÝ¿Åõ\u00ad\u0001\u0095J}|d\u0085L\u00924á\u001c1\u0004\u0005ë\u0090Ó¨»ô£\u0005\u008bUs|Z¹BÉ*^\u0012-úYáÑÉ£±³\u0099C\u0081\u001ci!hE\u008f\u0096§ðß6÷\nï\u0013\u0006³>åVÏN\u000bfi\u009d°µ\u008f\u00adÕÅ<ý9\u0015[\f²$ç\\ÑtRla\u0083µ»ÁÓÝË ãq\u001b]2\u0095*þB6z\r\u0092&\u0089ÿ¡\u008dÙÛñ1éz\u0001D8\u0094P®Hx`\u0017\u0098@¿í×²\u0000rç´ÏÖ·\u0006\u009f6\u0087{nÆVÄ>ü&8\u000e^õ\u009eÝ¡Åø\u00ad\u0000\u0095K}0d\u0092LÚ4ì\u001c!\u0004Ië\u0092Óç»ý£\u0007\u008b^s+Z«BÄ*\n\u0012'ú\u0000áÖÉù±´\u0000bç£ÏÇ·\u0012\u009f/\u00875n\u0095VÃ>é&-\u000eOõ\u0096Ý©Åó\u00ad\u001a\u0095\u001f}cd\u0089LÝ4ö\u001c8\u0004AëÖÓ¢»ö£\r\u008b\u001as|ZµBÙ*\u0016\u0012oú\u0007áÊÉå\u0000cç¾ÏÌ·\u0007\u009f-\u0087{n\u0093VÒ>¨&*\u000e^õ\u009aÝ¸Åø\u00ad\u0003\u0095Z}~d\u0095L\u00924ð\u001c<\u0004Jë\u0083Ó«»ü£I\u008b_seZ¸B\u008d*\t\u0012&úTá\u0099Éâ±´\u0099_\u0081\u0012\u0014\u000b\u0000&ç÷&5Áä\u009e\u0003yÒÙ\u009c>Q\u0000<\u0000>\bAï\u0091tº\u0093h´²hõ·\u0081PP\u0000-çü÷}[Hà-\u0000.2w¥\u009d\u0000!\u0000mç¸ÏÑ·\u0000\u009f-\u0087{n\u0081V\u0097>ë&5\u000eEõ\u0088Ý¥Åó\u00ad\t\u0095\u001f}7dÈL\u0095¦j\u0000Uç¿ÏÇ·\u000b\u009f4\u0087pn\u0085VÃ>í&=\u000e\nõ\u0094Ý¼Åø\u00ad\u001c\u0095^}dd\u008eLÀ4£\u0000Uç¿ÏÇ·\u000b\u009f4\u0087pn\u0085VÃ>í&=\u000e\nõ\u008fÝ£Åö\u00ad\u000b\u0095Q}0\u0000Cç°Ï×·\u0014\u009f,\u0087anÆVÒ>ð&:\u000eOõ\u008bÝ¸Åô\u00ad\u0001\u0095Q\u0000Eç©ÏÒ·\u0016\u009f'\u0087an\u0083VÓ>¨&0\u000eNõ\u009eÝ¢Åé\u00ad\u0007\u0095Y}yd\u0084LÀ4£\u001c6\u0004Pë\u0082Óç»ÿ£\u0006\u008bNs+\u0000rç´ÏÄ·\u001f\u009f!\u0087vn\u0092VÞ>ç&7\u000e\nõ\u0098Ý Åü\u00ad\u001d\u0095L}0d\u008fLÓ4î\u001c1\u0004VëÖÓ´»ð£\u0006\u008bOsgZ¸B\u008d*\u001c\u0012*ú\u0000á\u0097É\u00ad±ÿ\u0099\b\u0081ZiqP²8Ì Y\b(ðb×Ì¿Ô§à\u008f)w__bF³.×\u0016\u001dþ*æxÍÇµ\u009f\u009d¡\u0085tm\u0005TÒ<ä$¹Î\u0085)R\u00016yöQÑI\u0091 y\u00981ð\nè\u008fÀ¯;e\u0013U\u000b\u001ecô[\u00ad³Æªu\u0082!úUÒÁÊ¿%o\u001dBu\u000bmûEì½\u008a\u0094C\u008c/äàÜ\u00994ñ/Z\u0007\u0013\u008dkj¡BË:\u001a\u000fæè1ÀG¸\u0083\u0090£\u0000sç¤ÏÒ·\u0016\u009f6\u00875n\u0095Vß>ç&,\u000eFõ\u009fÝìÅÿ\u00ad\u000b\u0095\u001f}vd\u008eLÞ4ï\u001c;\u0004Rë\u0093Ó£»¸£\u000b\u008bCs+Z½B\u008d*\u0013\u0012*úTá\u0099É\u00ad±÷\u0099D\u0081\\ihP¡8Ç \u001a\b+ðo×\u0085¿Ò§àÙ¾>R\u0016)níFÜ^\u009a·x\u008f(çSÿñ×¥,r\u0004^\u001c\btòLä¤\u0089½o\u0095=íXÅÈÝ±2y\n\u001cæÉ\u0000jç¢ÏÍ·\u001d\u009fd\u0087~n\u0083VÎ>¨&*\u000eBõ\u0094Ý¹Åñ\u00ad\n\u0095\u001f}rd\u0084L\u00924å\u001c;\u0004Ië\u009aÓ¨»ï£\f\u008b^s+Z¾BÔ*^\u0012.ú\u0000á\u0087É£±ÿ\u0099\u0011\u0081Pi&P¶8Î \r\b/ði×Ì¿\u009a§´\u008fx\n¶\u0000lç¸ÏÑ·\u0007\u009fd\u0087fn\u008eVØ>ý&5\u000eNõÛÝ©Åó\u00ad\n\u0095\u001f}gd\u0088LÆ4ë\u001ct\u0004\u0002\u000b¦B5¥ß\u008d§õkÝTÅ\u0010,å\u0014£|\u008dd]Lj·þ\u009fÂ\u0087\u0099ï.×0?\u0016&¡\u000e¦v\u008c^_F ©ø\u0091Ô\u0000Eç©ÏÁ·\u0016\u009f4\u0087an\u008fVØ>æ&y\u000e]õ\u0093Ý¥Åñ\u00ad\u000b\u0095\u001f}wd\u0084LÆ4÷\u001c=\u0004Kë\u0091Óç»ö£\f\u008bBs\u007fZüBÙ*\u0011\u0012$úEá\u009fQÅ¶)\u009eAæ\u0096Î´Öá?\u000f\u0007Xofwù_Ý¤\u0013\u008c%\u0094qü\u008bÄ\u009f,à5\u0004\u001dWehM½UËº\u0011\u0082gêyò\u009dÚ\u009a\"å\u000b9\u0013U{\u008aCï«Ô°\u001e\u0098)àvÈ\u008a\u0000 ç°ÏÄ·\u0007\u009f!\u0087gnÆ\u0000Eç©ÏÒ·\u0016\u009f'\u0087an\u0083VÓ>¨\u0000 ç³Ï×·\u0007\u009fd\u0087gn\u0083VÔ>í&0\u000e\\õ\u009eÝ¨Å½±=Vá~\u009f\u0000Pç°ÏÐ·\u0000\u009f!\u0087gnÉ\u0000Pç°ÏÐ·\u0000\u009f-\u0087{n\u0081V\u0097>î&8\u000eCõ\u0097Ý©Åù\u00adN\u0095[}ed\u0084L\u00924÷\u001c;\u0004\u0005ë\u0093Óµ»ê£\u0006\u008bHsx", "ISO-8859-1", cArr, 0, 1307);
        f2013 = cArr;
        f2014 = -6523822435983759407L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private fr m2402(List<dx> list) {
        String strM2453 = m2368(list).m2453();
        switch (strM2453.hashCode()) {
            case -934396624:
                if (strM2453.equals(m2408((char) TextUtils.indexOf("", "", 0), 6 - TextUtils.getTrimmedLength(""), 55 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return m2384(list);
                }
                break;
            case -567202649:
                if (strM2453.equals(m2408((char) (52328 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, (ViewConfiguration.getWindowTouchSlop() >> 8) + 65).intern())) {
                    f2016 = (f2015 + 35) % 128;
                    return m2377(list);
                }
                break;
            case 59:
                if (strM2453.equals(m2408((char) (51080 - TextUtils.indexOf("", "")), 1 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 44).intern())) {
                    return m2386(new fo(null));
                }
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                if (strM2453.equals(m2408((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 41193), 1 - (ViewConfiguration.getLongPressTimeout() >> 16), ViewConfiguration.getEdgeSlop() >> 16).intern())) {
                    f2015 = (f2016 + 89) % 128;
                    return m2376(list);
                }
                break;
            case 3357:
                if (strM2453.equals(m2408((char) Color.green(0), 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), 44 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    return m2407(list);
                }
                break;
            case 101577:
                if (strM2453.equals(m2408((char) View.resolveSizeAndState(0, 0, 0), 3 - Color.alpha(0), Color.rgb(0, 0, 0) + 16777262).intern())) {
                    f2015 = (f2016 + 7) % 128;
                    return m2396(list);
                }
                break;
            case 115131:
                if (strM2453.equals(m2408((char) (45391 - (Process.myTid() >> 22)), 3 - (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) + 16777289).intern())) {
                    int i10 = f2016 + 105;
                    f2015 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return m2382(list);
                    }
                }
                break;
            case 116519:
                if (strM2453.equals(m2408((char) KeyEvent.normalizeMetaState(0), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 75 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    f2016 = (f2015 + 103) % 128;
                    return m2383(list);
                }
                break;
            case 94001407:
                if (strM2453.equals(m2408((char) (21733 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 5 - TextUtils.indexOf("", ""), 60 - View.getDefaultSize(0, 0)).intern())) {
                    f2015 = (f2016 + 3) % 128;
                    return m2381(list);
                }
                break;
            case 113101617:
                if (strM2453.equals(m2408((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 3357), TextUtils.lastIndexOf("", '0', 0, 0) + 6, Drawable.resolveOpacity(0, 0) + 49).intern())) {
                    return m2380(list);
                }
                break;
        }
        this.f2021--;
        ee eeVarM2410 = m2410(list);
        m2393(list, m2408((char) (51080 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 1 - View.getDefaultSize(0, 0), 43 - Color.blue(0)).intern(), eeVarM2410, m2408((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 79 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        return m2386(new fo(eeVarM2410));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ee m2405(dr drVar, List list) {
        int i10 = f2015 + 23;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            drVar.m2372(list);
            throw null;
        }
        ee eeVarM2372 = drVar.m2372(list);
        f2016 = (f2015 + 83) % 128;
        return eeVarM2372;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2391(dr drVar, String str) {
        int i10 = f2015 + 71;
        f2016 = i10 % 128;
        int i11 = i10 % 2;
        drVar.m2392(str);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f2016 + 95;
        f2015 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 66 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f7  */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.adqualitysdk.sdk.i.fr m2407(java.util.List<com.ironsource.adqualitysdk.sdk.i.dx> r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.m2407(java.util.List):com.ironsource.adqualitysdk.sdk.i.fr");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static ee m2390(ee eeVar) {
        f2016 = (f2015 + 85) % 128;
        ee eeVar2 = f2017.get(eeVar);
        if (eeVar2 != null) {
            return eeVar2;
        }
        f2016 = (f2015 + 91) % 128;
        f2017.put(eeVar, eeVar);
        return eeVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final fk m2409(List<dx> list) {
        f2016 = (f2015 + 103) % 128;
        this.f2021 = 0;
        m2394(list, m2408((char) (View.resolveSizeAndState(0, 0, 0) + 41193), (ViewConfiguration.getTouchSlop() >> 8) + 1, ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), m2408((char) ExpandableListView.getPackedPositionType(0L), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -TextUtils.lastIndexOf("", '0', 0)).intern());
        fk fkVarM2376 = m2376(list);
        int i10 = f2016 + 31;
        f2015 = i10 % 128;
        if (i10 % 2 == 0) {
            return fkVarM2376;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private fr m2396(List<dx> list) {
        m2394(list, m2408((char) (18493 - View.combineMeasuredStates(0, 0)), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getTrimmedLength("") + 110).intern(), m2408((char) KeyEvent.keyCodeFromString(""), 41 - (ViewConfiguration.getTouchSlop() >> 8), 200 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        ee eeVarM2406 = m2406(list, m2408((char) (51080 - (Process.myPid() >> 22)), 1 - TextUtils.indexOf("", "", 0), 43 - (Process.myTid() >> 22)).intern());
        ee eeVarM2410 = m2410(list);
        m2393(list, m2408((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51081), KeyEvent.normalizeMetaState(0) + 1, 43 - (Process.myPid() >> 22)).intern(), eeVarM2410, m2408((char) (TextUtils.indexOf("", "", 0, 0) + 22217), 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.resolveSize(0, 0) + 241).intern());
        fr frVarM2386 = m2386(new fp(eeVarM2406, eeVarM2410, m2406(list, m2408((char) (31737 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 1, (ViewConfiguration.getWindowTouchSlop() >> 8) + 151).intern()), m2402(list)));
        int i10 = f2015 + 75;
        f2016 = i10 % 128;
        if (i10 % 2 != 0) {
            return frVarM2386;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ee m2410(List<dx> list) {
        ee eeVarM2375 = m2375(list);
        if (m2369(list)) {
            Cdo cdoM2351 = Cdo.m2351(this.f2020, eeVarM2375.m2475());
            String strM2453 = m2368(list).m2453();
            int iHashCode = strM2453.hashCode();
            if (iHashCode != 1216) {
                if (iHashCode == 3968 && strM2453.equals(m2408((char) (9800 - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionGroup(0L) + 2, Color.green(0) + 767).intern())) {
                    f2015 = (f2016 + 73) % 128;
                    return m2390(new ez(eeVarM2375, m2410(list), cdoM2351));
                }
            } else if (strM2453.equals(m2408((char) (ImageFormat.getBitsPerPixel(0) + 1), 2 - TextUtils.indexOf("", ""), TextUtils.indexOf("", "", 0) + 765).intern())) {
                f2015 = (f2016 + 57) % 128;
                return m2390(new ek(eeVarM2375, m2410(list), cdoM2351));
            }
            this.f2021--;
        }
        return eeVarM2375;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ee m2385(ee eeVar, List<dx> list) {
        List<ee> listM2371;
        dx dxVarM2368 = m2368(list);
        if (!dxVarM2368.m2444()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2408((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - Color.green(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 865).intern());
            sb2.append(dxVarM2368);
            m2404(sb2.toString(), (Throwable) null);
        }
        String strM2453 = dxVarM2368.m2453();
        dx dxVarM23682 = m2368(list);
        if (dxVarM23682.m2451(m2408((char) (Process.getGidForName("") + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, 772 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
            listM2371 = m2371(list);
            m2393(list, m2408((char) (18493 - ExpandableListView.getPackedPositionGroup(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, View.MeasureSpec.getMode(0) + 110).intern(), listM2371, m2408((char) Color.argb(0, 0, 0, 0), 63 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 893 - Gravity.getAbsoluteGravity(0, 0)).intern());
        } else {
            if (!dxVarM23682.m2451(m2408((char) (18493 - TextUtils.indexOf("", "", 0)), Color.blue(0) + 1, View.MeasureSpec.getSize(0) + 110).intern())) {
                this.f2021--;
                ee eeVarM2390 = m2390(new ea(eeVar, strM2453, Cdo.m2351(strM2453, dxVarM23682.m2455())));
                int i10 = f2016 + 59;
                f2015 = i10 % 128;
                if (i10 % 2 == 0) {
                    return eeVarM2390;
                }
                throw null;
            }
            listM2371 = null;
        }
        ee eeVarM23902 = m2390(new eb(eeVar, strM2453, listM2371, m2398(list, m2408((char) (31737 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1 - TextUtils.indexOf("", "", 0), 152 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()), Cdo.m2351(strM2453, dxVarM23682.m2455())));
        int i11 = f2016 + 1;
        f2015 = i11 % 128;
        if (i11 % 2 == 0) {
            return eeVarM23902;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private ee m2395(dx dxVar, List<dx> list) {
        f2015 = (f2016 + 5) % 128;
        String strM2453 = dxVar.m2453();
        int iHashCode = strM2453.hashCode();
        if (iHashCode == 3392903) {
            if (strM2453.equals(m2408((char) (36101 - TextUtils.indexOf("", "")), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) + 992).intern())) {
                return fl.m2512();
            }
            return null;
        }
        if (iHashCode != 109801339 || !strM2453.equals(m2408((char) (3989 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 5 - TextUtils.getTrimmedLength(""), 996 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
            return null;
        }
        m2393(list, m2408((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 788).intern(), dxVar, m2408((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 48, View.combineMeasuredStates(0, 0) + 1000).intern());
        ee eeVarM2385 = m2385(m2390(new em(m2408((char) (3988 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.myTid() >> 22) + 5, 995 - Gravity.getAbsoluteGravity(0, 0)).intern(), Cdo.m2351(this.f2020, dxVar.m2455()))), list);
        f2016 = (f2015 + 47) % 128;
        return eeVarM2385;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ee m2406(List<dx> list, String str) {
        int i10 = f2015 + 109;
        f2016 = i10 % 128;
        if (i10 % 2 != 0) {
            if (m2367(list).m2451(str)) {
                return null;
            }
            ee eeVarM2410 = m2410(list);
            m2393(list, str, eeVarM2410, com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2408((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 36 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 274 - View.resolveSizeAndState(0, 0, 0)), str));
            f2016 = (f2015 + 21) % 128;
            return eeVarM2410;
        }
        m2367(list).m2451(str);
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ee m2389(dx dxVar) {
        int i10 = f2016 + 39;
        f2015 = i10 % 128;
        if (i10 % 2 == 0) {
            Cdo cdoM2351 = Cdo.m2351(this.f2020, dxVar.m2455());
            if (dxVar.m2448()) {
                try {
                    try {
                        ee eeVarM2390 = m2390(new ff(Integer.valueOf(Integer.parseInt(dxVar.m2453())), cdoM2351));
                        int i11 = f2016 + 51;
                        f2015 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 3 / 0;
                        }
                        return eeVarM2390;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    return m2390(new fh(Long.valueOf(Long.parseLong(dxVar.m2453())), cdoM2351));
                }
            } else {
                if (dxVar.m2447()) {
                    return m2390(new fe(Double.valueOf(Double.parseDouble(dxVar.m2453())), cdoM2351));
                }
                if (dxVar.m2445()) {
                    return m2390(new fg(Boolean.valueOf(Boolean.parseBoolean(dxVar.m2453())), cdoM2351));
                }
            }
            return m2390(new fm(dxVar.m2453(), cdoM2351));
        }
        Cdo.m2351(this.f2020, dxVar.m2455());
        dxVar.m2448();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<ee> m2398(List<dx> list, String str) {
        List<ee> listM2399 = m2399(list, str, new c<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.dr.3
            @Override // com.ironsource.adqualitysdk.sdk.i.dr.c
            /* renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ ee mo2413(List list2) {
                return dr.this.m2410((List<dx>) list2);
            }
        });
        f2016 = (f2015 + 93) % 128;
        return listM2399;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private <T> List<T> m2399(List<dx> list, String str, c<T> cVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        if (!m2368(list).m2451(str)) {
            int i11 = f2015 + 39;
            f2016 = i11 % 128;
            if (i11 % 2 == 0) {
                i10 = this.f2021;
            } else {
                i10 = this.f2021 - 1;
            }
            this.f2021 = i10;
            arrayList.add(cVar.mo2413(list));
            dx dxVarM2368 = m2368(list);
            f2015 = (f2016 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            while (dxVarM2368.m2451(m2408((char) (2713 - TextUtils.indexOf((CharSequence) "", '0')), 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 1120).intern())) {
                int i12 = f2016 + 115;
                f2015 = i12 % 128;
                if (i12 % 2 != 0) {
                    arrayList.add(cVar.mo2413(list));
                    dxVarM2368 = m2368(list);
                    int i13 = 50 / 0;
                } else {
                    arrayList.add(cVar.mo2413(list));
                    dxVarM2368 = m2368(list);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2408((char) Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1120).intern());
            sb2.append(str);
            m2387(dxVarM2368, str, arrayList, com.google.android.gms.internal.play_billing.a.i(m2408((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2945), TextUtils.getOffsetAfter("", 0) + 1, 1143 - View.resolveSizeAndState(0, 0, 0)), sb2));
        }
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2387(dx dxVar, String str, Object obj, String str2) {
        int i10 = f2016 + 67;
        f2015 = i10 % 128;
        if (i10 % 2 != 0) {
            dxVar.m2451(str);
            throw null;
        }
        if (dxVar.m2451(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2408((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2945), 1 - Color.green(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 1144).intern());
        sb2.append(str);
        String strI = com.google.android.gms.internal.play_billing.a.i(m2408((char) (TextUtils.getCapsMode("", 0, 0) + 2945), 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1143 - (ViewConfiguration.getTapTimeout() >> 16)), sb2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2408((char) ((Process.myPid() >> 22) + 2945), (KeyEvent.getMaxKeyCode() >> 16) + 1, (Process.myTid() >> 22) + 1143).intern());
        sb3.append(dxVar.m2453());
        m2392(m2397(strI, com.google.android.gms.internal.play_billing.a.i(m2408((char) (2944 - TextUtils.lastIndexOf("", '0', 0, 0)), 1 - (Process.myTid() >> 22), 1143 - KeyEvent.keyCodeFromString("")), sb3), obj, str2));
        f2015 = (f2016 + 35) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2394(List<dx> list, String str, String str2) {
        f2016 = (f2015 + 101) % 128;
        m2393(list, str, null, str2);
        int i10 = f2015 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2408(char c10, int i10, int i11) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1373) {
            try {
                char[] cArr = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.c.f1374 = 0;
                while (true) {
                    int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2013[i11 + i12] ^ (i12 * f2014)) ^ c10);
                        com.ironsource.adqualitysdk.sdk.i.c.f1374 = i12 + 1;
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2393(List<dx> list, String str, Object obj, String str2) {
        f2015 = (f2016 + 89) % 128;
        m2387(m2368(list), str, obj, str2);
        int i10 = f2015 + 115;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ee m2401(ee eeVar, List<dx> list) {
        f2015 = (f2016 + 113) % 128;
        ee eeVarM2410 = m2410(list);
        m2393(list, m2408((char) (42551 - TextUtils.getCapsMode("", 0, 0)), 1 - (Process.myPid() >> 22), 811 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), eeVarM2410, m2408((char) (52982 - TextUtils.getOffsetAfter("", 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36, (ViewConfiguration.getTapTimeout() >> 16) + 956).intern());
        dx dxVarM2368 = m2368(list);
        Cdo cdoM2351 = Cdo.m2351(this.f2020, dxVarM2368.m2455());
        if (dxVarM2368.m2451(m2408((char) (42400 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.red(0) + 790).intern())) {
            ee eeVarM2390 = m2390(new ei(eeVar, eeVarM2410, m2410(list), cdoM2351));
            f2015 = (f2016 + 29) % 128;
            return eeVarM2390;
        }
        this.f2021--;
        return m2390(new ef(eeVar, eeVarM2410, cdoM2351));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2392(String str) {
        int i10 = f2016 + 51;
        f2015 = i10 % 128;
        int i11 = i10 % 2;
        m2404(str, (Throwable) null);
        if (i11 != 0) {
            int i12 = 25 / 0;
        }
        int i13 = f2015 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2016 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 81 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m2397(java.lang.String r7, java.lang.String r8, java.lang.Object r9, java.lang.String r10) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.dr.f2015
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dr.f2016 = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            r2 = 0
            if (r0 != 0) goto L15
            r0 = 19
            int r0 = r0 / r2
            if (r9 == 0) goto L42
            goto L17
        L15:
            if (r9 == 0) goto L42
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = android.view.ViewConfiguration.getPressedStateDuration()
            int r3 = r3 >> 16
            char r3 = (char) r3
            int r4 = android.view.View.combineMeasuredStates(r2, r2)
            int r4 = 7 - r4
            int r5 = android.view.View.getDefaultSize(r2, r2)
            int r5 = r5 + 1239
            java.lang.String r3 = m2408(r3, r4, r5)
            java.lang.String r3 = r3.intern()
            r0.append(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto L43
        L42:
            r9 = r1
        L43:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r3 = r3 >> 16
            char r3 = (char) r3
            int r4 = android.view.KeyEvent.getMaxKeyCode()
            int r4 = r4 >> 16
            int r4 = r4 + 9
            r5 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r1, r5, r2)
            int r5 = 1245 - r5
            java.lang.String r3 = m2408(r3, r4, r5)
            java.lang.String r3 = r3.intern()
            r0.append(r3)
            r0.append(r7)
            r0.append(r9)
            int r7 = android.graphics.Color.red(r2)
            char r7 = (char) r7
            int r9 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r9 = r9 >> 16
            int r9 = r9 + 14
            int r3 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r3 = r3 >> 16
            int r3 = 1255 - r3
            java.lang.String r7 = m2408(r7, r9, r3)
            java.lang.String r7 = r7.intern()
            r0.append(r7)
            r0.append(r8)
            if (r10 == 0) goto Lbf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 45341(0xb11d, float:6.3536E-41)
            int r9 = android.view.KeyEvent.normalizeMetaState(r2)
            int r9 = r9 + r8
            char r8 = (char) r9
            long r3 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r9 = 4 - r9
            float r1 = android.util.TypedValue.complexToFloat(r2)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            int r1 = r1 + 1269
            java.lang.String r8 = m2408(r8, r9, r1)
            java.lang.String r1 = com.google.android.gms.internal.play_billing.a.k(r7, r8, r10)
            goto Lc7
        Lbf:
            int r7 = com.ironsource.adqualitysdk.sdk.i.dr.f2015
            int r7 = r7 + 33
            int r7 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.dr.f2016 = r7
        Lc7:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.m2397(java.lang.String, java.lang.String, java.lang.Object, java.lang.String):java.lang.String");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2403(dx dxVar, dx.e eVar, Object obj, String str) {
        if (!dxVar.m2454().equals(eVar)) {
            f2016 = (f2015 + 31) % 128;
            m2392(m2397(eVar.toString(), dxVar.m2454().toString(), obj, str));
        }
        int i10 = f2015 + 49;
        f2016 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2404(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2408((char) (ViewConfiguration.getLongPressTimeout() >> 16), 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 1272).intern());
        sb2.append(this.f2019);
        sb2.append(m2408((char) (23399 - Gravity.getAbsoluteGravity(0, 0)), -TextUtils.lastIndexOf("", '0'), 786 - View.combineMeasuredStates(0, 0)).intern());
        sb2.append(this.f2020);
        co.m1955(sb2.toString(), str, th2);
        throw new RuntimeException(m2408((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 28 - View.resolveSizeAndState(0, 0, 0), 1279 - View.getDefaultSize(0, 0)).intern(), th2);
    }
}
