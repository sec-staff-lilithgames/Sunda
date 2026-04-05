package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.x0;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import dh.x;
import q.f0;
import q.r;
import tg.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialComponentsViewInflater extends x0 {
    @Override // androidx.appcompat.app.x0
    public final r a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // androidx.appcompat.app.x0
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.x0
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.x0
    public final f0 d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.x0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new eh.a(context, attributeSet);
    }
}
