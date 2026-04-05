package dk;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f52368a;

    public e(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f52368a = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f52368a.equals(((g) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // dk.g
    public Set<f> getRolloutAssignments() {
        return this.f52368a;
    }

    public int hashCode() {
        return this.f52368a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f52368a + "}";
    }
}
