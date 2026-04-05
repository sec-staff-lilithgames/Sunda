package ko;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e1 {
    void format(io.bidmachine.media3.common.b bVar);

    default int sampleData(gn.o oVar, int i10, boolean z10) throws IOException {
        return sampleData(oVar, i10, z10, 0);
    }

    int sampleData(gn.o oVar, int i10, boolean z10, int i11) throws IOException;

    void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10, int i11);

    void sampleMetadata(long j10, int i10, int i11, int i12, d1 d1Var);

    default void sampleData(io.bidmachine.media3.common.util.m0 m0Var, int i10) {
        sampleData(m0Var, i10, 0);
    }

    default void durationUs(long j10) {
    }
}
