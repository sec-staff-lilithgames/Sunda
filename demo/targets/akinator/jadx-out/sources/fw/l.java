package fw;

import fw.q;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f56177c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56178e;

    public /* synthetic */ l(Object obj, long j10, int i10) {
        this.f56176b = i10;
        this.f56178e = obj;
        this.f56177c = j10;
    }

    @Override // kv.a
    public final Object invoke() {
        boolean z10;
        switch (this.f56176b) {
            case 0:
                q qVar = (q) this.f56178e;
                long j10 = this.f56177c;
                q.b bVar = q.F;
                synchronized (qVar) {
                    long j11 = qVar.f56207p;
                    long j12 = qVar.f56206o;
                    if (j11 < j12) {
                        z10 = true;
                    } else {
                        qVar.f56206o = j12 + 1;
                        z10 = false;
                    }
                }
                if (z10) {
                    c cVar = c.f56124f;
                    qVar.close$okhttp(cVar, cVar, null);
                    j10 = -1;
                } else {
                    qVar.writePing(false, 1, 0);
                }
                return Long.valueOf(j10);
            default:
                ow.d dVar = (ow.d) this.f56178e;
                long j13 = this.f56177c;
                List list = ow.d.A;
                dVar.writePingFrame$okhttp();
                return Long.valueOf(j13);
        }
    }
}
