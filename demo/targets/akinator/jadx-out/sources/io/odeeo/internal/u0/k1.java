package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k1<K, V> extends q1<Map.Entry<K, V>> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final j1<K, V> f66922a;

        public a(j1<K, V> j1Var) {
            this.f66922a = j1Var;
        }

        public Object readResolve() {
            return this.f66922a.entrySet();
        }
    }

    @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v10 = f().get(entry.getKey());
            if (v10 != null && v10.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.odeeo.internal.u0.q1
    public boolean e() {
        return f().d();
    }

    public abstract j1<K, V> f();

    @Override // io.odeeo.internal.u0.q1, java.util.Collection, java.util.Set
    public int hashCode() {
        return f().hashCode();
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return f().e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return f().size();
    }

    @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new a(f());
    }
}
