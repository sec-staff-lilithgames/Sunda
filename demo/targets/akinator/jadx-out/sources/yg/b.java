package yg;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f94407a;

    /* renamed from: b, reason: collision with root package name */
    public final float f94408b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f94407a;
            f10 += ((b) dVar).f94408b;
        }
        this.f94407a = dVar;
        this.f94408b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f94407a.equals(bVar.f94407a) && this.f94408b == bVar.f94408b;
    }

    @Override // yg.d
    public float getCornerSize(RectF rectF) {
        return Math.max(0.0f, this.f94407a.getCornerSize(rectF) + this.f94408b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f94407a, Float.valueOf(this.f94408b)});
    }
}
