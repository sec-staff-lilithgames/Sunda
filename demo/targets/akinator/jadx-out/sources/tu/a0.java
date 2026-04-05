package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a0 {
    public static final Object createFailure(Throwable exception) {
        kotlin.jvm.internal.e0.checkNotNullParameter(exception, "exception");
        return new y(exception);
    }

    public static final void throwOnFailure(Object obj) {
        if (obj instanceof y) {
            throw ((y) obj).f87416b;
        }
    }
}
