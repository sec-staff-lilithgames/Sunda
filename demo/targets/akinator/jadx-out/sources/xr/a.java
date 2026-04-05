package xr;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a implements r4 {

    /* renamed from: a, reason: collision with root package name */
    public wr.e4 f92221a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92222b;

    /* renamed from: c, reason: collision with root package name */
    public final te f92223c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f92224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f92225e;

    public a(e eVar, wr.e4 e4Var, te teVar) {
        this.f92225e = eVar;
        this.f92221a = (wr.e4) mh.p1.checkNotNull(e4Var, "headers");
        this.f92223c = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
    }

    @Override // xr.r4
    public void close() {
        this.f92222b = true;
        mh.p1.checkState(this.f92224d != null, "Lack of request message. GET request is only supported for unary requests");
        ((yr.x) this.f92225e).f95116m.writeHeaders(this.f92221a, this.f92224d);
        this.f92224d = null;
        this.f92221a = null;
    }

    @Override // xr.r4
    public void dispose() {
        this.f92222b = true;
        this.f92224d = null;
        this.f92221a = null;
    }

    @Override // xr.r4
    public boolean isClosed() {
        return this.f92222b;
    }

    @Override // xr.r4
    public void writePayload(InputStream inputStream) {
        mh.p1.checkState(this.f92224d == null, "writePayload should not be called multiple times");
        try {
            this.f92224d = ph.e0.toByteArray(inputStream);
            te teVar = this.f92223c;
            teVar.outboundMessage(0);
            byte[] bArr = this.f92224d;
            this.f92223c.outboundMessageSent(0, bArr.length, bArr.length);
            teVar.outboundUncompressedSize(this.f92224d.length);
            teVar.outboundWireSize(this.f92224d.length);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // xr.r4
    public void flush() {
    }

    @Override // xr.r4
    public r4 setCompressor(wr.d0 d0Var) {
        return this;
    }

    @Override // xr.r4
    public void setMaxOutboundMessageSize(int i10) {
    }

    @Override // xr.r4
    public r4 setMessageCompression(boolean z10) {
        return this;
    }
}
