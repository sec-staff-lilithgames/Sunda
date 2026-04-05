package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.model.ApsAdNetwork;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f16128a;

    /* renamed from: b, reason: collision with root package name */
    private final a f16129b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f16130c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public w(x xVar, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(xVar.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f16130c;
        if (dTBAdRequest == null) {
            this.f16129b.onAdLoadFailed(null, this.f16128a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onFailure(AdError adError) {
        this.f16129b.onAdLoadFailed(adError, this.f16128a);
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f16129b.onAdResponseLoaded(dTBAdResponse, this.f16128a);
    }

    public w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f16128a = maxAdFormat;
        this.f16129b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            if (k7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                ApsAdNetwork apsAdNetwork = ApsAdNetwork.GOOGLE_AD_MANAGER;
                this.f16130c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, DTBAdNetworkInfo.class).newInstance(context.getApplicationContext(), DTBAdNetworkInfo.class.getConstructor(ApsAdNetwork.class).newInstance(ApsAdNetwork.class.getField("MAX").get(null)));
            } else {
                this.f16130c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f16130c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
