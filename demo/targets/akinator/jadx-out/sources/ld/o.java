package ld;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f73285a;

    public o(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f73285a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f73285a.equals(((g0) obj).getLogRequests());
        }
        return false;
    }

    @Override // ld.g0
    public List<p0> getLogRequests() {
        return this.f73285a;
    }

    public int hashCode() {
        return this.f73285a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f73285a + "}";
    }
}
