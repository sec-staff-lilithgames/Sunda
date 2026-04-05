package fw;

import fw.q;
import java.io.IOException;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class n implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f56183c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f56184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f56185f;

    public /* synthetic */ n(q qVar, int i10, c cVar, int i11) {
        this.f56182b = i11;
        this.f56183c = qVar;
        this.f56184e = i10;
        this.f56185f = cVar;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f56182b) {
            case 0:
                q qVar = this.f56183c;
                int i10 = this.f56184e;
                c cVar = this.f56185f;
                q.b bVar = q.F;
                try {
                    qVar.writeSynReset$okhttp(i10, cVar);
                } catch (IOException e10) {
                    c cVar2 = c.f56124f;
                    qVar.close$okhttp(cVar2, cVar2, e10);
                }
                return x0.f87415a;
            default:
                q qVar2 = this.f56183c;
                int i11 = this.f56184e;
                qVar2.f56205n.onReset(i11, this.f56185f);
                synchronized (qVar2) {
                    qVar2.E.remove(Integer.valueOf(i11));
                }
                return x0.f87415a;
        }
    }
}
