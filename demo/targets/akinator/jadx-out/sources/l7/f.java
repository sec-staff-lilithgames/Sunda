package l7;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f72550a;

    /* renamed from: b, reason: collision with root package name */
    public final i f72551b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f72552c;

    public f(Drawable drawable, i iVar, Throwable th2) {
        super(null);
        this.f72550a = drawable;
        this.f72551b = iVar;
        this.f72552c = th2;
    }

    public static /* synthetic */ f copy$default(f fVar, Drawable drawable, i iVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = fVar.getDrawable();
        }
        if ((i10 & 2) != 0) {
            iVar = fVar.getRequest();
        }
        if ((i10 & 4) != 0) {
            th2 = fVar.f72552c;
        }
        return fVar.copy(drawable, iVar, th2);
    }

    public final f copy(Drawable drawable, i iVar, Throwable th2) {
        return new f(drawable, iVar, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e0.areEqual(getDrawable(), fVar.getDrawable()) && e0.areEqual(getRequest(), fVar.getRequest()) && e0.areEqual(this.f72552c, fVar.f72552c);
    }

    @Override // l7.k
    public Drawable getDrawable() {
        return this.f72550a;
    }

    @Override // l7.k
    public i getRequest() {
        return this.f72551b;
    }

    public final Throwable getThrowable() {
        return this.f72552c;
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        return this.f72552c.hashCode() + ((getRequest().hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
