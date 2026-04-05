package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import io.bidmachine.media3.exoplayer.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class h1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.a f61218c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f61219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ao.g0 f61220f;

    public /* synthetic */ h1(i1.a aVar, Pair pair, ao.g0 g0Var, int i10) {
        this.f61217b = i10;
        this.f61218c = aVar;
        this.f61219e = pair;
        this.f61220f = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61217b) {
            case 0:
                on.a aVar = i1.this.f61260h;
                Pair pair = this.f61219e;
                aVar.onDownstreamFormatChanged(((Integer) pair.first).intValue(), (ao.k0) pair.second, this.f61220f);
                break;
            default:
                on.a aVar2 = i1.this.f61260h;
                Pair pair2 = this.f61219e;
                aVar2.onUpstreamDiscarded(((Integer) pair2.first).intValue(), (ao.k0) io.bidmachine.media3.common.util.a.checkNotNull((ao.k0) pair2.second), this.f61220f);
                break;
        }
    }
}
