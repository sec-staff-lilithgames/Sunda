package com.google.android.exoplayer2;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n3 implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final n3 f27831c = new n3(b5.of());

    /* renamed from: e, reason: collision with root package name */
    public static final String f27832e = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: b, reason: collision with root package name */
    public final b5 f27833b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements i {

        /* renamed from: h, reason: collision with root package name */
        public static final String f27834h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

        /* renamed from: i, reason: collision with root package name */
        public static final String f27835i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

        /* renamed from: j, reason: collision with root package name */
        public static final String f27836j = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(3);

        /* renamed from: k, reason: collision with root package name */
        public static final String f27837k = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(4);

        /* renamed from: b, reason: collision with root package name */
        public final int f27838b;

        /* renamed from: c, reason: collision with root package name */
        public final bf.m1 f27839c;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27840e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f27841f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f27842g;

        public a(bf.m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = m1Var.f9332b;
            this.f27838b = i10;
            boolean z11 = false;
            com.google.android.exoplayer2.util.a.checkArgument(i10 == iArr.length && i10 == zArr.length);
            this.f27839c = m1Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f27840e = z11;
            this.f27841f = (int[]) iArr.clone();
            this.f27842g = (boolean[]) zArr.clone();
        }

        public a copyWithId(String str) {
            return new a(this.f27839c.copyWithId(str), this.f27840e, this.f27841f, this.f27842g);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f27840e == aVar.f27840e && this.f27839c.equals(aVar.f27839c) && Arrays.equals(this.f27841f, aVar.f27841f) && Arrays.equals(this.f27842g, aVar.f27842g)) {
                    return true;
                }
            }
            return false;
        }

        public bf.m1 getMediaTrackGroup() {
            return this.f27839c;
        }

        public z0 getTrackFormat(int i10) {
            return this.f27839c.getFormat(i10);
        }

        public int getTrackSupport(int i10) {
            return this.f27841f[i10];
        }

        public int getType() {
            return this.f27839c.f9334e;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f27842g) + ((Arrays.hashCode(this.f27841f) + (((this.f27839c.hashCode() * 31) + (this.f27840e ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.f27840e;
        }

        public boolean isSelected() {
            return rh.d.contains(this.f27842g, true);
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i10) {
            return this.f27842g[i10];
        }

        public boolean isTrackSupported(int i10) {
            return isTrackSupported(i10, false);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f27834h, this.f27839c.toBundle());
            bundle.putIntArray(f27835i, this.f27841f);
            bundle.putBooleanArray(f27836j, this.f27842g);
            bundle.putBoolean(f27837k, this.f27840e);
            return bundle;
        }

        public boolean isSupported(boolean z10) {
            for (int i10 = 0; i10 < this.f27841f.length; i10++) {
                if (isTrackSupported(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i10, boolean z10) {
            int i11 = this.f27841f[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }
    }

    public n3(List<a> list) {
        this.f27833b = b5.copyOf((Collection) list);
    }

    public boolean containsType(int i10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f27833b;
            if (i11 >= b5Var.size()) {
                return false;
            }
            if (((a) b5Var.get(i11)).getType() == i10) {
                return true;
            }
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        return this.f27833b.equals(((n3) obj).f27833b);
    }

    public b5 getGroups() {
        return this.f27833b;
    }

    public int hashCode() {
        return this.f27833b.hashCode();
    }

    public boolean isEmpty() {
        return this.f27833b.isEmpty();
    }

    public boolean isTypeSelected(int i10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f27833b;
            if (i11 >= b5Var.size()) {
                return false;
            }
            a aVar = (a) b5Var.get(i11);
            if (aVar.isSelected() && aVar.getType() == i10) {
                return true;
            }
            i11++;
        }
    }

    public boolean isTypeSupported(int i10) {
        return isTypeSupported(i10, false);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i10) {
        return isTypeSupportedOrEmpty(i10, false);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f27832e, com.google.android.exoplayer2.util.c.toBundleArrayList(this.f27833b));
        return bundle;
    }

    public boolean isTypeSupported(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f27833b;
            if (i11 >= b5Var.size()) {
                return false;
            }
            if (((a) b5Var.get(i11)).getType() == i10 && ((a) b5Var.get(i11)).isSupported(z10)) {
                return true;
            }
            i11++;
        }
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i10, boolean z10) {
        return !containsType(i10) || isTypeSupported(i10, z10);
    }
}
