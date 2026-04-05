package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Utils;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VungleInternal {
    /* renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final BidTokenEncoder m3599getAvailableBidTokensAsync$lambda0(o oVar) {
        return (BidTokenEncoder) oVar.getValue();
    }

    /* renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final SDKExecutors m3600getAvailableBidTokensAsync$lambda1(o oVar) {
        return (SDKExecutors) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m3601getAvailableBidTokensAsync$lambda2(BidTokenCallback callback, o bidTokenEncoder$delegate) throws Throwable {
        e0.checkNotNullParameter(callback, "$callback");
        e0.checkNotNullParameter(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        timeIntervalMetric.markStart();
        BidTokenEncoder.BiddingTokenInfo biddingTokenInfoEncode = m3599getAvailableBidTokensAsync$lambda0(bidTokenEncoder$delegate).encode();
        timeIntervalMetric.markEnd();
        if (biddingTokenInfoEncode.getBidToken().length() > 0) {
            callback.onBidTokenCollected(biddingTokenInfoEncode.getBidToken());
        } else {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            timeIntervalMetric.setMeta(biddingTokenInfoEncode.getErrorMessage());
            callback.onBidTokenError(biddingTokenInfoEncode.getErrorMessage());
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
    }

    public final void getAvailableBidTokensAsync(Context context, BidTokenCallback callback) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(callback, "callback");
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.Companion.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            privacyManager.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        s sVar = s.f87403b;
        m3600getAvailableBidTokensAsync$lambda1(q.lazy(sVar, (kv.a) new VungleInternal$getAvailableBidTokensAsync$$inlined$inject$2(context))).getApiExecutor().execute(new com.ironsource.environment.thread.a(10, callback, q.lazy(sVar, (kv.a) new VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1(context))));
    }

    public final String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }
}
