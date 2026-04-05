package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 implements u {

    /* renamed from: b, reason: collision with root package name */
    public s f27205b;

    /* renamed from: c, reason: collision with root package name */
    public s f27206c;

    /* renamed from: d, reason: collision with root package name */
    public s f27207d;

    /* renamed from: e, reason: collision with root package name */
    public s f27208e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f27209f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f27210g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27211h;

    public m0() {
        ByteBuffer byteBuffer = u.f27291a;
        this.f27209f = byteBuffer;
        this.f27210g = byteBuffer;
        s sVar = s.f27278e;
        this.f27207d = sVar;
        this.f27208e = sVar;
        this.f27205b = sVar;
        this.f27206c = sVar;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final s configure(s sVar) throws t {
        this.f27207d = sVar;
        this.f27208e = onConfigure(sVar);
        return isActive() ? this.f27208e : s.f27278e;
    }

    public final ByteBuffer d(int i10) {
        if (this.f27209f.capacity() < i10) {
            this.f27209f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f27209f.clear();
        }
        ByteBuffer byteBuffer = this.f27209f;
        this.f27210g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void flush() {
        this.f27210g = u.f27291a;
        this.f27211h = false;
        this.f27205b = this.f27207d;
        this.f27206c = this.f27208e;
        a();
    }

    @Override // com.google.android.exoplayer2.audio.u
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f27210g;
        this.f27210g = u.f27291a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public boolean isActive() {
        return this.f27208e != s.f27278e;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public boolean isEnded() {
        return this.f27211h && this.f27210g == u.f27291a;
    }

    public s onConfigure(s sVar) {
        return s.f27278e;
    }

    @Override // com.google.android.exoplayer2.audio.u
    public final void queueEndOfStream() {
        this.f27211h = true;
        b();
    }

    @Override // com.google.android.exoplayer2.audio.u
    public abstract /* synthetic */ void queueInput(ByteBuffer byteBuffer);

    @Override // com.google.android.exoplayer2.audio.u
    public final void reset() {
        flush();
        this.f27209f = u.f27291a;
        s sVar = s.f27278e;
        this.f27207d = sVar;
        this.f27208e = sVar;
        this.f27205b = sVar;
        this.f27206c = sVar;
        c();
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }
}
