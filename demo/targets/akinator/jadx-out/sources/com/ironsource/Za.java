package com.ironsource;

import com.ironsource.AbstractC3279j3;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Za {

    /* renamed from: a, reason: collision with root package name */
    public static final Za f35878a = new Za();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f35879a;

        /* renamed from: b, reason: collision with root package name */
        private final long f35880b;

        /* renamed from: c, reason: collision with root package name */
        private final long f35881c;

        public a(boolean z10, long j10, long j11) {
            this.f35879a = z10;
            this.f35880b = j10;
            this.f35881c = j11;
        }

        public final boolean a() {
            return this.f35879a;
        }

        public final long b() {
            return this.f35880b;
        }

        public final long c() {
            return this.f35881c;
        }

        public final long d() {
            return this.f35880b;
        }

        public final long e() {
            return this.f35881c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35879a == aVar.f35879a && this.f35880b == aVar.f35880b && this.f35881c == aVar.f35881c;
        }

        public final boolean f() {
            return this.f35879a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.f35879a;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            return Long.hashCode(this.f35881c) + p0.o2.d(r02 * 31, 31, this.f35880b);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f35879a + ", refreshInterval=" + this.f35880b + ", visibilityCheckerInterval=" + this.f35881c + ")";
        }

        public final a a(boolean z10, long j10, long j11) {
            return new a(z10, j10, j11);
        }

        public static /* synthetic */ a a(a aVar, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f35879a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f35880b;
            }
            if ((i10 & 4) != 0) {
                j11 = aVar.f35881c;
            }
            return aVar.a(z10, j10, j11);
        }
    }

    private Za() {
    }

    public final Ba a(C3350n0 adTools, X2 bannerContainer, a config, K2 bannerAdProperties, Ca strategyListener, O2 bannerAdUnitFactory, InterfaceC3456t4 timeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(strategyListener, "strategyListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProvider, "timeProvider");
        boolean zC = Mb.f34856s.d().g().c();
        IronLog.INTERNAL.verbose("Creating banner strategy - useLegacyStrategy: " + zC + ", isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (zC) {
            return a(adTools, bannerContainer, config, bannerAdProperties, strategyListener, bannerAdUnitFactory, config.f() && config.d() > 0);
        }
        if (config.f()) {
            return new Ga(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, 128, null);
        }
        Sa sa2 = new Sa(adTools, bannerContainer, bannerAdUnitFactory);
        sa2.a(strategyListener);
        return sa2;
    }

    private final Ba a(C3350n0 c3350n0, X2 x22, a aVar, K2 k22, Ca ca2, O2 o22, boolean z10) {
        return new Ea(new Uf(c3350n0, x22, new AbstractC3279j3.b(aVar.d(), z10), k22, new Ya(ca2), o22), ca2);
    }
}
