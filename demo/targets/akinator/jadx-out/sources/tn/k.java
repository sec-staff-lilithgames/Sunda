package tn;

import java.io.IOException;
import ko.a0;
import ko.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface k {
    void init(c0 c0Var);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    boolean read(a0 a0Var) throws IOException;

    k recreate();
}
