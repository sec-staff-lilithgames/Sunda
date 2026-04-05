package sn;

import android.os.Handler;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i implements u {

    /* renamed from: b, reason: collision with root package name */
    public final q f85982b;

    /* renamed from: c, reason: collision with root package name */
    public o f85983c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f85984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f85985f;

    public i(l lVar, q qVar) {
        this.f85985f = lVar;
        this.f85982b = qVar;
    }

    public void acquire(io.bidmachine.media3.common.b bVar) {
        ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f85985f.f86011u)).post(new on.z(12, this, bVar));
    }

    @Override // sn.u
    public void release() {
        a1.postOrRun((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f85985f.f86011u), new on.w(this, 11));
    }
}
