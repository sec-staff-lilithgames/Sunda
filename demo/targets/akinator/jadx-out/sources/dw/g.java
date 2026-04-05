package dw;

import java.io.IOException;
import pw.b1;
import pw.z0;
import xv.f0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g {
    void cancel();

    z0 createRequestBody(o0 o0Var, long j10) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    f getCarrier();

    boolean isResponseComplete();

    b1 openResponseBodySource(v0 v0Var) throws IOException;

    f0 peekTrailers() throws IOException;

    v0.a readResponseHeaders(boolean z10) throws IOException;

    long reportedContentLength(v0 v0Var) throws IOException;

    void writeRequestHeaders(o0 o0Var) throws IOException;
}
