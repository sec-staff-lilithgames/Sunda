package qf;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p extends k {
    void addTransferListener(c1 c1Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(t tVar) throws IOException;

    @Override // qf.k
    /* synthetic */ int read(byte[] bArr, int i10, int i11) throws IOException;
}
