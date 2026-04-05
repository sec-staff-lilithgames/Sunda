package oc;

import java.io.IOException;
import java.util.ArrayList;
import nc.i0;
import oc.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends i0.a {

    /* renamed from: c, reason: collision with root package name */
    public final i.a f78864c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f78865d;

    public h(i.a aVar, mc.a0 a0Var, Class cls) {
        super(a0Var, (Class<?>) cls);
        this.f78865d = new ArrayList();
        this.f78864c = aVar;
    }

    @Override // nc.i0.a
    public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
        this.f78864c.resolveForwardReference(obj, obj2);
    }
}
