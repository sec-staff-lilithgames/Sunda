package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String message) {
        super(message);
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ u(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
