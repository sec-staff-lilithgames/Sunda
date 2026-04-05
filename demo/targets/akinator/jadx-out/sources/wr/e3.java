package wr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final List f90901a;

    /* renamed from: b, reason: collision with root package name */
    public final c f90902b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f90903c;

    public e3(List list, c cVar, Object obj) {
        this.f90901a = Collections.unmodifiableList(new ArrayList((Collection) mh.p1.checkNotNull(list, "addresses")));
        this.f90902b = (c) mh.p1.checkNotNull(cVar, "attributes");
        this.f90903c = obj;
    }

    public static d3 newBuilder() {
        d3 d3Var = new d3();
        d3Var.f90874b = c.f90841b;
        return d3Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return mh.h1.equal(this.f90901a, e3Var.f90901a) && mh.h1.equal(this.f90902b, e3Var.f90902b) && mh.h1.equal(this.f90903c, e3Var.f90903c);
    }

    public List<f1> getAddresses() {
        return this.f90901a;
    }

    public c getAttributes() {
        return this.f90902b;
    }

    public Object getLoadBalancingPolicyConfig() {
        return this.f90903c;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f90901a, this.f90902b, this.f90903c);
    }

    public d3 toBuilder() {
        return newBuilder().setAddresses(this.f90901a).setAttributes(this.f90902b).setLoadBalancingPolicyConfig(this.f90903c);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("addresses", this.f90901a).add("attributes", this.f90902b).add("loadBalancingPolicyConfig", this.f90903c).toString();
    }
}
