package j0;

import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f68756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f68757f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10, kv.l lVar) {
        super(0);
        this.f68756e = lVar;
        this.f68757f = z10;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m4641invoke();
        return x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4641invoke() {
        this.f68756e.invoke(Boolean.valueOf(!this.f68757f));
    }
}
