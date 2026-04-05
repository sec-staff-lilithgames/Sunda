package as;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    void ackSettings();

    void alternateService(int i10, String str, pw.l lVar, String str2, int i11, long j10);

    void data(boolean z10, int i10, pw.k kVar, int i11, int i12) throws IOException;

    void goAway(int i10, a aVar, pw.l lVar);

    void headers(boolean z10, boolean z11, int i10, int i11, List<e> list, f fVar);

    void ping(boolean z10, int i10, int i11);

    void priority(int i10, int i11, int i12, boolean z10);

    void pushPromise(int i10, int i11, List<e> list) throws IOException;

    void rstStream(int i10, a aVar);

    void settings(boolean z10, p pVar);

    void windowUpdate(int i10, long j10);
}
