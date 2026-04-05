package h1;

import a2.x3;
import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends x3 implements y1.b, y1.d {

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f58578e;

    /* renamed from: f, reason: collision with root package name */
    public final j2 f58579f;

    /* renamed from: g, reason: collision with root package name */
    public final y1.f f58580g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kv.l focusPropertiesScope, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(focusPropertiesScope, "focusPropertiesScope");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f58578e = focusPropertiesScope;
        this.f58579f = o5.mutableStateOf$default(null, null, 2, null);
        this.f58580g = k0.getModifierLocalFocusProperties();
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final void calculateProperties(h0 focusProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusProperties, "focusProperties");
        this.f58578e.invoke(focusProperties);
        m0 m0Var = (m0) this.f58579f.getValue();
        if (m0Var != null) {
            m0Var.calculateProperties(focusProperties);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof m0) {
            return kotlin.jvm.internal.e0.areEqual(this.f58578e, ((m0) obj).f58578e);
        }
        return false;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final kv.l getFocusPropertiesScope() {
        return this.f58578e;
    }

    @Override // y1.d
    public y1.f getKey() {
        return this.f58580g;
    }

    public int hashCode() {
        return this.f58578e.hashCode();
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f58579f.setValue((m0) scope.getCurrent(k0.getModifierLocalFocusProperties()));
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public m0 getValue() {
        return this;
    }
}
