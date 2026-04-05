package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class g0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ short[] f88731c;

    public /* synthetic */ g0(short[] sArr, int i10) {
        this.f88730b = i10;
        this.f88731c = sArr;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f88730b) {
            case 0:
                return kotlin.jvm.internal.j.iterator(this.f88731c);
            default:
                return tu.v0.m7124iteratorimpl(this.f88731c);
        }
    }
}
