package mh;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u1 implements q1, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f74700b;

    public u1(j0 j0Var) {
        this.f74700b = (j0) p1.checkNotNull(j0Var);
    }

    @Override // mh.q1
    public boolean equals(Object obj) {
        if (obj instanceof u1) {
            j0 j0Var = ((u1) obj).f74700b;
            j0 j0Var2 = this.f74700b;
            if (Objects.equals(j0Var2.pattern(), j0Var.pattern()) && j0Var2.flags() == j0Var.flags()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        j0 j0Var = this.f74700b;
        return Objects.hash(j0Var.pattern(), Integer.valueOf(j0Var.flags()));
    }

    public String toString() {
        j0 j0Var = this.f74700b;
        return a.b.l("Predicates.contains(", g1.toStringHelper(j0Var).add("pattern", j0Var.pattern()).add("pattern.flags", j0Var.flags()).toString(), ")");
    }

    @Override // mh.q1
    public boolean apply(CharSequence charSequence) {
        return this.f74700b.matcher(charSequence).find();
    }
}
