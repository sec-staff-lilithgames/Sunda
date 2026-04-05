package m5;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f74038a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74040c;

    public f(long j10, long j11, int i10) {
        this.f74038a = j10;
        this.f74039b = j11;
        this.f74040c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f74038a == fVar.f74038a && this.f74039b == fVar.f74039b && this.f74040c == fVar.f74040c;
    }

    public final long getModelVersion() {
        return this.f74039b;
    }

    public final long getTaxonomyVersion() {
        return this.f74038a;
    }

    public final int getTopicId() {
        return this.f74040c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f74040c) + o2.d(Long.hashCode(this.f74038a) * 31, 31, this.f74039b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f74038a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f74039b);
        sb2.append(", TopicCode=");
        return a.b.k("Topic { ", a.b.f(this.f74040c, " }", sb2));
    }
}
