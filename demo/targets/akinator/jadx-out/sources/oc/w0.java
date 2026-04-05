package oc;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 extends y0 {

    /* renamed from: f, reason: collision with root package name */
    public final Method f78958f;

    public w0(Method method) {
        super(-1, method.getDeclaringClass(), null);
        this.f78958f = method;
    }

    @Override // oc.y0
    public Object _parse(String str, jc.k kVar) throws Exception {
        return this.f78958f.invoke(null, str);
    }
}
