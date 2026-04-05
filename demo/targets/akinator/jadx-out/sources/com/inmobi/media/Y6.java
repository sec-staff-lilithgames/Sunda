package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32569c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32570d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32571e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32572f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32573g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32574h;

    /* renamed from: i, reason: collision with root package name */
    public final String f32575i;

    public Y6(long j10, String impressionId, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z10, String landingScheme) {
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementType, "placementType");
        kotlin.jvm.internal.e0.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.e0.checkNotNullParameter(markupType, "markupType");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeType, "creativeType");
        kotlin.jvm.internal.e0.checkNotNullParameter(metaDataBlob, "metaDataBlob");
        kotlin.jvm.internal.e0.checkNotNullParameter(landingScheme, "landingScheme");
        this.f32567a = j10;
        this.f32568b = impressionId;
        this.f32569c = placementType;
        this.f32570d = adType;
        this.f32571e = markupType;
        this.f32572f = creativeType;
        this.f32573g = metaDataBlob;
        this.f32574h = z10;
        this.f32575i = landingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y6)) {
            return false;
        }
        Y6 y62 = (Y6) obj;
        return this.f32567a == y62.f32567a && kotlin.jvm.internal.e0.areEqual(this.f32568b, y62.f32568b) && kotlin.jvm.internal.e0.areEqual(this.f32569c, y62.f32569c) && kotlin.jvm.internal.e0.areEqual(this.f32570d, y62.f32570d) && kotlin.jvm.internal.e0.areEqual(this.f32571e, y62.f32571e) && kotlin.jvm.internal.e0.areEqual(this.f32572f, y62.f32572f) && kotlin.jvm.internal.e0.areEqual(this.f32573g, y62.f32573g) && this.f32574h == y62.f32574h && kotlin.jvm.internal.e0.areEqual(this.f32575i, y62.f32575i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = p0.o2.e(p0.o2.e(p0.o2.e(p0.o2.e(p0.o2.e(p0.o2.e(Long.hashCode(this.f32567a) * 31, 31, this.f32568b), 31, this.f32569c), 31, this.f32570d), 31, this.f32571e), 31, this.f32572f), 31, this.f32573g);
        boolean z10 = this.f32574h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f32575i.hashCode() + ((iE + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingPageTelemetryMetaData(placementId=");
        sb2.append(this.f32567a);
        sb2.append(", impressionId=");
        sb2.append(this.f32568b);
        sb2.append(", placementType=");
        sb2.append(this.f32569c);
        sb2.append(", adType=");
        sb2.append(this.f32570d);
        sb2.append(", markupType=");
        sb2.append(this.f32571e);
        sb2.append(", creativeType=");
        sb2.append(this.f32572f);
        sb2.append(", metaDataBlob=");
        sb2.append(this.f32573g);
        sb2.append(", isRewarded=");
        sb2.append(this.f32574h);
        sb2.append(", landingScheme=");
        return AbstractC2962r0.a(sb2, this.f32575i, ')');
    }
}
