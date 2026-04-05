package k4;

import kotlinx.coroutines.DisposableHandle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DisposableHandle f70581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(DisposableHandle disposableHandle) {
        super(0);
        this.f70581e = disposableHandle;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m5126invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5126invoke() {
        this.f70581e.dispose();
    }
}
