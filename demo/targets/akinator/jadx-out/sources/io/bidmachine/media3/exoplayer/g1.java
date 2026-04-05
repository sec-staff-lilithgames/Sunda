package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import io.bidmachine.media3.exoplayer.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.a f61203c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f61204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ao.b0 f61205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ao.g0 f61206g;

    public /* synthetic */ g1(i1.a aVar, Pair pair, ao.b0 b0Var, ao.g0 g0Var, int i10) {
        this.f61202b = i10;
        this.f61203c = aVar;
        this.f61204e = pair;
        this.f61205f = b0Var;
        this.f61206g = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61202b) {
            case 0:
                on.a aVar = i1.this.f61260h;
                Pair pair = this.f61204e;
                aVar.onLoadCanceled(((Integer) pair.first).intValue(), (ao.k0) pair.second, this.f61205f, this.f61206g);
                break;
            default:
                on.a aVar2 = i1.this.f61260h;
                Pair pair2 = this.f61204e;
                aVar2.onLoadCompleted(((Integer) pair2.first).intValue(), (ao.k0) pair2.second, this.f61205f, this.f61206g);
                break;
        }
    }
}
