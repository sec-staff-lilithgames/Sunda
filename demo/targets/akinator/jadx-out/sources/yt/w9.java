package yt;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w9 extends AtomicLong implements tw.d, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final da f96495b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.c f96496c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f96497e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f96498f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public boolean f96499g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f96500h;

    public w9(da daVar, tw.c cVar) {
        this.f96495b = daVar;
        this.f96496c = cVar;
    }

    @Override // tw.d
    public void cancel() {
        dispose();
    }

    @Override // pt.c
    public void dispose() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            da daVar = this.f96495b;
            daVar.b(this);
            daVar.a();
            this.f96497e = null;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == Long.MIN_VALUE;
    }

    public long produced(long j10) {
        return iu.e.producedCancel(this, j10);
    }

    @Override // tw.d
    public void request(long j10) {
        if (!hu.g.validate(j10) || iu.e.addCancel(this, j10) == Long.MIN_VALUE) {
            return;
        }
        iu.e.add(this.f96498f, j10);
        da daVar = this.f96495b;
        daVar.a();
        daVar.f95364b.replay(this);
    }
}
