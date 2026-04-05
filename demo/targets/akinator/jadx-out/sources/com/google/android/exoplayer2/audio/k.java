package com.google.android.exoplayer2.audio;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements com.google.android.exoplayer2.i {

    /* renamed from: i, reason: collision with root package name */
    public static final k f27152i = new j().build();

    /* renamed from: j, reason: collision with root package name */
    public static final String f27153j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f27154k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f27155l = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f27156m = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f27157n = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f27158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27159c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27160e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27161f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27162g;

    /* renamed from: h, reason: collision with root package name */
    public i f27163h;

    public k(int i10, int i11, int i12, int i13, int i14) {
        this.f27158b = i10;
        this.f27159c = i11;
        this.f27160e = i12;
        this.f27161f = i13;
        this.f27162g = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f27158b == kVar.f27158b && this.f27159c == kVar.f27159c && this.f27160e == kVar.f27160e && this.f27161f == kVar.f27161f && this.f27162g == kVar.f27162g) {
                return true;
            }
        }
        return false;
    }

    public i getAudioAttributesV21() {
        if (this.f27163h == null) {
            this.f27163h = new i(this);
        }
        return this.f27163h;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27158b) * 31) + this.f27159c) * 31) + this.f27160e) * 31) + this.f27161f) * 31) + this.f27162g;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f27153j, this.f27158b);
        bundle.putInt(f27154k, this.f27159c);
        bundle.putInt(f27155l, this.f27160e);
        bundle.putInt(f27156m, this.f27161f);
        bundle.putInt(f27157n, this.f27162g);
        return bundle;
    }
}
