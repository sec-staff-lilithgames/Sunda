package ej;

import bj.b1;
import bj.z0;
import hj.v;
import nj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54417a;

    public f(h hVar) {
        this.f54417a = hVar;
    }

    @Override // hj.v
    public void onFinish() {
        b1 b1Var;
        h hVar = this.f54417a;
        j jVar = hVar.f54422j;
        if (jVar.f54434m != null && (b1Var = jVar.f54435n) != null) {
            ((q) b1Var).messageDismissed(z0.f9690c);
        }
        j.a(hVar.f54422j, hVar.f54420h);
    }
}
