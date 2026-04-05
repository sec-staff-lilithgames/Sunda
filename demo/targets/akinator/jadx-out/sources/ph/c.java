package ph;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f81283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f81284b;

    public c(o oVar, m0 m0Var) {
        this.f81283a = m0Var;
        this.f81284b = oVar;
    }

    @Override // ph.z
    public InputStream openStream() throws IOException {
        return this.f81284b.decodingStream(this.f81283a.openStream());
    }
}
