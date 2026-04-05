package w1;

import b0.e2;
import e3.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements r1.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f90323a;

    /* renamed from: b, reason: collision with root package name */
    public final float f90324b;

    /* renamed from: c, reason: collision with root package name */
    public final long f90325c;

    public d(float f10, float f11, long j10) {
        this.f90323a = f10;
        this.f90324b = f11;
        this.f90325c = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f90323a == this.f90323a && dVar.f90324b == this.f90324b && dVar.f90325c == this.f90325c;
    }

    public final float getHorizontalScrollPixels() {
        return this.f90324b;
    }

    public final long getUptimeMillis() {
        return this.f90325c;
    }

    public final float getVerticalScrollPixels() {
        return this.f90323a;
    }

    public int hashCode() {
        return Long.hashCode(this.f90325c) + e2.b(this.f90324b, Float.hashCode(this.f90323a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f90323a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f90324b);
        sb2.append(",uptimeMillis=");
        return g.n(sb2, this.f90325c, ')');
    }
}
