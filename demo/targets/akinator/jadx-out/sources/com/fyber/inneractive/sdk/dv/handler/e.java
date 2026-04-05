package com.fyber.inneractive.sdk.dv.handler;

import android.os.Bundle;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.dv.j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    public static final List f23443e = Arrays.asList(UnitDisplayType.INTERSTITIAL, UnitDisplayType.REWARDED, UnitDisplayType.BANNER);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23444a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f23445b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23446c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f23447d = 0;

    public static AdRequest a(e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        eVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_3");
        AdRequest.Builder builder = new AdRequest.Builder();
        try {
            Object objInvoke = AbstractAdRequestBuilder.class.getMethod("setRequestAgent", String.class).invoke(builder, "FyberMarketplace-v8.4.0");
            if (objInvoke != null) {
                builder = (AdRequest.Builder) objInvoke;
            }
            Object objInvoke2 = AbstractAdRequestBuilder.class.getMethod("addNetworkExtrasBundle", Class.class, Bundle.class).invoke(builder, AdMobAdapter.class, bundle);
            if (objInvoke2 != null) {
                builder = (AdRequest.Builder) objInvoke2;
            }
        } catch (ClassNotFoundException unused) {
            builder.setRequestAgent("FyberMarketplace-v8.4.0").addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        }
        return builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001b, code lost:
    
        r0 = "na";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            java.lang.Class<com.google.android.gms.ads.MobileAds> r0 = com.google.android.gms.ads.MobileAds.class
            java.lang.String r1 = "getVersion"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.Throwable -> L19
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.Throwable -> L19
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NoSuchMethodException -> L14 java.lang.Throwable -> L19
            goto L1b
        L14:
            java.lang.String r0 = com.google.android.gms.ads.MobileAds.getVersionString()     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            java.lang.String r0 = "na"
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.dv.handler.e.b():java.lang.String");
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public final void a() {
        AdFormat adFormat;
        Iterator it = f23443e.iterator();
        while (it.hasNext()) {
            int i10 = d.f23442a[((UnitDisplayType) it.next()).ordinal()];
            if (i10 == 1 || i10 == 2) {
                adFormat = AdFormat.BANNER;
            } else if (i10 != 3) {
                adFormat = AdFormat.INTERSTITIAL;
            } else {
                adFormat = AdFormat.REWARDED;
            }
            r.f26803a.execute(new c(this, adFormat));
        }
    }

    @Override // com.fyber.inneractive.sdk.dv.handler.a
    public final j a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        j jVar;
        int i10 = d.f23442a[unitDisplayType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i10 != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = (QueryInfo) this.f23444a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f23446c) {
                this.f23444a.remove(adFormat);
            }
            jVar = new j(queryInfo);
        } else {
            jVar = null;
        }
        IAlog.a("DVHanlder - get query: %s", jVar);
        r.f26803a.execute(new c(this, adFormat));
        return jVar;
    }

    public static void a(String str, com.fyber.inneractive.sdk.dv.enums.a aVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, String str2) {
        IAlog.a(a.b.m("Firing Event 1001 -Phase - ", aVar.name(), "  Fetch error DV - msg  ", str2), new Object[0]);
        w wVar = new w(t.DV_ERROR_PHASE, inneractiveAdRequest, eVar);
        wVar.f24329f.put(new x().a(str, "spot_id").a(aVar.name().toLowerCase(Locale.US), "phase").a(b(), "version").a(str2, PglCryptUtils.KEY_MESSAGE).f24331a);
        wVar.a((String) null);
    }
}
