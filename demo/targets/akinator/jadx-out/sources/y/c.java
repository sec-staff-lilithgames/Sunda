package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements e {
    public static f a(d dVar) {
        return (f) ((a) dVar).getCardBackground();
    }

    @Override // y.e
    public ColorStateList getBackgroundColor(d dVar) {
        return a(dVar).getColor();
    }

    @Override // y.e
    public float getElevation(d dVar) {
        return ((a) dVar).getCardView().getElevation();
    }

    @Override // y.e
    public float getMaxElevation(d dVar) {
        return a(dVar).f93935e;
    }

    @Override // y.e
    public float getMinHeight(d dVar) {
        return getRadius(dVar) * 2.0f;
    }

    @Override // y.e
    public float getMinWidth(d dVar) {
        return getRadius(dVar) * 2.0f;
    }

    @Override // y.e
    public float getRadius(d dVar) {
        return a(dVar).getRadius();
    }

    @Override // y.e
    public void initialize(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        a aVar = (a) dVar;
        aVar.setCardBackground(new f(f10, colorStateList));
        View cardView = aVar.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f11);
        setMaxElevation(aVar, f12);
    }

    @Override // y.e
    public void onCompatPaddingChanged(d dVar) {
        setMaxElevation(dVar, getMaxElevation(dVar));
    }

    @Override // y.e
    public void onPreventCornerOverlapChanged(d dVar) {
        setMaxElevation(dVar, getMaxElevation(dVar));
    }

    @Override // y.e
    public void setBackgroundColor(d dVar, ColorStateList colorStateList) {
        a(dVar).setColor(colorStateList);
    }

    @Override // y.e
    public void setElevation(d dVar, float f10) {
        ((a) dVar).getCardView().setElevation(f10);
    }

    @Override // y.e
    public void setMaxElevation(d dVar, float f10) {
        f fVarA = a(dVar);
        a aVar = (a) dVar;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f10 != fVarA.f93935e || fVarA.f93936f != useCompatPadding || fVarA.f93937g != preventCornerOverlap) {
            fVarA.f93935e = f10;
            fVarA.f93936f = useCompatPadding;
            fVarA.f93937g = preventCornerOverlap;
            fVarA.b(null);
            fVarA.invalidateSelf();
        }
        updatePadding(aVar);
    }

    @Override // y.e
    public void setRadius(d dVar, float f10) {
        f fVarA = a(dVar);
        if (f10 == fVarA.f93931a) {
            return;
        }
        fVarA.f93931a = f10;
        fVarA.b(null);
        fVarA.invalidateSelf();
    }

    @Override // y.e
    public void updatePadding(d dVar) {
        a aVar = (a) dVar;
        if (!aVar.getUseCompatPadding()) {
            aVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(aVar);
        float radius = getRadius(aVar);
        int iCeil = (int) Math.ceil(g.a(maxElevation, radius, aVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(g.b(maxElevation, radius, aVar.getPreventCornerOverlap()));
        aVar.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // y.e
    public void initStatic() {
    }
}
