package ob;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.a0;
import tu.z;
import xv.j;
import xv.k;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f78779b;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f78779b = cancellableContinuationImpl;
    }

    @Override // xv.k
    public void onFailure(j call, IOException e10) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(e10, "e");
        CancellableContinuationImpl cancellableContinuationImpl = this.f78779b;
        if (cancellableContinuationImpl.isCancelled()) {
            return;
        }
        int i10 = z.f87419c;
        cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(e10)));
    }

    @Override // xv.k
    public void onResponse(j call, v0 response) {
        e0.checkNotNullParameter(call, "call");
        e0.checkNotNullParameter(response, "response");
        this.f78779b.resumeWith(z.m7131constructorimpl(response));
    }
}
