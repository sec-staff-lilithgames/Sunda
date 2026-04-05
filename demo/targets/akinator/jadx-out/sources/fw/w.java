package fw;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface w {
    void ackSettings();

    void alternateService(int i10, String str, pw.l lVar, String str2, int i11, long j10);

    void data(boolean z10, int i10, pw.k kVar, int i11) throws IOException;

    void goAway(int i10, c cVar, pw.l lVar);

    void headers(boolean z10, int i10, int i11, List<f> list);

    void ping(boolean z10, int i10, int i11);

    void priority(int i10, int i11, int i12, boolean z10);

    void pushPromise(int i10, int i11, List<f> list) throws IOException;

    void rstStream(int i10, c cVar);

    void settings(boolean z10, d0 d0Var);

    void windowUpdate(int i10, long j10);
}
