package g1;

import e1.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g extends i {
    @Override // g1.i, e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // g1.i, e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // g1.i
    /* synthetic */ void draw(l1.e eVar);

    @Override // g1.i, e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g1.i, e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    void onBuildCache(b bVar);

    @Override // g1.i, e1.u, e1.v
    /* bridge */ /* synthetic */ default v then(v vVar) {
        return super.then(vVar);
    }
}
