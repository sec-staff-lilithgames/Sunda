package f6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f55378a;

    public h(Drawable.ConstantState constantState) {
        this.f55378a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        return this.f55378a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f55378a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(null, 0);
        Drawable drawableNewDrawable = this.f55378a.newDrawable();
        iVar.f55386b = drawableNewDrawable;
        drawableNewDrawable.setCallback(iVar.f55383h);
        return iVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        i iVar = new i(null, 0);
        Drawable drawableNewDrawable = this.f55378a.newDrawable(resources);
        iVar.f55386b = drawableNewDrawable;
        drawableNewDrawable.setCallback(iVar.f55383h);
        return iVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        i iVar = new i(null, 0);
        Drawable drawableNewDrawable = this.f55378a.newDrawable(resources, theme);
        iVar.f55386b = drawableNewDrawable;
        drawableNewDrawable.setCallback(iVar.f55383h);
        return iVar;
    }
}
