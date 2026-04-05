package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class an {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f537 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f538 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f539 = 7438855818920780276L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ah f540;

    public an(ah ahVar) {
        this.f540 = ahVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m802(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f539, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f539));
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m803(ISAdQualitySegment iSAdQualitySegment) throws JSONException {
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                f538 = (f537 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
                jSONObject.put(m802("\udc11ⴔ\udc62\uf641첇㗇딅Ⴔ", View.MeasureSpec.getSize(0)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m802("裢ͺ袑쪪\ue2efथᨼ뾅", Color.blue(0)).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m802("濢⯶澑ۄ쩥앉\uf0e1啓", ViewConfiguration.getLongPressTimeout() >> 16).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                f538 = (f537 + 93) % 128;
                jSONObject.put(m802("ᷨ팰ᶛ襼㊨䫢\uf7b3刃", View.getDefaultSize(0, 0)).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(m802("揶⸻掅\uedf7쾿\u2e7e籪\ud9cf", TextUtils.getTrimmedLength("")).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m802("뱒茎밡\uec70抓⿹몹㯶ἕ", TextUtils.lastIndexOf("", '0', 0) + 1).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                int i10 = f538 + 27;
                f537 = i10 % 128;
                jSONObject.put(i10 % 2 != 0 ? m802("듐猢뒣\uf509銣㚂\ue462䇚", ViewConfiguration.getJumpTapTimeout() - 61).intern() : m802("듐猢뒣\uf509銣㚂\ue462䇚", ViewConfiguration.getJumpTapTimeout() >> 16).intern(), iSAdQualitySegment.getUserCreationDate());
                return jSONObject;
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m804(ISAdQualitySegment iSAdQualitySegment) {
        ah ahVar;
        int i10;
        int i11 = f538 + 89;
        f537 = i11 % 128;
        if (i11 % 2 != 0) {
            ahVar = this.f540;
            i10 = (ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1)) * (-1);
        } else {
            ahVar = this.f540;
            i10 = (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        }
        ahVar.m742(m802("澵묛濆㿄媊ﱘ쨺\ue816튺澹琛䉸恰䫡\uec38", i10).intern(), m803(iSAdQualitySegment));
    }
}
