package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements y1.d, y1.b {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f58573b;

    /* renamed from: c, reason: collision with root package name */
    public l f58574c;

    /* renamed from: e, reason: collision with root package name */
    public final r0.c f58575e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.c f58576f;

    public l(kv.l onFocusEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        this.f58573b = onFocusEvent;
        this.f58575e = new r0.c(new l[16], 0);
        this.f58576f = new r0.c(new s[16], 0);
    }

    public final void a(r0.c cVar) {
        r0.c cVar2 = this.f58576f;
        cVar2.addAll(cVar2.getSize(), cVar);
        l lVar = this.f58574c;
        if (lVar != null) {
            lVar.a(cVar);
        }
    }

    public final void addFocusModifier(s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        this.f58576f.add(focusModifier);
        l lVar = this.f58574c;
        if (lVar != null) {
            lVar.addFocusModifier(focusModifier);
        }
    }

    @Override // y1.d, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.d, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final void b(r0.c cVar) {
        this.f58576f.removeAll(cVar);
        l lVar = this.f58574c;
        if (lVar != null) {
            lVar.b(cVar);
        }
    }

    @Override // y1.d, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.d, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return i.getModifierLocalFocusEvent();
    }

    public final kv.l getOnFocusEvent() {
        return this.f58573b;
    }

    public final void notifyIfNoFocusModifiers() {
        if (this.f58576f.isEmpty()) {
            this.f58573b.invoke(w0.f58619h);
        }
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        l lVar = (l) scope.getCurrent(i.getModifierLocalFocusEvent());
        if (!kotlin.jvm.internal.e0.areEqual(lVar, this.f58574c)) {
            l lVar2 = this.f58574c;
            r0.c cVar = this.f58576f;
            if (lVar2 != null) {
                lVar2.f58575e.remove(this);
                lVar2.b(cVar);
            }
            this.f58574c = lVar;
            if (lVar != null) {
                lVar.f58575e.add(this);
                lVar.a(cVar);
            }
        }
        this.f58574c = (l) scope.getCurrent(i.getModifierLocalFocusEvent());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void propagateFocusEvent() {
        /*
            r10 = this;
            r0.c r0 = r10.f58576f
            int r1 = r0.getSize()
            h1.w0 r2 = h1.w0.f58619h
            if (r1 == 0) goto L6c
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L60
            int r1 = r0.getSize()
            r5 = 0
            if (r1 <= 0) goto L49
            java.lang.Object[] r0 = r0.getContent()
            r6 = r5
        L1a:
            r7 = r0[r3]
            h1.s r7 = (h1.s) r7
            h1.w0 r8 = r7.getFocusState()
            int r8 = r8.ordinal()
            if (r8 == 0) goto L3f
            if (r8 == r4) goto L3f
            r9 = 2
            if (r8 == r9) goto L3f
            r9 = 3
            if (r8 == r9) goto L3a
            r9 = 4
            if (r8 == r9) goto L3f
            r7 = 5
            if (r8 == r7) goto L37
            goto L42
        L37:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L42
        L3a:
            if (r5 != 0) goto L42
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L42
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = r7
        L42:
            int r3 = r3 + 1
            if (r3 < r1) goto L1a
            r0 = r5
            r5 = r6
            goto L4a
        L49:
            r0 = r5
        L4a:
            if (r5 == 0) goto L55
            h1.w0 r1 = r5.getFocusState()
            if (r1 != 0) goto L53
            goto L55
        L53:
            r2 = r1
            goto L6c
        L55:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r1)
            if (r0 == 0) goto L6c
            h1.w0 r2 = h1.w0.f58617f
            goto L6c
        L60:
            java.lang.Object[] r0 = r0.getContent()
            r0 = r0[r3]
            h1.s r0 = (h1.s) r0
            h1.w0 r2 = r0.getFocusState()
        L6c:
            kv.l r0 = r10.f58573b
            r0.invoke(r2)
            h1.l r0 = r10.f58574c
            if (r0 == 0) goto L78
            r0.propagateFocusEvent()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.l.propagateFocusEvent():void");
    }

    public final void removeFocusModifier(s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        this.f58576f.remove(focusModifier);
        l lVar = this.f58574c;
        if (lVar != null) {
            lVar.removeFocusModifier(focusModifier);
        }
    }

    @Override // y1.d, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public l getValue() {
        return this;
    }
}
