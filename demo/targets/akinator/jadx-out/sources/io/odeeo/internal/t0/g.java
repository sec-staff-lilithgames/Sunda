package io.odeeo.internal.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {
    public static g compile(String str) {
        return t.a(str);
    }

    public static boolean isPcreLike() {
        return t.b();
    }

    public abstract int flags();

    public abstract f matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
