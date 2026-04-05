package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class d2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.a f27364c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f27365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bf.y f27366f;

    public /* synthetic */ d2(f2.a aVar, Pair pair, bf.y yVar, int i10) {
        this.f27363b = i10;
        this.f27364c = aVar;
        this.f27365e = pair;
        this.f27366f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27363b) {
            case 0:
                zd.a aVar = this.f27364c.f27478c.f27472h;
                Pair pair = this.f27365e;
                aVar.onUpstreamDiscarded(((Integer) pair.first).intValue(), (bf.d0) com.google.android.exoplayer2.util.a.checkNotNull((bf.d0) pair.second), this.f27366f);
                break;
            default:
                zd.a aVar2 = this.f27364c.f27478c.f27472h;
                Pair pair2 = this.f27365e;
                aVar2.onDownstreamFormatChanged(((Integer) pair2.first).intValue(), (bf.d0) pair2.second, this.f27366f);
                break;
        }
    }
}
