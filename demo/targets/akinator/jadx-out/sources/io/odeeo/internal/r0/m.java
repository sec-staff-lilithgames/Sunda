package io.odeeo.internal.r0;

import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import e6.h0;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements io.odeeo.internal.b.g {

    /* renamed from: e, reason: collision with root package name */
    public static final m f66222e = new m(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final g.a<m> f66223f = new h0(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f66224a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66226c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66227d;

    public m(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public static /* synthetic */ m a(Bundle bundle) {
        return new m(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f66224a == mVar.f66224a && this.f66225b == mVar.f66225b && this.f66226c == mVar.f66226c && this.f66227d == mVar.f66227d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f66227d) + ((((((this.f66224a + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.f66225b) * 31) + this.f66226c) * 31);
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), this.f66224a);
        bundle.putInt(a(1), this.f66225b);
        bundle.putInt(a(2), this.f66226c);
        bundle.putFloat(a(3), this.f66227d);
        return bundle;
    }

    public m(int i10, int i11, int i12, float f10) {
        this.f66224a = i10;
        this.f66225b = i11;
        this.f66226c = i12;
        this.f66227d = f10;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
