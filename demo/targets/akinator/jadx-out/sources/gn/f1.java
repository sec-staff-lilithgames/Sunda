package gn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final v f57878a;

    public f1(v vVar) {
        this.f57878a = vVar;
    }

    public boolean contains(int i10) {
        return this.f57878a.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f57878a.containsAny(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return this.f57878a.equals(((f1) obj).f57878a);
        }
        return false;
    }

    public int get(int i10) {
        return this.f57878a.get(i10);
    }

    public int hashCode() {
        return this.f57878a.hashCode();
    }

    public int size() {
        return this.f57878a.size();
    }
}
