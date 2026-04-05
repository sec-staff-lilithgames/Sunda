package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f73994a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f73995b;

    public w0(l0 textInputService, c0 platformTextInputService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textInputService, "textInputService");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f73994a = textInputService;
        this.f73995b = platformTextInputService;
    }

    public final void dispose() {
        this.f73994a.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f73995b.hideSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean isOpen() {
        return kotlin.jvm.internal.e0.areEqual(this.f73994a.getCurrentInputSession$ui_text_release(), this);
    }

    @tu.f
    public final boolean notifyFocusedRect(i1.j rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f73995b.notifyFocusedRect(rect);
        }
        return zIsOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f73995b.showSoftwareKeyboard();
        }
        return zIsOpen;
    }

    public final boolean updateState(j0 j0Var, j0 newValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(newValue, "newValue");
        boolean zIsOpen = isOpen();
        if (zIsOpen) {
            this.f73995b.updateState(j0Var, newValue);
        }
        return zIsOpen;
    }
}
