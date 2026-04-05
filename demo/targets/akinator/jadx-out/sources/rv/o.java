package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f85051a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f85052b;

    public o(kv.a getInitialValue, kv.l getNextValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(getNextValue, "getNextValue");
        this.f85051a = getInitialValue;
        this.f85052b = getNextValue;
    }

    @Override // rv.t
    public Iterator<Object> iterator() {
        return new n(this);
    }
}
