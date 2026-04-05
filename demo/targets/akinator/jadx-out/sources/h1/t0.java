package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements y1.b, y1.d {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f58611b;

    /* renamed from: c, reason: collision with root package name */
    public t0 f58612c;

    /* renamed from: e, reason: collision with root package name */
    public final r0.c f58613e;

    public t0(o0 focusRequester) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusRequester, "focusRequester");
        this.f58611b = focusRequester;
        this.f58613e = new r0.c(new s[16], 0);
        focusRequester.getFocusRequesterModifierLocals$ui_release().add(this);
    }

    public final void addFocusModifier(s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        this.f58613e.add(focusModifier);
        t0 t0Var = this.f58612c;
        if (t0Var != null) {
            t0Var.addFocusModifier(focusModifier);
        }
    }

    public final void addFocusModifiers(r0.c newModifiers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(newModifiers, "newModifiers");
        r0.c cVar = this.f58613e;
        cVar.addAll(cVar.getSize(), newModifiers);
        t0 t0Var = this.f58612c;
        if (t0Var != null) {
            t0Var.addFocusModifiers(newModifiers);
        }
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h1.s findFocusNode() {
        /*
            r9 = this;
            r0.c r0 = r9.f58613e
            int r1 = r0.getSize()
            r2 = 0
            if (r1 <= 0) goto L8a
            java.lang.Object[] r0 = r0.getContent()
            r3 = 0
        Le:
            r4 = r0[r3]
            h1.s r4 = (h1.s) r4
            if (r2 == 0) goto L85
            z1.u0 r5 = r2.getLayoutNodeWrapper()
            if (r5 == 0) goto L85
            z1.b0 r5 = r5.getLayoutNode$ui_release()
            if (r5 != 0) goto L21
            goto L85
        L21:
            z1.u0 r6 = r4.getLayoutNodeWrapper()
            if (r6 == 0) goto L86
            z1.b0 r6 = r6.getLayoutNode$ui_release()
            if (r6 != 0) goto L2e
            goto L86
        L2e:
            int r7 = r5.getDepth$ui_release()
            int r8 = r6.getDepth$ui_release()
            if (r7 <= r8) goto L40
            z1.b0 r5 = r5.getParent$ui_release()
            kotlin.jvm.internal.e0.checkNotNull(r5)
            goto L2e
        L40:
            int r7 = r6.getDepth$ui_release()
            int r8 = r5.getDepth$ui_release()
            if (r7 <= r8) goto L52
            z1.b0 r6 = r6.getParent$ui_release()
            kotlin.jvm.internal.e0.checkNotNull(r6)
            goto L40
        L52:
            z1.b0 r7 = r5.getParent$ui_release()
            z1.b0 r8 = r6.getParent$ui_release()
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r8)
            if (r7 != 0) goto L6f
            z1.b0 r5 = r5.getParent$ui_release()
            kotlin.jvm.internal.e0.checkNotNull(r5)
            z1.b0 r6 = r6.getParent$ui_release()
            kotlin.jvm.internal.e0.checkNotNull(r6)
            goto L52
        L6f:
            z1.b0 r7 = r5.getParent$ui_release()
            kotlin.jvm.internal.e0.checkNotNull(r7)
            r0.c r7 = r7.get_children$ui_release()
            int r5 = r7.indexOf(r5)
            int r6 = r7.indexOf(r6)
            if (r5 >= r6) goto L85
            goto L86
        L85:
            r2 = r4
        L86:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.t0.findFocusNode():h1.s");
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final o0 getFocusRequester() {
        return this.f58611b;
    }

    @Override // y1.d
    public y1.f getKey() {
        return r0.getModifierLocalFocusRequester();
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        t0 t0Var = (t0) scope.getCurrent(r0.getModifierLocalFocusRequester());
        if (kotlin.jvm.internal.e0.areEqual(t0Var, this.f58612c)) {
            return;
        }
        t0 t0Var2 = this.f58612c;
        r0.c cVar = this.f58613e;
        if (t0Var2 != null) {
            t0Var2.removeFocusModifiers(cVar);
        }
        if (t0Var != null) {
            t0Var.addFocusModifiers(cVar);
        }
        this.f58612c = t0Var;
    }

    public final void removeFocusModifier(s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        this.f58613e.remove(focusModifier);
        t0 t0Var = this.f58612c;
        if (t0Var != null) {
            t0Var.removeFocusModifier(focusModifier);
        }
    }

    public final void removeFocusModifiers(r0.c removedModifiers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(removedModifiers, "removedModifiers");
        this.f58613e.removeAll(removedModifiers);
        t0 t0Var = this.f58612c;
        if (t0Var != null) {
            t0Var.removeFocusModifiers(removedModifiers);
        }
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public t0 getValue() {
        return this;
    }
}
