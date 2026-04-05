package i0;

import e1.v;
import kotlin.jvm.internal.e0;
import x1.d0;
import x1.l1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b implements y1.b, l1 {

    /* renamed from: b, reason: collision with root package name */
    public final e f59297b;

    /* renamed from: c, reason: collision with root package name */
    public e f59298c;

    /* renamed from: e, reason: collision with root package name */
    public d0 f59299e;

    public b(e defaultParent) {
        e0.checkNotNullParameter(defaultParent, "defaultParent");
        this.f59297b = defaultParent;
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
        this.f59298c = (e) scope.getCurrent(d.getModifierLocalBringIntoViewParent());
    }

    @Override // x1.l1
    public void onPlaced(d0 coordinates) {
        e0.checkNotNullParameter(coordinates, "coordinates");
        this.f59299e = coordinates;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
