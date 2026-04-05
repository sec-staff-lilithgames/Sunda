package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class c2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.a f27351c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f27352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bf.t f27353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bf.y f27354g;

    public /* synthetic */ c2(f2.a aVar, Pair pair, bf.t tVar, bf.y yVar, int i10) {
        this.f27350b = i10;
        this.f27351c = aVar;
        this.f27352e = pair;
        this.f27353f = tVar;
        this.f27354g = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27350b) {
            case 0:
                zd.a aVar = this.f27351c.f27478c.f27472h;
                Pair pair = this.f27352e;
                aVar.onLoadCompleted(((Integer) pair.first).intValue(), (bf.d0) pair.second, this.f27353f, this.f27354g);
                break;
            case 1:
                zd.a aVar2 = this.f27351c.f27478c.f27472h;
                Pair pair2 = this.f27352e;
                aVar2.onLoadStarted(((Integer) pair2.first).intValue(), (bf.d0) pair2.second, this.f27353f, this.f27354g);
                break;
            default:
                zd.a aVar3 = this.f27351c.f27478c.f27472h;
                Pair pair3 = this.f27352e;
                aVar3.onLoadCanceled(((Integer) pair3.first).intValue(), (bf.d0) pair3.second, this.f27353f, this.f27354g);
                break;
        }
    }
}
