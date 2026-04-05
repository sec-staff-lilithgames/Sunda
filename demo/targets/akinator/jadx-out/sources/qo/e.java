package qo;

import gn.z0;
import io.bidmachine.media3.common.util.m0;
import ko.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f83415a;

    public e(e1 e1Var) {
        this.f83415a = e1Var;
    }

    public abstract boolean a(m0 m0Var);

    public abstract boolean b(long j10, m0 m0Var);

    public final boolean consume(m0 m0Var, long j10) throws z0 {
        return a(m0Var) && b(j10, m0Var);
    }

    public abstract void seek();
}
