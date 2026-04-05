package io.odeeo.internal.a0;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface y {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        y createProgressiveMediaExtractor();
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(io.odeeo.internal.p0.g gVar, Uri uri, Map<String, List<String>> map, long j10, long j11, io.odeeo.internal.g.j jVar) throws IOException;

    int read(io.odeeo.internal.g.u uVar) throws IOException;

    void release();

    void seek(long j10, long j11);
}
