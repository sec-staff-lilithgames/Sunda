package xv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f93858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f93860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f93861f;

    public t0(j0 j0Var, byte[] bArr, int i10, int i11) {
        this.f93858c = j0Var;
        this.f93859d = i10;
        this.f93860e = bArr;
        this.f93861f = i11;
    }

    @Override // xv.u0
    public long contentLength() {
        return this.f93859d;
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93858c;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        sink.write(this.f93860e, this.f93861f, this.f93859d);
    }
}
