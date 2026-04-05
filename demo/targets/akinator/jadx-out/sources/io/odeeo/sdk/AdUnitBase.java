package io.odeeo.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.b1;
import androidx.lifecycle.u1;
import com.iab.omid.library.odeeoio.Omid;
import com.iab.omid.library.odeeoio.adsession.media.Position;
import com.iab.omid.library.odeeoio.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.odeeo.internal.w1.j;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.callbackData.ImpressionData;
import io.odeeo.sdk.l;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class AdUnitBase implements l.b {
    public final u1 A;
    public final u1 B;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.z0.f f67919a;

    /* renamed from: b, reason: collision with root package name */
    public final c f67920b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.w1.c f67921c;

    /* renamed from: d, reason: collision with root package name */
    public final AdActivity f67922d;

    /* renamed from: e, reason: collision with root package name */
    public final View f67923e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67924f;

    /* renamed from: g, reason: collision with root package name */
    public final String f67925g;

    /* renamed from: h, reason: collision with root package name */
    public final io.odeeo.internal.a1.a f67926h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.o1.e f67927i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f67928j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f67929k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f67930l;

    /* renamed from: m, reason: collision with root package name */
    public PopupWindow f67931m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f67932n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f67933o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f67934p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f67935q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f67936r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f67937s;

    /* renamed from: t, reason: collision with root package name */
    public final String f67938t;

    /* renamed from: u, reason: collision with root package name */
    public io.odeeo.internal.o1.a f67939u;

    /* renamed from: v, reason: collision with root package name */
    public long f67940v;

    /* renamed from: w, reason: collision with root package name */
    public io.odeeo.internal.w1.i f67941w;

    /* renamed from: x, reason: collision with root package name */
    public CoroutineScope f67942x;

    /* renamed from: y, reason: collision with root package name */
    public io.odeeo.internal.w1.j f67943y;

    /* renamed from: z, reason: collision with root package name */
    public final u1 f67944z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AdUnitBase$1", f = "AdUnitBase.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.sdk.AdUnitBase$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67945a;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AdUnitBase.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67945a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow<io.odeeo.internal.z0.a> lifecycleState = AdUnitBase.this.f67919a.getLifecycleState();
                final AdUnitBase adUnitBase = AdUnitBase.this;
                FlowCollector<? super io.odeeo.internal.z0.a> flowCollector = new FlowCollector() { // from class: io.odeeo.sdk.AdUnitBase.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, zu.d dVar) {
                        return emit((io.odeeo.internal.z0.a) obj2, (zu.d<? super x0>) dVar);
                    }

                    public final Object emit(io.odeeo.internal.z0.a aVar, zu.d<? super x0> dVar) {
                        adUnitBase.handleLifecycleState$odeeoSdk_release(aVar);
                        return x0.f87415a;
                    }
                };
                this.f67945a = 1;
                if (lifecycleState.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.sdk.AdUnitBase$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements kv.l {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return x0.f87415a;
        }

        public final void invoke(boolean z10) {
            AdActivity adActivity = AdUnitBase.this.f67922d;
            if (adActivity != null) {
                adActivity.onMute(z10);
            }
            AdUnitBase.this.a(z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.sdk.AdUnitBase$5, reason: invalid class name */
    public static final class AnonymousClass5 extends f0 implements kv.l {
        public AnonymousClass5() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((io.odeeo.internal.b1.e) obj);
            return x0.f87415a;
        }

        public final void invoke(io.odeeo.internal.b1.e it) {
            e0.checkNotNullParameter(it, "it");
            AdUnitBase.this.finishWithError(it);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.sdk.AdUnitBase$6, reason: invalid class name */
    public static final class AnonymousClass6 extends f0 implements kv.l {
        public AnonymousClass6() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AdUnit.CloseReason) obj);
            return x0.f87415a;
        }

        public final void invoke(AdUnit.CloseReason closeReason) {
            e0.checkNotNullParameter(closeReason, "closeReason");
            AdUnitBase.this.f67920b.setPausedWhenReady$odeeoSdk_release(false);
            AdActivity adActivity = AdUnitBase.this.f67922d;
            if (adActivity != null) {
                adActivity.onRewardedPopupClosed(closeReason);
            }
            AdUnitBase.this.f67920b.setPopupShown$odeeoSdk_release(false);
            if (closeReason == AdUnit.CloseReason.Other || !AdUnitBase.this.getStart$odeeoSdk_release()) {
                return;
            }
            AdActivity adActivity2 = AdUnitBase.this.f67922d;
            if (adActivity2 != null) {
                adActivity2.onResume(AdUnit.StateChangeReason.RewardedVolumeIncrease);
            }
            if (closeReason != AdUnit.CloseReason.UserCancel) {
                io.odeeo.internal.o1.e eVar = AdUnitBase.this.f67927i;
                io.odeeo.internal.z0.f fVar = AdUnitBase.this.f67919a;
                TrackEvent trackEvent = TrackEvent.Resume;
                eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
                trackEvent.sendInternalEvent(AdUnitBase.this);
                h.f68084f.sendCustomEvent$odeeoSdk_release(AdUnitBase.this);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EventType {

        /* renamed from: a, reason: collision with root package name */
        public final String f67952a;
        public static final EventType INTERNAL_PAUSE = new EventType("INTERNAL_PAUSE", 0, "internalPause");
        public static final EventType INTERNAL_RESUME = new EventType("INTERNAL_RESUME", 1, "internalResume");
        public static final EventType INTERNAL_VOLUME_CHANGE = new EventType("INTERNAL_VOLUME_CHANGE", 2, "internalVolumeChange");
        public static final EventType INTERNAL_CURRENT_VOLUME_LEVEL = new EventType("INTERNAL_CURRENT_VOLUME_LEVEL", 3, "internalCurrentVolumeLevel");
        public static final EventType INTERNAL_ELIMINATE_AD = new EventType("INTERNAL_ELIMINATE_AD", 4, "internalCloseAd");
        public static final EventType REWARDED_OFFER = new EventType("REWARDED_OFFER", 5, "internalRewardedOffer");
        public static final EventType INTERNAL_REWARD_GRANTED = new INTERNAL_REWARD_GRANTED("INTERNAL_REWARD_GRANTED", 6);
        public static final EventType INTERNAL_REWARD_REJECTED = new INTERNAL_REWARD_REJECTED("INTERNAL_REWARD_REJECTED", 7);
        public static final EventType AD_NOT_SERVED = new EventType("AD_NOT_SERVED", 8, "internalAdNotServed");
        public static final EventType INTERNAL_SHOW_AD = new EventType("INTERNAL_SHOW_AD", 9, "internalShowAd");
        public static final EventType INTERNAL_AUDIBLE_IMPRESSION = new EventType("INTERNAL_AUDIBLE_IMPRESSION", 10, "internalAudibleImpression");

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ EventType[] f67951b = a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class INTERNAL_REWARD_GRANTED extends EventType {
            public INTERNAL_REWARD_GRANTED(String str, int i10) {
                super(str, i10, "internalRewardGranted", null);
            }

            @Override // io.odeeo.sdk.AdUnitBase.EventType
            public void sendCustomEvent(AdUnitBase block, int i10) {
                e0.checkNotNullParameter(block, "block");
                block.a(new AdUnitBase$EventType$INTERNAL_REWARD_GRANTED$sendCustomEvent$1$1(this, i10, block));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class INTERNAL_REWARD_REJECTED extends EventType {
            public INTERNAL_REWARD_REJECTED(String str, int i10) {
                super(str, i10, "internalRewardRejected", null);
            }

            @Override // io.odeeo.sdk.AdUnitBase.EventType
            public void sendCustomEvent(AdUnitBase block, int i10) {
                e0.checkNotNullParameter(block, "block");
                block.a(new AdUnitBase$EventType$INTERNAL_REWARD_REJECTED$sendCustomEvent$1$1(this, i10, block));
            }
        }

        public /* synthetic */ EventType(String str, int i10, String str2, u uVar) {
            this(str, i10, str2);
        }

        public static final /* synthetic */ EventType[] a() {
            return new EventType[]{INTERNAL_PAUSE, INTERNAL_RESUME, INTERNAL_VOLUME_CHANGE, INTERNAL_CURRENT_VOLUME_LEVEL, INTERNAL_ELIMINATE_AD, REWARDED_OFFER, INTERNAL_REWARD_GRANTED, INTERNAL_REWARD_REJECTED, AD_NOT_SERVED, INTERNAL_SHOW_AD, INTERNAL_AUDIBLE_IMPRESSION};
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) f67951b.clone();
        }

        public final String getValue() {
            return this.f67952a;
        }

        public void sendCustomEvent(AdUnitBase block, int i10) {
            e0.checkNotNullParameter(block, "block");
            block.a(new AdUnitBase$EventType$sendCustomEvent$1$1(this, i10, block));
        }

        public EventType(String str, int i10, String str2) {
            this.f67952a = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TrackEvent {

        /* renamed from: a, reason: collision with root package name */
        public final String f67963a;
        public static final TrackEvent Mute = new TrackEvent("Mute", 0, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        public static final TrackEvent UnMute = new TrackEvent("UnMute", 1, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        public static final TrackEvent Pause = new TrackEvent("Pause", 2, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        public static final TrackEvent Resume = new TrackEvent("Resume", 3, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        public static final TrackEvent Skip = new TrackEvent("Skip", 4, "skip");
        public static final TrackEvent Start = new TrackEvent("Start", 5, "start");
        public static final TrackEvent FirstQuartile = new TrackEvent("FirstQuartile", 6, "firstQuartile");
        public static final TrackEvent MidPoint = new TrackEvent("MidPoint", 7, CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
        public static final TrackEvent ThirdQuartile = new TrackEvent("ThirdQuartile", 8, "thirdQuartile");
        public static final TrackEvent Complete = new TrackEvent("Complete", 9, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
        public static final TrackEvent Close = new TrackEvent("Close", 10, "close");
        public static final TrackEvent CreativeView = new TrackEvent("CreativeView", 11, "creativeView");
        public static final TrackEvent Click = new TrackEvent("Click", 12, "click");
        public static final TrackEvent Impression = new Impression("Impression", 13);

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TrackEvent[] f67962b = a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Impression extends TrackEvent {
            public Impression(String str, int i10) {
                super(str, i10, "impression", null);
            }

            @Override // io.odeeo.sdk.AdUnitBase.TrackEvent
            public void sendInternalEvent(AdUnitBase block) {
                String string;
                e0.checkNotNullParameter(block, "block");
                if (block.b() == 0) {
                    string = "320X50";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(block.b());
                    sb2.append('X');
                    sb2.append(block.b());
                    string = sb2.toString();
                }
                block.a(new AdUnitBase$TrackEvent$Impression$sendInternalEvent$1$1(this, string, block));
            }
        }

        public /* synthetic */ TrackEvent(String str, int i10, String str2, u uVar) {
            this(str, i10, str2);
        }

        public static final /* synthetic */ TrackEvent[] a() {
            return new TrackEvent[]{Mute, UnMute, Pause, Resume, Skip, Start, FirstQuartile, MidPoint, ThirdQuartile, Complete, Close, CreativeView, Click, Impression};
        }

        public static TrackEvent valueOf(String str) {
            return (TrackEvent) Enum.valueOf(TrackEvent.class, str);
        }

        public static TrackEvent[] values() {
            return (TrackEvent[]) f67962b.clone();
        }

        public final String getValue() {
            return this.f67963a;
        }

        public void sendInternalEvent(AdUnitBase block) {
            e0.checkNotNullParameter(block, "block");
            block.a(new AdUnitBase$TrackEvent$sendInternalEvent$1$1(this, block));
        }

        public TrackEvent(String str, int i10, String str2) {
            this.f67963a = str2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[io.odeeo.internal.b1.f.values().length];
            iArr[io.odeeo.internal.b1.f.Ended.ordinal()] = 1;
            iArr[io.odeeo.internal.b1.f.FinishFailure.ordinal()] = 2;
            iArr[io.odeeo.internal.b1.f.BufferingFinished.ordinal()] = 3;
            iArr[io.odeeo.internal.b1.f.BufferingStarted.ordinal()] = 4;
            iArr[io.odeeo.internal.b1.f.Ready.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[io.odeeo.internal.z0.a.values().length];
            iArr2[io.odeeo.internal.z0.a.OnResumed.ordinal()] = 1;
            iArr2[io.odeeo.internal.z0.a.OnPaused.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ AdUnitBase(io.odeeo.internal.z0.f fVar, c cVar, io.odeeo.internal.w1.c cVar2, AdActivity adActivity, View view, String str, String str2, io.odeeo.internal.a1.a aVar, io.odeeo.internal.o1.e eVar, u uVar) {
        this(fVar, cVar, cVar2, adActivity, view, str, str2, aVar, eVar);
    }

    public static final void a(AdUnitBase this$0, Integer it) {
        e0.checkNotNullParameter(this$0, "this$0");
        io.odeeo.internal.v1.k kVar = io.odeeo.internal.v1.k.f67283a;
        Context context = this$0.f67923e.getContext();
        e0.checkNotNullExpressionValue(context, "rootView.context");
        if (!kVar.isNetworkConnected(context)) {
            this$0.finishWithError(new io.odeeo.internal.b1.e(8054, null));
        } else {
            e0.checkNotNullExpressionValue(it, "it");
            this$0.timerTick$odeeoSdk_release(it.intValue());
        }
    }

    public int b() {
        return 0;
    }

    public final String c() {
        return this.f67924f;
    }

    public final void checkMuteButtonState$odeeoSdk_release(boolean z10) {
        if (this.f67928j || !z10) {
            return;
        }
        this.f67928j = true;
        this.f67921c.setMuteButtonEnabled(this.f67920b.isMuteEnabled());
    }

    public final void checkSkipButtonState$odeeoSdk_release(boolean z10) {
        if (this.f67929k || !z10) {
            return;
        }
        this.f67929k = true;
        this.f67921c.turnOnSkipButton();
    }

    public AdUnit.RewardType d() {
        return AdUnit.RewardType.Undefined;
    }

    public final boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int adPauseIntervalMs = OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getAdPauseIntervalMs();
        if (this.f67940v == 0) {
            this.f67940v = SystemClock.elapsedRealtime();
        }
        return jElapsedRealtime - this.f67940v > ((long) adPauseIntervalMs);
    }

    public final boolean f() {
        return getAdUnitType() == AdUnit.PlacementType.RewardedAudioBannerAd || getAdUnitType() == AdUnit.PlacementType.RewardedAudioIconAd;
    }

    public void finishWithError(io.odeeo.internal.b1.e error) {
        e0.checkNotNullParameter(error, "error");
        this.f67920b.stopAndRelease();
        this.f67921c.getWebView$odeeoSdk_release().clearAd();
        PopupWindow popupWindow = this.f67931m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f67926h.skippedMediaEvent();
        this.f67926h.finish();
        AdActivity adActivity = this.f67922d;
        if (adActivity != null) {
            adActivity.onClose(io.odeeo.internal.v1.g.f67276a.map(error));
        }
        if (f() && !this.f67936r) {
            h.f68096r.sendCustomEvent$odeeoSdk_release(this);
        }
        switch (error.getErrorCode()) {
            case AdUnit.ERROR_STOPPED_MANUALLY /* 8010 */:
                h.f68090l.sendCustomEvent$odeeoSdk_release(this);
                break;
            case AdUnit.ERROR_PAUSE_EXPIRED /* 8011 */:
                h.f68092n.sendCustomEvent$odeeoSdk_release(this);
                break;
            case AdUnit.ERROR_STOPPED_CLOSEBTN /* 8012 */:
                h.f68091m.sendCustomEvent$odeeoSdk_release(this);
                break;
        }
        io.odeeo.internal.o1.e eVar = this.f67927i;
        io.odeeo.internal.z0.f fVar = this.f67919a;
        TrackEvent trackEvent = TrackEvent.Skip;
        eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
        trackEvent.sendInternalEvent(this);
        io.odeeo.internal.o1.e eVar2 = this.f67927i;
        io.odeeo.internal.z0.f fVar2 = this.f67919a;
        TrackEvent trackEvent2 = TrackEvent.Close;
        eVar2.sendExternalTrackingEvents(fVar2.getExternalEventUrl(trackEvent2));
        trackEvent2.sendInternalEvent(this);
        a();
        this.f67920b.restoreVolumeLevelIfNeeded$odeeoSdk_release();
        this.f67941w.dismiss(AdUnit.CloseReason.Other);
    }

    public void finishWithSuccess() {
        this.f67920b.stopAndRelease();
        this.f67921c.getWebView$odeeoSdk_release().clearAd();
        PopupWindow popupWindow = this.f67931m;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f67926h.completeMediaEvent();
        this.f67926h.finish();
        AdActivity adActivity = this.f67922d;
        if (adActivity != null) {
            adActivity.onClose(AdUnit.CloseReason.AdCompleted);
        }
        io.odeeo.internal.o1.e eVar = this.f67927i;
        io.odeeo.internal.z0.f fVar = this.f67919a;
        TrackEvent trackEvent = TrackEvent.Complete;
        eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
        trackEvent.sendInternalEvent(this);
        h.f68098t.sendCustomEvent$odeeoSdk_release(this);
        a();
        this.f67920b.restoreVolumeLevelIfNeeded$odeeoSdk_release();
        this.f67941w.dismiss(AdUnit.CloseReason.Other);
    }

    public final void g() {
        io.odeeo.internal.o1.a aVar = this.f67939u;
        if (aVar != null && aVar.isReadyToSendEvent(this.f67920b.getPlayer$odeeoSdk_release().getCurrentPosition())) {
            h.f68097s.sendCustomEvent$odeeoSdk_release(this);
            this.f67939u = null;
        }
    }

    public final long getAdPausedTime$odeeoSdk_release() {
        return this.f67940v;
    }

    public abstract AdUnit.PlacementType getAdUnitType();

    public final io.odeeo.internal.w1.c getAdView$odeeoSdk_release() {
        return this.f67921c;
    }

    public final boolean getAudibilityEnforced() {
        return this.f67920b.isAudibilityCurrentlyEnforced$odeeoSdk_release();
    }

    public final CoroutineScope getCoroutineScope$odeeoSdk_release() {
        return this.f67942x;
    }

    public final j.a getCurrentCoverageStatus$odeeoSdk_release() {
        io.odeeo.internal.w1.j jVar = this.f67943y;
        u uVar = null;
        Flow<j.a> coverageStatusStateFlow = jVar == null ? null : jVar.getCoverageStatusStateFlow();
        StateFlow stateFlow = coverageStatusStateFlow instanceof StateFlow ? (StateFlow) coverageStatusStateFlow : null;
        j.a aVar = stateFlow == null ? null : (j.a) stateFlow.getValue();
        return aVar == null ? new j.a.c(false, 1, uVar) : aVar;
    }

    public final io.odeeo.internal.w1.i getPopUp$odeeoSdk_release() {
        return this.f67941w;
    }

    public final PopupWindow getPopupWindow$odeeoSdk_release() {
        return this.f67931m;
    }

    public final io.odeeo.internal.w1.j getRootViewChecker$odeeoSdk_release() {
        return this.f67943y;
    }

    public final boolean getStart$odeeoSdk_release() {
        return this.f67932n;
    }

    public final io.odeeo.internal.z0.f getViewModel$odeeoSdk_release() {
        return this.f67919a;
    }

    public final void handleLifecycleState$odeeoSdk_release(io.odeeo.internal.z0.a aVar) {
        int i10 = aVar == null ? -1 : WhenMappings.$EnumSwitchMapping$1[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            pauseInternal$odeeoSdk_release(AdUnit.StateChangeReason.ApplicationInBackground);
        } else {
            if (!isCurrentlyCovered$odeeoSdk_release()) {
                resumeInternal$odeeoSdk_release(AdUnit.StateChangeReason.ApplicationInForeground);
            }
            io.odeeo.internal.w1.j jVar = this.f67943y;
            if (jVar == null) {
                return;
            }
            jVar.forceCoverageCheck();
        }
    }

    public final void initializeVerifications$odeeoSdk_release() {
        List<io.odeeo.internal.l1.a> verifications$odeeoSdk_release = this.f67919a.getAdInfo().getVerifications$odeeoSdk_release();
        if (Omid.isActive()) {
            if (verifications$odeeoSdk_release == null || verifications$odeeoSdk_release.isEmpty()) {
                io.odeeo.internal.b2.a.w("Ad verification is empty so OM SDK can not be initialized to measure the ad's visibility.", new Object[0]);
                return;
            }
            try {
                this.f67926h.initialize(this.f67919a.getResources(), verifications$odeeoSdk_release);
                trackOmidSessionInitializationErrors$odeeoSdk_release();
            } catch (Exception e10) {
                io.odeeo.internal.b2.a.w(e10, "EVENT_INIT_OMID_ERROR", new Object[0]);
            }
        }
    }

    public final boolean isCurrentlyCovered$odeeoSdk_release() {
        return getCurrentCoverageStatus$odeeoSdk_release() instanceof j.a.b;
    }

    public final boolean isPaused$odeeoSdk_release() {
        return this.f67930l;
    }

    public final boolean isPlaying() {
        return this.f67920b.isPlaying();
    }

    public final boolean isStartedPlaying() {
        return this.f67920b.isStartedPlaying$odeeoSdk_release();
    }

    public final void onApplicationDestroy() {
        this.f67921c.release$odeeoSdk_release();
        this.f67920b.abandonAudioFocus();
        this.f67920b.destroy();
    }

    @Override // io.odeeo.sdk.l.b
    public void onViewCleared(l webView) {
        e0.checkNotNullParameter(webView, "webView");
    }

    @Override // io.odeeo.sdk.l.b
    public void onViewClicked(l webView) {
        e0.checkNotNullParameter(webView, "webView");
        this.f67926h.adUserInteractionClickEvent();
        String onClickTroughEvent$odeeoSdk_release = this.f67919a.getAdInfo().getOnClickTroughEvent$odeeoSdk_release();
        if (onClickTroughEvent$odeeoSdk_release != null && onClickTroughEvent$odeeoSdk_release.length() > 0) {
            this.f67927i.sendExternalTrackingEvents(this.f67919a.getAdInfo().getOnClickTrackingEvents$odeeoSdk_release());
            TrackEvent.Click.sendInternalEvent(this);
        }
        this.f67937s = true;
        AdActivity adActivity = this.f67922d;
        if (adActivity == null) {
            return;
        }
        adActivity.onClick();
    }

    @Override // io.odeeo.sdk.l.b
    public void onViewError(l webView, int i10) {
        e0.checkNotNullParameter(webView, "webView");
    }

    @Override // io.odeeo.sdk.l.b
    public void onViewLoaded(l webView) {
        e0.checkNotNullParameter(webView, "webView");
    }

    public void pause(AdUnit.StateChangeReason pauseReason) {
        e0.checkNotNullParameter(pauseReason, "pauseReason");
        pauseInternal$odeeoSdk_release(pauseReason);
        this.f67920b.pausePlayer$odeeoSdk_release();
        this.f67921c.setButtonsClickable(false);
    }

    public final void pauseInternal$odeeoSdk_release(AdUnit.StateChangeReason pauseReason) {
        e0.checkNotNullParameter(pauseReason, "pauseReason");
        if (this.f67930l) {
            return;
        }
        this.f67921c.pause$odeeoSdk_release();
        this.f67926h.pauseMediaEvent();
        io.odeeo.internal.o1.e eVar = this.f67927i;
        io.odeeo.internal.z0.f fVar = this.f67919a;
        TrackEvent trackEvent = TrackEvent.Pause;
        eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
        trackEvent.sendInternalEvent(this);
        io.odeeo.internal.o1.a aVar = this.f67939u;
        if (aVar != null) {
            aVar.pause(this.f67920b.getPlayer$odeeoSdk_release().getCurrentPosition());
        }
        if (this.f67937s) {
            h.f68087i.sendCustomEvent$odeeoSdk_release(this);
        } else if (pauseReason == AdUnit.StateChangeReason.ApplicationInBackground) {
            h.f68081c.sendCustomEvent$odeeoSdk_release(this);
        }
        AdActivity adActivity = this.f67922d;
        if (adActivity != null) {
            adActivity.onPause(pauseReason);
        }
        this.f67940v = SystemClock.elapsedRealtime();
        this.f67930l = true;
    }

    public final void pauseWhenReady$odeeoSdk_release(AdUnit.StateChangeReason pauseReason) {
        e0.checkNotNullParameter(pauseReason, "pauseReason");
        this.f67920b.setPausedWhenReady$odeeoSdk_release(true);
        pause(pauseReason);
    }

    public void play() {
        try {
            VastProperties vProps = f() ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.MIDROLL) : VastProperties.createVastPropertiesForSkippableMedia(io.odeeo.internal.d1.i.f63676a.m4588getPlacementConfig00XPtyU(c()).getActionDelayMs(), true, Position.MIDROLL);
            this.f67926h.start();
            io.odeeo.internal.a1.a aVar = this.f67926h;
            e0.checkNotNullExpressionValue(vProps, "vProps");
            aVar.loadedEvent(vProps);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(e10, e0.stringPlus("AdUnitBase -> play() ->EVENT_FAILED_WHILE_REGISTER_LOAD\n", e10.getMessage()), new Object[0]);
        }
        this.f67920b.play();
    }

    public final void releaseAudioAd$odeeoSdk_release() {
        this.f67920b.destroy();
    }

    public void resume(AdUnit.StateChangeReason resumeReason) {
        e0.checkNotNullParameter(resumeReason, "resumeReason");
        if (this.f67920b.isPauseWhenReady$odeeoSdk_release()) {
            if (this.f67920b.resumePlayer$odeeoSdk_release()) {
                this.f67921c.resume$odeeoSdk_release();
                this.f67920b.startTimer$odeeoSdk_release();
            }
            if (resumeReason == AdUnit.StateChangeReason.AdUncovered) {
                resumeInternal$odeeoSdk_release(resumeReason);
            }
        } else {
            resumeInternal$odeeoSdk_release(resumeReason);
            this.f67920b.resumePlayer$odeeoSdk_release();
        }
        this.f67921c.setButtonsClickable(true);
        this.f67920b.setPauseWhenReady$odeeoSdk_release(false);
    }

    public final void resumeInternal$odeeoSdk_release(AdUnit.StateChangeReason resumeReason) {
        e0.checkNotNullParameter(resumeReason, "resumeReason");
        boolean zIsResumeAllowedFor = a.f67998a.isResumeAllowedFor(getAdUnitType());
        if (this.f67930l && zIsResumeAllowedFor) {
            io.odeeo.internal.w1.i iVar = this.f67941w;
            if (iVar == null ? false : e0.areEqual(iVar.isShowing(), Boolean.TRUE)) {
                return;
            }
            this.f67921c.resume$odeeoSdk_release();
            this.f67926h.resumeMediaEvent();
            io.odeeo.internal.o1.e eVar = this.f67927i;
            io.odeeo.internal.z0.f fVar = this.f67919a;
            TrackEvent trackEvent = TrackEvent.Resume;
            eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
            trackEvent.sendInternalEvent(this);
            if (this.f67937s) {
                h.f68088j.sendCustomEvent$odeeoSdk_release(this);
                this.f67937s = false;
            } else if (resumeReason == AdUnit.StateChangeReason.ApplicationInForeground) {
                h.f68082d.sendCustomEvent$odeeoSdk_release(this);
            }
            AdActivity adActivity = this.f67922d;
            if (adActivity != null) {
                adActivity.onResume(resumeReason);
            }
            if (e()) {
                finishWithError(new io.odeeo.internal.b1.e(AdUnit.ERROR_PAUSE_EXPIRED, null));
            }
            this.f67930l = false;
        }
    }

    public final void setAdPausedTime$odeeoSdk_release(long j10) {
        this.f67940v = j10;
    }

    public final void setCoroutineScope$odeeoSdk_release(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f67942x = coroutineScope;
    }

    public final void setIsAudioFocused$odeeoSdk_release(boolean z10) {
        this.f67920b.setAudioFocused$odeeoSdk_release(z10);
    }

    public final void setPaused$odeeoSdk_release(boolean z10) {
        this.f67930l = z10;
    }

    public final void setPopUp$odeeoSdk_release(io.odeeo.internal.w1.i iVar) {
        e0.checkNotNullParameter(iVar, "<set-?>");
        this.f67941w = iVar;
    }

    public final void setPopupWindow$odeeoSdk_release(PopupWindow popupWindow) {
        this.f67931m = popupWindow;
    }

    public final void setRootViewChecker$odeeoSdk_release(io.odeeo.internal.w1.j jVar) {
        this.f67943y = jVar;
    }

    public final void setStart$odeeoSdk_release(boolean z10) {
        this.f67932n = z10;
    }

    public final void setVisualizationColor(int i10, int i11, int i12) {
        this.f67921c.setVisualizationColor(i10, i11, i12);
    }

    public void timerTick$odeeoSdk_release(int i10) {
        if (this.f67920b.isStartedPlaying$odeeoSdk_release()) {
            this.f67921c.timerTick(i10, this.f67920b.getPlayer$odeeoSdk_release().getDuration());
            boolean z10 = ((float) this.f67920b.getPlayer$odeeoSdk_release().getCurrentPosition()) >= this.f67921c.getActionButtonDelayMillis$odeeoSdk_release();
            checkMuteButtonState$odeeoSdk_release(z10);
            checkSkipButtonState$odeeoSdk_release(z10);
            if (!this.f67932n && i10 >= 0) {
                this.f67932n = true;
                this.f67939u = new io.odeeo.internal.o1.a();
                OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
                ImpressionData impressionData = new ImpressionData(getAdUnitType(), c(), odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getSessionID$odeeoSdk_release(), odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo().getCountry$odeeoSdk_release(), this.f67925g, this.f67919a.getAdInfo().getPricing$odeeoSdk_release() / 1000.0d, null, 64, null);
                AdActivity adActivity = this.f67922d;
                if (adActivity != null) {
                    adActivity.onImpression(impressionData);
                }
                AdActivity adActivity2 = this.f67922d;
                if (adActivity2 != null) {
                    adActivity2.onShow();
                }
                io.odeeo.internal.o1.e eVar = this.f67927i;
                io.odeeo.internal.z0.f fVar = this.f67919a;
                TrackEvent trackEvent = TrackEvent.CreativeView;
                eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
                io.odeeo.internal.o1.e eVar2 = this.f67927i;
                io.odeeo.internal.z0.f fVar2 = this.f67919a;
                TrackEvent trackEvent2 = TrackEvent.Start;
                eVar2.sendExternalTrackingEvents(fVar2.getExternalEventUrl(trackEvent2));
                trackEvent2.sendInternalEvent(this);
                trackEvent.sendInternalEvent(this);
                h.f68098t.sendCustomEvent$odeeoSdk_release(this);
                this.f67926h.startMediaEvent(this.f67920b.getPlayer$odeeoSdk_release().getDuration(), ((int) this.f67920b.getDeviceVolumePercent()) > 0 ? 1.0f : 0.0f);
                this.f67927i.sendExternalTrackingEvents(this.f67919a.getAdInfo().getImpressionTrackingUrls$odeeoSdk_release());
                TrackEvent.Impression.sendInternalEvent(this);
                this.f67926h.impressionOccurred();
            }
            if (!this.f67933o && i10 >= 25) {
                this.f67933o = true;
                io.odeeo.internal.o1.e eVar3 = this.f67927i;
                io.odeeo.internal.z0.f fVar3 = this.f67919a;
                TrackEvent trackEvent3 = TrackEvent.FirstQuartile;
                eVar3.sendExternalTrackingEvents(fVar3.getExternalEventUrl(trackEvent3));
                trackEvent3.sendInternalEvent(this);
                h.f68098t.sendCustomEvent$odeeoSdk_release(this);
                this.f67926h.firstQuartileMediaEvent();
            }
            if (!this.f67934p && i10 >= 50) {
                this.f67934p = true;
                io.odeeo.internal.o1.e eVar4 = this.f67927i;
                io.odeeo.internal.z0.f fVar4 = this.f67919a;
                TrackEvent trackEvent4 = TrackEvent.MidPoint;
                eVar4.sendExternalTrackingEvents(fVar4.getExternalEventUrl(trackEvent4));
                trackEvent4.sendInternalEvent(this);
                h.f68098t.sendCustomEvent$odeeoSdk_release(this);
                this.f67926h.midpointMediaEvent();
            }
            if (!this.f67935q && i10 >= 75) {
                this.f67935q = true;
                io.odeeo.internal.o1.e eVar5 = this.f67927i;
                io.odeeo.internal.z0.f fVar5 = this.f67919a;
                TrackEvent trackEvent5 = TrackEvent.ThirdQuartile;
                eVar5.sendExternalTrackingEvents(fVar5.getExternalEventUrl(trackEvent5));
                trackEvent5.sendInternalEvent(this);
                h.f68098t.sendCustomEvent$odeeoSdk_release(this);
                this.f67926h.thirdQuartileMediaEvent();
            }
            if (!this.f67936r && f() && a(this.f67921c.getRewardedData$odeeoSdk_release().getType())) {
                this.f67936r = true;
                AdActivity adActivity3 = this.f67922d;
                if (adActivity3 != null) {
                    adActivity3.onReward(this.f67921c.getRewardedData$odeeoSdk_release().getAmount());
                }
                h.f68095q.sendCustomEvent$odeeoSdk_release(this);
            }
            g();
        }
    }

    public final void trackOmidSessionInitializationErrors$odeeoSdk_release() {
        if (!this.f67926h.isPartnerCreated()) {
            io.odeeo.internal.b2.a.w("EVENT_FAILED_TO_INIT_OMID_ODEEO_IOPARTNER", new Object[0]);
        }
        if (this.f67926h.isOmidJSEmpty()) {
            io.odeeo.internal.b2.a.w("EVENT_SCRIPT_IS_NULL", new Object[0]);
        }
        if (!this.f67926h.isAdSessionContextInitialized()) {
            io.odeeo.internal.b2.a.w("EVENT_FAILED_WHILE_CREATE_CONTEXT", new Object[0]);
        }
        if (!this.f67926h.isAdSessionConfigurationInitialized()) {
            io.odeeo.internal.b2.a.w("EVENT_FAILED_WHILE_CONFIGURE", new Object[0]);
        }
        if (!this.f67926h.isAdSessionInitialized()) {
            io.odeeo.internal.b2.a.w("EVENT_FAILED_WHILE_CREATE_SESSION", new Object[0]);
        }
        if (!this.f67926h.isAdEventsInitialized()) {
            io.odeeo.internal.b2.a.w("EVENT_FAILED_WHILE_CREATE_ADEVENTS", new Object[0]);
        }
        if (this.f67926h.isMediaEventsInitialized()) {
            return;
        }
        io.odeeo.internal.b2.a.w("EVENT_FAILED_WHILE_CREATE_MEDIA_EVENTS", new Object[0]);
    }

    public AdUnitBase(io.odeeo.internal.z0.f fVar, c cVar, io.odeeo.internal.w1.c cVar2, AdActivity adActivity, View view, String str, String str2, io.odeeo.internal.a1.a aVar, io.odeeo.internal.o1.e eVar) {
        this.f67919a = fVar;
        this.f67920b = cVar;
        this.f67921c = cVar2;
        this.f67922d = adActivity;
        this.f67923e = view;
        this.f67924f = str;
        this.f67925g = str2;
        this.f67926h = aVar;
        this.f67927i = eVar;
        if (!io.odeeo.internal.h1.a.m4591isPidValid00XPtyU(c())) {
            io.odeeo.internal.b2.a.w("PlacementID is empty or incorrect", new Object[0]);
        }
        this.f67938t = fVar.getInternalEventUrl();
        this.f67941w = new io.odeeo.internal.w1.i();
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(odeeoSDK.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()));
        this.f67942x = CoroutineScope;
        final int i10 = 0;
        u1 u1Var = new u1(this) { // from class: io.odeeo.sdk.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AdUnitBase f68177c;

            {
                this.f68177c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i10) {
                    case 0:
                        AdUnitBase.a(this.f68177c, (Integer) obj);
                        break;
                    case 1:
                        AdUnitBase.a(this.f68177c, (io.odeeo.internal.b1.g) obj);
                        break;
                    default:
                        AdUnitBase.a(this.f68177c, (Boolean) obj);
                        break;
                }
            }
        };
        this.f67944z = u1Var;
        final int i11 = 1;
        u1 u1Var2 = new u1(this) { // from class: io.odeeo.sdk.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AdUnitBase f68177c;

            {
                this.f68177c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i11) {
                    case 0:
                        AdUnitBase.a(this.f68177c, (Integer) obj);
                        break;
                    case 1:
                        AdUnitBase.a(this.f68177c, (io.odeeo.internal.b1.g) obj);
                        break;
                    default:
                        AdUnitBase.a(this.f68177c, (Boolean) obj);
                        break;
                }
            }
        };
        this.A = u1Var2;
        final int i12 = 2;
        u1 u1Var3 = new u1(this) { // from class: io.odeeo.sdk.p

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AdUnitBase f68177c;

            {
                this.f68177c = this;
            }

            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        AdUnitBase.a(this.f68177c, (Integer) obj);
                        break;
                    case 1:
                        AdUnitBase.a(this.f68177c, (io.odeeo.internal.b1.g) obj);
                        break;
                    default:
                        AdUnitBase.a(this.f68177c, (Boolean) obj);
                        break;
                }
            }
        };
        this.B = u1Var3;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        b1 b1Var = fVar.getLifecycleOwner().get();
        if (b1Var != null) {
            fVar.getTimerTick().observe(b1Var, u1Var);
            io.odeeo.internal.v1.c.distinctUntilChanged(fVar.getPlayerState()).observe(b1Var, u1Var2);
        }
        if (f()) {
            b1 b1Var2 = fVar.getLifecycleOwner().get();
            if (b1Var2 != null) {
                fVar.getVolumeCheckState().observe(b1Var2, u1Var3);
            }
            cVar2.getData$odeeoSdk_release().setActionType(AdUnit.ActionButtonType.None);
        }
        cVar2.setSetMuteEnabled$odeeoSdk_release(new AnonymousClass4());
        cVar2.setFinishWithError$odeeoSdk_release(new AnonymousClass5());
        this.f67941w.setDismissed$odeeoSdk_release(new AnonymousClass6());
        if (odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getAppConfig().getMoatEnabled()) {
            initializeVerifications$odeeoSdk_release();
        }
    }

    public static final void a(AdUnitBase this$0, io.odeeo.internal.b1.g gVar) {
        e0.checkNotNullParameter(this$0, "this$0");
        int i10 = WhenMappings.$EnumSwitchMapping$0[gVar.getState().ordinal()];
        if (i10 == 1) {
            this$0.finishWithSuccess();
            return;
        }
        if (i10 == 2) {
            Object stateData = gVar.getStateData();
            if (stateData != null) {
                this$0.finishWithError((io.odeeo.internal.b1.e) stateData);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type io.odeeo.sdk.audio.PlayerErrorData");
        }
        if (i10 == 3) {
            this$0.f67926h.bufferFinishMediaEvent();
        } else {
            if (i10 != 4) {
                return;
            }
            this$0.f67926h.bufferStartMediaEvent();
        }
    }

    public static final void a(AdUnitBase this$0, Boolean isLowVolume) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullExpressionValue(isLowVolume, "isLowVolume");
        if (isLowVolume.booleanValue()) {
            if (this$0.f67920b.setRewardedVolumeIfNeeded$odeeoSdk_release()) {
                return;
            }
            if (e0.areEqual(this$0.f67941w.isShowing(), Boolean.FALSE)) {
                AdActivity adActivity = this$0.f67922d;
                if (adActivity != null) {
                    adActivity.onRewardedPopupAppear();
                }
                this$0.f67920b.pausePlayer$odeeoSdk_release();
                this$0.f67921c.pause$odeeoSdk_release();
                this$0.f67920b.setPopupShown$odeeoSdk_release(true);
                io.odeeo.internal.w1.i iVar = this$0.f67941w;
                boolean z10 = this$0.f67936r;
                io.odeeo.internal.w1.c cVar = this$0.f67921c;
                View view = this$0.f67923e;
                AdUnit.Companion companion = AdUnit.Companion;
                AdPosition position = cVar.getRewardedData$odeeoSdk_release().getPosition();
                if (position == null) {
                    position = this$0.f67921c.getData$odeeoSdk_release().getPos();
                }
                iVar.show(z10, cVar, view, companion.positionToGravity(position));
                if (this$0.f67920b.isStartedPlaying$odeeoSdk_release()) {
                    AdActivity adActivity2 = this$0.f67922d;
                    if (adActivity2 != null) {
                        adActivity2.onPause(AdUnit.StateChangeReason.RewardedVolumeMinimum);
                    }
                    h.f68083e.sendCustomEvent$odeeoSdk_release(this$0);
                    io.odeeo.internal.o1.e eVar = this$0.f67927i;
                    io.odeeo.internal.z0.f fVar = this$0.f67919a;
                    TrackEvent trackEvent = TrackEvent.Pause;
                    eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
                    trackEvent.sendInternalEvent(this$0);
                } else if (this$0.f()) {
                    this$0.f67920b.setPausedWhenReady$odeeoSdk_release(true);
                    this$0.f67920b.startTimer$odeeoSdk_release();
                }
                this$0.f67930l = true;
            }
            io.odeeo.internal.o1.a aVar = this$0.f67939u;
            if (aVar == null) {
                return;
            }
            aVar.pause(this$0.f67920b.getPlayer$odeeoSdk_release().getCurrentPosition());
            return;
        }
        if (isLowVolume.booleanValue()) {
            return;
        }
        if (e0.areEqual(this$0.f67941w.isShowing(), Boolean.TRUE)) {
            this$0.f67941w.getOnClose().invoke();
            if (!this$0.isCurrentlyCovered$odeeoSdk_release()) {
                this$0.f67921c.resume$odeeoSdk_release();
                this$0.f67920b.resumePlayer$odeeoSdk_release();
                this$0.f67930l = false;
            }
        }
        this$0.f67921c.setVisibility(0);
    }

    public /* synthetic */ AdUnitBase(io.odeeo.internal.z0.f fVar, c cVar, io.odeeo.internal.w1.c cVar2, AdActivity adActivity, View view, String str, String str2, io.odeeo.internal.a1.a aVar, io.odeeo.internal.o1.e eVar, int i10, u uVar) {
        this(fVar, cVar, cVar2, adActivity, view, str, str2, (i10 & 128) != 0 ? new io.odeeo.internal.a1.a() : aVar, eVar, null);
    }

    public final void a() {
        CoroutineScopeKt.cancel$default(this.f67942x, null, 1, null);
        io.odeeo.internal.z0.f fVar = this.f67919a;
        b1 b1Var = fVar.getLifecycleOwner().get();
        if (b1Var != null) {
            fVar.getPlayerState().removeObservers(b1Var);
        }
        fVar.getTimerTick().removeObserver(this.f67944z);
        this.f67920b.stopTimer$odeeoSdk_release();
        fVar.getVolumeCheckState().removeObserver(this.B);
        io.odeeo.internal.w1.j jVar = this.f67943y;
        if (jVar == null) {
            return;
        }
        jVar.stopListeningForNewRootViews();
    }

    public final void a(kv.l lVar) {
        io.odeeo.internal.o1.e eVar = this.f67927i;
        String str = this.f67938t;
        io.odeeo.internal.o1.c cVar = new io.odeeo.internal.o1.c(null, null, null, null, null, null, null, null, null, 0L, null, 2047, null);
        lVar.invoke(cVar);
        io.odeeo.internal.o1.e.sendInternalTrackingEvent$default(eVar, new io.odeeo.internal.o1.b(str, cVar), null, 2, null);
    }

    public final boolean a(AdUnit.RewardType rewardType) {
        return this.f67920b.isStartedPlaying$odeeoSdk_release() && this.f67920b.getPlayer$odeeoSdk_release().getCurrentPosition() >= ((long) OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getRewardLevelTimeMS(rewardType));
    }

    public final void a(boolean z10) {
        this.f67920b.muteEnabled(z10);
        this.f67921c.setMuteButtonEnabled(z10);
        if (z10) {
            c.rememberVolumeLevel$odeeoSdk_release$default(this.f67920b, 0, 1, null);
            this.f67926h.volumeChangeMediaEvent(1.0f);
            io.odeeo.internal.o1.e eVar = this.f67927i;
            io.odeeo.internal.z0.f fVar = this.f67919a;
            TrackEvent trackEvent = TrackEvent.Mute;
            eVar.sendExternalTrackingEvents(fVar.getExternalEventUrl(trackEvent));
            trackEvent.sendInternalEvent(this);
            return;
        }
        this.f67920b.setMinimumVolumeIfRestoreZero$odeeoSdk_release();
        this.f67926h.volumeChangeMediaEvent(0.0f);
        io.odeeo.internal.o1.e eVar2 = this.f67927i;
        io.odeeo.internal.z0.f fVar2 = this.f67919a;
        TrackEvent trackEvent2 = TrackEvent.UnMute;
        eVar2.sendExternalTrackingEvents(fVar2.getExternalEventUrl(trackEvent2));
        trackEvent2.sendInternalEvent(this);
    }
}
