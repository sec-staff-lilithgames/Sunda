package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public v f72169a;

    /* renamed from: b, reason: collision with root package name */
    public h1.m f72170b;

    @Override // l0.u
    /* renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo5279defaultKeyboardActionKlQnJC8(int i10) {
        m2.l lVar = m2.m.f73932b;
        if (m2.m.m5603equalsimpl0(i10, lVar.m5595getNexteUduSuo())) {
            getFocusManager().mo4142moveFocus3ESFkO8(h1.f.f58545b.m4125getNextdhqQ8s());
        } else {
            if (m2.m.m5603equalsimpl0(i10, lVar.m5597getPreviouseUduSuo())) {
                getFocusManager().mo4142moveFocus3ESFkO8(h1.f.f58545b.m4127getPreviousdhqQ8s());
                return;
            }
            if (m2.m.m5603equalsimpl0(i10, lVar.m5593getDoneeUduSuo()) ? true : m2.m.m5603equalsimpl0(i10, lVar.m5594getGoeUduSuo()) ? true : m2.m.m5603equalsimpl0(i10, lVar.m5598getSearcheUduSuo()) ? true : m2.m.m5603equalsimpl0(i10, lVar.m5599getSendeUduSuo()) ? true : m2.m.m5603equalsimpl0(i10, lVar.m5592getDefaulteUduSuo())) {
                return;
            }
            m2.m.m5603equalsimpl0(i10, lVar.m5596getNoneeUduSuo());
        }
    }

    public final h1.m getFocusManager() {
        h1.m mVar = this.f72170b;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    public final v getKeyboardActions() {
        v vVar = this.f72169a;
        if (vVar != null) {
            return vVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m5280runActionKlQnJC8(int i10) {
        kv.l onSend;
        m2.l lVar = m2.m.f73932b;
        tu.x0 x0Var = null;
        if (m2.m.m5603equalsimpl0(i10, lVar.m5593getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (m2.m.m5603equalsimpl0(i10, lVar.m5594getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (m2.m.m5603equalsimpl0(i10, lVar.m5595getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (m2.m.m5603equalsimpl0(i10, lVar.m5597getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (m2.m.m5603equalsimpl0(i10, lVar.m5598getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (m2.m.m5603equalsimpl0(i10, lVar.m5599getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(m2.m.m5603equalsimpl0(i10, lVar.m5592getDefaulteUduSuo()) ? true : m2.m.m5603equalsimpl0(i10, lVar.m5596getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            x0Var = tu.x0.f87415a;
        }
        if (x0Var == null) {
            mo5279defaultKeyboardActionKlQnJC8(i10);
        }
    }

    public final void setFocusManager(h1.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<set-?>");
        this.f72170b = mVar;
    }

    public final void setKeyboardActions(v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<set-?>");
        this.f72169a = vVar;
    }
}
