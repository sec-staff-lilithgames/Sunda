package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bb {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f931 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f932 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static long f933 = -4777614816681188125L;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f934 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f935 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f936 = 3298352059009476285L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Handler f937;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ah f938;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ISAdQualityAdListener f939;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Set<io> f940 = new HashSet();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Set<String> f941 = new HashSet();

    public bb(Handler handler, ah ahVar) {
        this.f938 = ahVar;
        this.f937 = handler;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1124(bb bbVar, String str, JSONObject jSONObject) throws JSONException {
        int i10 = f934 + 77;
        f931 = i10 % 128;
        int i11 = i10 % 2;
        bbVar.m1128(str, jSONObject);
        if (i11 == 0) {
            throw null;
        }
        f931 = (f934 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ ah m1125(bb bbVar) {
        int i10 = f931 + 9;
        f934 = i10 % 128;
        int i11 = i10 % 2;
        ah ahVar = bbVar.f938;
        if (i11 == 0) {
            return ahVar;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final void m1129(JSONObject jSONObject) {
        int i10 = f931 + 35;
        f934 = i10 % 128;
        int i11 = i10 % 2;
        long packedPositionForChild = ExpandableListView.getPackedPositionForChild(0, 0);
        m1138((i11 != 0 ? m1126("㞧뛶떋\ued6a", (char) (32085 % (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1))), "㘾㌍딺ㅃ蒟쨈\udff5䇋晹㦾Ⅎ\udbbb\u05fa돎⬴", TextUtils.indexOf((CharSequence) "", (char) 29, 1, 0) - 1950943690, "⚽\ue570ᦸⷆ") : m1126("㞧뛶떋\ued6a", (char) (27316 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1))), "㘾㌍딺ㅃ蒟쨈\udff5䇋晹㦾Ⅎ\udbbb\u05fa돎⬴", (-1950943690) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "⚽\ue570ᦸⷆ")).intern(), jSONObject);
        f931 = (f934 + 41) % 128;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final void m1130(JSONObject jSONObject) {
        f931 = (f934 + 49) % 128;
        m1138(m1126("쀝\u2e75冑呂", (char) (Color.green(0) + 16977), "筱袶\uddbb峉䦣뛐ᅤ즒䖙勯奥쁍孄", (-1859226176) - (ViewConfiguration.getTouchSlop() >> 8), "⚽\ue570ᦸⷆ").intern(), jSONObject);
        int i10 = f931 + 69;
        f934 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final void m1131(JSONObject jSONObject) {
        int i10 = f934 + 47;
        f931 = i10 % 128;
        m1138(m1127("垒ق埳⋂䤶\u0084ꂖ칠쑮빌\udda3ꋐ烯䷝", i10 % 2 == 0 ? 0 - ExpandableListView.getPackedPositionType(1L) : ExpandableListView.getPackedPositionType(0L) + 1).intern(), jSONObject);
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m1132(JSONObject jSONObject) {
        f931 = (f934 + 93) % 128;
        m1138(m1126("凷ឮ∯蟳", (char) ((Process.getThreadPriority(0) + 20) >> 6), "䡫襫⨇ָ놠鮧ꜘ題噱ᐩ⺥", Drawable.resolveOpacity(0, 0) + 790081105, "⚽\ue570ᦸⷆ").intern(), jSONObject);
        f931 = (f934 + 7) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m1133(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = (f931 + 1) % 128;
        f934 = i10;
        this.f939 = iSAdQualityAdListener;
        f931 = (i10 + 27) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m1136(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(ig.f2704);
        ISAdQualityAdListener iSAdQualityAdListener = this.f939;
        if (iSAdQualityAdListener != null) {
            int i10 = f934 + 55;
            f931 = i10 % 128;
            if (i10 % 2 == 0) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ig.f2705), ISAdQualityAdType.fromInt(iOptInt));
                throw null;
            }
            iSAdQualityAdListener.adDisplayed(jSONObject.optString(ig.f2705), ISAdQualityAdType.fromInt(iOptInt));
        }
        f931 = (f934 + 105) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m1139(JSONObject jSONObject) {
        f934 = (f931 + 9) % 128;
        m1138(m1127("̴汨͕䣨ꅆ\ue8f4ኮ籘郋푳㗇ჩ\u2458⟶顎", -ExpandableListView.getPackedPositionChild(0L)).intern(), jSONObject);
        int i10 = f934 + 49;
        f931 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m1134(JSONObject jSONObject) {
        int i10 = f934 + 91;
        f931 = i10 % 128;
        m1138(m1127("ꮓꑢ꯲胢ᴫ咙ﻘ逮㡼᱿覮ﲌ賿\ueffc␣", i10 % 2 == 0 ? 0 - (ViewConfiguration.getScrollBarFadeDuration() / 84) : (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1).intern(), jSONObject);
        int i11 = f931 + 93;
        f934 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 70 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m1138(final String str, final JSONObject jSONObject) {
        this.f937.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.4
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() throws JSONException {
                bb.m1124(bb.this, str, jSONObject);
            }
        });
        int i10 = f934 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f931 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m1141(JSONObject jSONObject) {
        int i10 = f934 + 1;
        f931 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ISAdQualityAdListener iSAdQualityAdListener = this.f939;
        if (iSAdQualityAdListener != null) {
            iSAdQualityAdListener.adClosed(jSONObject.optString(ig.f2705), ISAdQualityAdType.fromInt(jSONObject.optInt(ig.f2704)));
            f934 = (f931 + 3) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m1142(JSONObject jSONObject) {
        f931 = (f934 + 23) % 128;
        m1138(m1126("㝴볷揹ﭗ", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "焪啍怿竗縩喓쎯퐪䐡眫摴", (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 105056457, "⚽\ue570ᦸⷆ").intern(), jSONObject);
        f934 = (f931 + 7) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1122(String str, JSONObject jSONObject) {
        Iterator it = new HashSet(this.f940).iterator();
        while (it.hasNext()) {
            f931 = (f934 + 95) % 128;
            JSONObject jSONObjectMo1000 = ((io) it.next()).mo1000(str, jSONObject);
            if (jSONObjectMo1000 != null) {
                int i10 = f934 + 57;
                f931 = i10 % 128;
                int i11 = i10 % 2;
                kc.m3194(jSONObject, jSONObjectMo1000);
                if (i11 == 0) {
                    throw null;
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m1128(final String str, JSONObject jSONObject) throws JSONException {
        m1122(str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str2 = ig.f2705;
            jSONObject2.put(str2, jSONObject.remove(str2));
            String str3 = ig.f2661;
            jSONObject2.put(str3, jSONObject.remove(str3));
            f934 = (f931 + 51) % 128;
        } catch (JSONException unused) {
        }
        this.f938.m743(str, jSONObject, jSONObject2, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (ig.f2653.contains(str)) {
                    p.m3253(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.2.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() {
                            bb.m1125(bb.this).m741();
                        }
                    });
                }
            }
        });
        f931 = (f934 + 9) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m1137(io ioVar) {
        int i10 = f931 + 11;
        f934 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f940.add(ioVar);
            int i11 = 68 / 0;
        } else {
            this.f940.add(ioVar);
        }
        f931 = (f934 + 15) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static double m1123() {
        f931 = (f934 + 47) % 128;
        if (aq.m814().mo832()) {
            return 100.0d;
        }
        f934 = (f931 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        double dMo833 = aq.m814().mo833();
        f931 = (f934 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return dMo833;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1127(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f933, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f933));
                        i.f2623 = i11 + 1;
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m1135(String str, String str2, String str3, String str4) {
        int i10 = f934 + 75;
        f931 = i10 % 128;
        if (i10 % 2 == 0) {
            m1140(str, str2, str3, str4, null, false);
        } else {
            m1140(str, str2, str3, str4, null, false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m1140(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z10) {
        synchronized (this.f941) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(m1126("\uee1d䖆枞湠", (char) (24679 - View.combineMeasuredStates(0, 0)), "㕳", AndroidCharacter.getMirror('0') - 31042, "⚽\ue570ᦸⷆ").intern());
                sb2.append(str2);
                String string = sb2.toString();
                if (!this.f941.contains(string) || z10 || aq.m814().mo837()) {
                    this.f941.add(string);
                    if (Math.random() * 100.0d < m1123()) {
                        JSONObject jSONObjectM733 = ah.m733(str, str2, str3, str4, jSONObject);
                        m1122(m1127("\ufde0⑤ﶔ÷蹘쟁\udf67놫渞鱹\u1afc\udd20", -((byte) KeyEvent.getModifierMetaStateMask())).intern(), jSONObjectM733);
                        this.f938.m742(m1127("\ufde0⑤ﶔ÷蹘쟁\udf67놫渞鱹\u1afc\udd20", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern(), jSONObjectM733);
                        return;
                    }
                    k.m3136(m1127("ꆲ塰ꇷ糥趁쐢횁롆㉊\ue04cᤕ퓚蛎Ꮾ뒎", -((byte) KeyEvent.getModifierMetaStateMask())).intern(), m1127("ฅ⌼แ\u07b6칈蟽큍뺇鷨鬡嫋툑⥳梠\uf703䗸듑ﳤ菲沈䁇偀ၹ沴\uefdc◕갚聆笹뤷㣞㎜ڵ\u0ee2픃Ꝟ鉂\ue20b懻\udb34ↈ瞀︼仸촉쬏誱\ue209奲墳❘ᖌ\ue4f1", TextUtils.getOffsetBefore("", 0) + 1).intern());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1126(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f936) ^ f932) ^ f935);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
