package com.inmobi.media;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2976re {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33327c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33329e;

    /* renamed from: f, reason: collision with root package name */
    public final List f33330f;

    /* renamed from: g, reason: collision with root package name */
    public final double f33331g;

    public C2976re(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.f33325a = z10;
        this.f33326b = z11;
        this.f33327c = z12;
        this.f33328d = z13;
        this.f33329e = z14;
        this.f33330f = priorityEventsList;
        this.f33331g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2976re)) {
            return false;
        }
        C2976re c2976re = (C2976re) obj;
        return this.f33325a == c2976re.f33325a && this.f33326b == c2976re.f33326b && this.f33327c == c2976re.f33327c && this.f33328d == c2976re.f33328d && this.f33329e == c2976re.f33329e && kotlin.jvm.internal.e0.areEqual(this.f33330f, c2976re.f33330f) && Double.compare(this.f33331g, c2976re.f33331g) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f33325a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r32 = this.f33326b;
        int i11 = r32;
        if (r32 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r33 = this.f33327c;
        int i13 = r33;
        if (r33 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r34 = this.f33328d;
        int i15 = r34;
        if (r34 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z11 = this.f33329e;
        return Double.hashCode(this.f33331g) + j1.o2.c((i16 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31, this.f33330f);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f33325a + ", isImageEnabled=" + this.f33326b + ", isGIFEnabled=" + this.f33327c + ", isVideoEnabled=" + this.f33328d + ", isGeneralEventsDisabled=" + this.f33329e + ", priorityEventsList=" + this.f33330f + ", samplingFactor=" + this.f33331g + ')';
    }
}
