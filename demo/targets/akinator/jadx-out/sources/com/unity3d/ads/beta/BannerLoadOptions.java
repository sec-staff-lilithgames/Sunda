package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BannerLoadOptions {
    private final String adMarkup;
    private final v bannerSize;
    private final Map<String, String> extras;
    private final BannerShowListener listener;
    private final String placementId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String adMarkup;
        private final v bannerSize;
        private Map<String, String> extras;
        private BannerShowListener listener;
        private final String placementId;

        public Builder(String placementId, v bannerSize) {
            e0.checkNotNullParameter(placementId, "placementId");
            e0.checkNotNullParameter(bannerSize, "bannerSize");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
        }

        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        public final Builder withAdMarkup(String adMarkup) {
            e0.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            e0.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withListener(BannerShowListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            return this;
        }
    }

    public BannerLoadOptions(String placementId, v bannerSize, String str, Map<String, String> map, BannerShowListener bannerShowListener) {
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(bannerSize, "bannerSize");
        this.placementId = placementId;
        this.bannerSize = bannerSize;
        this.adMarkup = str;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final v getBannerSize() {
        return this.bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ BannerLoadOptions(String str, v vVar, String str2, Map map, BannerShowListener bannerShowListener, int i10, u uVar) {
        this(str, vVar, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? null : bannerShowListener);
    }
}
