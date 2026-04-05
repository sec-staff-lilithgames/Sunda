package qv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    public final float f83523b;

    /* renamed from: c, reason: collision with root package name */
    public final float f83524c;

    public e(float f10, float f11) {
        this.f83523b = f10;
        this.f83524c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.f, qv.h, qv.t
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f83523b == eVar.f83523b && this.f83524c == eVar.f83524c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f83524c) + (Float.hashCode(this.f83523b) * 31);
    }

    @Override // qv.f, qv.h, qv.t
    public boolean isEmpty() {
        return this.f83523b > this.f83524c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qv.f
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f83523b + ".." + this.f83524c;
    }

    public boolean contains(float f10) {
        return f10 >= this.f83523b && f10 <= this.f83524c;
    }

    @Override // qv.f, qv.h
    public Float getEndInclusive() {
        return Float.valueOf(this.f83524c);
    }

    @Override // qv.f, qv.h, qv.t
    public Float getStart() {
        return Float.valueOf(this.f83523b);
    }

    public boolean lessThanOrEquals(float f10, float f11) {
        return f10 <= f11;
    }
}
