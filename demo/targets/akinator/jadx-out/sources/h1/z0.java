package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final r0.c activatedChildren(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        r0.c children = sVar.getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i10 = 0;
            int i11 = 0;
            while (!((s) content[i11]).getFocusState().isDeactivated()) {
                i11++;
                if (i11 >= size) {
                }
            }
            r0.c cVar = new r0.c(new s[16], 0);
            r0.c children2 = sVar.getChildren();
            int size2 = children2.getSize();
            if (size2 > 0) {
                Object[] content2 = children2.getContent();
                do {
                    s sVar2 = (s) content2[i10];
                    if (sVar2.getFocusState().isDeactivated()) {
                        cVar.addAll(cVar.getSize(), activatedChildren(sVar2));
                    } else {
                        cVar.add(sVar2);
                    }
                    i10++;
                } while (i10 < size2);
            }
            return cVar;
        }
        return sVar.getChildren();
    }

    public static final s findActiveFocusNode(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        switch (y0.$EnumSwitchMapping$1[sVar.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return sVar;
            case 3:
            case 4:
                s focusedChild = sVar.getFocusedChild();
                if (focusedChild != null) {
                    return findActiveFocusNode(focusedChild);
                }
                return null;
            case 5:
            case 6:
                return null;
            default:
                throw new tu.t();
        }
    }

    public static final s findActiveParent(s sVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        s parent = sVar.getParent();
        if (parent == null) {
            return null;
        }
        switch (y0.$EnumSwitchMapping$1[sVar.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return findActiveParent(parent);
            case 3:
                return sVar;
            default:
                throw new tu.t();
        }
    }

    public static final s1.g findLastKeyInputModifier(s sVar) {
        z1.b0 layoutNode$ui_release;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
        s1.g gVar = null;
        if (layoutNodeWrapper == null || (layoutNode$ui_release = layoutNodeWrapper.getLayoutNode$ui_release()) == null) {
            return null;
        }
        r0.c keyInputChildren = sVar.getKeyInputChildren();
        int size = keyInputChildren.getSize();
        if (size > 0) {
            Object[] content = keyInputChildren.getContent();
            int i10 = 0;
            do {
                s1.g gVar2 = (s1.g) content[i10];
                if (kotlin.jvm.internal.e0.areEqual(gVar2.getLayoutNode(), layoutNode$ui_release)) {
                    if (gVar == null) {
                        gVar = gVar2;
                        break;
                    }
                    z1.b0 layoutNode = gVar2.getLayoutNode();
                    s1.g parent = gVar;
                    while (!kotlin.jvm.internal.e0.areEqual(parent, gVar2)) {
                        parent = parent.getParent();
                        if (parent == null || !kotlin.jvm.internal.e0.areEqual(parent.getLayoutNode(), layoutNode)) {
                            gVar = gVar2;
                            break;
                        }
                    }
                }
                i10++;
            } while (i10 < size);
        }
        return gVar != null ? gVar : sVar.getKeyInputModifier();
    }

    public static final i1.j focusRect(s sVar) {
        i1.j jVarLocalBoundingBoxOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
        return (layoutNodeWrapper == null || (jVarLocalBoundingBoxOf = x1.e0.findRoot(layoutNodeWrapper).localBoundingBoxOf(layoutNodeWrapper, false)) == null) ? i1.j.f59349e.getZero() : jVarLocalBoundingBoxOf;
    }

    /* renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m4144focusSearchsMXa3k8(s focusSearch, int i10, s2.x layoutDirection, kv.l onFound) {
        int iM4124getLeftdhqQ8s;
        kotlin.jvm.internal.e0.checkNotNullParameter(focusSearch, "$this$focusSearch");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFound, "onFound");
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4125getNextdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4127getPreviousdhqQ8s())) {
            return c1.m4119oneDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
        }
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
            return e1.m4132twoDimensionalFocusSearchOMvw8(focusSearch, i10, onFound);
        }
        if (!f.m4136equalsimpl0(i10, eVar.m4123getIndhqQ8s())) {
            if (!f.m4136equalsimpl0(i10, eVar.m4126getOutdhqQ8s())) {
                throw new IllegalStateException("Invalid FocusDirection");
            }
            s sVarFindActiveFocusNode = findActiveFocusNode(focusSearch);
            s sVarFindActiveParent = sVarFindActiveFocusNode != null ? findActiveParent(sVarFindActiveFocusNode) : null;
            if (kotlin.jvm.internal.e0.areEqual(sVarFindActiveParent, focusSearch) || sVarFindActiveParent == null) {
                return false;
            }
            return ((Boolean) onFound.invoke(sVarFindActiveParent)).booleanValue();
        }
        int i11 = y0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i11 == 1) {
            iM4124getLeftdhqQ8s = eVar.m4124getLeftdhqQ8s();
        } else {
            if (i11 != 2) {
                throw new tu.t();
            }
            iM4124getLeftdhqQ8s = eVar.m4128getRightdhqQ8s();
        }
        s sVarFindActiveFocusNode2 = findActiveFocusNode(focusSearch);
        if (sVarFindActiveFocusNode2 != null) {
            return e1.m4132twoDimensionalFocusSearchOMvw8(sVarFindActiveFocusNode2, iM4124getLeftdhqQ8s, onFound);
        }
        return false;
    }

    public static final boolean isEligibleForFocusSearch(s sVar) {
        z1.b0 layoutNode$ui_release;
        z1.u0 layoutNodeWrapper;
        z1.b0 layoutNode$ui_release2;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        z1.u0 layoutNodeWrapper2 = sVar.getLayoutNodeWrapper();
        return (layoutNodeWrapper2 == null || (layoutNode$ui_release = layoutNodeWrapper2.getLayoutNode$ui_release()) == null || !layoutNode$ui_release.isPlaced() || (layoutNodeWrapper = sVar.getLayoutNodeWrapper()) == null || (layoutNode$ui_release2 = layoutNodeWrapper.getLayoutNode$ui_release()) == null || !layoutNode$ui_release2.isAttached()) ? false : true;
    }
}
