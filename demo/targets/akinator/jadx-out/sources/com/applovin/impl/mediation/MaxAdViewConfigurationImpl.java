package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAdViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f14465a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14466b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14467c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f14468a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* renamed from: b, reason: collision with root package name */
        private int f14469b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f14470c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f14468a;
        }

        public int getAdaptiveWidth() {
            return this.f14469b;
        }

        public int getInlineMaximumHeight() {
            return this.f14470c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f14468a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i10 + ")");
            this.f14469b = i10;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i10 + ")");
            this.f14470c = i10;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb2.append(this.f14468a);
            sb2.append(", adaptiveWidth=");
            sb2.append(this.f14469b);
            sb2.append(", inlineMaximumHeight=");
            return a.b.f(this.f14470c, "}", sb2);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f14465a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f14466b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f14467c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb2.append(this.f14465a);
        sb2.append(", adaptiveWidth=");
        sb2.append(this.f14466b);
        sb2.append(", inlineMaximumHeight=");
        return a.b.f(this.f14467c, "}", sb2);
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f14465a = builderImpl.f14468a;
        this.f14466b = builderImpl.f14469b;
        this.f14467c = builderImpl.f14470c;
    }
}
