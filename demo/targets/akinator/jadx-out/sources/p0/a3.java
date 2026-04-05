package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a3 {
    public static final void checkPrecondition(boolean z10, kv.a aVar) {
        if (z10) {
            return;
        }
        throwIllegalStateException((String) aVar.invoke());
    }

    public static final void requirePrecondition(boolean z10, kv.a aVar) {
        if (z10) {
            return;
        }
        throwIllegalArgumentException((String) aVar.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z10) {
        if (z10) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }
}
