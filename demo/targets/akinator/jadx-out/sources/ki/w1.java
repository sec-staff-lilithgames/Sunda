package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w1 extends f2.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    public final List f71505a;

    public w1(List list) {
        this.f71505a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2.e.d.f) {
            return this.f71505a.equals(((f2.e.d.f) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // ki.f2.e.d.f
    public List<f2.e.d.AbstractC0731e> getRolloutAssignments() {
        return this.f71505a;
    }

    public int hashCode() {
        return this.f71505a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f71505a + "}";
    }
}
