package gn;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f57938f = new a().build();

    /* renamed from: g, reason: collision with root package name */
    public static final String f57939g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: h, reason: collision with root package name */
    public static final String f57940h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: i, reason: collision with root package name */
    public static final String f57941i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57942j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57943k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: a, reason: collision with root package name */
    public final long f57944a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57945b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57946c;

    /* renamed from: d, reason: collision with root package name */
    public final float f57947d;

    /* renamed from: e, reason: collision with root package name */
    public final float f57948e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f57949a = C.TIME_UNSET;

        /* renamed from: b, reason: collision with root package name */
        public long f57950b = C.TIME_UNSET;

        /* renamed from: c, reason: collision with root package name */
        public long f57951c = C.TIME_UNSET;

        /* renamed from: d, reason: collision with root package name */
        public float f57952d = -3.4028235E38f;

        /* renamed from: e, reason: collision with root package name */
        public float f57953e = -3.4028235E38f;

        public i0 build() {
            return new i0(this.f57949a, this.f57950b, this.f57951c, this.f57952d, this.f57953e);
        }

        public a setMaxOffsetMs(long j10) {
            this.f57951c = j10;
            return this;
        }

        public a setMaxPlaybackSpeed(float f10) {
            this.f57953e = f10;
            return this;
        }

        public a setMinOffsetMs(long j10) {
            this.f57950b = j10;
            return this;
        }

        public a setMinPlaybackSpeed(float f10) {
            this.f57952d = f10;
            return this;
        }

        public a setTargetOffsetMs(long j10) {
            this.f57949a = j10;
            return this;
        }
    }

    @Deprecated
    public i0(long j10, long j11, long j12, float f10, float f11) {
        this.f57944a = j10;
        this.f57945b = j11;
        this.f57946c = j12;
        this.f57947d = f10;
        this.f57948e = f11;
    }

    public static i0 fromBundle(Bundle bundle) {
        a aVar = new a();
        i0 i0Var = f57938f;
        return aVar.setTargetOffsetMs(bundle.getLong(f57939g, i0Var.f57944a)).setMinOffsetMs(bundle.getLong(f57940h, i0Var.f57945b)).setMaxOffsetMs(bundle.getLong(f57941i, i0Var.f57946c)).setMinPlaybackSpeed(bundle.getFloat(f57942j, i0Var.f57947d)).setMaxPlaybackSpeed(bundle.getFloat(f57943k, i0Var.f57948e)).build();
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f57949a = this.f57944a;
        aVar.f57950b = this.f57945b;
        aVar.f57951c = this.f57946c;
        aVar.f57952d = this.f57947d;
        aVar.f57953e = this.f57948e;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f57944a == i0Var.f57944a && this.f57945b == i0Var.f57945b && this.f57946c == i0Var.f57946c && this.f57947d == i0Var.f57947d && this.f57948e == i0Var.f57948e;
    }

    public int hashCode() {
        long j10 = this.f57944a;
        long j11 = this.f57945b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f57946c;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f57947d;
        int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f57948e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        i0 i0Var = f57938f;
        long j10 = i0Var.f57944a;
        long j11 = this.f57944a;
        if (j11 != j10) {
            bundle.putLong(f57939g, j11);
        }
        long j12 = i0Var.f57945b;
        long j13 = this.f57945b;
        if (j13 != j12) {
            bundle.putLong(f57940h, j13);
        }
        long j14 = i0Var.f57946c;
        long j15 = this.f57946c;
        if (j15 != j14) {
            bundle.putLong(f57941i, j15);
        }
        float f10 = i0Var.f57947d;
        float f11 = this.f57947d;
        if (f11 != f10) {
            bundle.putFloat(f57942j, f11);
        }
        float f12 = i0Var.f57948e;
        float f13 = this.f57948e;
        if (f13 != f12) {
            bundle.putFloat(f57943k, f13);
        }
        return bundle;
    }
}
