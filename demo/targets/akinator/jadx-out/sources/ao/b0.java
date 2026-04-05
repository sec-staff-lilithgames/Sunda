package ao;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f7546c = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final Map f7547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7548b;

    public b0(long j10, ln.m mVar, long j11) {
        this(j10, mVar, mVar.f73467a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long getNewId() {
        return f7546c.getAndIncrement();
    }

    public b0(long j10, ln.m mVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f7547a = map;
        this.f7548b = j12;
    }
}
