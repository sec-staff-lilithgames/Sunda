package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f70525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar) {
        super(0);
        this.f70525e = pVar;
    }

    @Override // kv.a
    public final l1 invoke() {
        return this.f70525e.getStorageConnection$datastore_core_release().getCoordinator();
    }
}
