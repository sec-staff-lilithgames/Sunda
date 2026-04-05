package id;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import j1.n0;
import kotlin.jvm.internal.e0;
import l1.i;
import p0.j2;
import p0.j4;
import p0.o5;
import qv.v;
import s2.x;
import tu.o;
import tu.q;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends m1.e implements j4 {

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f59536h;

    /* renamed from: i, reason: collision with root package name */
    public final j2 f59537i;

    /* renamed from: j, reason: collision with root package name */
    public final j2 f59538j;

    /* renamed from: k, reason: collision with root package name */
    public final o f59539k;

    public c(Drawable drawable) {
        e0.checkNotNullParameter(drawable, "drawable");
        this.f59536h = drawable;
        this.f59537i = o5.mutableStateOf$default(0, null, 2, null);
        this.f59538j = o5.mutableStateOf$default(i1.o.m4240boximpl(e.access$getIntrinsicSize(drawable)), null, 2, null);
        this.f59539k = q.lazy(new b(this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f59536h.setAlpha(v.coerceIn(mv.d.roundToInt(f10 * 255), 0, 255));
        return true;
    }

    @Override // m1.e
    public final boolean b(n0 n0Var) {
        this.f59536h.setColorFilter(n0Var != null ? j1.e.asAndroidColorFilter(n0Var) : null);
        return true;
    }

    @Override // m1.e
    public final void c(x layoutDirection) {
        int i10;
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new t();
            }
        } else {
            i10 = 0;
        }
        this.f59536h.setLayoutDirection(i10);
    }

    @Override // m1.e
    public final void d(i iVar) {
        e0.checkNotNullParameter(iVar, "<this>");
        j1.e0 canvas = ((l1.b) iVar.getDrawContext()).getCanvas();
        ((Number) this.f59537i.getValue()).intValue();
        int iRoundToInt = mv.d.roundToInt(i1.o.m4252getWidthimpl(iVar.mo5314getSizeNHjbRc()));
        int iRoundToInt2 = mv.d.roundToInt(i1.o.m4249getHeightimpl(iVar.mo5314getSizeNHjbRc()));
        Drawable drawable = this.f59536h;
        drawable.setBounds(0, 0, iRoundToInt, iRoundToInt2);
        try {
            canvas.save();
            drawable.draw(j1.d.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    public final Drawable getDrawable() {
        return this.f59536h;
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo138getIntrinsicSizeNHjbRc() {
        return ((i1.o) this.f59538j.getValue()).m4257unboximpl();
    }

    @Override // p0.j4
    public void onAbandoned() {
        onForgotten();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p0.j4
    public void onForgotten() {
        Drawable drawable = this.f59536h;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p0.j4
    public void onRemembered() {
        Drawable.Callback callback = (Drawable.Callback) this.f59539k.getValue();
        Drawable drawable = this.f59536h;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
