package hg;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f58767a;

    /* renamed from: b, reason: collision with root package name */
    public final View f58768b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f58769c;

    /* renamed from: d, reason: collision with root package name */
    public i f58770d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f58771e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(d dVar) {
        this.f58767a = dVar;
        View view = (View) dVar;
        this.f58768b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f58769c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            hg.i r0 = r7.f58770d
            if (r0 == 0) goto Ld
            boolean r0 = r0.isInvalid()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            android.graphics.Paint r6 = r7.f58769c
            hg.d r1 = r7.f58767a
            android.view.View r2 = r7.f58768b
            if (r0 != 0) goto L36
            r1.actualDraw(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L34
            int r0 = r2.getWidth()
            float r4 = (float) r0
            int r0 = r2.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L53
        L34:
            r1 = r8
            goto L53
        L36:
            r1.actualDraw(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L34
            int r0 = r2.getWidth()
            float r4 = (float) r0
            int r0 = r2.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L53:
            android.graphics.drawable.Drawable r8 = r7.f58771e
            if (r8 == 0) goto L84
            hg.i r0 = r7.f58770d
            if (r0 == 0) goto L84
            android.graphics.Rect r8 = r8.getBounds()
            hg.i r0 = r7.f58770d
            float r0 = r0.f58776a
            int r2 = r8.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 - r2
            hg.i r2 = r7.f58770d
            float r2 = r2.f58777b
            int r8 = r8.height()
            float r8 = (float) r8
            float r8 = r8 / r3
            float r2 = r2 - r8
            r1.translate(r0, r2)
            android.graphics.drawable.Drawable r8 = r7.f58771e
            r8.draw(r1)
            float r8 = -r0
            float r0 = -r2
            r1.translate(r8, r0)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.e.draw(android.graphics.Canvas):void");
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f58771e;
    }

    public int getCircularRevealScrimColor() {
        return this.f58769c.getColor();
    }

    public i getRevealInfo() {
        i iVar = this.f58770d;
        if (iVar == null) {
            return null;
        }
        i iVar2 = new i(iVar);
        if (iVar2.isInvalid()) {
            float f10 = iVar2.f58776a;
            float f11 = iVar2.f58777b;
            View view = this.f58768b;
            iVar2.f58778c = rg.a.distanceToFurthestCorner(f10, f11, 0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        return iVar2;
    }

    public boolean isOpaque() {
        if (this.f58767a.actualIsOpaque()) {
            i iVar = this.f58770d;
            if (iVar == null || iVar.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f58771e = drawable;
        this.f58768b.invalidate();
    }

    public void setCircularRevealScrimColor(int i10) {
        this.f58769c.setColor(i10);
        this.f58768b.invalidate();
    }

    public void setRevealInfo(i iVar) {
        View view = this.f58768b;
        if (iVar == null) {
            this.f58770d = null;
        } else {
            i iVar2 = this.f58770d;
            if (iVar2 == null) {
                this.f58770d = new i(iVar);
            } else {
                iVar2.set(iVar);
            }
            if (rg.a.geq(iVar.f58778c, rg.a.distanceToFurthestCorner(iVar.f58776a, iVar.f58777b, 0.0f, 0.0f, view.getWidth(), view.getHeight()), 1.0E-4f)) {
                this.f58770d.f58778c = Float.MAX_VALUE;
            }
        }
        view.invalidate();
    }

    public void buildCircularRevealCache() {
    }

    public void destroyCircularRevealCache() {
    }
}
