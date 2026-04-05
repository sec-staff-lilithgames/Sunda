package ed;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54092c;

    public b(a aVar, int i10) {
        this.f54092c = i10;
        this.f54093b = aVar;
    }

    @Override // ed.c
    public final a a() {
        switch (this.f54092c) {
            case 0:
                return ((o) this.f54093b).getNext();
            default:
                return ((o) this.f54093b).getPrevious();
        }
    }
}
