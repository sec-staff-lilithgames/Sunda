package f7;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f55460a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55461b;

    /* renamed from: c, reason: collision with root package name */
    public final c7.f f55462c;

    public f(Drawable drawable, boolean z10, c7.f fVar) {
        super(null);
        this.f55460a = drawable;
        this.f55461b = z10;
        this.f55462c = fVar;
    }

    public static /* synthetic */ f copy$default(f fVar, Drawable drawable, boolean z10, c7.f fVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = fVar.f55460a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f55461b;
        }
        if ((i10 & 4) != 0) {
            fVar2 = fVar.f55462c;
        }
        return fVar.copy(drawable, z10, fVar2);
    }

    public final f copy(Drawable drawable, boolean z10, c7.f fVar) {
        return new f(drawable, z10, fVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e0.areEqual(this.f55460a, fVar.f55460a) && this.f55461b == fVar.f55461b && this.f55462c == fVar.f55462c;
    }

    public final c7.f getDataSource() {
        return this.f55462c;
    }

    public final Drawable getDrawable() {
        return this.f55460a;
    }

    public int hashCode() {
        return this.f55462c.hashCode() + com.google.android.gms.internal.play_billing.a.c(this.f55460a.hashCode() * 31, 31, this.f55461b);
    }

    public final boolean isSampled() {
        return this.f55461b;
    }
}
