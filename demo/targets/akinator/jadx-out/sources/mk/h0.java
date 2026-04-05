package mk;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f74772b;

    public h0(Method method) {
        this.f74772b = method;
    }

    @Override // mk.j0
    public <T> T newInstance(Class<T> cls) throws Exception {
        String strA = b.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f74772b.invoke(null, cls, Object.class);
    }
}
