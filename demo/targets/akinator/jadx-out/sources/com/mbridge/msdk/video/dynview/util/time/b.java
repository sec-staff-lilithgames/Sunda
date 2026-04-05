package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f44501a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f44502b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f44503c;

    /* renamed from: d, reason: collision with root package name */
    private a f44504d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f44505a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f44505a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f44505a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f44505a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f44502b = j10;
        return this;
    }

    public b b(long j10) {
        this.f44501a = j10;
        return this;
    }

    public void c() {
        if (this.f44504d == null) {
            b();
        }
        this.f44504d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f44503c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f44504d;
        if (aVar != null) {
            aVar.cancel();
            this.f44504d = null;
        }
        if (this.f44502b <= 0) {
            this.f44502b = this.f44501a + 1000;
        }
        a aVar2 = new a(this.f44501a, this.f44502b);
        this.f44504d = aVar2;
        aVar2.a(this.f44503c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f44501a = j10;
        this.f44503c = aVar;
        b();
        a aVar2 = this.f44504d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f44504d;
        if (aVar != null) {
            aVar.cancel();
            this.f44504d = null;
        }
    }
}
