package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f87519a;

    public b(int i10) {
        this.f87519a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.e0.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f87519a == ((b) obj).f87519a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
    }

    public final int getType() {
        return this.f87519a;
    }

    public int hashCode() {
        return this.f87519a;
    }

    public String toString() {
        return e3.g.m(new StringBuilder("AndroidPointerIcon(type="), this.f87519a, ')');
    }
}
