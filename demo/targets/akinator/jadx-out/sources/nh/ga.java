package nh;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class ga implements ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76295b;

    public /* synthetic */ ga(Object obj, int i10) {
        this.f76294a = i10;
        this.f76295b = obj;
    }

    @Override // nh.ya
    public final Object transformEntry(Object obj, Object obj2) {
        switch (this.f76294a) {
            case 0:
                return ((mh.v0) this.f76295b).apply(obj2);
            case 1:
                return ((mh.v0) this.f76295b).apply(obj2);
            case 2:
                return ((mh.v0) this.f76295b).apply(obj2);
            case 3:
                return ((mh.v0) this.f76295b).apply(obj2);
            case 4:
                return ((mh.v0) this.f76295b).apply(obj2);
            default:
                return ((nd) this.f76295b).g(obj, (Collection) obj2);
        }
    }
}
