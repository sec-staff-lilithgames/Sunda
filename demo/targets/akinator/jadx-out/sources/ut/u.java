package ut;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements st.a {

    /* renamed from: b, reason: collision with root package name */
    public final Future f88692b;

    public u(Future future) {
        this.f88692b = future;
    }

    @Override // st.a
    public void run() throws Exception {
        this.f88692b.get();
    }
}
