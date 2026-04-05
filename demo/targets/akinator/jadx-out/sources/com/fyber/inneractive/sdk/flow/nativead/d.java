package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {

    /* renamed from: m, reason: collision with root package name */
    public final String f23681m = "Native";

    /* renamed from: n, reason: collision with root package name */
    public f f23682n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f23663c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.f23682n;
        if (fVar != null) {
            fVar.f23689d.clear();
            fVar.f23691f = null;
            Iterator it = fVar.f23686a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.f23686a.clear();
            this.f23682n = null;
        }
        this.f23671k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(this.f23672l);
        this.f23661a = null;
        this.f23662b = null;
        this.f23663c = null;
        this.f23664d = null;
        this.f23665e = null;
        this.f23666f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).T.N == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f23667g;
        InneractiveAdRequest inneractiveAdRequest = this.f23661a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.f23662b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.T.N, this, this.f23681m);
        this.f23682n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d dVarA = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.f23694i, fVar.f23696k, fVar.f23693h, fVar.f23688c, fVar.f23695j, fVar);
        if (dVarA == null) {
            if (fVar.f23692g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f23691f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f23662b, dVar.f23661a, "send_failed_native_creatives", dVar.f23667g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f23686a.add(dVarA);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f23686a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.f23688c.f26676a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it = fVar.f23688c.f26676a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar2 != null && fVar2.f26663a != 2 && fVar2.f26666d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.f23697l));
        Iterator it2 = fVar.f23686a.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).b();
        }
    }
}
