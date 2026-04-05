package qf;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface j0 extends p {
    @Override // qf.p
    /* synthetic */ void addTransferListener(c1 c1Var);

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // qf.p
    void close() throws f0;

    int getResponseCode();

    @Override // qf.p
    Map<String, List<String>> getResponseHeaders();

    @Override // qf.p
    /* synthetic */ Uri getUri();

    @Override // qf.p
    long open(t tVar) throws f0;

    @Override // qf.p, qf.k
    int read(byte[] bArr, int i10, int i11) throws f0;

    void setRequestProperty(String str, String str2);
}
