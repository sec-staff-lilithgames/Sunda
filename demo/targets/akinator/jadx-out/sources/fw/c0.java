package fw;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f56132a = new b0();

    boolean onData(int i10, pw.k kVar, int i11, boolean z10) throws IOException;

    boolean onHeaders(int i10, List<f> list, boolean z10);

    boolean onRequest(int i10, List<f> list);

    void onReset(int i10, c cVar);
}
