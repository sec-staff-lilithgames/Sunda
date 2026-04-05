package f6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends n implements d {

    /* renamed from: c, reason: collision with root package name */
    public final g f55379c;

    /* renamed from: e, reason: collision with root package name */
    public final Context f55380e;

    /* renamed from: f, reason: collision with root package name */
    public f f55381f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f55382g = null;

    /* renamed from: h, reason: collision with root package name */
    public final e f55383h;

    public i(Context context, int i10) {
        e eVar = new e(this);
        this.f55383h = eVar;
        this.f55380e = context;
        this.f55379c = new g(context, null, eVar, null);
    }

    public static i create(Context context, int i10) throws Resources.NotFoundException {
        i iVar = new i(context, 0);
        Drawable drawable = n3.p.getDrawable(context.getResources(), i10, context.getTheme());
        iVar.f55386b = drawable;
        drawable.setCallback(iVar.f55383h);
        new h(iVar.f55386b.getConstantState());
        return iVar;
    }

    public static i createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        i iVar = new i(context, 0);
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.applyTheme(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return p3.a.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // f6.d
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        f fVar = this.f55381f;
        if (fVar != null) {
            this.f55379c.f55375b.removeListener(fVar);
            this.f55381f = null;
        }
        ArrayList arrayList = this.f55382g;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
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
        g gVar = this.f55379c;
        gVar.f55374a.draw(canvas);
        if (gVar.f55375b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.getAlpha(drawable) : this.f55379c.f55374a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f55379c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.getColorFilter(drawable) : this.f55379c.f55374a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f55386b != null) {
            return new h(this.f55386b.getConstantState());
        }
        return null;
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f55379c.f55374a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f55379c.f55374a.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f55379c.f55374a.getOpacity();
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r3.setupAnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f55386b
            if (r0 == 0) goto L8
            p3.a.inflate(r0, r8, r9, r10, r11)
            return
        L8:
            int r0 = r9.getEventType()
            int r1 = r9.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            f6.g r3 = r7.f55379c
            if (r0 == r2) goto Lb4
            int r4 = r9.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lb4
        L1f:
            r4 = 2
            if (r0 != r4) goto Lae
            java.lang.String r0 = r9.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L54
            int[] r0 = f6.a.f55363e
            android.content.res.TypedArray r0 = n3.q.obtainAttributes(r8, r11, r10, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L50
            f6.w r4 = f6.w.create(r8, r4, r11)
            r4.f55446h = r5
            f6.e r5 = r7.f55383h
            r4.setCallback(r5)
            f6.w r5 = r3.f55374a
            if (r5 == 0) goto L4e
            r6 = 0
            r5.setCallback(r6)
        L4e:
            r3.f55374a = r4
        L50:
            r0.recycle()
            goto Lae
        L54:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lae
            int[] r0 = f6.a.f55364f
            android.content.res.TypedArray r0 = r8.obtainAttributes(r10, r0)
            java.lang.String r4 = r0.getString(r5)
            int r5 = r0.getResourceId(r2, r5)
            if (r5 == 0) goto Lab
            android.content.Context r6 = r7.f55380e
            if (r6 == 0) goto La0
            android.animation.Animator r5 = f6.l.loadAnimator(r6, r5)
            f6.w r6 = r3.f55374a
            f6.u r6 = r6.f55442c
            f6.t r6 = r6.f55429b
            z.f r6 = r6.f55427o
            java.lang.Object r6 = r6.get(r4)
            r5.setTarget(r6)
            java.util.ArrayList r6 = r3.f55376c
            if (r6 != 0) goto L95
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.f55376c = r6
            z.f r6 = new z.f
            r6.<init>()
            r3.f55377d = r6
        L95:
            java.util.ArrayList r6 = r3.f55376c
            r6.add(r5)
            z.f r3 = r3.f55377d
            r3.put(r5, r4)
            goto Lab
        La0:
            r0.recycle()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Context can't be null when inflating animators"
            r8.<init>(r9)
            throw r8
        Lab:
            r0.recycle()
        Lae:
            int r0 = r9.next()
            goto L12
        Lb4:
            r3.setupAnimatorSet()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.i.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f55386b;
        return drawable != null ? p3.a.isAutoMirrored(drawable) : this.f55379c.f55374a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f55386b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f55379c.f55375b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.isStateful() : this.f55379c.f55374a.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f55379c.f55374a.setBounds(rect);
        }
    }

    @Override // f6.n, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.setLevel(i10) : this.f55379c.f55374a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f55386b;
        return drawable != null ? drawable.setState(iArr) : this.f55379c.f55374a.setState(iArr);
    }

    @Override // f6.d
    public void registerAnimationCallback(c cVar) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.a());
            return;
        }
        if (cVar == null) {
            return;
        }
        if (this.f55382g == null) {
            this.f55382g = new ArrayList();
        }
        if (this.f55382g.contains(cVar)) {
            return;
        }
        this.f55382g.add(cVar);
        if (this.f55381f == null) {
            this.f55381f = new f(this);
        }
        this.f55379c.f55375b.addListener(this.f55381f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f55379c.f55374a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setAutoMirrored(drawable, z10);
        } else {
            this.f55379c.f55374a.setAutoMirrored(z10);
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
            this.f55379c.f55374a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setTintList(drawable, colorStateList);
        } else {
            this.f55379c.f55374a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            p3.a.setTintMode(drawable, mode);
        } else {
            this.f55379c.f55374a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f55379c.f55374a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        g gVar = this.f55379c;
        if (gVar.f55375b.isStarted()) {
            return;
        }
        gVar.f55375b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f55379c.f55375b.end();
        }
    }

    @Override // f6.d
    public boolean unregisterAnimationCallback(c cVar) {
        f fVar;
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(cVar.a());
        }
        ArrayList arrayList = this.f55382g;
        if (arrayList == null || cVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(cVar);
        if (this.f55382g.size() == 0 && (fVar = this.f55381f) != null) {
            this.f55379c.f55375b.removeListener(fVar);
            this.f55381f = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f55386b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f55379c.f55374a.setColorFilter(colorFilter);
        }
    }

    public static void clearAnimationCallbacks(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    public static boolean unregisterAnimationCallback(Drawable drawable, c cVar) {
        if (drawable == null || cVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(cVar.a());
    }

    public static void registerAnimationCallback(Drawable drawable, c cVar) {
        if (drawable == null || cVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.a());
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
