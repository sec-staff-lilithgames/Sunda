package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f17019a;

    /* renamed from: b, reason: collision with root package name */
    private int f17020b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f17021c;

    /* renamed from: d, reason: collision with root package name */
    private d f17022d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.f17021c = list;
        this.f17020b = i10;
        this.f17019a = eVar;
        this.f17022d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f17022d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f17001a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f17022d;
        if (dVar != null) {
            dVar.f17003c = obj;
            dVar.e();
        }
        if (this.f17020b >= this.f17021c.size()) {
            return obj;
        }
        h hVar = this.f17021c.get(this.f17020b);
        Class<? extends d> cls = hVar.f17013a;
        d dVar2 = (d) this.f17019a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.b.b.a aVarA = hVar.a();
        i iVar = new i(this.f17021c, this.f17020b + 1, this.f17019a, dVar2);
        dVar2.a(iVar, this.f17022d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th2) {
            dVar2.b(th2);
            throw new a(th2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f17003c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f17002b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
