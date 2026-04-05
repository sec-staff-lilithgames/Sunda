package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final x0 f78960f = new x0(String.class);

    /* renamed from: g, reason: collision with root package name */
    public static final x0 f78961g = new x0(Object.class);

    public x0(Class cls) {
        super(-1, cls, null);
    }

    public static x0 forType(Class<?> cls) {
        return cls == String.class ? f78960f : cls == Object.class ? f78961g : new x0(cls);
    }

    @Override // oc.y0, jc.x
    public Object deserializeKey(String str, jc.k kVar) throws IOException {
        return str;
    }
}
