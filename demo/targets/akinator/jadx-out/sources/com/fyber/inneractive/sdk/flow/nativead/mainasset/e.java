package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.nativead.i;
import com.fyber.inneractive.sdk.response.nativead.j;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {
    public static d a(r rVar, j jVar, InneractiveAdRequest inneractiveAdRequest, i iVar, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar) {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        String str2;
        ArrayList arrayList = iVar.f26676a;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        Iterator it = iVar.f26676a.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
            if (fVar2.f26663a == 3 && jVar.T.d()) {
                return new f(fVar2, rVar, jVar, inneractiveAdRequest, str, fVar);
            }
            r rVar2 = rVar;
            j jVar2 = jVar;
            InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest;
            String str3 = str;
            com.fyber.inneractive.sdk.flow.nativead.f fVar3 = fVar;
            if (fVar2.f26663a == 2 && (cVar = fVar2.f26666d) != null && (str2 = cVar.f26660a) != null && !str2.trim().isEmpty()) {
                return new b(fVar2, fVar3, jVar2, rVar2);
            }
            rVar = rVar2;
            jVar = jVar2;
            inneractiveAdRequest = inneractiveAdRequest2;
            str = str3;
            fVar = fVar3;
        }
        return null;
    }
}
