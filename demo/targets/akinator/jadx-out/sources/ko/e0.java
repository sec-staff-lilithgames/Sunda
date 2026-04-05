package ko;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface e0 {
    /* renamed from: createExtractors */
    z[] mo3833createExtractors();

    default z[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return mo3833createExtractors();
    }

    default e0 experimentalSetCodecsToParseWithinGopSampleDependencies(int i10) {
        return this;
    }

    @Deprecated
    default e0 experimentalSetTextTrackTranscodingEnabled(boolean z10) {
        return this;
    }

    default e0 setSubtitleParserFactory(hp.q qVar) {
        return this;
    }
}
