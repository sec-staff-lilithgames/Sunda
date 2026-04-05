package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.b6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d6 extends g5 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f13867o = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final x2 f13868g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f13869h;

    /* renamed from: i, reason: collision with root package name */
    private final List f13870i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0034a f13871j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f13872k;

    /* renamed from: l, reason: collision with root package name */
    private final String f13873l;

    /* renamed from: m, reason: collision with root package name */
    private long f13874m;

    /* renamed from: n, reason: collision with root package name */
    private final List f13875n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends g5 {

        /* renamed from: g, reason: collision with root package name */
        private final long f13876g;

        /* renamed from: h, reason: collision with root package name */
        private final int f13877h;

        /* renamed from: i, reason: collision with root package name */
        private final v2 f13878i;

        /* renamed from: j, reason: collision with root package name */
        private final List f13879j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends f3 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f13881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f13882c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.InterfaceC0034a interfaceC0034a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0034a);
                this.f13881b = maxAdFormat;
                this.f13882c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f13876g;
                com.applovin.impl.sdk.o unused = b.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f14005c;
                    String str2 = b.this.f14004b;
                    StringBuilder sbR = b0.e2.r(jElapsedRealtime, "Ad failed to load in ", " ms for ");
                    sbR.append(this.f13881b.getLabel());
                    sbR.append(" ad unit ");
                    sbR.append(str);
                    sbR.append(" with error: ");
                    sbR.append(maxError);
                    oVar.a(str2, sbR.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f13878i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f13877h >= b.this.f13879j.size() - 1) {
                    d6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f14003a.r0().a((g5) new b(bVar2.f13877h + 1, b.this.f13879j), b6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f13876g;
                com.applovin.impl.sdk.o unused = b.this.f14005c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f14005c;
                    String str = b.this.f14004b;
                    StringBuilder sbR = b0.e2.r(jElapsedRealtime, "Ad loaded in ", "ms for ");
                    b0.e2.w(this.f13881b, sbR, " ad unit ");
                    b0.e2.B(sbR, this.f13882c, oVar, str);
                }
                v2 v2Var = (v2) maxAd;
                b.this.a(v2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f13877h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f13879j.size()) {
                        d6.this.b(v2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((v2) bVar.f13879j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = d6.this.f13868g.b();
            MaxAdFormat maxAdFormatA = d6.this.f13868g.a();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f14005c;
                String str = this.f14004b;
                StringBuilder sb2 = new StringBuilder("Loading ad ");
                sb2.append(this.f13877h + 1);
                sb2.append(" of ");
                sb2.append(this.f13879j.size());
                sb2.append(" from ");
                sb2.append(this.f13878i.c());
                sb2.append(" for ");
                sb2.append(maxAdFormatA.getLabel());
                sb2.append(" ad unit ");
                b0.e2.B(sb2, strB, oVar, str);
            }
            b("started to load ad");
            Context context = (Context) d6.this.f13872k.get();
            Activity activityV0 = context instanceof Activity ? (Activity) context : this.f14003a.v0();
            this.f14003a.a0().b(this.f13878i);
            this.f14003a.X().loadThirdPartyMediatedAd(strB, this.f13878i, activityV0, new a(d6.this.f13871j, maxAdFormatA, strB));
        }

        private b(int i10, List list) {
            super(d6.this.f14004b, d6.this.f14003a, d6.this.f13868g.b());
            this.f13876g = SystemClock.elapsedRealtime();
            this.f13877h = i10;
            this.f13878i = (v2) list.get(i10);
            this.f13879j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(v2 v2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            d6.this.f13875n.add(new MaxNetworkResponseInfoImpl(adLoadState, t3.a(v2Var.b()), v2Var.F(), v2Var.U(), j10, v2Var.C(), maxError));
        }
    }

    public d6(x2 x2Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0034a interfaceC0034a) {
        super("TaskProcessMediationWaterfall", kVar, x2Var.b());
        this.f13868g = x2Var;
        this.f13869h = jSONObject;
        this.f13871j = interfaceC0034a;
        this.f13872k = new WeakReference(context);
        this.f13873l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayT = b0.e2.t(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.f13870i = new ArrayList(jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            this.f13870i.add(v2.a(x2Var, JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f13875n = new ArrayList(this.f13870i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f13874m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f13869h.optBoolean("is_testing", false) && !this.f14003a.t0().c() && f13867o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new m9(this, 6));
        }
        String strB = this.f13868g.b();
        MaxAdFormat maxAdFormatA = this.f13868g.a();
        if (this.f13870i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f13870i.size() + " ad(s)...");
            }
            this.f14003a.r0().a(new b(i10, this.f13870i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.k(this.f14004b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k7.a(strB, maxAdFormatA, this.f13869h, this.f14003a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f13869h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (t3.a(this.f13869h, strB, this.f14003a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, a.b.l("Ad Unit ID ", strB, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (k7.c(this.f14003a) && ((Boolean) this.f14003a.a(v4.f15998o6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        s8 s8Var = new s8(5, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.f14003a, s8Var);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(s8Var, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        k7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f14003a.v0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v2 v2Var) {
        this.f14003a.a0().c(v2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13874m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f14005c;
            String str = this.f14004b;
            StringBuilder sbR = b0.e2.r(jElapsedRealtime, "Waterfall loaded in ", "ms from ");
            sbR.append(v2Var.c());
            sbR.append(" for ");
            sbR.append(this.f13868g.a().getLabel());
            sbR.append(" ad unit ");
            sbR.append(this.f13868g.b());
            oVar.d(str, sbR.toString());
        }
        v2Var.a(new MaxAdWaterfallInfoImpl(v2Var, jElapsedRealtime, this.f13875n, this.f13873l));
        q2.f(this.f13871j, v2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f13875n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f13875n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb2.append(i10);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.f13868g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13874m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f14005c;
            String str = this.f14004b;
            StringBuilder sbR = b0.e2.r(jElapsedRealtime, "Waterfall failed in ", "ms for ");
            sbR.append(this.f13868g.a().getLabel());
            sbR.append(" ad unit ");
            sbR.append(strB);
            sbR.append(" with error: ");
            sbR.append(maxError);
            oVar.d(str, sbR.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f13869h, "waterfall_name", ""), JsonUtils.getString(this.f13869h, "waterfall_test_name", ""), jElapsedRealtime, this.f13875n, this.f13868g, JsonUtils.optList(JsonUtils.getJSONArray(this.f13869h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f13873l, JsonUtils.getString(this.f13869h, "event_id", "")));
        q2.a(this.f13871j, strB, maxError);
    }
}
