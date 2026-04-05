package ln;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface z extends i {
    @Override // ln.i
    /* synthetic */ void addTransferListener(g0 g0Var);

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // ln.i
    void close() throws v;

    int getResponseCode();

    @Override // ln.i
    Map<String, List<String>> getResponseHeaders();

    @Override // ln.i
    /* synthetic */ Uri getUri();

    @Override // ln.i
    long open(m mVar) throws v;

    @Override // ln.i, gn.o
    int read(byte[] bArr, int i10, int i11) throws v;

    void setRequestProperty(String str, String str2);
}
