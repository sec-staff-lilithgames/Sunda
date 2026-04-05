package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f16804a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c f16805b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f16806c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b.b f16807d = com.bykv.vk.openvk.preload.a.b.b.b.a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final String f16816a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f16817b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f16818c;

        public b(String str, boolean z10, boolean z11) {
            this.f16816a = str;
            this.f16817b = z10;
            this.f16818c = z11;
        }

        public abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean a(Object obj) throws IllegalAccessException, IOException;
    }

    public h(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.c cVar, com.bykv.vk.openvk.preload.a.b.c cVar2) {
        this.f16804a = bVar;
        this.f16805b = cVar;
        this.f16806c = cVar2;
    }

    private boolean a(Field field, boolean z10) {
        com.bykv.vk.openvk.preload.a.b.c cVar = this.f16806c;
        return (cVar.a(field.getType(), z10) || cVar.a(field, z10)) ? false : true;
    }

    private List<String> a(Field field) {
        com.bykv.vk.openvk.preload.a.a.b bVar = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
        if (bVar == null) {
            return Collections.singletonList(this.f16805b.a(field));
        }
        String strA = bVar.a();
        String[] strArrB = bVar.b();
        if (strArrB.length == 0) {
            return Collections.singletonList(strA);
        }
        ArrayList arrayList = new ArrayList(strArrB.length + 1);
        arrayList.add(strA);
        for (String str : strArrB) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<T> extends r<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.h<T> f16814a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, b> f16815b;

        public a(com.bykv.vk.openvk.preload.a.b.h<T> hVar, Map<String, b> map) {
            this.f16814a = hVar;
            this.f16815b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            T tA = this.f16814a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.f16815b.get(aVar.g());
                    if (bVar == null || !bVar.f16818c) {
                        aVar.n();
                    } else {
                        bVar.a(aVar, tA);
                    }
                }
                aVar.d();
                return tA;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new p(e11);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.h();
                return;
            }
            cVar.f();
            try {
                for (b bVar : this.f16815b.values()) {
                    if (bVar.a(t10)) {
                        cVar.a(bVar.f16816a);
                        bVar.a(cVar, t10);
                    }
                }
                cVar.g();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.s
    public final <T> r<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Class<? super T> clsA = aVar.a();
        if (Object.class.isAssignableFrom(clsA)) {
            return new a(this.f16804a.a(aVar), a(dVar, aVar, clsA));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    private Map<String, b> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, Class<?> cls) {
        com.bykv.vk.openvk.preload.a.c.a<?> aVar2;
        Field[] fieldArr;
        int i10;
        boolean z10;
        int i11;
        int i12;
        final boolean z11;
        final com.bykv.vk.openvk.preload.a.d dVar2 = dVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type typeB = aVar.b();
            com.bykv.vk.openvk.preload.a.c.a<?> aVarA = aVar;
            Class<?> clsA = cls;
            while (clsA != Object.class) {
                Field[] declaredFields = clsA.getDeclaredFields();
                int length = declaredFields.length;
                boolean z12 = false;
                int i13 = 0;
                while (i13 < length) {
                    final Field field = declaredFields[i13];
                    boolean zA = a(field, true);
                    boolean z13 = true;
                    boolean zA2 = a(field, z12);
                    if (zA || zA2) {
                        this.f16807d.a(field);
                        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), clsA, field.getGenericType());
                        List<String> listA = a(field);
                        int size = listA.size();
                        aVar2 = aVarA;
                        fieldArr = declaredFields;
                        b bVar = null;
                        for (?? r13 = z12; r13 < size; r13++) {
                            String str = listA.get(r13);
                            if (r13 != 0) {
                                zA = z12;
                            }
                            List<String> list = listA;
                            final com.bykv.vk.openvk.preload.a.c.a<?> aVarA2 = com.bykv.vk.openvk.preload.a.c.a.a(typeA);
                            Class<? super Object> clsA2 = aVarA2.a();
                            if (clsA2 == null || !clsA2.isPrimitive()) {
                                i12 = size;
                                z11 = z12;
                            } else {
                                i12 = size;
                                z11 = z13;
                            }
                            com.bykv.vk.openvk.preload.a.a.a aVar3 = (com.bykv.vk.openvk.preload.a.a.a) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
                            r<?> rVarA = aVar3 != null ? d.a(this.f16804a, dVar2, aVarA2, aVar3) : null;
                            int i14 = i13;
                            boolean z14 = zA;
                            final boolean z15 = rVarA != null;
                            if (rVarA == null) {
                                rVarA = dVar2.a((com.bykv.vk.openvk.preload.a.c.a) aVarA2);
                            }
                            int i15 = length;
                            final r<?> rVar = rVarA;
                            b bVar2 = (b) linkedHashMap.put(str, new b(str, z14, zA2) { // from class: com.bykv.vk.openvk.preload.a.b.a.h.1
                                @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
                                    (z15 ? rVar : new l(dVar2, rVar, aVarA2.b())).a(cVar, field.get(obj));
                                }

                                @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                                public final void a(com.bykv.vk.openvk.preload.a.d.a aVar4, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
                                    Object objA = rVar.a(aVar4);
                                    if (objA == null && z11) {
                                        return;
                                    }
                                    field.set(obj, objA);
                                }

                                @Override // com.bykv.vk.openvk.preload.a.b.a.h.b
                                public final boolean a(Object obj) throws IllegalAccessException, IOException {
                                    return this.f16817b && field.get(obj) != obj;
                                }
                            });
                            if (bVar == null) {
                                bVar = bVar2;
                            }
                            dVar2 = dVar;
                            zA = z14;
                            i13 = i14;
                            listA = list;
                            size = i12;
                            z12 = false;
                            z13 = true;
                            length = i15;
                        }
                        i10 = length;
                        z10 = z12;
                        i11 = i13;
                        if (bVar != null) {
                            throw new IllegalArgumentException(typeB + " declares multiple JSON fields named " + bVar.f16816a);
                        }
                    } else {
                        i10 = length;
                        z10 = z12;
                        i11 = i13;
                        aVar2 = aVarA;
                        fieldArr = declaredFields;
                    }
                    i13 = i11 + 1;
                    dVar2 = dVar;
                    aVarA = aVar2;
                    declaredFields = fieldArr;
                    z12 = z10;
                    length = i10;
                }
                aVarA = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.a.a(aVarA.b(), clsA, clsA.getGenericSuperclass()));
                clsA = aVarA.a();
                dVar2 = dVar;
            }
        }
        return linkedHashMap;
    }
}
