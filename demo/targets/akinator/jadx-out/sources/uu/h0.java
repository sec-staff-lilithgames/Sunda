package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class h0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88739b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long[] f88740c;

    public /* synthetic */ h0(long[] jArr, int i10) {
        this.f88739b = i10;
        this.f88740c = jArr;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f88739b) {
            case 0:
                return kotlin.jvm.internal.j.iterator(this.f88740c);
            default:
                return tu.q0.m7099iteratorimpl(this.f88740c);
        }
    }
}
