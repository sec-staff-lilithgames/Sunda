package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m f54591a;

    /* renamed from: b, reason: collision with root package name */
    public final m f54592b;

    /* renamed from: c, reason: collision with root package name */
    public final double f54593c;

    public n() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ n copy$default(n nVar, m mVar, m mVar2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = nVar.f54591a;
        }
        if ((i10 & 2) != 0) {
            mVar2 = nVar.f54592b;
        }
        if ((i10 & 4) != 0) {
            d10 = nVar.f54593c;
        }
        return nVar.copy(mVar, mVar2, d10);
    }

    public final m component1() {
        return this.f54591a;
    }

    public final m component2() {
        return this.f54592b;
    }

    public final double component3() {
        return this.f54593c;
    }

    public final n copy(m performance, m crashlytics, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        kotlin.jvm.internal.e0.checkNotNullParameter(crashlytics, "crashlytics");
        return new n(performance, crashlytics, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f54591a == nVar.f54591a && this.f54592b == nVar.f54592b && Double.compare(this.f54593c, nVar.f54593c) == 0;
    }

    public final m getCrashlytics() {
        return this.f54592b;
    }

    public final m getPerformance() {
        return this.f54591a;
    }

    public final double getSessionSamplingRate() {
        return this.f54593c;
    }

    public int hashCode() {
        return Double.hashCode(this.f54593c) + ((this.f54592b.hashCode() + (this.f54591a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f54591a + ", crashlytics=" + this.f54592b + ", sessionSamplingRate=" + this.f54593c + ')';
    }

    public n(m performance, m crashlytics, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        kotlin.jvm.internal.e0.checkNotNullParameter(crashlytics, "crashlytics");
        this.f54591a = performance;
        this.f54592b = crashlytics;
        this.f54593c = d10;
    }

    public /* synthetic */ n(m mVar, m mVar2, double d10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? m.f54581c : mVar, (i10 & 2) != 0 ? m.f54581c : mVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
