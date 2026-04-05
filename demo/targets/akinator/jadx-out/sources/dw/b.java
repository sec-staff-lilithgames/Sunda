package dw;

import java.io.IOException;
import xv.c1;
import xv.f0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements c1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw.i f52906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f52907c;

    public b(cw.i iVar, w0 w0Var) {
        this.f52906b = iVar;
        this.f52907c = w0Var;
    }

    @Override // xv.c1
    public f0 get() throws IOException {
        pw.k kVarSource = this.f52907c.source();
        if (kVarSource.isOpen()) {
            yv.i.skipAll(kVarSource);
        }
        f0 f0VarPeek = peek();
        if (f0VarPeek != null) {
            return f0VarPeek;
        }
        throw new IllegalStateException("null trailers after exhausting response body?!");
    }

    @Override // xv.c1
    public f0 peek() {
        return this.f52906b.peekTrailers();
    }
}
