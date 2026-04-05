package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 implements g1.i {

    /* renamed from: b, reason: collision with root package name */
    public final t2 f51671b;

    public x2(t2 indicationInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(indicationInstance, "indicationInstance");
        this.f51671b = indicationInstance;
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
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        this.f51671b.drawIndication(eVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final t2 getIndicationInstance() {
        return this.f51671b;
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
