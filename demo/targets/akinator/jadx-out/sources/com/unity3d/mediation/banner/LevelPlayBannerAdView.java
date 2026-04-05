package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ironsource.C3561z7;
import com.ironsource.Da;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Da f50673a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private final LevelPlayAdSize f50674a;

        /* renamed from: b, reason: collision with root package name */
        private final Double f50675b;

        /* renamed from: c, reason: collision with root package name */
        private final String f50676c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            private LevelPlayAdSize f50677a;

            /* renamed from: b, reason: collision with root package name */
            private Double f50678b;

            /* renamed from: c, reason: collision with root package name */
            private String f50679c;

            public final Config build() {
                return new Config(this.f50677a, this.f50678b, this.f50679c);
            }

            public final Builder setAdSize(LevelPlayAdSize adSize) {
                e0.checkNotNullParameter(adSize, "adSize");
                this.f50677a = adSize;
                return this;
            }

            public final Builder setBidFloor(double d10) {
                this.f50678b = Double.valueOf(d10);
                return this;
            }

            public final Builder setPlacementName(String placementName) {
                e0.checkNotNullParameter(placementName, "placementName");
                this.f50679c = placementName;
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                levelPlayAdSize = config.f50674a;
            }
            if ((i10 & 2) != 0) {
                d10 = config.f50675b;
            }
            if ((i10 & 4) != 0) {
                str = config.f50676c;
            }
            return config.copy(levelPlayAdSize, d10, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f50674a;
        }

        public final Double component2() {
            return this.f50675b;
        }

        public final String component3() {
            return this.f50676c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            return new Config(levelPlayAdSize, d10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return e0.areEqual(this.f50674a, config.f50674a) && e0.areEqual((Object) this.f50675b, (Object) config.f50675b) && e0.areEqual(this.f50676c, config.f50676c);
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f50674a;
        }

        public final Double getBidFloor() {
            return this.f50675b;
        }

        public final String getPlacementName() {
            return this.f50676c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f50674a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d10 = this.f50675b;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            String str = this.f50676c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            LevelPlayAdSize levelPlayAdSize = this.f50674a;
            Double d10 = this.f50675b;
            String str = this.f50676c;
            StringBuilder sb2 = new StringBuilder("Config(adSize=");
            sb2.append(levelPlayAdSize);
            sb2.append(", bidFloor=");
            sb2.append(d10);
            sb2.append(", placementName=");
            return o2.o(sb2, str, ")");
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str) {
            this.f50674a = levelPlayAdSize;
            this.f50675b = d10;
            this.f50676c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d10, String str, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : levelPlayAdSize, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        e0.checkNotNullParameter(context, "context");
    }

    private final Da a(String str, Config config) {
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        X2 x2A = a(context);
        addView(x2A);
        return new Da(C3561z7.f39356a.a(), str, x2A, config, null, 16, null);
    }

    public final void destroy() {
        this.f50673a.b();
    }

    public final String getAdId() {
        String string = this.f50673a.c().toString();
        e0.checkNotNullExpressionValue(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f50673a.d();
    }

    public final String getAdUnitId() {
        return this.f50673a.e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f50673a.f();
    }

    public final String getPlacementName() {
        return this.f50673a.g();
    }

    public final void loadAd() {
        this.f50673a.i();
    }

    public final void pauseAutoRefresh() {
        this.f50673a.j();
    }

    public final void resumeAutoRefresh() {
        this.f50673a.k();
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f50673a.a(levelPlayBannerAdViewListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        IronLog.API.info("context: ".concat(context.getClass().getSimpleName()));
        v vVarA = Da.f34180n.a(context, attributeSet);
        this.f50673a = a((String) vVarA.component1(), (Config) vVarA.component2());
    }

    private final X2 a(Context context) {
        X2 x22 = new X2(context);
        x22.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return x22;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId, Config config) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f50673a = a(adUnitId, config);
    }
}
