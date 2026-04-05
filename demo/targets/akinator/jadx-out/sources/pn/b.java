package pn;

import go.a0;
import java.util.List;
import ln.g0;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    c createDashChunkSource(a0 a0Var, qn.c cVar, a aVar, int i10, int[] iArr, fo.l lVar, int i11, long j10, boolean z10, List<io.bidmachine.media3.common.b> list, x xVar, g0 g0Var, f0 f0Var, go.i iVar);

    default b experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return this;
    }

    default b experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return this;
    }

    default io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
        return bVar;
    }

    default b setSubtitleParserFactory(hp.q qVar) {
        return this;
    }
}
