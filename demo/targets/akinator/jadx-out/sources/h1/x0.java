package h1;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import z1.s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class x0 {
    public static final boolean a(s sVar) {
        s focusedChild = sVar.getFocusedChild();
        if (focusedChild == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!clearFocus$default(focusedChild, false, 1, null)) {
            return false;
        }
        sVar.setFocusedChild(null);
        return true;
    }

    public static final void activateNode(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal == 3) {
            sVar.setFocusState(w0.f58619h);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            sVar.setFocusState(w0.f58615c);
        }
    }

    public static final void b(s sVar) {
        w0 w0Var;
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            w0Var = w0.f58614b;
        } else if (iOrdinal == 2) {
            w0Var = w0.f58616e;
        } else {
            if (iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Granting focus to a deactivated node.");
            }
            if (iOrdinal != 5) {
                throw new tu.t();
            }
            w0Var = w0.f58614b;
        }
        sVar.setFocusState(w0Var);
    }

    public static final boolean c(s sVar, s sVar2) {
        z1.b0 layoutNode$ui_release;
        s1 owner$ui_release;
        if (!sVar.getChildren().contains(sVar2)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal == 0) {
            sVar.setFocusState(w0.f58615c);
            sVar.setFocusedChild(sVar2);
            b(sVar2);
            return true;
        }
        if (iOrdinal == 1) {
            if (!a(sVar)) {
                return false;
            }
            sVar.setFocusedChild(sVar2);
            b(sVar2);
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3) {
            activateNode(sVar);
            boolean zC = c(sVar, sVar2);
            deactivateNode(sVar);
            return zC;
        }
        if (iOrdinal == 4) {
            if (sVar.getFocusedChild() == null) {
                sVar.setFocusedChild(sVar2);
                b(sVar2);
                return true;
            }
            if (!a(sVar)) {
                return false;
            }
            sVar.setFocusedChild(sVar2);
            b(sVar2);
            return true;
        }
        if (iOrdinal != 5) {
            throw new tu.t();
        }
        s parent = sVar.getParent();
        if (parent == null) {
            z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
            if (layoutNodeWrapper == null || (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode$ui_release()) == null || (owner$ui_release = layoutNode$ui_release.getOwner$ui_release()) == null) {
                throw new IllegalStateException("Owner not initialized.");
            }
            if (owner$ui_release.requestFocus()) {
                sVar.setFocusState(w0.f58614b);
                return c(sVar, sVar2);
            }
        }
        if (parent == null || !c(parent, sVar)) {
            return false;
        }
        return c(sVar, sVar2);
    }

    public static final boolean captureFocus(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal == 0) {
            sVar.setFocusState(w0.f58616e);
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            return false;
        }
        throw new tu.t();
    }

    public static final boolean clearFocus(s sVar, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        int iOrdinal = sVar.getFocusState().ordinal();
        w0 w0Var = w0.f58619h;
        if (iOrdinal == 0) {
            sVar.setFocusState(w0Var);
            return true;
        }
        if (iOrdinal == 1) {
            if (!a(sVar)) {
                return false;
            }
            sVar.setFocusState(w0Var);
            return true;
        }
        if (iOrdinal == 2) {
            if (z10) {
                sVar.setFocusState(w0Var);
            }
            return z10;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                if (!a(sVar)) {
                    return false;
                }
                sVar.setFocusState(w0.f58617f);
                return true;
            }
            if (iOrdinal != 5) {
                throw new tu.t();
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return clearFocus(sVar, z10);
    }

    public static final void deactivateNode(s sVar) {
        z1.b0 layoutNode$ui_release;
        s1 owner$ui_release;
        m focusManager;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        int iOrdinal = sVar.getFocusState().ordinal();
        w0 w0Var = w0.f58617f;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sVar.setFocusState(w0.f58618g);
                return;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 5) {
                    return;
                }
                sVar.setFocusState(w0Var);
                return;
            }
        }
        z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
        if (layoutNodeWrapper != null && (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode$ui_release()) != null && (owner$ui_release = layoutNode$ui_release.getOwner$ui_release()) != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
            focusManager.clearFocus(true);
        }
        sVar.setFocusState(w0Var);
    }

    public static final void requestFocus(s sVar) {
        z1.b0 layoutNode$ui_release;
        s1 owner$ui_release;
        z1.b0 layoutNode$ui_release2;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
        if (((layoutNodeWrapper == null || (layoutNode$ui_release2 = layoutNodeWrapper.getLayoutNode$ui_release()) == null) ? null : layoutNode$ui_release2.getOwner$ui_release()) == null) {
            sVar.setFocusRequestedOnPlaced(true);
            return;
        }
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (a(sVar)) {
                    b(sVar);
                    return;
                }
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                if (iOrdinal != 5) {
                    return;
                }
                s parent = sVar.getParent();
                if (parent != null) {
                    c(parent, sVar);
                    return;
                }
                z1.u0 layoutNodeWrapper2 = sVar.getLayoutNodeWrapper();
                if (layoutNodeWrapper2 == null || (layoutNode$ui_release = layoutNodeWrapper2.getLayoutNode$ui_release()) == null || (owner$ui_release = layoutNode$ui_release.getOwner$ui_release()) == null) {
                    throw new IllegalStateException("Owner not initialized.");
                }
                if (owner$ui_release.requestFocus()) {
                    b(sVar);
                    return;
                }
                return;
            }
        }
        sendOnFocusEvent(sVar);
    }

    public static final void sendOnFocusEvent(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        l focusEventListener = sVar.getFocusEventListener();
        if (focusEventListener != null) {
            focusEventListener.propagateFocusEvent();
        }
    }

    public static final boolean freeFocus(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, QFzuMMDfrzagDN.wLj);
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            sVar.setFocusState(w0.f58614b);
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            return false;
        }
        throw new tu.t();
    }
}
