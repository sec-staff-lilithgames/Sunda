package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ij {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2728 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2729;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f2730;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Object f2731;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static ij f2732;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f2733;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private final Handler f2734;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final Context f2739;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2738 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2735 = new HashMap<>();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final HashMap<String, ArrayList<b>> f2737 = new HashMap<>();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final ArrayList<c> f2736 = new ArrayList<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2741 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2742;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f2743 = {485328589, -1673035864, 819681568, -946934813, 1759404449, -663451268, 1444110866, 1551429464, 956207766, -1954172214, -1744601474, 949565856, 1478976832, -1089543108, 1888201248, -40742774, 812107891, 1924333627};

        /* renamed from: ﻛ, reason: contains not printable characters */
        boolean f2744;

        /* renamed from: ｋ, reason: contains not printable characters */
        final BroadcastReceiver f2745;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final IntentFilter f2746;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2830(int[] iArr, int i10) {
            String str;
            synchronized (d.f1845) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2743.clone();
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

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(m2830(new int[]{-328711423, -1737740282, 1192311182, 1645251307, -1377714264, -279532661}, Gravity.getAbsoluteGravity(0, 0) + 9).intern());
            sb2.append(this.f2745);
            sb2.append(m2830(new int[]{-1998460702, 1812817390, 954893831, -297017669}, ExpandableListView.getPackedPositionType(0L) + 8).intern());
            sb2.append(this.f2746);
            String strI = com.google.android.gms.internal.play_billing.a.i(m2830(new int[]{54226400, -1236242686}, -TextUtils.lastIndexOf("", '0', 0, 0)), sb2);
            int i10 = f2742 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2741 = i10 % 128;
            if (i10 % 2 != 0) {
                return strI;
            }
            throw null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: ﾇ, reason: contains not printable characters */
        final ArrayList<b> f2747;

        /* renamed from: ﾒ, reason: contains not printable characters */
        final Intent f2748;

        public c(Intent intent, ArrayList<b> arrayList) {
            this.f2748 = intent;
            this.f2747 = arrayList;
        }
    }

    static {
        m2821();
        f2731 = new Object();
        f2729 = (f2728 + 73) % 128;
    }

    private ij(Context context) {
        this.f2739 = context;
        this.f2734 = new Handler(context.getMainLooper()) { // from class: com.ironsource.adqualitysdk.sdk.i.ij.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    ij.m2826(ij.this);
                }
            }
        };
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m2821() {
        f2730 = 1408749369287217145L;
        f2733 = new char[]{28, AbstractJsonLexerKt.BEGIN_LIST, 131, 141, 143, 'c', AbstractJsonLexerKt.STRING_ESC, 131, 132, 136, 138, 134, 138, 133, 't', '7', 'n', 'l', 'n', 'k', 'R', '0', '-', 'W', GMTDateParser.SECONDS, 'n', 'j', 'F', '0', 'b', 'k', 'n', 'l', 'n', 'p', 233, 233, 225, '`', 191, 198, 205, 202, 205, 205, 200, 200, 202, 207, 206, 163, 165, '@', AbstractJsonLexerKt.END_OBJ, GMTDateParser.ZONE, 'S', 'N', 'r', 'r', 'N', 'U', 'w', 'x', '|', 'v', 'c', '?', AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA, '9', AbstractJsonLexerKt.END_LIST, 'q', 'w', 'v', GMTDateParser.SECONDS, 'R'};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ij m2822(Context context) {
        ij ijVar;
        synchronized (f2731) {
            try {
                if (f2732 == null) {
                    f2732 = new ij(context.getApplicationContext());
                }
                ijVar = f2732;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ijVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2826(ij ijVar) {
        int i10 = f2728 + 45;
        f2729 = i10 % 128;
        int i11 = i10 % 2;
        ijVar.m2819();
        if (i11 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2827(Intent intent) {
        String str;
        int i10;
        String str2;
        int i11;
        String strIntern;
        String str3;
        Uri uri;
        String strIntern2 = m2825("辵댁\uf6b4㩝緉ꅈ\ue401➷欠껒퉼ᗥ增鰦\udff6́䛧覟촀\uf0a9㑇", 15510 - ((byte) KeyEvent.getModifierMetaStateMask())).intern();
        if (!this.f2738) {
            return false;
        }
        synchronized (this.f2735) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2739.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2820("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001", true, new int[]{0, 15, 25, 0}).intern());
                    sb2.append(strResolveTypeIfNeeded);
                    sb2.append(m2825("这酋눘폒\uf498ᙑ㜚增", 7873 - Gravity.getAbsoluteGravity(0, 0)).intern());
                    sb2.append(scheme);
                    sb2.append(m2825("这鹭걩먨졼홰\ue46f\uf241O\u2e5e㰗", (Process.myTid() >> 22) + 4603).intern());
                    sb2.append(intent);
                    Log.v(strIntern2, sb2.toString());
                }
                ArrayList<b> arrayList = this.f2737.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder();
                        str = action;
                        sb3.append(m2820("\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{15, 13, 0, 6}).intern());
                        sb3.append(arrayList);
                        Log.v(strIntern2, sb3.toString());
                    } else {
                        str = action;
                    }
                    ArrayList arrayList2 = null;
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        b bVar = arrayList.get(i12);
                        if (z10) {
                            i10 = 16;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m2825("辴퇏㌣钟\uf6cd堣릝᯿絡\ude97\u20f8舥\ue384䗼Ꝉ\u0894檩챘ⶎ迠텁㊿铱\uf608", 24151 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                            sb4.append(bVar.f2746);
                            Log.v(strIntern2, sb4.toString());
                        } else {
                            i10 = 16;
                        }
                        if (bVar.f2744) {
                            if (z10) {
                                Log.v(strIntern2, m2825("这ﾠ潍\udefb乱뷐ⵊ鳄ఖ篋\ueb63媾쨴㦮꤀ᢋ蠝\uf7d0朚흮䛿뙱◾镂Ә琈\ue3d2卞슡㈩ꆳ", 28793 - Gravity.getAbsoluteGravity(0, 0)).intern());
                            }
                            str2 = strResolveTypeIfNeeded;
                        } else {
                            String str4 = str;
                            int i13 = i10;
                            int iMatch = bVar.f2746.match(str4, strResolveTypeIfNeeded, scheme, data, categories, strIntern2);
                            str = str4;
                            if (iMatch >= 0) {
                                if (z10) {
                                    StringBuilder sb5 = new StringBuilder();
                                    str2 = strResolveTypeIfNeeded;
                                    sb5.append(m2825("这䶔ଥ쥷蚡䐌ɒ\udf90鶱嬡ᢚ훂鐆剸⾪\ued1e\uab08棄⚳\ue423ꆜ翜㴄ﭺ룼癌㑓", 49741 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                                    sb5.append(Integer.toHexString(iMatch));
                                    Log.v(strIntern2, sb5.toString());
                                } else {
                                    str2 = strResolveTypeIfNeeded;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f2744 = true;
                            } else {
                                str2 = strResolveTypeIfNeeded;
                                if (z10) {
                                    if (iMatch == -4) {
                                        i11 = i13;
                                        strIntern = m2825("辚䳩९엏艚庣ᬭ힗", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50032).intern();
                                    } else if (iMatch == -3) {
                                        i11 = i13;
                                        strIntern = m2820("\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{28, 6, 0, 0}).intern();
                                    } else if (iMatch == -2) {
                                        i11 = i13;
                                        strIntern = m2820("\u0000\u0001\u0001\u0001", true, new int[]{34, 4, 127, 0}).intern();
                                    } else if (iMatch != -1) {
                                        i11 = i13;
                                        strIntern = m2820("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{38, 14, 92, 5}).intern();
                                    } else {
                                        i11 = i13;
                                        strIntern = m2825("辍鿳꽯뻅", (ViewConfiguration.getFadingEdgeLength() >> 16) + 4211).intern();
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    str3 = scheme;
                                    uri = data;
                                    sb6.append(m2820("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", true, new int[]{52, 24, 12, i11}).intern());
                                    sb6.append(strIntern);
                                    Log.v(strIntern2, sb6.toString());
                                }
                                i12++;
                                data = uri;
                                strResolveTypeIfNeeded = str2;
                                scheme = str3;
                            }
                        }
                        str3 = scheme;
                        uri = data;
                        i12++;
                        data = uri;
                        strResolveTypeIfNeeded = str2;
                        scheme = str3;
                    }
                    if (arrayList2 != null) {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            ((b) arrayList2.get(i14)).f2744 = false;
                        }
                        this.f2736.add(new c(intent, arrayList2));
                        if (!this.f2734.hasMessages(1)) {
                            this.f2734.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2829() {
        int i10 = (f2728 + 105) % 128;
        f2729 = i10;
        this.f2738 = true;
        int i11 = i10 + 79;
        f2728 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2820(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f2733, i10, cArr, 0, i11);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m2828() {
        try {
            int i10 = f2729 + 21;
            f2728 = i10 % 128;
            int i11 = i10 % 2;
            this.f2738 = false;
            m2823();
            int i12 = f2729 + 113;
            f2728 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 36 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2825(String str, int i10) {
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
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2730);
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

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2824(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f2735) {
            try {
                ArrayList<IntentFilter> arrayListRemove = this.f2735.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int i10 = 0; i10 < arrayListRemove.size(); i10++) {
                    IntentFilter intentFilter = arrayListRemove.get(i10);
                    for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                        String action = intentFilter.getAction(i11);
                        ArrayList<b> arrayList = this.f2737.get(action);
                        if (arrayList != null) {
                            int i12 = 0;
                            while (i12 < arrayList.size()) {
                                if (arrayList.get(i12).f2745 == broadcastReceiver) {
                                    arrayList.remove(i12);
                                    i12--;
                                }
                                i12++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f2737.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m2823() {
        synchronized (this.f2735) {
            try {
                Iterator it = new HashMap(this.f2735).keySet().iterator();
                while (it.hasNext()) {
                    m2824((BroadcastReceiver) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2819() {
        int size;
        c[] cVarArr;
        while (true) {
            synchronized (this.f2735) {
                try {
                    size = this.f2736.size();
                    if (size <= 0) {
                        return;
                    }
                    cVarArr = new c[size];
                    this.f2736.toArray(cVarArr);
                    this.f2736.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = cVarArr[i10];
                for (int i11 = 0; i11 < cVar.f2747.size(); i11++) {
                    cVar.f2747.get(i11).f2745.onReceive(this.f2739, cVar.f2748);
                }
            }
        }
    }
}
