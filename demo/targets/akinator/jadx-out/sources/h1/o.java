package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    public final s f58583a;

    /* renamed from: b, reason: collision with root package name */
    public final e1.v f58584b;

    /* renamed from: c, reason: collision with root package name */
    public s2.x f58585c;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // h1.m
    public void clearFocus(boolean z10) {
        w0 w0Var;
        s sVar = this.f58583a;
        w0 focusState = sVar.getFocusState();
        if (x0.clearFocus(sVar, z10)) {
            int iOrdinal = focusState.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                w0Var = w0.f58614b;
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                w0Var = w0.f58617f;
            } else {
                if (iOrdinal != 5) {
                    throw new tu.t();
                }
                w0Var = w0.f58619h;
            }
            sVar.setFocusState(w0Var);
        }
    }

    public final void fetchUpdatedFocusProperties() {
        q.b(this.f58583a);
    }

    public final s getActiveFocusModifier$ui_release() {
        return q.a(this.f58583a);
    }

    public final s2.x getLayoutDirection() {
        s2.x xVar = this.f58585c;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    public final e1.v getModifier() {
        return this.f58584b;
    }

    @Override // h1.m
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo4142moveFocus3ESFkO8(int i10) {
        boolean zMo4142moveFocus3ESFkO8;
        s sVar = this.f58583a;
        s sVarFindActiveFocusNode = z0.findActiveFocusNode(sVar);
        if (sVarFindActiveFocusNode != null) {
            o0 o0VarM4130customFocusSearchOMvw8 = e0.m4130customFocusSearchOMvw8(sVarFindActiveFocusNode, i10, getLayoutDirection());
            if (!kotlin.jvm.internal.e0.areEqual(o0VarM4130customFocusSearchOMvw8, o0.f58586b.getDefault())) {
                o0VarM4130customFocusSearchOMvw8.requestFocus();
                return true;
            }
            if (!z0.m4144focusSearchsMXa3k8(sVar, i10, getLayoutDirection(), new n(sVarFindActiveFocusNode))) {
                if (sVar.getFocusState().getHasFocus() && !sVar.getFocusState().isFocused()) {
                    e eVar = f.f58545b;
                    if (f.m4136equalsimpl0(i10, eVar.m4125getNextdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4127getPreviousdhqQ8s())) {
                        clearFocus(false);
                        if (sVar.getFocusState().isFocused()) {
                            zMo4142moveFocus3ESFkO8 = mo4142moveFocus3ESFkO8(i10);
                        }
                        if (!zMo4142moveFocus3ESFkO8) {
                        }
                    }
                }
                zMo4142moveFocus3ESFkO8 = false;
                if (!zMo4142moveFocus3ESFkO8) {
                }
            }
            return true;
        }
        return false;
    }

    public final void releaseFocus() {
        x0.clearFocus(this.f58583a, true);
    }

    public final void setLayoutDirection(s2.x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<set-?>");
        this.f58585c = xVar;
    }

    public final void takeFocus() {
        s sVar = this.f58583a;
        if (sVar.getFocusState() == w0.f58619h) {
            sVar.setFocusState(w0.f58614b);
        }
    }

    public o(s focusModifier) {
        kotlin.jvm.internal.e0.checkNotNullParameter(focusModifier, "focusModifier");
        this.f58583a = focusModifier;
        this.f58584b = x.focusTarget(e1.t.f53496b, focusModifier);
    }

    public /* synthetic */ o(s sVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new s(w0.f58619h, null, 2, null) : sVar);
    }
}
