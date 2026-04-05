package zk;

import com.inmobi.media.Ib;
import com.inmobi.media.Ob;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.l f98156c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ob f98157e;

    public /* synthetic */ o(kv.l lVar, Ob ob2, int i10) {
        this.f98155b = i10;
        this.f98156c = lVar;
        this.f98157e = ob2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98155b) {
            case 0:
                Ib.a(this.f98156c, this.f98157e);
                break;
            case 1:
                Ob.a(this.f98156c, this.f98157e);
                break;
            default:
                Ob.b(this.f98156c, this.f98157e);
                break;
        }
    }
}
