package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: g, reason: collision with root package name */
    public static o2 f82191g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f82193a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f82194b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f82195c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f82196d;

    /* renamed from: e, reason: collision with root package name */
    public p2 f82197e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f82190f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final a f82192h = new a(6);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends z.b0 {
        public a(int i10) {
            super(i10);
        }
    }

    public static synchronized o2 get() {
        try {
            if (f82191g == null) {
                f82191g = new o2();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f82191g;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        a aVar = f82192h;
        aVar.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) aVar.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i10) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f82195c == null) {
            this.f82195c = new TypedValue();
        }
        TypedValue typedValue = this.f82195c;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            z.x xVar = (z.x) this.f82194b.get(context);
            drawableNewDrawable = null;
            if (xVar != null && (weakReference = (WeakReference) xVar.get(j10)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    xVar.remove(j10);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        p2 p2Var = this.f82197e;
        Drawable drawableCreateDrawableFor = p2Var == null ? null : ((v) p2Var).createDrawableFor(this, context, i10);
        if (drawableCreateDrawableFor == null) {
            return drawableCreateDrawableFor;
        }
        drawableCreateDrawableFor.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = drawableCreateDrawableFor.getConstantState();
                if (constantState2 != null) {
                    z.x xVar2 = (z.x) this.f82194b.get(context);
                    if (xVar2 == null) {
                        xVar2 = new z.x();
                        this.f82194b.put(context, xVar2);
                    }
                    xVar2.put(j10, new WeakReference(constantState2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return drawableCreateDrawableFor;
    }

    public final synchronized Drawable b(Context context, int i10, boolean z10) {
        Drawable drawableA;
        try {
            if (!this.f82196d) {
                this.f82196d = true;
                Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
                if (drawable == null || (!(drawable instanceof f6.w) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName()))) {
                    this.f82196d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i10);
            if (drawableA == null) {
                drawableA = m3.a.getDrawable(context, i10);
            }
            if (drawableA != null) {
                drawableA = d(context, i10, z10, drawableA);
            }
            if (drawableA != null) {
                l1.a(drawableA);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableA;
    }

    public final synchronized ColorStateList c(Context context, int i10) {
        ColorStateList colorStateList;
        z.u1 u1Var;
        WeakHashMap weakHashMap = this.f82193a;
        ColorStateList tintListForDrawableRes = null;
        colorStateList = (weakHashMap == null || (u1Var = (z.u1) weakHashMap.get(context)) == null) ? null : (ColorStateList) u1Var.get(i10);
        if (colorStateList == null) {
            p2 p2Var = this.f82197e;
            if (p2Var != null) {
                tintListForDrawableRes = ((v) p2Var).getTintListForDrawableRes(context, i10);
            }
            if (tintListForDrawableRes != null) {
                if (this.f82193a == null) {
                    this.f82193a = new WeakHashMap();
                }
                z.u1 u1Var2 = (z.u1) this.f82193a.get(context);
                if (u1Var2 == null) {
                    u1Var2 = new z.u1();
                    this.f82193a.put(context, u1Var2);
                }
                u1Var2.append(i10, tintListForDrawableRes);
            }
            colorStateList = tintListForDrawableRes;
        }
        return colorStateList;
    }

    public final Drawable d(Context context, int i10, boolean z10, Drawable drawable) {
        p2 p2Var;
        ColorStateList colorStateListC = c(context, i10);
        if (colorStateListC != null) {
            Drawable drawableWrap = p3.a.wrap(drawable.mutate());
            p3.a.setTintList(drawableWrap, colorStateListC);
            p2 p2Var2 = this.f82197e;
            PorterDuff.Mode tintModeForDrawableRes = p2Var2 != null ? ((v) p2Var2).getTintModeForDrawableRes(i10) : null;
            if (tintModeForDrawableRes != null) {
                p3.a.setTintMode(drawableWrap, tintModeForDrawableRes);
            }
            return drawableWrap;
        }
        p2 p2Var3 = this.f82197e;
        if ((p2Var3 == null || !((v) p2Var3).tintDrawable(context, i10, drawable)) && (((p2Var = this.f82197e) == null || !((v) p2Var).tintDrawableUsingColorFilter(context, i10, drawable)) && z10)) {
            return null;
        }
        return drawable;
    }

    public synchronized Drawable getDrawable(Context context, int i10) {
        return b(context, i10, false);
    }

    public synchronized void onConfigurationChanged(Context context) {
        z.x xVar = (z.x) this.f82194b.get(context);
        if (xVar != null) {
            xVar.clear();
        }
    }

    public synchronized void setHooks(p2 p2Var) {
        this.f82197e = p2Var;
    }
}
