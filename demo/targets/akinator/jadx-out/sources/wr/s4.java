package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final List f91126a;

    /* renamed from: b, reason: collision with root package name */
    public final c f91127b;

    /* renamed from: c, reason: collision with root package name */
    public final o4 f91128c;

    public s4(List list, c cVar, o4 o4Var) {
        this.f91126a = Collections.unmodifiableList(new ArrayList(list));
        this.f91127b = (c) mh.p1.checkNotNull(cVar, "attributes");
        this.f91128c = o4Var;
    }

    public static r4 newBuilder() {
        r4 r4Var = new r4();
        r4Var.f91112a = Collections.EMPTY_LIST;
        r4Var.f91113b = c.f90841b;
        return r4Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return mh.h1.equal(this.f91126a, s4Var.f91126a) && mh.h1.equal(this.f91127b, s4Var.f91127b) && mh.h1.equal(this.f91128c, s4Var.f91128c);
    }

    public List<f1> getAddresses() {
        return this.f91126a;
    }

    public c getAttributes() {
        return this.f91127b;
    }

    public o4 getServiceConfig() {
        return this.f91128c;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f91126a, this.f91127b, this.f91128c);
    }

    public r4 toBuilder() {
        return newBuilder().setAddresses(this.f91126a).setAttributes(this.f91127b).setServiceConfig(this.f91128c);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("addresses", this.f91126a).add("attributes", this.f91127b).add("serviceConfig", this.f91128c).toString();
    }
}
