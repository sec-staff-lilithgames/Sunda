package k7;

import java.io.IOException;
import q7.n;
import tu.o;
import tu.q;
import tu.s;
import xv.f0;
import xv.j0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o f70638a;

    /* renamed from: b, reason: collision with root package name */
    public final o f70639b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70640c;

    /* renamed from: d, reason: collision with root package name */
    public final long f70641d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70642e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f70643f;

    public c(pw.k kVar) throws NumberFormatException {
        s sVar = s.f87405e;
        this.f70638a = q.lazy(sVar, (kv.a) new a(this));
        this.f70639b = q.lazy(sVar, (kv.a) new b(this));
        this.f70640c = Long.parseLong(kVar.readUtf8LineStrict());
        this.f70641d = Long.parseLong(kVar.readUtf8LineStrict());
        this.f70642e = Integer.parseInt(kVar.readUtf8LineStrict()) > 0;
        int i10 = Integer.parseInt(kVar.readUtf8LineStrict());
        f0.a aVar = new f0.a();
        for (int i11 = 0; i11 < i10; i11++) {
            n.addUnsafeNonAscii(aVar, kVar.readUtf8LineStrict());
        }
        this.f70643f = aVar.build();
    }

    public final xv.h getCacheControl() {
        return (xv.h) this.f70638a.getValue();
    }

    public final j0 getContentType() {
        return (j0) this.f70639b.getValue();
    }

    public final long getReceivedResponseAtMillis() {
        return this.f70641d;
    }

    public final f0 getResponseHeaders() {
        return this.f70643f;
    }

    public final long getSentRequestAtMillis() {
        return this.f70640c;
    }

    public final boolean isTls() {
        return this.f70642e;
    }

    public final void writeTo(pw.j jVar) throws IOException {
        jVar.writeDecimalLong(this.f70640c).writeByte(10);
        jVar.writeDecimalLong(this.f70641d).writeByte(10);
        jVar.writeDecimalLong(this.f70642e ? 1L : 0L).writeByte(10);
        f0 f0Var = this.f70643f;
        jVar.writeDecimalLong(f0Var.size()).writeByte(10);
        int size = f0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            jVar.writeUtf8(f0Var.name(i10)).writeUtf8(": ").writeUtf8(f0Var.value(i10)).writeByte(10);
        }
    }

    public c(v0 v0Var) {
        s sVar = s.f87405e;
        this.f70638a = q.lazy(sVar, (kv.a) new a(this));
        this.f70639b = q.lazy(sVar, (kv.a) new b(this));
        this.f70640c = v0Var.sentRequestAtMillis();
        this.f70641d = v0Var.receivedResponseAtMillis();
        this.f70642e = v0Var.handshake() != null;
        this.f70643f = v0Var.headers();
    }
}
