package u1;

import android.view.PointerIcon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final PointerIcon f87514a;

    public a(PointerIcon pointerIcon) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerIcon, "pointerIcon");
        this.f87514a = pointerIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.e0.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return kotlin.jvm.internal.e0.areEqual(this.f87514a, ((a) obj).f87514a);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
    }

    public final PointerIcon getPointerIcon() {
        return this.f87514a;
    }

    public int hashCode() {
        return this.f87514a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f87514a + ')';
    }
}
