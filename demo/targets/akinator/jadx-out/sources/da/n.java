package da;

import kotlinx.coroutines.CancellableContinuationImpl;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f51969b;

    public n(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f51969b = cancellableContinuationImpl;
    }

    @Override // da.p
    public void onClose() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f51969b;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resume((CancellableContinuationImpl) x0.f87415a, (kv.l) m.f51968b);
        }
    }
}
