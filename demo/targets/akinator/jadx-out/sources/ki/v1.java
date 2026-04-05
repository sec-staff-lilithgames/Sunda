package ki;

import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v1 extends f2.e.d.f.a {

    /* renamed from: a, reason: collision with root package name */
    public List f71495a;

    @Override // ki.f2.e.d.f.a
    public f2.e.d.f build() {
        List list = this.f71495a;
        if (list != null) {
            return new w1(list);
        }
        throw new IllegalStateException("Missing required properties: rolloutAssignments");
    }

    @Override // ki.f2.e.d.f.a
    public f2.e.d.f.a setRolloutAssignments(List<f2.e.d.AbstractC0731e> list) {
        if (list == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f71495a = list;
        return this;
    }
}
