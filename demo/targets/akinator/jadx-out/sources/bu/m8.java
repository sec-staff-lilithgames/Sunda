package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m8 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10651a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10652b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f10653c;

    /* renamed from: d, reason: collision with root package name */
    public final mt.m0 f10654d;

    public m8(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f10651a = i10;
        this.f10652b = j10;
        this.f10653c = timeUnit;
        this.f10654d = m0Var;
    }

    @Override // bu.c8
    public i8 call() {
        return new n8(this.f10651a, this.f10652b, this.f10653c, this.f10654d);
    }
}
