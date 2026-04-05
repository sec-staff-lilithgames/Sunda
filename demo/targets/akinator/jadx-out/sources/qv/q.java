package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements t {

    /* renamed from: b, reason: collision with root package name */
    public final double f83549b;

    /* renamed from: c, reason: collision with root package name */
    public final double f83550c;

    public q(double d10, double d11) {
        this.f83549b = d10;
        this.f83550c = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (isEmpty() && ((q) obj).isEmpty()) {
            return true;
        }
        q qVar = (q) obj;
        return this.f83549b == qVar.f83549b && this.f83550c == qVar.f83550c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.f83550c) + (Double.hashCode(this.f83549b) * 31);
    }

    @Override // qv.t
    public boolean isEmpty() {
        return this.f83549b >= this.f83550c;
    }

    public String toString() {
        return this.f83549b + "..<" + this.f83550c;
    }

    public boolean contains(double d10) {
        return d10 >= this.f83549b && d10 < this.f83550c;
    }

    @Override // qv.t
    public Double getEndExclusive() {
        return Double.valueOf(this.f83550c);
    }

    @Override // qv.t
    public Double getStart() {
        return Double.valueOf(this.f83549b);
    }
}
