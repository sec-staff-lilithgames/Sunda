package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a2 extends d2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(tw.c cVar, int i10) {
        super(cVar);
        this.f95135e = i10;
    }

    @Override // yt.d2
    public final void e() {
        switch (this.f95135e) {
            case 0:
                break;
            default:
                onError(new qt.e("create: could not emit value due to lack of requests"));
                break;
        }
    }

    private final void f() {
    }
}
