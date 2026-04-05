package io.odeeo.internal.a0;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLong f62410h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f62411a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.p0.m f62412b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f62413c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f62414d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62415e;

    /* renamed from: f, reason: collision with root package name */
    public final long f62416f;

    /* renamed from: g, reason: collision with root package name */
    public final long f62417g;

    public n(long j10, io.odeeo.internal.p0.m mVar, long j11) {
        this(j10, mVar, mVar.f65626a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long getNewId() {
        return f62410h.getAndIncrement();
    }

    public n(long j10, io.odeeo.internal.p0.m mVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f62411a = j10;
        this.f62412b = mVar;
        this.f62413c = uri;
        this.f62414d = map;
        this.f62415e = j11;
        this.f62416f = j12;
        this.f62417g = j13;
    }
}
