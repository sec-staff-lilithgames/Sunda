package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Bc {

    /* renamed from: a, reason: collision with root package name */
    public final C2675a0 f31677a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31678b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31679c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31680d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31681e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31682f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31683g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f31684h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31685i;

    /* renamed from: j, reason: collision with root package name */
    public final V0 f31686j;

    /* renamed from: k, reason: collision with root package name */
    public final Gc f31687k;

    /* renamed from: l, reason: collision with root package name */
    public final String f31688l;

    public Bc(C2675a0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, V0 v02, Gc gc2, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.e0.checkNotNullParameter(markupType, "markupType");
        kotlin.jvm.internal.e0.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeType, "creativeType");
        kotlin.jvm.internal.e0.checkNotNullParameter(creativeId, "creativeId");
        this.f31677a = placement;
        this.f31678b = markupType;
        this.f31679c = impressionId;
        this.f31680d = telemetryMetadataBlob;
        this.f31681e = i10;
        this.f31682f = creativeType;
        this.f31683g = creativeId;
        this.f31684h = z10;
        this.f31685i = i11;
        this.f31686j = v02;
        this.f31687k = gc2;
        this.f31688l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bc)) {
            return false;
        }
        Bc bc2 = (Bc) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f31677a, bc2.f31677a) && kotlin.jvm.internal.e0.areEqual(this.f31678b, bc2.f31678b) && kotlin.jvm.internal.e0.areEqual(this.f31679c, bc2.f31679c) && kotlin.jvm.internal.e0.areEqual(this.f31680d, bc2.f31680d) && this.f31681e == bc2.f31681e && kotlin.jvm.internal.e0.areEqual(this.f31682f, bc2.f31682f) && kotlin.jvm.internal.e0.areEqual(this.f31683g, bc2.f31683g) && this.f31684h == bc2.f31684h && this.f31685i == bc2.f31685i && kotlin.jvm.internal.e0.areEqual(this.f31686j, bc2.f31686j) && kotlin.jvm.internal.e0.areEqual(this.f31687k, bc2.f31687k) && kotlin.jvm.internal.e0.areEqual(this.f31688l, bc2.f31688l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = p0.o2.e(p0.o2.e(e3.g.d(this.f31681e, p0.o2.e(p0.o2.e(p0.o2.e(this.f31677a.hashCode() * 31, 31, this.f31678b), 31, this.f31679c), 31, this.f31680d), 31), 31, this.f31682f), 31, this.f31683g);
        boolean z10 = this.f31684h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iD = e3.g.d(this.f31685i, (iE + i10) * 31, 31);
        V0 v02 = this.f31686j;
        int iHashCode = (iD + (v02 == null ? 0 : v02.hashCode())) * 31;
        Gc gc2 = this.f31687k;
        int iHashCode2 = (iHashCode + (gc2 == null ? 0 : Integer.hashCode(gc2.f31827a))) * 31;
        String str = this.f31688l;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RenderViewMetaData(placement=");
        sb2.append(this.f31677a);
        sb2.append(", markupType=");
        sb2.append(this.f31678b);
        sb2.append(", impressionId=");
        sb2.append(this.f31679c);
        sb2.append(", telemetryMetadataBlob=");
        sb2.append(this.f31680d);
        sb2.append(", internetAvailabilityAdRetryCount=");
        sb2.append(this.f31681e);
        sb2.append(", creativeType=");
        sb2.append(this.f31682f);
        sb2.append(", creativeId=");
        sb2.append(this.f31683g);
        sb2.append(", isRewarded=");
        sb2.append(this.f31684h);
        sb2.append(", adIndex=");
        sb2.append(this.f31685i);
        sb2.append(", adUnitTelemetryData=");
        sb2.append(this.f31686j);
        sb2.append(", renderViewTelemetryData=");
        sb2.append(this.f31687k);
        sb2.append(", renderViewId=");
        return p0.o2.q(sb2, this.f31688l, ')');
    }
}
