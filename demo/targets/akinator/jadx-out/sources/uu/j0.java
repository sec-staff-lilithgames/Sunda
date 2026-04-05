package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class j0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f88748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int[] f88749c;

    public /* synthetic */ j0(int[] iArr, int i10) {
        this.f88748b = i10;
        this.f88749c = iArr;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f88748b) {
            case 0:
                return kotlin.jvm.internal.j.iterator(this.f88749c);
            default:
                return tu.m0.m7074iteratorimpl(this.f88749c);
        }
    }
}
