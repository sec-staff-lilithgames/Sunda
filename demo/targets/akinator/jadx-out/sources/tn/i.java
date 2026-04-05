package tn;

import android.net.Uri;
import io.bidmachine.media3.common.util.u0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import ko.a0;
import on.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i {
    static {
        new d();
    }

    k createExtractor(Uri uri, io.bidmachine.media3.common.b bVar, List<io.bidmachine.media3.common.b> list, u0 u0Var, Map<String, List<String>> map, a0 a0Var, f0 f0Var) throws IOException;

    default i experimentalParseSubtitlesDuringExtraction(boolean z10) {
        return this;
    }

    default i experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return this;
    }

    default io.bidmachine.media3.common.b getOutputTextFormat(io.bidmachine.media3.common.b bVar) {
        return bVar;
    }

    default i setSubtitleParserFactory(hp.q qVar) {
        return this;
    }
}
