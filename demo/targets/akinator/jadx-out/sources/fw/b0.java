package fw;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 implements c0 {
    @Override // fw.c0
    public boolean onData(int i10, pw.k source, int i11, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        source.skip(i11);
        return true;
    }

    @Override // fw.c0
    public boolean onHeaders(int i10, List<f> responseHeaders, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseHeaders, "responseHeaders");
        return true;
    }

    @Override // fw.c0
    public boolean onRequest(int i10, List<f> requestHeaders) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        return true;
    }

    @Override // fw.c0
    public void onReset(int i10, c errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
    }
}
