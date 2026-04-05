package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f23738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f23739c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.f23739c = pVar;
        this.f23737a = iVar;
        this.f23738b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f23160a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f23739c;
            i iVar = this.f23737a;
            String str = bVar.f23163d;
            com.fyber.inneractive.sdk.util.g gVar = this.f23738b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f23740b, str);
            j jVar = (j) pVar.f23741a;
            i iVar2 = jVar.f23711a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.f23710d, gVar);
                return;
            }
            p pVar2 = jVar.f23713c;
            i iVar3 = jVar.f23711a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
