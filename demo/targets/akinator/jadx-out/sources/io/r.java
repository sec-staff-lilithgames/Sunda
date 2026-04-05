package io;

import android.content.Context;
import gn.e2;
import gn.f2;
import gn.g2;
import gn.j1;
import gn.j2;
import gn.k1;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final g2 f68186a;

    public r(g2 g2Var) {
        this.f68186a = g2Var;
    }

    @Override // gn.j1
    public k1 create(Context context, gn.n nVar, gn.p pVar, j2 j2Var, Executor executor, e2 e2Var, List<Object> list, long j10) throws f2 {
        try {
            ((j1) Class.forName("io.bidmachine.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(g2.class).newInstance(this.f68186a)).create(context, nVar, pVar, j2Var, executor, e2Var, list, j10);
            return null;
        } catch (Exception e10) {
            throw f2.from(e10);
        }
    }

    @Override // gn.j1
    public boolean supportsMultipleInputs() {
        return false;
    }
}
