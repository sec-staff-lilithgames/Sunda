package com.ironsource.adapters.ironsource.nativeAd;

import a.b;
import al.a;
import android.app.Activity;
import com.ironsource.C3191e4;
import com.ironsource.C3422r4;
import com.ironsource.E8;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IronSourceNativeAdAdapter extends AbstractNativeAdAdapter<IronSourceAdapter> {
    private E8 nativeAd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IronSourceNativeAdAdapter(IronSourceAdapter adapter) {
        super(adapter);
        e0.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdForBidding$lambda$0(IronSourceNativeAdAdapter this$0, JSONObject config, NativeAdSmashListener listener, String str) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(config, "$config");
        e0.checkNotNullParameter(listener, "$listener");
        try {
            E8 e8A = E8.f34259j.a();
            e8A.a(new IronSourceNativeAdListener(new IronSourceNativeAdViewBinder(e8A, this$0.getNativeAdProperties(config)), listener));
            Activity activity = ContextProvider.getInstance().getCurrentActiveActivity();
            JSONObject jSONObjectPrepareLoadParams = this$0.prepareLoadParams(config, str);
            e0.checkNotNullExpressionValue(activity, "activity");
            e8A.a(activity, jSONObjectPrepareLoadParams);
            this$0.nativeAd = e8A;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            listener.onNativeAdLoadFailed(new IronSourceError(510, b.k("IronSourceAdapter loadNativeAd exception ", e10.getMessage())));
        }
    }

    private final JSONObject prepareLoadParams(JSONObject jSONObject, String str) throws JSONException {
        JSONObject loadParams = new JSONObject().put("demandSourceName", getAdapter().getDemandSourceName(jSONObject)).put(C3191e4.f36356r, "2").put("inAppBidding", true).put(getAdapter().ADM_KEY, d.b().a(str));
        HashMap<String, String> extraParams = getAdapter().getInitParams();
        e0.checkNotNullExpressionValue(extraParams, "extraParams");
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            loadParams.put(entry.getKey(), entry.getValue());
        }
        e0.checkNotNullExpressionValue(loadParams, "loadParams");
        return loadParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void destroyNativeAd(JSONObject config) {
        e0.checkNotNullParameter(config, "config");
        E8 e82 = this.nativeAd;
        if (e82 != null) {
            e82.a();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public Map<String, Object> getNativeAdBiddingData(JSONObject config, JSONObject jSONObject) {
        e0.checkNotNullParameter(config, "config");
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void initNativeAdForBidding(String str, String str2, JSONObject config, NativeAdSmashListener listener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(listener, "listener");
        getAdapter().initSDK(str, config);
        listener.onNativeAdInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractNativeAdAdapter, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void loadNativeAdForBidding(JSONObject config, JSONObject jSONObject, String str, NativeAdSmashListener listener) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(listener, "listener");
        postOnUIThread(new a(this, config, listener, str));
    }
}
