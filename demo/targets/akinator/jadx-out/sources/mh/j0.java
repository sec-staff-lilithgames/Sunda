package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j0 {
    public static j0 compile(String str) {
        p1.checkNotNull(str);
        return o1.f74664a.compile(str);
    }

    public static boolean isPcreLike() {
        return o1.f74664a.isPcreLike();
    }

    public abstract int flags();

    public abstract i0 matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
