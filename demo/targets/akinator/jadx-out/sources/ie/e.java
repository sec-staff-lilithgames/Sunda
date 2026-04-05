package ie;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import ee.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f59566a;

    public e(l0 l0Var) {
        this.f59566a = l0Var;
    }

    public abstract boolean a(v0 v0Var);

    public abstract boolean b(v0 v0Var, long j10);

    public final boolean consume(v0 v0Var, long j10) throws h2 {
        return a(v0Var) && b(v0Var, j10);
    }

    public abstract void seek();
}
