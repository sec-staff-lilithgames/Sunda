package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public final double f83521b;

    /* renamed from: c, reason: collision with root package name */
    public final double f83522c;

    public d(double d10, double d11) {
        this.f83521b = d10;
        this.f83522c = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.f, qv.h, qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f83521b == dVar.f83521b && this.f83522c == dVar.f83522c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.f83522c) + (Double.hashCode(this.f83521b) * 31);
    }

    @Override // qv.f, qv.h, qv.t
    public boolean isEmpty() {
        return this.f83521b > this.f83522c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public String toString() {
        return this.f83521b + ".." + this.f83522c;
    }

    public boolean contains(double d10) {
        return d10 >= this.f83521b && d10 <= this.f83522c;
    }

    @Override // qv.f, qv.h
    public Double getEndInclusive() {
        return Double.valueOf(this.f83522c);
    }

    @Override // qv.f, qv.h, qv.t
    public Double getStart() {
        return Double.valueOf(this.f83521b);
    }

    public boolean lessThanOrEquals(double d10, double d11) {
        return d10 <= d11;
    }
}
