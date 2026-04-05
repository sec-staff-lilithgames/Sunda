package j0;

import e0.p3;
import e1.v;
import kotlin.jvm.internal.e0;
import p0.j2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements y1.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f68784b;

    public h(j2 j2Var) {
        this.f68784b = j2Var;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f68784b.setValue(scope.getCurrent(p3.getModifierLocalScrollableContainer()));
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
