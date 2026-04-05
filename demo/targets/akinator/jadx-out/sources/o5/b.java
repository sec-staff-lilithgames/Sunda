package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77500b;

    public b(String str) {
        this.f77500b = str;
    }

    @Override // kv.l
    public final Void invoke(Throwable error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        throw new IllegalStateException(j1.o2.o(new StringBuilder("Unable to open database '"), this.f77500b, "'. Was a proper path / name used in Room's database builder?"), error);
    }
}
