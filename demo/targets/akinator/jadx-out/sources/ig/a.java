package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import dg.b;
import hg.e;
import hg.i;
import hg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a extends b implements j {

    /* renamed from: s, reason: collision with root package name */
    public final e f59573s;

    public a(Context context) {
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
        this.f59573s.buildCircularRevealCache();
    }

    @Override // hg.j
    public void destroyCircularRevealCache() {
        this.f59573s.destroyCircularRevealCache();
    }

    @Override // android.view.View, hg.j
    public void draw(Canvas canvas) {
        e eVar = this.f59573s;
        if (eVar != null) {
            eVar.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // hg.j
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f59573s.getCircularRevealOverlayDrawable();
    }

    @Override // hg.j
    public int getCircularRevealScrimColor() {
        return this.f59573s.getCircularRevealScrimColor();
    }

    @Override // hg.j
    public i getRevealInfo() {
        return this.f59573s.getRevealInfo();
    }

    @Override // android.view.View, hg.j
    public boolean isOpaque() {
        e eVar = this.f59573s;
        return eVar != null ? eVar.isOpaque() : super.isOpaque();
    }

    @Override // hg.j
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f59573s.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // hg.j
    public void setCircularRevealScrimColor(int i10) {
        this.f59573s.setCircularRevealScrimColor(i10);
    }

    @Override // hg.j
    public void setRevealInfo(i iVar) {
        this.f59573s.setRevealInfo(iVar);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59573s = new e(this);
    }
}
