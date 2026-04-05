package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f44151a;

    /* renamed from: b, reason: collision with root package name */
    private long f44152b;

    /* renamed from: c, reason: collision with root package name */
    private a f44153c;

    /* renamed from: d, reason: collision with root package name */
    private long f44154d = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f44155a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f44155a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f44155a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f44155a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f44153c;
        if (aVar != null) {
            aVar.cancel();
            this.f44153c = null;
        }
    }

    public b b(long j10) {
        this.f44154d = j10;
        return this;
    }

    public void c() {
        if (this.f44153c == null) {
            b();
        }
        this.f44153c.start();
    }

    public void b() {
        a aVar = this.f44153c;
        if (aVar != null) {
            aVar.cancel();
            this.f44153c = null;
        }
        if (this.f44152b <= 0) {
            this.f44152b = this.f44154d + 1000;
        }
        a aVar2 = new a(this.f44154d, this.f44152b);
        this.f44153c = aVar2;
        aVar2.a(this.f44151a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f44152b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f44151a = aVar;
        return this;
    }
}
