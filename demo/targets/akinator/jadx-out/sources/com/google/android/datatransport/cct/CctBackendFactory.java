package com.google.android.datatransport.cct;

import kd.d;
import nd.e;
import nd.j;
import nd.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class CctBackendFactory implements e {
    @Override // nd.e
    public o create(j jVar) {
        return new d(jVar.getApplicationContext(), jVar.getWallClock(), jVar.getMonotonicClock());
    }
}
