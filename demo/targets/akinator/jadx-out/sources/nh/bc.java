package nh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class bc implements q8 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f76129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76130b;

    public bc(Object obj, Object obj2) {
        this.f76129a = obj;
        this.f76130b = obj2;
    }

    @Override // nh.q8
    public boolean equals(Object obj) {
        if (obj instanceof q8) {
            bc bcVar = (bc) ((q8) obj);
            if (Objects.equals(this.f76129a, bcVar.leftValue()) && Objects.equals(this.f76130b, bcVar.rightValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // nh.q8
    public int hashCode() {
        return Objects.hash(this.f76129a, this.f76130b);
    }

    @Override // nh.q8
    public Object leftValue() {
        return this.f76129a;
    }

    @Override // nh.q8
    public Object rightValue() {
        return this.f76130b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f76129a);
        sb2.append(", ");
        return w0.i.e(sb2, this.f76130b, ")");
    }
}
