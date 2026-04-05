package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import io.bidmachine.media3.exoplayer.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1.a f61195c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pair f61196e;

    public /* synthetic */ f1(i1.a aVar, Pair pair, int i10) {
        this.f61194b = i10;
        this.f61195c = aVar;
        this.f61196e = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61194b) {
            case 0:
                on.a aVar = i1.this.f61260h;
                Pair pair = this.f61196e;
                aVar.onDrmKeysRemoved(((Integer) pair.first).intValue(), (ao.k0) pair.second);
                break;
            case 1:
                on.a aVar2 = i1.this.f61260h;
                Pair pair2 = this.f61196e;
                aVar2.onDrmKeysLoaded(((Integer) pair2.first).intValue(), (ao.k0) pair2.second);
                break;
            case 2:
                on.a aVar3 = i1.this.f61260h;
                Pair pair3 = this.f61196e;
                aVar3.onDrmSessionReleased(((Integer) pair3.first).intValue(), (ao.k0) pair3.second);
                break;
            default:
                on.a aVar4 = i1.this.f61260h;
                Pair pair4 = this.f61196e;
                aVar4.onDrmKeysRestored(((Integer) pair4.first).intValue(), (ao.k0) pair4.second);
                break;
        }
    }
}
