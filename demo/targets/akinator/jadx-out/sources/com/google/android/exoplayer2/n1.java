package com.google.android.exoplayer2;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n1 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final n1 f27812h = new a().build();

    /* renamed from: i, reason: collision with root package name */
    public static final String f27813i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f27814j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f27815k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27816l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27817m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: n, reason: collision with root package name */
    public static final com.bytedance.adsdk.ugeno.zz.cm.a f27818n = new com.bytedance.adsdk.ugeno.zz.cm.a(13);

    /* renamed from: b, reason: collision with root package name */
    public final long f27819b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27820c;

    /* renamed from: e, reason: collision with root package name */
    public final long f27821e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27822f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27823g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f27824a = C.TIME_UNSET;

        /* renamed from: b, reason: collision with root package name */
        public long f27825b = C.TIME_UNSET;

        /* renamed from: c, reason: collision with root package name */
        public long f27826c = C.TIME_UNSET;

        /* renamed from: d, reason: collision with root package name */
        public float f27827d = -3.4028235E38f;

        /* renamed from: e, reason: collision with root package name */
        public float f27828e = -3.4028235E38f;

        public n1 build() {
            return new n1(this.f27824a, this.f27825b, this.f27826c, this.f27827d, this.f27828e);
        }

        public a setMaxOffsetMs(long j10) {
            this.f27826c = j10;
            return this;
        }

        public a setMaxPlaybackSpeed(float f10) {
            this.f27828e = f10;
            return this;
        }

        public a setMinOffsetMs(long j10) {
            this.f27825b = j10;
            return this;
        }

        public a setMinPlaybackSpeed(float f10) {
            this.f27827d = f10;
            return this;
        }

        public a setTargetOffsetMs(long j10) {
            this.f27824a = j10;
            return this;
        }
    }

    @Deprecated
    public n1(long j10, long j11, long j12, float f10, float f11) {
        this.f27819b = j10;
        this.f27820c = j11;
        this.f27821e = j12;
        this.f27822f = f10;
        this.f27823g = f11;
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f27824a = this.f27819b;
        aVar.f27825b = this.f27820c;
        aVar.f27826c = this.f27821e;
        aVar.f27827d = this.f27822f;
        aVar.f27828e = this.f27823g;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f27819b == n1Var.f27819b && this.f27820c == n1Var.f27820c && this.f27821e == n1Var.f27821e && this.f27822f == n1Var.f27822f && this.f27823g == n1Var.f27823g;
    }

    public int hashCode() {
        long j10 = this.f27819b;
        long j11 = this.f27820c;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f27821e;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f27822f;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f27823g;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        n1 n1Var = f27812h;
        long j10 = n1Var.f27819b;
        long j11 = this.f27819b;
        if (j11 != j10) {
            bundle.putLong(f27813i, j11);
        }
        long j12 = n1Var.f27820c;
        long j13 = this.f27820c;
        if (j13 != j12) {
            bundle.putLong(f27814j, j13);
        }
        long j14 = n1Var.f27821e;
        long j15 = this.f27821e;
        if (j15 != j14) {
            bundle.putLong(f27815k, j15);
        }
        float f10 = n1Var.f27822f;
        float f11 = this.f27822f;
        if (f11 != f10) {
            bundle.putFloat(f27816l, f11);
        }
        float f12 = n1Var.f27823g;
        float f13 = this.f27823g;
        if (f13 != f12) {
            bundle.putFloat(f27817m, f13);
        }
        return bundle;
    }
}
