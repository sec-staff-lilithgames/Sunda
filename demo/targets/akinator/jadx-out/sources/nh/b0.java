package nh;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends fd {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f76113b;

    public b0(e0 e0Var) {
        this.f76113b = e0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return this.f76113b.f();
    }
}
