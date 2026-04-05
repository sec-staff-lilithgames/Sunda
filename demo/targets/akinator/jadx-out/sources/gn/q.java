package gn;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final q f58062e = new a(0).build();

    /* renamed from: f, reason: collision with root package name */
    public static final String f58063f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f58064g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f58065h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: i, reason: collision with root package name */
    public static final String f58066i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f58067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58069c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58070d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f58071a;

        /* renamed from: b, reason: collision with root package name */
        public int f58072b;

        /* renamed from: c, reason: collision with root package name */
        public int f58073c;

        /* renamed from: d, reason: collision with root package name */
        public String f58074d;

        public a(int i10) {
            this.f58071a = i10;
        }

        public q build() {
            io.bidmachine.media3.common.util.a.checkArgument(this.f58072b <= this.f58073c);
            return new q(this);
        }

        public a setMaxVolume(int i10) {
            this.f58073c = i10;
            return this;
        }

        public a setMinVolume(int i10) {
            this.f58072b = i10;
            return this;
        }

        public a setRoutingControllerId(String str) {
            io.bidmachine.media3.common.util.a.checkArgument(this.f58071a != 0 || str == null);
            this.f58074d = str;
            return this;
        }
    }

    @Deprecated
    public q(int i10, int i11, int i12) {
        this(new a(i10).setMinVolume(i11).setMaxVolume(i12));
    }

    public static q fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(f58063f, 0);
        int i11 = bundle.getInt(f58064g, 0);
        int i12 = bundle.getInt(f58065h, 0);
        return new a(i10).setMinVolume(i11).setMaxVolume(i12).setRoutingControllerId(bundle.getString(f58066i)).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f58067a == qVar.f58067a && this.f58068b == qVar.f58068b && this.f58069c == qVar.f58069c && Objects.equals(this.f58070d, qVar.f58070d);
    }

    public int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f58067a) * 31) + this.f58068b) * 31) + this.f58069c) * 31;
        String str = this.f58070d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f58067a;
        if (i10 != 0) {
            bundle.putInt(f58063f, i10);
        }
        int i11 = this.f58068b;
        if (i11 != 0) {
            bundle.putInt(f58064g, i11);
        }
        int i12 = this.f58069c;
        if (i12 != 0) {
            bundle.putInt(f58065h, i12);
        }
        String str = this.f58070d;
        if (str != null) {
            bundle.putString(f58066i, str);
        }
        return bundle;
    }

    public q(a aVar) {
        this.f58067a = aVar.f58071a;
        this.f58068b = aVar.f58072b;
        this.f58069c = aVar.f58073c;
        this.f58070d = aVar.f58074d;
    }
}
