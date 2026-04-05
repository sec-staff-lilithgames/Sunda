package pn;

import go.a0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f81541a;

    public m(p pVar) {
        this.f81541a = pVar;
    }

    @Override // go.a0
    public void maybeThrowError() throws IOException {
        p pVar = this.f81541a;
        pVar.A.maybeThrowError();
        d dVar = pVar.C;
        if (dVar != null) {
            throw dVar;
        }
    }

    @Override // go.a0
    public void maybeThrowError(int i10) throws IOException {
        p pVar = this.f81541a;
        pVar.A.maybeThrowError(i10);
        d dVar = pVar.C;
        if (dVar != null) {
            throw dVar;
        }
    }
}
