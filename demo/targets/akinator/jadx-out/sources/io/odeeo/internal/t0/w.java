package io.odeeo.internal.t0;

import b0.e2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends v<? super T>> f66454a;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f66454a.size(); i10++) {
                if (!this.f66454a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f66454a.equals(((b) obj).f66454a);
            }
            return false;
        }

        public int hashCode() {
            return this.f66454a.hashCode() + 306654252;
        }

        public String toString() {
            return w.b("and", this.f66454a);
        }

        public b(List<? extends v<? super T>> list) {
            this.f66454a = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<A, B> implements v<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final v<B> f66455a;

        /* renamed from: b, reason: collision with root package name */
        public final io.odeeo.internal.t0.k<A, ? extends B> f66456b;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(A a10) {
            return this.f66455a.apply(this.f66456b.apply(a10));
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f66456b.equals(cVar.f66456b) && this.f66455a.equals(cVar.f66455a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f66456b.hashCode() ^ this.f66455a.hashCode();
        }

        public String toString() {
            return this.f66455a + "(" + this.f66456b + ")";
        }

        public c(v<B> vVar, io.odeeo.internal.t0.k<A, ? extends B> kVar) {
            this.f66455a = (v) u.checkNotNull(vVar);
            this.f66456b = (io.odeeo.internal.t0.k) u.checkNotNull(kVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends e {
        private static final long serialVersionUID = 0;

        public d(String str) {
            super(t.a(str));
        }

        @Override // io.odeeo.internal.t0.w.e
        public String toString() {
            return "Predicates.containsPattern(" + this.f66457a.pattern() + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e implements v<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.t0.g f66457a;

        public e(io.odeeo.internal.t0.g gVar) {
            this.f66457a = (io.odeeo.internal.t0.g) u.checkNotNull(gVar);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (p.equal(this.f66457a.pattern(), eVar.f66457a.pattern()) && this.f66457a.flags() == eVar.f66457a.flags()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return p.hashCode(this.f66457a.pattern(), Integer.valueOf(this.f66457a.flags()));
        }

        public String toString() {
            return a.b.l("Predicates.contains(", o.toStringHelper(this.f66457a).add("pattern", this.f66457a.pattern()).add("pattern.flags", this.f66457a.flags()).toString(), ")");
        }

        @Override // io.odeeo.internal.t0.v
        public boolean apply(CharSequence charSequence) {
            return this.f66457a.matcher(charSequence).find();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Collection<?> f66458a;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            try {
                return this.f66458a.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                return this.f66458a.equals(((f) obj).f66458a);
            }
            return false;
        }

        public int hashCode() {
            return this.f66458a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f66458a + ")";
        }

        public f(Collection<?> collection) {
            this.f66458a = (Collection) u.checkNotNull(collection);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g implements v<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f66459a;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(Object obj) {
            return this.f66459a.isInstance(obj);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            return (obj instanceof g) && this.f66459a == ((g) obj).f66459a;
        }

        public int hashCode() {
            return this.f66459a.hashCode();
        }

        public String toString() {
            return e2.k(this.f66459a, new StringBuilder("Predicates.instanceOf("), ")");
        }

        public g(Class<?> cls) {
            this.f66459a = (Class) u.checkNotNull(cls);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final T f66460a;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            return this.f66460a.equals(t10);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof h) {
                return this.f66460a.equals(((h) obj).f66460a);
            }
            return false;
        }

        public int hashCode() {
            return this.f66460a.hashCode();
        }

        public String toString() {
            return w0.i.e(new StringBuilder("Predicates.equalTo("), this.f66460a, ")");
        }

        public h(T t10) {
            this.f66460a = t10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final v<T> f66461a;

        public i(v<T> vVar) {
            this.f66461a = (v) u.checkNotNull(vVar);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            return !this.f66461a.apply(t10);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof i) {
                return this.f66461a.equals(((i) obj).f66461a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f66461a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f66461a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k<T> implements v<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends v<? super T>> f66467a;

        @Override // io.odeeo.internal.t0.v
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f66467a.size(); i10++) {
                if (this.f66467a.get(i10).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            if (obj instanceof k) {
                return this.f66467a.equals(((k) obj).f66467a);
            }
            return false;
        }

        public int hashCode() {
            return this.f66467a.hashCode() + 87855567;
        }

        public String toString() {
            return w.b("or", this.f66467a);
        }

        public k(List<? extends v<? super T>> list) {
            this.f66467a = list;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l implements v<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f66468a;

        @Override // io.odeeo.internal.t0.v
        public boolean equals(Object obj) {
            return (obj instanceof l) && this.f66468a == ((l) obj).f66468a;
        }

        public int hashCode() {
            return this.f66468a.hashCode();
        }

        public String toString() {
            return e2.k(this.f66468a, new StringBuilder("Predicates.subtypeOf("), ")");
        }

        public l(Class<?> cls) {
            this.f66468a = (Class) u.checkNotNull(cls);
        }

        @Override // io.odeeo.internal.t0.v
        public boolean apply(Class<?> cls) {
            return this.f66468a.isAssignableFrom(cls);
        }
    }

    public static <T> v<T> alwaysFalse() {
        return j.f66463b.a();
    }

    public static <T> v<T> alwaysTrue() {
        return j.f66462a.a();
    }

    public static <T> v<T> and(Iterable<? extends v<? super T>> iterable) {
        return new b(a(iterable));
    }

    public static String b(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static <A, B> v<A> compose(v<B> vVar, io.odeeo.internal.t0.k<A, ? extends B> kVar) {
        return new c(vVar, kVar);
    }

    public static v<CharSequence> contains(Pattern pattern) {
        return new e(new m(pattern));
    }

    public static v<CharSequence> containsPattern(String str) {
        return new d(str);
    }

    public static <T> v<T> equalTo(T t10) {
        return t10 == null ? isNull() : new h(t10);
    }

    public static <T> v<T> in(Collection<? extends T> collection) {
        return new f(collection);
    }

    public static v<Object> instanceOf(Class<?> cls) {
        return new g(cls);
    }

    public static <T> v<T> isNull() {
        return j.f66464c.a();
    }

    public static <T> v<T> not(v<T> vVar) {
        return new i(vVar);
    }

    public static <T> v<T> notNull() {
        return j.f66465d.a();
    }

    public static <T> v<T> or(Iterable<? extends v<? super T>> iterable) {
        return new k(a(iterable));
    }

    public static v<Class<?>> subtypeOf(Class<?> cls) {
        return new l(cls);
    }

    public static <T> List<v<? super T>> a(v<? super T> vVar, v<? super T> vVar2) {
        return Arrays.asList(vVar, vVar2);
    }

    @SafeVarargs
    public static <T> v<T> and(v<? super T>... vVarArr) {
        return new b(a(vVarArr));
    }

    @SafeVarargs
    public static <T> v<T> or(v<? super T>... vVarArr) {
        return new k(a(vVarArr));
    }

    public static <T> List<T> a(T... tArr) {
        return a(Arrays.asList(tArr));
    }

    public static <T> v<T> and(v<? super T> vVar, v<? super T> vVar2) {
        return new b(a((v) u.checkNotNull(vVar), (v) u.checkNotNull(vVar2)));
    }

    public static <T> v<T> or(v<? super T> vVar, v<? super T> vVar2) {
        return new k(a((v) u.checkNotNull(vVar), (v) u.checkNotNull(vVar2)));
    }

    public static <T> List<T> a(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(u.checkNotNull(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class j implements v<Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f66462a;

        /* renamed from: b, reason: collision with root package name */
        public static final j f66463b;

        /* renamed from: c, reason: collision with root package name */
        public static final j f66464c;

        /* renamed from: d, reason: collision with root package name */
        public static final j f66465d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ j[] f66466e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum a extends j {
            public a(String str, int i10) {
                super(str, i10);
            }

            @Override // io.odeeo.internal.t0.w.j, io.odeeo.internal.t0.v
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum b extends j {
            public b(String str, int i10) {
                super(str, i10);
            }

            @Override // io.odeeo.internal.t0.w.j, io.odeeo.internal.t0.v
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum c extends j {
            public c(String str, int i10) {
                super(str, i10);
            }

            @Override // io.odeeo.internal.t0.w.j, io.odeeo.internal.t0.v
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum d extends j {
            public d(String str, int i10) {
                super(str, i10);
            }

            @Override // io.odeeo.internal.t0.w.j, io.odeeo.internal.t0.v
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        static {
            a aVar = new a("ALWAYS_TRUE", 0);
            f66462a = aVar;
            b bVar = new b("ALWAYS_FALSE", 1);
            f66463b = bVar;
            c cVar = new c("IS_NULL", 2);
            f66464c = cVar;
            d dVar = new d("NOT_NULL", 3);
            f66465d = dVar;
            f66466e = new j[]{aVar, bVar, cVar, dVar};
        }

        public j(String str, int i10) {
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f66466e.clone();
        }

        @Override // io.odeeo.internal.t0.v
        public abstract /* synthetic */ boolean apply(Object obj);

        public <T> v<T> a() {
            return this;
        }
    }
}
