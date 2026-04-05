package oc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends i {
    public a(jc.o oVar, jc.q qVar, wc.g gVar, mc.c0 c0Var) {
        super(oVar, qVar, gVar, c0Var);
    }

    @Override // oc.i
    public final Collection W(ub.u uVar, jc.k kVar, Collection collection) throws IOException {
        if (collection == null) {
            collection = new ArrayList();
        }
        Collection collectionW = super.W(uVar, kVar, collection);
        return collectionW.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collectionW.size(), false, collectionW);
    }

    @Override // oc.i
    public final Collection Y(jc.k kVar) {
        return null;
    }

    @Override // oc.i
    public final i a0(jc.q qVar, jc.q qVar2, wc.g gVar, mc.v vVar, Boolean bool) {
        return new a(this.f78873f, qVar2, gVar, this.f78868l, qVar, vVar, bool);
    }

    @Override // oc.i, oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }
}
