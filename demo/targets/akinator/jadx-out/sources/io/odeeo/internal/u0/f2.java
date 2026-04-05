package io.odeeo.internal.u0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f2<K0, V0> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends k<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f66770a;

        public a(int i10) {
            this.f66770a = i10;
        }

        @Override // io.odeeo.internal.u0.f2.k
        public <K, V> Map<K, Collection<V>> a() {
            return r2.a(this.f66770a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends k<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f66771a;

        public b(int i10) {
            this.f66771a = i10;
        }

        @Override // io.odeeo.internal.u0.f2.k
        public <K, V> Map<K, Collection<V>> a() {
            return r2.c(this.f66771a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends k<K0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f66772a;

        public c(Comparator comparator) {
            this.f66772a = comparator;
        }

        @Override // io.odeeo.internal.u0.f2.k
        public <K extends K0, V> Map<K, Collection<V>> a() {
            return new TreeMap(this.f66772a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends k<K0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f66773a;

        public d(Class cls) {
            this.f66773a = cls;
        }

        @Override // io.odeeo.internal.u0.f2.k
        public <K extends K0, V> Map<K, Collection<V>> a() {
            return new EnumMap(this.f66773a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e<V> implements io.odeeo.internal.t0.b0<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f66774a;

        public e(int i10) {
            this.f66774a = r.a(i10, "expectedValuesPerKey");
        }

        @Override // io.odeeo.internal.t0.b0
        public List<V> get() {
            return new ArrayList(this.f66774a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f<V extends Enum<V>> implements io.odeeo.internal.t0.b0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Class<V> f66775a;

        public f(Class<V> cls) {
            this.f66775a = (Class) io.odeeo.internal.t0.u.checkNotNull(cls);
        }

        @Override // io.odeeo.internal.t0.b0
        public Set<V> get() {
            return EnumSet.noneOf(this.f66775a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g<V> implements io.odeeo.internal.t0.b0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f66776a;

        public g(int i10) {
            this.f66776a = r.a(i10, "expectedValuesPerKey");
        }

        @Override // io.odeeo.internal.t0.b0
        public Set<V> get() {
            return r2.b(this.f66776a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h<V> implements io.odeeo.internal.t0.b0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f66777a;

        public h(int i10) {
            this.f66777a = r.a(i10, "expectedValuesPerKey");
        }

        @Override // io.odeeo.internal.t0.b0
        public Set<V> get() {
            return r2.d(this.f66777a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum i implements io.odeeo.internal.t0.b0<List<Object>> {
        INSTANCE;

        public static <V> io.odeeo.internal.t0.b0<List<V>> instance() {
            return INSTANCE;
        }

        @Override // io.odeeo.internal.t0.b0
        public List<Object> get() {
            return new LinkedList();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class k<K0> {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends j<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f66780a;

            public a(int i10) {
                this.f66780a = i10;
            }

            @Override // io.odeeo.internal.u0.f2.j, io.odeeo.internal.u0.f2
            public <K extends K0, V> y1<K, V> build() {
                return g2.newListMultimap(k.this.a(), new e(this.f66780a));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b extends j<K0, Object> {
            public b() {
            }

            @Override // io.odeeo.internal.u0.f2.j, io.odeeo.internal.u0.f2
            public <K extends K0, V> y1<K, V> build() {
                return g2.newListMultimap(k.this.a(), i.instance());
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c extends l<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f66783a;

            public c(int i10) {
                this.f66783a = i10;
            }

            @Override // io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
            public <K extends K0, V> d3<K, V> build() {
                return g2.newSetMultimap(k.this.a(), new g(this.f66783a));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class d extends l<K0, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f66785a;

            public d(int i10) {
                this.f66785a = i10;
            }

            @Override // io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
            public <K extends K0, V> d3<K, V> build() {
                return g2.newSetMultimap(k.this.a(), new h(this.f66785a));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class f extends l<K0, V0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Class f66789a;

            public f(Class cls) {
                this.f66789a = cls;
            }

            @Override // io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
            public <K extends K0, V extends V0> d3<K, V> build() {
                return g2.newSetMultimap(k.this.a(), new f(this.f66789a));
            }
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        public j<K0, Object> arrayListValues() {
            return arrayListValues(2);
        }

        public <V0 extends Enum<V0>> l<K0, V0> enumSetValues(Class<V0> cls) {
            io.odeeo.internal.t0.u.checkNotNull(cls, "valueClass");
            return new f(cls);
        }

        public l<K0, Object> hashSetValues() {
            return hashSetValues(2);
        }

        public l<K0, Object> linkedHashSetValues() {
            return linkedHashSetValues(2);
        }

        public j<K0, Object> linkedListValues() {
            return new b();
        }

        public m<K0, Comparable> treeSetValues() {
            return treeSetValues(p2.natural());
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class e extends m<K0, V0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Comparator f66787a;

            public e(Comparator comparator) {
                this.f66787a = comparator;
            }

            @Override // io.odeeo.internal.u0.f2.m, io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
            public <K extends K0, V extends V0> l3<K, V> build() {
                return g2.newSortedSetMultimap(k.this.a(), new n(this.f66787a));
            }
        }

        public j<K0, Object> arrayListValues(int i10) {
            r.a(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        public l<K0, Object> hashSetValues(int i10) {
            r.a(i10, "expectedValuesPerKey");
            return new c(i10);
        }

        public l<K0, Object> linkedHashSetValues(int i10) {
            r.a(i10, "expectedValuesPerKey");
            return new d(i10);
        }

        public <V0> m<K0, V0> treeSetValues(Comparator<V0> comparator) {
            io.odeeo.internal.t0.u.checkNotNull(comparator, "comparator");
            return new e(comparator);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n<V> implements io.odeeo.internal.t0.b0<SortedSet<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super V> f66791a;

        public n(Comparator<? super V> comparator) {
            this.f66791a = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator);
        }

        @Override // io.odeeo.internal.t0.b0
        public SortedSet<V> get() {
            return new TreeSet(this.f66791a);
        }
    }

    public f2() {
    }

    public static <K0 extends Enum<K0>> k<K0> enumKeys(Class<K0> cls) {
        io.odeeo.internal.t0.u.checkNotNull(cls);
        return new d(cls);
    }

    public static k<Object> hashKeys() {
        return hashKeys(8);
    }

    public static k<Object> linkedHashKeys() {
        return linkedHashKeys(8);
    }

    public static k<Comparable> treeKeys() {
        return treeKeys(p2.natural());
    }

    public abstract <K extends K0, V extends V0> e2<K, V> build();

    public <K extends K0, V extends V0> e2<K, V> build(e2<? extends K, ? extends V> e2Var) {
        e2<K, V> e2VarBuild = build();
        e2VarBuild.putAll(e2Var);
        return e2VarBuild;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class j<K0, V0> extends f2<K0, V0> {
        public j() {
            super(null);
        }

        @Override // io.odeeo.internal.u0.f2
        public abstract <K extends K0, V extends V0> y1<K, V> build();

        @Override // io.odeeo.internal.u0.f2
        public <K extends K0, V extends V0> y1<K, V> build(e2<? extends K, ? extends V> e2Var) {
            return (y1) super.build((e2) e2Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class l<K0, V0> extends f2<K0, V0> {
        public l() {
            super(null);
        }

        @Override // io.odeeo.internal.u0.f2
        public abstract <K extends K0, V extends V0> d3<K, V> build();

        @Override // io.odeeo.internal.u0.f2
        public <K extends K0, V extends V0> d3<K, V> build(e2<? extends K, ? extends V> e2Var) {
            return (d3) super.build((e2) e2Var);
        }
    }

    public /* synthetic */ f2(a aVar) {
        this();
    }

    public static k<Object> hashKeys(int i10) {
        r.a(i10, "expectedKeys");
        return new a(i10);
    }

    public static k<Object> linkedHashKeys(int i10) {
        r.a(i10, "expectedKeys");
        return new b(i10);
    }

    public static <K0> k<K0> treeKeys(Comparator<K0> comparator) {
        io.odeeo.internal.t0.u.checkNotNull(comparator);
        return new c(comparator);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class m<K0, V0> extends l<K0, V0> {
        @Override // io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
        public abstract <K extends K0, V extends V0> l3<K, V> build();

        @Override // io.odeeo.internal.u0.f2.l, io.odeeo.internal.u0.f2
        public <K extends K0, V extends V0> l3<K, V> build(e2<? extends K, ? extends V> e2Var) {
            return (l3) super.build((e2) e2Var);
        }
    }
}
