package b7;

import b7.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m1.e f8831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1.e f8832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m1.e f8833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m1.e eVar, m1.e eVar2, m1.e eVar3) {
        super(1);
        this.f8831e = eVar;
        this.f8832f = eVar2;
        this.f8833g = eVar3;
    }

    @Override // kv.l
    public final i.b invoke(i.b bVar) {
        if (bVar instanceof i.b.C0013b) {
            m1.e eVar = this.f8831e;
            i.b.C0013b c0013b = (i.b.C0013b) bVar;
            return eVar != null ? c0013b.copy(eVar) : c0013b;
        }
        if (!(bVar instanceof i.b.a)) {
            return bVar;
        }
        i.b.a aVar = (i.b.a) bVar;
        if (aVar.getResult().getThrowable() instanceof l7.m) {
            m1.e eVar2 = this.f8832f;
            return eVar2 != null ? i.b.a.copy$default(aVar, eVar2, null, 2, null) : aVar;
        }
        m1.e eVar3 = this.f8833g;
        return eVar3 != null ? i.b.a.copy$default(aVar, eVar3, null, 2, null) : aVar;
    }
}
