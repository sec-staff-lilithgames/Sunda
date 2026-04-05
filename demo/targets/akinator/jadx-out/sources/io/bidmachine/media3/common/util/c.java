package io.bidmachine.media3.common.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f60699c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60700e;

    public /* synthetic */ c(e eVar, Object obj, int i10) {
        this.f60698b = i10;
        this.f60699c = eVar;
        this.f60700e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60698b) {
            case 0:
                e eVar = this.f60699c;
                if (eVar.f60713f == 0) {
                    Object obj = eVar.f60711d;
                    Object obj2 = this.f60700e;
                    eVar.f60711d = obj2;
                    if (!obj.equals(obj2)) {
                        eVar.f60710c.onStateChanged(obj, obj2);
                        break;
                    }
                }
                break;
            default:
                e eVar2 = this.f60699c;
                int i10 = eVar2.f60713f - 1;
                eVar2.f60713f = i10;
                if (i10 == 0) {
                    Object obj3 = eVar2.f60711d;
                    Object obj4 = this.f60700e;
                    eVar2.f60711d = obj4;
                    if (!obj3.equals(obj4)) {
                        eVar2.f60710c.onStateChanged(obj3, obj4);
                        break;
                    }
                }
                break;
        }
    }
}
