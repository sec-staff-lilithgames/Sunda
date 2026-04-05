package dh;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f52217b;

    public c0(TextInputLayout textInputLayout) {
        this.f52217b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        CheckableImageButton checkableImageButton = this.f52217b.f29473e.f52260i;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
