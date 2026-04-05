package com.google.android.ump;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29638b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f29639c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29640a;

        /* renamed from: b, reason: collision with root package name */
        public String f29641b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f29642c;

        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        public Builder setAdMobAppId(String str) {
            this.f29641b = str;
            return this;
        }

        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.f29642c = consentDebugSettings;
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f29640a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f29637a = builder.f29640a;
        this.f29638b = builder.f29641b;
        this.f29639c = builder.f29642c;
    }

    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f29639c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f29637a;
    }

    public final String zza() {
        return this.f29638b;
    }
}
