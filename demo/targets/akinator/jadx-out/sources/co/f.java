package co;

import java.util.List;
import ko.e1;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface f {
    h createProgressiveMediaExtractor(int i10, io.bidmachine.media3.common.b bVar, boolean z10, List<io.bidmachine.media3.common.b> list, e1 e1Var, f0 f0Var);

    default f experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return this;
    }

    default f experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return this;
    }

    default io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
        return bVar;
    }

    default f setSubtitleParserFactory(hp.q qVar) {
        return this;
    }
}
