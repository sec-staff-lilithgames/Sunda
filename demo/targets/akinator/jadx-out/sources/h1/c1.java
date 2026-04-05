package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final boolean a(s sVar, kv.l lVar) {
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return d(sVar, lVar) || ((Boolean) lVar.invoke(sVar)).booleanValue();
                        }
                        throw new tu.t();
                    }
                }
            }
            s focusedChild = sVar.getFocusedChild();
            if (focusedChild == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            int iOrdinal2 = focusedChild.getFocusState().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return a(focusedChild, lVar) || ((Boolean) lVar.invoke(focusedChild)).booleanValue();
                }
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        if (iOrdinal2 == 4) {
                            return a(focusedChild, lVar) || c(sVar, focusedChild, f.f58545b.m4127getPreviousdhqQ8s(), lVar);
                        }
                        if (iOrdinal2 != 5) {
                            throw new tu.t();
                        }
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
            }
            return c(sVar, focusedChild, f.f58545b.m4127getPreviousdhqQ8s(), lVar);
        }
        return d(sVar, lVar);
    }

    public static final boolean b(s sVar, kv.l lVar) {
        int iOrdinal = sVar.getFocusState().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return ((Boolean) lVar.invoke(sVar)).booleanValue();
                        }
                        throw new tu.t();
                    }
                }
            }
            s focusedChild = sVar.getFocusedChild();
            if (focusedChild != null) {
                return b(focusedChild, lVar) || c(sVar, focusedChild, f.f58545b.m4125getNextdhqQ8s(), lVar);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        sVar.getChildren().sortWith(new b1());
        r0.c children = sVar.getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i10 = 0;
            do {
                s sVar2 = (s) content[i10];
                if (!z0.isEligibleForFocusSearch(sVar2) || !b(sVar2, lVar)) {
                    i10++;
                }
            } while (i10 < size);
        }
    }

    public static final boolean c(s sVar, s sVar2, int i10, kv.l lVar) {
        if (e(sVar, sVar2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.m4116searchBeyondBoundsOMvw8(sVar, i10, new a1(sVar, sVar2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(s sVar, kv.l lVar) {
        sVar.getChildren().sortWith(new b1());
        r0.c children = sVar.getChildren();
        int size = children.getSize();
        if (size <= 0) {
            return false;
        }
        int i10 = size - 1;
        Object[] content = children.getContent();
        do {
            s sVar2 = (s) content[i10];
            if (z0.isEligibleForFocusSearch(sVar2) && a(sVar2, lVar)) {
                return true;
            }
            i10--;
        } while (i10 >= 0);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(h1.s r9, h1.s r10, int r11, kv.l r12) {
        /*
            h1.w0 r0 = r9.getFocusState()
            h1.w0 r1 = h1.w0.f58615c
            h1.w0 r2 = h1.w0.f58618g
            if (r0 == r1) goto L19
            h1.w0 r0 = r9.getFocusState()
            if (r0 != r2) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This function should only be used within a parent that has focus."
            r9.<init>(r10)
            throw r9
        L19:
            r0.c r0 = r9.getChildren()
            h1.b1 r1 = new h1.b1
            r1.<init>()
            r0.sortWith(r1)
            h1.e r0 = h1.f.f58545b
            int r1 = r0.m4125getNextdhqQ8s()
            boolean r1 = h1.f.m4136equalsimpl0(r11, r1)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L75
            r0.c r0 = r9.getChildren()
            qv.m r1 = new qv.m
            int r5 = r0.getSize()
            int r5 = r5 - r4
            r1.<init>(r3, r5)
            int r5 = r1.getFirst()
            int r1 = r1.getLast()
            if (r5 > r1) goto Lc1
            r6 = r3
        L4c:
            if (r6 == 0) goto L63
            java.lang.Object[] r7 = r0.getContent()
            r7 = r7[r5]
            h1.s r7 = (h1.s) r7
            boolean r8 = h1.z0.isEligibleForFocusSearch(r7)
            if (r8 == 0) goto L63
            boolean r7 = b(r7, r12)
            if (r7 == 0) goto L63
            goto Lae
        L63:
            java.lang.Object[] r7 = r0.getContent()
            r7 = r7[r5]
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r10)
            if (r7 == 0) goto L70
            r6 = r4
        L70:
            if (r5 == r1) goto Lc1
            int r5 = r5 + 1
            goto L4c
        L75:
            int r0 = r0.m4127getPreviousdhqQ8s()
            boolean r0 = h1.f.m4136equalsimpl0(r11, r0)
            if (r0 == 0) goto Le6
            r0.c r0 = r9.getChildren()
            qv.m r1 = new qv.m
            int r5 = r0.getSize()
            int r5 = r5 - r4
            r1.<init>(r3, r5)
            int r5 = r1.getFirst()
            int r1 = r1.getLast()
            if (r5 > r1) goto Lc1
            r6 = r3
        L98:
            if (r6 == 0) goto Laf
            java.lang.Object[] r7 = r0.getContent()
            r7 = r7[r1]
            h1.s r7 = (h1.s) r7
            boolean r8 = h1.z0.isEligibleForFocusSearch(r7)
            if (r8 == 0) goto Laf
            boolean r7 = a(r7, r12)
            if (r7 == 0) goto Laf
        Lae:
            return r4
        Laf:
            java.lang.Object[] r7 = r0.getContent()
            r7 = r7[r1]
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r10)
            if (r7 == 0) goto Lbc
            r6 = r4
        Lbc:
            if (r1 == r5) goto Lc1
            int r1 = r1 + (-1)
            goto L98
        Lc1:
            h1.e r10 = h1.f.f58545b
            int r10 = r10.m4125getNextdhqQ8s()
            boolean r10 = h1.f.m4136equalsimpl0(r11, r10)
            if (r10 != 0) goto Le5
            h1.w0 r10 = r9.getFocusState()
            if (r10 == r2) goto Le5
            h1.s r10 = r9.getParent()
            if (r10 != 0) goto Lda
            goto Le5
        Lda:
            java.lang.Object r9 = r12.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        Le5:
            return r3
        Le6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This function should only be used for 1-D focus search"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c1.e(h1.s, h1.s, int, kv.l):boolean");
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m4119oneDimensionalFocusSearchOMvw8(s oneDimensionalFocusSearch, int i10, kv.l onFound) {
        kotlin.jvm.internal.e0.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFound, "onFound");
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4125getNextdhqQ8s())) {
            return b(oneDimensionalFocusSearch, onFound);
        }
        if (f.m4136equalsimpl0(i10, eVar.m4127getPreviousdhqQ8s())) {
            return a(oneDimensionalFocusSearch, onFound);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }
}
