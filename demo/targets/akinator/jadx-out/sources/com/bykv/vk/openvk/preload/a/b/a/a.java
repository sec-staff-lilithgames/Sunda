package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a<E> extends r<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16780a = new s() { // from class: com.bykv.vk.openvk.preload.a.b.a.a.1
        @Override // com.bykv.vk.openvk.preload.a.s
        public final <T> r<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            Type typeB = aVar.b();
            if (!(typeB instanceof GenericArrayType) && (!(typeB instanceof Class) || !((Class) typeB).isArray())) {
                return null;
            }
            Type typeD = com.bykv.vk.openvk.preload.a.b.a.d(typeB);
            return new a(dVar, dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeD)), com.bykv.vk.openvk.preload.a.b.a.b(typeD));
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final Class<E> f16781b;

    /* renamed from: c, reason: collision with root package name */
    private final r<E> f16782c;

    public a(com.bykv.vk.openvk.preload.a.d dVar, r<E> rVar, Class<E> cls) {
        this.f16782c = new l(dVar, rVar, cls);
        this.f16781b = cls;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.j();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.f16782c.a(aVar));
        }
        aVar.b();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f16781b, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            cVar.h();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f16782c.a(cVar, Array.get(obj, i10));
        }
        cVar.e();
    }
}
