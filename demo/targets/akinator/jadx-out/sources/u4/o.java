package u4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import s4.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements TransformationMethod {

    /* renamed from: b, reason: collision with root package name */
    public final TransformationMethod f87856b;

    public o(TransformationMethod transformationMethod) {
        this.f87856b = transformationMethod;
    }

    public TransformationMethod getOriginalTransformationMethod() {
        return this.f87856b;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f87856b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || s.get().getLoadState() != 1) ? charSequence : s.get().process(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f87856b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
