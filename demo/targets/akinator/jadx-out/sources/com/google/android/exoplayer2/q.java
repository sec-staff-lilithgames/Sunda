package com.google.android.exoplayer2;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final String f27908g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f27909h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f27910i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f27911j;

    /* renamed from: b, reason: collision with root package name */
    public final int f27912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27913c;

    /* renamed from: e, reason: collision with root package name */
    public final int f27914e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27915f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27916a;

        /* renamed from: b, reason: collision with root package name */
        public int f27917b;

        /* renamed from: c, reason: collision with root package name */
        public int f27918c;

        /* renamed from: d, reason: collision with root package name */
        public String f27919d;

        public a(int i10) {
            this.f27916a = i10;
        }

        public q build() {
            com.google.android.exoplayer2.util.a.checkArgument(this.f27917b <= this.f27918c);
            return new q(this);
        }

        public a setMaxVolume(int i10) {
            this.f27918c = i10;
            return this;
        }

        public a setMinVolume(int i10) {
            this.f27917b = i10;
            return this;
        }

        public a setRoutingControllerId(String str) {
            com.google.android.exoplayer2.util.a.checkArgument(this.f27916a != 0 || str == null);
            this.f27919d = str;
            return this;
        }
    }

    static {
        new a(0).build();
        f27908g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);
        f27909h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);
        f27910i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);
        f27911j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);
    }

    @Deprecated
    public q(int i10, int i11, int i12) {
        this(new a(i10).setMinVolume(i11).setMaxVolume(i12));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f27912b == qVar.f27912b && this.f27913c == qVar.f27913c && this.f27914e == qVar.f27914e && com.google.android.exoplayer2.util.n1.areEqual(this.f27915f, qVar.f27915f);
    }

    public int hashCode() {
        int i10 = (((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27912b) * 31) + this.f27913c) * 31) + this.f27914e) * 31;
        String str = this.f27915f;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f27912b;
        if (i10 != 0) {
            bundle.putInt(f27908g, i10);
        }
        int i11 = this.f27913c;
        if (i11 != 0) {
            bundle.putInt(f27909h, i11);
        }
        int i12 = this.f27914e;
        if (i12 != 0) {
            bundle.putInt(f27910i, i12);
        }
        String str = this.f27915f;
        if (str != null) {
            bundle.putString(f27911j, str);
        }
        return bundle;
    }

    public q(a aVar) {
        this.f27912b = aVar.f27916a;
        this.f27913c = aVar.f27917b;
        this.f27914e = aVar.f27918c;
        this.f27915f = aVar.f27919d;
    }
}
