package bf;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLong f9432b = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map f9433a;

    public t(long j10, qf.t tVar, long j11) {
        this(j10, tVar, tVar.f82992a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long getNewId() {
        return f9432b.getAndIncrement();
    }

    public t(long j10, qf.t tVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f9433a = map;
    }
}
