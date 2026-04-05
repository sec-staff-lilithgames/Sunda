package z;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends d0 implements Map, lv.g {

    /* renamed from: g, reason: collision with root package name */
    public final u0 f96917g;

    /* renamed from: h, reason: collision with root package name */
    public g0 f96918h;

    /* renamed from: i, reason: collision with root package name */
    public n0 f96919i;

    /* renamed from: j, reason: collision with root package name */
    public b1 f96920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(u0 parent) {
        super(parent);
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        this.f96917g = parent;
    }

    @Override // z.d0, java.util.Map
    public void clear() {
        this.f96917g.clear();
    }

    @Override // z.d0
    public Set<Map.Entry<Object, Object>> getEntries() {
        g0 g0Var = this.f96918h;
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this.f96917g);
        this.f96918h = g0Var2;
        return g0Var2;
    }

    @Override // z.d0
    public Set<Object> getKeys() {
        n0 n0Var = this.f96919i;
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this.f96917g);
        this.f96919i = n0Var2;
        return n0Var2;
    }

    @Override // z.d0
    public Collection<Object> getValues() {
        b1 b1Var = this.f96920j;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this.f96917g);
        this.f96920j = b1Var2;
        return b1Var2;
    }

    @Override // z.d0, java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f96917g.put(obj, obj2);
    }

    @Override // z.d0, java.util.Map
    public void putAll(Map<Object, Object> from) {
        kotlin.jvm.internal.e0.checkNotNullParameter(from, "from");
        for (Map.Entry<Object, Object> entry : from.entrySet()) {
            this.f96917g.set(entry.getKey(), entry.getValue());
        }
    }

    @Override // z.d0, java.util.Map
    public Object remove(Object obj) {
        return this.f96917g.remove(obj);
    }
}
