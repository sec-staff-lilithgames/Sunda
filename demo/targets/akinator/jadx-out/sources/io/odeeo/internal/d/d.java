package io.odeeo.internal.d;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.g;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements io.odeeo.internal.b.g {

    /* renamed from: f, reason: collision with root package name */
    public static final d f63334f = new b().build();

    /* renamed from: g, reason: collision with root package name */
    public static final g.a<d> f63335g = new li.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f63336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63339d;

    /* renamed from: e, reason: collision with root package name */
    public AudioAttributes f63340e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f63341a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f63342b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f63343c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f63344d = 1;

        public d build() {
            return new d(this.f63341a, this.f63342b, this.f63343c, this.f63344d);
        }

        public b setAllowedCapturePolicy(int i10) {
            this.f63344d = i10;
            return this;
        }

        public b setContentType(int i10) {
            this.f63341a = i10;
            return this;
        }

        public b setFlags(int i10) {
            this.f63342b = i10;
            return this;
        }

        public b setUsage(int i10) {
            this.f63343c = i10;
            return this;
        }
    }

    public static /* synthetic */ d a(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(a(0))) {
            bVar.setContentType(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.setFlags(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.setUsage(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.setAllowedCapturePolicy(bundle.getInt(a(3)));
        }
        return bVar.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f63336a == dVar.f63336a && this.f63337b == dVar.f63337b && this.f63338c == dVar.f63338c && this.f63339d == dVar.f63339d) {
                return true;
            }
        }
        return false;
    }

    public AudioAttributes getAudioAttributesV21() {
        if (this.f63340e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f63336a).setFlags(this.f63337b).setUsage(this.f63338c);
            if (g0.f65861a >= 29) {
                usage.setAllowedCapturePolicy(this.f63339d);
            }
            this.f63340e = usage.build();
        }
        return this.f63340e;
    }

    public int hashCode() {
        return ((((((this.f63336a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f63337b) * 31) + this.f63338c) * 31) + this.f63339d;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), this.f63336a);
        bundle.putInt(a(1), this.f63337b);
        bundle.putInt(a(2), this.f63338c);
        bundle.putInt(a(3), this.f63339d);
        return bundle;
    }

    public d(int i10, int i11, int i12, int i13) {
        this.f63336a = i10;
        this.f63337b = i11;
        this.f63338c = i12;
        this.f63339d = i13;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
