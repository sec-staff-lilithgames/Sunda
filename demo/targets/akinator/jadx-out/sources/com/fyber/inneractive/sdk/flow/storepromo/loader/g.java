package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.l0;
import com.fyber.inneractive.sdk.network.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v f23824a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f23825b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f23826c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c f23827d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23829f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23828e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f23830g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23831h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23832i = false;

    public g(v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f23824a = vVar;
        this.f23829f = vVar.f24149f.size();
        this.f23826c = bVar;
        this.f23827d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z10, String str, String str2) {
        f fVar;
        this.f23825b.countDown();
        if (this.f23832i) {
            return;
        }
        if (z10) {
            this.f23832i = true;
            this.f23831h = true;
            a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f23826c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f23825b.getCount() != 0 || this.f23831h) {
            return;
        }
        this.f23832i = true;
        Collections.sort(this.f23827d.f23866a);
        this.f23828e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.f23826c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.f23827d;
            IAlog.a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.f23783b, bVar2.f23784c);
            bVar2.f23785d = bVar3;
            bVar2.f23788g = cVar.f23874i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.f23794c;
            if (cVar2 == null || (fVar = cVar2.f23804d) == null) {
                return;
            }
            r.f26803a.execute(new e(fVar, new d(fVar)));
        }
    }

    public final void a() {
        Iterator it = this.f23828e.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            l0 l0Var = IAConfigManager.O.f23224s;
            String str = t0Var.f24288g;
            l0Var.getClass();
            t0Var.c();
        }
        this.f23828e.clear();
    }
}
