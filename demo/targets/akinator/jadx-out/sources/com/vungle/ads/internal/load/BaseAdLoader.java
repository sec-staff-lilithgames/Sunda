package com.vungle.ads.internal.load;

import a.b;
import android.content.Context;
import b0.e2;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetRequestError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.a;
import p0.o2;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class BaseAdLoader {
    public static final Companion Companion = new Companion(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<AdAsset> adAssets;
    private AdLoaderCallback adLoaderCallback;
    private TimeIntervalMetric adOptionalDownloadDurationMetric;
    private TimeIntervalMetric adPreloadToReadyDurationMetric;
    private final AdRequest adRequest;
    private TimeIntervalMetric adRequiredDownloadDurationMetric;
    private AdPayload advertisement;
    private TimeIntervalMetric assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final Set<String> downloadRequiredAssets;
    private final Downloader downloader;
    private AtomicBoolean fullyDownloaded;
    private long loadStart;
    private LogEntry logEntry;
    private SingleValueMetric mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final OMInjector omInjector;
    private final PathProvider pathProvider;
    private AtomicBoolean requiredAssetDownloaded;
    private final Executors sdkExecutors;
    private SingleValueMetric templateHtmlSizeMetric;
    private final VungleApiClient vungleApiClient;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public BaseAdLoader(Context context, VungleApiClient vungleApiClient, Executors sdkExecutors, OMInjector omInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        e0.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        e0.checkNotNullParameter(omInjector, "omInjector");
        e0.checkNotNullParameter(downloader, "downloader");
        e0.checkNotNullParameter(pathProvider, "pathProvider");
        e0.checkNotNullParameter(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.isRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        return adAsset.isRequired() ? DownloadRequest.Priority.CRITICAL : DownloadRequest.Priority.HIGHEST;
    }

    private final File getDestinationDir(AdPayload adPayload) {
        return this.pathProvider.getDownloadsDirForAd(adPayload.eventId());
    }

    private final VungleError getErrorInfo(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        Integer errorCode = adUnit != null ? adUnit.getErrorCode() : null;
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (adUnit3 != null ? adUnit3.getInfo() : null);
        if ((errorCode == null || errorCode.intValue() != 10001) && ((errorCode == null || errorCode.intValue() != 10002) && ((errorCode == null || errorCode.intValue() != 20001) && ((errorCode == null || errorCode.intValue() != 30001) && (errorCode == null || errorCode.intValue() != 30002))))) {
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        Sdk.SDKError.Reason reasonForNumber = Sdk.SDKError.Reason.forNumber(errorCode.intValue());
        e0.checkNotNullExpressionValue(reasonForNumber, "forNumber(errorCode)");
        return new AdPayloadError(reasonForNumber, str);
    }

    private final VungleError getTemplateError(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        AdPayload.TemplateSettings templateSettings = adUnit != null ? adUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AssetRequestError("Missing template settings");
        }
        Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!adPayload.isNativeTemplateType()) {
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            String vmURL = adUnit2 != null ? adUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!Utils.INSTANCE.isUrlValid(vmURL)) {
                return new AssetRequestError(b.k("Failed to load vm url: ", vmURL));
            }
        } else if (cacheableReplacements != null) {
            AdPayload.CacheableReplacement cacheableReplacement = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE);
            if ((cacheableReplacement != null ? cacheableReplacement.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null main image.");
            }
            AdPayload.CacheableReplacement cacheableReplacement2 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement2 != null ? cacheableReplacement2.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, AdPayload.CacheableReplacement>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError(b.k("Invalid asset URL ", url));
                }
                if (!Utils.INSTANCE.isUrlValid(url)) {
                    return new AssetRequestError(b.k("Invalid asset URL ", url));
                }
            }
        }
        return null;
    }

    /* renamed from: handleAdMetaData$lambda-4, reason: not valid java name */
    private static final TpatSender m3610handleAdMetaData$lambda4(o oVar) {
        return (TpatSender) oVar.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(BaseAdLoader baseAdLoader, AdPayload adPayload, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i10 & 2) != 0) {
            singleValueMetric = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(adPayload, singleValueMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m3611loadAd$lambda0(BaseAdLoader this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.requestAd();
    }

    private final void onAdReady() {
        final AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (adPayload.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(adPayload.getIndexFilePath());
            Logger.Companion.w(TAG, "start preloading");
            WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, adPayload, this.adRequest.getPlacement(), strValueOf, adPayload.getWebViewSettings(), new PreloadDelegate() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$1$1
                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdFailedToPlay() throws Throwable {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    Logger.Companion.e("BaseAdLoader", "fail to load ad");
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }

                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdReadyToPlay() throws Throwable {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }
            }, Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onSuccess(adPayload);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m3612onAdReady$lambda2$lambda1(q.lazy(s.f87403b, (a) new BaseAdLoader$onAdReady$lambda2$$inlined$inject$1(this.context))).execute(ResendTpatJob.Companion.makeJobInfo());
    }

    /* renamed from: onAdReady$lambda-2$lambda-1, reason: not valid java name */
    private static final JobRunner m3612onAdReady$lambda2$lambda1(o oVar) {
        return (JobRunner) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDownloadCompleted(AdRequest adRequest) throws Throwable {
        Logger.Companion.d(TAG, "All download completed " + adRequest);
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() throws Throwable {
        this.adRequiredDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(AdAsset adAsset, AdPayload adPayload) {
        if (adPayload == null || adAsset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS || adAsset.getLocalPath().length() == 0 || !fileIsValid(new File(adAsset.getLocalPath()), adAsset)) {
            return false;
        }
        File destinationDir = getDestinationDir(adPayload);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            Logger.Companion.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        if (adPayload.omEnabled()) {
            try {
                this.omInjector.init();
                this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Failed to inject OMSDK: " + e10.getMessage());
                new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, e2.l(e10, new StringBuilder("Failed to inject OMSDK: "))).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        }
        FileUtility.printDirectoryTree(destinationDir);
        return true;
    }

    private final VungleError validateAdMetadata(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null && adUnit.getSleep() != null) {
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        AdPayload adPayload2 = this.advertisement;
        if (!e0.areEqual(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            StringBuilder sb2 = new StringBuilder("Waterfall request and responses placement don't match ");
            AdPayload adPayload3 = this.advertisement;
            return new PlacementMismatchError(o2.q(sb2, adPayload3 != null ? adPayload3.placementId() : null, '.'));
        }
        VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (adPayload.hasExpired()) {
            return new AdExpiredError("The ad markup has expired for playback.");
        }
        String strEventId = adPayload.eventId();
        if (strEventId == null || strEventId.length() == 0) {
            return new InvalidEventIdError("Event id is invalid.");
        }
        return null;
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    public final AdPayload getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final long getLoadStart$vungle_ads_release() {
        return this.loadStart;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(AdPayload advertisement, SingleValueMetric singleValueMetric) {
        List<String> loadAdUrls;
        e0.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setEventId$vungle_ads_release(advertisement.eventId());
        }
        LogEntry logEntry2 = this.logEntry;
        if (logEntry2 != null) {
            logEntry2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        LogEntry logEntry3 = this.logEntry;
        if (logEntry3 != null) {
            logEntry3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        LogEntry logEntry4 = this.logEntry;
        if (logEntry4 != null) {
            logEntry4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        LogEntry logEntry5 = this.logEntry;
        if (logEntry5 != null) {
            logEntry5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        LogEntry logEntry6 = this.logEntry;
        if (logEntry6 != null) {
            logEntry6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        LogEntry logEntry7 = this.logEntry;
        if (logEntry7 != null) {
            logEntry7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        ConfigPayload configPayloadConfig = advertisement.config();
        if (configPayloadConfig != null) {
            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, configPayloadConfig, false, singleValueMetric);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError(j1.o2.h(destinationDir, "Invalid directory. ")).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (a) new BaseAdLoader$handleAdMetaData$$inlined$inject$1(this.context));
        AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m3610handleAdMetaData$lambda4(oVarLazy), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(AdLoaderCallback adLoaderCallback) {
        e0.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBackgroundExecutor().execute(new com.unity3d.services.banners.view.a(this, 2));
    }

    public final void onAdLoadFailed(VungleError error) {
        AdLoaderCallback adLoaderCallback;
        e0.checkNotNullParameter(error, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (adLoaderCallback = this.adLoaderCallback) == null) {
            return;
        }
        adLoaderCallback.onFailure(error);
    }

    public abstract void onAdLoadReady();

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setLoadStart$vungle_ads_release(long j10) {
        this.loadStart = j10;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }
}
