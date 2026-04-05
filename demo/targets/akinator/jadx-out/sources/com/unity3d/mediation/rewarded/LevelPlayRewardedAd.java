package com.unity3d.mediation.rewarded;

import android.app.Activity;
import com.ironsource.C3162cb;
import com.ironsource.C3265i6;
import com.ironsource.C3350n0;
import com.ironsource.C3413qb;
import com.ironsource.C3561z7;
import com.ironsource.D0;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.Mb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayRewardedAd {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f50688a;

    /* renamed from: b, reason: collision with root package name */
    private final C3413qb f50689b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final boolean isPlacementCapped(String placementName) {
            e0.checkNotNullParameter(placementName, "placementName");
            return C3162cb.f36160n.a(placementName, LevelPlay.AdFormat.REWARDED);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Config implements C3162cb.b {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final Double f50690a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private Double f50691a;

            public final Config build() {
                return new Config(this.f50691a);
            }

            public final Builder setBidFloor(double d10) {
                this.f50691a = Double.valueOf(d10);
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Config empty() {
                return new Config(null, 1, 0 == true ? 1 : 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, Double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = config.f50690a;
            }
            return config.copy(d10);
        }

        public final Double component1() {
            return this.f50690a;
        }

        public final Config copy(Double d10) {
            return new Config(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && e0.areEqual((Object) this.f50690a, (Object) ((Config) obj).f50690a);
        }

        @Override // com.ironsource.C3162cb.b
        public Double getBidFloor() {
            return this.f50690a;
        }

        public int hashCode() {
            Double d10 = this.f50690a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f50690a + ")";
        }

        public Config(Double d10) {
            this.f50690a = d10;
        }

        public /* synthetic */ Config(Double d10, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : d10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        e0.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayRewardedAd levelPlayRewardedAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayRewardedAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f50689b.a();
    }

    public final String getAdUnitId() {
        return this.f50688a;
    }

    public final boolean isAdReady() {
        return this.f50689b.b();
    }

    public final void loadAd() {
        this.f50689b.c();
    }

    public final void setListener(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        this.f50689b.a(levelPlayRewardedAdListener);
    }

    public final void showAd(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayRewardedAd(String adUnitId, Config config) {
        this(adUnitId, new C3162cb.c(new C3350n0(IronSource.a.REWARDED_VIDEO, D0.b.MEDIATION), new C3265i6(), Mb.f34856s.d(), new InterfaceC3456t4.a(), C3561z7.f39356a, config));
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(config, "config");
    }

    public final void showAd(Activity activity, String str) {
        e0.checkNotNullParameter(activity, "activity");
        this.f50689b.a(activity, str);
    }

    public LevelPlayRewardedAd(String adUnitId, C3162cb.c payload) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.c());
        this.f50688a = adUnitId;
        this.f50689b = new C3413qb(adUnitId, payload.c(), payload.b(), payload.a(), payload.f(), payload.d(), payload.e());
    }
}
