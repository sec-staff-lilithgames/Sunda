package mh;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c3 implements v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f74595b;

    public c3(Object obj) {
        this.f74595b = obj;
    }

    @Override // mh.v2
    public boolean equals(Object obj) {
        if (obj instanceof c3) {
            return Objects.equals(this.f74595b, ((c3) obj).f74595b);
        }
        return false;
    }

    @Override // mh.v2
    public Object get() {
        return this.f74595b;
    }

    public int hashCode() {
        return Objects.hash(this.f74595b);
    }

    public String toString() {
        return w0.i.e(new StringBuilder("Suppliers.ofInstance("), this.f74595b, ")");
    }
}
