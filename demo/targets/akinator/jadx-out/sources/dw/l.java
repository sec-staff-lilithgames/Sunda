package dw;

import kotlin.jvm.internal.e0;
import xv.j0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends w0 {

    /* renamed from: e, reason: collision with root package name */
    public final String f52925e;

    /* renamed from: f, reason: collision with root package name */
    public final long f52926f;

    /* renamed from: g, reason: collision with root package name */
    public final pw.k f52927g;

    public l(String str, long j10, pw.k source) {
        e0.checkNotNullParameter(source, "source");
        this.f52925e = str;
        this.f52926f = j10;
        this.f52927g = source;
    }

    @Override // xv.w0
    public long contentLength() {
        return this.f52926f;
    }

    @Override // xv.w0
    public j0 contentType() {
        String str = this.f52925e;
        if (str != null) {
            return j0.f93670e.parse(str);
        }
        return null;
    }

    @Override // xv.w0
    public pw.k source() {
        return this.f52927g;
    }
}
