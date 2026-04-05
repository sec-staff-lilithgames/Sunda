package io.odeeo.internal.p0;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface i extends g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        i createDataSource();
    }

    void addTransferListener(b0 b0Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(m mVar) throws IOException;

    @Override // io.odeeo.internal.p0.g
    /* synthetic */ int read(byte[] bArr, int i10, int i11) throws IOException;
}
