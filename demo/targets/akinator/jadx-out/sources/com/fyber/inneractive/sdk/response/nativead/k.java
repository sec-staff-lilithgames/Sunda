package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {
    public i N;

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return null;
    }

    public final e c() {
        f fVar;
        ArrayList arrayList;
        i iVar = this.N;
        if (iVar == null || (arrayList = iVar.f26676a) == null) {
            fVar = null;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar = (f) it.next();
                if (fVar.f26665c != null) {
                    break;
                }
            }
            fVar = null;
        }
        if (fVar != null) {
            return fVar.f26665c;
        }
        return null;
    }

    public final boolean d() {
        String str;
        e eVarC = c();
        return (eVarC == null || (str = eVarC.f26662a) == null || str.isEmpty()) ? false : true;
    }
}
