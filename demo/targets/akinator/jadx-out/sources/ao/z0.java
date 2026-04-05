package ao;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface z0 {
    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(gn.o oVar, Uri uri, Map<String, List<String>> map, long j10, long j11, ko.c0 c0Var) throws IOException;

    int read(ko.v0 v0Var) throws IOException;

    void release();

    void seek(long j10, long j11);
}
