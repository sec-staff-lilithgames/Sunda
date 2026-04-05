package com.unity3d.ads.beta;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LoadOptions {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String placementId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private String adMarkup;
        private final Map<String, String> extras;
        private final String placementId;

        public Builder(String placementId) {
            e0.checkNotNullParameter(placementId, "placementId");
            this.placementId = placementId;
            this.extras = new LinkedHashMap();
        }

        public final LoadOptions build() {
            return new LoadOptions(this.placementId, this.adMarkup, this.extras);
        }

        public final Builder withAdMarkup(String adMarkup) {
            e0.checkNotNullParameter(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            e0.checkNotNullParameter(extras, "extras");
            this.extras.putAll(extras);
            return this;
        }
    }

    public LoadOptions(String placementId, String str, Map<String, String> extras) {
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.extras = extras;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ LoadOptions(String str, String str2, Map map, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? p1.emptyMap() : map);
    }
}
