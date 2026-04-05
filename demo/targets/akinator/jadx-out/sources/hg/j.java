package hg;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface j extends d {
    @Override // hg.d
    /* synthetic */ void actualDraw(Canvas canvas);

    @Override // hg.d
    /* synthetic */ boolean actualIsOpaque();

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    Drawable getCircularRevealOverlayDrawable();

    int getCircularRevealScrimColor();

    i getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(i iVar);
}
