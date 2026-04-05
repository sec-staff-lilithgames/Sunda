package r7;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f83944a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f83945b;

    public i0(Object obj) {
        this.f83944a = obj;
        this.f83945b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (getValue() != null && getValue().equals(i0Var.getValue())) {
            return true;
        }
        if (getException() == null || i0Var.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    public Throwable getException() {
        return this.f83945b;
    }

    public Object getValue() {
        return this.f83944a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public i0(Throwable th2) {
        this.f83945b = th2;
        this.f83944a = null;
    }
}
