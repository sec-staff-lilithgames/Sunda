package wr;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final f6 f90808a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f90809b;

    public a6(f6 f6Var, HashMap map) {
        this.f90808a = (f6) mh.p1.checkNotNull(f6Var, "serviceDescriptor");
        this.f90809b = Collections.unmodifiableMap(new HashMap(map));
    }

    public static z5 builder(String str) {
        return new z5(str);
    }

    public t5 getMethod(String str) {
        return (t5) this.f90809b.get(str);
    }

    public Collection<t5> getMethods() {
        return this.f90809b.values();
    }

    public f6 getServiceDescriptor() {
        return this.f90808a;
    }

    public static z5 builder(f6 f6Var) {
        return new z5(f6Var);
    }
}
