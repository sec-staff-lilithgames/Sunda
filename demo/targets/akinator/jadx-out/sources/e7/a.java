package e7;

import a.b;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import f6.c;
import f6.d;
import java.util.ArrayList;
import kotlin.jvm.internal.u;
import m7.i;
import qv.v;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, d {

    /* renamed from: b, reason: collision with root package name */
    public final i f53898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53899c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53900e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53901f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f53902g;

    /* renamed from: h, reason: collision with root package name */
    public final int f53903h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53904i;

    /* renamed from: j, reason: collision with root package name */
    public long f53905j;

    /* renamed from: k, reason: collision with root package name */
    public int f53906k;

    /* renamed from: l, reason: collision with root package name */
    public int f53907l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f53908m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f53909n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0556a {
        public C0556a(u uVar) {
        }
    }

    static {
        new C0556a(null);
    }

    public a(Drawable drawable, Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    public final int a(Integer num, Integer num2) {
        if (this.f53901f || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final void b() {
        this.f53907l = 2;
        this.f53908m = null;
        ArrayList arrayList = this.f53902g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).onAnimationEnd(this);
        }
    }

    @Override // f6.d
    public void clearAnimationCallbacks() {
        this.f53902g.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i10 = this.f53907l;
        if (i10 == 0) {
            Drawable drawable2 = this.f53908m;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f53906k);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f53909n;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f53906k);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f53905j) / this.f53899c;
        double dCoerceIn = v.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f53906k;
        int i12 = (int) (dCoerceIn * i11);
        if (this.f53900e) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f53908m) != null) {
            drawable.setAlpha(i11);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f53906k;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.f53907l;
        if (i10 == 0) {
            Drawable drawable = this.f53908m;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f53909n;
        if (i10 != 1) {
            if (i10 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f53908m;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    public final int getDurationMillis() {
        return this.f53899c;
    }

    public final Drawable getEnd() {
        return this.f53909n;
    }

    public final boolean getFadeStart() {
        return this.f53900e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f53904i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f53903h;
    }

    @Override // android.graphics.drawable.Drawable
    @f
    public int getOpacity() {
        Drawable drawable = this.f53908m;
        int i10 = this.f53907l;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f53909n;
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.f53901f;
    }

    public final i getScale() {
        return this.f53898b;
    }

    public final Drawable getStart() {
        return this.f53908m;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f53907l == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            updateBounds$coil_base_release(drawable, rect);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 != null) {
            updateBounds$coil_base_release(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f53908m;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f53909n;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f53908m;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f53909n;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // f6.d
    public void registerAnimationCallback(c cVar) {
        this.f53902g.add(cVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(b.e(i10, "Invalid alpha: ").toString());
        }
        this.f53906k = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f53908m;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f53909n;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f53908m;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f53909n;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f53907l != 0) {
            return;
        }
        this.f53907l = 1;
        this.f53905j = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f53902g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f53908m;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f53909n;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f53907l != 2) {
            b();
        }
    }

    @Override // f6.d
    public boolean unregisterAnimationCallback(c cVar) {
        return this.f53902g.remove(cVar);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void updateBounds$coil_base_release(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dComputeSizeMultiplier = c7.i.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f53898b);
        double d10 = 2;
        int iRoundToInt = mv.d.roundToInt((iWidth - (intrinsicWidth * dComputeSizeMultiplier)) / d10);
        int iRoundToInt2 = mv.d.roundToInt((iHeight - (dComputeSizeMultiplier * intrinsicHeight)) / d10);
        drawable.setBounds(rect.left + iRoundToInt, rect.top + iRoundToInt2, rect.right - iRoundToInt, rect.bottom - iRoundToInt2);
    }

    public a(Drawable drawable, Drawable drawable2, i iVar) {
        this(drawable, drawable2, iVar, 0, false, false, 56, null);
    }

    public a(Drawable drawable, Drawable drawable2, i iVar, int i10) {
        this(drawable, drawable2, iVar, i10, false, false, 48, null);
    }

    public a(Drawable drawable, Drawable drawable2, i iVar, int i10, boolean z10) {
        this(drawable, drawable2, iVar, i10, z10, false, 32, null);
    }

    public /* synthetic */ a(Drawable drawable, Drawable drawable2, i iVar, int i10, boolean z10, boolean z11, int i11, u uVar) {
        this(drawable, drawable2, (i11 & 4) != 0 ? i.f74063c : iVar, (i11 & 8) != 0 ? 100 : i10, (i11 & 16) != 0 ? true : z10, (i11 & 32) != 0 ? false : z11);
    }

    public a(Drawable drawable, Drawable drawable2, i iVar, int i10, boolean z10, boolean z11) {
        this.f53898b = iVar;
        this.f53899c = i10;
        this.f53900e = z10;
        this.f53901f = z11;
        this.f53902g = new ArrayList();
        this.f53903h = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f53904i = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f53906k = 255;
        this.f53908m = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f53909n = drawableMutate;
        if (i10 > 0) {
            Drawable drawable3 = this.f53908m;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate == null) {
                return;
            }
            drawableMutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }
}
