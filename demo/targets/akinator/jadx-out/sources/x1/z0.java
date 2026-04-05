package x1;

import java.util.Map;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f91450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91451b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f91452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f91454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f91455f;

    public z0(a1 a1Var, int i10, int i11, Map map, kv.l lVar) {
        this.f91453d = i10;
        this.f91454e = a1Var;
        this.f91455f = lVar;
        this.f91450a = i10;
        this.f91451b = i11;
        this.f91452c = map;
    }

    @Override // x1.y0
    public Map<a, Integer> getAlignmentLines() {
        return this.f91452c;
    }

    @Override // x1.y0
    public int getHeight() {
        return this.f91451b;
    }

    @Override // x1.y0
    public int getWidth() {
        return this.f91450a;
    }

    @Override // x1.y0
    public void placeChildren() {
        q1.a.C0808a c0808a = q1.a.f91406a;
        s2.x layoutDirection = this.f91454e.getLayoutDirection();
        int iAccess$getParentWidth = q1.a.C0808a.access$getParentWidth(c0808a);
        s2.x xVarAccess$getParentLayoutDirection = q1.a.C0808a.access$getParentLayoutDirection(c0808a);
        q1.a.f91408c = this.f91453d;
        q1.a.f91407b = layoutDirection;
        this.f91455f.invoke(c0808a);
        q1.a.f91408c = iAccess$getParentWidth;
        q1.a.f91407b = xVarAccess$getParentLayoutDirection;
    }
}
