package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class e2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2.a f27442c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f27443e;

    public /* synthetic */ e2(f2.a aVar, Pair pair, int i10) {
        this.f27441b = i10;
        this.f27442c = aVar;
        this.f27443e = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27441b) {
            case 0:
                zd.a aVar = this.f27442c.f27478c.f27472h;
                Pair pair = this.f27443e;
                aVar.onDrmKeysLoaded(((Integer) pair.first).intValue(), (bf.d0) pair.second);
                break;
            case 1:
                zd.a aVar2 = this.f27442c.f27478c.f27472h;
                Pair pair2 = this.f27443e;
                aVar2.onDrmKeysRestored(((Integer) pair2.first).intValue(), (bf.d0) pair2.second);
                break;
            case 2:
                zd.a aVar3 = this.f27442c.f27478c.f27472h;
                Pair pair3 = this.f27443e;
                aVar3.onDrmSessionReleased(((Integer) pair3.first).intValue(), (bf.d0) pair3.second);
                break;
            default:
                zd.a aVar4 = this.f27442c.f27478c.f27472h;
                Pair pair4 = this.f27443e;
                aVar4.onDrmKeysRemoved(((Integer) pair4.first).intValue(), (bf.d0) pair4.second);
                break;
        }
    }
}
