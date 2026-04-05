package c7;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f11838a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11839b;

    public g(Drawable drawable, boolean z10) {
        this.f11838a = drawable;
        this.f11839b = z10;
    }

    public static /* synthetic */ g copy$default(g gVar, Drawable drawable, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = gVar.f11838a;
        }
        if ((i10 & 2) != 0) {
            z10 = gVar.f11839b;
        }
        return gVar.copy(drawable, z10);
    }

    public final g copy(Drawable drawable, boolean z10) {
        return new g(drawable, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return e0.areEqual(this.f11838a, gVar.f11838a) && this.f11839b == gVar.f11839b;
    }

    public final Drawable getDrawable() {
        return this.f11838a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f11839b) + (this.f11838a.hashCode() * 31);
    }

    public final boolean isSampled() {
        return this.f11839b;
    }
}
