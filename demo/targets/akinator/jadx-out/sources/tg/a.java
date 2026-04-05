package tg;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e4.f;
import jg.b;
import q.f0;
import qg.j0;
import ug.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a extends f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f86916i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f86917g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86918h;

    public a(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f86917g == null) {
            int color = b.getColor(this, com.digidust.elokence.akinator.freemium.R.attr.colorControlActivated);
            int color2 = b.getColor(this, com.digidust.elokence.akinator.freemium.R.attr.colorOnSurface);
            int color3 = b.getColor(this, com.digidust.elokence.akinator.freemium.R.attr.colorSurface);
            this.f86917g = new ColorStateList(f86916i, new int[]{b.layer(color3, color, 1.0f), b.layer(color3, color2, 0.54f), b.layer(color3, color2, 0.38f), b.layer(color3, color2, 0.38f)});
        }
        return this.f86917g;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f86918h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f86918h && f.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f86918h = z10;
        if (z10) {
            f.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            f.setButtonTintList(this, null);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.A, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            f.setButtonTintList(this, d.getColorStateList(context2, typedArrayObtainStyledAttributes, 0));
        }
        this.f86918h = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
