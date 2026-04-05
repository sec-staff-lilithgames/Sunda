package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f58581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar) {
        super(1);
        this.f58581e = sVar;
    }

    @Override // kv.l
    public final Boolean invoke(s destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        if (kotlin.jvm.internal.e0.areEqual(destination, this.f58581e)) {
            return Boolean.FALSE;
        }
        if (destination.getParent() == null) {
            throw new IllegalStateException("Move focus landed at the root.");
        }
        x0.requestFocus(destination);
        return Boolean.TRUE;
    }
}
