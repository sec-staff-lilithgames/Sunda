package j0;

import kotlin.jvm.internal.f0;
import p0.v5;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f68794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v5 f68795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z10, v5 v5Var) {
        super(1);
        this.f68794e = z10;
        this.f68795f = v5Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m4653invokek4lQ0M(((i1.h) obj).m4195unboximpl());
        return x0.f87415a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m4653invokek4lQ0M(long j10) {
        if (this.f68794e) {
            ((kv.a) this.f68795f.getValue()).invoke();
        }
    }
}
