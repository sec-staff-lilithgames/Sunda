package yg;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f94475a;

    public n(float f10) {
        this.f94475a = f10;
    }

    public static n createFromCornerSize(RectF rectF, d dVar) {
        return dVar instanceof n ? (n) dVar : new n(dVar.getCornerSize(rectF) / Math.min(rectF.width(), rectF.height()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f94475a == ((n) obj).f94475a;
    }

    @Override // yg.d
    public float getCornerSize(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f94475a;
    }

    public float getRelativePercent() {
        return this.f94475a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94475a)});
    }

    public String toString() {
        return a.b.f((int) (getRelativePercent() * 100.0f), "%", new StringBuilder());
    }
}
