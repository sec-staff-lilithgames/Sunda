package gn;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: g, reason: collision with root package name */
    public static final h f57892g = new g().build();

    /* renamed from: h, reason: collision with root package name */
    public static final String f57893h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f57894i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57895j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57896k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57897l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f57898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57900c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57902e;

    /* renamed from: f, reason: collision with root package name */
    public f f57903f;

    public h(int i10, int i11, int i12, int i13, int i14) {
        this.f57898a = i10;
        this.f57899b = i11;
        this.f57900c = i12;
        this.f57901d = i13;
        this.f57902e = i14;
    }

    public static h fromBundle(Bundle bundle) {
        g gVar = new g();
        String str = f57893h;
        if (bundle.containsKey(str)) {
            gVar.setContentType(bundle.getInt(str));
        }
        String str2 = f57894i;
        if (bundle.containsKey(str2)) {
            gVar.setFlags(bundle.getInt(str2));
        }
        String str3 = f57895j;
        if (bundle.containsKey(str3)) {
            gVar.setUsage(bundle.getInt(str3));
        }
        String str4 = f57896k;
        if (bundle.containsKey(str4)) {
            gVar.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = f57897l;
        if (bundle.containsKey(str5)) {
            gVar.setSpatializationBehavior(bundle.getInt(str5));
        }
        return gVar.build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f57898a == hVar.f57898a && this.f57899b == hVar.f57899b && this.f57900c == hVar.f57900c && this.f57901d == hVar.f57901d && this.f57902e == hVar.f57902e) {
                return true;
            }
        }
        return false;
    }

    public f getAudioAttributesV21() {
        if (this.f57903f == null) {
            this.f57903f = new f(this);
        }
        return this.f57903f;
    }

    public int getStreamType() {
        if ((this.f57899b & 1) == 1) {
            return 1;
        }
        switch (this.f57900c) {
        }
        return 1;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f57898a) * 31) + this.f57899b) * 31) + this.f57900c) * 31) + this.f57901d) * 31) + this.f57902e;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f57893h, this.f57898a);
        bundle.putInt(f57894i, this.f57899b);
        bundle.putInt(f57895j, this.f57900c);
        bundle.putInt(f57896k, this.f57901d);
        bundle.putInt(f57897l, this.f57902e);
        return bundle;
    }
}
