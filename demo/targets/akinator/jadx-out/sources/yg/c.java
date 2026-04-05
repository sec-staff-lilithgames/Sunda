package yg;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f94417a;

    public c(float f10) {
        this.f94417a = f10;
    }

    public static c createFromCornerSize(a aVar) {
        return new c(aVar.getCornerSize());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f94417a == ((c) obj).f94417a;
    }

    @Override // yg.d
    public float getCornerSize(RectF rectF) {
        return r3.a.clamp(this.f94417a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f94417a)});
    }
}
