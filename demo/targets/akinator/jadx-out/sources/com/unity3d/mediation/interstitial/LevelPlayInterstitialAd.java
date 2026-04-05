package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C3162cb;
import com.ironsource.C3216fb;
import com.ironsource.C3265i6;
import com.ironsource.C3350n0;
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
public final class LevelPlayInterstitialAd {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f50682a;

    /* renamed from: b, reason: collision with root package name */
    private final C3216fb f50683b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final boolean isPlacementCapped(String placementName) {
            e0.checkNotNullParameter(placementName, "placementName");
            return C3162cb.f36160n.a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Config implements C3162cb.b {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final Double f50684a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private Double f50685a;

            public final Config build() {
                return new Config(this.f50685a);
            }

            public final Builder setBidFloor(double d10) {
                this.f50685a = Double.valueOf(d10);
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
                d10 = config.f50684a;
            }
            return config.copy(d10);
        }

        public final Double component1() {
            return this.f50684a;
        }

        public final Config copy(Double d10) {
            return new Config(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && e0.areEqual((Object) this.f50684a, (Object) ((Config) obj).f50684a);
        }

        @Override // com.ironsource.C3162cb.b
        public Double getBidFloor() {
            return this.f50684a;
        }

        public int hashCode() {
            Double d10 = this.f50684a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f50684a + ")";
        }

        public Config(Double d10) {
            this.f50684a = d10;
        }

        public /* synthetic */ Config(Double d10, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : d10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        e0.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f50683b.b();
    }

    public final String getAdUnitId() {
        return this.f50682a;
    }

    public final boolean isAdReady() {
        return this.f50683b.c();
    }

    public final void loadAd() {
        this.f50683b.d();
    }

    public final void setListener(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.f50683b.a(levelPlayInterstitialAdListener);
    }

    public final void showAd(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String adUnitId, Config config) {
        this(adUnitId, new C3162cb.c(new C3350n0(IronSource.a.f37252c, D0.b.MEDIATION), new C3265i6(), Mb.f34856s.d(), new InterfaceC3456t4.a(), C3561z7.f39356a, config));
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(config, "config");
    }

    public final void showAd(Activity activity, String str) {
        e0.checkNotNullParameter(activity, "activity");
        this.f50683b.a(activity, str);
    }

    public LevelPlayInterstitialAd(String adUnitId, C3162cb.c payload) {
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(payload, "payload");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + payload.c());
        this.f50682a = adUnitId;
        this.f50683b = new C3216fb(adUnitId, payload.c(), payload.b(), payload.a(), payload.f(), payload.d(), payload.e());
    }
}
