package ln;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i extends gn.o {
    void addTransferListener(g0 g0Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long open(m mVar) throws IOException;

    @Override // gn.o
    /* synthetic */ int read(byte[] bArr, int i10, int i11) throws IOException;
}
