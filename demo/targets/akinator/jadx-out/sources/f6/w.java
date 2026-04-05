package f6;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends n {

    /* renamed from: l, reason: collision with root package name */
    public static final PorterDuff.Mode f55441l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public u f55442c;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuffColorFilter f55443e;

    /* renamed from: f, reason: collision with root package name */
    public ColorFilter f55444f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55446h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f55447i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f55448j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f55449k;

    public w() {
        this.f55446h = true;
        this.f55447i = new float[9];
        this.f55448j = new Matrix();
        this.f55449k = new Rect();
        this.f55442c = new u();
    }

    public static w create(Resources resources, int i10, Resources.Theme theme) {
        w wVar = new w();
        wVar.f55386b = n3.p.getDrawable(resources, i10, theme);
        new v(wVar.f55386b.getConstantState());
        return wVar;
    }

    public static w createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        w wVar = new w();
        wVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return wVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f55386b;
        if (drawable == null) {
            return false;
        }
        p3.a.canApplyTheme(drawable);
        return false;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f55449k;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f55444f;
        if (colorFilter == null) {
            colorFilter = this.f55443e;
        }
        Matrix matrix = this.f55448j;
        canvas.getMatrix(matrix);
        float[] fArr = this.f55447i;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && p3.a.getLayoutDirection(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.f55442c.createCachedBitmapIfNeeded(iMin, iMin2);
        if (!this.f55446h) {
            this.f55442c.updateCachedBitmap(iMin, iMin2);
        } else if (!this.f55442c.canReuseCache()) {
            this.f55442c.updateCachedBitmap(iMin, iMin2);
            this.f55442c.updateCacheStates();
        }
        this.f55442c.drawCachedBitmapWithRootAlpha(canvas, colorFilter, rect);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.getAlpha(drawable) : this.f55442c.f55429b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f55442c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.getColorFilter(drawable) : this.f55444f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f55386b != null) {
            return new v(this.f55386b.getConstantState());
        }
        this.f55442c.f55428a = getChangingConfigurations();
        return this.f55442c;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f55442c.f55429b.f55421i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f55442c.f55429b.f55420h;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public float getPixelSize() {
        t tVar;
        u uVar = this.f55442c;
        if (uVar == null || (tVar = uVar.f55429b) == null) {
            return 1.0f;
        }
        float f10 = tVar.f55420h;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        float f11 = tVar.f55421i;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        float f12 = tVar.f55423k;
        if (f12 == 0.0f) {
            return 1.0f;
        }
        float f13 = tVar.f55422j;
        if (f13 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f13 / f10, f12 / f11);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.isAutoMirrored(drawable) : this.f55442c.f55432e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        u uVar = this.f55442c;
        if (uVar == null) {
            return false;
        }
        if (uVar.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f55442c.f55430c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f55445g && super.mutate() == this) {
            this.f55442c = new u(this.f55442c);
            this.f55445g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        u uVar = this.f55442c;
        ColorStateList colorStateList = uVar.f55430c;
        if (colorStateList == null || (mode = uVar.f55431d) == null) {
            z10 = false;
        } else {
            this.f55443e = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!uVar.isStateful() || !uVar.onStateChanged(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f55442c.f55429b.getRootAlpha() != i10) {
            this.f55442c.f55429b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setAutoMirrored(drawable, z10);
        } else {
            this.f55442c.f55432e = z10;
        }
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTint(int i10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setTint(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setTintList(drawable, colorStateList);
            return;
        }
        u uVar = this.f55442c;
        if (uVar.f55430c != colorStateList) {
            uVar.f55430c = colorStateList;
            this.f55443e = a(colorStateList, uVar.f55431d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setTintMode(drawable, mode);
            return;
        }
        u uVar = this.f55442c;
        if (uVar.f55431d != mode) {
            uVar.f55431d = mode;
            this.f55443e = a(uVar.f55430c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f55444f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        u uVar = this.f55442c;
        uVar.f55429b = new t();
        TypedArray typedArrayObtainAttributes = n3.q.obtainAttributes(resources, theme, attributeSet, a.f55359a);
        u uVar2 = this.f55442c;
        t tVar = uVar2.f55429b;
        int namedInt = n3.q.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt != 5) {
            if (namedInt != 9) {
                switch (namedInt) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        uVar2.f55431d = mode;
        ColorStateList namedColorStateList = n3.q.getNamedColorStateList(typedArrayObtainAttributes, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            uVar2.f55430c = namedColorStateList;
        }
        uVar2.f55432e = n3.q.getNamedBoolean(typedArrayObtainAttributes, xmlPullParser, "autoMirrored", 5, uVar2.f55432e);
        tVar.f55422j = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportWidth", 7, tVar.f55422j);
        float namedFloat = n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportHeight", 8, tVar.f55423k);
        tVar.f55423k = namedFloat;
        if (tVar.f55422j <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (namedFloat > 0.0f) {
            tVar.f55420h = typedArrayObtainAttributes.getDimension(3, tVar.f55420h);
            int i10 = 2;
            float dimension = typedArrayObtainAttributes.getDimension(2, tVar.f55421i);
            tVar.f55421i = dimension;
            if (tVar.f55420h <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                tVar.setAlpha(n3.q.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "alpha", 4, tVar.getAlpha()));
                String string = typedArrayObtainAttributes.getString(0);
                if (string != null) {
                    tVar.f55425m = string;
                    tVar.f55427o.put(string, tVar);
                }
                typedArrayObtainAttributes.recycle();
                uVar.f55428a = getChangingConfigurations();
                uVar.f55438k = true;
                u uVar3 = this.f55442c;
                t tVar2 = uVar3.f55429b;
                ArrayDeque arrayDeque = new ArrayDeque();
                q qVar = tVar2.f55419g;
                z.f fVar = tVar2.f55427o;
                arrayDeque.push(qVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                for (int i11 = 1; eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != 3); i11 = 1) {
                    if (eventType == i10) {
                        String name = xmlPullParser.getName();
                        q qVar2 = (q) arrayDeque.peek();
                        if ("path".equals(name)) {
                            p pVar = new p();
                            pVar.f55388e = 0.0f;
                            pVar.f55390g = 1.0f;
                            pVar.f55391h = 1.0f;
                            pVar.f55392i = 0.0f;
                            pVar.f55393j = 1.0f;
                            pVar.f55394k = 0.0f;
                            pVar.f55395l = Paint.Cap.BUTT;
                            pVar.f55396m = Paint.Join.MITER;
                            pVar.f55397n = 4.0f;
                            pVar.inflate(resources, attributeSet, theme, xmlPullParser);
                            qVar2.f55399b.add(pVar);
                            if (pVar.getPathName() != null) {
                                fVar.put(pVar.getPathName(), pVar);
                            }
                            uVar3.f55428a = uVar3.f55428a;
                            z10 = false;
                        } else if ("clip-path".equals(name)) {
                            o oVar = new o();
                            oVar.inflate(resources, attributeSet, theme, xmlPullParser);
                            qVar2.f55399b.add(oVar);
                            if (oVar.getPathName() != null) {
                                fVar.put(oVar.getPathName(), oVar);
                            }
                            uVar3.f55428a = uVar3.f55428a;
                        } else if ("group".equals(name)) {
                            q qVar3 = new q();
                            qVar3.inflate(resources, attributeSet, theme, xmlPullParser);
                            qVar2.f55399b.add(qVar3);
                            arrayDeque.push(qVar3);
                            if (qVar3.getGroupName() != null) {
                                fVar.put(qVar3.getGroupName(), qVar3);
                            }
                            uVar3.f55428a = uVar3.f55428a;
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                    i10 = 2;
                }
                if (!z10) {
                    this.f55443e = a(uVar.f55430c, uVar.f55431d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public w(u uVar) {
        this.f55446h = true;
        this.f55447i = new float[9];
        this.f55448j = new Matrix();
        this.f55449k = new Rect();
        this.f55442c = uVar;
        this.f55443e = a(uVar.f55430c, uVar.f55431d);
    }
}
