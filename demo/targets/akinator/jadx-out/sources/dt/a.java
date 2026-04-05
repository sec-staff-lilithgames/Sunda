package dt;

import android.media.MediaCodec;
import io.odeeo.internal.r.h;
import io.odeeo.internal.r.n;
import qe.e0;
import xn.j0;
import xn.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52654c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f52652a = i10;
        this.f52654c = obj;
        this.f52653b = obj2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f52652a) {
            case 0:
                ((io.odeeo.internal.r.a) this.f52654c).a((h.c) this.f52653b, mediaCodec, j10, j11);
                break;
            case 1:
                ((n) this.f52654c).a((h.c) this.f52653b, mediaCodec, j10, j11);
                break;
            case 2:
                qe.c cVar = (qe.c) this.f52654c;
                qe.n nVar = (qe.n) this.f52653b;
                cVar.getClass();
                nVar.onFrameRendered(cVar, j10, j11);
                break;
            case 3:
                e0 e0Var = (e0) this.f52654c;
                qe.n nVar2 = (qe.n) this.f52653b;
                e0Var.getClass();
                nVar2.onFrameRendered(e0Var, j10, j11);
                break;
            case 4:
                xn.b bVar = (xn.b) this.f52654c;
                o oVar = (o) this.f52653b;
                bVar.getClass();
                oVar.onFrameRendered(bVar, j10, j11);
                break;
            default:
                j0 j0Var = (j0) this.f52654c;
                o oVar2 = (o) this.f52653b;
                j0Var.getClass();
                oVar2.onFrameRendered(j0Var, j10, j11);
                break;
        }
    }
}
