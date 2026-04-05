package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f24335a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24336b;

    /* renamed from: c, reason: collision with root package name */
    public String f24337c;

    public y(String str, String str2, String str3, Long l9, String str4, String str5, String str6, String str7) {
        String strL;
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            strL = DtbConstants.HTTPS + IAConfigManager.O.f23214i.f23327f;
        } else {
            strL = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches() ? a.b.l(DtbConstants.HTTPS, property, "/simpleM2M/Event") : a.b.l(DtbConstants.HTTPS, property, ".inner-active.mobi/simpleM2M/Event");
        }
        this.f24337c = null;
        if (TextUtils.isEmpty(strL)) {
            throw new InvalidParameterException();
        }
        this.f24336b = new HashMap();
        this.f24335a = strL;
        a(str7 == null ? "8.4.0" : str7, Q6.V);
        a(com.fyber.inneractive.sdk.util.o.f26796a.getPackageName(), "pkgn");
        if (IAConfigManager.d()) {
            return;
        }
        a("Android", "osn");
        a(Build.VERSION.RELEASE, Q6.G);
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l9, "adnt_id");
        a(str4, CampaignEx.JSON_KEY_CREATIVE_ID);
        a(str5, "adomain");
        a(str6, "campaign_id");
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.f24336b.put(str, obj);
    }
}
