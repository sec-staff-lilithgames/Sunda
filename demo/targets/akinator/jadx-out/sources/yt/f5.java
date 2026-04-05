package yt;

import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f5 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f95471b;

    public f5(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f95471b = concurrentLinkedQueue;
    }

    @Override // st.g
    public void accept(h5 h5Var) {
        this.f95471b.offer(h5Var);
    }
}
