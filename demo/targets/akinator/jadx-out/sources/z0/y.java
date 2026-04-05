package z0;

import p0.b6;
import p0.q0;
import p0.y2;
import p0.z2;
import u0.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends u0.d implements z2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f97240i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    public static final y f97241j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends u0.f implements y2 {

        /* renamed from: i, reason: collision with root package name */
        public y f97242i;

        public a(y yVar) {
            super(yVar);
            this.f97242i = yVar;
        }

        @Override // u0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof p0.l0) {
                return containsKey((p0.l0) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof b6) {
                return containsValue((b6) obj);
            }
            return false;
        }

        @Override // u0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof p0.l0) {
                return get((p0.l0) obj);
            }
            return null;
        }

        public final y getMap$runtime() {
            return this.f97242i;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof p0.l0) ? obj2 : getOrDefault((p0.l0) obj, (b6) obj2);
        }

        @Override // u0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof p0.l0) {
                return remove((p0.l0) obj);
            }
            return null;
        }

        public final void setMap$runtime(y yVar) {
            this.f97242i = yVar;
        }

        public /* bridge */ boolean containsKey(p0.l0 l0Var) {
            return super.containsKey((Object) l0Var);
        }

        public /* bridge */ boolean containsValue(b6 b6Var) {
            return super.containsValue((Object) b6Var);
        }

        @Override // u0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ b6 get(Object obj) {
            if (obj instanceof p0.l0) {
                return get((p0.l0) obj);
            }
            return null;
        }

        public final /* bridge */ b6 getOrDefault(Object obj, b6 b6Var) {
            return !(obj instanceof p0.l0) ? b6Var : getOrDefault((p0.l0) obj, b6Var);
        }

        @Override // u0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ b6 remove(Object obj) {
            if (obj instanceof p0.l0) {
                return remove((p0.l0) obj);
            }
            return null;
        }

        public /* bridge */ b6 get(p0.l0 l0Var) {
            return (b6) super.get((Object) l0Var);
        }

        public /* bridge */ b6 getOrDefault(p0.l0 l0Var, b6 b6Var) {
            return (b6) super.getOrDefault((Object) l0Var, (p0.l0) b6Var);
        }

        public /* bridge */ b6 remove(p0.l0 l0Var) {
            return (b6) super.remove((Object) l0Var);
        }

        @Override // u0.f, s0.k
        public y build() {
            y yVar;
            if (getNode$runtime() == this.f97242i.getNode$runtime()) {
                yVar = this.f97242i;
            } else {
                this.f87486c = new y0.e();
                yVar = new y(getNode$runtime(), size());
            }
            this.f97242i = yVar;
            return yVar;
        }
    }

    static {
        u0.t eMPTY$runtime = u0.t.f87502e.getEMPTY$runtime();
        kotlin.jvm.internal.e0.checkNotNull(eMPTY$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f97241j = new y(eMPTY$runtime, 0);
    }

    public y(u0.t tVar, int i10) {
        super(tVar, i10);
    }

    @Override // u0.d, uu.m, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof p0.l0) {
            return containsKey((p0.l0) obj);
        }
        return false;
    }

    @Override // uu.m, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof b6) {
            return containsValue((b6) obj);
        }
        return false;
    }

    @Override // u0.d, uu.m, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof p0.l0) {
            return get((p0.l0) obj);
        }
        return null;
    }

    @Override // p0.z2, p0.m0
    public /* bridge */ /* synthetic */ Object getCurrentValue(p0.l0 l0Var) {
        return super.getCurrentValue(l0Var);
    }

    @Override // u0.d, uu.m
    public s0.f getEntries() {
        return super.getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p0.l0) ? obj2 : getOrDefault((p0.l0) obj, (b6) obj2);
    }

    @Override // p0.z2
    public z2 putValue(p0.l0 l0Var, b6 b6Var) {
        t.b bVarPut = getNode$runtime().put(l0Var.hashCode(), l0Var, b6Var, 0);
        if (bVarPut == null) {
            return this;
        }
        return new y(bVarPut.getNode(), bVarPut.getSizeDelta() + size());
    }

    public /* bridge */ boolean containsKey(p0.l0 l0Var) {
        return super.containsKey((Object) l0Var);
    }

    public /* bridge */ boolean containsValue(b6 b6Var) {
        return super.containsValue((Object) b6Var);
    }

    @Override // u0.d, uu.m, java.util.Map
    public final /* bridge */ b6 get(Object obj) {
        if (obj instanceof p0.l0) {
            return get((p0.l0) obj);
        }
        return null;
    }

    public final /* bridge */ b6 getOrDefault(Object obj, b6 b6Var) {
        return !(obj instanceof p0.l0) ? b6Var : getOrDefault((p0.l0) obj, b6Var);
    }

    @Override // p0.z2, p0.p0
    public /* bridge */ b6 get(p0.l0 l0Var) {
        return (b6) super.get((Object) l0Var);
    }

    public /* bridge */ b6 getOrDefault(p0.l0 l0Var, b6 b6Var) {
        return (b6) super.getOrDefault((Object) l0Var, (p0.l0) b6Var);
    }

    @Override // u0.d, s0.l
    public a builder() {
        return new a(this);
    }

    @Override // p0.z2, p0.p0
    public <T> T get(p0.l0 l0Var) {
        return (T) q0.read(this, l0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final y getEmpty() {
            return y.f97241j;
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }
    }
}
