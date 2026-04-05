package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f6550b;

    /* renamed from: c, reason: collision with root package name */
    public final g f6551c;

    public d2(Object obj) {
        this.f6550b = obj;
        i iVar = i.f6600c;
        Class<?> cls = obj.getClass();
        g gVar = (g) iVar.f6601a.get(cls);
        this.f6551c = gVar == null ? iVar.a(cls, null) : gVar;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 b1Var, i0 i0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f6551c.f6576a;
        List list = (List) map.get(i0Var);
        Object obj = this.f6550b;
        g.a(list, b1Var, i0Var, obj);
        g.a((List) map.get(i0.ON_ANY), b1Var, i0Var, obj);
    }
}
