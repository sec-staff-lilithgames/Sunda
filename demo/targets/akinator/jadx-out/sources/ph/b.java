package ph;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f81280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f81281b;

    public b(o oVar, g0 g0Var) {
        this.f81280a = g0Var;
        this.f81281b = oVar;
    }

    @Override // ph.t
    public OutputStream openStream() throws IOException {
        return this.f81281b.encodingStream(this.f81280a.openStream());
    }
}
