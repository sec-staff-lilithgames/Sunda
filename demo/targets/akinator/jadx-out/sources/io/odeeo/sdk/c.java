package io.odeeo.sdk;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.b1;
import androidx.lifecycle.u1;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.w0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f68033u = {com.google.android.gms.internal.play_billing.a.n(c.class, "isApplicationInBackground", "isApplicationInBackground$odeeoSdk_release()Z", 0), com.google.android.gms.internal.play_billing.a.n(c.class, "isPauseWhenReady", "isPauseWhenReady$odeeoSdk_release()Z", 0), com.google.android.gms.internal.play_billing.a.n(c.class, "wasAudioFocusLossTransient", "getWasAudioFocusLossTransient$odeeoSdk_release()Z", 0), com.google.android.gms.internal.play_billing.a.n(c.class, "isAudibilityCurrentlyEnforced", "isAudibilityCurrentlyEnforced$odeeoSdk_release()Z", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.b1.c f68034a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.z0.f f68035b;

    /* renamed from: c, reason: collision with root package name */
    public final i f68036c;

    /* renamed from: d, reason: collision with root package name */
    public final AdActivity f68037d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.o1.e f68038e;

    /* renamed from: f, reason: collision with root package name */
    public final AdUnit.PlacementType f68039f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68040g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68041h;

    /* renamed from: i, reason: collision with root package name */
    public final kv.a f68042i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f68043j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f68044k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f68045l;

    /* renamed from: m, reason: collision with root package name */
    public final io.odeeo.internal.v1.a f68046m;

    /* renamed from: n, reason: collision with root package name */
    public final io.odeeo.internal.v1.a f68047n;

    /* renamed from: o, reason: collision with root package name */
    public final io.odeeo.internal.v1.a f68048o;

    /* renamed from: p, reason: collision with root package name */
    public final io.odeeo.internal.v1.a f68049p;

    /* renamed from: q, reason: collision with root package name */
    public final CoroutineScope f68050q;

    /* renamed from: r, reason: collision with root package name */
    public final u1 f68051r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f68052s;

    /* renamed from: t, reason: collision with root package name */
    public Job f68053t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AudioAd$1", f = "AudioAd.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f68054a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.sdk.c$a$a, reason: collision with other inner class name */
        public static final class C0701a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f68056a;

            public C0701a(c cVar) {
                this.f68056a = cVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit((io.odeeo.internal.z0.a) obj, (zu.d<? super x0>) dVar);
            }

            public final Object emit(io.odeeo.internal.z0.a aVar, zu.d<? super x0> dVar) {
                this.f68056a.handleLifecycleState$odeeoSdk_release(aVar);
                return x0.f87415a;
            }
        }

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f68054a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow<io.odeeo.internal.z0.a> lifecycleState = c.this.getViewModel$odeeoSdk_release().getLifecycleState();
                C0701a c0701a = new C0701a(c.this);
                this.f68054a = 1;
                if (lifecycleState.collect(c0701a, this) == coroutine_suspended) {
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
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68057a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68058b;

        static {
            int[] iArr = new int[io.odeeo.internal.b1.f.values().length];
            iArr[io.odeeo.internal.b1.f.Ready.ordinal()] = 1;
            f68057a = iArr;
            int[] iArr2 = new int[io.odeeo.internal.z0.a.values().length];
            iArr2[io.odeeo.internal.z0.a.OnPaused.ordinal()] = 1;
            iArr2[io.odeeo.internal.z0.a.OnResumed.ordinal()] = 2;
            f68058b = iArr2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AudioAd$startTimer$1", f = "AudioAd.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.sdk.c$c, reason: collision with other inner class name */
    public static final class C0702c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f68059a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68060b;

        public C0702c(zu.d<? super C0702c> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C0702c c0702c = c.this.new C0702c(dVar);
            c0702c.f68060b = obj;
            return c0702c;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f68059a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f68060b;
                c cVar = c.this;
                this.f68059a = 1;
                if (cVar.a(coroutineScope, this) == coroutine_suspended) {
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
            return ((C0702c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AudioAd", f = "AudioAd.kt", i = {0, 0, 0, 1, 1, 1}, l = {328, 337}, m = "startTimerInternal", n = {"this", "$this$startTimerInternal", "lastPostedValue", "this", "$this$startTimerInternal", "lastPostedValue"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class d extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f68062a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68063b;

        /* renamed from: c, reason: collision with root package name */
        public Object f68064c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f68065d;

        /* renamed from: f, reason: collision with root package name */
        public int f68067f;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f68065d = obj;
            this.f68067f |= Integer.MIN_VALUE;
            return c.this.a((CoroutineScope) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.AudioAd$startTimerInternal$total$1", f = "AudioAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f68068a;

        public e(zu.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new e(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f68068a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return bv.b.boxDouble((c.this.getPlayer$odeeoSdk_release().getCurrentPosition() / c.this.getPlayer$odeeoSdk_release().getDuration()) * 100.0d);
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Double> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public c(io.odeeo.internal.b1.c player, io.odeeo.internal.z0.f viewModel, i odeeoAudioManager, AdActivity adActivity, io.odeeo.internal.o1.e eventTrackingManager, AdUnit.PlacementType adRequestType, boolean z10, int i10, kv.a checkIsCovered) {
        e0.checkNotNullParameter(player, "player");
        e0.checkNotNullParameter(viewModel, "viewModel");
        e0.checkNotNullParameter(odeeoAudioManager, "odeeoAudioManager");
        e0.checkNotNullParameter(eventTrackingManager, "eventTrackingManager");
        e0.checkNotNullParameter(adRequestType, "adRequestType");
        e0.checkNotNullParameter(checkIsCovered, "checkIsCovered");
        this.f68034a = player;
        this.f68035b = viewModel;
        this.f68036c = odeeoAudioManager;
        this.f68037d = adActivity;
        this.f68038e = eventTrackingManager;
        this.f68039f = adRequestType;
        this.f68040g = z10;
        this.f68041h = i10;
        this.f68042i = checkIsCovered;
        this.f68043j = new Handler(Looper.getMainLooper());
        this.f68046m = new io.odeeo.internal.v1.a(false);
        this.f68047n = new io.odeeo.internal.v1.a(false);
        this.f68048o = new io.odeeo.internal.v1.a(false);
        this.f68049p = new io.odeeo.internal.v1.a(false);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(OdeeoSDK.INSTANCE.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()));
        this.f68050q = CoroutineScope;
        final int i11 = 0;
        this.f68051r = new u1() { // from class: io.odeeo.sdk.q
            @Override // androidx.lifecycle.u1
            public final void onChanged(Object obj) {
                switch (i11) {
                    case 0:
                        c.a(this, (io.odeeo.internal.b1.g) obj);
                        break;
                    default:
                        c.a(this, (Integer) obj);
                        break;
                }
            }
        };
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
        b1 b1Var = viewModel.getLifecycleOwner().get();
        if (b1Var != null) {
            io.odeeo.internal.v1.c.distinctUntilChanged(getViewModel$odeeoSdk_release().getPlayerState()).observe(b1Var, getPlayerStateDataObserver$odeeoSdk_release());
            final w0 w0Var = new w0();
            w0Var.f71863b = getOdeeoAudioManager$odeeoSdk_release().getVolumeChangeEvents$odeeoSdk_release().getValue() != null;
            getOdeeoAudioManager$odeeoSdk_release().getVolumeChangeEvents$odeeoSdk_release().observe(b1Var, new u1() { // from class: io.odeeo.sdk.s
                @Override // androidx.lifecycle.u1
                public final void onChanged(Object obj) {
                    c.a(w0Var, this, (i.a) obj);
                }
            });
            final int i12 = 1;
            getOdeeoAudioManager$odeeoSdk_release().getFocusChangeEvents$odeeoSdk_release().observe(b1Var, new u1() { // from class: io.odeeo.sdk.q
                @Override // androidx.lifecycle.u1
                public final void onChanged(Object obj) {
                    switch (i12) {
                        case 0:
                            c.a(this, (io.odeeo.internal.b1.g) obj);
                            break;
                        default:
                            c.a(this, (Integer) obj);
                            break;
                    }
                }
            });
        }
        odeeoAudioManager.requestAudioFocus$odeeoSdk_release();
        if (adRequestType.isPlainAd()) {
            odeeoAudioManager.setMuteEnabled(false);
        }
    }

    public static final void a(c this$0, io.odeeo.internal.b1.g gVar) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (b.f68057a[gVar.getState().ordinal()] != 1 || this$0.isPauseWhenReady$odeeoSdk_release()) {
            return;
        }
        this$0.c();
    }

    public static /* synthetic */ boolean isVolumeLowerThanMinimum$odeeoSdk_release$default(c cVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = cVar.getDeviceVolumePercent();
        }
        return cVar.isVolumeLowerThanMinimum$odeeoSdk_release(f10);
    }

    public static /* synthetic */ void rememberVolumeLevel$odeeoSdk_release$default(c cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        cVar.rememberVolumeLevel$odeeoSdk_release(i10);
    }

    public final void abandonAudioFocus() {
        this.f68036c.abandonAudioFocus$odeeoSdk_release();
    }

    public final void attachPlayerEventListener$odeeoSdk_release() {
        this.f68034a.attachPlayerEventListener();
    }

    public final void b() {
        setApplicationInBackground$odeeoSdk_release(false);
        startTimer$odeeoSdk_release();
        requestAudioFocusIfNotMuted$odeeoSdk_release();
        boolean zIsResumeAllowedFor = io.odeeo.sdk.a.f67998a.isResumeAllowedFor(this.f68039f);
        Boolean boolValueOf = isRewardedAd$odeeoSdk_release() ? Boolean.valueOf(isVolumeLowerThanMinimum$odeeoSdk_release$default(this, 0.0f, 1, null)) : null;
        boolean zBooleanValue = boolValueOf == null ? false : boolValueOf.booleanValue();
        boolean z10 = !isVolumeLowerThanMinimum$odeeoSdk_release(((this.f68044k != null ? r4.intValue() : 0) * 100) / this.f68036c.getStreamMaxVolume());
        if (zBooleanValue) {
            this.f68034a.attachPlayerEventListener();
            checkEdgeCasesForLowLevelPopUp$odeeoSdk_release(z10);
            return;
        }
        this.f68034a.refreshPlayerState();
        if (this.f68034a.isPlaying() || !zIsResumeAllowedFor) {
            return;
        }
        if (this.f68036c.isAudioFocused$odeeoSdk_release() || isMuteEnabled()) {
            this.f68034a.play(isApplicationInBackground$odeeoSdk_release());
            checkIsVolumeReachedMinimum$odeeoSdk_release(getDeviceVolumePercent());
        }
    }

    public final void c() {
        requestAudioFocusIfNotMuted$odeeoSdk_release();
        this.f68034a.play(isApplicationInBackground$odeeoSdk_release());
        showLowVolumePopupOrSetVolumeAutomatically$odeeoSdk_release();
        startTimer$odeeoSdk_release();
    }

    public final void cancelActiveJob$odeeoSdk_release() {
        Job job = this.f68053t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f68053t = null;
    }

    public final void checkEdgeCasesForLowLevelPopUp$odeeoSdk_release(boolean z10) {
        if (this.f68052s) {
            return;
        }
        if (z10) {
            checkIsVolumeReachedMinimum$odeeoSdk_release(getDeviceVolumePercent());
        } else {
            showLowVolumePopupOrSetVolumeAutomatically$odeeoSdk_release();
        }
    }

    public final void checkIsVolumeReachedMinimum$odeeoSdk_release(float f10) {
        this.f68035b.getVolumeCheckState().setValue(Boolean.valueOf(isVolumeLowerThanMinimum$odeeoSdk_release(f10)));
    }

    public final CoroutineScope createNewTimerCoroutineScope$odeeoSdk_release(Job job) {
        e0.checkNotNullParameter(job, "job");
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(job));
    }

    public final void destroy() {
        CoroutineScopeKt.cancel$default(this.f68050q, null, 1, null);
    }

    public final void enforceVolumeIfNeeded$odeeoSdk_release() {
        if (this.f68036c.getAudioManagerStreamVolume$odeeoSdk_release() == 0 && !this.f68039f.isRewardedAd() && this.f68040g) {
            setVolumeToPercentLevel(this.f68041h);
            setAudibilityCurrentlyEnforced$odeeoSdk_release(true);
        }
    }

    public final Job getCoroutineJob$odeeoSdk_release() {
        return this.f68053t;
    }

    public final float getDeviceVolumePercent() {
        return io.odeeo.internal.v1.h.roundTwo(i.getDeviceVolumePercent$default(this.f68036c, 0, 1, null));
    }

    public final Handler getHandler$odeeoSdk_release() {
        return this.f68043j;
    }

    public final i getOdeeoAudioManager$odeeoSdk_release() {
        return this.f68036c;
    }

    public final io.odeeo.internal.b1.c getPlayer$odeeoSdk_release() {
        return this.f68034a;
    }

    public final u1 getPlayerStateDataObserver$odeeoSdk_release() {
        return this.f68051r;
    }

    public final Integer getRememberedVolumeLevel$odeeoSdk_release() {
        return this.f68044k;
    }

    public final io.odeeo.internal.z0.f getViewModel$odeeoSdk_release() {
        return this.f68035b;
    }

    public final boolean getWasAudioFocusLossTransient$odeeoSdk_release() {
        return this.f68048o.getValue(this, f68033u[2]);
    }

    public final boolean getWasMinimumVolumeSetPriorToPlay$odeeoSdk_release() {
        return this.f68045l;
    }

    public final void handleLifecycleState$odeeoSdk_release(io.odeeo.internal.z0.a aVar) {
        io.odeeo.internal.b2.a.d(e0.stringPlus("lifecycleActivityStateObserver ", aVar), new Object[0]);
        int i10 = aVar == null ? -1 : b.f68058b[aVar.ordinal()];
        if (i10 == 1) {
            a();
        } else {
            if (i10 != 2) {
                return;
            }
            b();
        }
    }

    public final boolean isApplicationInBackground$odeeoSdk_release() {
        return this.f68046m.getValue(this, f68033u[0]);
    }

    public final boolean isAudibilityCurrentlyEnforced$odeeoSdk_release() {
        return this.f68049p.getValue(this, f68033u[3]);
    }

    public final boolean isAudioFocused$odeeoSdk_release() {
        return this.f68036c.isAudioFocused$odeeoSdk_release();
    }

    public final boolean isMuteEnabled() {
        return this.f68036c.isMuteEnabled();
    }

    public final boolean isPauseWhenReady$odeeoSdk_release() {
        return this.f68047n.getValue(this, f68033u[1]);
    }

    public final boolean isPlaying() {
        return this.f68034a.isPlaying();
    }

    public final boolean isPopupShown$odeeoSdk_release() {
        return this.f68052s;
    }

    public final boolean isResumeAllowForPlayer$odeeoSdk_release() {
        return ((isRewardedAd$odeeoSdk_release() && isVolumeLowerThanMinimum$odeeoSdk_release$default(this, 0.0f, 1, null)) || ((Boolean) this.f68042i.invoke()).booleanValue() || this.f68034a.isPlaying() || isApplicationInBackground$odeeoSdk_release() || !this.f68036c.isAudioFocused$odeeoSdk_release()) ? false : true;
    }

    public final boolean isRewardedAd$odeeoSdk_release() {
        return this.f68035b.getVolumeCheckState().hasActiveObservers();
    }

    public final boolean isStartedPlaying$odeeoSdk_release() {
        return this.f68034a.getCurrentPosition() > 0;
    }

    public final boolean isVolumeLowerThanMinimum$odeeoSdk_release(float f10) {
        return f10 < ((float) OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardMinVolumeLevel());
    }

    public final void muteEnabled(boolean z10) {
        this.f68036c.setMuteEnabled(z10);
        refreshVolume$odeeoSdk_release();
    }

    public final void onAudioFocusChange$odeeoSdk_release(int i10) {
        io.odeeo.internal.b2.a.d(e0.stringPlus("onAudioFocusChange focusChange: ", Integer.valueOf(i10)), new Object[0]);
        this.f68043j.post(new com.applovin.impl.adview.p(i10, this, 5));
    }

    public final void onAudioVolumeChanged$odeeoSdk_release(i.a volumeChangeEvent) {
        e0.checkNotNullParameter(volumeChangeEvent, "volumeChangeEvent");
        checkIsVolumeReachedMinimum$odeeoSdk_release(getDeviceVolumePercent());
        if (volumeChangeEvent.isVolumeChangedByUser()) {
            a(h.f68089k);
            rememberVolumeLevel$odeeoSdk_release$default(this, 0, 1, null);
            if (isPlaying()) {
                OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getSessionManager().setWasMinimumVolumeLevelSetByUserInCurrentSession(false);
            }
        }
    }

    public final void pausePlayer$odeeoSdk_release() {
        this.f68034a.pause(isApplicationInBackground$odeeoSdk_release());
    }

    public final void play() {
        if (this.f68039f.isPlainAd() || !this.f68045l) {
            rememberVolumeLevel$odeeoSdk_release$default(this, 0, 1, null);
            this.f68045l = false;
        }
        enforceVolumeIfNeeded$odeeoSdk_release();
        this.f68034a.prepare();
    }

    public final void refreshVolume$odeeoSdk_release() {
        if (this.f68036c.isMuteEnabled()) {
            this.f68034a.setVolume(0.0f);
        } else {
            this.f68034a.setVolume(1.0f);
        }
    }

    public final void rememberVolumeLevel$odeeoSdk_release(int i10) {
        this.f68044k = Integer.valueOf(Math.max(i10, this.f68036c.getAudioManagerStreamVolume$odeeoSdk_release()));
    }

    public final void requestAudioFocusIfNotMuted$odeeoSdk_release() {
        if (!isMuteEnabled() || this.f68039f.isRewardedAd()) {
            this.f68036c.requestAudioFocus$odeeoSdk_release();
        }
    }

    public final void restoreVolumeLevelIfNeeded$odeeoSdk_release() {
        Integer num;
        if ((this.f68039f.isRewardedAd() || isAudibilityCurrentlyEnforced$odeeoSdk_release()) && (num = this.f68044k) != null) {
            int iIntValue = num.intValue();
            this.f68036c.setLastLogicChangedVolume$odeeoSdk_release(iIntValue);
            this.f68036c.setVolumeToRawLevel(iIntValue);
            setAudibilityCurrentlyEnforced$odeeoSdk_release(false);
            a(h.f68089k);
        }
    }

    public final boolean resumePlayer$odeeoSdk_release() {
        if (!isResumeAllowForPlayer$odeeoSdk_release() || !io.odeeo.sdk.a.f67998a.isResumeAllowedFor(this.f68039f)) {
            io.odeeo.internal.b2.a.d("resumePlayer return false", new Object[0]);
            return false;
        }
        requestAudioFocusIfNotMuted$odeeoSdk_release();
        this.f68034a.play(isApplicationInBackground$odeeoSdk_release());
        return true;
    }

    public final void setApplicationInBackground$odeeoSdk_release(boolean z10) {
        this.f68046m.setValue(this, f68033u[0], z10);
    }

    public final void setAudibilityCurrentlyEnforced$odeeoSdk_release(boolean z10) {
        this.f68049p.setValue(this, f68033u[3], z10);
    }

    public final void setAudioFocused$odeeoSdk_release(boolean z10) {
        this.f68036c.setAudioFocused$odeeoSdk_release(z10);
    }

    public final void setCoroutineJob$odeeoSdk_release(Job job) {
        this.f68053t = job;
    }

    public final void setHandler$odeeoSdk_release(Handler handler) {
        e0.checkNotNullParameter(handler, "<set-?>");
        this.f68043j = handler;
    }

    public final void setMinimRewardVolumeLevel() {
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().setWasMinimumVolumeLevelSetByUserInCurrentSession(true);
        setVolumeToPercentLevel(odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardMinVolumeLevel());
    }

    public final void setMinimumVolumeIfRestoreZero$odeeoSdk_release() {
        if (this.f68036c.getAudioManagerStreamVolume$odeeoSdk_release() == 0 && this.f68044k == null) {
            this.f68036c.setVolumeToPercentLevel(OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardMinVolumeLevel());
        }
    }

    public final void setPauseWhenReady$odeeoSdk_release(boolean z10) {
        this.f68047n.setValue(this, f68033u[1], z10);
    }

    public final void setPausedWhenReady$odeeoSdk_release(boolean z10) {
        setPauseWhenReady$odeeoSdk_release(z10);
    }

    public final void setPopupShown$odeeoSdk_release(boolean z10) {
        this.f68052s = z10;
    }

    public final void setRememberedVolumeLevel$odeeoSdk_release(Integer num) {
        this.f68044k = num;
    }

    public final boolean setRewardedVolumeIfNeeded$odeeoSdk_release() {
        float deviceVolumePercent = getDeviceVolumePercent();
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        if (deviceVolumePercent >= odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardMinVolumeLevel() || !isRewardedAd$odeeoSdk_release() || isStartedPlaying$odeeoSdk_release() || !odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getWasMinimumVolumeLevelSetByUserInCurrentSession()) {
            return false;
        }
        rememberVolumeLevel$odeeoSdk_release$default(this, 0, 1, null);
        this.f68036c.setVolumeToPercentLevel(odeeoSDK.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getRewardMinVolumeLevel());
        this.f68045l = true;
        return true;
    }

    public final void setVolumeToPercentLevel(int i10) {
        this.f68036c.setVolumeToPercentLevel(i10);
    }

    public final void setWasAudioFocusLossTransient$odeeoSdk_release(boolean z10) {
        this.f68048o.setValue(this, f68033u[2], z10);
    }

    public final void setWasMinimumVolumeSetPriorToPlay$odeeoSdk_release(boolean z10) {
        this.f68045l = z10;
    }

    public final void showLowVolumePopupOrSetVolumeAutomatically$odeeoSdk_release() {
        if (isVolumeLowerThanMinimum$odeeoSdk_release(getDeviceVolumePercent()) && isRewardedAd$odeeoSdk_release()) {
            io.odeeo.internal.b2.a.d("showLowVolumePopupOrSetVolumeAutomatically showPopup", new Object[0]);
            this.f68035b.getVolumeCheckState().setValue(Boolean.TRUE);
        }
    }

    public final void startTimer$odeeoSdk_release() {
        cancelActiveJob$odeeoSdk_release();
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.f68053t = completableJobJob$default;
        BuildersKt__Builders_commonKt.launch$default(createNewTimerCoroutineScope$odeeoSdk_release(completableJobJob$default), null, null, new C0702c(null), 3, null);
    }

    public final void stopAndRelease() {
        b1 b1Var = this.f68035b.getLifecycleOwner().get();
        if (b1Var != null) {
            getViewModel$odeeoSdk_release().getPlayerState().removeObserver(getPlayerStateDataObserver$odeeoSdk_release());
            getOdeeoAudioManager$odeeoSdk_release().getVolumeChangeEvents$odeeoSdk_release().removeObservers(b1Var);
            getOdeeoAudioManager$odeeoSdk_release().getFocusChangeEvents$odeeoSdk_release().removeObservers(b1Var);
        }
        this.f68034a.stop();
        this.f68034a.release();
        this.f68036c.abandonAudioFocus$odeeoSdk_release();
        destroy();
    }

    public final void stopTimer$odeeoSdk_release() {
        cancelActiveJob$odeeoSdk_release();
    }

    public static final void a(w0 isInitialVolumeValPresent, c this$0, i.a volumeChangeEvent) {
        e0.checkNotNullParameter(isInitialVolumeValPresent, "$isInitialVolumeValPresent");
        e0.checkNotNullParameter(this$0, "this$0");
        if (isInitialVolumeValPresent.f71863b) {
            isInitialVolumeValPresent.f71863b = false;
        } else {
            e0.checkNotNullExpressionValue(volumeChangeEvent, "volumeChangeEvent");
            this$0.onAudioVolumeChanged$odeeoSdk_release(volumeChangeEvent);
        }
    }

    public static final void a(c this$0, Integer focusState) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullExpressionValue(focusState, "focusState");
        this$0.onAudioFocusChange$odeeoSdk_release(focusState.intValue());
    }

    public static final void a(int i10, c this$0) {
        e0.checkNotNullParameter(this$0, "this$0");
        if (i10 == -2) {
            this$0.a(h.f68085g);
            AdActivity adActivity = this$0.f68037d;
            if (adActivity != null) {
                adActivity.onPause(AdUnit.StateChangeReason.AudioSessionInterruption);
            }
            this$0.pausePlayer$odeeoSdk_release();
            this$0.setWasAudioFocusLossTransient$odeeoSdk_release(true);
            return;
        }
        if (i10 == 1 && this$0.isResumeAllowForPlayer$odeeoSdk_release()) {
            if (this$0.getWasAudioFocusLossTransient$odeeoSdk_release()) {
                this$0.a(h.f68086h);
                AdActivity adActivity2 = this$0.f68037d;
                if (adActivity2 != null) {
                    adActivity2.onResume(AdUnit.StateChangeReason.AudioSessionInterruptionEnd);
                }
                this$0.setWasAudioFocusLossTransient$odeeoSdk_release(false);
            }
            this$0.resumePlayer$odeeoSdk_release();
        }
    }

    public final void a() {
        setApplicationInBackground$odeeoSdk_release(true);
        stopTimer$odeeoSdk_release();
        pausePlayer$odeeoSdk_release();
        this.f68036c.abandonAudioFocus$odeeoSdk_release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r0) != r1) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:26:0x0087, B:28:0x008d], limit reached: 33 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ae -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope r11, zu.d<? super tu.x0> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.odeeo.sdk.c.d
            if (r0 == 0) goto L13
            r0 = r12
            io.odeeo.sdk.c$d r0 = (io.odeeo.sdk.c.d) r0
            int r1 = r0.f68067f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68067f = r1
            goto L18
        L13:
            io.odeeo.sdk.c$d r0 = new io.odeeo.sdk.c$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f68065d
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68067f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L44
            if (r2 != r4) goto L3c
            java.lang.Object r11 = r0.f68064c
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r2 = r0.f68063b
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r6 = r0.f68062a
            io.odeeo.sdk.c r6 = (io.odeeo.sdk.c) r6
            tu.a0.throwOnFailure(r12)
        L38:
            r12 = r11
            r11 = r2
            r2 = r6
            goto L59
        L3c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L44:
            java.lang.Object r11 = r0.f68064c
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r2 = r0.f68063b
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r6 = r0.f68062a
            io.odeeo.sdk.c r6 = (io.odeeo.sdk.c) r6
            tu.a0.throwOnFailure(r12)
            goto L7e
        L54:
            tu.a0.throwOnFailure(r12)
            r2 = r10
            r12 = r3
        L59:
            boolean r6 = kotlinx.coroutines.CoroutineScopeKt.isActive(r11)
            if (r6 == 0) goto Lb1
            io.odeeo.sdk.OdeeoSDK r6 = io.odeeo.sdk.OdeeoSDK.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r6 = r6.getODEEO_MAIN_THREAD_DISPATCHER$odeeoSdk_release()
            io.odeeo.sdk.c$e r7 = new io.odeeo.sdk.c$e
            r7.<init>(r3)
            r0.f68062a = r2
            r0.f68063b = r11
            r0.f68064c = r12
            r0.f68067f = r5
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r0)
            if (r6 != r1) goto L79
            goto Lb0
        L79:
            r9 = r2
            r2 = r11
            r11 = r12
            r12 = r6
            r6 = r9
        L7e:
            java.lang.Number r12 = (java.lang.Number) r12
            double r7 = r12.doubleValue()
            int r12 = (int) r7
            if (r11 == 0) goto L8d
            int r7 = r11.intValue()
            if (r7 == r12) goto La0
        L8d:
            io.odeeo.internal.z0.f r11 = r6.getViewModel$odeeoSdk_release()
            androidx.lifecycle.t1 r11 = r11.getTimerTick()
            java.lang.Integer r7 = bv.b.boxInt(r12)
            r11.postValue(r7)
            java.lang.Integer r11 = bv.b.boxInt(r12)
        La0:
            r0.f68062a = r6
            r0.f68063b = r2
            r0.f68064c = r11
            r0.f68067f = r4
            r7 = 50
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r7, r0)
            if (r12 != r1) goto L38
        Lb0:
            return r1
        Lb1:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.sdk.c.a(kotlinx.coroutines.CoroutineScope, zu.d):java.lang.Object");
    }

    public final void a(h hVar) {
        io.odeeo.internal.b2.a.d(e0.stringPlus("sendTrackingEvent ", hVar), new Object[0]);
        io.odeeo.internal.o1.e.sendInternalTrackingEvent$default(this.f68038e, new io.odeeo.internal.o1.b(this.f68035b.getInternalEventUrl(), new io.odeeo.internal.o1.c(hVar.eventId(), this.f68035b.getAdInfo().getTrackingEventPayload$odeeoSdk_release(), Integer.valueOf(hVar.getCode()), null, null, null, Float.valueOf(getDeviceVolumePercent()), null, null, 0L, io.odeeo.internal.o1.d.f65173a.map(hVar, isAudibilityCurrentlyEnforced$odeeoSdk_release(), this.f68039f.isRewardedAd()), 952, null)), null, 2, null);
    }
}
