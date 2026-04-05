package io.odeeo.internal.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f65170a;

    public final boolean isReadyToSendEvent(long j10) {
        return j10 - this.f65170a >= 2000;
    }

    public final void pause(long j10) {
        this.f65170a = j10;
    }
}
