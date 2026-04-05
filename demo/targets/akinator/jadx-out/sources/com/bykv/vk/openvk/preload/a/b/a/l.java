package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.h;
import com.bykv.vk.openvk.preload.a.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class l<T> extends r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.d f16829a;

    /* renamed from: b, reason: collision with root package name */
    private final r<T> f16830b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f16831c;

    public l(com.bykv.vk.openvk.preload.a.d dVar, r<T> rVar, Type type) {
        this.f16829a = dVar;
        this.f16830b = rVar;
        this.f16831c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        return this.f16830b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
        r<T> rVarA = this.f16830b;
        Type type = this.f16831c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f16831c) {
            rVarA = this.f16829a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (rVarA instanceof h.a) {
                r<T> rVar = this.f16830b;
                if (!(rVar instanceof h.a)) {
                    rVarA = rVar;
                }
            }
        }
        rVarA.a(cVar, t10);
    }
}
