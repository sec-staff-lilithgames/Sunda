package com.vungle.ads.internal.load;

import android.content.Context;
import com.ironsource.environment.thread.a;
import com.ironsource.lh;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DefaultAdLoader extends BaseAdLoader {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Callback<AdPayload> {
        final /* synthetic */ Placement $placement;

        public AnonymousClass1(Placement placement) {
            this.$placement = placement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m3616onFailure$lambda1(DefaultAdLoader this$0, Throwable th2) {
            e0.checkNotNullParameter(this$0, "this$0");
            this$0.onAdLoadFailed(this$0.retrofitToVungleError(th2).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m3617onResponse$lambda0(DefaultAdLoader this$0, Placement placement, Response response) {
            e0.checkNotNullParameter(this$0, "this$0");
            e0.checkNotNullParameter(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            if (response != null && !response.isSuccessful()) {
                this$0.onAdLoadFailed(new APIFailedStatusCodeError("ads API: " + response.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            } else {
                AdPayload adPayload = response != null ? (AdPayload) response.body() : null;
                if ((adPayload != null ? adPayload.adUnit() : null) == null) {
                    this$0.onAdLoadFailed(new AdResponseEmptyError("Ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                } else {
                    this$0.handleAdMetaData$vungle_ads_release(adPayload, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
                }
            }
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onFailure(Call<AdPayload> call, Throwable th2) {
            DefaultAdLoader.this.getSdkExecutors().getBackgroundExecutor().execute(new a(12, DefaultAdLoader.this, th2));
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onResponse(Call<AdPayload> call, Response<AdPayload> response) {
            DefaultAdLoader.this.getSdkExecutors().getBackgroundExecutor().execute(new lh(DefaultAdLoader.this, 18, this.$placement, response));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        e0.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        e0.checkNotNullParameter(omInjector, "omInjector");
        e0.checkNotNullParameter(downloader, "downloader");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        e0.checkNotNullParameter(adRequest, "adRequest");
    }

    private final void fetchAdMetadata(VungleAdSize vungleAdSize, Placement placement) throws IllegalStateException {
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        Call<AdPayload> callRequestAd = getVungleApiClient().requestAd(placement.getReferenceId(), vungleAdSize);
        if (callRequestAd == null) {
            onAdLoadFailed(new NetworkUnreachable("adsCall is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            callRequestAd.enqueue(new AnonymousClass1(placement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb2 = new StringBuilder("ads request fail: ");
        sb2.append(th2 != null ? th2.getMessage() : null);
        return new NetworkUnreachable(sb2.toString());
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() throws IllegalStateException {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }
}
