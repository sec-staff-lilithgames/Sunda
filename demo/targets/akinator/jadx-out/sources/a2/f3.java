package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5.h f3558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(boolean z10, v5.h hVar, String str) {
        super(0);
        this.f3557e = z10;
        this.f3558f = hVar;
        this.f3559g = str;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m32invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m32invoke() {
        if (this.f3557e) {
            this.f3558f.unregisterSavedStateProvider(this.f3559g);
        }
    }
}
