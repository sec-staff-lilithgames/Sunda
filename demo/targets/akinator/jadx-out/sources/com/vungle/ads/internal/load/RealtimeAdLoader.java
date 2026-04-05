package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.a;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RealtimeAdLoader extends BaseAdLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        e0.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        e0.checkNotNullParameter(omInjector, "omInjector");
        e0.checkNotNullParameter(downloader, "downloader");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        e0.checkNotNullParameter(adRequest, "adRequest");
    }

    /* renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final VungleApiClient m3618requestAd$lambda0(o oVar) {
        return (VungleApiClient) oVar.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        if (list == null || !list.isEmpty()) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVarLazy = q.lazy(s.f87403b, (a) new RealtimeAdLoader$sendWinNotification$$inlined$inject$1(getContext()));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(m3619sendWinNotification$lambda2(oVarLazy), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.WIN_NOTIFICATION).withLogEntry(getLogEntry$vungle_ads_release()).build(), false, 2, null);
                }
            }
        }
    }

    /* renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final TpatSender m3619sendWinNotification$lambda2(o oVar) {
        return (TpatSender) oVar.getValue();
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        AdPayload advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (ConfigManager.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                Logger.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                o oVarLazy = q.lazy(s.f87403b, (a) new RealtimeAdLoader$requestAd$$inlined$inject$1(getContext()));
                if (decodedAdsResponse != null) {
                    new RTADebugger(m3618requestAd$lambda0(oVarLazy)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        AdPayload adPayload = adMarkup.getAdPayload();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || adPayload == null) {
            onAdLoadFailed(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(adPayload, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
