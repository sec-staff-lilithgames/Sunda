package et;

import com.inmobi.media.AbstractC2953q7;
import com.inmobi.media.C2767f7;
import io.odeeo.internal.r0.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55131c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f55132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f55133f;

    public /* synthetic */ b(int i10, long j10, l.a aVar) {
        this.f55130b = 1;
        this.f55131c = aVar;
        this.f55132e = i10;
        this.f55133f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55130b) {
            case 0:
                ((l.a) this.f55131c).a(this.f55133f, this.f55132e);
                break;
            case 1:
                ((l.a) this.f55131c).a(this.f55132e, this.f55133f);
                break;
            default:
                AbstractC2953q7.b((C2767f7) this.f55131c, this.f55133f, this.f55132e);
                break;
        }
    }

    public /* synthetic */ b(Object obj, long j10, int i10, int i11) {
        this.f55130b = i11;
        this.f55131c = obj;
        this.f55133f = j10;
        this.f55132e = i10;
    }
}
