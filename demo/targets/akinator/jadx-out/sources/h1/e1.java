package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(i1.j r4, i1.j r5, i1.j r6, int r7) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e1.a(i1.j, i1.j, i1.j, int):boolean");
    }

    public static final boolean b(int i10, i1.j jVar, i1.j jVar2) {
        e eVar = f.f58545b;
        if (!(f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s()))) {
            if (!(f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (jVar.getRight() <= jVar2.getLeft() || jVar.getLeft() >= jVar2.getRight()) {
                return false;
            }
        } else if (jVar.getBottom() <= jVar2.getTop() || jVar.getTop() >= jVar2.getBottom()) {
            return false;
        }
        return true;
    }

    public static final s c(r0.c cVar, i1.j jVar, int i10) {
        i1.j jVarTranslate;
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s())) {
            jVarTranslate = jVar.translate(jVar.getWidth() + 1, 0.0f);
        } else if (f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s())) {
            jVarTranslate = jVar.translate(-(jVar.getWidth() + 1), 0.0f);
        } else if (f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s())) {
            jVarTranslate = jVar.translate(0.0f, jVar.getHeight() + 1);
        } else {
            if (!f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            jVarTranslate = jVar.translate(0.0f, -(jVar.getHeight() + 1));
        }
        int size = cVar.getSize();
        s sVar = null;
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i11 = 0;
            do {
                s sVar2 = (s) content[i11];
                if (z0.isEligibleForFocusSearch(sVar2)) {
                    i1.j jVarFocusRect = z0.focusRect(sVar2);
                    if (e(i10, jVarFocusRect, jVar) && (!e(i10, jVarTranslate, jVar) || a(jVar, jVarFocusRect, jVarTranslate, i10) || (!a(jVar, jVarTranslate, jVarFocusRect, i10) && f(i10, jVar, jVarFocusRect) < f(i10, jVar, jVarTranslate)))) {
                        sVar = sVar2;
                        jVarTranslate = jVarFocusRect;
                    }
                }
                i11++;
            } while (i11 < size);
        }
        return sVar;
    }

    public static final boolean d(s sVar, s sVar2, int i10, kv.l lVar) {
        if (g(sVar, sVar2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.m4116searchBeyondBoundsOMvw8(sVar, i10, new d1(sVar, sVar2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean e(int i10, i1.j jVar, i1.j jVar2) {
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s())) {
            return (jVar2.getRight() > jVar.getRight() || jVar2.getLeft() >= jVar.getRight()) && jVar2.getLeft() > jVar.getLeft();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s())) {
            return (jVar2.getLeft() < jVar.getLeft() || jVar2.getRight() <= jVar.getLeft()) && jVar2.getRight() < jVar.getRight();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s())) {
            return (jVar2.getBottom() > jVar.getBottom() || jVar2.getTop() >= jVar.getBottom()) && jVar2.getTop() > jVar.getTop();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
            return (jVar2.getTop() < jVar.getTop() || jVar2.getBottom() <= jVar.getTop()) && jVar2.getBottom() < jVar.getBottom();
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final long f(int i10, i1.j jVar, i1.j jVar2) {
        float top;
        float bottom;
        float f10;
        float width;
        float left;
        float width2;
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s())) {
            top = jVar.getLeft();
            bottom = jVar2.getRight();
        } else if (f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s())) {
            top = jVar2.getLeft();
            bottom = jVar.getRight();
        } else if (f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s())) {
            top = jVar.getTop();
            bottom = jVar2.getBottom();
        } else {
            if (!f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            top = jVar2.getTop();
            bottom = jVar.getBottom();
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, top - bottom));
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s())) {
            f10 = 2;
            width = (jVar.getHeight() / f10) + jVar.getTop();
            left = jVar2.getTop();
            width2 = jVar2.getHeight();
        } else {
            if (!(f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = 2;
            width = (jVar.getWidth() / f10) + jVar.getLeft();
            left = jVar2.getLeft();
            width2 = jVar2.getWidth();
        }
        long jAbs2 = (long) Math.abs(width - ((width2 / f10) + left));
        return (jAbs2 * jAbs2) + (13 * jAbs * jAbs);
    }

    public static final boolean g(s sVar, s sVar2, int i10, kv.l lVar) {
        s sVarC;
        r0.c cVar = new r0.c(new s[sVar.getChildren().getSize()], 0);
        cVar.addAll(cVar.getSize(), sVar.getChildren());
        while (cVar.isNotEmpty() && (sVarC = c(cVar, z0.focusRect(sVar2), i10)) != null) {
            if (!sVarC.getFocusState().isDeactivated()) {
                return ((Boolean) lVar.invoke(sVarC)).booleanValue();
            }
            if (d(sVarC, sVar2, i10, lVar)) {
                return true;
            }
            cVar.remove(sVarC);
        }
        return false;
    }

    /* renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m4132twoDimensionalFocusSearchOMvw8(s twoDimensionalFocusSearch, int i10, kv.l onFound) {
        i1.j jVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFound, "onFound");
        int iOrdinal = twoDimensionalFocusSearch.getFocusState().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return false;
                    }
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return ((Boolean) onFound.invoke(twoDimensionalFocusSearch)).booleanValue();
                        }
                        throw new tu.t();
                    }
                }
            }
            s focusedChild = twoDimensionalFocusSearch.getFocusedChild();
            if (focusedChild == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int iOrdinal2 = focusedChild.getFocusState().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            if (iOrdinal2 != 4) {
                                if (iOrdinal2 != 5) {
                                    throw new tu.t();
                                }
                            }
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (!m4132twoDimensionalFocusSearchOMvw8(focusedChild, i10, onFound)) {
                    if (focusedChild.getFocusState() != w0.f58615c && focusedChild.getFocusState() != w0.f58618g) {
                        throw new IllegalStateException("Check failed.");
                    }
                    s sVarFindActiveFocusNode = z0.findActiveFocusNode(focusedChild);
                    if (sVarFindActiveFocusNode == null) {
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                    if (!d(twoDimensionalFocusSearch, sVarFindActiveFocusNode, i10, onFound)) {
                        return false;
                    }
                }
                return true;
            }
            return d(twoDimensionalFocusSearch, focusedChild, i10, onFound);
        }
        r0.c cVarActivatedChildren = z0.activatedChildren(twoDimensionalFocusSearch);
        if (cVarActivatedChildren.getSize() <= 1) {
            s sVar = (s) (cVarActivatedChildren.isEmpty() ? null : cVarActivatedChildren.getContent()[0]);
            if (sVar != null) {
                return ((Boolean) onFound.invoke(sVar)).booleanValue();
            }
            return false;
        }
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
            i1.j jVarFocusRect = z0.focusRect(twoDimensionalFocusSearch);
            jVar = new i1.j(jVarFocusRect.getLeft(), jVarFocusRect.getTop(), jVarFocusRect.getLeft(), jVarFocusRect.getTop());
        } else {
            if (!(f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s()) ? true : f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s()))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            i1.j jVarFocusRect2 = z0.focusRect(twoDimensionalFocusSearch);
            jVar = new i1.j(jVarFocusRect2.getRight(), jVarFocusRect2.getBottom(), jVarFocusRect2.getRight(), jVarFocusRect2.getBottom());
        }
        s sVarC = c(cVarActivatedChildren, jVar, i10);
        if (sVarC != null) {
            return ((Boolean) onFound.invoke(sVarC)).booleanValue();
        }
        return false;
    }
}
