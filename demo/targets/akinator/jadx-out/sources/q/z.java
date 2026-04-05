package q;

import android.content.res.TypedArray;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f82315a;

    /* renamed from: b, reason: collision with root package name */
    public final u4.l f82316b;

    public z(TextView textView) {
        this.f82315a = textView;
        this.f82316b = new u4.l(textView, false);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f82315a.getContext().obtainStyledAttributes(attributeSet, k.a.f69985i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        this.f82316b.setAllCaps(z10);
    }

    public final void c(boolean z10) {
        this.f82316b.setEnabled(z10);
    }

    public boolean isEnabled() {
        return this.f82316b.isEnabled();
    }

    public TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod) {
        return this.f82316b.wrapTransformationMethod(transformationMethod);
    }
}
