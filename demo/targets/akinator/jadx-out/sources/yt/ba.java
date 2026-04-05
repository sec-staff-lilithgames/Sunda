package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ba implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final int f95231b;

    public ba(int i10) {
        this.f95231b = i10;
    }

    @Override // java.util.concurrent.Callable
    public aa call() {
        return new ga(this.f95231b);
    }
}
