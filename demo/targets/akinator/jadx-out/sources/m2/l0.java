package m2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f73930a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f73931b;

    public l0(c0 platformTextInputService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f73930a = platformTextInputService;
        this.f73931b = new AtomicReference(null);
    }

    public final w0 getCurrentInputSession$ui_text_release() {
        return (w0) this.f73931b.get();
    }

    public final void hideSoftwareKeyboard() {
        this.f73930a.hideSoftwareKeyboard();
    }

    public final void showSoftwareKeyboard() {
        if (this.f73931b.get() != null) {
            this.f73930a.showSoftwareKeyboard();
        }
    }

    public w0 startInput(j0 value, n imeOptions, kv.l onEditCommand, kv.l onImeActionPerformed) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.e0.checkNotNullParameter(imeOptions, "imeOptions");
        kotlin.jvm.internal.e0.checkNotNullParameter(onEditCommand, "onEditCommand");
        kotlin.jvm.internal.e0.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        c0 c0Var = this.f73930a;
        c0Var.startInput(value, imeOptions, onEditCommand, onImeActionPerformed);
        w0 w0Var = new w0(this, c0Var);
        this.f73931b.set(w0Var);
        return w0Var;
    }

    public void stopInput(w0 session) {
        AtomicReference atomicReference;
        kotlin.jvm.internal.e0.checkNotNullParameter(session, "session");
        do {
            atomicReference = this.f73931b;
            if (atomicReference.compareAndSet(session, null)) {
                this.f73930a.stopInput();
                return;
            }
        } while (atomicReference.get() == session);
    }
}
