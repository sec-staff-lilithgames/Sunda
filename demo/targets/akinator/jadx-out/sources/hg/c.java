package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class c extends FrameLayout implements j {

    /* renamed from: b, reason: collision with root package name */
    public final e f58766b;

    public c(Context context) {
        this(context, null);
    }

    @Override // hg.j, hg.d
    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // hg.j, hg.d
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // hg.j
    public void buildCircularRevealCache() {
        this.f58766b.buildCircularRevealCache();
    }

    @Override // hg.j
    public void destroyCircularRevealCache() {
        this.f58766b.destroyCircularRevealCache();
    }

    @Override // android.view.View, hg.j
    public void draw(Canvas canvas) {
        e eVar = this.f58766b;
        if (eVar != null) {
            eVar.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // hg.j
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f58766b.getCircularRevealOverlayDrawable();
    }

    @Override // hg.j
    public int getCircularRevealScrimColor() {
        return this.f58766b.getCircularRevealScrimColor();
    }

    @Override // hg.j
    public i getRevealInfo() {
        return this.f58766b.getRevealInfo();
    }

    @Override // android.view.View, hg.j
    public boolean isOpaque() {
        e eVar = this.f58766b;
        return eVar != null ? eVar.isOpaque() : super.isOpaque();
    }

    @Override // hg.j
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f58766b.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // hg.j
    public void setCircularRevealScrimColor(int i10) {
        this.f58766b.setCircularRevealScrimColor(i10);
    }

    @Override // hg.j
    public void setRevealInfo(i iVar) {
        this.f58766b.setRevealInfo(iVar);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58766b = new e(this);
    }
}
