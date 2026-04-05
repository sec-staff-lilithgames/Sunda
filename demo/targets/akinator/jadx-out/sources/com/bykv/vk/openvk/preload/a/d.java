package com.bykv.vk.openvk.preload.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.bykv.vk.openvk.preload.a.c.a<?> f16935a = com.bykv.vk.openvk.preload.a.c.a.a(Object.class);

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>>> f16936b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<com.bykv.vk.openvk.preload.a.c.a<?>, r<?>> f16937c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f16938d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.a.d f16939e;

    /* renamed from: f, reason: collision with root package name */
    private List<s> f16940f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16941g;

    public d() {
        this(com.bykv.vk.openvk.preload.a.b.c.f16889a, b.f16773a, Collections.EMPTY_MAP, true, q.f16996a, Collections.EMPTY_LIST);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f16940f + ",instanceCreators:" + this.f16938d + "}";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<T> extends r<T> {

        /* renamed from: a, reason: collision with root package name */
        private r<T> f16944a;

        public final void a(r<T> rVar) {
            if (this.f16944a != null) {
                throw new AssertionError();
            }
            this.f16944a = rVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            r<T> rVar = this.f16944a;
            if (rVar != null) {
                return rVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
            r<T> rVar = this.f16944a;
            if (rVar != null) {
                rVar.a(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final <T> r<T> a(com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean z10;
        r<T> rVar = (r) this.f16937c.get(aVar == null ? f16935a : aVar);
        if (rVar != null) {
            return rVar;
        }
        Map<com.bykv.vk.openvk.preload.a.c.a<?>, a<?>> map = this.f16936b.get();
        if (map == null) {
            map = new HashMap<>();
            this.f16936b.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            Iterator<s> it = this.f16940f.iterator();
            while (it.hasNext()) {
                r<T> rVarA = it.next().a(this, aVar);
                if (rVarA != null) {
                    aVar3.a((r<?>) rVarA);
                    this.f16937c.put(aVar, rVarA);
                    return rVarA;
                }
            }
            throw new IllegalArgumentException("GSON (pangle-v3200) cannot handle ".concat(String.valueOf(aVar)));
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f16936b.remove();
            }
        }
    }

    public d(com.bykv.vk.openvk.preload.a.b.c cVar, c cVar2, Map<Type, f<?>> map, boolean z10, q qVar, List<s> list) {
        final r<Number> rVar;
        this.f16936b = new ThreadLocal<>();
        this.f16937c = new ConcurrentHashMap();
        com.bykv.vk.openvk.preload.a.b.b bVar = new com.bykv.vk.openvk.preload.a.b.b(map);
        this.f16938d = bVar;
        this.f16941g = z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.B);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.g.f16801a);
        arrayList.add(cVar);
        arrayList.addAll(list);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16847p);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16838g);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16835d);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16836e);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16837f);
        if (qVar == q.f16996a) {
            rVar = com.bykv.vk.openvk.preload.a.b.a.m.f16842k;
        } else {
            rVar = new r<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.3
                @Override // com.bykv.vk.openvk.preload.a.r
                public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        cVar3.h();
                    } else {
                        cVar3.b(number2.toString());
                    }
                }

                @Override // com.bykv.vk.openvk.preload.a.r
                public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                    if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                        aVar.j();
                        return null;
                    }
                    return Long.valueOf(aVar.l());
                }
            };
        }
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Long.TYPE, Long.class, rVar));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Double.TYPE, Double.class, new r<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.1
            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    d.a(number2.doubleValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Double.valueOf(aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(Float.TYPE, Float.class, new r<Number>() { // from class: com.bykv.vk.openvk.preload.a.d.2
            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar3.h();
                } else {
                    d.a(number2.floatValue());
                    cVar3.a(number2);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ Number a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return Float.valueOf((float) aVar.k());
            }
        }));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16843l);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16839h);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16840i);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(AtomicLong.class, new r<AtomicLong>() { // from class: com.bykv.vk.openvk.preload.a.d.4
            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, AtomicLong atomicLong) throws IOException {
                rVar.a(cVar3, Long.valueOf(atomicLong.get()));
            }

            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ AtomicLong a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                return new AtomicLong(((Number) rVar.a(aVar)).longValue());
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(AtomicLongArray.class, new r<AtomicLongArray>() { // from class: com.bykv.vk.openvk.preload.a.d.5
            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar3, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                cVar3.d();
                int length = atomicLongArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    rVar.a(cVar3, Long.valueOf(atomicLongArray2.get(i10)));
                }
                cVar3.e();
            }

            @Override // com.bykv.vk.openvk.preload.a.r
            public final /* synthetic */ AtomicLongArray a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList2.add(Long.valueOf(((Number) rVar.a(aVar)).longValue()));
                }
                aVar.b();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList2.get(i10)).longValue());
                }
                return atomicLongArray;
            }
        }.a()));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16841j);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16844m);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16848q);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16849r);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(BigDecimal.class, com.bykv.vk.openvk.preload.a.b.a.m.f16845n));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.a(BigInteger.class, com.bykv.vk.openvk.preload.a.b.a.m.f16846o));
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16850s);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16851t);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16853v);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16854w);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16857z);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16852u);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16833b);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.c.f16791a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16856y);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.j.f16821a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.i.f16819a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16855x);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.a.f16780a);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.f16832a);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.b(bVar));
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.f(bVar));
        com.bykv.vk.openvk.preload.a.b.a.d dVar = new com.bykv.vk.openvk.preload.a.b.a.d(bVar);
        this.f16939e = dVar;
        arrayList.add(dVar);
        arrayList.add(com.bykv.vk.openvk.preload.a.b.a.m.C);
        arrayList.add(new com.bykv.vk.openvk.preload.a.b.a.h(bVar, cVar2, cVar));
        this.f16940f = Collections.unmodifiableList(arrayList);
    }

    public final <T> r<T> a(s sVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        if (!this.f16940f.contains(sVar)) {
            sVar = this.f16939e;
        }
        boolean z10 = false;
        for (s sVar2 : this.f16940f) {
            if (z10) {
                r<T> rVarA = sVar2.a(this, aVar);
                if (rVarA != null) {
                    return rVarA;
                }
            } else if (sVar2 == sVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(aVar)));
    }

    public final <T> r<T> a(Class<T> cls) {
        return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Class) cls));
    }

    public final String a(Object obj) {
        com.bykv.vk.openvk.preload.a.d.c cVarA;
        boolean zA;
        boolean zB;
        boolean zC;
        if (obj == null) {
            k kVar = k.f16993a;
            StringWriter stringWriter = new StringWriter();
            try {
                cVarA = a((Writer) stringWriter);
                zA = cVarA.a();
                cVarA.a(true);
                zB = cVarA.b();
                cVarA.b(this.f16941g);
                zC = cVarA.c();
                cVarA.c(false);
                try {
                    try {
                        com.bykv.vk.openvk.preload.geckox.h.a.a(kVar, cVarA);
                        return stringWriter.toString();
                    } finally {
                    }
                } catch (IOException e10) {
                    throw new j(e10);
                } catch (AssertionError e11) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e11.getMessage());
                    assertionError.initCause(e11);
                    throw assertionError;
                }
            } catch (IOException e12) {
                throw new j(e12);
            }
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            cVarA = a((Writer) stringWriter2);
            r rVarA = a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a((Type) cls));
            zA = cVarA.a();
            cVarA.a(true);
            zB = cVarA.b();
            cVarA.b(this.f16941g);
            zC = cVarA.c();
            cVarA.c(false);
            try {
                try {
                    rVarA.a(cVarA, obj);
                    return stringWriter2.toString();
                } catch (IOException e13) {
                    throw new j(e13);
                } catch (AssertionError e14) {
                    AssertionError assertionError2 = new AssertionError("AssertionError (GSON pangle-v3200): " + e14.getMessage());
                    assertionError2.initCause(e14);
                    throw assertionError2;
                }
            } finally {
            }
        } catch (IOException e15) {
            throw new j(e15);
        }
    }

    private static com.bykv.vk.openvk.preload.a.d.c a(Writer writer) throws IOException {
        com.bykv.vk.openvk.preload.a.d.c cVar = new com.bykv.vk.openvk.preload.a.d.c(writer);
        cVar.c(false);
        return cVar;
    }

    private <T> T a(com.bykv.vk.openvk.preload.a.d.a aVar, Type type) throws j, p {
        boolean zP = aVar.p();
        boolean z10 = true;
        aVar.a(true);
        try {
            try {
                try {
                    aVar.f();
                    z10 = false;
                    return a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type)).a(aVar);
                } catch (EOFException e10) {
                    if (z10) {
                        aVar.a(zP);
                        return null;
                    }
                    throw new p(e10);
                } catch (IllegalStateException e11) {
                    throw new p(e11);
                }
            } catch (IOException e12) {
                throw new p(e12);
            } catch (AssertionError e13) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON pangle-v3200): " + e13.getMessage());
                assertionError.initCause(e13);
                throw assertionError;
            }
        } finally {
            aVar.a(zP);
        }
    }

    public final <T> T a(Reader reader, Type type) throws j, p {
        com.bykv.vk.openvk.preload.a.d.a aVar = new com.bykv.vk.openvk.preload.a.d.a(reader);
        aVar.a(false);
        T t10 = (T) a(aVar, type);
        if (t10 != null) {
            try {
                if (aVar.f() != com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT) {
                    throw new j("JSON document was not fully consumed.");
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e10) {
                throw new p(e10);
            } catch (IOException e11) {
                throw new j(e11);
            }
        }
        return t10;
    }
}
