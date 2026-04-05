package u4;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final j f87848a;

    public l(TextView textView) {
        this(textView, true);
    }

    public InputFilter[] getFilters(InputFilter[] inputFilterArr) {
        return this.f87848a.a(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.f87848a.isEnabled();
    }

    public void setAllCaps(boolean z10) {
        this.f87848a.b(z10);
    }

    public void setEnabled(boolean z10) {
        this.f87848a.c(z10);
    }

    public void updateTransformationMethod() {
        this.f87848a.d();
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.f87848a.e(transformationMethod);
    }

    public l(TextView textView, boolean z10) {
        w3.i.checkNotNull(textView, "textView cannot be null");
        if (z10) {
            this.f87848a = new i(textView);
        } else {
            this.f87848a = new k(textView);
        }
    }
}
