package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import com.explorestack.protobuf.Struct;
import em.f;
import em.k0;
import em.m;
import em.p;
import em.r;
import em.v;
import hr.d;
import hr.e;
import hr.h;
import io.bidmachine.ContextProvider;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    /* renamed from: a, reason: collision with root package name */
    public p f59841a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends k0 {
        public a(String str, String str2) {
            super(str, str2);
        }

        @Override // em.k0, em.j0
        public Struct getExt(Context context) {
            return ExtraParamsManager.get().getPrivateStruct(context);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        p pVar = this.f59841a;
        if (pVar != null) {
            pVar.unReserveAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        p pVar = this.f59841a;
        if (pVar != null) {
            return new f(pVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        p pVar = this.f59841a;
        if (pVar != null) {
            return new m(pVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        p pVar = this.f59841a;
        if (pVar != null) {
            return new r(pVar);
        }
        throw new IllegalArgumentException("GAMNetwork is null");
    }

    public String getNetworkName() {
        return "GAMDynamic";
    }

    @Override // io.bidmachine.NetworkAdapter
    public String getNetworkSdkVersion() throws Throwable {
        p pVar = this.f59841a;
        if (pVar != null) {
            return pVar.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    public final boolean isNetworkInitialized(ContextProvider contextProvider) {
        p pVar = this.f59841a;
        return pVar != null && pVar.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    public final void onCollectHeaderBiddingParams(ContextProvider contextProvider, d dVar, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
        p pVar = this.f59841a;
        if (pVar == null) {
            headerBiddingCollectParamsCallback.onCollectFail(pr.a.adapter("GAM network is null"));
            return;
        }
        v vVarReserveMostExpensiveAd = pVar.reserveMostExpensiveAd(networkAdUnit, networkAdUnit.getAdsFormat());
        if (vVarReserveMostExpensiveAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(pr.a.adapter("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", vVarReserveMostExpensiveAd.getAdUnitId());
        map.put("price", String.valueOf(vVarReserveMostExpensiveAd.getPrice()));
        for (Map.Entry<String, Object> entry : vVarReserveMostExpensiveAd.getCustomParamsMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                map.put(key, String.valueOf(value));
            }
        }
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(NetworkAdUnit networkAdUnit) throws Throwable {
        p pVar = this.f59841a;
        if (pVar != null) {
            pVar.unReserveAd(networkAdUnit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // io.bidmachine.NetworkAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNetworkInitialize(io.bidmachine.ContextProvider r12, io.bidmachine.InitializationParams r13, io.bidmachine.NetworkConfigParams r14, io.bidmachine.NetworkInitializationCallback r15) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.gam_dynamic.GAMAdapter.onNetworkInitialize(io.bidmachine.ContextProvider, io.bidmachine.InitializationParams, io.bidmachine.NetworkConfigParams, io.bidmachine.NetworkInitializationCallback):void");
    }
}
