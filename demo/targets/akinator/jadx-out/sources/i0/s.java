package i0;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScopeKt;
import tu.v;
import tu.x0;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends b implements y1.d, e {

    /* renamed from: f, reason: collision with root package name */
    public m f59334f;

    /* renamed from: g, reason: collision with root package name */
    public v f59335g;

    /* renamed from: h, reason: collision with root package name */
    public v f59336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e defaultParent) {
        super(defaultParent);
        e0.checkNotNullParameter(defaultParent, "defaultParent");
    }

    public static final Object access$dispatchRequest(s sVar, v vVar, d0 d0Var, zu.d dVar) {
        sVar.f59336h = vVar;
        i1.j jVar = (i1.j) vVar.getFirst();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new r(sVar, sVar.getResponder().calculateRectForParent(jVar), d0Var, jVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // i0.e
    public Object bringChildIntoView(i1.j jVar, d0 d0Var, zu.d<? super x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new p(this, d0Var, jVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return d.getModifierLocalBringIntoViewParent();
    }

    public final m getResponder() {
        m mVar = this.f59334f;
        if (mVar != null) {
            return mVar;
        }
        e0.throwUninitializedPropertyAccessException("responder");
        return null;
    }

    public final void setResponder(m mVar) {
        e0.checkNotNullParameter(mVar, "<set-?>");
        this.f59334f = mVar;
    }

    @Override // i0.b, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public e getValue() {
        return this;
    }
}
