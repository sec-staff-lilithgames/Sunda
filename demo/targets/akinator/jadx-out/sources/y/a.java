package y;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f93920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f93921b;

    public a(b bVar) {
        this.f93921b = bVar;
    }

    @Override // y.d
    public Drawable getCardBackground() {
        return this.f93920a;
    }

    @Override // y.d
    public View getCardView() {
        return this.f93921b;
    }

    @Override // y.d
    public boolean getPreventCornerOverlap() {
        return this.f93921b.getPreventCornerOverlap();
    }

    @Override // y.d
    public boolean getUseCompatPadding() {
        return this.f93921b.getUseCompatPadding();
    }

    @Override // y.d
    public void setCardBackground(Drawable drawable) {
        this.f93920a = drawable;
        this.f93921b.setBackgroundDrawable(drawable);
    }

    @Override // y.d
    public void setMinWidthHeightInternal(int i10, int i11) {
        b bVar = this.f93921b;
        if (i10 > bVar.f93926e) {
            super/*android.view.View*/.setMinimumWidth(i10);
        }
        if (i11 > bVar.f93927f) {
            super/*android.view.View*/.setMinimumHeight(i11);
        }
    }

    @Override // y.d
    public void setShadowPadding(int i10, int i11, int i12, int i13) {
        b bVar = this.f93921b;
        bVar.f93929h.set(i10, i11, i12, i13);
        Rect rect = bVar.f93928g;
        super/*android.view.View*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }
}
