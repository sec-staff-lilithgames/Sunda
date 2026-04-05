package bu;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e8 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final k8 f10261b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i0 f10262c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f10263e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10264f;

    public e8(k8 k8Var, mt.i0 i0Var) {
        this.f10261b = k8Var;
        this.f10262c = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10264f) {
            return;
        }
        this.f10264f = true;
        this.f10261b.a(this);
        this.f10263e = null;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10264f;
    }
}
