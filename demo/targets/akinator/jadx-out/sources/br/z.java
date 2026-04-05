package br;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final double f10028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10030c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10031d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10032e;

    public z(double d10, int i10, String adElementName, long j10, List<v> algorithmResults) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adElementName, "adElementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithmResults, "algorithmResults");
        this.f10028a = d10;
        this.f10029b = i10;
        this.f10030c = adElementName;
        this.f10031d = j10;
        this.f10032e = algorithmResults;
    }

    public static /* synthetic */ z copy$default(z zVar, double d10, int i10, String str, long j10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = zVar.f10028a;
        }
        double d11 = d10;
        if ((i11 & 2) != 0) {
            i10 = zVar.f10029b;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = zVar.f10030c;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            j10 = zVar.f10031d;
        }
        long j11 = j10;
        if ((i11 & 16) != 0) {
            list = zVar.f10032e;
        }
        return zVar.copy(d11, i12, str2, j11, list);
    }

    public final double component1() {
        return this.f10028a;
    }

    public final int component2() {
        return this.f10029b;
    }

    public final String component3() {
        return this.f10030c;
    }

    public final long component4() {
        return this.f10031d;
    }

    public final List<v> component5() {
        return this.f10032e;
    }

    public final z copy(double d10, int i10, String adElementName, long j10, List<v> algorithmResults) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adElementName, "adElementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(algorithmResults, "algorithmResults");
        return new z(d10, i10, adElementName, j10, algorithmResults);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.e0.areEqual(z.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type io.bidmachine.rendering.model.BrokenCreativeEvent");
        z zVar = (z) obj;
        return this.f10028a == zVar.f10028a && this.f10029b == zVar.f10029b && kotlin.jvm.internal.e0.areEqual(this.f10030c, zVar.f10030c);
    }

    public final String getAdElementName() {
        return this.f10030c;
    }

    public final int getAdPhaseSequence() {
        return this.f10029b;
    }

    public final List<v> getAlgorithmResults() {
        return this.f10032e;
    }

    public final long getDurationMs() {
        return this.f10031d;
    }

    public int hashCode() {
        return this.f10030c.hashCode() + (((Double.hashCode(this.f10028a) * 31) + this.f10029b) * 31);
    }

    public final double isBroken() {
        return this.f10028a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("isBroken - ");
        double d10 = this.f10028a;
        sb2.append(d10);
        sb2.append(" (");
        sb2.append(d10 == 1.0d);
        sb2.append("), adPhaseSequence - ");
        sb2.append(this.f10029b);
        sb2.append(", adElementName - ");
        sb2.append(this.f10030c);
        sb2.append(", durationMs - ");
        sb2.append(this.f10031d);
        return sb2.toString();
    }
}
