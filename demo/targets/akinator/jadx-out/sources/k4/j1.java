package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends q2 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f70379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Throwable finalException) {
        super(Integer.MAX_VALUE, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(finalException, "finalException");
        this.f70379b = finalException;
    }

    public final Throwable getFinalException() {
        return this.f70379b;
    }
}
