package id;

import android.graphics.drawable.Drawable;
import i1.o;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f59534b;

    public a(c cVar) {
        this.f59534b = cVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable d10) {
        e0.checkNotNullParameter(d10, "d");
        c cVar = this.f59534b;
        cVar.f59537i.setValue(Integer.valueOf(((Number) cVar.f59537i.getValue()).intValue() + 1));
        cVar.f59538j.setValue(o.m4240boximpl(e.access$getIntrinsicSize(cVar.getDrawable())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable d10, Runnable what, long j10) {
        e0.checkNotNullParameter(d10, "d");
        e0.checkNotNullParameter(what, "what");
        e.access$getMAIN_HANDLER().postAtTime(what, j10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable d10, Runnable what) {
        e0.checkNotNullParameter(d10, "d");
        e0.checkNotNullParameter(what, "what");
        e.access$getMAIN_HANDLER().removeCallbacks(what);
    }
}
