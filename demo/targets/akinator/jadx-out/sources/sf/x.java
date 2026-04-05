package sf;

import android.os.Bundle;
import com.google.android.exoplayer2.util.n1;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements com.google.android.exoplayer2.i {

    /* renamed from: g, reason: collision with root package name */
    public static final x f85734g = new x(0, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final String f85735h = n1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f85736i = n1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f85737j = n1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f85738k = n1.intToStringMaxRadix(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f85739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85740c;

    /* renamed from: e, reason: collision with root package name */
    public final int f85741e;

    /* renamed from: f, reason: collision with root package name */
    public final float f85742f;

    public x(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f85739b == xVar.f85739b && this.f85740c == xVar.f85740c && this.f85741e == xVar.f85741e && this.f85742f == xVar.f85742f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f85742f) + ((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f85739b) * 31) + this.f85740c) * 31) + this.f85741e) * 31);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f85735h, this.f85739b);
        bundle.putInt(f85736i, this.f85740c);
        bundle.putInt(f85737j, this.f85741e);
        bundle.putFloat(f85738k, this.f85742f);
        return bundle;
    }

    public x(int i10, int i11, int i12, float f10) {
        this.f85739b = i10;
        this.f85740c = i11;
        this.f85741e = i12;
        this.f85742f = f10;
    }
}
