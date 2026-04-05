package com.bykv.vk.openvk.preload.b.b;

import com.bykv.vk.openvk.preload.b.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f16999a;

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f16999a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f16999a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f16999a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th2);
            }
        }
    }
}
