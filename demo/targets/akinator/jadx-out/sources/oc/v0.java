package oc;

import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 extends y0 {

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f78956f;

    public v0(Constructor<?> constructor) {
        super(-1, constructor.getDeclaringClass(), null);
        this.f78956f = constructor;
    }

    @Override // oc.y0
    public Object _parse(String str, jc.k kVar) throws Exception {
        return this.f78956f.newInstance(str);
    }
}
