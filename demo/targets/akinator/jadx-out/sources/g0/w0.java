package g0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w0 extends a2.x3 implements y1.b, y1.d {

    /* renamed from: e, reason: collision with root package name */
    public final p0.j2 f56609e;

    public w0(kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f56609e = o5.mutableStateOf$default(y3.WindowInsets(0, 0, 0, 0), null, 2, null);
    }

    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public abstract v3 calculateInsets(v3 v3Var);

    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return a4.getModifierLocalConsumedWindowInsets();
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f56609e.setValue(calculateInsets((v3) scope.getCurrent(a4.getModifierLocalConsumedWindowInsets())));
    }

    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public v3 getValue() {
        return (v3) this.f56609e.getValue();
    }
}
