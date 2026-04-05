package nc;

import tb.f1;
import tb.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends i1 {
    public b0(Class<?> cls) {
        super(cls);
    }

    @Override // tb.f1
    public f1 forScope(Class<?> cls) {
        return cls == this.f86717b ? this : new b0(cls);
    }

    @Override // tb.g1, tb.f1
    public Object generateId(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // tb.f1
    public f1.a key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new f1.a(getClass(), this.f86717b, obj);
    }

    @Override // tb.f1
    public f1 newForSerialization(Object obj) {
        return this;
    }
}
