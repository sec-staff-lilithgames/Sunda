package io.odeeo.internal.f;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.p0.m f63947a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f63948b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f63949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63950d;

    public s(io.odeeo.internal.p0.m mVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f63947a = mVar;
        this.f63948b = uri;
        this.f63949c = map;
        this.f63950d = j10;
    }
}
