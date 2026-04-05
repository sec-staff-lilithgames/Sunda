package ee;

import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.z0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface l0 {
    void format(z0 z0Var);

    default int sampleData(qf.k kVar, int i10, boolean z10) throws IOException {
        return sampleData(kVar, i10, z10, 0);
    }

    int sampleData(qf.k kVar, int i10, boolean z10, int i11) throws IOException;

    void sampleData(v0 v0Var, int i10, int i11);

    void sampleMetadata(long j10, int i10, int i11, int i12, k0 k0Var);

    default void sampleData(v0 v0Var, int i10) {
        sampleData(v0Var, i10, 0);
    }
}
