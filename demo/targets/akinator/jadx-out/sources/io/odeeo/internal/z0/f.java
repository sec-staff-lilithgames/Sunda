package io.odeeo.internal.z0;

import android.content.res.Resources;
import androidx.lifecycle.b1;
import androidx.lifecycle.t1;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.AdUnitBase;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.advertisement.data.AdInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<b1> f67797a;

    /* renamed from: b, reason: collision with root package name */
    public final AdInfo f67798b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f67799c;

    /* renamed from: d, reason: collision with root package name */
    public final Flow<io.odeeo.internal.z0.a> f67800d;

    /* renamed from: e, reason: collision with root package name */
    public final t1 f67801e;

    /* renamed from: f, reason: collision with root package name */
    public final t1 f67802f;

    /* renamed from: g, reason: collision with root package name */
    public final t1 f67803g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow<io.odeeo.internal.z0.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Flow f67804a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f67805b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.z0.f$a$a, reason: collision with other inner class name */
        public static final class C0697a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f67806a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f67807b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            @bv.f(c = "io.odeeo.sdk.advertisement.OdeeoViewModel$special$$inlined$map$1$2", f = "OdeeoViewModel.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: io.odeeo.internal.z0.f$a$a$a, reason: collision with other inner class name */
            public static final class C0698a extends bv.d {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f67808a;

                /* renamed from: b, reason: collision with root package name */
                public int f67809b;

                public C0698a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f67808a = obj;
                    this.f67809b |= Integer.MIN_VALUE;
                    return C0697a.this.emit(null, this);
                }
            }

            public C0697a(FlowCollector flowCollector, f fVar) {
                this.f67806a = flowCollector;
                this.f67807b = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof io.odeeo.internal.z0.f.a.C0697a.C0698a
                    if (r0 == 0) goto L13
                    r0 = r6
                    io.odeeo.internal.z0.f$a$a$a r0 = (io.odeeo.internal.z0.f.a.C0697a.C0698a) r0
                    int r1 = r0.f67809b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f67809b = r1
                    goto L18
                L13:
                    io.odeeo.internal.z0.f$a$a$a r0 = new io.odeeo.internal.z0.f$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f67808a
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f67809b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f67806a
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    io.odeeo.internal.z0.f r2 = r4.f67807b
                    io.odeeo.internal.z0.a r5 = r2.handleStates$odeeoSdk_release(r5)
                    r0.f67809b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.z0.f.a.C0697a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow, f fVar) {
            this.f67804a = flow;
            this.f67805b = fVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super io.odeeo.internal.z0.a> flowCollector, zu.d dVar) {
            Object objCollect = this.f67804a.collect(new C0697a(flowCollector, this.f67805b), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public f(WeakReference<b1> lifecycleOwner, AdInfo adInfo, Resources resources) {
        e0.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        e0.checkNotNullParameter(adInfo, "adInfo");
        e0.checkNotNullParameter(resources, "resources");
        this.f67797a = lifecycleOwner;
        this.f67798b = adInfo;
        this.f67799c = resources;
        this.f67800d = FlowKt.distinctUntilChanged(new a(OdeeoSDK.INSTANCE.isPausedFlow$odeeoSdk_release(), this));
        this.f67801e = new t1();
        this.f67802f = new t1();
        this.f67803g = new t1();
    }

    public final AdInfo getAdInfo() {
        return this.f67798b;
    }

    public final List<String> getExternalEventUrl(AdUnitBase.TrackEvent trackEvent) {
        e0.checkNotNullParameter(trackEvent, "trackEvent");
        return this.f67798b.getEvent$odeeoSdk_release(trackEvent);
    }

    public final String getInternalEventUrl() {
        return OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getGlobalConfig().getTrackingEventApi();
    }

    public final WeakReference<b1> getLifecycleOwner() {
        return this.f67797a;
    }

    public final Flow<io.odeeo.internal.z0.a> getLifecycleState() {
        return this.f67800d;
    }

    public final io.odeeo.internal.z0.a getNewStateValue(io.odeeo.internal.z0.a aVar, io.odeeo.internal.z0.a aVar2) {
        return aVar2 == io.odeeo.internal.z0.a.OnResumed ? aVar == null ? io.odeeo.internal.z0.a.OnPaused : aVar : io.odeeo.internal.z0.a.OnPaused;
    }

    public final t1 getPlayerState() {
        return this.f67801e;
    }

    public final Resources getResources() {
        return this.f67799c;
    }

    public final int getTimeToRewardInSeconds(AdUnit.RewardType rewardType) {
        e0.checkNotNullParameter(rewardType, "rewardType");
        return OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getConfigManager().getRewardLevelTimeMS(rewardType) / 1000;
    }

    public final t1 getTimerTick() {
        return this.f67802f;
    }

    public final t1 getVolumeCheckState() {
        return this.f67803g;
    }

    public final io.odeeo.internal.z0.a handleStates$odeeoSdk_release(boolean z10) {
        return z10 ? io.odeeo.internal.z0.a.OnPaused : io.odeeo.internal.z0.a.OnResumed;
    }
}
