package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class iv extends BroadcastReceiver {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2770 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2771 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2772;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2773;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f2774;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String f2775;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2776;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Context f2777;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2778 = false;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Set<iq> f2779 = new HashSet();

    static {
        m2845();
        f2775 = m2848("㙃济䳣紈轨ʟ朽둕濲ꒂꔇ\u20fc듣ꊡ杺ꗝ쳐ࢹ䂮逅", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19).intern();
        int i10 = f2771 + 61;
        f2772 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
    }

    public iv(Context context) {
        this.f2777 = context.getApplicationContext();
        k.m3136(f2775, m2848("\ue9fcᄴ\ued9eꞔ뵔ﲊꃉ뎎沸樓॥\ue323䥂켁撱滑뫿‘\u1a5f벸頎鯄ꅐ뤰勏쏫ᙄ\ueb1b뀊\ue767", 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m2848("콶朗鮕㺯ጌ\udbae拳븉춤퓲ᐉ钩准撨䭱⺀ꄿ室ퟀ\u0ce4⒭즩㞽䝼걃\ueb7b녻䘃셋ު둻䭖꾏\ua7e1挆鬠", ImageFormat.getBitsPerPixel(0) + 37).intern());
        this.f2777.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static void m2845() {
        f2770 = (char) 13829;
        f2773 = (char) 12505;
        f2774 = (char) 25300;
        f2776 = (char) 60301;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private synchronized Set<iq> m2846() {
        HashSet hashSet = new HashSet(this.f2779);
        int i10 = f2772 + 69;
        f2771 = i10 % 128;
        if (i10 % 2 != 0) {
            return hashSet;
        }
        int i11 = 10 / 0;
        return hashSet;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2850(iv ivVar, Context context) {
        boolean zM2853;
        int i10 = f2772 + 15;
        f2771 = i10 % 128;
        if (i10 % 2 == 0) {
            zM2853 = m2853(context);
            int i11 = 80 / 0;
        } else {
            zM2853 = m2853(context);
        }
        int i12 = f2772 + 5;
        f2771 = i12 % 128;
        if (i12 % 2 != 0) {
            return zM2853;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2851() {
        int i10 = f2772;
        int i11 = i10 + 101;
        f2771 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = f2775;
        f2771 = (i10 + 83) % 128;
        return str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.4

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f2780 = -1189240753;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f2781 = 0;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static byte[] f2782 = {-68, -28, -29, 23, -29, 31, -2, 28, 31, 17, -23, 23, -17, 11, -28, -19, 26, -27, 22, 15, -38, 26, -27, 22, 47, -96, 21, -19, 90, -48, -31, -32, -25, 20, -20, 23, -77, -52, -53, Utf8.REPLACEMENT_BYTE, -53, 55, 113, -107, 55, 57, -63, Utf8.REPLACEMENT_BYTE, -57, 35, -52, -59, 50, -51, 62, 113, -121, -53, 49, -54, 49, 61, 37, -90, -114, -128, 120, -122, 126, -102, 117, 124, -117, 116, -89, 95, -118, -73, -74, -72, 64, -66, 70, -94, 77, 68, -77, 76, -65, -16, 6, 74, -80, 75, -80, -68, 68, -3, 2, -78, -3, 30, -1, 113, 64, -66, 78, -89, -86, -25, 5, 12, 10, -10, 27, -20, -9, 71, -70, 13, 65, -90, 11, -11, 8, 37};

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static short[] f2783 = null;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f2784 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f2785 = 104;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f2786 = -957716683;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m2860(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (n.f3160) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f2785;
                        int i14 = i10 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f2782;
                            i14 = bArr != null ? (byte) (bArr[f2786 + i11] + i13) : (short) (f2783[f2786 + i11] + i13);
                        }
                        if (i14 > 0) {
                            n.f3165 = ((i11 + i14) - 2) + f2786 + i15;
                            n.f3163 = b10;
                            char c10 = (char) (i12 + f2780);
                            n.f3162 = c10;
                            sb2.append(c10);
                            n.f3161 = n.f3162;
                            n.f3164 = 1;
                            while (n.f3164 < i14) {
                                byte[] bArr2 = f2782;
                                if (bArr2 != null) {
                                    int i16 = n.f3165;
                                    n.f3165 = i16 - 1;
                                    n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                                } else {
                                    short[] sArr = f2783;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                try {
                    if (intent.getAction().equals(m2860((-105) - (Process.myPid() >> 22), (short) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 957716684, (byte) (26 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf((CharSequence) "", '0') + 1189240851).intern())) {
                        f2784 = (f2781 + 37) % 128;
                        k.m3142(iv.m2851(), m2860(Color.red(0) - 105, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), KeyEvent.getDeadChar(0, 0) + 957716719, (byte) ('b' - AndroidCharacter.getMirror('0')), 1189240831 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                        if (intent.getBooleanExtra(m2860((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 105, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 957716746 - (ViewConfiguration.getTouchSlop() >> 8), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 118), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1189240863).intern(), false)) {
                            k.m3142(iv.m2851(), m2860((-105) - View.combineMeasuredStates(0, 0), (short) View.MeasureSpec.makeMeasureSpec(0, 0), 957716760 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((-77) - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1189240837 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.4.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    iv.this.m2856();
                                    iv.m2852(iv.this, false);
                                }
                            });
                        } else if (iv.m2850(iv.this, context)) {
                            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.4.1
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    iv.m2852(iv.this, true);
                                    iv.this.m2858();
                                }
                            });
                            f2781 = (f2784 + 93) % 128;
                        } else {
                            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iv.4.4
                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() {
                                    iv.m2852(iv.this, false);
                                    iv.this.m2856();
                                }
                            });
                            f2781 = (f2784 + 105) % 128;
                        }
                    }
                } catch (Exception e10) {
                    kd.m3203(iv.m2851(), m2860((-105) - View.resolveSize(0, 0), (short) TextUtils.indexOf("", "", 0), 957716791 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9), 1189240822 - (Process.myPid() >> 22)).intern(), e10, false);
                }
            }
        });
        f2772 = (f2771 + 17) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2854(iq iqVar) {
        try {
            int i10 = f2771 + 1;
            f2772 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2779.add(iqVar);
                int i11 = 69 / 0;
            } else {
                this.f2779.add(iqVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2857(iq iqVar) {
        int i10 = f2772 + 77;
        f2771 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f2779.remove(iqVar);
            throw null;
        }
        this.f2779.remove(iqVar);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m2859() {
        int i10 = f2771 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2772 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f2777.unregisterReceiver(this);
            throw null;
        }
        this.f2777.unregisterReceiver(this);
        int i11 = f2771 + 81;
        f2772 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2852(iv ivVar, boolean z10) {
        f2772 = (f2771 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        ivVar.m2849(z10);
        f2771 = (f2772 + 39) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2853(Context context) {
        f2772 = (f2771 + 37) % 128;
        NetworkInfo networkInfoM2847 = m2847(context);
        if (networkInfoM2847 != null) {
            int i10 = f2771 + 115;
            f2772 = i10 % 128;
            if (i10 % 2 != 0) {
                networkInfoM2847.isConnected();
                throw null;
            }
            if (networkInfoM2847.isConnected()) {
                String str = f2775;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2848("㙃济䳣紈轨ʟ摝祟", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9).intern());
                sb2.append(networkInfoM2847.getTypeName());
                sb2.append(m2848("幖䕾ꈤ줙춤퓲鄓ᒀ돒\uf2eb竻⌠", 11 - Color.blue(0)).intern());
                k.m3142(str, sb2.toString());
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m2855() {
        boolean z10;
        int i10 = (f2771 + 7) % 128;
        f2772 = i10;
        z10 = this.f2778;
        f2771 = (i10 + 15) % 128;
        return z10;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2856() {
        Iterator<iq> it = m2846().iterator();
        f2771 = (f2772 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        while (it.hasNext()) {
            f2771 = (f2772 + 55) % 128;
            it.next();
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2858() {
        Iterator<iq> it = m2846().iterator();
        while (it.hasNext()) {
            it.next().mo765();
            f2771 = (f2772 + 27) % 128;
        }
        f2772 = (f2771 + 13) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m2849(boolean z10) {
        int i10 = f2772;
        int i11 = i10 + 33;
        f2771 = i11 % 128;
        if (i11 % 2 == 0) {
            this.f2778 = z10;
            throw null;
        }
        this.f2778 = z10;
        f2771 = (i10 + 23) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static NetworkInfo m2847(Context context) {
        int i10 = f2772 + 33;
        f2771 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(m2848("准撨䭱⺀ꅐ뤰鬲ၕ\udf55㙌盇鶴", View.resolveSizeAndState(0, 0, 0) + 12).intern())).getActiveNetworkInfo();
        int i11 = f2772 + 103;
        f2771 = i11 % 128;
        if (i11 % 2 != 0) {
            return activeNetworkInfo;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2848(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2770)) ^ ((c11 >>> 5) + f2774)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2773) ^ ((c12 + i12) ^ ((c12 << 4) + f2776))));
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
