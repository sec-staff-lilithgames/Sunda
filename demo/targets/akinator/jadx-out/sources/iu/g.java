package iu;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends CountDownLatch implements st.g, st.a {

    /* renamed from: b, reason: collision with root package name */
    public Throwable f68407b;

    public g() {
        super(1);
    }

    @Override // st.a
    public void run() {
        countDown();
    }

    @Override // st.g
    public void accept(Throwable th2) {
        this.f68407b = th2;
        countDown();
    }
}
