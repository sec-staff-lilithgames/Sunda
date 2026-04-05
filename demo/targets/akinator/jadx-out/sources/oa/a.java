package oa;

import r7.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f78722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f78723c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f78724e;

    public a(k0 k0Var, c cVar, b bVar) {
        this.f78722b = k0Var;
        this.f78723c = cVar;
        this.f78724e = bVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        c cVar = this.f78723c;
        k0 k0Var = this.f78722b;
        k0Var.removeListener(cVar);
        k0Var.removeFailureListener(this.f78724e);
    }
}
