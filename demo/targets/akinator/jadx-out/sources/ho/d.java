package ho;

import go.u;
import go.v;
import go.w;
import go.x;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import pn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements u {

    /* renamed from: b, reason: collision with root package name */
    public final c f59090b;

    public d(c cVar) {
        this.f59090b = cVar;
    }

    @Override // go.u
    public void onLoadCompleted(x xVar, long j10, long j11) {
        c cVar = this.f59090b;
        if (cVar != null) {
            if (f.isInitialized()) {
                ((h) cVar).onInitialized();
            } else {
                ((h) cVar).onInitializationFailed(new IOException(new ConcurrentModificationException()));
            }
        }
    }

    @Override // go.u
    public v onLoadError(x xVar, long j10, long j11, IOException iOException, int i10) {
        c cVar = this.f59090b;
        if (cVar != null) {
            ((h) cVar).onInitializationFailed(iOException);
        }
        return w.f58371e;
    }

    @Override // go.u
    public /* bridge */ /* synthetic */ void onLoadStarted(x xVar, long j10, long j11, int i10) {
        super.onLoadStarted(xVar, j10, j11, i10);
    }

    @Override // go.u
    public void onLoadCanceled(x xVar, long j10, long j11, boolean z10) {
    }
}
