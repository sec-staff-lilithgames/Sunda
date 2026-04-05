package io.bidmachine.ads.networks.gam;

import android.content.Context;
import android.text.TextUtils;
import com.sfbx.appconsent.core.BuildConfig;
import hr.d;
import hr.e;
import hr.h;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import nm.j;
import org.json.JSONArray;
import org.json.JSONObject;
import pr.a;
import zl.b;
import zl.f;
import zl.f0;
import zl.l;
import zl.m;
import zl.p;
import zl.q;
import zl.r;
import zl.s;
import zl.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    /* renamed from: a, reason: collision with root package name */
    public m f59840a;

    public GAMAdapter() {
        super("gam", AbstractJsonLexerKt.NULL, "3.4.0.3", 16, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        m mVar = this.f59840a;
        if (mVar != null) {
            mVar.f98261d.e(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        m mVar = this.f59840a;
        if (mVar != null) {
            return new b(mVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        m mVar = this.f59840a;
        if (mVar != null) {
            return new f(mVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        m mVar = this.f59840a;
        if (mVar != null) {
            return new p(mVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    public String getNetworkName() {
        return "GAM";
    }

    @Override // io.bidmachine.NetworkAdapter
    public String getNetworkSdkVersion() throws Throwable {
        m mVar = this.f59840a;
        if (mVar != null) {
            return mVar.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        m mVar = this.f59840a;
        return mVar != null && mVar.f98259b.get();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        s gamUnitData;
        AdsFormat parent;
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(a.adapterGetsParameter("ad_unit_id"));
            return;
        }
        m mVar = this.f59840a;
        if (mVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(a.adapter("GAM network is null"));
            return;
        }
        l lVar = mVar.f98261d;
        synchronized (lVar.f98256k) {
            t tVarA = lVar.a(mediationParameter);
            if (tVarA != null) {
                synchronized (lVar.f98257l) {
                    nm.a.d(lVar.f98246a, new zd.t(5, networkAdUnit, tVarA));
                    lVar.f98255j.put(networkAdUnit, tVarA);
                }
                gamUnitData = tVarA.getGamUnitData();
            } else {
                gamUnitData = null;
            }
        }
        m mVar2 = this.f59840a;
        AdsFormat adsFormat = dVar.getAdRequestParameters().getAdsFormat();
        l lVar2 = mVar2.f98261d;
        if (!lVar2.c(adsFormat) && (parent = adsFormat.getParent()) != null) {
            lVar2.c(parent);
        }
        if (gamUnitData == null) {
            headerBiddingCollectParamsCallback.onCollectFail(a.adapter("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", gamUnitData.getAdUnitId());
        map.put("score", String.valueOf(gamUnitData.getScore()));
        map.put("price", String.valueOf(gamUnitData.getPrice()));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        m mVar = this.f59840a;
        if (mVar != null) {
            mVar.f98261d.e(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public final void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) {
        q qVarCreate;
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        am.b bVarFindVersionWrapper = f0.findVersionWrapper(strRemoveFromNetworkParams);
        if (bVarFindVersionWrapper == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!bVarFindVersionWrapper.isGAMPresent(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("waterfall_configurations");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(strRemoveFromNetworkParams2);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (qVarCreate = r.create(jSONObjectOptJSONObject)) != null) {
                    map.put(qVarCreate.getAdsFormat(), qVarCreate);
                }
            }
        } catch (Throwable unused) {
            map = null;
        }
        HashMap map2 = map;
        if (map2 == null || map2.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        m mVar = new m(applicationContext, bVarFindVersionWrapper, getNetworkName(), map2, networkConfigParams.removeFromNetworkParams("request_agent"), TimeUnit.SECONDS.toMillis(j.parseIntOrDefault(networkConfigParams.removeFromNetworkParams("expiration_time"), BuildConfig.VERSION_CODE)), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams("override_callbacks")));
        this.f59840a = mVar;
        if (!mVar.f98259b.getAndSet(true)) {
            try {
                mVar.f98260c.initialize(applicationContext);
            } catch (Throwable unused2) {
            }
        }
        l lVar = this.f59840a.f98261d;
        lVar.getClass();
        for (AdsFormat adsFormat : AdsFormat.values()) {
            lVar.c(adsFormat);
        }
        networkInitializationCallback.onSuccess();
    }
}
