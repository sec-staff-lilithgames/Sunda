package hn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j implements h {

    /* renamed from: b, reason: collision with root package name */
    public f f59043b;

    /* renamed from: c, reason: collision with root package name */
    public f f59044c;

    /* renamed from: d, reason: collision with root package name */
    public f f59045d;

    /* renamed from: e, reason: collision with root package name */
    public f f59046e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f59047f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f59048g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f59049h;

    public j() {
        ByteBuffer byteBuffer = h.f59042a;
        this.f59047f = byteBuffer;
        this.f59048g = byteBuffer;
        f fVar = f.f59037e;
        this.f59045d = fVar;
        this.f59046e = fVar;
        this.f59043b = fVar;
        this.f59044c = fVar;
    }

    public final ByteBuffer a(int i10) {
        if (this.f59047f.capacity() < i10) {
            this.f59047f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f59047f.clear();
        }
        ByteBuffer byteBuffer = this.f59047f;
        this.f59048g = byteBuffer;
        return byteBuffer;
    }

    @Override // hn.h
    public final f configure(f fVar) throws g {
        this.f59045d = fVar;
        this.f59046e = onConfigure(fVar);
        return isActive() ? this.f59046e : f.f59037e;
    }

    @Override // hn.h
    public final void flush() {
        this.f59048g = h.f59042a;
        this.f59049h = false;
        this.f59043b = this.f59045d;
        this.f59044c = this.f59046e;
        onFlush();
    }

    @Override // hn.h
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    @Override // hn.h
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f59048g;
        this.f59048g = h.f59042a;
        return byteBuffer;
    }

    @Override // hn.h
    public boolean isActive() {
        return this.f59046e != f.f59037e;
    }

    @Override // hn.h
    public boolean isEnded() {
        return this.f59049h && this.f59048g == h.f59042a;
    }

    public f onConfigure(f fVar) {
        return f.f59037e;
    }

    @Override // hn.h
    public final void queueEndOfStream() {
        this.f59049h = true;
        onQueueEndOfStream();
    }

    @Override // hn.h
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);

    @Override // hn.h
    public final void reset() {
        flush();
        this.f59047f = h.f59042a;
        f fVar = f.f59037e;
        this.f59045d = fVar;
        this.f59046e = fVar;
        this.f59043b = fVar;
        this.f59044c = fVar;
        onReset();
    }

    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }
}
