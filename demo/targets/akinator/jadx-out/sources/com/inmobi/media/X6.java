package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class X6 implements Parcelable {
    public static final V6 CREATOR = new V6();

    /* renamed from: a, reason: collision with root package name */
    public final Y6 f32484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32486c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32487d;

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f32488e;

    /* renamed from: f, reason: collision with root package name */
    public int f32489f;

    /* renamed from: g, reason: collision with root package name */
    public String f32490g;

    public X6(Y6 landingPageTelemetryMetaData, String urlType, int i10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
        kotlin.jvm.internal.e0.checkNotNullParameter(urlType, "urlType");
        this.f32484a = landingPageTelemetryMetaData;
        this.f32485b = urlType;
        this.f32486c = i10;
        this.f32487d = j10;
        this.f32488e = tu.q.lazy(W6.f32443a);
        this.f32489f = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X6)) {
            return false;
        }
        X6 x62 = (X6) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32484a, x62.f32484a) && kotlin.jvm.internal.e0.areEqual(this.f32485b, x62.f32485b) && this.f32486c == x62.f32486c && this.f32487d == x62.f32487d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32487d) + e3.g.d(this.f32486c, p0.o2.e(this.f32484a.hashCode() * 31, 31, this.f32485b), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingPageTelemetryControlInfo(landingPageTelemetryMetaData=");
        sb2.append(this.f32484a);
        sb2.append(", urlType=");
        sb2.append(this.f32485b);
        sb2.append(", counter=");
        sb2.append(this.f32486c);
        sb2.append(", startTime=");
        return e3.g.n(sb2, this.f32487d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.f32484a.f32567a);
        parcel.writeString(this.f32484a.f32568b);
        parcel.writeString(this.f32484a.f32569c);
        parcel.writeString(this.f32484a.f32570d);
        parcel.writeString(this.f32484a.f32571e);
        parcel.writeString(this.f32484a.f32572f);
        parcel.writeString(this.f32484a.f32573g);
        parcel.writeByte(this.f32484a.f32574h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f32484a.f32575i);
        parcel.writeString(this.f32485b);
        parcel.writeInt(this.f32486c);
        parcel.writeLong(this.f32487d);
        parcel.writeInt(this.f32489f);
        parcel.writeString(this.f32490g);
    }

    public /* synthetic */ X6(Y6 y62, String str, int i10, int i11) {
        this(y62, str, (i11 & 4) != 0 ? 0 : i10, SystemClock.elapsedRealtime());
    }
}
