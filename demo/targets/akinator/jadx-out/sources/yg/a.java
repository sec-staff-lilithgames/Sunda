package yg;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f94398a;

    public a(float f10) {
        this.f94398a = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f94398a == ((a) obj).f94398a;
    }

    @Override // yg.d
    public float getCornerSize(RectF rectF) {
        return this.f94398a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94398a)});
    }

    public String toString() {
        return getCornerSize() + "px";
    }

    public float getCornerSize() {
        return this.f94398a;
    }
}
