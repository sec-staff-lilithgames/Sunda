package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f58586b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f58587c = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final r0.c f58588a = new r0.c(new t0[16], 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final n0 createRefs() {
            return n0.f58582a;
        }

        public final o0 getDefault() {
            return o0.f58587c;
        }
    }

    public final boolean captureFocus() {
        r0.c cVar = this.f58588a;
        if (!cVar.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int size = cVar.getSize();
        int i10 = 0;
        if (size <= 0) {
            return false;
        }
        Object[] content = cVar.getContent();
        boolean z10 = false;
        do {
            s sVarFindFocusNode = ((t0) content[i10]).findFocusNode();
            if (sVarFindFocusNode != null && x0.captureFocus(sVarFindFocusNode)) {
                z10 = true;
            }
            i10++;
        } while (i10 < size);
        return z10;
    }

    public final boolean freeFocus() {
        r0.c cVar = this.f58588a;
        if (!cVar.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int size = cVar.getSize();
        int i10 = 0;
        if (size <= 0) {
            return false;
        }
        Object[] content = cVar.getContent();
        boolean z10 = false;
        do {
            s sVarFindFocusNode = ((t0) content[i10]).findFocusNode();
            if (sVarFindFocusNode != null && x0.freeFocus(sVarFindFocusNode)) {
                z10 = true;
            }
            i10++;
        } while (i10 < size);
        return z10;
    }

    public final r0.c getFocusRequesterModifierLocals$ui_release() {
        return this.f58588a;
    }

    public final void requestFocus() {
        r0.c cVar = this.f58588a;
        if (!cVar.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                s sVarFindFocusNode = ((t0) content[i10]).findFocusNode();
                if (sVarFindFocusNode != null) {
                    x0.requestFocus(sVarFindFocusNode);
                }
                i10++;
            } while (i10 < size);
        }
    }
}
