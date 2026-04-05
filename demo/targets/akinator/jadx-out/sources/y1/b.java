package y1;

import e1.u;
import e1.v;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface b extends u {
    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean all(l lVar) {
        return super.all(lVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default boolean any(l lVar) {
        return super.any(lVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldIn(Object obj, p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default Object foldOut(Object obj, p pVar) {
        return super.foldOut(obj, pVar);
    }

    void onModifierLocalsUpdated(e eVar);

    @Override // e1.u, e1.v
    /* bridge */ /* synthetic */ default v then(v vVar) {
        return super.then(vVar);
    }
}
