package h1;

import a2.t3;
import a2.x3;
import x1.l1;
import z1.s1;
import z1.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends x3 implements y1.b, y1.d, t1, l1 {

    /* renamed from: s, reason: collision with root package name */
    public static final a f58593s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final r f58594t = r.f58590e;

    /* renamed from: e, reason: collision with root package name */
    public s f58595e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.c f58596f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f58597g;

    /* renamed from: h, reason: collision with root package name */
    public s f58598h;

    /* renamed from: i, reason: collision with root package name */
    public l f58599i;

    /* renamed from: j, reason: collision with root package name */
    public r1.b f58600j;

    /* renamed from: k, reason: collision with root package name */
    public y1.e f58601k;

    /* renamed from: l, reason: collision with root package name */
    public m0 f58602l;

    /* renamed from: m, reason: collision with root package name */
    public final i0 f58603m;

    /* renamed from: n, reason: collision with root package name */
    public t0 f58604n;

    /* renamed from: o, reason: collision with root package name */
    public z1.u0 f58605o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f58606p;

    /* renamed from: q, reason: collision with root package name */
    public s1.g f58607q;

    /* renamed from: r, reason: collision with root package name */
    public final r0.c f58608r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final kv.l getRefreshFocusProperties() {
            return s.f58594t;
        }
    }

    public /* synthetic */ s(w0 w0Var, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(w0Var, (i10 & 2) != 0 ? t3.getNoInspectorInfo() : lVar);
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

    public final x1.f getBeyondBoundsLayoutParent() {
        return null;
    }

    public final r0.c getChildren() {
        return this.f58596f;
    }

    public final l getFocusEventListener() {
        return this.f58599i;
    }

    public final h0 getFocusProperties() {
        return this.f58603m;
    }

    public final m0 getFocusPropertiesModifier() {
        return this.f58602l;
    }

    public final boolean getFocusRequestedOnPlaced() {
        return this.f58606p;
    }

    public final t0 getFocusRequester() {
        return this.f58604n;
    }

    public final w0 getFocusState() {
        return this.f58597g;
    }

    public final s getFocusedChild() {
        return this.f58598h;
    }

    @Override // y1.d
    public y1.f getKey() {
        return x.getModifierLocalParentFocusModifier();
    }

    public final r0.c getKeyInputChildren() {
        return this.f58608r;
    }

    public final s1.g getKeyInputModifier() {
        return this.f58607q;
    }

    public final z1.u0 getLayoutNodeWrapper() {
        return this.f58605o;
    }

    public final y1.e getModifierLocalReadScope() {
        y1.e eVar = this.f58601k;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("modifierLocalReadScope");
        return null;
    }

    public final s getParent() {
        return this.f58595e;
    }

    @Override // z1.t1
    public boolean isValid() {
        return this.f58595e != null;
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        r0.c cVar;
        r0.c cVar2;
        int iOrdinal;
        z1.u0 u0Var;
        z1.b0 layoutNode$ui_release;
        s1 owner$ui_release;
        m focusManager;
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        setModifierLocalReadScope(scope);
        s sVar = (s) scope.getCurrent(x.getModifierLocalParentFocusModifier());
        if (!kotlin.jvm.internal.e0.areEqual(sVar, this.f58595e)) {
            if (sVar == null && (((iOrdinal = this.f58597g.ordinal()) == 0 || iOrdinal == 2) && (u0Var = this.f58605o) != null && (layoutNode$ui_release = u0Var.getLayoutNode$ui_release()) != null && (owner$ui_release = layoutNode$ui_release.getOwner$ui_release()) != null && (focusManager = owner$ui_release.getFocusManager()) != null)) {
                focusManager.clearFocus(true);
            }
            s sVar2 = this.f58595e;
            if (sVar2 != null && (cVar2 = sVar2.f58596f) != null) {
                cVar2.remove(this);
            }
            if (sVar != null && (cVar = sVar.f58596f) != null) {
                cVar.add(this);
            }
        }
        this.f58595e = sVar;
        l lVar = (l) scope.getCurrent(i.getModifierLocalFocusEvent());
        if (!kotlin.jvm.internal.e0.areEqual(lVar, this.f58599i)) {
            l lVar2 = this.f58599i;
            if (lVar2 != null) {
                lVar2.removeFocusModifier(this);
            }
            if (lVar != null) {
                lVar.addFocusModifier(this);
            }
        }
        this.f58599i = lVar;
        t0 t0Var = (t0) scope.getCurrent(r0.getModifierLocalFocusRequester());
        if (!kotlin.jvm.internal.e0.areEqual(t0Var, this.f58604n)) {
            t0 t0Var2 = this.f58604n;
            if (t0Var2 != null) {
                t0Var2.removeFocusModifier(this);
            }
            if (t0Var != null) {
                t0Var.addFocusModifier(this);
            }
        }
        this.f58604n = t0Var;
        this.f58600j = (r1.b) scope.getCurrent(w1.c.getModifierLocalRotaryScrollParent());
        if (scope.getCurrent(x1.h.getModifierLocalBeyondBoundsLayout()) != null) {
            throw new ClassCastException();
        }
        this.f58607q = (s1.g) scope.getCurrent(s1.i.getModifierLocalKeyInput());
        this.f58602l = (m0) scope.getCurrent(k0.getModifierLocalFocusProperties());
        k0.refreshFocusProperties(this);
    }

    @Override // x1.l1
    public void onPlaced(x1.d0 coordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
        boolean z10 = this.f58605o == null;
        this.f58605o = (z1.u0) coordinates;
        if (z10) {
            k0.refreshFocusProperties(this);
        }
        if (this.f58606p) {
            this.f58606p = false;
            x0.requestFocus(this);
        }
    }

    public final boolean propagateRotaryEvent(w1.d event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        r1.b bVar = this.f58600j;
        if (bVar != null) {
            return bVar.propagateFocusAwareEvent(event);
        }
        return false;
    }

    public final void setFocusEventListener(l lVar) {
        this.f58599i = lVar;
    }

    public final void setFocusPropertiesModifier(m0 m0Var) {
        this.f58602l = m0Var;
    }

    public final void setFocusRequestedOnPlaced(boolean z10) {
        this.f58606p = z10;
    }

    public final void setFocusRequester(t0 t0Var) {
        this.f58604n = t0Var;
    }

    public final void setFocusState(w0 value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f58597g = value;
        x0.sendOnFocusEvent(this);
    }

    public final void setFocusedChild(s sVar) {
        this.f58598h = sVar;
    }

    public final void setLayoutNodeWrapper(z1.u0 u0Var) {
        this.f58605o = u0Var;
    }

    public final void setModifierLocalReadScope(y1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<set-?>");
        this.f58601k = eVar;
    }

    public final void setParent(s sVar) {
        this.f58595e = sVar;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public s getValue() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w0 initialFocus, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(initialFocus, "initialFocus");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f58596f = new r0.c(new s[16], 0);
        this.f58597g = initialFocus;
        this.f58603m = new i0();
        this.f58608r = new r0.c(new s1.g[16], 0);
    }

    public final void setBeyondBoundsLayoutParent(x1.f fVar) {
    }
}
