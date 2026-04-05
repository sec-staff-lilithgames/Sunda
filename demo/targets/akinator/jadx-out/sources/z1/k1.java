package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f97331b;

    /* renamed from: c, reason: collision with root package name */
    public final y1.d f97332c;

    /* renamed from: e, reason: collision with root package name */
    public k1 f97333e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f97334f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97335g;

    /* renamed from: h, reason: collision with root package name */
    public final r0.c f97336h;

    public k1(b0 layoutNode, y1.d modifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        this.f97331b = layoutNode;
        this.f97332c = modifier;
        this.f97336h = new r0.c(new i1[16], 0);
    }

    public final void a(y1.a aVar, boolean z10) {
        tu.x0 x0Var;
        r0.c cVar;
        int size;
        if (z10 && kotlin.jvm.internal.e0.areEqual(this.f97332c.getKey(), aVar)) {
            return;
        }
        r0.c cVar2 = this.f97336h;
        int size2 = cVar2.getSize();
        int i10 = 0;
        if (size2 > 0) {
            Object[] content = cVar2.getContent();
            int i11 = 0;
            do {
                ((i1) content[i11]).invalidateConsumersOf(aVar);
                i11++;
            } while (i11 < size2);
        }
        k1 k1Var = this.f97333e;
        if (k1Var != null) {
            k1Var.a(aVar, true);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var != null || (size = (cVar = this.f97331b.get_children$ui_release()).getSize()) <= 0) {
            return;
        }
        Object[] content2 = cVar.getContent();
        do {
            ((b0) content2[i10]).getModifierLocalsHead$ui_release().a(aVar, true);
            i10++;
        } while (i10 < size);
    }

    public final void attach() {
        this.f97335g = true;
        int i10 = 0;
        a(this.f97332c.getKey(), false);
        r0.c cVar = this.f97336h;
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            do {
                ((i1) content[i10]).attach();
                i10++;
            } while (i10 < size);
        }
    }

    public final void attachDelayed() {
        this.f97335g = true;
        s1 owner$ui_release = this.f97331b.getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.registerOnEndApplyChangesListener(this);
        }
        r0.c cVar = this.f97336h;
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((i1) content[i10]).attachDelayed();
                i10++;
            } while (i10 < size);
        }
    }

    public final void detach() {
        this.f97335g = false;
        r0.c cVar = this.f97336h;
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                ((i1) content[i10]).detach();
                i10++;
            } while (i10 < size);
        }
        a(this.f97332c.getKey(), false);
    }

    public final y1.d findModifierLocalProvider(y1.a local) {
        k1 modifierLocalsTail$ui_release;
        y1.d dVarFindModifierLocalProvider;
        kotlin.jvm.internal.e0.checkNotNullParameter(local, "local");
        y1.d dVar = this.f97332c;
        if (kotlin.jvm.internal.e0.areEqual(dVar.getKey(), local)) {
            return dVar;
        }
        k1 k1Var = this.f97334f;
        if (k1Var != null && (dVarFindModifierLocalProvider = k1Var.findModifierLocalProvider(local)) != null) {
            return dVarFindModifierLocalProvider;
        }
        b0 parent$ui_release = this.f97331b.getParent$ui_release();
        if (parent$ui_release == null || (modifierLocalsTail$ui_release = parent$ui_release.getModifierLocalsTail$ui_release()) == null) {
            return null;
        }
        return modifierLocalsTail$ui_release.findModifierLocalProvider(local);
    }

    public final r0.c getConsumers() {
        return this.f97336h;
    }

    public final b0 getLayoutNode() {
        return this.f97331b;
    }

    public final y1.d getModifier() {
        return this.f97332c;
    }

    public final k1 getNext() {
        return this.f97333e;
    }

    public final k1 getPrev() {
        return this.f97334f;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8046invoke();
        return tu.x0.f87415a;
    }

    public final boolean isAttached() {
        return this.f97335g;
    }

    public final void setNext(k1 k1Var) {
        this.f97333e = k1Var;
    }

    public final void setPrev(k1 k1Var) {
        this.f97334f = k1Var;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m8046invoke() {
        if (this.f97335g) {
            a(this.f97332c.getKey(), false);
        }
    }
}
