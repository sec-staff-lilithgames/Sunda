package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r implements t {

    /* renamed from: b, reason: collision with root package name */
    public final float f83551b;

    /* renamed from: c, reason: collision with root package name */
    public final float f83552c;

    public r(float f10, float f11) {
        this.f83551b = f10;
        this.f83552c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (isEmpty() && ((r) obj).isEmpty()) {
            return true;
        }
        r rVar = (r) obj;
        return this.f83551b == rVar.f83551b && this.f83552c == rVar.f83552c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f83552c) + (Float.hashCode(this.f83551b) * 31);
    }

    @Override // qv.t
    public boolean isEmpty() {
        return this.f83551b >= this.f83552c;
    }

    public String toString() {
        return this.f83551b + "..<" + this.f83552c;
    }

    public boolean contains(float f10) {
        return f10 >= this.f83551b && f10 < this.f83552c;
    }

    @Override // qv.t
    public Float getEndExclusive() {
        return Float.valueOf(this.f83552c);
    }

    @Override // qv.t
    public Float getStart() {
        return Float.valueOf(this.f83551b);
    }
}
