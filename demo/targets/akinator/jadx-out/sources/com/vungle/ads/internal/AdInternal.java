package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.AdMarkupJsonError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.EmptyBidPayloadError;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.InvalidBannerSizeError;
import com.vungle.ads.PlacementAdTypeMismatchError;
import com.vungle.ads.PlacementNotFoundError;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import tu.o;
import tu.q;
import tu.s;
import tu.t;
import tv.Mu.QpyI;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AdInternal implements AdLoaderCallback {
    private static final String TAG = "AdInternal";
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private AdState adState;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private TimeIntervalMetric loadMetric;
    private LogEntry logEntry;
    private Placement placement;
    private WeakReference<Context> playContext;
    private TimeIntervalMetric requestMetric;
    private final TimeIntervalMetric showToValidationMetric;
    private final TimeIntervalMetric validationToPresentMetric;
    private final o vungleApiClient$delegate;
    public static final Companion Companion = new Companion(null);
    private static final Json json = JsonKt.Json$default(null, AdInternal$Companion$json$1.INSTANCE, 1, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdState {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING(QpyI.pZfc, 3);
        public static final AdState FINISHED = new FINISHED("FINISHED", 4);
        public static final AdState ERROR = new ERROR("ERROR", 5);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ERROR extends AdState {
            public ERROR(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class FINISHED extends AdState {
            public FINISHED(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return false;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class LOADING extends AdState {
            public LOADING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class NEW extends AdState {
            public NEW(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return adState == AdState.LOADING || adState == AdState.READY || adState == AdState.ERROR;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PLAYING extends AdState {
            public PLAYING(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class READY extends AdState {
            public READY(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                e0.checkNotNullParameter(adState, "adState");
                return adState == AdState.PLAYING || adState == AdState.FINISHED || adState == AdState.ERROR;
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(String str, int i10, u uVar) {
            this(str, i10);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        public final boolean isTerminalState() {
            return p0.listOf((Object[]) new AdState[]{FINISHED, ERROR}).contains(this);
        }

        public final AdState transitionTo(AdState adState) {
            e0.checkNotNullParameter(adState, "adState");
            if (this == adState || canTransitionTo(adState)) {
                return adState;
            }
            String str = "Cannot transition from " + name() + " to " + adState.name();
            if (AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                throw new IllegalStateException(str);
            }
            Logger.Companion.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
            return adState;
        }

        private AdState(String str, int i10) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }

        private static /* synthetic */ void getJson$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.FINISHED.ordinal()] = 5;
            iArr[AdState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdInternal(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = AdState.NEW;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = q.lazy(s.f87403b, (kv.a) new AdInternal$special$$inlined$inject$1(context));
        this.showToValidationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS);
        this.validationToPresentMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS);
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0, reason: not valid java name */
    private static final JobRunner m3571_set_adState_$lambda1$lambda0(o oVar) {
        return (JobRunner) oVar.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return adInternal.canPlayAd(z10);
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2, reason: not valid java name */
    private static final OMInjector m3572loadAd$lambda2(o oVar) {
        return (OMInjector) oVar.getValue();
    }

    /* renamed from: loadAd$lambda-3, reason: not valid java name */
    private static final SDKExecutors m3573loadAd$lambda3(o oVar) {
        return (SDKExecutors) oVar.getValue();
    }

    /* renamed from: loadAd$lambda-4, reason: not valid java name */
    private static final PathProvider m3574loadAd$lambda4(o oVar) {
        return (PathProvider) oVar.getValue();
    }

    /* renamed from: loadAd$lambda-5, reason: not valid java name */
    private static final Downloader m3575loadAd$lambda5(o oVar) {
        return (Downloader) oVar.getValue();
    }

    /* renamed from: onSuccess$lambda-11$lambda-9, reason: not valid java name */
    private static final TpatSender m3576onSuccess$lambda11$lambda9(o oVar) {
        return (TpatSender) oVar.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        e0.checkNotNullParameter(advertisement, "advertisement");
    }

    public final VungleError canPlayAd(boolean z10) {
        VungleError adExpiredOnPlayError;
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            adExpiredOnPlayError = new AdNotLoadedCantPlay(o2.n("adv is null on onPlay=", z10));
        } else {
            AdState adState = this.adState;
            if (adState == AdState.PLAYING) {
                adExpiredOnPlayError = new InvalidAdStateError(Sdk.SDKError.Reason.AD_IS_PLAYING, "Current ad is playing");
            } else if (adState != AdState.READY) {
                adExpiredOnPlayError = new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.adState + " is not READY");
            } else {
                if (adPayload == null || !adPayload.hasExpired()) {
                    return null;
                }
                adExpiredOnPlayError = z10 ? new AdExpiredOnPlayError() : new AdExpiredError("adv has expired on canPlayAd()");
            }
        }
        if (z10) {
            adExpiredOnPlayError.setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
        }
        return adExpiredOnPlayError;
    }

    public final void cancelDownload$vungle_ads_release() {
        AdPayload adPayload = this.advertisement;
        if (adPayload != null && adPayload.isPartialDownloadEnabled()) {
            Logger.Companion.d(TAG, "Skip cancelling download for ads with partial download enabled.");
            return;
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public abstract VungleAdSize getAdSizeForAdRequest();

    public final AdState getAdState() {
        return this.adState;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final TimeIntervalMetric getShowToValidationMetric$vungle_ads_release() {
        return this.showToValidationMetric;
    }

    public final TimeIntervalMetric getValidationToPresentMetric$vungle_ads_release() {
        return this.validationToPresentMetric;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i10) {
        return this.adState == AdState.READY && i10 == 304;
    }

    public abstract boolean isValidAdSize(VungleAdSize vungleAdSize);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadAd(String placementId, String str, AdLoaderCallback adLoaderCallback) throws Throwable {
        Sdk.SDKError.Reason reason;
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.LOAD_AD_API, 0L, this.logEntry, null, 10, null);
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_ADO_DURATION_MS);
        this.loadMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
        this.adLoaderCallback = adLoaderCallback;
        if (!VungleAds.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new SdkNotInitialized("SDK not initialized").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(placementId);
        if (placement != null) {
            this.placement = placement;
            if (!isValidAdTypeForPlacement(placement)) {
                adLoaderCallback.onFailure(new PlacementAdTypeMismatchError(placement.getReferenceId()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } else if (placement.getHeaderBidding() && (str == null || str.length() == 0)) {
                adLoaderCallback.onFailure(new EmptyBidPayloadError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        } else if (configManager.configLastValidatedTimestamp() != -1) {
            adLoaderCallback.onFailure(new PlacementNotFoundError(placementId).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        } else {
            Placement placement2 = new Placement(placementId, false, (String) null, 6, (u) null);
            this.placement = placement2;
            placement = placement2;
        }
        VungleAdSize adSizeForAdRequest = getAdSizeForAdRequest();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InvalidBannerSizeError(adSizeForAdRequest != null ? adSizeForAdRequest.toString() : null).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        AdState adState = this.adState;
        if (adState != AdState.NEW) {
            switch (WhenMappings.$EnumSwitchMapping$0[adState.ordinal()]) {
                case 1:
                    throw new tu.u(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0);
                case 2:
                    reason = Sdk.SDKError.Reason.AD_IS_LOADING;
                    break;
                case 3:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_LOADED;
                    break;
                case 4:
                    reason = Sdk.SDKError.Reason.AD_IS_PLAYING;
                    break;
                case 5:
                    reason = Sdk.SDKError.Reason.AD_CONSUMED;
                    break;
                case 6:
                    reason = Sdk.SDKError.Reason.AD_ALREADY_FAILED;
                    break;
                default:
                    throw new t();
            }
            adLoaderCallback.onFailure(new InvalidAdStateError(reason, this.adState + " state is incorrect for load").setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        TimeIntervalMetric timeIntervalMetric2 = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS);
        this.requestMetric = timeIntervalMetric2;
        timeIntervalMetric2.markStart();
        if (str != null && str.length() != 0) {
            try {
                Json json2 = json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json2.getSerializersModule(), c1.typeOf(BidPayload.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                this.bidPayload = (BidPayload) json2.decodeFromString(kSerializerSerializer, str);
            } catch (IllegalArgumentException e10) {
                adLoaderCallback.onFailure(new AdMarkupInvalidError("Unable to decode payload into BidPayload object. Error: " + e10.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            } catch (Throwable th2) {
                adLoaderCallback.onFailure(new AdMarkupJsonError(th2.getLocalizedMessage()).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        s sVar = s.f87403b;
        o oVarLazy = q.lazy(sVar, (kv.a) new AdInternal$loadAd$$inlined$inject$1(context));
        o oVarLazy2 = q.lazy(sVar, (kv.a) new AdInternal$loadAd$$inlined$inject$2(this.context));
        o oVarLazy3 = q.lazy(sVar, (kv.a) new AdInternal$loadAd$$inlined$inject$3(this.context));
        o oVarLazy4 = q.lazy(sVar, (kv.a) new AdInternal$loadAd$$inlined$inject$4(this.context));
        if (str == null || str.length() == 0) {
            this.baseAdLoader = new DefaultAdLoader(this.context, getVungleApiClient(), m3573loadAd$lambda3(oVarLazy2), m3572loadAd$lambda2(oVarLazy), m3575loadAd$lambda5(oVarLazy4), m3574loadAd$lambda4(oVarLazy3), new AdRequest(placement, null, adSizeForAdRequest));
        } else {
            this.baseAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m3573loadAd$lambda3(oVarLazy2), m3572loadAd$lambda2(oVarLazy), m3575loadAd$lambda5(oVarLazy4), m3574loadAd$lambda4(oVarLazy3), new AdRequest(placement, this.bidPayload, adSizeForAdRequest));
        }
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.setLogEntry$vungle_ads_release(this.logEntry);
        }
        BaseAdLoader baseAdLoader2 = this.baseAdLoader;
        if (baseAdLoader2 != null) {
            baseAdLoader2.loadAd(this);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError error) throws Throwable {
        e0.checkNotNullParameter(error, "error");
        setAdState(AdState.ERROR);
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS);
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, error.getCode() + '-' + error.getErrorMessage());
        }
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(error);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload advertisement) throws Throwable {
        e0.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(advertisement);
        }
        TimeIntervalMetric timeIntervalMetric = this.loadMetric;
        if (timeIntervalMetric != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_LOAD_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        if (timeIntervalMetric2 != null) {
            if (!advertisement.adLoadOptimizationEnabled()) {
                timeIntervalMetric2.setMetricType(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS);
            }
            timeIntervalMetric2.markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric2, this.logEntry, (String) null, 4, (Object) null);
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            o oVarLazy = q.lazy(s.f87403b, (kv.a) new AdInternal$onSuccess$lambda11$$inlined$inject$1(this.context));
            List tpatUrls$default = AdPayload.getTpatUrls$default(advertisement, Constants.AD_LOAD_DURATION, String.valueOf(timeIntervalMetric2.getValue()), null, 4, null);
            if (tpatUrls$default != null) {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(m3576onSuccess$lambda11$lambda9(oVarLazy), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_LOAD_DURATION).withLogEntry(this.logEntry).build(), false, 2, null);
                }
            }
        }
    }

    public final void play(Context context, final AdPlayCallback adPlayCallback) throws Throwable {
        e0.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.showToValidationMetric.markStart();
        this.playContext = context != null ? new WeakReference<>(context) : null;
        VungleError vungleErrorCanPlayAd = canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            adPlayCallback.onFailure(vungleErrorCanPlayAd);
            if (isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        AdPayload adPayload = this.advertisement;
        if (adPayload == null) {
            return;
        }
        AdPlayCallbackWrapper adPlayCallbackWrapper = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.AdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) throws Throwable {
                this.setAdState(AdInternal.AdState.PLAYING);
                this.getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.getValidationToPresentMetric$vungle_ads_release(), this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                super.onAdStart(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) {
                e0.checkNotNullParameter(error, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(error);
            }
        };
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(adPlayCallbackWrapper, adPayload);
    }

    public void renderAd$vungle_ads_release(final AdPlayCallback adPlayCallback, AdPayload advertisement) throws Throwable {
        Context context;
        e0.checkNotNullParameter(advertisement, "advertisement");
        AdActivity.Companion companion = AdActivity.Companion;
        final Placement placement = this.placement;
        companion.setEventListener$vungle_ads_release(new AdEventListener(adPlayCallback, placement) { // from class: com.vungle.ads.internal.AdInternal$renderAd$1
        });
        companion.setAdvertisement$vungle_ads_release(advertisement);
        companion.setBidPayload$vungle_ads_release(this.bidPayload);
        WeakReference<Context> weakReference = this.playContext;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = this.context;
        }
        e0.checkNotNullExpressionValue(context, "playContext?.get() ?: context");
        Placement placement2 = this.placement;
        if (placement2 == null) {
            return;
        }
        Intent intentCreateIntent = companion.createIntent(context, placement2.getReferenceId(), advertisement.eventId());
        ActivityManager.Companion companion2 = ActivityManager.Companion;
        if (!companion2.isForeground()) {
            Logger.Companion.d(TAG, "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            intentCreateIntent.putExtra(AdActivity.AD_INVISIBLE_LOGGED_KEY, true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(1L);
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.logEntry, (String) null, 4, (Object) null);
        }
        this.showToValidationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.showToValidationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.validationToPresentMetric.markStart();
        companion2.startWhenForeground(context, null, intentCreateIntent, null);
    }

    public final void setAdState(AdState value) {
        AdPayload adPayload;
        String strEventId;
        e0.checkNotNullParameter(value, "value");
        if (value.isTerminalState() && (adPayload = this.advertisement) != null && (strEventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            m3571_set_adState_$lambda1$lambda0(q.lazy(s.f87403b, (kv.a) new AdInternal$_set_adState_$lambda1$$inlined$inject$1(this.context))).execute(CleanupJob.Companion.makeJobInfo(strEventId));
        }
        this.adState = this.adState.transitionTo(value);
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setBidPayload(BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    public final void setLogEntry$vungle_ads_release(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }
}
