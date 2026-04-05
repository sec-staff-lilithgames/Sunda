package b7;

import b7.i;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f8827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f8828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.l f8829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kv.l lVar, kv.l lVar2, kv.l lVar3) {
        super(1);
        this.f8827e = lVar;
        this.f8828f = lVar2;
        this.f8829g = lVar3;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((i.b) obj);
        return x0.f87415a;
    }

    public final void invoke(i.b bVar) {
        kv.l lVar;
        if (bVar instanceof i.b.C0013b) {
            kv.l lVar2 = this.f8827e;
            if (lVar2 != null) {
                lVar2.invoke(bVar);
                return;
            }
            return;
        }
        if (bVar instanceof i.b.c) {
            kv.l lVar3 = this.f8828f;
            if (lVar3 != null) {
                lVar3.invoke(bVar);
                return;
            }
            return;
        }
        if (!(bVar instanceof i.b.a) || (lVar = this.f8829g) == null) {
            return;
        }
        lVar.invoke(bVar);
    }
}
