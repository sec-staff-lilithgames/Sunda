package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f16785a;

    public b(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f16785a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.s
    public final <T> r<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Type typeB = aVar.b();
        Class<? super T> clsA = aVar.a();
        if (!Collection.class.isAssignableFrom(clsA)) {
            return null;
        }
        Type typeA = com.bykv.vk.openvk.preload.a.b.a.a(typeB, (Class<?>) clsA);
        return new a(dVar, typeA, dVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(typeA)), this.f16785a.a(aVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<E> extends r<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final r<E> f16789a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.h<? extends Collection<E>> f16790b;

        public a(com.bykv.vk.openvk.preload.a.d dVar, Type type, r<E> rVar, com.bykv.vk.openvk.preload.a.b.h<? extends Collection<E>> hVar) {
            this.f16789a = new l(dVar, rVar, type);
            this.f16790b = hVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.h();
                return;
            }
            cVar.d();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f16789a.a(cVar, it.next());
            }
            cVar.e();
        }

        @Override // com.bykv.vk.openvk.preload.a.r
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.j();
                return null;
            }
            Collection<E> collectionA = this.f16790b.a();
            aVar.a();
            while (aVar.e()) {
                collectionA.add(this.f16789a.a(aVar));
            }
            aVar.b();
            return collectionA;
        }
    }
}
