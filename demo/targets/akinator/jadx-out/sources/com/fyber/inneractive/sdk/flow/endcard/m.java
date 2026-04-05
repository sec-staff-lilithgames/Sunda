package com.fyber.inneractive.sdk.flow.endcard;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23609a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23610b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f23611c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final g f23612d = new g();

    public final b a() {
        int i10 = this.f23611c;
        if (i10 >= 0) {
            return (b) this.f23609a.get(i10);
        }
        return null;
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        Iterator it = this.f23610b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.f23609a.contains(bVar)) {
            return;
        }
        this.f23609a.add(bVar);
        this.f23609a.sort(this.f23612d);
    }
}
