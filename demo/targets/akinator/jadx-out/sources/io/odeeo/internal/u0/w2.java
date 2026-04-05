package io.odeeo.internal.u0;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w2<K, V> extends j1<K, V> {

    /* renamed from: i, reason: collision with root package name */
    public static final j1<Object, Object> f67169i = new w2(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f67170f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f67171g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f67172h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<K, V> extends q1<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public final transient j1<K, V> f67173c;

        /* renamed from: d, reason: collision with root package name */
        public final transient Object[] f67174d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f67175e;

        /* renamed from: f, reason: collision with root package name */
        public final transient int f67176f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u0.w2$a$a, reason: collision with other inner class name */
        public class C0673a extends h1<Map.Entry<K, V>> {
            public C0673a() {
            }

            @Override // io.odeeo.internal.u0.d1
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f67176f;
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int i10) {
                io.odeeo.internal.t0.u.checkElementIndex(i10, a.this.f67176f);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f67174d[a.this.f67175e + i11], a.this.f67174d[i11 + (a.this.f67175e ^ 1)]);
            }
        }

        public a(j1<K, V> j1Var, Object[] objArr, int i10, int i11) {
            this.f67173c = j1Var;
            this.f67174d = objArr;
            this.f67175e = i10;
            this.f67176f = i11;
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f67173c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.q1
        public h1<Map.Entry<K, V>> d() {
            return new C0673a();
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f67176f;
        }

        @Override // io.odeeo.internal.u0.d1
        public int a(Object[] objArr, int i10) {
            return asList().a(objArr, i10);
        }

        @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public q3<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<K> extends q1<K> {

        /* renamed from: c, reason: collision with root package name */
        public final transient j1<K, ?> f67178c;

        /* renamed from: d, reason: collision with root package name */
        public final transient h1<K> f67179d;

        public b(j1<K, ?> j1Var, h1<K> h1Var) {
            this.f67178c = j1Var;
            this.f67179d = h1Var;
        }

        @Override // io.odeeo.internal.u0.d1
        public int a(Object[] objArr, int i10) {
            return asList().a(objArr, i10);
        }

        @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1
        public h1<K> asList() {
            return this.f67179d;
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f67178c.get(obj) != null;
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f67178c.size();
        }

        @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public q3<K> iterator() {
            return asList().iterator();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends h1<Object> {

        /* renamed from: c, reason: collision with root package name */
        public final transient Object[] f67180c;

        /* renamed from: d, reason: collision with root package name */
        public final transient int f67181d;

        /* renamed from: e, reason: collision with root package name */
        public final transient int f67182e;

        public c(Object[] objArr, int i10, int i11) {
            this.f67180c = objArr;
            this.f67181d = i10;
            this.f67182e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            io.odeeo.internal.t0.u.checkElementIndex(i10, this.f67182e);
            return this.f67180c[(i10 * 2) + this.f67181d];
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67182e;
        }
    }

    public w2(int[] iArr, Object[] objArr, int i10) {
        this.f67170f = iArr;
        this.f67171g = objArr;
        this.f67172h = i10;
    }

    public static <K, V> w2<K, V> a(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (w2) f67169i;
        }
        if (i10 == 1) {
            r.a(objArr[0], objArr[1]);
            return new w2<>(null, objArr, 1);
        }
        io.odeeo.internal.t0.u.checkPositionIndex(i10, objArr.length >> 1);
        return new w2<>(a(objArr, i10, q1.a(i10), 0), objArr, i10);
    }

    @Override // io.odeeo.internal.u0.j1
    public q1<K> b() {
        return new b(this, new c(this.f67171g, 0, this.f67172h));
    }

    @Override // io.odeeo.internal.u0.j1
    public d1<V> c() {
        return new c(this.f67171g, 1, this.f67172h);
    }

    @Override // io.odeeo.internal.u0.j1
    public boolean e() {
        return false;
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public V get(Object obj) {
        return (V) a(this.f67170f, this.f67171g, this.f67172h, 0, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f67172h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            io.odeeo.internal.u0.r.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L74
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            io.odeeo.internal.u0.r.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = io.odeeo.internal.u0.b1.a(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Multiple entries with same key: "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.u0.w2.a(java.lang.Object[], int, int, int):int[]");
    }

    public static Object a(int[] iArr, Object[] objArr, int i10, int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iA = b1.a(obj.hashCode());
        while (true) {
            int i12 = iA & length;
            int i13 = iArr[i12];
            if (i13 == -1) {
                return null;
            }
            if (objArr[i13].equals(obj)) {
                return objArr[i13 ^ 1];
            }
            iA = i12 + 1;
        }
    }

    @Override // io.odeeo.internal.u0.j1
    public q1<Map.Entry<K, V>> a() {
        return new a(this, this.f67171g, 0, this.f67172h);
    }
}
