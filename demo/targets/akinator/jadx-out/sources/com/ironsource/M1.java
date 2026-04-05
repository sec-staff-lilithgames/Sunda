package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class M1 implements InterfaceC3357n7 {

    /* renamed from: a, reason: collision with root package name */
    private final I7 f34826a;

    /* renamed from: b, reason: collision with root package name */
    private N1 f34827b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public final N1 a(K1 k12, I7 featureAvailabilityService) {
            kotlin.jvm.internal.e0.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k12 != null ? Boolean.valueOf(k12.k()) : null));
            boolean z10 = false;
            if (featureAvailabilityService.a()) {
                C3147be.i().a(new C5(D5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((k12 != null ? k12.k() : false) && featureAvailabilityService.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new C3470u1() : new X7();
        }
    }

    public M1(I7 featureAvailabilityService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f34826a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC3357n7
    public void a(K1 k12) {
        if (this.f34827b == null) {
            this.f34827b = new a().a(k12, this.f34826a);
        }
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        N1 n12 = this.f34827b;
        if (n12 != null) {
            n12.b(observer);
        }
    }

    @Override // com.ironsource.N1
    public void a(InterfaceC3304ka observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        N1 n12 = this.f34827b;
        if (n12 != null) {
            n12.a(observer);
        }
    }
}
