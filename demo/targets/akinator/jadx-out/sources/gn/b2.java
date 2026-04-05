package gn;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b2 {

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f57818b = new b2(b5.of());

    /* renamed from: c, reason: collision with root package name */
    public static final String f57819c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: a, reason: collision with root package name */
    public final b5 f57820a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        public static final String f57821f = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

        /* renamed from: g, reason: collision with root package name */
        public static final String f57822g = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

        /* renamed from: h, reason: collision with root package name */
        public static final String f57823h = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

        /* renamed from: i, reason: collision with root package name */
        public static final String f57824i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

        /* renamed from: a, reason: collision with root package name */
        public final int f57825a;

        /* renamed from: b, reason: collision with root package name */
        public final v1 f57826b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57827c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f57828d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean[] f57829e;

        public a(v1 v1Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = v1Var.f58205a;
            this.f57825a = i10;
            boolean z11 = false;
            io.bidmachine.media3.common.util.a.checkArgument(i10 == iArr.length && i10 == zArr.length);
            this.f57826b = v1Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f57827c = z11;
            this.f57828d = (int[]) iArr.clone();
            this.f57829e = (boolean[]) zArr.clone();
        }

        public static a fromBundle(Bundle bundle) {
            v1 v1VarFromBundle = v1.fromBundle((Bundle) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getBundle(f57821f)));
            return new a(v1VarFromBundle, bundle.getBoolean(f57824i, false), (int[]) mh.g1.firstNonNull(bundle.getIntArray(f57822g), new int[v1VarFromBundle.f58205a]), (boolean[]) mh.g1.firstNonNull(bundle.getBooleanArray(f57823h), new boolean[v1VarFromBundle.f58205a]));
        }

        public a copyWithId(String str) {
            return new a(this.f57826b.copyWithId(str), this.f57827c, this.f57828d, this.f57829e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f57827c == aVar.f57827c && this.f57826b.equals(aVar.f57826b) && Arrays.equals(this.f57828d, aVar.f57828d) && Arrays.equals(this.f57829e, aVar.f57829e)) {
                    return true;
                }
            }
            return false;
        }

        public v1 getMediaTrackGroup() {
            return this.f57826b;
        }

        public io.bidmachine.media3.common.b getTrackFormat(int i10) {
            return this.f57826b.getFormat(i10);
        }

        public int getTrackSupport(int i10) {
            return this.f57828d[i10];
        }

        public int getType() {
            return this.f57826b.f58207c;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f57829e) + ((Arrays.hashCode(this.f57828d) + (((this.f57826b.hashCode() * 31) + (this.f57827c ? 1 : 0)) * 31)) * 31);
        }

        public boolean isAdaptiveSupported() {
            return this.f57827c;
        }

        public boolean isSelected() {
            return rh.d.contains(this.f57829e, true);
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSelected(int i10) {
            return this.f57829e[i10];
        }

        public boolean isTrackSupported(int i10) {
            return isTrackSupported(i10, false);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f57821f, this.f57826b.toBundle());
            bundle.putIntArray(f57822g, this.f57828d);
            bundle.putBooleanArray(f57823h, this.f57829e);
            bundle.putBoolean(f57824i, this.f57827c);
            return bundle;
        }

        public boolean isSupported(boolean z10) {
            for (int i10 = 0; i10 < this.f57828d.length; i10++) {
                if (isTrackSupported(i10, z10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSupported(int i10, boolean z10) {
            int i11 = this.f57828d[i10];
            if (i11 != 4) {
                return z10 && i11 == 3;
            }
            return true;
        }
    }

    public b2(List<a> list) {
        this.f57820a = b5.copyOf((Collection) list);
    }

    public static b2 fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f57819c);
        return new b2(parcelableArrayList == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(new ao.c(27), parcelableArrayList));
    }

    public boolean containsType(int i10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f57820a;
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
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        return this.f57820a.equals(((b2) obj).f57820a);
    }

    public b5 getGroups() {
        return this.f57820a;
    }

    public int hashCode() {
        return this.f57820a.hashCode();
    }

    public boolean isEmpty() {
        return this.f57820a.isEmpty();
    }

    public boolean isTypeSelected(int i10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f57820a;
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

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f57819c, io.bidmachine.media3.common.util.f.toBundleArrayList(this.f57820a, new ao.c(26)));
        return bundle;
    }

    public boolean isTypeSupported(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            b5 b5Var = this.f57820a;
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
