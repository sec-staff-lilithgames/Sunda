package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.ironsource.C3191e4;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class TypeAdapters {
    public static final com.google.gson.l0 A;
    public static final g B;
    public static final com.google.gson.l0 C;
    public static final com.google.gson.l0 D;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.l0 f29945a = newFactory(Class.class, new j0().nullSafe());

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.l0 f29946b = newFactory(BitSet.class, new s0().nullSafe());

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f29947c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.l0 f29948d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.l0 f29949e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.l0 f29950f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.l0 f29951g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.l0 f29952h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.l0 f29953i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.l0 f29954j;

    /* renamed from: k, reason: collision with root package name */
    public static final a0 f29955k;

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f29956l;

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f29957m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.l0 f29958n;

    /* renamed from: o, reason: collision with root package name */
    public static final f0 f29959o;

    /* renamed from: p, reason: collision with root package name */
    public static final g0 f29960p;

    /* renamed from: q, reason: collision with root package name */
    public static final h0 f29961q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.l0 f29962r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.l0 f29963s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.l0 f29964t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.l0 f29965u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.l0 f29966v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.l0 f29967w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.l0 f29968x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.l0 f29969y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.l0 f29970z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public class AnonymousClass32 implements com.google.gson.l0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f29981b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.k0 f29982c;

        public AnonymousClass32(Class cls, com.google.gson.k0 k0Var) {
            this.f29981b = cls;
            this.f29982c = k0Var;
        }

        @Override // com.google.gson.l0
        public <T2> com.google.gson.k0 create(Gson gson, pk.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f29981b.isAssignableFrom(rawType)) {
                return new t0(this, rawType);
            }
            return null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
            a.b.z(this.f29981b, sb2, ",adapter=");
            sb2.append(this.f29982c);
            sb2.append(C3191e4.i.f36531e);
            return sb2.toString();
        }
    }

    static {
        v0 v0Var = new v0();
        f29947c = new w0();
        f29948d = newFactory(Boolean.TYPE, Boolean.class, v0Var);
        f29949e = newFactory(Byte.TYPE, Byte.class, new x0());
        f29950f = newFactory(Short.TYPE, Short.class, new y0());
        f29951g = newFactory(Integer.TYPE, Integer.class, new z0());
        f29952h = newFactory(AtomicInteger.class, new a1().nullSafe());
        f29953i = newFactory(AtomicBoolean.class, new b1().nullSafe());
        f29954j = newFactory(AtomicIntegerArray.class, new z().nullSafe());
        f29955k = new a0();
        f29956l = new b0();
        f29957m = new c0();
        f29958n = newFactory(Character.TYPE, Character.class, new d0());
        e0 e0Var = new e0();
        f29959o = new f0();
        f29960p = new g0();
        f29961q = new h0();
        f29962r = newFactory(String.class, e0Var);
        f29963s = newFactory(StringBuilder.class, new i0());
        f29964t = newFactory(StringBuffer.class, new k0());
        f29965u = newFactory(URL.class, new l0());
        f29966v = newFactory(URI.class, new m0());
        f29967w = newTypeHierarchyFactory(InetAddress.class, new n0());
        f29968x = newFactory(UUID.class, new o0());
        f29969y = newFactory(Currency.class, new p0().nullSafe());
        f29970z = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, new q0());
        A = newFactory(Locale.class, new r0());
        g gVar = g.f29995a;
        B = gVar;
        C = newTypeHierarchyFactory(com.google.gson.q.class, gVar);
        D = e.f29990d;
    }

    public static <TT> com.google.gson.l0 newFactory(final pk.a<TT> aVar, final com.google.gson.k0 k0Var) {
        return new com.google.gson.l0() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.l0
            public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return k0Var;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.l0 newFactoryForMultipleTypes(final Class<TT> cls, final Class<? extends TT> cls2, final com.google.gson.k0 k0Var) {
        return new com.google.gson.l0() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.l0
            public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return k0Var;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                a.b.z(cls, sb2, "+");
                a.b.z(cls2, sb2, ",adapter=");
                sb2.append(k0Var);
                sb2.append(C3191e4.i.f36531e);
                return sb2.toString();
            }
        };
    }

    public static <T1> com.google.gson.l0 newTypeHierarchyFactory(Class<T1> cls, com.google.gson.k0 k0Var) {
        return new AnonymousClass32(cls, k0Var);
    }

    public static <TT> com.google.gson.l0 newFactory(final Class<TT> cls, final com.google.gson.k0 k0Var) {
        return new com.google.gson.l0() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.l0
            public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return k0Var;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                a.b.z(cls, sb2, ",adapter=");
                sb2.append(k0Var);
                sb2.append(C3191e4.i.f36531e);
                return sb2.toString();
            }
        };
    }

    public static <TT> com.google.gson.l0 newFactory(final Class<TT> cls, final Class<TT> cls2, final com.google.gson.k0 k0Var) {
        return new com.google.gson.l0() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.l0
            public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return k0Var;
                }
                return null;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Factory[type=");
                a.b.z(cls2, sb2, "+");
                a.b.z(cls, sb2, ",adapter=");
                sb2.append(k0Var);
                sb2.append(C3191e4.i.f36531e);
                return sb2.toString();
            }
        };
    }
}
