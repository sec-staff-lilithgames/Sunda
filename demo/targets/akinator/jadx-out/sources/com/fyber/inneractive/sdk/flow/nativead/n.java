package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f23735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f23736d;

    public n(p pVar, i iVar, String str, com.fyber.inneractive.sdk.util.g gVar) {
        this.f23736d = pVar;
        this.f23733a = iVar;
        this.f23734b = str;
        this.f23735c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f23160a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f23736d;
            i iVar = this.f23733a;
            String str = this.f23734b;
            com.fyber.inneractive.sdk.util.g gVar = this.f23735c;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f23740b, str);
            if (v.a(str)) {
                o oVar = new o(pVar, iVar, gVar);
                k kVar = ((j) pVar.f23741a).f23712b;
                if (kVar != null) {
                    kVar.a(str, true, gVar, oVar);
                    return;
                }
                return;
            }
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
