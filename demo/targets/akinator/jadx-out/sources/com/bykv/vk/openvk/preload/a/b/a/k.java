package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k<T> extends r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final o<T> f16823a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.h<T> f16824b;

    /* renamed from: c, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.d f16825c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c.a<T> f16826d;

    /* renamed from: e, reason: collision with root package name */
    private final s f16827e;

    /* renamed from: f, reason: collision with root package name */
    private r<T> f16828f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {
        private a(byte b10) {
        }

        public /* synthetic */ a() {
            this((byte) 0);
        }
    }

    public k(o<T> oVar, com.bykv.vk.openvk.preload.a.h<T> hVar, com.bykv.vk.openvk.preload.a.d dVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar, s sVar) {
        new a();
        this.f16823a = oVar;
        this.f16824b = hVar;
        this.f16825c = dVar;
        this.f16826d = aVar;
        this.f16827e = sVar;
    }

    private r<T> b() {
        r<T> rVar = this.f16828f;
        if (rVar != null) {
            return rVar;
        }
        r<T> rVarA = this.f16825c.a(this.f16827e, this.f16826d);
        this.f16828f = rVarA;
        return rVarA;
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
        if (this.f16824b == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.geckox.h.a.a(aVar) instanceof com.bykv.vk.openvk.preload.a.k) {
            return null;
        }
        com.bykv.vk.openvk.preload.a.h<T> hVar = this.f16824b;
        this.f16826d.b();
        return hVar.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.r
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
        o<T> oVar = this.f16823a;
        if (oVar == null) {
            b().a(cVar, t10);
        } else if (t10 == null) {
            cVar.h();
        } else {
            this.f16826d.b();
            com.bykv.vk.openvk.preload.geckox.h.a.a(oVar.a(), cVar);
        }
    }
}
