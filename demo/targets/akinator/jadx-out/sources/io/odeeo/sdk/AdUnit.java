package io.odeeo.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import com.applovin.impl.f9;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.BuildConfig;
import io.bidmachine.media3.exoplayer.b1;
import io.odeeo.internal.b.o;
import io.odeeo.internal.w1.c;
import io.odeeo.internal.w1.j;
import io.odeeo.sdk.AdPosition;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.AdLoader;
import io.odeeo.sdk.advertisement.data.AdInfo;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import io.odeeo.sdk.callbackData.AdData;
import io.odeeo.sdk.callbackData.ImpressionData;
import io.odeeo.sdk.domain.PlacementId;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.a0;
import tu.e0;
import tu.x0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnit {
    public static final int ERROR_INVALID_MEDIA_URL = 8005;
    public static final int ERROR_LOADING_IN_PROGRESS = 8007;
    public static final int ERROR_LOAD_AFTER_RELEASE = 8006;
    public static final int ERROR_MEDIA_PLAYER_ERROR = 8008;
    public static final int ERROR_NETWORK_NOT_AVAILABLE = 8054;
    public static final int ERROR_NO_INVENTORY = 8004;
    public static final int ERROR_PAUSE_EXPIRED = 8011;
    public static final int ERROR_STOPPED_CLOSEBTN = 8012;
    public static final int ERROR_STOPPED_MANUALLY = 8010;
    public static final int ERROR_UNKNOWN = 8003;
    public static final int ERROR_UNKNOWN_HOST = 8001;
    public static final int ERROR_UNSUPPORTED_MIME_TYPE = 8009;
    public static final int EVENT_HEADPHONES_CONNECTED = 208;
    public static final int EVENT_HEADPHONES_DISCONNECTED = 207;
    public static final int NO_ERROR = 0;
    public boolean A;
    public volatile AdState B;
    public AdPosition.IconPosition C;
    public int D;
    public int E;
    public int F;
    public io.odeeo.internal.d1.j<Integer> G;
    public io.odeeo.internal.d1.j<Integer> H;
    public io.odeeo.internal.d1.j<Integer> I;
    public io.odeeo.internal.d1.j<Integer> J;
    public ActionButtonType K;
    public io.odeeo.internal.d1.j<ActionButtonPosition> L;
    public float M;
    public final k N;
    public Application.ActivityLifecycleCallbacks O;
    public RequestType P;
    public final AdLoader.b Q;
    public final AdActivity R;
    public String S;

    /* renamed from: a, reason: collision with root package name */
    public CoroutineScope f67820a;
    public AdLoader adLoader;
    public io.odeeo.internal.k1.a availabilityCallback;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f67821b;

    /* renamed from: c, reason: collision with root package name */
    public final PlacementType f67822c;
    public ConnectivityManager connectivityManager;

    /* renamed from: d, reason: collision with root package name */
    public final String f67823d;

    /* renamed from: e, reason: collision with root package name */
    public AdListener f67824e;
    public io.odeeo.internal.o1.e eventTrackingManager;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67825f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f67826g;
    public io.odeeo.internal.r1.a generateBidRequestDataUseCase;

    /* renamed from: h, reason: collision with root package name */
    public float f67827h;

    /* renamed from: i, reason: collision with root package name */
    public float f67828i;
    public io.odeeo.internal.j1.i imageController;

    /* renamed from: j, reason: collision with root package name */
    public RewardType f67829j;

    /* renamed from: k, reason: collision with root package name */
    public io.odeeo.internal.d1.j<PopUpType> f67830k;

    /* renamed from: l, reason: collision with root package name */
    public io.odeeo.internal.z0.b f67831l;

    /* renamed from: m, reason: collision with root package name */
    public AdPosition.BannerPosition f67832m;
    public Executor mainThreadExecutor;

    /* renamed from: n, reason: collision with root package name */
    public AdPosition.IconPosition f67833n;

    /* renamed from: o, reason: collision with root package name */
    public int f67834o;
    public i odeeoAudioManager;

    /* renamed from: p, reason: collision with root package name */
    public int f67835p;

    /* renamed from: q, reason: collision with root package name */
    public AdPosition.BannerPosition f67836q;

    /* renamed from: r, reason: collision with root package name */
    public AdUnitBase f67837r;

    /* renamed from: s, reason: collision with root package name */
    public AdInfo f67838s;

    /* renamed from: t, reason: collision with root package name */
    public Date f67839t;

    /* renamed from: u, reason: collision with root package name */
    public RetryDelayType f67840u;

    /* renamed from: v, reason: collision with root package name */
    public long f67841v;

    /* renamed from: w, reason: collision with root package name */
    public int f67842w;

    /* renamed from: x, reason: collision with root package name */
    public RetryTimer f67843x;

    /* renamed from: y, reason: collision with root package name */
    public long f67844y;

    /* renamed from: z, reason: collision with root package name */
    public int f67845z;
    public static final Companion Companion = new Companion(null);
    public static final Mutex T = MutexKt.Mutex$default(false, 1, null);
    public static final Map<ErrorShowReason, String> U = p1.mapOf(e0.to(ErrorShowReason.NoInternetConnection, "Internet connection missing"), e0.to(ErrorShowReason.AnotherAdPlaying, "Unable to simultaneously play two different ad units"), e0.to(ErrorShowReason.CurrentAdPlaying, "Current ad already playing"), e0.to(ErrorShowReason.NoAd, "No ad to play"), e0.to(ErrorShowReason.SdkNotInitialized, "SDK not Initialized"), e0.to(ErrorShowReason.GeneralError, "General error"));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ActionButtonPosition {
        TopRight,
        TopLeft;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActionButtonPosition.values().length];
                iArr[ActionButtonPosition.TopRight.ordinal()] = 1;
                iArr[ActionButtonPosition.TopLeft.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final int getGravity$odeeoSdk_release() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return 8388661;
            }
            if (i10 == 2) {
                return 8388659;
            }
            throw new tu.t();
        }

        public final int getReverseGravity$odeeoSdk_release() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return 8388691;
            }
            if (i10 == 2) {
                return 8388693;
            }
            throw new tu.t();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ActionButtonType {
        Mute,
        Close,
        None
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdState {
        NO_ADS,
        LOADING,
        READY
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum CloseReason {
        AdCompleted,
        AdExpired,
        UserClose,
        VolumeChanged,
        UserCancel,
        AdRemovedByDev,
        Other
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[AdPosition.IconPosition.values().length];
                iArr[AdPosition.IconPosition.TopLeft.ordinal()] = 1;
                iArr[AdPosition.IconPosition.CenterLeft.ordinal()] = 2;
                iArr[AdPosition.IconPosition.CenterRight.ordinal()] = 3;
                iArr[AdPosition.IconPosition.Centered.ordinal()] = 4;
                iArr[AdPosition.IconPosition.TopRight.ordinal()] = 5;
                iArr[AdPosition.IconPosition.TopCenter.ordinal()] = 6;
                iArr[AdPosition.IconPosition.BottomLeft.ordinal()] = 7;
                iArr[AdPosition.IconPosition.BottomRight.ordinal()] = 8;
                iArr[AdPosition.IconPosition.BottomCenter.ordinal()] = 9;
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[AdPosition.BannerPosition.values().length];
                iArr2[AdPosition.BannerPosition.TopCenter.ordinal()] = 1;
                iArr2[AdPosition.BannerPosition.BottomCenter.ordinal()] = 2;
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public Companion() {
        }

        public final int a(AdPosition.IconPosition iconPosition) {
            switch (WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()]) {
                case 1:
                    return 8388659;
                case 2:
                    return 8388627;
                case 3:
                    return 8388629;
                case 4:
                    return 17;
                case 5:
                    return 8388661;
                case 6:
                    return 49;
                case 7:
                    return 8388691;
                case 8:
                    return 8388693;
                case 9:
                    return 81;
                default:
                    throw new tu.t();
            }
        }

        public final Map<ErrorShowReason, String> getErrorShowMessages() {
            return AdUnit.U;
        }

        public final int positionToGravity(AdPosition position) {
            kotlin.jvm.internal.e0.checkNotNullParameter(position, "position");
            if (position instanceof AdPosition.BannerPosition) {
                return a((AdPosition.BannerPosition) position);
            }
            if (position instanceof AdPosition.IconPosition) {
                return a((AdPosition.IconPosition) position);
            }
            throw new tu.t();
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a(AdPosition.BannerPosition bannerPosition) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[bannerPosition.ordinal()];
            if (i10 == 1) {
                return 49;
            }
            if (i10 == 2) {
                return 81;
            }
            throw new tu.t();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ErrorShowReason {
        NoInternetConnection,
        AnotherAdPlaying,
        CurrentAdPlaying,
        NoAd,
        SdkNotInitialized,
        GeneralError
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PlacementType {
        AudioBannerAd("banner"),
        RewardedAudioBannerAd("rewarded_banner"),
        AudioIconAd("icon"),
        RewardedAudioIconAd("rewarded_icon");


        /* renamed from: a, reason: collision with root package name */
        public final String f67854a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlacementType.values().length];
                iArr[PlacementType.RewardedAudioBannerAd.ordinal()] = 1;
                iArr[PlacementType.RewardedAudioIconAd.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        PlacementType(String str) {
            this.f67854a = str;
        }

        public final String getHeaderValue() {
            return this.f67854a;
        }

        public final PopUpType getRewardedPopUpType() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i10 != 1 ? i10 != 2 ? PopUpType.IconPopUp : PopUpType.IconPopUp : PopUpType.BannerPopUp;
        }

        public final boolean isPlainAd() {
            return !isRewardedAd();
        }

        public final boolean isRewardedAd() {
            return this == RewardedAudioBannerAd || this == RewardedAudioIconAd;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum PopUpType {
        IconPopUp("icon_pop_up"),
        BannerPopUp("banner_pop_up");


        /* renamed from: a, reason: collision with root package name */
        public final String f67856a;

        PopUpType(String str) {
            this.f67856a = str;
        }

        public final String getValue() {
            return this.f67856a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum RequestType {
        STANDARD("standard"),
        RETRY("retry"),
        REFRESH(ToolBar.REFRESH);


        /* renamed from: a, reason: collision with root package name */
        public final String f67858a;

        RequestType(String str) {
            this.f67858a = str;
        }

        public final String getValue() {
            return this.f67858a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum RetryDelayType {
        SHORT,
        INTERMEDIATE,
        LONG
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class RetryTimer extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public long f67860a;

        public RetryTimer(long j10) {
            super(j10, 300L);
            this.f67860a = j10 / 1000;
        }

        public final long getRemainingSeconds() {
            return this.f67860a;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            this.f67860a = j10 / 1000;
        }

        public final void setRemainingSeconds(long j10) {
            this.f67860a = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum RewardType {
        InLevel("inlevel"),
        EndLevel("endlevel"),
        Undefined(AdError.UNDEFINED_DOMAIN);


        /* renamed from: a, reason: collision with root package name */
        public final String f67862a;

        RewardType(String str) {
            this.f67862a = str;
        }

        public final String getValue() {
            return this.f67862a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum StateChangeReason {
        AdCovered,
        AdUncovered,
        RewardedVolumeMinimum,
        RewardedVolumeIncrease,
        ApplicationInBackground,
        ApplicationInForeground,
        AudioSessionInterruption,
        AudioSessionInterruptionEnd,
        OtherOdeeoPlacementStart,
        OtherOdeeoPlacementEnd
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlacementType.values().length];
            iArr[PlacementType.RewardedAudioBannerAd.ordinal()] = 1;
            iArr[PlacementType.AudioBannerAd.ordinal()] = 2;
            iArr[PlacementType.RewardedAudioIconAd.ordinal()] = 3;
            iArr[PlacementType.AudioIconAd.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AdUnit$loadAd$1", f = "AdUnit.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.sdk.AdUnit$loadAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41131 extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67894a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RequestType f67896c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.sdk.AdUnit$loadAd$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06991 extends f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AdUnit f67897a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06991(AdUnit adUnit) {
                super(0);
                this.f67897a = adUnit;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m4618invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4618invoke() {
                AdUnit adUnit = this.f67897a;
                adUnit.loadAd(adUnit.P);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41131(RequestType requestType, zu.d<? super C41131> dVar) {
            super(2, dVar);
            this.f67896c = requestType;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AdUnit.this.new C41131(this.f67896c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f67894a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AdUnit.this.a();
            AdUnit.this.P = this.f67896c;
            boolean zIsInitialized = OdeeoSDK.isInitialized();
            x0 x0Var = x0.f87415a;
            if (!zIsInitialized) {
                io.odeeo.internal.b2.a.w("OdeeoSDK is not Initialized. Waiting for initialization before making request", new Object[0]);
                return x0Var;
            }
            if (AdUnit.this.f67823d.length() == 0) {
                io.odeeo.internal.b2.a.w("Unable to create AdUnit with " + AdUnit.this.f67822c + ". PlacementID should not be empty.", new Object[0]);
                return x0Var;
            }
            if (!io.odeeo.internal.v1.k.f67283a.isNetworkConnected(AdUnit.this.f67821b)) {
                io.odeeo.internal.b2.a.d("No internet connection. Listening for network changes to retry loading ad.", new Object[0]);
                AdUnit.this.getAvailabilityCallback$odeeoSdk_release().registerNetworkCallback(new C06991(AdUnit.this));
                return x0Var;
            }
            AdUnit.this.setCurrentState$odeeoSdk_release(AdState.LOADING);
            io.odeeo.internal.a.c cVar = (io.odeeo.internal.a.c) BuildersKt__BuildersKt.runBlocking$default(null, new AdUnit$loadAd$1$requestData$1(AdUnit.this, this.f67896c, null), 1, null);
            if (cVar instanceof io.odeeo.internal.a.a) {
                io.odeeo.internal.b2.a.d("Unable to create request data. Waiting for initialization before making request", (Throwable) ((io.odeeo.internal.a.a) cVar).getError());
            }
            AdUnit adUnit = AdUnit.this;
            if (cVar instanceof io.odeeo.internal.a.b) {
                AdLoader.m4624loadgfFLLNU$default(adUnit.getAdLoader$odeeoSdk_release(), (BidRequestData) ((io.odeeo.internal.a.b) cVar).getValue(), adUnit.f67822c, adUnit.f67823d, null, 8, null);
                if (adUnit.f67822c.isRewardedAd()) {
                    io.odeeo.internal.j1.i imageController$odeeoSdk_release = adUnit.getImageController$odeeoSdk_release();
                    OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
                    imageController$odeeoSdk_release.loadImage(odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardInlevelPopup(), PopUpType.IconPopUp);
                    adUnit.getImageController$odeeoSdk_release().loadImage(odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardEndlevelPopup(), PopUpType.BannerPopUp);
                }
            }
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C41131) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.sdk.AdUnit$loadAd$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements kv.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4619invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4619invoke() {
            AdUnit.this.setReadyState$odeeoSdk_release();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AdUnit$showAd$1", f = "AdUnit.kt", i = {2, 3, 4, 5}, l = {458, 459, 1352, 462, 463, 465}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: io.odeeo.sdk.AdUnit$showAd$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41141 extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public Object f67914a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67915b;

        /* renamed from: c, reason: collision with root package name */
        public int f67916c;

        public C41141(zu.d<? super C41141> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AdUnit.this.new C41141(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x002d, PHI: r1 r4 r6
          0x00a2: PHI (r1v7 io.odeeo.sdk.AdUnit) = (r1v4 io.odeeo.sdk.AdUnit), (r1v9 io.odeeo.sdk.AdUnit) binds: [B:39:0x009f, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r4v7 kotlinx.coroutines.sync.Mutex) = (r4v4 kotlinx.coroutines.sync.Mutex), (r4v9 kotlinx.coroutines.sync.Mutex) binds: [B:39:0x009f, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r6v16 java.lang.Object) = (r6v15 java.lang.Object), (r6v0 java.lang.Object) binds: [B:39:0x009f, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0028, B:48:0x00bc, B:52:0x00c8, B:17:0x0039, B:41:0x00a2, B:45:0x00ae, B:38:0x0094), top: B:60:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0028, B:48:0x00bc, B:52:0x00c8, B:17:0x0039, B:41:0x00a2, B:45:0x00ae, B:38:0x0094), top: B:60:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002d, blocks: (B:12:0x0028, B:48:0x00bc, B:52:0x00c8, B:17:0x0039, B:41:0x00a2, B:45:0x00ae, B:38:0x0094), top: B:60:0x0009 }] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit.C41141.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C41141) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdUnit(Activity activity, PlacementType adRequestType, AdListener adListener, String placementId) {
        this(activity, adRequestType, adListener, placementId, RewardType.Undefined, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequestType, "adRequestType");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementId, "placementId");
    }

    public static final void b(AdUnit this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.N.onCreate();
        this$0.N.onStart();
    }

    public static /* synthetic */ boolean checkDateExpire$odeeoSdk_release$default(AdUnit adUnit, Date date, Date date2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            date2 = Calendar.getInstance().getTime();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(date2, "getInstance().time");
        }
        if ((i10 & 4) != 0) {
            j10 = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getCachedIntervalMs();
        }
        return adUnit.checkDateExpire$odeeoSdk_release(date, date2, j10);
    }

    public static /* synthetic */ Object executeAdShowing$odeeoSdk_release$default(AdUnit adUnit, io.odeeo.internal.b.o oVar, io.odeeo.internal.z0.f fVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            oVar = adUnit.buildExoPlayer$odeeoSdk_release();
        }
        if ((i10 & 2) != 0) {
            fVar = adUnit.createOdeeoViewModel$odeeoSdk_release();
        }
        return adUnit.executeAdShowing$odeeoSdk_release(oVar, fVar, dVar);
    }

    public static /* synthetic */ void getMainThreadExecutor$odeeoSdk_release$annotations() {
    }

    public static /* synthetic */ void setRewardedPopupIconPosition$default(AdUnit adUnit, AdPosition.IconPosition iconPosition, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        adUnit.setRewardedPopupIconPosition(iconPosition, i10, i11);
    }

    public final void a(AdInfo adInfo) {
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d);
        io.odeeo.internal.z0.b.f67787b.setAdFrequencyMillis$odeeoSdk_release(Math.max(cVarM4588getPlacementConfig00XPtyU.getPlacementAdFrequencyMillis(), OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getAppConfig().getAdFrequency() * 1000));
        setUpPlacementConfig$odeeoSdk_release(cVarM4588getPlacementConfig00XPtyU);
        loadAd$odeeoSdk_release(adInfo);
    }

    public final <T extends View> T applyRewardedTag$odeeoSdk_release(T t10) {
        if (t10 == null) {
            return t10;
        }
        t10.setTag(R.drawable.endlevel_popup, new n(this.f67829j, this.f67830k.getValue(), this.f67827h, getPopupPosition$odeeoSdk_release(), this.f67834o, this.f67835p));
        return t10;
    }

    public final c buildAudioAd$odeeoSdk_release(io.odeeo.internal.z0.f adViewModel, io.odeeo.internal.b.o player) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewModel, "adViewModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(player, "player");
        io.odeeo.internal.b1.b bVar = new io.odeeo.internal.b1.b(player, adViewModel, this.f67821b);
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d);
        return new c(bVar, adViewModel, getOdeeoAudioManager$odeeoSdk_release(), this.R, getEventTrackingManager$odeeoSdk_release(), this.f67822c, cVarM4588getPlacementConfig00XPtyU.getEnforceAudibility(), cVarM4588getPlacementConfig00XPtyU.getAudibilityEnforcementVolume(), new AdUnit$buildAudioAd$1(this));
    }

    public final io.odeeo.internal.b.o buildExoPlayer$odeeoSdk_release() {
        io.odeeo.internal.b.l lVar = new io.odeeo.internal.b.l(this.f67821b);
        lVar.setEnableDecoderFallback(true);
        io.odeeo.internal.b.o oVarBuild = new o.c(this.f67821b, lVar).build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(oVarBuild, "Builder(mActivity, renderersFactory).build()");
        return oVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zu.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.odeeo.sdk.AdUnit$isInternetAvailableOrNotifyFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            io.odeeo.sdk.AdUnit$isInternetAvailableOrNotifyFailure$1 r0 = (io.odeeo.sdk.AdUnit$isInternetAvailableOrNotifyFailure$1) r0
            int r1 = r0.f67890c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67890c = r1
            goto L18
        L13:
            io.odeeo.sdk.AdUnit$isInternetAvailableOrNotifyFailure$1 r0 = new io.odeeo.sdk.AdUnit$isInternetAvailableOrNotifyFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f67888a
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67890c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            boolean r5 = r4.checkInternetConnection$odeeoSdk_release()
            if (r5 != 0) goto L4d
            io.odeeo.sdk.AdUnit$ErrorShowReason r5 = io.odeeo.sdk.AdUnit.ErrorShowReason.NoInternetConnection
            r0.f67890c = r3
            java.lang.String r2 = "Internet connection missing"
            java.lang.Object r5 = r4.a(r2, r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = 0
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        L4d:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit.c(zu.d):java.lang.Object");
    }

    public final boolean checkDateExpire$odeeoSdk_release(Date date, Date secondDate, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(secondDate, "secondDate");
        Long lValueOf = date == null ? null : Long.valueOf(date.getTime());
        return lValueOf != null && secondDate.getTime() - lValueOf.longValue() >= j10;
    }

    public final boolean checkInternetConnection$odeeoSdk_release() {
        NetworkInfo activeNetworkInfo = getConnectivityManager$odeeoSdk_release().getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isConnectedOrConnecting();
    }

    public final void createAutoRefreshTimer$odeeoSdk_release() {
        io.odeeo.internal.e1.b globalConfig = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig();
        RetryDelayType retryDelayType = this.f67840u;
        if (retryDelayType == RetryDelayType.SHORT) {
            if (this.f67842w <= globalConfig.getShortRetryAmount()) {
                a(this, globalConfig.getShortRetryDelay(), null, 2, null);
                return;
            } else {
                this.f67840u = RetryDelayType.INTERMEDIATE;
                a(this, globalConfig.getIntermediateRetryDelay(), null, 2, null);
                return;
            }
        }
        if (retryDelayType != RetryDelayType.INTERMEDIATE) {
            a(this, globalConfig.getLongRetryDelay(), null, 2, null);
        } else if (this.f67842w <= globalConfig.getIntermediateRetryAmount()) {
            a(this, globalConfig.getIntermediateRetryDelay(), null, 2, null);
        } else {
            this.f67840u = RetryDelayType.LONG;
            a(this, globalConfig.getLongRetryDelay(), null, 2, null);
        }
    }

    public final io.odeeo.internal.z0.f createOdeeoViewModel$odeeoSdk_release() {
        WeakReference weakReference = new WeakReference(b());
        AdInfo adInfo = this.f67838s;
        Resources resources = this.f67821b.getResources();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources, "mActivity.resources");
        return new io.odeeo.internal.z0.f(weakReference, adInfo, resources);
    }

    public final io.odeeo.internal.w1.j createRootChecker$odeeoSdk_release() {
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase == null) {
            return null;
        }
        PopupWindow popupWindow$odeeoSdk_release = adUnitBase.getPopupWindow$odeeoSdk_release();
        kotlin.jvm.internal.e0.checkNotNull(popupWindow$odeeoSdk_release);
        return new io.odeeo.internal.w1.j(popupWindow$odeeoSdk_release, adUnitBase.getAdView$odeeoSdk_release());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zu.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.odeeo.sdk.AdUnit$isSdkInitializedOrNotifyFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            io.odeeo.sdk.AdUnit$isSdkInitializedOrNotifyFailure$1 r0 = (io.odeeo.sdk.AdUnit$isSdkInitializedOrNotifyFailure$1) r0
            int r1 = r0.f67893c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67893c = r1
            goto L18
        L13:
            io.odeeo.sdk.AdUnit$isSdkInitializedOrNotifyFailure$1 r0 = new io.odeeo.sdk.AdUnit$isSdkInitializedOrNotifyFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f67891a
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67893c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            boolean r5 = io.odeeo.sdk.OdeeoSDK.isInitialized()
            if (r5 != 0) goto L4d
            io.odeeo.sdk.AdUnit$ErrorShowReason r5 = io.odeeo.sdk.AdUnit.ErrorShowReason.SdkNotInitialized
            r0.f67893c = r3
            java.lang.String r2 = "SDK not Initialized"
            java.lang.Object r5 = r4.a(r2, r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r5 = 0
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        L4d:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit.d(zu.d):java.lang.Object");
    }

    public final void dispose$odeeoSdk_release() {
        io.odeeo.internal.b2.a.d("dispose", new Object[0]);
        getAvailabilityCallback$odeeoSdk_release().unregisterNetworkCallback();
        OdeeoSDK.INSTANCE.removeAdUnit$odeeoSdk_release(this);
        this.f67837r = null;
        this.B = AdState.NO_ADS;
        getMainThreadExecutor$odeeoSdk_release().execute(new o(this, 3));
    }

    public final Object e(zu.d<? super x0> dVar) {
        boolean zIsAdAvailable = isAdAvailable();
        x0 x0Var = x0.f87415a;
        if (!zIsAdAvailable) {
            Object objA = a("Ad is not available for showing yet. Use isAdAvailable() to check availability", ErrorShowReason.GeneralError, dVar);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0Var;
        }
        if (getAdUnit$odeeoSdk_release() == null) {
            Object objExecuteAdShowing$odeeoSdk_release$default = executeAdShowing$odeeoSdk_release$default(this, null, null, dVar, 3, null);
            return objExecuteAdShowing$odeeoSdk_release$default == av.e.getCOROUTINE_SUSPENDED() ? objExecuteAdShowing$odeeoSdk_release$default : x0Var;
        }
        Object objA2 = a("Current ad already playing", ErrorShowReason.CurrentAdPlaying, dVar);
        return objA2 == av.e.getCOROUTINE_SUSPENDED() ? objA2 : x0Var;
    }

    public final Object executeAdShowing$odeeoSdk_release(io.odeeo.internal.b.o oVar, io.odeeo.internal.z0.f fVar, zu.d<? super x0> dVar) {
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d);
        setPlaying$odeeoSdk_release(true);
        return BuildersKt.withContext(OdeeoSDK.INSTANCE.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release(), new AdUnit$executeAdShowing$2(this, fVar, cVarM4588getPlacementConfig00XPtyU, oVar, null), dVar);
    }

    public final void executeAdShowingInternal$odeeoSdk_release(zu.d<? super x0> cont, io.odeeo.internal.b.o player, io.odeeo.internal.z0.f odeeoViewModel) {
        CoroutineScope coroutineScope$odeeoSdk_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(cont, "cont");
        kotlin.jvm.internal.e0.checkNotNullParameter(player, "player");
        kotlin.jvm.internal.e0.checkNotNullParameter(odeeoViewModel, "odeeoViewModel");
        c();
        AdUnitBase adUnitBaseA = a(player, odeeoViewModel, provideHandlePageLoadFun$odeeoSdk_release(cont));
        this.f67837r = adUnitBaseA;
        if (adUnitBaseA != null && (coroutineScope$odeeoSdk_release = adUnitBaseA.getCoroutineScope$odeeoSdk_release()) != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope$odeeoSdk_release, null, null, new AdUnit$executeAdShowingInternal$1(this, odeeoViewModel, null), 3, null);
        }
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase != null) {
            adUnitBase.setVisualizationColor(this.H.getValue().intValue(), this.I.getValue().intValue(), this.J.getValue().intValue());
        }
        AdUnitBase adUnitBase2 = this.f67837r;
        if (adUnitBase2 != null) {
            adUnitBase2.play();
        }
        this.f67831l.startCountingPacingTime$odeeoSdk_release();
        a.f67998a.addAdUnitType$odeeoSdk_release(this.f67822c);
    }

    public final ActionButtonPosition getActionButtonPosition$odeeoSdk_release() {
        io.odeeo.internal.d1.j<ActionButtonPosition> jVar = this.L;
        ActionButtonPosition value = jVar == null ? null : jVar.getValue();
        return value == null ? this.K == ActionButtonType.Mute ? ActionButtonPosition.TopRight : ActionButtonPosition.TopLeft : value;
    }

    public final ActionButtonType getActionButtonType$odeeoSdk_release() {
        return this.K;
    }

    public final Application.ActivityLifecycleCallbacks getActivityLifecycleListener$odeeoSdk_release(io.odeeo.internal.z0.f adViewModel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewModel, "adViewModel");
        return new AdUnit$getActivityLifecycleListener$1(this);
    }

    public final Date getAdExpireDate$odeeoSdk_release() {
        return this.f67839t;
    }

    public final AdInfo getAdInfo$odeeoSdk_release() {
        return this.f67838s;
    }

    public final AdListener getAdListener$odeeoSdk_release() {
        return this.f67824e;
    }

    public final AdLoader getAdLoader$odeeoSdk_release() {
        AdLoader adLoader = this.adLoader;
        if (adLoader != null) {
            return adLoader;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("adLoader");
        return null;
    }

    public final AdUnitBase getAdUnit$odeeoSdk_release() {
        return this.f67837r;
    }

    public final CoroutineScope getAdUnitScope$odeeoSdk_release() {
        return this.f67820a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.odeeo.internal.w1.b getAdviewWithBannerData$odeeoSdk_release() {
        io.odeeo.internal.w1.b bVar = new io.odeeo.internal.w1.b(this.f67821b, null, 2, 0 == true ? 1 : 0);
        bVar.setTag(new m(this.f67836q, 0, 0, 0, this.G.getValue().intValue(), this.K, this.M, this.f67821b.getWindow().getAttributes().flags, null, true));
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.odeeo.internal.w1.e getAdviewWithIconData$odeeoSdk_release() {
        io.odeeo.internal.w1.e eVar = new io.odeeo.internal.w1.e(this.f67821b, null, 2, 0 == true ? 1 : 0);
        eVar.setTag(new m(this.C, this.D, this.E, this.F, this.G.getValue().intValue(), this.K, this.M, this.f67821b.getWindow().getAttributes().flags, getActionButtonPosition$odeeoSdk_release(), false));
        return eVar;
    }

    public final io.odeeo.internal.k1.a getAvailabilityCallback$odeeoSdk_release() {
        io.odeeo.internal.k1.a aVar = this.availabilityCallback;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("availabilityCallback");
        return null;
    }

    public final ConnectivityManager getConnectivityManager$odeeoSdk_release() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectivityManager");
        return null;
    }

    public final RetryDelayType getCurrentRetryDelayType$odeeoSdk_release() {
        return this.f67840u;
    }

    public final AdState getCurrentState$odeeoSdk_release() {
        return this.B;
    }

    public final io.odeeo.internal.o1.e getEventTrackingManager$odeeoSdk_release() {
        io.odeeo.internal.o1.e eVar = this.eventTrackingManager;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("eventTrackingManager");
        return null;
    }

    public final io.odeeo.internal.r1.a getGenerateBidRequestDataUseCase$odeeoSdk_release() {
        io.odeeo.internal.r1.a aVar = this.generateBidRequestDataUseCase;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("generateBidRequestDataUseCase");
        return null;
    }

    public final io.odeeo.internal.j1.i getImageController$odeeoSdk_release() {
        io.odeeo.internal.j1.i iVar = this.imageController;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("imageController");
        return null;
    }

    public final int getLastErrorCode$odeeoSdk_release() {
        return this.f67845z;
    }

    public final AdActivity getMActivityListener$odeeoSdk_release() {
        return this.R;
    }

    public final Executor getMainThreadExecutor$odeeoSdk_release() {
        Executor executor = this.mainThreadExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("mainThreadExecutor");
        return null;
    }

    public final i getOdeeoAudioManager$odeeoSdk_release() {
        i iVar = this.odeeoAudioManager;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("odeeoAudioManager");
        return null;
    }

    public final AdPosition getPopupPosition$odeeoSdk_release() {
        return this.f67830k.getValue() == PopUpType.BannerPopUp ? this.f67832m : this.f67833n;
    }

    public final RetryTimer getProgressTick$odeeoSdk_release() {
        return this.f67843x;
    }

    public final int getRetryAmount$odeeoSdk_release() {
        return this.f67842w;
    }

    public final RetryTimer getRetryTimer$odeeoSdk_release(final long j10, final kv.a callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        return new RetryTimer(j10, callback) { // from class: io.odeeo.sdk.AdUnit$getRetryTimer$1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f67880b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kv.a f67881c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j10);
                this.f67880b = j10;
                this.f67881c = callback;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.f67881c.invoke();
            }
        };
    }

    public final io.odeeo.internal.d1.j<PopUpType> getRewardedPopUpType$odeeoSdk_release() {
        return this.f67830k;
    }

    public final boolean getWasCovered$odeeoSdk_release() {
        return this.A;
    }

    public final io.odeeo.internal.d1.j<ActionButtonPosition> get_actionButtonPosition$odeeoSdk_release() {
        return this.L;
    }

    public final void handleWindowFocusChanged$odeeoSdk_release(boolean z10) {
        if (z10 && this.f67826g && !getOdeeoAudioManager$odeeoSdk_release().isMuteEnabled()) {
            getOdeeoAudioManager$odeeoSdk_release().requestAudioFocus$odeeoSdk_release();
        }
    }

    public final void init$odeeoSdk_release() {
        this.f67821b.runOnUiThread(new o(this, 1));
        if (io.odeeo.internal.v1.d.f67273a.isChromeBook(this.f67821b)) {
            io.odeeo.internal.b2.a.i("ChromeOS is not supported, dummy initialization. Ads are not available", new Object[0]);
            return;
        }
        OdeeoSDK.INSTANCE.addAdUnit$odeeoSdk_release(this);
        if (OdeeoSDK.isInitialized()) {
            loadAd(RequestType.STANDARD);
        }
    }

    public final void initDi$odeeoSdk_release() {
        OdeeoSDK.INSTANCE.getAppComponent$odeeoSdk_release().inject(this);
    }

    public final boolean isAdAvailable() {
        if (this.f67826g || this.B != AdState.READY) {
            return false;
        }
        if (!checkDateExpire$odeeoSdk_release$default(this, this.f67839t, null, 0L, 6, null)) {
            return true;
        }
        io.odeeo.internal.b2.a.d("Ad expired and is now unavailable. Requesting another one.", new Object[0]);
        dispose$odeeoSdk_release();
        a(this, this.f67831l.getPacingDelayInSeconds$odeeoSdk_release(), null, 2, null);
        return false;
    }

    public final boolean isAdCached() {
        return this.B == AdState.READY;
    }

    public final boolean isPlaying() {
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase == null) {
            return false;
        }
        return adUnitBase.isPlaying();
    }

    public final boolean isPlaying$odeeoSdk_release() {
        return this.f67826g;
    }

    public final void loadAd(RequestType requestType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestType, "requestType");
        BuildersKt__Builders_commonKt.launch$default(this.f67820a, null, null, new C41131(requestType, null), 3, null);
    }

    public final void loadAd$odeeoSdk_release(AdInfo ad2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        a();
        this.f67845z = 0;
        if (ad2.getUrl$odeeoSdk_release().length() == 0) {
            onLoadError$odeeoSdk_release(8004);
            return;
        }
        int i10 = this.f67825f ? ERROR_LOAD_AFTER_RELEASE : !io.odeeo.internal.v1.k.f67283a.isNetworkConnected(this.f67821b) ? 8054 : 0;
        if (i10 != 0) {
            onLoadError$odeeoSdk_release(i10);
            return;
        }
        this.f67838s = ad2;
        this.f67839t = Calendar.getInstance().getTime();
        if (this.f67826g) {
            return;
        }
        this.f67841v = 0L;
        this.f67842w = 0;
        this.f67840u = RetryDelayType.SHORT;
        if (this.f67831l.isPacingTimeElapsed$odeeoSdk_release()) {
            setReadyState$odeeoSdk_release();
        } else {
            setTimerWithDelay$odeeoSdk_release(this.f67831l.getPacingRemainingTime$odeeoSdk_release(), new AnonymousClass2());
        }
    }

    public final void onPause() {
        io.odeeo.internal.b2.a.d("onPause ad unit", new Object[0]);
        getMainThreadExecutor$odeeoSdk_release().execute(new o(this, 4));
    }

    public final void onResume() {
        io.odeeo.internal.b2.a.d("onResume ad unit", new Object[0]);
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase != null && adUnitBase.isCurrentlyCovered$odeeoSdk_release()) {
            return;
        }
        getMainThreadExecutor$odeeoSdk_release().execute(new o(this, 0));
    }

    public final void processCoverageStatus$odeeoSdk_release(j.a coverageStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coverageStatus, "coverageStatus");
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase == null) {
            return;
        }
        getMainThreadExecutor$odeeoSdk_release().execute(new b1(coverageStatus, 4, this, adUnitBase));
    }

    public final kv.a provideHandlePageLoadFun$odeeoSdk_release(zu.d<? super x0> cont) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cont, "cont");
        return new AdUnit$provideHandlePageLoadFun$1(this, cont);
    }

    public final void release() {
        io.odeeo.internal.b2.a.d("release", new Object[0]);
        this.f67825f = true;
        getAdLoader$odeeoSdk_release().forceCancelledStatus();
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase == null) {
            return;
        }
        adUnitBase.releaseAudioAd$odeeoSdk_release();
    }

    public final void removeAd() {
        boolean z10 = this.f67826g && this.B == AdState.READY;
        io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("removeAd is completed: ", Boolean.valueOf(z10)), new Object[0]);
        if (z10) {
            getMainThreadExecutor$odeeoSdk_release().execute(new o(this, 2));
            this.B = AdState.NO_ADS;
            AdUnitBase adUnitBase = this.f67837r;
            if (adUnitBase == null) {
                return;
            }
            adUnitBase.releaseAudioAd$odeeoSdk_release();
        }
    }

    public final void runRootViewChecker$odeeoSdk_release() {
        AdUnitBase adUnitBase = this.f67837r;
        if (adUnitBase == null) {
            return;
        }
        io.odeeo.internal.w1.j rootViewChecker$odeeoSdk_release = adUnitBase.getRootViewChecker$odeeoSdk_release();
        if (rootViewChecker$odeeoSdk_release != null) {
            rootViewChecker$odeeoSdk_release.observeAdViewCoverageStatus();
        }
        BuildersKt__Builders_commonKt.launch$default(adUnitBase.getCoroutineScope$odeeoSdk_release(), OdeeoSDK.INSTANCE.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release(), null, new AdUnit$runRootViewChecker$1(adUnitBase, this, null), 2, null);
    }

    public final void sendInternalTrackingEvent$odeeoSdk_release(h event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        io.odeeo.internal.o1.e eventTrackingManager$odeeoSdk_release = getEventTrackingManager$odeeoSdk_release();
        String trackingEventApi = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getTrackingEventApi();
        String strEventId = event.eventId();
        String trackingEventPayload$odeeoSdk_release = this.f67838s.getTrackingEventPayload$odeeoSdk_release();
        Integer numValueOf = Integer.valueOf(event.getCode());
        Float fValueOf = Float.valueOf(io.odeeo.internal.v1.h.roundTwo(OdeeoSDK.getDeviceVolumeLevel()));
        io.odeeo.internal.o1.d dVar = io.odeeo.internal.o1.d.f65173a;
        AdUnitBase adUnitBase = this.f67837r;
        io.odeeo.internal.o1.e.sendInternalTrackingEvent$default(eventTrackingManager$odeeoSdk_release, new io.odeeo.internal.o1.b(trackingEventApi, new io.odeeo.internal.o1.c(strEventId, trackingEventPayload$odeeoSdk_release, numValueOf, null, null, null, fValueOf, null, null, 0L, dVar.map(event, adUnitBase == null ? false : adUnitBase.getAudibilityEnforced(), this.f67822c.isRewardedAd()), 952, null)), null, 2, null);
    }

    public final void setActionButtonType$odeeoSdk_release(ActionButtonType actionButtonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(actionButtonType, "<set-?>");
        this.K = actionButtonType;
    }

    public final void setAdExpireDate$odeeoSdk_release(Date date) {
        this.f67839t = date;
    }

    public final void setAdInfo$odeeoSdk_release(AdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "<set-?>");
        this.f67838s = adInfo;
    }

    public final void setAdListener$odeeoSdk_release(AdListener adListener) {
        this.f67824e = adListener;
    }

    public final void setAdLoader$odeeoSdk_release(AdLoader adLoader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adLoader, "<set-?>");
        this.adLoader = adLoader;
    }

    public final void setAdUnit$odeeoSdk_release(AdUnitBase adUnitBase) {
        this.f67837r = adUnitBase;
    }

    public final void setAdUnitScope$odeeoSdk_release(CoroutineScope coroutineScope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f67820a = coroutineScope;
    }

    public final void setAudioOnlyAnimationColor(String mainColorHex) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mainColorHex, "mainColorHex");
        this.H = new io.odeeo.internal.d1.k(Integer.valueOf(Color.parseColor(mainColorHex)));
    }

    public final void setAudioOnlyBackgroundColor(String backgroundColorHex) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backgroundColorHex, "backgroundColorHex");
        int color = Color.parseColor(backgroundColorHex);
        this.I = new io.odeeo.internal.d1.k(Integer.valueOf(color));
        this.J = new io.odeeo.internal.d1.k(Integer.valueOf(color));
    }

    public final void setAvailabilityCallback$odeeoSdk_release(io.odeeo.internal.k1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.availabilityCallback = aVar;
    }

    public final void setBannerPosition(AdPosition.BannerPosition newPosition) {
        kotlin.jvm.internal.e0.checkNotNullParameter(newPosition, "newPosition");
        this.f67836q = newPosition;
    }

    public final void setConnectivityManager$odeeoSdk_release(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectivityManager, "<set-?>");
        this.connectivityManager = connectivityManager;
    }

    public final void setCurrentRetryDelayType$odeeoSdk_release(RetryDelayType retryDelayType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(retryDelayType, "<set-?>");
        this.f67840u = retryDelayType;
    }

    public final void setCurrentState$odeeoSdk_release(AdState adState) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adState, "<set-?>");
        this.B = adState;
    }

    public final void setCustomTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        this.S = tag;
    }

    public final void setEventTrackingManager$odeeoSdk_release(io.odeeo.internal.o1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<set-?>");
        this.eventTrackingManager = eVar;
    }

    public final void setGenerateBidRequestDataUseCase$odeeoSdk_release(io.odeeo.internal.r1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
        this.generateBidRequestDataUseCase = aVar;
    }

    public final void setIconActionButtonPosition(ActionButtonPosition actionButtonPosition) {
        this.L = new io.odeeo.internal.d1.k(actionButtonPosition);
    }

    public final void setIconPosition(AdPosition.IconPosition pos, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pos, "pos");
        this.C = pos;
        this.D = i10;
        this.E = i11;
    }

    public final void setIconSize(int i10) {
        this.F = i10;
    }

    public final void setImageController$odeeoSdk_release(io.odeeo.internal.j1.i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<set-?>");
        this.imageController = iVar;
    }

    public final void setLastErrorCode$odeeoSdk_release(int i10) {
        this.f67845z = i10;
    }

    public final void setMainThreadExecutor$odeeoSdk_release(Executor executor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "<set-?>");
        this.mainThreadExecutor = executor;
    }

    public final void setOdeeoAudioManager$odeeoSdk_release(i iVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<set-?>");
        this.odeeoAudioManager = iVar;
    }

    public final void setPlaying$odeeoSdk_release(boolean z10) {
        this.f67826g = z10;
    }

    public final void setProgressBarColor(String colorHex) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorHex, "colorHex");
        this.G = new io.odeeo.internal.d1.k(Integer.valueOf(Color.parseColor(colorHex)));
    }

    public final void setProgressTick$odeeoSdk_release(RetryTimer retryTimer) {
        this.f67843x = retryTimer;
    }

    public final void setReadyState$odeeoSdk_release() {
        AdData adData;
        this.B = AdState.READY;
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        if (odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getAppConfig().getAdAvailabilityDataCallbackEnabled()) {
            String sessionID$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getSessionID$odeeoSdk_release();
            String str = this.f67823d;
            String country$odeeoSdk_release = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getCountry$odeeoSdk_release();
            adData = new AdData(this.f67822c, sessionID$odeeoSdk_release, str, country$odeeoSdk_release, this.f67838s.getPricing$odeeoSdk_release(), io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d).getTransactionId(), this.S);
        } else {
            adData = new AdData(this.f67822c, null, null, null, 0.0d, null, this.S, 62, null);
        }
        AdListener adListener = this.f67824e;
        if (adListener == null) {
            return;
        }
        adListener.onAvailabilityChanged(true, adData);
    }

    public final void setRetryAmount$odeeoSdk_release(int i10) {
        this.f67842w = i10;
    }

    public final void setRewardedPopUpType(PopUpType rewardPopUpType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardPopUpType, "rewardPopUpType");
        this.f67830k = new io.odeeo.internal.d1.k(rewardPopUpType);
    }

    public final void setRewardedPopUpType$odeeoSdk_release(io.odeeo.internal.d1.j<PopUpType> jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<set-?>");
        this.f67830k = jVar;
    }

    public final void setRewardedPopupBannerPosition(AdPosition.BannerPosition pos) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pos, "pos");
        this.f67832m = pos;
    }

    public final void setRewardedPopupIconPosition(AdPosition.IconPosition pos, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pos, "pos");
        this.f67833n = pos;
        this.f67834o = i10;
        this.f67835p = i11;
    }

    public final void setTimerWithDelay$odeeoSdk_release(long j10, kv.a callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        this.f67841v = j10 / 1000;
        getMainThreadExecutor$odeeoSdk_release().execute(new f9(this, j10, callback, 4));
    }

    public final void setUpPlacementConfig$odeeoSdk_release(io.odeeo.internal.e1.c config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        io.odeeo.internal.b2.a.d("Placement with ID=" + this.f67823d + " received " + config, new Object[0]);
        this.K = config.getActionButtonType$odeeoSdk_release();
        io.odeeo.internal.d1.j<ActionButtonPosition> jVar = this.L;
        if (jVar == null || !jVar.isSetByUser()) {
            this.L = new io.odeeo.internal.d1.d(config.getActionButtonPosition$odeeoSdk_release());
        }
        this.M = config.getActionButtonDelaySec() * 1000.0f;
        if (this.f67829j == RewardType.Undefined) {
            this.f67829j = config.getRewardType$odeeoSdk_release();
        }
        this.f67828i = config.getRewardItem$odeeoSdk_release();
        this.f67827h = (float) config.getRewardAmount();
        if (this.f67830k.isSetByUser()) {
            return;
        }
        PopUpType rewardedPopUpType = config.getRewardedPopUpType();
        if (rewardedPopUpType == null) {
            rewardedPopUpType = this.f67822c.getRewardedPopUpType();
        }
        this.f67830k = new io.odeeo.internal.d1.d(rewardedPopUpType);
    }

    public final void setWasCovered$odeeoSdk_release(boolean z10) {
        this.A = z10;
    }

    public final void set_actionButtonPosition$odeeoSdk_release(io.odeeo.internal.d1.j<ActionButtonPosition> jVar) {
        this.L = jVar;
    }

    public final void showAd() {
        io.odeeo.internal.b2.a.d("showAd", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this.f67820a, null, null, new C41141(null), 3, null);
    }

    public final Object subscribeToLifecycleState$odeeoSdk_release(io.odeeo.internal.z0.f fVar, zu.d<? super x0> dVar) {
        Object objCollect = fVar.getLifecycleState().collect(new FlowCollector() { // from class: io.odeeo.sdk.AdUnit$subscribeToLifecycleState$2

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[io.odeeo.internal.z0.a.values().length];
                    iArr[io.odeeo.internal.z0.a.OnResumed.ordinal()] = 1;
                    iArr[io.odeeo.internal.z0.a.OnPaused.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar2) {
                return emit((io.odeeo.internal.z0.a) obj, (zu.d<? super x0>) dVar2);
            }

            public final Object emit(io.odeeo.internal.z0.a aVar, zu.d<? super x0> dVar2) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                if (i10 == 1) {
                    this.f67918a.onResume();
                } else if (i10 == 2) {
                    this.f67918a.onPause();
                }
                return x0.f87415a;
            }
        }, dVar);
        return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public String toString() {
        return "AdUnit(" + this.f67822c.name() + AbstractJsonLexerKt.COMMA + this.B.name() + ')';
    }

    public final void trackAdShowBlocked() {
        io.odeeo.internal.b2.a.d("trackAdShowBlocked", new Object[0]);
        if (!this.f67838s.isInitialized()) {
            io.odeeo.internal.b2.a.i("The 'trackAdShowBlocked' function should only be used when an ad is available and can be displayed to the user.", new Object[0]);
        } else if (OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getTrackingEventApi().length() == 0 || this.f67838s.getTrackingEventPayload$odeeoSdk_release().length() == 0) {
            io.odeeo.internal.b2.a.i("Unable to receive tracking URL.", new Object[0]);
        } else {
            sendInternalTrackingEvent$odeeoSdk_release(h.f68094p);
        }
    }

    public final void trackRewardedOffer() {
        io.odeeo.internal.b2.a.d("trackRewardedOffer", new Object[0]);
        if (!isAdAvailable()) {
            io.odeeo.internal.b2.a.w("The 'trackRewardedOffer' function should only be used when an ad is available and reward trigger can be displayed to the user. Please make sure that 'isAdAvailable' to show before showing your Reward trigger.", new Object[0]);
            return;
        }
        io.odeeo.internal.b2.a.d("ad is available", new Object[0]);
        try {
            String trackingEventPayload$odeeoSdk_release = this.f67838s.getTrackingEventPayload$odeeoSdk_release();
            String trackingEventApi = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getTrackingEventApi();
            if (TextUtils.isEmpty(trackingEventPayload$odeeoSdk_release)) {
                io.odeeo.internal.b2.a.w("Unable to receive tracking event Payload", new Object[0]);
            } else if (TextUtils.isEmpty(trackingEventApi)) {
                io.odeeo.internal.b2.a.w("Unable to receive tracking event URL", new Object[0]);
            } else {
                sendInternalTrackingEvent$odeeoSdk_release(h.f68093o);
            }
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(kotlin.jvm.internal.e0.stringPlus("Post exception: ", e10.getMessage()), new Object[0]);
        }
    }

    public final void onLoadError$odeeoSdk_release(int i10) {
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        Context applicationContext = this.f67821b.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "mActivity.applicationContext");
        if (!kVar.isNetworkConnected(applicationContext)) {
            io.odeeo.internal.b2.a.w(TJzY.MwfIawlduWzyCpj, new Object[0]);
            i10 = 8054;
        }
        this.f67845z = i10;
        if (i10 != 8054) {
            this.B = AdState.NO_ADS;
            this.f67842w++;
            createAutoRefreshTimer$odeeoSdk_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdUnit(Activity activity, PlacementType placementType, AdListener adListener, String str, RewardType rewardType, PopUpType popUpType) {
        io.odeeo.internal.d1.j<PopUpType> dVar;
        this.f67820a = CoroutineScopeKt.CoroutineScope(JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));
        this.f67829j = RewardType.Undefined;
        io.odeeo.internal.z0.c cVar = io.odeeo.internal.z0.c.f67790a;
        this.f67831l = cVar.m4617build00XPtyU(PlacementId.m4631constructorimpl(BuildConfig.FLAVOR));
        this.f67836q = AdPosition.BannerPosition.BottomCenter;
        this.f67838s = new AdInfo(null, 1, null == true ? 1 : 0);
        this.f67840u = RetryDelayType.SHORT;
        this.B = AdState.NO_ADS;
        this.C = AdPosition.IconPosition.BottomRight;
        this.D = 10;
        this.E = 10;
        this.F = 80;
        this.G = new io.odeeo.internal.d1.d(-1);
        this.H = new io.odeeo.internal.d1.d(-1);
        c.a aVar = io.odeeo.internal.w1.c.f67352p;
        this.I = new io.odeeo.internal.d1.d(Integer.valueOf(aVar.getCOLOR_DEFAULT_FROM$odeeoSdk_release()));
        this.J = new io.odeeo.internal.d1.d(Integer.valueOf(aVar.getCOLOR_DEFAULT_TO$odeeoSdk_release()));
        this.K = ActionButtonType.Mute;
        this.N = new k();
        this.P = RequestType.STANDARD;
        this.Q = new AdLoader.b() { // from class: io.odeeo.sdk.AdUnit$mAdLoaderListener$1
            @Override // io.odeeo.sdk.advertisement.AdLoader.b
            public void onAdLoaded(AdLoader adLoader, AdInfo ad2) {
                kotlin.jvm.internal.e0.checkNotNullParameter(adLoader, "adLoader");
                kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
                this.f67903a.a(ad2);
            }

            @Override // io.odeeo.sdk.advertisement.AdLoader.b
            public void onAdLoadingError(AdLoader adLoader, int i10) {
                this.f67903a.onLoadError$odeeoSdk_release(i10);
            }
        };
        this.R = new AdActivity() { // from class: io.odeeo.sdk.AdUnit$mActivityListener$1
            @Override // io.odeeo.sdk.AdActivity
            public void onClick() {
                io.odeeo.internal.b2.a.d("onClick", new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onClick();
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onClose(AdUnit.CloseReason adResultData) {
                kotlin.jvm.internal.e0.checkNotNullParameter(adResultData, "adResultData");
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onClose adResultData: ", adResultData), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release != null) {
                    adListener$odeeoSdk_release.onClose(adResultData);
                }
                this.f67902a.setPlaying$odeeoSdk_release(false);
                this.f67902a.dispose$odeeoSdk_release();
                AdUnit adUnit = this.f67902a;
                adUnit.a(adUnit.f67831l.getPacingDelayInSeconds$odeeoSdk_release(), AdUnit.RequestType.STANDARD);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onImpression(ImpressionData data) {
                kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onImpression data: ", data), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                data.setCustomTag(this.f67902a.S);
                adListener$odeeoSdk_release.onImpression(data);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onMute(boolean z10) {
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onMute isEnabled: ", Boolean.valueOf(z10)), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onMute(z10);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onPause(AdUnit.StateChangeReason pauseReason) {
                kotlin.jvm.internal.e0.checkNotNullParameter(pauseReason, "pauseReason");
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onPause pauseReason: ", pauseReason), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onPause(pauseReason);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onResume(AdUnit.StateChangeReason resumeReason) {
                kotlin.jvm.internal.e0.checkNotNullParameter(resumeReason, "resumeReason");
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onResume resumeReason: ", resumeReason), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onResume(resumeReason);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onReward(float f10) {
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onReward value: ", Float.valueOf(f10)), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onReward(f10);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onRewardedPopupAppear() {
                io.odeeo.internal.b2.a.d("onRewardedPopupAppear", new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onRewardedPopupAppear();
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onRewardedPopupClosed(AdUnit.CloseReason closeReason) {
                kotlin.jvm.internal.e0.checkNotNullParameter(closeReason, "closeReason");
                io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onRewardedPopupClosed closeReason: ", closeReason), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onRewardedPopupClosed(closeReason);
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onShow() {
                io.odeeo.internal.b2.a.d("onShow", new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onShow();
            }

            @Override // io.odeeo.sdk.AdActivity
            public void onShowFailed(String placementID, AdUnit.ErrorShowReason reason, String str2) {
                kotlin.jvm.internal.e0.checkNotNullParameter(placementID, "placementID");
                kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
                io.odeeo.internal.b2.a.w("onShowFailed placementID: " + placementID + ", reason: " + reason + ", description: " + ((Object) str2), new Object[0]);
                AdListener adListener$odeeoSdk_release = this.f67902a.getAdListener$odeeoSdk_release();
                if (adListener$odeeoSdk_release == null) {
                    return;
                }
                adListener$odeeoSdk_release.onShowFailed(placementID, reason, str2);
            }
        };
        this.S = "";
        this.f67821b = activity;
        activity.getWindow().setCallback(new Window.Callback() { // from class: io.odeeo.sdk.AdUnit.1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Window.Callback f67846a;

            {
                this.f67846a = AdUnit.this.f67821b.getWindow().getCallback();
            }

            @Override // android.view.Window.Callback
            public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
                return this.f67846a.dispatchGenericMotionEvent(motionEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                return this.f67846a.dispatchKeyEvent(keyEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
                return this.f67846a.dispatchKeyShortcutEvent(keyEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                return this.f67846a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return this.f67846a.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.Window.Callback
            public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
                return this.f67846a.dispatchTrackballEvent(motionEvent);
            }

            @Override // android.view.Window.Callback
            public void onActionModeFinished(ActionMode actionMode) {
                this.f67846a.onActionModeFinished(actionMode);
            }

            @Override // android.view.Window.Callback
            public void onActionModeStarted(ActionMode actionMode) {
                this.f67846a.onActionModeStarted(actionMode);
            }

            @Override // android.view.Window.Callback
            public void onAttachedToWindow() {
                this.f67846a.onAttachedToWindow();
            }

            @Override // android.view.Window.Callback
            public void onContentChanged() {
                this.f67846a.onContentChanged();
            }

            @Override // android.view.Window.Callback
            public boolean onCreatePanelMenu(int i10, Menu p12) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
                return this.f67846a.onCreatePanelMenu(i10, p12);
            }

            @Override // android.view.Window.Callback
            public View onCreatePanelView(int i10) {
                return this.f67846a.onCreatePanelView(i10);
            }

            @Override // android.view.Window.Callback
            public void onDetachedFromWindow() {
                this.f67846a.onDetachedFromWindow();
            }

            @Override // android.view.Window.Callback
            public boolean onMenuItemSelected(int i10, MenuItem p12) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
                return this.f67846a.onMenuItemSelected(i10, p12);
            }

            @Override // android.view.Window.Callback
            public boolean onMenuOpened(int i10, Menu p12) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
                return this.f67846a.onMenuOpened(i10, p12);
            }

            @Override // android.view.Window.Callback
            public void onPanelClosed(int i10, Menu p12) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p12, "p1");
                this.f67846a.onPanelClosed(i10, p12);
            }

            @Override // android.view.Window.Callback
            public boolean onPreparePanel(int i10, View view, Menu p22) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p22, "p2");
                return this.f67846a.onPreparePanel(i10, view, p22);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested() {
                return this.f67846a.onSearchRequested();
            }

            @Override // android.view.Window.Callback
            public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
                this.f67846a.onWindowAttributesChanged(layoutParams);
            }

            @Override // android.view.Window.Callback
            public void onWindowFocusChanged(boolean z10) {
                AdUnit.this.handleWindowFocusChanged$odeeoSdk_release(z10);
            }

            @Override // android.view.Window.Callback
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
                return this.f67846a.onWindowStartingActionMode(callback);
            }

            @Override // android.view.Window.Callback
            public boolean onSearchRequested(SearchEvent searchEvent) {
                return this.f67846a.onSearchRequested(searchEvent);
            }

            @Override // android.view.Window.Callback
            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
                return this.f67846a.onWindowStartingActionMode(callback, i10);
            }
        });
        this.f67822c = placementType;
        String strM4631constructorimpl = PlacementId.m4631constructorimpl(str);
        this.f67823d = strM4631constructorimpl;
        this.f67824e = adListener;
        this.f67829j = rewardType;
        if (popUpType != null) {
            dVar = new io.odeeo.internal.d1.k<>(popUpType);
        } else {
            dVar = new io.odeeo.internal.d1.d(placementType.getRewardedPopUpType());
        }
        this.f67830k = dVar;
        this.f67831l = cVar.m4617build00XPtyU(strM4631constructorimpl);
        if (!io.odeeo.internal.h1.a.m4591isPidValid00XPtyU(strM4631constructorimpl)) {
            io.odeeo.internal.b2.a.w("PlacementID is empty or incorrect", new Object[0]);
        } else {
            init$odeeoSdk_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r2.a("Unable to simultaneously play two different ad units", r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zu.d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$1
            if (r0 == 0) goto L13
            r0 = r7
            io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$1 r0 = (io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$1) r0
            int r1 = r0.f67885d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67885d = r1
            goto L18
        L13:
            io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$1 r0 = new io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f67883b
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67885d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            tu.a0.throwOnFailure(r7)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f67882a
            io.odeeo.sdk.AdUnit r2 = (io.odeeo.sdk.AdUnit) r2
            tu.a0.throwOnFailure(r7)
            goto L57
        L3d:
            tu.a0.throwOnFailure(r7)
            io.odeeo.sdk.OdeeoSDK r7 = io.odeeo.sdk.OdeeoSDK.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r7 = r7.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()
            io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1 r2 = new io.odeeo.sdk.AdUnit$isAdShowAllowedOrNotifyFailure$isShowNotAllowed$1
            r2.<init>(r6, r3)
            r0.f67882a = r6
            r0.f67885d = r5
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L56
            goto L6d
        L56:
            r2 = r6
        L57:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L74
            io.odeeo.sdk.AdUnit$ErrorShowReason r7 = io.odeeo.sdk.AdUnit.ErrorShowReason.AnotherAdPlaying
            r0.f67882a = r3
            r0.f67885d = r4
            java.lang.String r3 = "Unable to simultaneously play two different ad units"
            java.lang.Object r7 = r2.a(r3, r7, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r7 = 0
            java.lang.Boolean r7 = bv.b.boxBoolean(r7)
            return r7
        L74:
            java.lang.Boolean r7 = bv.b.boxBoolean(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit.b(zu.d):java.lang.Object");
    }

    public static final void d(AdUnit this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.f67826g) {
                return;
            }
            if (checkDateExpire$odeeoSdk_release$default(this$0, this$0.f67839t, null, 0L, 6, null)) {
                io.odeeo.internal.b2.a.d("Ad expired while being inactive for too long.", new Object[0]);
                this$0.dispose$odeeoSdk_release();
            }
            RetryTimer retryTimer = this$0.f67843x;
            if (retryTimer == null) {
                return;
            }
            a(this$0, (int) Math.max(0L, retryTimer.getRemainingSeconds() - ((SystemClock.elapsedRealtime() - this$0.f67844y) / 1000)), null, 2, null);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onResume exception:", e10.getMessage()), new Object[0]);
        }
    }

    public static final void e(AdUnit this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        AdUnitBase adUnitBase = this$0.f67837r;
        if (adUnitBase == null) {
            return;
        }
        adUnitBase.finishWithError(new io.odeeo.internal.b1.e(ERROR_STOPPED_MANUALLY, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(zu.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.odeeo.sdk.AdUnit$checkErrorCodeOrNotifyFailure$1
            if (r0 == 0) goto L13
            r0 = r5
            io.odeeo.sdk.AdUnit$checkErrorCodeOrNotifyFailure$1 r0 = (io.odeeo.sdk.AdUnit$checkErrorCodeOrNotifyFailure$1) r0
            int r1 = r0.f67867c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67867c = r1
            goto L18
        L13:
            io.odeeo.sdk.AdUnit$checkErrorCodeOrNotifyFailure$1 r0 = new io.odeeo.sdk.AdUnit$checkErrorCodeOrNotifyFailure$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f67865a
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f67867c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            int r5 = r4.getLastErrorCode$odeeoSdk_release()
            r2 = 8004(0x1f44, float:1.1216E-41)
            if (r5 != r2) goto L4f
            io.odeeo.sdk.AdUnit$ErrorShowReason r5 = io.odeeo.sdk.AdUnit.ErrorShowReason.NoAd
            r0.f67867c = r3
            java.lang.String r2 = "No ad to play"
            java.lang.Object r5 = r4.a(r2, r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r5 = 0
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        L4f:
            java.lang.Boolean r5 = bv.b.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.AdUnit.a(zu.d):java.lang.Object");
    }

    public final void c() {
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d);
        if (cVarM4588getPlacementConfig00XPtyU.hasAudioOnlyWaveColor$odeeoSdk_release() && !this.H.isSetByUser()) {
            this.H = new io.odeeo.internal.d1.d(Integer.valueOf(Color.parseColor(cVarM4588getPlacementConfig00XPtyU.getAudioOnlyWaveColor())));
        }
        if (cVarM4588getPlacementConfig00XPtyU.hasDefaultBackgroundColor$odeeoSdk_release() && !this.I.isSetByUser() && !this.J.isSetByUser()) {
            int color = Color.parseColor(cVarM4588getPlacementConfig00XPtyU.getAudioOnlyBackgroundColor());
            this.I = new io.odeeo.internal.d1.d(Integer.valueOf(color));
            this.J = new io.odeeo.internal.d1.d(Integer.valueOf(color));
        }
        if (!cVarM4588getPlacementConfig00XPtyU.hasProgressBarColor$odeeoSdk_release() || this.G.isSetByUser()) {
            return;
        }
        this.G = new io.odeeo.internal.d1.d(Integer.valueOf(Color.parseColor(cVarM4588getPlacementConfig00XPtyU.getProgressBarColor())));
    }

    public final androidx.lifecycle.b1 b() {
        ComponentCallbacks2 componentCallbacks2 = this.f67821b;
        if (componentCallbacks2 instanceof androidx.lifecycle.b1) {
            return (androidx.lifecycle.b1) componentCallbacks2;
        }
        return this.N;
    }

    public final AdUnitBase a(io.odeeo.internal.b.o oVar, io.odeeo.internal.z0.f fVar, kv.a aVar) {
        View rootView = this.f67821b.getWindow().getDecorView().getRootView();
        io.odeeo.internal.e1.c cVarM4588getPlacementConfig00XPtyU = io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(this.f67823d);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f67822c.ordinal()];
        if (i10 == 1) {
            c cVarBuildAudioAd$odeeoSdk_release = buildAudioAd$odeeoSdk_release(fVar, oVar);
            io.odeeo.internal.w1.b bVar = (io.odeeo.internal.w1.b) applyRewardedTag$odeeoSdk_release(getAdviewWithBannerData$odeeoSdk_release());
            AdActivity adActivity = this.R;
            String str = this.f67823d;
            String transactionId = cVarM4588getPlacementConfig00XPtyU.getTransactionId();
            io.odeeo.internal.o1.e eventTrackingManager$odeeoSdk_release = getEventTrackingManager$odeeoSdk_release();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rootView, "rootView");
            return new e(fVar, cVarBuildAudioAd$odeeoSdk_release, bVar, adActivity, rootView, str, transactionId, eventTrackingManager$odeeoSdk_release, aVar);
        }
        if (i10 == 2) {
            c cVarBuildAudioAd$odeeoSdk_release2 = buildAudioAd$odeeoSdk_release(fVar, oVar);
            io.odeeo.internal.w1.b adviewWithBannerData$odeeoSdk_release = getAdviewWithBannerData$odeeoSdk_release();
            AdActivity adActivity2 = this.R;
            String str2 = this.f67823d;
            String transactionId2 = cVarM4588getPlacementConfig00XPtyU.getTransactionId();
            io.odeeo.internal.o1.e eventTrackingManager$odeeoSdk_release2 = getEventTrackingManager$odeeoSdk_release();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rootView, "rootView");
            d dVar = new d(fVar, cVarBuildAudioAd$odeeoSdk_release2, adviewWithBannerData$odeeoSdk_release, adActivity2, rootView, str2, transactionId2, eventTrackingManager$odeeoSdk_release2, aVar);
            a.f67998a.setPlainAdUnit(dVar);
            return dVar;
        }
        if (i10 == 3) {
            c cVarBuildAudioAd$odeeoSdk_release3 = buildAudioAd$odeeoSdk_release(fVar, oVar);
            io.odeeo.internal.w1.e eVar = (io.odeeo.internal.w1.e) applyRewardedTag$odeeoSdk_release(getAdviewWithIconData$odeeoSdk_release());
            AdActivity adActivity3 = this.R;
            String str3 = this.f67823d;
            String transactionId3 = cVarM4588getPlacementConfig00XPtyU.getTransactionId();
            io.odeeo.internal.o1.e eventTrackingManager$odeeoSdk_release3 = getEventTrackingManager$odeeoSdk_release();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rootView, "rootView");
            return new g(fVar, cVarBuildAudioAd$odeeoSdk_release3, eVar, adActivity3, rootView, str3, transactionId3, eventTrackingManager$odeeoSdk_release3, aVar);
        }
        if (i10 == 4) {
            c cVarBuildAudioAd$odeeoSdk_release4 = buildAudioAd$odeeoSdk_release(fVar, oVar);
            io.odeeo.internal.w1.e adviewWithIconData$odeeoSdk_release = getAdviewWithIconData$odeeoSdk_release();
            AdActivity adActivity4 = this.R;
            String str4 = this.f67823d;
            String transactionId4 = cVarM4588getPlacementConfig00XPtyU.getTransactionId();
            io.odeeo.internal.o1.e eventTrackingManager$odeeoSdk_release4 = getEventTrackingManager$odeeoSdk_release();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(rootView, "rootView");
            f fVar2 = new f(fVar, cVarBuildAudioAd$odeeoSdk_release4, adviewWithIconData$odeeoSdk_release, adActivity4, rootView, str4, transactionId4, eventTrackingManager$odeeoSdk_release4, aVar);
            a.f67998a.setPlainAdUnit(fVar2);
            return fVar2;
        }
        throw new tu.t();
    }

    public static final void c(AdUnit this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        try {
            RetryTimer retryTimer = this$0.f67843x;
            if (retryTimer == null) {
                return;
            }
            this$0.f67844y = SystemClock.elapsedRealtime();
            retryTimer.cancel();
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("onPause exception:", e10.getMessage()), new Object[0]);
        }
    }

    public static final void a(j.a coverageStatus, AdUnit this$0, AdUnitBase adUnitBase) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coverageStatus, "$coverageStatus");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitBase, "$adUnitBase");
        io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("runRootViewChecker coverageStatus: ", coverageStatus), new Object[0]);
        if (coverageStatus instanceof j.a.b) {
            this$0.sendInternalTrackingEvent$odeeoSdk_release(h.f68101w);
            if (adUnitBase.isStartedPlaying()) {
                adUnitBase.pause(StateChangeReason.AdCovered);
            } else {
                adUnitBase.pauseWhenReady$odeeoSdk_release(StateChangeReason.AdCovered);
            }
            this$0.A = true;
            return;
        }
        if (this$0.A) {
            this$0.sendInternalTrackingEvent$odeeoSdk_release(h.f68102x);
            adUnitBase.setIsAudioFocused$odeeoSdk_release(true);
            adUnitBase.resume(StateChangeReason.AdUncovered);
            this$0.A = false;
        }
    }

    public final void a(Exception exc) {
        this.f67826g = false;
        io.odeeo.internal.b2.a.w(o2.o(new StringBuilder("General exception. Ad showing with placement "), this.f67823d, " is failed"), exc);
        AdListener adListener = this.f67824e;
        if (adListener != null) {
            String str = this.f67823d;
            ErrorShowReason errorShowReason = ErrorShowReason.GeneralError;
            adListener.onShowFailed(str, errorShowReason, U.get(errorShowReason));
        }
        this.f67821b.getApplication().unregisterActivityLifecycleCallbacks(this.O);
    }

    public final Object a(String str, ErrorShowReason errorShowReason, zu.d<? super x0> dVar) {
        x0 x0Var;
        io.odeeo.internal.b2.a.w(o2.o(a.b.t(str, ". Ad showing with placement "), this.f67823d, " is failed"), new Object[0]);
        AdListener adListener$odeeoSdk_release = getAdListener$odeeoSdk_release();
        x0 x0Var2 = x0.f87415a;
        if (adListener$odeeoSdk_release == null) {
            x0Var = null;
        } else {
            adListener$odeeoSdk_release.onShowFailed(this.f67823d, errorShowReason, U.get(errorShowReason));
            x0Var = x0Var2;
        }
        return x0Var == av.e.getCOROUTINE_SUSPENDED() ? x0Var : x0Var2;
    }

    public static /* synthetic */ void a(AdUnit adUnit, int i10, RequestType requestType, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            requestType = RequestType.RETRY;
        }
        adUnit.a(i10, requestType);
    }

    public final void a(int i10, RequestType requestType) {
        StringBuilder sbT = p0.o2.t(i10, "There is no ad to display. We will retry to request an ad in ", " sec. Detected device volume: ");
        sbT.append(OdeeoSDK.getDeviceVolumeLevel());
        sbT.append(". Detected request country: ");
        sbT.append(OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().getCountry$odeeoSdk_release());
        sbT.append('.');
        io.odeeo.internal.b2.a.i(sbT.toString(), new Object[0]);
        setTimerWithDelay$odeeoSdk_release(i10 * 1000, new AdUnit$setTimerWithDelay$1(this, requestType));
    }

    public static final void a(AdUnit this$0, long j10, kv.a callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "$callback");
        try {
            RetryTimer retryTimer = this$0.f67843x;
            if (retryTimer != null) {
                retryTimer.cancel();
            }
            RetryTimer retryTimer$odeeoSdk_release = this$0.getRetryTimer$odeeoSdk_release(j10, callback);
            if (OdeeoSDK.INSTANCE.isPausedFlow$odeeoSdk_release().getValue().booleanValue()) {
                io.odeeo.internal.b2.a.d("Timer is not started because ad is paused", new Object[0]);
            } else {
                retryTimer$odeeoSdk_release.start();
            }
            this$0.f67843x = retryTimer$odeeoSdk_release;
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(kotlin.jvm.internal.e0.stringPlus("CreateAutoRefreshTimer exception:", e10.getMessage()), new Object[0]);
        }
    }

    public final void a() {
        if (this.adLoader == null) {
            initDi$odeeoSdk_release();
            getAdLoader$odeeoSdk_release().setListener(this.Q);
        }
    }

    public static final void a(AdUnit this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        a.f67998a.disposeAd(this$0.f67822c);
        this$0.f67821b.getApplication().unregisterActivityLifecycleCallbacks(this$0.O);
    }
}
