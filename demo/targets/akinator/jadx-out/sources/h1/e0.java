package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 {
    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final o0 m4130customFocusSearchOMvw8(s customFocusSearch, int i10, s2.x layoutDirection) {
        o0 end;
        o0 o0Var;
        o0 start;
        kotlin.jvm.internal.e0.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        e eVar = f.f58545b;
        if (f.m4136equalsimpl0(i10, eVar.m4125getNextdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getNext();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4127getPreviousdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getPrevious();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4129getUpdhqQ8s())) {
            return customFocusSearch.getFocusProperties().getUp();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4122getDowndhqQ8s())) {
            return customFocusSearch.getFocusProperties().getDown();
        }
        if (f.m4136equalsimpl0(i10, eVar.m4124getLeftdhqQ8s())) {
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                start = customFocusSearch.getFocusProperties().getStart();
            } else {
                if (iOrdinal != 1) {
                    throw new tu.t();
                }
                start = customFocusSearch.getFocusProperties().getEnd();
            }
            o0Var = kotlin.jvm.internal.e0.areEqual(start, o0.f58586b.getDefault()) ? null : start;
            return o0Var == null ? customFocusSearch.getFocusProperties().getLeft() : o0Var;
        }
        if (!f.m4136equalsimpl0(i10, eVar.m4128getRightdhqQ8s())) {
            if (f.m4136equalsimpl0(i10, eVar.m4123getIndhqQ8s())) {
                return o0.f58586b.getDefault();
            }
            if (f.m4136equalsimpl0(i10, eVar.m4126getOutdhqQ8s())) {
                return o0.f58586b.getDefault();
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            end = customFocusSearch.getFocusProperties().getEnd();
        } else {
            if (iOrdinal2 != 1) {
                throw new tu.t();
            }
            end = customFocusSearch.getFocusProperties().getStart();
        }
        o0Var = kotlin.jvm.internal.e0.areEqual(end, o0.f58586b.getDefault()) ? null : end;
        return o0Var == null ? customFocusSearch.getFocusProperties().getRight() : o0Var;
    }

    @tu.f
    public static final e1.v focusOrder(e1.v vVar, kv.l focusOrderReceiver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return k0.focusProperties(vVar, new g0(focusOrderReceiver));
    }

    @tu.f
    public static final e1.v focusOrder(e1.v vVar, o0 focusRequester) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusRequester, "focusRequester");
        return r0.focusRequester(vVar, focusRequester);
    }

    @tu.f
    public static final e1.v focusOrder(e1.v vVar, o0 focusRequester, kv.l focusOrderReceiver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusRequester, "focusRequester");
        kotlin.jvm.internal.e0.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return k0.focusProperties(r0.focusRequester(vVar, focusRequester), new g0(focusOrderReceiver));
    }
}
