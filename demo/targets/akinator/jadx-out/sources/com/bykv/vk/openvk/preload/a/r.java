package com.bykv.vk.openvk.preload.a;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class r<T> {
    public final r<T> a() {
        return new r<T>() { // from class: com.bykv.vk.openvk.preload.a.r.1
            @Override // com.bykv.vk.openvk.preload.a.r
            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException {
                if (t10 == null) {
                    cVar.h();
                } else {
                    r.this.a(cVar, t10);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.r
            public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.j();
                    return null;
                }
                return (T) r.this.a(aVar);
            }
        };
    }

    public abstract T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException;

    public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t10) throws IOException;
}
