package com.inmobi.media;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f31806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j10) {
        super(0);
        this.f31806a = j10;
    }

    public final void a() {
        J j10 = this.f31806a;
        j10.getClass();
        R3 r32 = R3.f32183a;
        if (r32.K()) {
            GestureDetectorOnGestureListenerC3093yc view = j10.f31883a;
            I windowInsetListener = j10.f31897o;
            F5 f52 = j10.f31887e;
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            kotlin.jvm.internal.e0.checkNotNullParameter(windowInsetListener, "windowInsetListener");
            cg listener = new cg(null, windowInsetListener, f52);
            if (r32.P()) {
                listener.f32719c = view;
                if (f52 != null) {
                    ((G5) f52).a("WindowInsetsHandler", "startListeningToInsets");
                }
                WeakHashMap weakHashMap = cg.f32716g;
                Object yf2 = weakHashMap.get(view);
                if (yf2 == null) {
                    yf2 = new Yf(view);
                    weakHashMap.put(view, yf2);
                }
                kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
                ((Yf) yf2).f32586a.add(listener);
                if (f52 != null) {
                    ((G5) f52).a("WindowInsetsHandler_INSTANCE", listener + " created - " + weakHashMap.size());
                }
            } else if (f52 != null) {
                ((G5) f52).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
            }
            j10.f31894l = listener;
        } else {
            F5 f53 = j10.f31887e;
            if (f53 != null) {
                ((G5) f53).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        J j11 = this.f31806a;
        j11.f31893k = j11.f31891i.scheduleWithFixedDelay(new zg.h(j11, 3), 0L, j11.f31885c, TimeUnit.MILLISECONDS);
    }

    @Override // kv.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return tu.x0.f87415a;
    }

    public static final void a(J this$0) {
        F5 f52;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(E2.a(new F(this$0)));
        if (thM7134exceptionOrNullimpl == null || (f52 = this$0.f31887e) == null) {
            return;
        }
        ((G5) f52).b("AdExposureTracker", b0.e2.o(thM7134exceptionOrNullimpl, new StringBuilder("Error calculating exposure metrics - ")));
    }
}
