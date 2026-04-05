package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class i0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f88744c;

    public /* synthetic */ i0(byte[] bArr, int i10) {
        this.f88743b = i10;
        this.f88744c = bArr;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f88743b) {
            case 0:
                return kotlin.jvm.internal.j.iterator(this.f88744c);
            default:
                return tu.i0.m7049iteratorimpl(this.f88744c);
        }
    }
}
