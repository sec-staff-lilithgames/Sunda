package mk;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f0 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f74766b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f74767c;

    public f0(Method method, Object obj) {
        this.f74766b = method;
        this.f74767c = obj;
    }

    @Override // mk.j0
    public <T> T newInstance(Class<T> cls) throws Exception {
        String strA = b.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return (T) this.f74766b.invoke(this.f74767c, cls);
    }
}
