package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b6;
import com.applovin.impl.b8;
import com.applovin.impl.c2;
import com.applovin.impl.c6;
import com.applovin.impl.g5;
import com.applovin.impl.h7;
import com.applovin.impl.k;
import com.applovin.impl.k7;
import com.applovin.impl.l2;
import com.applovin.impl.o0;
import com.applovin.impl.o9;
import com.applovin.impl.q2;
import com.applovin.impl.r0;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v1;
import com.applovin.impl.v4;
import com.applovin.impl.w5;
import com.applovin.impl.x4;
import com.applovin.impl.y5;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0038a {

    /* renamed from: a, reason: collision with root package name */
    private final k f15232a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15233b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15234c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f15235d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f15236e = a.b.u();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f15237f = new AtomicReference();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1 f15238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f15239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f15240c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15241d;

        public a(v1 v1Var, com.applovin.impl.sdk.ad.b bVar, Uri uri, Context context) {
            this.f15238a = v1Var;
            this.f15239b = bVar;
            this.f15240c = uri;
            this.f15241d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f15232a.n0().pauseForClick();
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                AppLovinAdServiceImpl.this.f15232a.n0().resumeForClick();
            }
            if (this.f15238a != null) {
                this.f15238a.e(AppLovinAdServiceImpl.this.f15232a.p().getJavaScript(str, bundle));
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            o unused = AppLovinAdServiceImpl.this.f15233b;
            if (o.a()) {
                AppLovinAdServiceImpl.this.f15233b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f15239b, this.f15240c, this.f15241d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f15243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f15244b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppLovinAdView f15245c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f15246d;

        public b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f15243a = aVar;
            this.f15244b = bVar;
            this.f15245c = appLovinAdView;
            this.f15246d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            com.applovin.impl.adview.b bVarF;
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f15232a.n0().pauseForClick();
                com.applovin.impl.adview.a aVar = this.f15243a;
                if (aVar != null) {
                    aVar.w();
                    q2.c(this.f15243a.e(), this.f15244b, this.f15245c);
                }
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str) && this.f15243a != null) {
                AppLovinAdServiceImpl.this.f15232a.n0().resumeForClick();
                q2.a(this.f15243a.e(), this.f15244b, this.f15245c);
            }
            com.applovin.impl.adview.a aVar2 = this.f15243a;
            if (aVar2 == null || (bVarF = aVar2.f()) == null) {
                return;
            }
            bVarF.a(AppLovinAdServiceImpl.this.f15232a.p().getJavaScript(str, bundle));
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            o unused = AppLovinAdServiceImpl.this.f15233b;
            if (o.a()) {
                AppLovinAdServiceImpl.this.f15233b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f15244b, this.f15245c, this.f15243a, this.f15246d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class c implements l2 {

        /* renamed from: a, reason: collision with root package name */
        private final d f15248a;

        public /* synthetic */ c(AppLovinAdServiceImpl appLovinAdServiceImpl, d dVar, a aVar) {
            this(dVar);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f15232a.i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f15232a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f15232a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f15248a.f15250a) {
                try {
                    if (!this.f15248a.f15252c) {
                        hashSet = new HashSet(this.f15248a.f15253d);
                        this.f15248a.f15253d.clear();
                    }
                    d dVar = this.f15248a;
                    dVar.f15251b = false;
                    dVar.f15252c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            failedToReceiveAdV2(new AppLovinError(i10, ""));
        }

        @Override // com.applovin.impl.l2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f15248a.f15250a) {
                try {
                    if (!this.f15248a.f15252c) {
                        hashSet = new HashSet(this.f15248a.f15253d);
                        this.f15248a.f15253d.clear();
                    }
                    d dVar = this.f15248a;
                    dVar.f15251b = false;
                    dVar.f15252c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private c(d dVar) {
            this.f15248a = dVar;
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.f15232a = kVar;
        this.f15233b = kVar.O();
        HashMap map = new HashMap(6);
        this.f15234c = map;
        a aVar = null;
        map.put(com.applovin.impl.u.c(), new d(aVar));
        map.put(com.applovin.impl.u.k(), new d(aVar));
        map.put(com.applovin.impl.u.j(), new d(aVar));
        map.put(com.applovin.impl.u.m(), new d(aVar));
        map.put(com.applovin.impl.u.b(), new d(aVar));
        map.put(com.applovin.impl.u.h(), new d(aVar));
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f15236e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f15232a.B().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.u uVar) {
        AppLovinAdImpl appLovinAdImplA = this.f15232a.i().a(uVar);
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + uVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f15237f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f15236e) {
            map = CollectionUtils.map(this.f15236e);
            this.f15236e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strG = this.f15232a.B().G();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strG) && o.a()) {
            this.f15233b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strG;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(strTrim, this.f15232a);
        if (kVar.c() == k.a.REGULAR) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new y5(kVar, appLovinAdLoadListener, this.f15232a));
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject jSONObjectA = kVar.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        r0.c(jSONObjectA, this.f15232a);
        r0.b(jSONObjectA, this.f15232a);
        r0.a(jSONObjectA, this.f15232a);
        this.f15232a.m().a();
        if (JsonUtils.getJSONArray(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() <= 0) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        com.applovin.impl.u uVarA = k7.a(jSONObjectA, this.f15232a);
        MaxAdFormat maxAdFormatD = uVarA.d();
        if (((Boolean) this.f15232a.a(v4.W0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f15232a.h().a(uVarA, new o9(this, appLovinAdLoadListener, jSONObjectA, uVarA));
        } else {
            a(new c6(jSONObjectA, uVarA, appLovinAdLoadListener, this.f15232a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l9;
        if (((Boolean) this.f15232a.a(v4.f16050v2)).booleanValue() && (l9 = (Long) this.f15232a.b(x4.M)) != null && System.currentTimeMillis() - l9.longValue() <= ((Long) this.f15232a.a(v4.f16082z2)).longValue()) {
            if (((Boolean) this.f15232a.a(v4.f16074y2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<com.applovin.impl.e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0038a
    public void onAdExpired(s1 s1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) s1Var;
        com.applovin.impl.u adZone = appLovinAdImpl.getAdZone();
        if (o.a()) {
            this.f15233b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f15232a.i().b(appLovinAdImpl);
        if (this.f15232a.H0() || !((Boolean) this.f15232a.a(v4.f15896c1)).booleanValue()) {
            return;
        }
        d dVarA = a(adZone);
        synchronized (dVarA.f15250a) {
            try {
                if (!dVarA.f15251b) {
                    this.f15232a.O();
                    if (o.a()) {
                        this.f15232a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    dVarA.f15251b = true;
                    dVarA.f15252c = true;
                    a(adZone, new c(this, dVarA, null));
                } else if (o.a()) {
                    this.f15233b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f15237f.set(jSONObject);
    }

    public String toString() {
        return o2.q(new StringBuilder("AppLovinAdService{adLoadStates="), this.f15234c, AbstractJsonLexerKt.END_OBJ);
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (bVar == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z10));
            if (this.f15232a.h0() != null) {
                this.f15232a.h0().b(bVar.d(motionEvent, false, z10), motionEvent);
            }
        } else if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (bVar.isDirectDownloadEnabled()) {
            this.f15232a.p().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
        } else {
            a(bVar, appLovinAdView, aVar, uri);
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, Bundle bundle, v1 v1Var, Context context) {
        if (bVar == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z10));
            if (this.f15232a.h0() != null) {
                this.f15232a.h0().b(bVar.d(motionEvent, true, z10), motionEvent);
            }
        } else if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f15232a.p().startDirectInstallOrDownloadProcess(bVar, bundle, new a(v1Var, bVar, uri, context));
        } else {
            a(bVar, uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.x());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.B());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.C());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j10, List<Long> list, long j11, boolean z10, int i10) {
        if (bVar == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (o.a()) {
                this.f15233b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : listE) {
            String strA = a(eVar.c(), j10, j11, list, bVar.F(), z10, i10);
            String strA2 = a(eVar.a(), j10, j11, list, bVar.F(), z10, i10);
            if (StringUtils.isValidString(strA)) {
                a(new com.applovin.impl.e(strA, strA2));
            } else if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.K());
            if (this.f15232a.h0() != null) {
                this.f15232a.h0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j10, int i10, boolean z10) {
        if (bVar == null) {
            if (o.a()) {
                this.f15233b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> listQ0 = bVar.q0();
        if (listQ0 == null || listQ0.isEmpty()) {
            if (o.a()) {
                this.f15233b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : listQ0) {
            if (StringUtils.isValidString(eVar.c())) {
                String strA = a(eVar.c(), j10, i10, string, z10);
                String strA2 = a(eVar.a(), j10, i10, string, z10);
                if (strA != null) {
                    a(new com.applovin.impl.e(strA, strA2));
                } else if (o.a()) {
                    this.f15233b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (o.a()) {
                this.f15233b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof l2) {
            ((l2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f15250a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15251b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15252c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f15253d;

        private d() {
            this.f15250a = new Object();
            this.f15253d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f15251b + ", isReloadingExpiredAd=" + this.f15252c + ", pendingAdListeners=" + this.f15253d + AbstractJsonLexerKt.END_OBJ;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new s(this, appLovinError, appLovinAdLoadListener));
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th2) {
            this.f15232a.O();
            if (o.a()) {
                this.f15232a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f15232a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th2);
            return null;
        }
    }

    private boolean b() {
        if (!o0.b()) {
            return true;
        }
        Context contextO = k.o();
        ApplicationExitInfo applicationExitInfoB = sn.t.b(((ActivityManager) contextO.getSystemService("activity")).getHistoricalProcessExitReasons(contextO.getPackageName(), 0, 1).get(0));
        return applicationExitInfoB.getReason() == 10 || applicationExitInfoB.getReason() == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new t(1, appLovinAdLoadListener, bVar));
        } else {
            a(new c6(jSONObject, uVar, appLovinAdLoadListener, this.f15232a));
        }
    }

    private void a(com.applovin.impl.u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f15232a.O();
            if (o.a()) {
                this.f15232a.O().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            d dVarA = a(uVar);
            synchronized (dVarA.f15250a) {
                try {
                    dVarA.f15253d.add(appLovinAdLoadListener);
                    if (!dVarA.f15251b) {
                        dVarA.f15251b = true;
                        a(uVar, new c(this, dVarA, null));
                    } else if (o.a()) {
                        this.f15233b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(g5 g5Var) {
        if (!this.f15232a.C0()) {
            o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f15232a.c();
        this.f15232a.r0().a(g5Var, b6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new s(this, 0, appLovinAdLoadListener, appLovinAd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th2) {
            o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th2);
            this.f15232a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th2) {
            o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th2);
            this.f15232a.E().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof l2 ? "V2" : ""), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, Context context) {
        if (h7.b(uri)) {
            a(uri, bVar, null, null, context, this.f15232a);
        } else {
            h7.b(uri, bVar, context, this.f15232a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f15232a.a(v4.f16063x)).booleanValue() || (context = b8.b(appLovinAdView, this.f15232a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (h7.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f15232a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j10, int i10, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i10 < 0 || i10 > 100) {
                i10 = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j10)).appendQueryParameter("pv", Integer.toString(i10)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th2) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th2);
            }
            this.f15232a.E().a("AppLovinAdService", "buildVideoEndUrl", th2);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (h7.b(uri, bVar, context, this.f15232a)) {
            q2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, PtLatqAYjEFT.zTrHCFjZkWvyKM);
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("AppLovinAdService", uQjDr.SVCmTudEhnIO);
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, kVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = h7.b(uri, bVar, context, kVar);
        if (zB) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                q2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            kVar.O();
            if (o.a()) {
                kVar.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th2) {
                this.f15232a.O();
                if (o.a()) {
                    this.f15232a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f15232a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th2);
            }
        }
        return arrayList;
    }

    private String a(String str, long j10, long j11, List list, String str2, boolean z10, int i10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j10)).appendQueryParameter("vs_ms", Long.toString(j11));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, str2);
        }
        if (i10 != i.f15436h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i10)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (o.a()) {
            this.f15233b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f15232a.b(x4.P);
        if (TextUtils.isEmpty(str)) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f15232a.E().d(c2.f13738t0, mapTryToStringMap);
        String str2 = (String) this.f15232a.b(x4.O);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l9 = (Long) this.f15232a.b(x4.N);
            if (l9 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l9));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l9));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (o.a()) {
            this.f15233b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.f15232a.f0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (o.a()) {
            this.f15233b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final com.applovin.impl.u uVar, final c cVar) {
        AppLovinAdImpl appLovinAdImplE = this.f15232a.i().e(uVar);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (o.a()) {
                this.f15233b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + uVar);
            }
            cVar.adReceived(appLovinAdImplE);
            return;
        }
        MaxAdFormat maxAdFormatD = uVar.d();
        if (((Boolean) this.f15232a.a(v4.W0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f15232a.h().a(uVar, new d.a() { // from class: com.applovin.impl.sdk.u
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f15694b.a(cVar, uVar, bVar);
                }
            });
        } else {
            a(new w5(uVar, cVar, this.f15232a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new t(0, cVar, bVar));
        } else {
            a(new w5(uVar, cVar, this.f15232a));
        }
    }

    private d a(com.applovin.impl.u uVar) {
        d dVar;
        synchronized (this.f15235d) {
            try {
                dVar = (d) this.f15234c.get(uVar);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f15234c.put(uVar, dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }
}
