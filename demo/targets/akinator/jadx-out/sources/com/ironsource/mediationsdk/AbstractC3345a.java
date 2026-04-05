package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.B3;
import com.ironsource.C3286ja;
import com.ironsource.C3518wf;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.lang.ref.WeakReference;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.mediationsdk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3345a<Listener extends AdapterAdListener> extends BaseAdAdapter<w, Listener> implements AdapterAdFullScreenInterface<Listener>, AdapterBannerInterface<Listener>, AdapterNativeAdInterface<Listener>, AdapterBindAdViewInterface, B3 {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f37258a;

    /* renamed from: b, reason: collision with root package name */
    protected WeakReference<Listener> f37259b;

    public AbstractC3345a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        super(C3518wf.a(aVar), networkSettings, uuid);
        this.f37259b = new WeakReference<>(null);
        this.f37258a = abstractAdapter;
    }

    public static AbstractC3345a<?> a(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return new B(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.f37252c) {
            return new p(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.BANNER) {
            return new j(abstractAdapter, networkSettings, uuid);
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return new v(abstractAdapter, networkSettings, uuid);
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
        return null;
    }

    public abstract void a(JSONObject jSONObject, JSONObject jSONObject2, AdData adData);

    public abstract IronSource.a b();

    public boolean b(JSONObject jSONObject) {
        b("isAdAvailable");
        return false;
    }

    public void c(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.B3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        a(C3286ja.a(adData.getConfiguration()), C3286ja.a(adData.getAdUnitData()), biddingDataCallback);
    }

    public void d(JSONObject jSONObject) {
        b("onAdViewWillBind");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void destroyAd(AdData adData) {
        a(C3286ja.a(adData.getConfiguration()));
    }

    public void e(JSONObject jSONObject) {
        b("showAd");
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public boolean isAdAvailable(AdData adData) {
        return b(C3286ja.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface
    public void loadAd(AdData adData, Context context, Listener listener) {
        a(adData, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewBound(AdData adData) {
        c(C3286ja.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface
    public void onAdViewWillBind(AdData adData) {
        d(C3286ja.a(adData.getConfiguration()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface
    public void showAd(AdData adData, Activity activity, Listener listener) {
        this.f37259b = new WeakReference<>(listener);
        e(C3286ja.a(adData.getConfiguration()));
    }

    private void b(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbO = e3.g.o("Method '", str, "' is not supported for ");
        sbO.append(getClass().getName());
        ironLog.error(a(sbO.toString()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface
    public void loadAd(AdData adData, Activity activity, ISBannerSize iSBannerSize, Listener listener) {
        a(adData, listener);
    }

    public void a(JSONObject jSONObject) {
        b("destroyAd");
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        b("collectBiddingData");
    }

    public String a(String str) {
        String string = b().toString();
        return TextUtils.isEmpty(str) ? string : w0.i.d(string, " - ", str);
    }

    public String a() {
        return a((String) null);
    }

    private void a(AdData adData, Listener listener) {
        this.f37259b = new WeakReference<>(listener);
        a(C3286ja.a(adData.getConfiguration()), C3286ja.a(adData.getAdUnitData()), adData);
    }
}
