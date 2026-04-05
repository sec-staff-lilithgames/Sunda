package nh;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class jc implements mh.v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f76396b;

    public jc(Class cls) {
        this.f76396b = (Class) mh.p1.checkNotNull(cls);
    }

    @Override // mh.v2
    public Set<Enum<Object>> get() {
        return EnumSet.noneOf(this.f76396b);
    }
}
