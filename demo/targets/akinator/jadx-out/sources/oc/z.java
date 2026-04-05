package oc;

import java.io.IOException;
import java.util.LinkedHashMap;
import nc.i0;
import oc.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z extends i0.a {

    /* renamed from: c, reason: collision with root package name */
    public final a0.a f78966c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f78967d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f78968e;

    public z(a0.a aVar, mc.a0 a0Var, Class cls, Object obj) {
        super(a0Var, (Class<?>) cls);
        this.f78967d = new LinkedHashMap();
        this.f78966c = aVar;
        this.f78968e = obj;
    }

    @Override // nc.i0.a
    public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
        this.f78966c.resolveForwardReference(obj, obj2);
    }
}
