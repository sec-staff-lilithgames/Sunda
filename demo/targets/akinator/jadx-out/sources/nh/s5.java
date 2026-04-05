package nh;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s5 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public final ej f76623b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76624c = null;

    /* renamed from: e, reason: collision with root package name */
    public ej f76625e = s7.f76631f;

    public s5(y5 y5Var) {
        this.f76623b = y5Var.f76784h.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76625e.hasNext() || this.f76623b.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        if (!this.f76625e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f76623b.next();
            this.f76624c = entry.getKey();
            this.f76625e = ((u4) entry.getValue()).iterator();
        }
        Object obj = this.f76624c;
        Objects.requireNonNull(obj);
        return ec.immutableEntry(obj, this.f76625e.next());
    }
}
