package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import bp.oM.DwaEpyvxz;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.i.jk;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class cp {

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1571 = 0;

    /* renamed from: סּ, reason: contains not printable characters */
    private static int f1572 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1573 = {274, 293, 301, 303, 308, 257, 292, 268, 297, 307, 302, 306, 238, 289, 300, 314, 291, 310, 313, 294, 309, 296, 260, 276, 304, 311, 259, 270, 261, 312, 266, 275, 258, 224, 295, 287};

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static long f1574 = 227323916017794373L;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1575 = 192;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f1576 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1577 = true;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private jj f1578 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private u f1579;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private cn f1580;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private jn f1581;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f1582;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ch f1583;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hr f1584;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ds f1585;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private bg f1586;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private de f1587;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$a$3, reason: invalid class name */
        public class AnonymousClass3 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1663;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ s f1664;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1665;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1666;

            public AnonymousClass3(s sVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1664 = sVar;
                this.f1665 = jSONObject;
                this.f1666 = obj;
                this.f1663 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1664.mo580(this.f1665, this.f1666, this.f1663);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$b$4, reason: invalid class name */
        public class AnonymousClass4 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1667;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1668;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ s f1669;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1670;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1671;

            public AnonymousClass4(s sVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1669 = sVar;
                this.f1671 = jSONObject;
                this.f1668 = obj;
                this.f1670 = obj2;
                this.f1667 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1669.mo613(this.f1671, this.f1668, this.f1670, this.f1667);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$c$2, reason: invalid class name */
        public class AnonymousClass2 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1672;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1673;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1674;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ s f1675;

            public AnonymousClass2(s sVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1675 = sVar;
                this.f1674 = jSONObject;
                this.f1672 = obj;
                this.f1673 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1675.mo614(this.f1674, this.f1672, this.f1673);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$d$5, reason: invalid class name */
        public class AnonymousClass5 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1676;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1677;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ s f1678;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1679;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1680;

            public AnonymousClass5(s sVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1678 = sVar;
                this.f1676 = jSONObject;
                this.f1680 = obj;
                this.f1679 = obj2;
                this.f1677 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1678.mo617(this.f1676, this.f1680, this.f1679, this.f1677);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$e$1, reason: invalid class name */
        public class AnonymousClass1 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1681;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1682;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ s f1683;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1684;

            public AnonymousClass1(s sVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1683 = sVar;
                this.f1682 = jSONObject;
                this.f1681 = obj;
                this.f1684 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1683.mo577(this.f1682, this.f1681, this.f1684);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$f$4, reason: invalid class name */
        public class AnonymousClass4 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1685;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1686;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1687;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ s f1688;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1689;

            public AnonymousClass4(s sVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1688 = sVar;
                this.f1689 = jSONObject;
                this.f1687 = obj;
                this.f1685 = obj2;
                this.f1686 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1688.mo615(this.f1689, this.f1687, this.f1685, this.f1686);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$h$3, reason: invalid class name */
        public class AnonymousClass3 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1690;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1691;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ s f1692;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1693;

            public AnonymousClass3(s sVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1692 = sVar;
                this.f1693 = jSONObject;
                this.f1691 = obj;
                this.f1690 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1692.mo616(this.f1693, this.f1691, this.f1690);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i<K, T> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.adqualitysdk.sdk.i.cp$i$2, reason: invalid class name */
        public class AnonymousClass2 extends iu {

            /* renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1694;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ s f1695;

            /* renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1696;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1697;

            public AnonymousClass2(s sVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1695 = sVar;
                this.f1694 = jSONObject;
                this.f1696 = obj;
                this.f1697 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                this.f1695.mo612(this.f1694, this.f1696, this.f1697);
            }
        }
    }

    public cp(cn cnVar, de deVar, bg bgVar, hr hrVar, ds dsVar) throws JSONException {
        this.f1584 = hrVar;
        ds dsVar2 = new ds(new HashMap(), dsVar, true);
        this.f1585 = dsVar2;
        dsVar2.m2421(m2016().m2638());
        dsVar.m2419(hrVar.m2636(), this);
        this.f1587 = deVar;
        this.f1586 = bgVar;
        this.f1583 = m1959();
        this.f1580 = cnVar;
        this.f1579 = new u();
        m1993(m1989((String) null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, (int[]) null, "\u0082\u0090\u0089\u008f\u008e\u0089\u0085\u0089\u008b\u0089\u008d\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), new ArrayList());
        m1964();
    }

    /* renamed from: 爫, reason: contains not printable characters */
    private void m1958() {
        f1571 = (f1572 + 21) % 128;
        this.f1579.m3334();
        f1571 = (f1572 + 67) % 128;
    }

    /* renamed from: סּ, reason: contains not printable characters */
    private ch m1959() {
        ch chVar = new ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ch
            /* renamed from: ﻐ */
            public final void mo1875(final String str, final List<Object> list) {
                final boolean z10 = true;
                final boolean z11 = false;
                cp.m1966(cp.this, str, true, false, list);
                cp.m1978(cp.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        cp.m1966(cp.this, str, false, z11, list);
                    }
                }, false);
                cp.m1978(cp.this, new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        cp.m1966(cp.this, str, false, z10, list);
                    }
                }, true);
            }
        };
        int i10 = f1571 + 109;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return chVar;
        }
        throw null;
    }

    /* renamed from: ףּ, reason: contains not printable characters */
    private jj m1960() {
        jj jjVar = new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cp cpVar = cp.this;
                cpVar.m2010(ig.f2671, cp.m1990(cpVar, activity, null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cp cpVar = cp.this;
                cpVar.m2010(ig.f2672, cp.m1990(cpVar, activity, null));
            }
        };
        int i10 = f1571 + 93;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return jjVar;
        }
        throw null;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    private dn m1961() {
        f1571 = (f1572 + 45) % 128;
        dn dnVarM1942 = m2014().m1942();
        f1571 = (f1572 + 97) % 128;
        return dnVarM1942;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    private void m1962() {
        int i10 = f1571 + 25;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1579.m3337();
            throw null;
        }
        this.f1579.m3337();
        int i11 = f1572 + 51;
        f1571 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 36 / 0;
        }
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    private void m1963() {
        int i10 = f1572 + 59;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1579.m3332();
            throw null;
        }
        this.f1579.m3332();
        f1571 = (f1572 + 41) % 128;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    private void m1964() throws JSONException {
        f1571 = (f1572 + 89) % 128;
        for (dm dmVar : m2016().m2639()) {
            if (m1971(dmVar)) {
                m1979(dmVar);
            }
            f1572 = (f1571 + 5) % 128;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ds m1965(cp cpVar) {
        int i10 = f1571;
        f1572 = (i10 + 101) % 128;
        ds dsVar = cpVar.f1585;
        f1572 = (i10 + 101) % 128;
        return dsVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1978(cp cpVar, im imVar, boolean z10) {
        f1571 = (f1572 + 29) % 128;
        cpVar.m1992(imVar, z10);
        int i10 = f1571 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1990(cp cpVar, Activity activity, Bundle bundle) throws JSONException {
        int i10 = f1571 + 7;
        f1572 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1984 = cpVar.m1984(activity, bundle);
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        int i13 = f1572 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1571 = i13 % 128;
        if (i13 % 2 == 0) {
            return jSONObjectM1984;
        }
        throw null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final void m2002() {
        int i10 = f1572 + 41;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            m1958();
            m1963();
            m1962();
            throw null;
        }
        m1958();
        m1963();
        m1962();
        if (this.f1578 != null) {
            jf.m2969().m2973(this.f1578);
            this.f1578 = null;
            f1571 = (f1572 + 41) % 128;
        }
        jn jnVar = this.f1581;
        if (jnVar != null) {
            jnVar.m3029();
            this.f1581 = null;
        }
        this.f1583 = null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final de m2003() {
        int i10 = f1572 + 1;
        f1571 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1587;
        }
        int i11 = 70 / 0;
        return this.f1587;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ch m2004() {
        int i10 = f1571 + 93;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1583;
        }
        int i11 = 32 / 0;
        return this.f1583;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final JSONObject m2005() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ig.f2705, m2014().m1950());
            jSONObject.put(ig.f2662, m2014().m1947());
            jSONObject.put(ig.f2661, m2014().m1953());
            f1572 = (f1571 + 59) % 128;
            return jSONObject;
        } catch (JSONException e10) {
            String strIntern = m1989((String) null, Color.red(0) + 127, (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1975("둰됵⏨\udedf뽮鼑䖖䄖梱톑ꩫ萠帽쓤ꅐ褯欢．鱰뿟恖\uf218謢ꓚ紴\ue52b蘋ꧭ੦顯ﲴ", -MotionEvent.axisFromString("")).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3147(strIntern, sb2.toString());
            return jSONObject;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final ds m2006() {
        int i10 = f1571 + 91;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1585;
        }
        int i11 = 50 / 0;
        return this.f1585;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String m2007() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2014().m1951());
        sb2.append(m1975("\uf22a\uf205蕲ໆ巷", View.resolveSize(0, 0) + 1).intern());
        sb2.append(m2016().m2636());
        String string = sb2.toString();
        int i10 = f1571 + 23;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final cn m2014() {
        int i10 = f1571;
        cn cnVar = this.f1580;
        f1572 = (i10 + 107) % 128;
        return cnVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final bg m2017() {
        int i10 = f1571;
        bg bgVar = this.f1586;
        f1572 = (i10 + 43) % 128;
        return bgVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1966(cp cpVar, String str, boolean z10, boolean z11, List list) {
        int i10 = f1571 + 29;
        f1572 = i10 % 128;
        int i11 = i10 % 2;
        cpVar.m1968(str, z10, z11, (List<Object>) list);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1995(Activity activity, List list) {
        f1572 = (f1571 + 85) % 128;
        boolean zM1980 = m1980(activity, (List<String>) list);
        f1572 = (f1571 + 85) % 128;
        return zM1980;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2000(dm dmVar) throws JSONException {
        JSONObject jSONObjectM1999 = m1999(dmVar.m2343());
        if (jSONObjectM1999 != null) {
            f1571 = (f1572 + 69) % 128;
            m2001(jSONObjectM1999, m1983(false), m1983(true));
        }
        int i10 = f1572 + 5;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 79 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Context m2012() {
        f1571 = (f1572 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        Context contextM1939 = m2014().m1939();
        f1572 = (f1571 + 87) % 128;
        return contextM1939;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2015(io ioVar) {
        int i10 = f1571 + 85;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1580.m1941().m1137(ioVar);
        } else {
            this.f1580.m1941().m1137(ioVar);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.cp.f1572 + 33;
        com.ironsource.adqualitysdk.sdk.i.cp.f1571 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if ((r5 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r5 = m2013(r8);
        r6 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r5 = m2013(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        m1994(r0, r4, r1, new com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass9(r7));
        com.ironsource.adqualitysdk.sdk.i.cp.f1572 = (com.ironsource.adqualitysdk.sdk.i.cp.f1571 + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        r0 = m2007();
        r1 = new java.lang.StringBuilder();
        r1.append(m1975("蔨蕥岯ꆏ\uefa2䃘ᕜ灓띿꺒\ufae2寸潥뮤\uf187囦婽聚쳳怛儖贚\udbe0笏䰾騦", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1).intern());
        r1.append(r8);
        r1.append(m1975("\udcfd\udcdd쾎㊥\uf16c秽உ⧉蹆㶱\ue478拐㚻⢇", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern());
        com.ironsource.adqualitysdk.sdk.i.co.m1955(r0, r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        m1970(r0, r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L11;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1985(com.ironsource.adqualitysdk.sdk.i.dm r8) throws org.json.JSONException {
        /*
            r7 = this;
            org.json.JSONObject r0 = r8.m2343()
            org.json.JSONObject r0 = r7.m1999(r0)
            if (r0 == 0) goto La9
            int r1 = com.ironsource.adqualitysdk.sdk.i.cp.f1572
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cp.f1571 = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            java.lang.String r8 = r8.m2340()
            com.ironsource.adqualitysdk.sdk.i.t r1 = r7.m1987(r3)
            com.ironsource.adqualitysdk.sdk.i.t r4 = r7.m1987(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto La6
            goto L3d
        L2b:
            java.lang.String r8 = r8.m2340()
            com.ironsource.adqualitysdk.sdk.i.t r1 = r7.m1987(r3)
            com.ironsource.adqualitysdk.sdk.i.t r4 = r7.m1987(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto La6
        L3d:
            int r5 = com.ironsource.adqualitysdk.sdk.i.cp.f1572
            int r5 = r5 + 33
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cp.f1571 = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L53
            com.ironsource.adqualitysdk.sdk.i.dq r5 = r7.m2013(r8)
            r6 = 84
            int r6 = r6 / r2
            if (r5 == 0) goto L6a
            goto L59
        L53:
            com.ironsource.adqualitysdk.sdk.i.dq r5 = r7.m2013(r8)
            if (r5 == 0) goto L6a
        L59:
            com.ironsource.adqualitysdk.sdk.i.cp$9 r8 = new com.ironsource.adqualitysdk.sdk.i.cp$9
            r8.<init>()
            r7.m1994(r0, r4, r1, r8)
            int r8 = com.ironsource.adqualitysdk.sdk.i.cp.f1571
            int r8 = r8 + 3
            int r8 = r8 % 128
            com.ironsource.adqualitysdk.sdk.i.cp.f1572 = r8
            return
        L6a:
            java.lang.String r0 = r7.m2007()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r2)
            int r2 = r2 + r3
            java.lang.String r4 = "蔨蕥岯ꆏ\uefa2䃘ᕜ灓띿꺒\ufae2寸潥뮤\uf187囦婽聚쳳怛儖贚\udbe0笏䰾騦"
            java.lang.String r2 = m1975(r4, r2)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r8)
            r8 = 0
            float r2 = android.graphics.PointF.length(r8, r8)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            int r8 = r8 + r3
            java.lang.String r2 = "\udcfd\udcdd쾎㊥\uf16c秽உ⧉蹆㶱\ue478拐㚻⢇"
            java.lang.String r8 = m1975(r2, r8)
            java.lang.String r8 = r8.intern()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 0
            com.ironsource.adqualitysdk.sdk.i.co.m1955(r0, r8, r1)
            return
        La6:
            r7.m1970(r0, r4, r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cp.m1985(com.ironsource.adqualitysdk.sdk.i.dm):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2011(JSONObject jSONObject) {
        f1571 = (f1572 + 101) % 128;
        this.f1582 = kc.m3193(jSONObject, true);
        f1571 = (f1572 + 31) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final dq m2013(String str) {
        int i10 = f1571 + 23;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            return null;
        }
        dq dqVarM2637 = m2016().m2637(str);
        f1571 = (f1572 + 83) % 128;
        return dqVarM2637;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final hr m2016() {
        int i10 = f1571 + 109;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1584;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m1991(dm dmVar) throws JSONException {
        int i10 = f1572 + 89;
        f1571 = i10 % 128;
        it itVar = null;
        if (i10 % 2 == 0) {
            JSONObject jSONObjectM1999 = m1999(dmVar.m2343());
            if (jSONObjectM1999 != null) {
                f1571 = (f1572 + 91) % 128;
                final String strM2338 = dmVar.m2338();
                if (!TextUtils.isEmpty(strM2338)) {
                    int i11 = f1571 + 113;
                    f1572 = i11 % 128;
                    if (i11 % 2 != 0) {
                        final dq dqVarM2013 = m2013(strM2338);
                        if (dqVarM2013 != null) {
                            itVar = new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.1

                                /* renamed from: ﱟ, reason: contains not printable characters */
                                private static char f1588 = 21759;

                                /* renamed from: ﱡ, reason: contains not printable characters */
                                private static int f1589 = 1;

                                /* renamed from: ﺙ, reason: contains not printable characters */
                                private static int f1590 = 0;

                                /* renamed from: ﻏ, reason: contains not printable characters */
                                private static char f1591 = 56348;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static char f1592 = 35047;

                                /* renamed from: ｋ, reason: contains not printable characters */
                                private static char f1593 = 47207;

                                @Override // com.ironsource.adqualitysdk.sdk.i.it
                                /* renamed from: ﾒ, reason: contains not printable characters */
                                public final List<WebView> mo2019(Object obj) {
                                    int i12 = f1590 + 77;
                                    f1589 = i12 % 128;
                                    try {
                                        if (i12 % 2 == 0) {
                                            throw null;
                                        }
                                        List<WebView> list = (List) dqVarM2013.m2365(cp.m1965(cp.this), cp.this, Collections.singletonList(obj)).m2437();
                                        f1590 = (f1589 + 99) % 128;
                                        return list;
                                    } catch (Exception unused) {
                                        String strIntern = m2018("䄹죺ꦽ홉ﻝᨇ▉䄘⑂锜ᓇꨈ섷逮\ueddeި", TextUtils.indexOf((CharSequence) "", '0') + 17).intern();
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(m2018("閭뾵铪輙ӈ㝶议뻭蟋ᬥ핔㙘\ueba1\ue431垐ۼ\ue825̼爨࿁ꠙꞁ鲨ꧭ铪輙䏳鎚", TextUtils.lastIndexOf("", '0', 0, 0) + 29).intern());
                                        sb2.append(strM2338);
                                        k.m3147(strIntern, sb2.toString());
                                        return null;
                                    }
                                }

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static String m2018(String str, int i12) {
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
                                                int i13 = o.f3167;
                                                if (i13 < cArr.length) {
                                                    cArr3[0] = cArr[i13];
                                                    cArr3[1] = cArr[i13 + 1];
                                                    int i14 = 58224;
                                                    for (int i15 = 0; i15 < 16; i15++) {
                                                        char c10 = cArr3[1];
                                                        char c11 = cArr3[0];
                                                        char c12 = (char) (c10 - (((c11 + i14) ^ ((c11 << 4) + f1591)) ^ ((c11 >>> 5) + f1588)));
                                                        cArr3[1] = c12;
                                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1592) ^ ((c12 + i14) ^ ((c12 << 4) + f1593))));
                                                        i14 -= 40503;
                                                    }
                                                    int i16 = o.f3167;
                                                    cArr2[i16] = cArr3[0];
                                                    cArr2[i16 + 1] = cArr3[1];
                                                    o.f3167 = i16 + 2;
                                                } else {
                                                    str2 = new String(cArr2, 0, i12);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str2;
                                }
                            };
                        } else {
                            String strM2007 = m2007();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1975("蔨蕥岯ꆏ\uefa2䃘ᕜ灓띿꺒\ufae2寸潥뮤\uf187囦婽聚쳳怛儖贚\udbe0笏䰾騦", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                            sb2.append(strM2338);
                            sb2.append(m1975("\udcfd\udcdd쾎㊥\uf16c秽உ⧉蹆㶱\ue478拐㚻⢇", -TextUtils.indexOf((CharSequence) "", '0')).intern());
                            co.m1955(strM2007, sb2.toString(), null);
                            f1572 = (f1571 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                        }
                    } else {
                        m2013(strM2338);
                        throw null;
                    }
                }
                m1969(jSONObjectM1999, m1973(false), m1973(true), itVar);
                return;
            }
            return;
        }
        m1999(dmVar.m2343());
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m2001(JSONObject jSONObject, x xVar, x xVar2) {
        int i10 = f1572 + 89;
        f1571 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1579.m3333(jSONObject, m1988(xVar, xVar2));
        } else {
            this.f1579.m3333(jSONObject, m1988(xVar, xVar2));
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2008() {
        int i10 = f1572;
        int i11 = i10 + 109;
        f1571 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        JSONObject jSONObject = this.f1582;
        int i12 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1571 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1969(JSONObject jSONObject, l lVar, l lVar2, it itVar) {
        f1571 = (f1572 + 7) % 128;
        this.f1579.m3335(jSONObject, m1982(lVar, lVar2), m1960(), itVar);
        f1572 = (f1571 + 37) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1998(String str, JSONObject jSONObject) {
        f1571 = (f1572 + 57) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m1975("ﳝﲫ慮鱂\ud81a烳⋵蝋", View.resolveSize(0, 0) + 1).intern())) {
                    return jSONObject.optString(m1975("ⰏⱮ概钣㬚☕쇆\ud97e톳鮬⸛㴼왆躜┇《\uf352땮ᡥ", KeyEvent.getDeadChar(0, 0) + 1).intern(), null);
                }
            } else if (str.equals(m1975("鴎鵹褱琝鄕넗毱桵䚼笟", 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                return jSONObject.optString(m1989((String) null, 127 - TextUtils.getOffsetBefore("", 0), (int[]) null, "\u0082\u0083\u008e\u009c\u008a\u008a\u008e\u008f\u009b\u009a\u0082\u0089\u0092").intern(), null);
            }
        } else if (str.equals(m1989((String) null, KeyEvent.getDeadChar(0, 0) + 127, (int[]) null, "\u0093\u0085\u0089\u0092\u0089\u0085\u0091\u008e").intern())) {
            f1571 = (f1572 + 115) % 128;
            String strOptString = jSONObject.optString(m1975("댉덨Ф串\ue4ed猪Ḧ䙩蒆\uf614\uf1ce栌奕\ue330\ufada攐汘\ud8c0", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern(), null);
            int i10 = f1571 + 35;
            f1572 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 62 / 0;
            }
            return strOptString;
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1967(String str, dm dmVar) throws JSONException {
        JSONObject jSONObjectM1999 = m1999(dmVar.m2343());
        if (jSONObjectM1999 != null && jSONObjectM1999.has(m1989((String) null, 127 - TextUtils.getTrimmedLength(""), (int[]) null, "\u0082\u0099\u0093\u0098\u008b\u0084\u0089\u0085\u0091\u0082\u0085\u0082\u0097\u0096\u0091\u0095\u0084\u0085").intern())) {
            jk.e eVarM3022 = jk.e.m3022(jSONObjectM1999.optString(m1989((String) null, KeyEvent.getDeadChar(0, 0) + 127, (int[]) null, "\u0082\u0099\u0093\u0098\u008b\u0084\u0089\u0085\u0091\u0082\u0085\u0082\u0097\u0096\u0091\u0095\u0084\u0085").intern(), null));
            String strM1998 = m1998(str, jSONObjectM1999);
            if (eVarM3022 != null) {
                f1572 = (f1571 + 89) % 128;
                jk.m3017().m3018(strM1998, eVarM3022);
            }
        }
        f1571 = (f1572 + 75) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m1977(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM2005;
        int i10 = f1571 + 59;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM2005 = m2005();
            kc.m3194(jSONObjectM2005, jSONObject);
            int i11 = 90 / 0;
        } else {
            jSONObjectM2005 = m2005();
            kc.m3194(jSONObjectM2005, jSONObject);
        }
        int i12 = f1572 + 65;
        f1571 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObjectM2005;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1970(JSONObject jSONObject, t tVar, t tVar2) {
        int i10 = f1572 + 75;
        f1571 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1579.m3336(jSONObject, m1974(tVar, tVar2));
        } else {
            this.f1579.m3336(jSONObject, m1974(tVar, tVar2));
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m1971(dm dmVar) {
        List listMo815 = aq.m814().mo815();
        ISAdQualityAdType iSAdQualityAdTypeM2341 = dmVar.m2341();
        if (listMo815 != null) {
            int i10 = f1571 + 31;
            f1572 = i10 % 128;
            if (i10 % 2 == 0) {
                ISAdQualityAdType iSAdQualityAdType = ISAdQualityAdType.UNKNOWN;
                throw null;
            }
            if (iSAdQualityAdTypeM2341 != ISAdQualityAdType.UNKNOWN) {
                if (listMo815.contains(iSAdQualityAdTypeM2341)) {
                    f1572 = (f1571 + 67) % 128;
                    return false;
                }
                f1571 = (f1572 + 29) % 128;
                return true;
            }
        }
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m1979(dm dmVar) throws JSONException {
        String strM2342 = dmVar.m2342();
        switch (strM2342.hashCode()) {
            case -1825565413:
                if (strM2342.equals(m1989((String) null, 127 - View.getDefaultSize(0, 0), (int[]) null, "\u0082\u008f\u0091\u0093\u0091\u0082\u0094\u0089\u0088\u0093\u0085\u0089\u0092\u0089\u0085\u0091\u008e").intern()) && this.f1578 == null) {
                    f1571 = (f1572 + 49) % 128;
                    this.f1578 = m1981(m1976(dmVar.m2339()));
                    jf.m2969().m2970(this.f1578);
                    break;
                }
                break;
            case -1655966961:
                if (strM2342.equals(m1989((String) null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), (int[]) null, "\u0093\u0085\u0089\u0092\u0089\u0085\u0091\u008e").intern())) {
                    f1571 = (f1572 + 9) % 128;
                    m1991(dmVar);
                    m1967(m1989((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0093\u0085\u0089\u0092\u0089\u0085\u0091\u008e").intern(), dmVar);
                    break;
                }
                break;
            case -787751952:
                if (strM2342.equals(m1975("鴎鵹褱琝鄕넗毱桵䚼笟", ExpandableListView.getPackedPositionGroup(0L) + 1).intern())) {
                    m2000(dmVar);
                    m1967(m1975("鴎鵹褱琝鄕넗毱桵䚼笟", -ExpandableListView.getPackedPositionChild(0L)).intern(), dmVar);
                    break;
                }
                break;
            case 3619493:
                if (strM2342.equals(m1975("ﳝﲫ慮鱂\ud81a烳⋵蝋", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern())) {
                    m1985(dmVar);
                    m1967(m1975("ﳝﲫ慮鱂\ud81a烳⋵蝋", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern(), dmVar);
                    break;
                }
                break;
            case 1144592183:
                if (strM2342.equals(m1975("\uf0a1\uf0c0⦬풙垄⇿굾ך홶\udb96䊕㫦", -ImageFormat.getBitsPerPixel(0)).intern())) {
                    this.f1581 = new jn(m1996(m1976(dmVar.m2339())));
                    break;
                }
                break;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m1999(JSONObject jSONObject) throws JSONException {
        dn dnVarM1961;
        String strOptString = jSONObject.optString(m1975("ĵşꋹ忏뻻\uec97䐡\uf444ᬪ僆ꯖ\uf7b1", -MotionEvent.axisFromString("")).intern());
        jSONObject.remove(m1975("ĵşꋹ忏뻻\uec97䐡\uf444ᬪ僆ꯖ\uf7b1", 1 - Color.blue(0)).intern());
        if (jSONObject.optBoolean(m1975("깴긝\uf5aeࢅ譕퀗熵嬃➽ރ鹡쬭", 1 - View.combineMeasuredStates(0, 0)).intern()) && (dnVarM1961 = m1961()) != null) {
            if (!TextUtils.isEmpty(dnVarM1961.m2347())) {
                jSONObject.remove(m1975("깴긝\uf5aeࢅ譕퀗熵嬃➽ރ鹡쬭", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                try {
                    String strIntern = m1975("䘉䙣ট\uf4a9ᒫ䀃\uee75더랣ﮨƁ嬥걂\uee86", View.MeasureSpec.getSize(0) + 1).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    sb2.append(dnVarM1961.m2347());
                    jSONObject.put(strIntern, sb2.toString());
                } catch (JSONException unused) {
                }
            }
            if (dnVarM1961.m2345()) {
                int i10 = f1571 + 83;
                f1572 = i10 % 128;
                try {
                    jSONObject.put((i10 % 2 == 0 ? m1989((String) null, 68 << View.combineMeasuredStates(0, 1), (int[]) null, "\u008a\u009f\u008e\u008c\u0085\u009e\u009d\u0082\u008a\u0095") : m1989((String) null, View.combineMeasuredStates(0, 0) + 127, (int[]) null, "\u008a\u009f\u008e\u008c\u0085\u009e\u009d\u0082\u008a\u0095")).intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            f1572 = (f1571 + 105) % 128;
            if (!m1972(jSONObject, itKeys.next())) {
                int i11 = (f1571 + 63) % 128;
                f1572 = i11;
                f1571 = (i11 + 49) % 128;
                return null;
            }
        }
        return jSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m1972(JSONObject jSONObject, String str) throws JSONException {
        f1572 = (f1571 + 13) % 128;
        Object objOpt = jSONObject.opt(str);
        try {
            if (objOpt instanceof String) {
                int i10 = f1572 + 69;
                f1571 = i10 % 128;
                if (i10 % 2 == 0) {
                    String str2 = (String) objOpt;
                    if (m1986(str2)) {
                        String strM1997 = m1997(str2);
                        if (strM1997 != null) {
                            f1572 = (f1571 + 65) % 128;
                            jSONObject.put(str, strM1997);
                        } else {
                            String strM2007 = m2007();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1975("卙匚䆷벞僁\ufafcꨪ\ua63eീ돎", 1 - KeyEvent.getDeadChar(0, 0)).intern());
                            sb2.append(str2);
                            sb2.append(m1975("⑫\u244b뇷䳜ᴏ塰\ue7ea텟꿋䏈ࠛ䍝츭图\u0378丑ﭷ洗㹎碯\uf049怖⥙掺\ued68睾⑨溑驠ਾ庍᧢鞂Ŕ䧜ӣ貮ᑦ䒵࿔", ExpandableListView.getPackedPositionType(0L) + 1).intern());
                            co.m1956(strM2007, sb2.toString());
                            int i11 = f1571 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            f1572 = i11 % 128;
                            if (i11 % 2 == 0) {
                                int i12 = 73 / 0;
                            }
                            return false;
                        }
                    }
                } else {
                    m1986((String) objOpt);
                    throw null;
                }
            } else if (objOpt instanceof JSONArray) {
                jSONObject.put(str, new JSONArray((Collection) m1976(kc.m3184((JSONArray) objOpt))));
            }
        } catch (JSONException unused) {
        }
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m1994(JSONObject jSONObject, t tVar, t tVar2, is isVar) {
        int i10 = f1571 + 19;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1579.m3338(jSONObject, m1974(tVar, tVar2), isVar);
            throw null;
        }
        this.f1579.m3338(jSONObject, m1974(tVar, tVar2), isVar);
        int i11 = f1571 + 43;
        f1572 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private t m1987(final boolean z10) {
        t tVar = new t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.15

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1618 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1619;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int[] f1620 = {-1903055520, 1305868750, 1857150868, -1286161687, 1741343652, -1023515914, 248491156, 951687475, -1559547079, 890954036, -1487609970, 1844179634, 1744764495, -910079889, 101125097, 1195720760, -1002155931, -421936584};

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo612(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1618 + 19;
                f1619 = i10 % 128;
                int i11 = i10 % 2;
                mo612(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                f1618 = (f1619 + 23) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo614(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1618 + 77;
                f1619 = i10 % 128;
                int i11 = i10 % 2;
                mo614(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1618 + 9;
                f1619 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo577(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1619 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f1618 = i10 % 128;
                int i11 = i10 % 2;
                mo577(jSONObject, view, activity);
                if (i11 == 0) {
                    int i12 = 75 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo580(JSONObject jSONObject, View view, Activity activity) {
                f1618 = (f1619 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                mo580(jSONObject, view, activity);
                int i10 = f1618 + 87;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo616(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1618 + 47;
                f1619 = i10 % 128;
                int i11 = i10 % 2;
                mo616(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1618 + 7;
                f1619 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo613(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1618 = (f1619 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                mo613(jSONObject, view, obj, activity);
                int i10 = f1618 + 67;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo613(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1619 = (f1618 + 83) % 128;
                m2041(m2040(new int[]{139513171, 377327494, 1314956943, 1308315702, 1538980857, 685891609, 113844258, 1518085328}, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), jSONObject, view, obj, activity);
                f1619 = (f1618 + 23) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo615(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1618 = (f1619 + 21) % 128;
                mo615(jSONObject, view, obj, activity);
                f1619 = (f1618 + 23) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo614(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1619 + 7;
                f1618 = i10 % 128;
                if (i10 % 2 == 0) {
                    m2041(m2040(new int[]{139513171, 377327494, 1200637872, 371320727}, 90 >> (ViewConfiguration.getScrollBarFadeDuration() + 79)).intern(), jSONObject, view, null, activity);
                } else {
                    m2041(m2040(new int[]{139513171, 377327494, 1200637872, 371320727}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8).intern(), jSONObject, view, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo617(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1618 + 45;
                f1619 = i10 % 128;
                int i11 = i10 % 2;
                mo617(jSONObject, view, obj, activity);
                if (i11 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo612(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1618 + 41;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    m2041(m2040(new int[]{474170242, 1584170332, 2019762885, -799889410, -1732274692, -1678806398}, 81 >>> View.combineMeasuredStates(0, 1)).intern(), jSONObject, view, null, activity);
                } else {
                    m2041(m2040(new int[]{474170242, 1584170332, 2019762885, -799889410, -1732274692, -1678806398}, View.combineMeasuredStates(0, 0) + 12).intern(), jSONObject, view, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo616(JSONObject jSONObject, View view, Activity activity) {
                f1618 = (f1619 + 69) % 128;
                m2041(m2040(new int[]{-472133129, 1587626011, 1399554265, 1366767670, 698973561, 1030483624}, TextUtils.getTrimmedLength("") + 11).intern(), jSONObject, view, null, activity);
                f1619 = (f1618 + 3) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo580(JSONObject jSONObject, View view, Activity activity) {
                f1618 = (f1619 + 15) % 128;
                m2041(m2040(new int[]{1113277572, -1906659739, -1150611741, -134688617, 1643176596, -371248464, -1971336628, 195214921}, View.combineMeasuredStates(0, 0) + 16).intern(), jSONObject, view, null, activity);
                int i10 = f1618 + 27;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo615(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1618 + 51;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    m2041(m2040(new int[]{1024306148, 1997946275, -1443411696, -1963181567, -2030207084, -44457224, -296588160, -1673859579, 1855018425, 1698288767}, TextUtils.indexOf((CharSequence) "", '/') + 3).intern(), jSONObject, view, obj, activity);
                } else {
                    m2041(m2040(new int[]{1024306148, 1997946275, -1443411696, -1963181567, -2030207084, -44457224, -296588160, -1673859579, 1855018425, 1698288767}, TextUtils.indexOf((CharSequence) "", '0') + 21).intern(), jSONObject, view, obj, activity);
                }
                f1618 = (f1619 + 83) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo577(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1618 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    m2041(m2040(new int[]{1113277572, -1906659739, -1150611741, -134688617, 2049615262, -1005931031}, TextUtils.indexOf("", "") + 89).intern(), jSONObject, view, null, activity);
                } else {
                    m2041(m2040(new int[]{1113277572, -1906659739, -1150611741, -134688617, 2049615262, -1005931031}, TextUtils.indexOf("", "") + 11).intern(), jSONObject, view, null, activity);
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m2040(int[] iArr, int i10) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1845) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1620.clone();
                        com.ironsource.adqualitysdk.sdk.i.d.f1846 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
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
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = (c10 << 16) + c11;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = (c12 << 16) + c13;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                for (int i13 = 0; i13 < 16; i13++) {
                                    int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1844 ^ iArr2[i13];
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = i14;
                                    int iM2178 = com.ironsource.adqualitysdk.sdk.i.d.m2178(i14) ^ com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                    int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = iM2178;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1847 = i15;
                                }
                                int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i17;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i16;
                                int i18 = i16 ^ iArr2[16];
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i18;
                                int i19 = i17 ^ iArr2[17];
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i19;
                                cArr[0] = (char) (i19 >>> 16);
                                cArr[1] = (char) i19;
                                cArr[2] = (char) (i18 >>> 16);
                                cArr[3] = (char) i18;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                int i20 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
                                cArr2[i20 << 1] = cArr[0];
                                cArr2[(i20 << 1) + 1] = cArr[1];
                                cArr2[(i20 << 1) + 2] = cArr[2];
                                cArr2[(i20 << 1) + 3] = cArr[3];
                                com.ironsource.adqualitysdk.sdk.i.d.f1846 = i20 + 2;
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

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m2041(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cp.m1966(cp.this, com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2040(new int[]{-1238603757, 215876822, -1357773174, -903728930, 1304518563, 1838526319, 285993961, -1563441559}, 15 - ExpandableListView.getPackedPositionType(0L)), str), z10, false, Arrays.asList(jSONObject, view, obj, activity));
                int i10 = f1618 + 39;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.t
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo617(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1619 = (f1618 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                m2041(m2040(new int[]{139513171, 377327494, 1314956943, 1308315702, 2032367137, 873632352}, TextUtils.indexOf("", "", 0) + 9).intern(), jSONObject, view, obj, activity);
                int i10 = f1618 + 71;
                f1619 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 / 0;
                }
            }
        };
        int i10 = f1571 + 67;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return tVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private jj m1981(final List<String> list) {
        jj jjVar = new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.6

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static int f1646 = 1;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1647;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1649 = {'T', 171, 169, 164, 147, 154, 163, 166, 179, 171, 158, 163, 178, 154, 153, 176, 171, 171, 179, 180, 178, '7', 'n', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'Z', 'k', 'c', 'j', 'l', GMTDateParser.DAY_OF_MONTH, '7', 'n', 'W', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'e', AbstractJsonLexerKt.BEGIN_LIST, 'l', 't', 'q', 'i', GMTDateParser.DAY_OF_MONTH, '2', GMTDateParser.DAY_OF_MONTH, 'o', 't', 'p', GMTDateParser.SECONDS, GMTDateParser.SECONDS, 'l', 'T', '^', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'W', 'n'};

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f1648 = 12;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m2053(String str, Activity activity) {
                f1646 = (f1647 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
                m2054(str, Collections.singletonList(activity));
                f1646 = (f1647 + 81) % 128;
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            public static /* synthetic */ void m2055(AnonymousClass6 anonymousClass6, String str, List list2) {
                int i10 = f1647 + 29;
                f1646 = i10 % 128;
                anonymousClass6.m2056(str, i10 % 2 == 0, (List<Object>) list2);
                int i11 = f1646 + 29;
                f1647 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static String m2057(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                        System.arraycopy(f1649, i10, cArr, 0, i11);
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

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                int i10 = f1647 + 65;
                f1646 = i10 % 128;
                if (i10 % 2 == 0) {
                    cp.m1995(activity, list);
                    throw null;
                }
                if (cp.m1995(activity, list)) {
                    f1647 = (f1646 + 113) % 128;
                    m2058(m2057("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", false, new int[]{21, 17, 0, 0}).intern(), activity, bundle);
                }
                f1646 = (f1647 + 7) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i10 = f1646 + 53;
                f1647 = i10 % 128;
                if (i10 % 2 != 0) {
                    cp.m1995(activity, list);
                    throw null;
                }
                if (cp.m1995(activity, list)) {
                    f1647 = (f1646 + 29) % 128;
                    m2053(m2057("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true, new int[]{55, 19, 0, 0}).intern(), activity);
                    f1646 = (f1647 + 49) % 128;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                f1646 = (f1647 + 55) % 128;
                if (cp.m1995(activity, list)) {
                    f1647 = (f1646 + 61) % 128;
                    m2053(m2052(115 - TextUtils.lastIndexOf("", '0', 0), AndroidCharacter.getMirror('0') - ' ', "\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006\uffd9\ufffb", 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false).intern(), activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i10 = f1646 + 79;
                f1647 = i10 % 128;
                if (i10 % 2 != 0) {
                    cp.m1995(activity, list);
                    throw null;
                }
                if (cp.m1995(activity, list)) {
                    m2053(m2057("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001", false, new int[]{38, 17, 0, 17}).intern(), activity);
                }
                int i11 = f1647 + 47;
                f1646 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                f1647 = (f1646 + 15) % 128;
                if (cp.m1995(activity, list)) {
                    m2058(m2052((ViewConfiguration.getPressedStateDuration() >> 16) + 115, (ViewConfiguration.getWindowTouchSlop() >> 8) + 27, "￬\ufffe￼\u0007\ufffa\r\f\u0007￢\ufffe\u000f\ufffa￬\u0012\r\u0002\u000f\u0002\r￼ￚ\u0007\b\ufffe\r\ufffa\r", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, true).intern(), activity, bundle);
                    f1647 = (f1646 + 71) % 128;
                }
                f1647 = (f1646 + 1) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                f1646 = (f1647 + 31) % 128;
                if (cp.m1995(activity, list)) {
                    int i10 = f1646 + 105;
                    f1647 = i10 % 128;
                    m2053((i10 % 2 != 0 ? m2052(Color.green(1) * 60, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE << TextUtils.getTrimmedLength(""), "\ufffb￼\u000b\t\ufff8\u000b￪\u0010\u000b\u0000\r\u0000\u000b\ufffa\uffd8\u0005\u0006", 44 - TextUtils.lastIndexOf("", (char) 16), false) : m2052(Color.green(0) + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, TextUtils.getTrimmedLength("") + 17, "\ufffb￼\u000b\t\ufff8\u000b￪\u0010\u000b\u0000\r\u0000\u000b\ufffa\uffd8\u0005\u0006", TextUtils.lastIndexOf("", '0') + 18, true)).intern(), activity);
                }
                f1647 = (f1646 + 59) % 128;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
            @Override // com.ironsource.adqualitysdk.sdk.i.jj, android.app.Application.ActivityLifecycleCallbacks
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onActivityStopped(android.app.Activity r7) {
                /*
                    r6 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1647
                    int r0 = r0 + 5
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1646 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 != 0) goto L19
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cp.m1995(r7, r0)
                    r2 = 55
                    int r2 = r2 / r1
                    if (r0 == 0) goto L72
                    goto L21
                L19:
                    java.util.List r0 = r2
                    boolean r0 = com.ironsource.adqualitysdk.sdk.i.cp.m1995(r7, r0)
                    if (r0 == 0) goto L72
                L21:
                    int r0 = com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1647
                    int r0 = r0 + 25
                    int r2 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1646 = r2
                    int r0 = r0 % 2
                    java.lang.String r2 = "\u000b\u0000\r\u0000\u000b\u0010￪\u000b\u0006\u0007\u0007￼\ufffb\u0006\u0005\uffd8\ufffa"
                    r3 = 0
                    if (r0 != 0) goto L51
                    r0 = 1
                    int r4 = android.graphics.Color.blue(r0)
                    int r4 = r4 + 71
                    float r5 = android.media.AudioTrack.getMinVolume()
                    int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    int r3 = r3 * 14
                    int r0 = android.graphics.drawable.Drawable.resolveOpacity(r1, r0)
                    int r0 = r0 * 9
                    java.lang.String r0 = m2052(r4, r3, r2, r0, r1)
                L49:
                    java.lang.String r0 = r0.intern()
                    r6.m2053(r0, r7)
                    goto L6a
                L51:
                    int r0 = android.graphics.Color.blue(r1)
                    int r0 = r0 + 117
                    float r4 = android.media.AudioTrack.getMinVolume()
                    int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                    int r3 = r3 + 17
                    int r4 = android.graphics.drawable.Drawable.resolveOpacity(r1, r1)
                    int r4 = 13 - r4
                    java.lang.String r0 = m2052(r0, r3, r2, r4, r1)
                    goto L49
                L6a:
                    int r7 = com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1646
                    int r7 = r7 + 13
                    int r7 = r7 % 128
                    com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1647 = r7
                L72:
                    int r7 = com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1646
                    int r7 = r7 + 57
                    int r0 = r7 % 128
                    com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.f1647 = r0
                    int r7 = r7 % 2
                    if (r7 != 0) goto L7f
                    return
                L7f:
                    r7 = 0
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cp.AnonymousClass6.onActivityStopped(android.app.Activity):void");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
            /* renamed from: ﾒ */
            public final void mo768(Activity activity) {
                int i10 = f1646 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1647 = i10 % 128;
                m2053((i10 % 2 != 0 ? m2052(36 % TextUtils.getCapsMode("", 1, 1), (ViewConfiguration.getJumpTapTimeout() >>> 40) * 16, "\u000b\u000e\r\ufffe￫\t\tￚ\u0007\b�\u0007\u000e\b\u000b\u0000\ufffe\u000b\b\uffdf\b￭�\ufffe\u0007", (-16777206) / Color.rgb(0, 1, 1), false) : m2052(TextUtils.getCapsMode("", 0, 0) + 115, 25 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u000b\u000e\r\ufffe￫\t\tￚ\u0007\b�\u0007\u000e\b\u000b\u0000\ufffe\u000b\b\uffdf\b￭�\ufffe\u0007", (-16777206) - Color.rgb(0, 0, 0), true)).intern(), activity);
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private void m2054(final String str, final List<Object> list2) {
                m2056(str, true, list2);
                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.6.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        AnonymousClass6.m2055(AnonymousClass6.this, str, list2);
                    }
                });
                int i10 = f1646 + 29;
                f1647 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m2058(String str, Activity activity, Bundle bundle) {
                List<Object> listAsList;
                int i10 = f1647 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1646 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr = new Object[4];
                    objArr[0] = activity;
                    objArr[0] = bundle;
                    listAsList = Arrays.asList(objArr);
                } else {
                    listAsList = Arrays.asList(activity, bundle);
                }
                m2054(str, listAsList);
                int i11 = f1646 + 29;
                f1647 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
            /* renamed from: ｋ */
            public final void mo767(Activity activity) {
                int i10 = f1646 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1647 = i10 % 128;
                m2053((i10 % 2 != 0 ? m2057("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{0, 21, 66, 16}) : m2057("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{0, 21, 66, 16})).intern(), activity);
                int i11 = f1647 + 115;
                f1646 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private void m2056(String str, boolean z10, List<Object> list2) {
                cp.m1966(cp.this, com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2052(113 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 18, "\u0005\u0012\u0005\u0010\u0015￨\u0005\u0002\u0001\uffff\u0015\uffff\b\u0001ￊ\uffdd\uffff\u0010", 15 - TextUtils.getCapsMode("", 0, 0), false), str), z10, false, list2);
                int i10 = f1647 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f1646 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 81 / 0;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m2052(int i10, int i11, String str, int i12, boolean z10) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (com.ironsource.adqualitysdk.sdk.i.e.f2108) {
                    try {
                        char[] cArr2 = new char[i11];
                        com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                        while (true) {
                            int i13 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                            if (i13 >= i11) {
                                break;
                            }
                            com.ironsource.adqualitysdk.sdk.i.e.f2110 = cArr[i13];
                            cArr2[com.ironsource.adqualitysdk.sdk.i.e.f2107] = (char) (com.ironsource.adqualitysdk.sdk.i.e.f2110 + i10);
                            int i14 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                            cArr2[i14] = (char) (cArr2[i14] - f1648);
                            com.ironsource.adqualitysdk.sdk.i.e.f2107 = i14 + 1;
                        }
                        if (i12 > 0) {
                            com.ironsource.adqualitysdk.sdk.i.e.f2109 = i12;
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr2, 0, cArr3, 0, i11);
                            int i15 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                            System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                            int i16 = com.ironsource.adqualitysdk.sdk.i.e.f2109;
                            System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i11];
                            com.ironsource.adqualitysdk.sdk.i.e.f2107 = 0;
                            while (true) {
                                int i17 = com.ironsource.adqualitysdk.sdk.i.e.f2107;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i11 - i17) - 1];
                                com.ironsource.adqualitysdk.sdk.i.e.f2107 = i17 + 1;
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
        };
        int i10 = f1572 + 31;
        f1571 = i10 % 128;
        if (i10 % 2 == 0) {
            return jjVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private x m1988(final x xVar, final x xVar2) {
        if (xVar == null) {
            xVar = new x();
            f1572 = (f1571 + 65) % 128;
        }
        if (xVar2 == null) {
            xVar2 = new x();
            f1572 = (f1571 + 93) % 128;
        }
        return new x() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo577(JSONObject jSONObject, WebView webView, View view) {
                xVar2.mo577(jSONObject, webView, view);
                p.m3248(new e.AnonymousClass1(xVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo580(JSONObject jSONObject, WebView webView, View view) {
                xVar2.mo580(jSONObject, webView, view);
                p.m3248(new a.AnonymousClass3(xVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo612(JSONObject jSONObject, WebView webView, View view) {
                xVar2.mo612(jSONObject, webView, view);
                p.m3248(new i.AnonymousClass2(xVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo614(JSONObject jSONObject, WebView webView, View view) {
                xVar2.mo614(jSONObject, webView, view);
                p.m3248(new c.AnonymousClass2(xVar, jSONObject, webView, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo617(JSONObject jSONObject, WebView webView, Object obj, View view) {
                xVar2.mo617(jSONObject, webView, obj, view);
                p.m3248(new d.AnonymousClass5(xVar, jSONObject, webView, obj, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo613(JSONObject jSONObject, WebView webView, Object obj, View view) {
                xVar2.mo613(jSONObject, webView, obj, view);
                p.m3248(new b.AnonymousClass4(xVar, jSONObject, webView, obj, view));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo615(JSONObject jSONObject, WebView webView, Object obj, View view) {
                xVar2.mo615(jSONObject, webView, obj, view);
                p.m3248(new f.AnonymousClass4(xVar, jSONObject, webView, obj, view));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo616(JSONObject jSONObject, WebView webView, View view) {
                xVar2.mo616(jSONObject, webView, view);
                p.m3248(new h.AnonymousClass3(xVar, jSONObject, webView, view));
            }
        };
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1986(String str) {
        f1571 = (f1572 + 105) % 128;
        boolean zEndsWith = str.endsWith(m1975("킍킣̧︁橼剭邚◪ꗃ\uf10d", 1 - View.getDefaultSize(0, 0)).intern());
        f1571 = (f1572 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        return zEndsWith;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private x m1983(final boolean z10) {
        x xVar = new x() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.14

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static byte[] f1609 = {-103, -1, -20, 24, -11, -4, -3, 10, 37, -32, 3, -98, -17, -2, -4, 51, -31, -1, -20, 24, -11, -4, -3, 10, 37, -32, 3, -105, -1, -6, 8, -6, -3, 41, -33, 3, -99, 41, -35, -2, -3, 44, -30, -1, -6, 8, -6, -3, 41, -33, 3, -106, -1, -14, 4, 3, 41, -33, 3, -102, -1, -3, 5, 2, -19, 0, 51, -54, 18, -4, -13, -94, 6, 9, -17, 49, -47, 6, 9, -4, -3, 41, -34, -8, -2, -3, 10, 37, -31, -3, -18, -103, 6, 9, -17, 49, -40, -2, -5, 1, -2, 18, -97, -68, 13, -9, 9, -15, 1, 10, 29, -24, 35, -54, 8, 11, -10, 5, 18};

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f1610 = 1;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static int f1611 = 0;

            /* renamed from: ﻏ, reason: contains not printable characters */
            private static short[] f1612 = null;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1613 = -295393330;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1614 = 780639299;

            /* renamed from: ｋ, reason: contains not printable characters */
            private static int f1615 = 114;

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo612(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1610 + 105;
                f1611 = i10 % 128;
                int i11 = i10 % 2;
                mo612(jSONObject, webView, view);
                if (i11 != 0) {
                    int i12 = 78 / 0;
                }
                int i13 = f1611 + 65;
                f1610 = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo614(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1611 + 103;
                f1610 = i10 % 128;
                int i11 = i10 % 2;
                mo614(jSONObject, webView, view);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo577(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1611 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1610 = i10 % 128;
                int i11 = i10 % 2;
                mo577(jSONObject, webView, view);
                if (i11 == 0) {
                    throw null;
                }
                int i12 = f1611 + 29;
                f1610 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo580(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1610 + 99;
                f1611 = i10 % 128;
                int i11 = i10 % 2;
                mo580(jSONObject, webView, view);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1610 + 55;
                f1611 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo616(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1610 + 47;
                f1611 = i10 % 128;
                int i11 = i10 % 2;
                mo616(jSONObject, webView, view);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1611 + 79;
                f1610 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo613(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1611 + 109;
                f1610 = i10 % 128;
                int i11 = i10 % 2;
                mo613(jSONObject, webView, obj, view);
                if (i11 == 0) {
                    throw null;
                }
                int i12 = f1611 + 13;
                f1610 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﻛ */
            public final void mo577(JSONObject jSONObject, WebView webView, View view) {
                f1611 = (f1610 + 59) % 128;
                m2039(m2038((-115) - ExpandableListView.getPackedPositionType(0L), (short) (Color.rgb(0, 0, 0) + 16777216), (-780639299) - TextUtils.getOffsetBefore("", 0), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 295393427).intern(), jSONObject, webView, null, view);
                f1611 = (f1610 + 77) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo615(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1611 = (f1610 + 33) % 128;
                mo615(jSONObject, webView, obj, view);
                f1610 = (f1611 + 33) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﾇ */
            public final void mo580(JSONObject jSONObject, WebView webView, View view) {
                f1610 = (f1611 + 35) % 128;
                m2039(m2038((-115) - (ViewConfiguration.getTapTimeout() >> 16), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-780639289) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 295393428 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), jSONObject, webView, null, view);
                int i10 = f1610 + 1;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo617(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1611 = (f1610 + 19) % 128;
                mo617(jSONObject, webView, obj, view);
                int i10 = f1610 + 41;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﻐ */
            public final void mo612(JSONObject jSONObject, WebView webView, View view) {
                f1611 = (f1610 + 49) % 128;
                m2039(m2038(((byte) KeyEvent.getModifierMetaStateMask()) - 114, (short) (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionType(0L) - 780639240, (byte) ((-1) - Process.getGidForName("")), 295393448 - Gravity.getAbsoluteGravity(0, 0)).intern(), jSONObject, webView, null, view);
                int i10 = f1611 + 79;
                f1610 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﻛ */
            public final void mo613(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1611 = (f1610 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                m2039(m2038((-115) - (ViewConfiguration.getEdgeSlop() >> 16), (short) TextUtils.getCapsMode("", 0, 0), KeyEvent.keyCodeFromString("") - 780639263, (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 295393427).intern(), jSONObject, webView, obj, view);
                int i10 = f1610 + 63;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ｋ */
            public final void mo614(JSONObject jSONObject, WebView webView, View view) {
                f1610 = (f1611 + 105) % 128;
                m2039(m2038(View.MeasureSpec.getMode(0) - 115, (short) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.argb(0, 0, 0, 0) - 780639248, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 295393427 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), jSONObject, webView, null, view);
                f1611 = (f1610 + 81) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﾇ */
            public final void mo615(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1611 = (f1610 + 103) % 128;
                m2039(m2038(ImageFormat.getBitsPerPixel(0) - 114, (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) - 780639227, (byte) (Color.rgb(0, 0, 0) + 16777216), 295393449 - View.resolveSizeAndState(0, 0, 0)).intern(), jSONObject, webView, obj, view);
                int i10 = f1610 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﾒ */
            public final void mo617(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1611 = (f1610 + 77) % 128;
                m2039(m2038((-115) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (-780639273) - TextUtils.lastIndexOf("", '0'), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 295393428).intern(), jSONObject, webView, obj, view);
                int i10 = f1610 + 71;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m2038(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (n.f3160) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f1615;
                        int i14 = i10 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f1609;
                            if (bArr != null) {
                                i14 = (byte) (bArr[f1614 + i11] + i13);
                            } else {
                                i14 = (short) (f1612[f1614 + i11] + i13);
                            }
                        }
                        if (i14 > 0) {
                            n.f3165 = ((i11 + i14) - 2) + f1614 + i15;
                            n.f3163 = b10;
                            char c10 = (char) (i12 + f1613);
                            n.f3162 = c10;
                            sb2.append(c10);
                            n.f3161 = n.f3162;
                            n.f3164 = 1;
                            while (n.f3164 < i14) {
                                byte[] bArr2 = f1609;
                                if (bArr2 != null) {
                                    int i16 = n.f3165;
                                    n.f3165 = i16 - 1;
                                    n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                                } else {
                                    short[] sArr = f1612;
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

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.x
            /* renamed from: ﾒ */
            public final void mo616(JSONObject jSONObject, WebView webView, View view) {
                f1610 = (f1611 + 73) % 128;
                m2039(m2038((-115) - (ViewConfiguration.getTapTimeout() >> 16), (short) (ViewConfiguration.getTouchSlop() >> 8), (-780639209) - Process.getGidForName(""), (byte) (KeyEvent.getMaxKeyCode() >> 16), 295393429 - TextUtils.indexOf("", "")).intern(), jSONObject, webView, null, view);
                int i10 = f1610 + 69;
                f1611 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m2039(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cp.m1966(cp.this, com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2038((-115) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ExpandableListView.getPackedPositionType(0L), (-780639197) - TextUtils.getTrimmedLength(""), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 295393417), str), z10, false, Arrays.asList(jSONObject, webView, obj, view));
                int i10 = f1611 + 69;
                f1610 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }
        };
        f1572 = (f1571 + 43) % 128;
        return xVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private l m1982(final l lVar, final l lVar2) {
        int i10 = f1572 + 71;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (lVar == null) {
            lVar = new l();
        }
        if (lVar2 == null) {
            lVar2 = new l();
            f1571 = (f1572 + 11) % 128;
        }
        return new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ */
            public final void mo580(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo580(jSONObject, webView, activity);
                p.m3248(new a.AnonymousClass3(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ */
            public final void mo616(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo616(jSONObject, webView, activity);
                p.m3248(new h.AnonymousClass3(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final void mo612(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo612(jSONObject, webView, activity);
                p.m3248(new i.AnonymousClass2(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final void mo617(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo617(jSONObject, webView, obj, activity);
                p.m3248(new d.AnonymousClass5(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final void mo577(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo577(jSONObject, webView, activity);
                p.m3248(new e.AnonymousClass1(lVar, jSONObject, webView, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ */
            public final void mo613(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo613(jSONObject, webView, obj, activity);
                p.m3248(new b.AnonymousClass4(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final void mo614(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo614(jSONObject, webView, activity);
                p.m3248(new c.AnonymousClass2(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final void mo615(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo615(jSONObject, webView, obj, activity);
                p.m3248(new f.AnonymousClass4(lVar, jSONObject, webView, obj, activity));
            }
        };
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m1993(final String str, final List<Object> list) {
        p.m3248(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                cp.m1966(cp.this, str, false, false, list);
            }
        });
        p.m3251(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                cp.m1966(cp.this, str, true, false, list);
            }
        });
        m1992(new im() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                cp.m1966(cp.this, str, false, true, list);
            }
        }, true);
        f1572 = (f1571 + 71) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m1992(final im imVar, boolean z10) {
        try {
            if (z10) {
                p.m3253(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.10
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        p.m3247(imVar);
                    }
                });
                int i10 = f1571 + 1;
                f1572 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 81 / 0;
                    return;
                }
                return;
            }
            p.m3247(imVar);
            int i12 = f1572 + 65;
            f1571 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m1984(Activity activity, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ig.f2705, m2014().m1950());
            jSONObject.put(ig.f2661, m2014().m1953());
            jSONObject.put(ig.f2662, m2014().m1947());
            jSONObject.put(m1989((String) null, ExpandableListView.getPackedPositionChild(0L) + 128, (int[]) null, "\u0082\u0083\u008e\u009c\u0085\u0091\u008e").intern(), activity.getClass().getName());
            if (bundle != null) {
                int i10 = f1572 + 59;
                f1571 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.put(m1975("䃤䂅酣汅탼疶⨂떄航捛엨溬", -(ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1))).intern(), false);
                } else {
                    jSONObject.put(m1975("䃤䂅酣汅탼疶⨂떄航捛엨溬", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), true);
                }
            }
        } catch (JSONException unused) {
            k.m3147(m1989((String) null, 127 - KeyEvent.getDeadChar(0, 0), (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m1975("痊疏\ue525᠒ᆬ၈\ueb54肬\ue7e8\u175cҩ\u0b79龇ȩྒٶꪘ㧃㊲もꇹ㓄▮⮝볝⏣⣔⛻쯝建刼凊옥喀", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern());
        }
        int i11 = f1572 + 35;
        f1571 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 13 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m1997(String str) {
        Class clsM1168;
        int i10 = f1572 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            bg bgVarM2017 = m2017();
            ViewConfiguration.getScrollDefaultDelay();
            clsM1168 = bgVarM2017.m1168(ka.m3166(str, m1975("킍킣̧︁橼剭邚◪ꗃ\uf10d", 0).intern()));
            if (clsM1168 == null) {
                return null;
            }
        } else {
            clsM1168 = m2017().m1168(ka.m3166(str, m1975("킍킣̧︁橼剭邚◪ꗃ\uf10d", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern()));
            if (clsM1168 == null) {
                return null;
            }
        }
        String name = clsM1168.getName();
        f1571 = (f1572 + 37) % 128;
        return name;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m1980(Activity activity, List<String> list) {
        int i10 = f1571 + 17;
        f1572 = i10 % 128;
        if (i10 % 2 == 0) {
            list.isEmpty();
            throw null;
        }
        if (!list.isEmpty() && !list.contains(activity.getClass().getName())) {
            return false;
        }
        int i11 = f1572 + 33;
        f1571 = i11 % 128;
        if (i11 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1976(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (m1986(str)) {
                f1571 = (f1572 + 115) % 128;
                String strM1997 = m1997(str);
                if (strM1997 != null) {
                    int i10 = f1572 + 33;
                    f1571 = i10 % 128;
                    if (i10 % 2 != 0) {
                        arrayList.add(strM1997);
                        int i11 = 2 / 0;
                    } else {
                        arrayList.add(strM1997);
                    }
                }
            } else {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1989(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1573;
                int i11 = f1575;
                if (f1576) {
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
                if (f1577) {
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

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jo m1996(final List<String> list) {
        jo joVar = new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f1632 = 1;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static int f1633 = 0;

            /* renamed from: ﺙ, reason: contains not printable characters */
            private static boolean f1634 = true;

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int f1635 = 271;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f1636 = true;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f1637 = {382, 381, 341, 370, 388, 386, 347, 387, 353, 372, 385, 371, 336, 383, 376, 317};

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m2051(String str, final Activity activity, List<String> list2) {
                f1633 = (f1632 + 19) % 128;
                if (cp.m1995(activity, list2)) {
                    final String strK = com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2050(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0090\u008b\u008a\u0082\u008a\u0088\u0086\u008f\u0087\u0086\u0085\u0084\u0081\u0083\u008e\u008e\u008d"), str);
                    cp.m1966(cp.this, strK, true, false, Collections.singletonList(activity));
                    p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            cp.m1966(cp.this, strK, false, false, Collections.singletonList(activity));
                        }
                    });
                    f1633 = (f1632 + 31) % 128;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* renamed from: ﻛ */
            public final void mo755(Activity activity) {
                int i10 = f1632 + 107;
                f1633 = i10 % 128;
                m2051(m2050(null, i10 % 2 != 0 ? 6 >>> TextUtils.getCapsMode("", 1, 0) : TextUtils.getCapsMode("", 0, 0) + 127, null, "\u008c\u008a\u008b\u0081\u0088\u0086\u008a\u0089\u0086\u0085\u0084\u0081\u0083\u0082\u0081").intern(), activity, list);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jo
            /* renamed from: ｋ */
            public final void mo756(Activity activity) {
                int i10 = f1633 + 85;
                f1632 = i10 % 128;
                m2051(m2050(null, i10 % 2 == 0 ? 55 - TextUtils.getOffsetBefore("", 1) : TextUtils.getOffsetBefore("", 0) + 127, null, "\u0088\u0086\u0081\u0087\u0086\u0085\u0084\u0081\u0083\u0082\u0081").intern(), activity, list);
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m2050(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                        char[] cArr2 = f1637;
                        int i11 = f1635;
                        if (f1634) {
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
                        if (f1636) {
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
        };
        int i10 = f1571 + 39;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return joVar;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2009(String str, List<Object> list) {
        m1993(com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m1989((String) null, 127 - Color.alpha(0), (int[]) null, "\u008d\u0085\u008a\u008e\u0091\u0087\u008e\u0084\u008c¡\u008e\u008f\u0083\u0084\u0084 "), str), list);
        int i10 = f1572 + 103;
        f1571 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private l m1973(final boolean z10) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.11

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f1598 = {786615364, -472032777, 1109367275, 1723318077, -725493527, 967523925, -1072313284, -1928970602, -939548095, -1846819537, -1188424576, 359712903, -2086425615, -1469519809, -755670154, 1296563246, -10242547, 340176911};

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f1599 = 1;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private static int f1600;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo612(JSONObject jSONObject, WebView webView, Activity activity) {
                f1600 = (f1599 + 51) % 128;
                mo612(jSONObject, webView, activity);
                int i10 = f1600 + 11;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻛ */
            public final /* synthetic */ void mo614(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1599 + 111;
                f1600 = i10 % 128;
                int i11 = i10 % 2;
                mo614(jSONObject, webView, activity);
                if (i11 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo577(JSONObject jSONObject, WebView webView, Activity activity) {
                f1600 = (f1599 + 89) % 128;
                mo577(jSONObject, webView, activity);
                int i10 = f1599 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                f1600 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾇ */
            public final /* synthetic */ void mo580(JSONObject jSONObject, WebView webView, Activity activity) {
                f1600 = (f1599 + 33) % 128;
                mo580(jSONObject, webView, activity);
                f1600 = (f1599 + 115) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo616(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1599 + 87;
                f1600 = i10 % 128;
                int i11 = i10 % 2;
                mo616(jSONObject, webView, activity);
                if (i11 != 0) {
                    throw null;
                }
                int i12 = f1599 + 111;
                f1600 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﻐ */
            public final /* synthetic */ void mo613(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1599 = (f1600 + 51) % 128;
                mo613(jSONObject, webView, obj, activity);
                int i10 = f1600 + 35;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo580(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1600 + 11;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    m2021(m2020(new int[]{1357838378, -1853293199, 469173052, 1470295177, -1162877648, -1381495202, 1601253815, -256076300}, 35 % (ViewConfiguration.getScrollBarSize() * 7)).intern(), jSONObject, webView, null, activity);
                } else {
                    m2021(m2020(new int[]{1357838378, -1853293199, 469173052, 1470295177, -1162877648, -1381495202, 1601253815, -256076300}, 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), jSONObject, webView, null, activity);
                }
                f1600 = (f1599 + 59) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ｋ */
            public final /* synthetic */ void mo615(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1600 + 35;
                f1599 = i10 % 128;
                int i11 = i10 % 2;
                mo615(jSONObject, webView, obj, activity);
                if (i11 == 0) {
                    throw null;
                }
                int i12 = f1599 + 45;
                f1600 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo616(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1599 + 113;
                f1600 = i10 % 128;
                if (i10 % 2 != 0) {
                    m2021(m2020(new int[]{-1516270676, -1928781424, 1876101690, -362300530, -464785761, 506388420}, 'b' << AndroidCharacter.getMirror('N')).intern(), jSONObject, webView, null, activity);
                } else {
                    m2021(m2020(new int[]{-1516270676, -1928781424, 1876101690, -362300530, -464785761, 506388420}, AndroidCharacter.getMirror('0') - '%').intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.s
            /* renamed from: ﾒ */
            public final /* synthetic */ void mo617(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1600 + 107;
                f1599 = i10 % 128;
                int i11 = i10 % 2;
                mo617(jSONObject, webView, obj, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final void mo612(JSONObject jSONObject, WebView webView, Activity activity) {
                f1599 = (f1600 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
                m2021(m2020(new int[]{-96249618, -50214201, 1006999522, 242250734, 1932703387, -1243294797}, 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), jSONObject, webView, null, activity);
                int i10 = f1599 + 105;
                f1600 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final void mo613(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1600 = (f1599 + 89) % 128;
                m2021(m2020(new int[]{1478436806, 1188496500, -845490914, 1823411676, 714861733, 1668544432, -1356157074, 1673633120}, 15 - Color.argb(0, 0, 0, 0)).intern(), jSONObject, webView, obj, activity);
                int i10 = f1600 + 53;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 2 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo617(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1600 = (f1599 + 55) % 128;
                m2021(m2020(new int[]{1478436806, 1188496500, -845490914, 1823411676, 1126080345, 1599616371}, 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), jSONObject, webView, obj, activity);
                f1599 = (f1600 + 63) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo577(JSONObject jSONObject, WebView webView, Activity activity) {
                f1600 = (f1599 + 63) % 128;
                m2021(m2020(new int[]{1357838378, -1853293199, 469173052, 1470295177, -2140951976, 311481332}, 11 - Color.blue(0)).intern(), jSONObject, webView, null, activity);
                int i10 = f1600 + 109;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static String m2020(int[] iArr, int i10) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1845) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1598.clone();
                        com.ironsource.adqualitysdk.sdk.i.d.f1846 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
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
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = (c10 << 16) + c11;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = (c12 << 16) + c13;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                for (int i13 = 0; i13 < 16; i13++) {
                                    int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1844 ^ iArr2[i13];
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = i14;
                                    int iM2178 = com.ironsource.adqualitysdk.sdk.i.d.m2178(i14) ^ com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                    int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1844 = iM2178;
                                    com.ironsource.adqualitysdk.sdk.i.d.f1847 = i15;
                                }
                                int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1844;
                                int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1847;
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i17;
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i16;
                                int i18 = i16 ^ iArr2[16];
                                com.ironsource.adqualitysdk.sdk.i.d.f1847 = i18;
                                int i19 = i17 ^ iArr2[17];
                                com.ironsource.adqualitysdk.sdk.i.d.f1844 = i19;
                                cArr[0] = (char) (i19 >>> 16);
                                cArr[1] = (char) i19;
                                cArr[2] = (char) (i18 >>> 16);
                                cArr[3] = (char) i18;
                                com.ironsource.adqualitysdk.sdk.i.d.m2179(iArr2);
                                int i20 = com.ironsource.adqualitysdk.sdk.i.d.f1846;
                                cArr2[i20 << 1] = cArr[0];
                                cArr2[(i20 << 1) + 1] = cArr[1];
                                cArr2[(i20 << 1) + 2] = cArr[2];
                                cArr2[(i20 << 1) + 3] = cArr[3];
                                com.ironsource.adqualitysdk.sdk.i.d.f1846 = i20 + 2;
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

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo614(JSONObject jSONObject, WebView webView, Activity activity) {
                f1600 = (f1599 + 95) % 128;
                m2021(m2020(new int[]{1478436806, 1188496500, -397704008, -1453386109}, ((byte) KeyEvent.getModifierMetaStateMask()) + 9).intern(), jSONObject, webView, null, activity);
                f1600 = (f1599 + 109) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo615(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1600 = (f1599 + 35) % 128;
                m2021(m2020(new int[]{992479764, -1197396707, 4473799, -1985360276, 812654023, -1924692271, 487604835, -1745707246, -1616168760, -1755301163}, 20 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), jSONObject, webView, obj, activity);
                int i10 = f1600 + 67;
                f1599 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* renamed from: ﾒ, reason: contains not printable characters */
            private void m2021(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cp.m1966(cp.this, com.google.android.gms.internal.play_billing.a.k(new StringBuilder(), m2020(new int[]{741371940, -1554738951, -1875080094, -664754478, -796531261, 2115294261, 2107443999, -487757682, -1132572803, 500055709}, ImageFormat.getBitsPerPixel(0) + 20), str), z10, false, Arrays.asList(jSONObject, webView, obj, activity));
                f1599 = (f1600 + 97) % 128;
            }
        };
        int i10 = f1571 + 83;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            return lVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private t m1974(final t tVar, final t tVar2) {
        int i10 = f1571 + 49;
        f1572 = i10 % 128;
        if (i10 % 2 != 0) {
            if (tVar == null) {
                tVar = new t();
                f1571 = (f1572 + 79) % 128;
            }
            if (tVar2 == null) {
                tVar2 = new t();
                f1572 = (f1571 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            }
            return new t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.18
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﻛ */
                public final void mo613(JSONObject jSONObject, View view, Object obj, Activity activity) {
                    tVar2.mo613(jSONObject, view, obj, activity);
                    p.m3248(new b.AnonymousClass4(tVar, jSONObject, view, obj, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﾇ */
                public final void mo614(JSONObject jSONObject, View view, Activity activity) {
                    tVar2.mo614(jSONObject, view, activity);
                    p.m3248(new c.AnonymousClass2(tVar, jSONObject, view, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﻐ */
                public final void mo612(JSONObject jSONObject, View view, Activity activity) {
                    tVar2.mo612(jSONObject, view, activity);
                    p.m3248(new i.AnonymousClass2(tVar, jSONObject, view, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ｋ */
                public final void mo580(JSONObject jSONObject, View view, Activity activity) {
                    tVar2.mo580(jSONObject, view, activity);
                    p.m3248(new a.AnonymousClass3(tVar, jSONObject, view, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﾒ */
                public final void mo577(JSONObject jSONObject, View view, Activity activity) {
                    tVar2.mo577(jSONObject, view, activity);
                    p.m3248(new e.AnonymousClass1(tVar, jSONObject, view, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﻛ */
                public final void mo616(JSONObject jSONObject, View view, Activity activity) {
                    tVar2.mo616(jSONObject, view, activity);
                    p.m3248(new h.AnonymousClass3(tVar, jSONObject, view, activity));
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ﾇ */
                public final void mo615(JSONObject jSONObject, View view, Object obj, Activity activity) {
                    tVar2.mo615(jSONObject, view, obj, activity);
                    p.m3248(new f.AnonymousClass4(tVar, jSONObject, view, obj, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.t, com.ironsource.adqualitysdk.sdk.i.s
                /* renamed from: ｋ */
                public final void mo617(JSONObject jSONObject, View view, Object obj, Activity activity) {
                    tVar2.mo617(jSONObject, view, obj, activity);
                    p.m3248(new d.AnonymousClass5(tVar, jSONObject, view, obj, activity));
                }
            };
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1968(String str, boolean z10, boolean z11, List<Object> list) {
        int i10 = f1572 + 5;
        f1571 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                dl dlVarM2634 = this.f1584.m2634(str);
                if (dlVarM2634 != null) {
                    dq dqVarM2637 = this.f1584.m2637(dlVarM2634.m2335());
                    if (dqVarM2637 != null) {
                        int i11 = f1571 + 63;
                        f1572 = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 30 / 0;
                            if (z10 != dlVarM2634.m2336()) {
                                return;
                            }
                        } else if (z10 != dlVarM2634.m2336()) {
                            return;
                        }
                        if (z11 == dlVarM2634.m2334()) {
                            f1571 = (f1572 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                            if (q.m3297().m3316()) {
                                f1572 = (f1571 + 79) % 128;
                                co.m1956(m2007(), str);
                            }
                            dqVarM2637.m2365(this.f1585, this, list);
                            return;
                        }
                        return;
                    }
                    String strM2007 = m2007();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1975("蔨蕥岯ꆏ\uefa2䃘ᕜ灓띿꺒\ufae2寸潥뮤\uf187囦婽聚쳳怛儖贚\udbe0笏䰾騦", Color.argb(0, 0, 0, 0) + 1).intern());
                    sb2.append(dlVarM2634.m2335());
                    sb2.append(m1975("\udcfd\udcdd쾎㊥\uf16c秽உ⧉蹆㶱\ue478拐㚻⢇", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                    co.m1955(strM2007, sb2.toString(), null);
                    f1572 = (f1571 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                    return;
                }
                return;
            }
            this.f1584.m2634(str);
            throw null;
        } catch (Throwable th2) {
            String strM20072 = m2007();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m1989((String) null, 126 - TextUtils.lastIndexOf(DwaEpyvxz.vyHXNbmzTbzlhjl, '0'), (int[]) null, "¢\u0085\u008b\u0082\u0092\u0082¢£\u008b\u0089\u008f\u0087\u008b\u008e\u0096¢\u008c\u0084\u008c\u008c\u009d").intern());
            sb3.append(str);
            co.m1955(strM20072, sb3.toString(), th2);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1975(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2622) {
            try {
                char[] cArrM2781 = com.ironsource.adqualitysdk.sdk.i.i.m2781(f1574, cArr, i10);
                com.ironsource.adqualitysdk.sdk.i.i.f2623 = 4;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.i.f2623;
                    if (i11 < cArrM2781.length) {
                        com.ironsource.adqualitysdk.sdk.i.i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1574));
                        com.ironsource.adqualitysdk.sdk.i.i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2010(String str, JSONObject jSONObject) {
        if (str.equals(m1975("䗺䖛ﵦG쎘שׁ㥍낇ಁཌ횣\ue00e꾳ᩲ\udd9a\ued12", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern())) {
            this.f1580.m1941().m1136(jSONObject);
        } else if (str.equals(m1989((String) null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (int[]) null, "\u0087\u0082\u008a\u0084\u008f\u0091¤\u0087\u008e").intern())) {
            this.f1580.m1941().m1141(jSONObject);
        }
        JSONObject jSONObjectM3179 = kc.m3179(m1977(jSONObject));
        if (str.equals(ig.f2668)) {
            f1572 = (f1571 + 87) % 128;
            this.f1580.m1941().m1134(jSONObjectM3179);
            return;
        }
        if (str.equals(ig.f2664)) {
            int i10 = f1572 + 33;
            f1571 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f1580.m1941().m1139(jSONObjectM3179);
                return;
            } else {
                this.f1580.m1941().m1139(jSONObjectM3179);
                throw null;
            }
        }
        if (str.equals(ig.f2672)) {
            f1572 = (f1571 + 87) % 128;
            this.f1580.m1941().m1142(jSONObjectM3179);
            int i11 = f1571 + 79;
            f1572 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 41 / 0;
                return;
            }
            return;
        }
        if (str.equals(ig.f2671)) {
            this.f1580.m1941().m1131(jSONObjectM3179);
            return;
        }
        if (str.equals(ig.f2665)) {
            this.f1580.m1941().m1132(jSONObjectM3179);
            return;
        }
        if (str.equals(ig.f2666)) {
            f1572 = (f1571 + 81) % 128;
            this.f1580.m1941().m1129(jSONObjectM3179);
        } else if (str.equals(ig.f2667)) {
            this.f1580.m1941().m1130(jSONObjectM3179);
        } else {
            this.f1580.m1941().m1138(str, jSONObject);
        }
    }
}
