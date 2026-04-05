package com.sfbx.appconsentv3.ui.ui.components.molecule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sfbx.appconsentv3.ui.databinding.AppconsentV3AcListMoleculeBinding;
import e4.t;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACListMolecule extends ConstraintLayout {
    private AppconsentV3AcListMoleculeBinding _binding;
    private int lineTheme;
    private int textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACListMolecule(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
    }

    private final void defineCustomTextColor() {
        if (this.textColor != -1) {
            getBinding().acListMoleculeText.setTextColor(this.textColor);
            getBinding().acListMoleculeBullet.setTextColor(this.textColor);
        }
    }

    private final void defineCustomTheme() {
        if (this.lineTheme != -1) {
            t.setTextAppearance(getBinding().acListMoleculeText, this.lineTheme);
            getBinding().acListMoleculeText.setBackgroundColor(0);
        }
    }

    private final AppconsentV3AcListMoleculeBinding getBinding() {
        return this._binding;
    }

    public final void setContent(String content) {
        e0.checkNotNullParameter(content, "content");
        getBinding().acListMoleculeText.setText(content);
    }

    public /* synthetic */ ACListMolecule(Context context, AttributeSet attributeSet, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACListMolecule(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.lineTheme = -1;
        this.textColor = -1;
        AppconsentV3AcListMoleculeBinding appconsentV3AcListMoleculeBindingInflate = AppconsentV3AcListMoleculeBinding.inflate(LayoutInflater.from(context), this, true);
        e0.checkNotNullExpressionValue(appconsentV3AcListMoleculeBindingInflate, "inflate(\n            Lay…           true\n        )");
        this._binding = appconsentV3AcListMoleculeBindingInflate;
    }

    public /* synthetic */ ACListMolecule(Context context, int i10, Integer num, int i11, u uVar) {
        this(context, i10, (i11 & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ACListMolecule(Context context, int i10, Integer num) {
        this(context, null, 2, 0 == true ? 1 : 0);
        e0.checkNotNullParameter(context, "context");
        this.lineTheme = i10;
        if (num != null) {
            this.textColor = num.intValue();
        }
        defineCustomTheme();
        defineCustomTextColor();
    }
}
