package g1;

import a2.x3;
import e1.v;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends x3 implements i {

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f56677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kv.l onDraw, kv.l inspectorInfo) {
        super(inspectorInfo);
        e0.checkNotNullParameter(onDraw, "onDraw");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56677e = onDraw;
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // g1.i
    public void draw(l1.e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        this.f56677e.invoke(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return e0.areEqual(this.f56677e, ((m) obj).f56677e);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final kv.l getOnDraw() {
        return this.f56677e;
    }

    public int hashCode() {
        return this.f56677e.hashCode();
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
