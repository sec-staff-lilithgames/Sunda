package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final o f26657a;

    public k(o oVar) {
        this.f26657a = oVar;
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final void a(b bVar) throws NumberFormatException {
        float f10;
        Long lValueOf;
        bVar.f26618a.D = false;
        IAConfigManager.O.f23229x.f23424e = false;
        ImpressionData impressionData = new ImpressionData();
        Map mapB = this.f26657a.b();
        String strA = a(mapB, n.RETURNED_AD_TYPE);
        a(mapB, n.ERROR_CODE);
        String strA2 = a(mapB, n.SESSION_ID);
        String strA3 = a(mapB, n.CONTENT_ID);
        a(mapB, n.PUBLISHER_ID);
        String strA4 = a(mapB, n.WIDTH);
        String strA5 = a(mapB, n.HEIGHT);
        String strA6 = a(mapB, n.SDK_IMPRESSION_URL);
        String strA7 = a(mapB, n.SDK_CLICK_URL);
        String strA8 = a(mapB, n.ATTRIBUTION_IMPRESSION_URL);
        String strA9 = a(mapB, n.ATTRIBUTION_CLICK_URL);
        String strA10 = a(mapB, n.AD_TIMEOUT);
        String strA11 = a(mapB, n.AD_COMPLETION_URL);
        bVar.f26619b = a(mapB, n.AD_UNIT_ID);
        a(mapB, n.AD_UNIT_TYPE);
        String strA12 = a(mapB, n.AD_UNIT_DISPLAY_TYPE);
        String strA13 = a(mapB, n.AD_NETWORK);
        String strA14 = a(mapB, n.AD_NETWORK_ID);
        String strA15 = a(mapB, n.CREATIVE_ID);
        String strA16 = a(mapB, n.AD_DOMAIN);
        String strA17 = a(mapB, n.APP_BUNDLE);
        String strA18 = a(mapB, n.CAMPAIGN_ID);
        String strA19 = a(mapB, n.CPM_VALUE);
        String strA20 = a(mapB, n.CPM_CURRENCY);
        impressionData.setCpmValue(strA19);
        impressionData.setCurrency(strA20);
        String strA21 = a(mapB, n.BANNER_MRC_PERCENT);
        String strA22 = a(mapB, n.BANNER_MRC_DURATION);
        String strA23 = a(mapB, n.BANNER_MRC_IMPRESSION_URL);
        String strA24 = a(mapB, n.INTERSTITIAL_SKIP_MODE);
        String strA25 = a(mapB, n.IGNITE_INSTALL_URL);
        String strA26 = a(mapB, n.IGNITE_MODE);
        String strA27 = a(mapB, n.APP_BUNDLE_LAUNCHER);
        String strA28 = a(mapB, n.BRAND_BIDDER_SHOW_ENDCARD);
        String strA29 = a(mapB, n.BRAND_BIDDER_CTA_TEXT);
        String strA30 = a(mapB, n.MRAID_VIDEO_SIGNAL);
        String strA31 = a(mapB, n.CREATIVE_TYPE);
        if (bVar.c()) {
            bVar.f26618a.f26646r = mapB;
        }
        bVar.f26618a.a(strA10);
        impressionData.setImpressionId(strA2);
        impressionData.setDemandSource(strA13);
        e eVar = bVar.f26618a;
        eVar.f26632d = strA3;
        eVar.A = strA17;
        if (!TextUtils.isEmpty(strA14)) {
            if (TextUtils.isEmpty(strA14)) {
                lValueOf = null;
                impressionData.setDemandId(lValueOf);
            } else {
                try {
                    lValueOf = Long.valueOf(strA14);
                } catch (NumberFormatException unused) {
                }
                impressionData.setDemandId(lValueOf);
            }
        }
        if (!TextUtils.isEmpty(strA)) {
            bVar.f26618a.f26635g = Integer.valueOf(strA).intValue();
        }
        if (!TextUtils.isEmpty(strA4)) {
            bVar.f26618a.f26633e = Integer.valueOf(strA4).intValue();
        }
        if (!TextUtils.isEmpty(strA5)) {
            bVar.f26618a.f26634f = Integer.valueOf(strA5).intValue();
        }
        e eVar2 = bVar.f26618a;
        eVar2.f26639k = strA6;
        eVar2.f26640l = strA7;
        eVar2.f26641m = strA8;
        eVar2.f26642n = strA9;
        eVar2.f26645q = strA11;
        eVar2.f26643o = bVar.f26619b;
        try {
            eVar2.f26644p = UnitDisplayType.fromValue(strA12);
        } catch (IllegalArgumentException unused2) {
            bVar.f26618a.f26644p = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(strA15)) {
            impressionData.setCreativeId(strA15);
        }
        if (!TextUtils.isEmpty(strA16)) {
            impressionData.setAdvertiserDomain(strA16);
        }
        if (!TextUtils.isEmpty(strA18)) {
            impressionData.setCampaignId(strA18);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        e eVar3 = bVar.f26618a;
        eVar3.f26648t = impressionData;
        eVar3.f26650v = v.a(strA21, 0);
        e eVar4 = bVar.f26618a;
        if (TextUtils.isEmpty(strA22)) {
            f10 = -1.0f;
        } else {
            try {
                f10 = Float.parseFloat(strA22);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar4.f26651w = f10;
        e eVar5 = bVar.f26618a;
        eVar5.f26652x = strA23;
        eVar5.f26653y = v.a(strA24, -1);
        if (!TextUtils.isEmpty(strA25)) {
            bVar.f26618a.G = strA25;
        }
        if (!TextUtils.isEmpty(strA26)) {
            e eVar6 = bVar.f26618a;
            m mVarA = m.a(strA26);
            if (mVarA == null) {
                eVar6.getClass();
                mVarA = m.NONE;
            }
            eVar6.H = mVarA;
        }
        if (!TextUtils.isEmpty(strA27)) {
            bVar.f26618a.I = strA27;
        }
        if (!TextUtils.isEmpty(strA28)) {
            bVar.f26618a.E = strA28;
        }
        if (!TextUtils.isEmpty(strA29)) {
            bVar.f26618a.F = strA29;
        }
        bVar.f26618a.J = "1".equals(strA30) || Boolean.parseBoolean(strA30);
        bVar.f26618a.M = CreativeType.fromValue(strA31);
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f26657a.a().toString();
    }

    public final String a(Map map, n nVar) {
        String lowerCase = nVar.a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.e("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        IAlog.d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }
}
