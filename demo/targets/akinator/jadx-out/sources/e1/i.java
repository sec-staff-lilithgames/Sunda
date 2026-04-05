package e1;

import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1.l f53478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h1.l lVar) {
        super(0);
        this.f53478e = lVar;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3803invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3803invoke() {
        this.f53478e.notifyIfNoFocusModifiers();
    }
}
