package x3;

import android.graphics.Point;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f91687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91688b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f91689c;

    public v0(int i10, int i11, int i12, int i13) {
        this.f91687a = i10;
        this.f91688b = i11;
        this.f91689c = new Point(i12, i13);
    }

    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 3;
                }
                throw new IllegalArgumentException(a.b.e(i10, "Invalid position: "));
            }
        }
        return i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (this.f91687a == v0Var.f91687a && this.f91688b == v0Var.f91688b && this.f91689c.equals(v0Var.f91689c)) {
                return true;
            }
        }
        return false;
    }

    public Point getCenter() {
        return new Point(this.f91689c);
    }

    public int getCenterX() {
        return this.f91689c.x;
    }

    public int getCenterY() {
        return this.f91689c.y;
    }

    public int getPosition() {
        return this.f91687a;
    }

    public int getRadius() {
        return this.f91688b;
    }

    public int hashCode() {
        return this.f91689c.hashCode() + (((this.f91687a * 31) + this.f91688b) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i10 = this.f91687a;
        sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb2.append(", radius=");
        sb2.append(this.f91688b);
        sb2.append(", center=");
        sb2.append(this.f91689c);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }
}
