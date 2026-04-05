package id;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import i1.p;
import j1.g;
import j1.o0;
import kotlin.jvm.internal.e0;
import p0.d0;
import p0.v;
import p0.w;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final o f59541a = q.lazy(s.f87405e, (kv.a) d.f59540e);

    public static final long access$getIntrinsicSize(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? i1.o.f59366b.m4238getUnspecifiedNHjbRc() : p.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static final Handler access$getMAIN_HANDLER() {
        return (Handler) f59541a.getValue();
    }

    public static final m1.e rememberDrawablePainter(Drawable drawable, w wVar, int i10) {
        Object cVar;
        wVar.startReplaceableGroup(1756822313);
        if (d0.isTraceInProgress()) {
            d0.traceEventStart(1756822313, i10, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:154)");
        }
        wVar.startReplaceableGroup(1157296644);
        boolean zChanged = wVar.changed(drawable);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
            if (drawable == null) {
                objRememberedValue = f.f59542h;
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                e0.checkNotNullExpressionValue(bitmap, "drawable.bitmap");
                objRememberedValue = new m1.a(g.asImageBitmap(bitmap), 0L, 0L, 6, null);
            } else {
                if (drawable instanceof ColorDrawable) {
                    cVar = new m1.c(o0.Color(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    e0.checkNotNullExpressionValue(drawableMutate, "drawable.mutate()");
                    cVar = new c(drawableMutate);
                }
                objRememberedValue = cVar;
            }
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        m1.e eVar = (m1.e) objRememberedValue;
        if (d0.isTraceInProgress()) {
            d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return eVar;
    }
}
