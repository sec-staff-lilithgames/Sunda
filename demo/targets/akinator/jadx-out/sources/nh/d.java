package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f76165h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(w wVar, int i10) {
        super(wVar);
        this.f76165h = i10;
    }

    @Override // nh.h
    public final Object a(Object obj, Object obj2) {
        switch (this.f76165h) {
            case 0:
                return obj2;
            default:
                return ec.immutableEntry(obj, obj2);
        }
    }
}
