package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.b f16795a;

    public d(com.bykv.vk.openvk.preload.a.b.b bVar) {
        this.f16795a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.s
    public final <T> r<T> a(com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        com.bykv.vk.openvk.preload.a.a.a aVar2 = (com.bykv.vk.openvk.preload.a.a.a) aVar.a().getAnnotation(com.bykv.vk.openvk.preload.a.a.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (r<T>) a(this.f16795a, dVar, aVar, aVar2);
    }

    public static r<?> a(com.bykv.vk.openvk.preload.a.b.b bVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, com.bykv.vk.openvk.preload.a.a.a aVar2) {
        r<?> kVar;
        Object objA = bVar.a(com.bykv.vk.openvk.preload.a.c.a.a((Class) aVar2.a())).a();
        if (objA instanceof r) {
            kVar = (r) objA;
        } else if (objA instanceof s) {
            kVar = ((s) objA).a(dVar, aVar);
        } else {
            boolean z10 = objA instanceof o;
            if (!z10 && !(objA instanceof com.bykv.vk.openvk.preload.a.h)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            kVar = new k(z10 ? (o) objA : null, objA instanceof com.bykv.vk.openvk.preload.a.h ? (com.bykv.vk.openvk.preload.a.h) objA : null, dVar, aVar, null);
        }
        return (kVar == null || !aVar2.b()) ? kVar : kVar.a();
    }
}
