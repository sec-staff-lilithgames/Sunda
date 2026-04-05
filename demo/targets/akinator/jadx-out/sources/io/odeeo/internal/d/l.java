package io.odeeo.internal.d;

import io.odeeo.internal.d.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class l implements f {

    /* renamed from: b, reason: collision with root package name */
    public f.a f63406b;

    /* renamed from: c, reason: collision with root package name */
    public f.a f63407c;

    /* renamed from: d, reason: collision with root package name */
    public f.a f63408d;

    /* renamed from: e, reason: collision with root package name */
    public f.a f63409e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f63410f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f63411g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63412h;

    public l() {
        ByteBuffer byteBuffer = f.f63350a;
        this.f63410f = byteBuffer;
        this.f63411g = byteBuffer;
        f.a aVar = f.a.f63351e;
        this.f63408d = aVar;
        this.f63409e = aVar;
        this.f63406b = aVar;
        this.f63407c = aVar;
    }

    public final ByteBuffer a(int i10) {
        if (this.f63410f.capacity() < i10) {
            this.f63410f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f63410f.clear();
        }
        ByteBuffer byteBuffer = this.f63410f;
        this.f63411g = byteBuffer;
        return byteBuffer;
    }

    @Override // io.odeeo.internal.d.f
    public final f.a configure(f.a aVar) throws f.b {
        this.f63408d = aVar;
        this.f63409e = onConfigure(aVar);
        return isActive() ? this.f63409e : f.a.f63351e;
    }

    @Override // io.odeeo.internal.d.f
    public final void flush() {
        this.f63411g = f.f63350a;
        this.f63412h = false;
        this.f63406b = this.f63408d;
        this.f63407c = this.f63409e;
        b();
    }

    @Override // io.odeeo.internal.d.f
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f63411g;
        this.f63411g = f.f63350a;
        return byteBuffer;
    }

    @Override // io.odeeo.internal.d.f
    public boolean isActive() {
        return this.f63409e != f.a.f63351e;
    }

    @Override // io.odeeo.internal.d.f
    public boolean isEnded() {
        return this.f63412h && this.f63411g == f.f63350a;
    }

    public f.a onConfigure(f.a aVar) throws f.b {
        return f.a.f63351e;
    }

    @Override // io.odeeo.internal.d.f
    public final void queueEndOfStream() {
        this.f63412h = true;
        c();
    }

    @Override // io.odeeo.internal.d.f
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);

    @Override // io.odeeo.internal.d.f
    public final void reset() {
        flush();
        this.f63410f = f.f63350a;
        f.a aVar = f.a.f63351e;
        this.f63408d = aVar;
        this.f63409e = aVar;
        this.f63406b = aVar;
        this.f63407c = aVar;
        d();
    }

    public final boolean a() {
        return this.f63411g.hasRemaining();
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }
}
