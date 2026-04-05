package com.bykv.vk.openvk.preload.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends i implements Iterable<i> {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f16992a = new ArrayList();

    public final void a(i iVar) {
        if (iVar == null) {
            iVar = k.f16993a;
        }
        this.f16992a.add(iVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final String b() {
        if (this.f16992a.size() == 1) {
            return this.f16992a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final boolean c() {
        if (this.f16992a.size() == 1) {
            return this.f16992a.get(0).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f16992a.equals(this.f16992a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f16992a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f16992a.iterator();
    }

    @Override // com.bykv.vk.openvk.preload.a.i
    public final Number a() {
        if (this.f16992a.size() == 1) {
            return this.f16992a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
