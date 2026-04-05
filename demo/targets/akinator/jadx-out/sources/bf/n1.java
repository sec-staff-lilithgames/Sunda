package bf;

import android.os.Bundle;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n1 implements com.google.android.exoplayer2.i {

    /* renamed from: f, reason: collision with root package name */
    public static final n1 f9354f = new n1(new m1[0]);

    /* renamed from: g, reason: collision with root package name */
    public static final String f9355g = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: b, reason: collision with root package name */
    public final int f9356b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f9357c;

    /* renamed from: e, reason: collision with root package name */
    public int f9358e;

    public n1(m1... m1VarArr) {
        b5 b5VarCopyOf = b5.copyOf(m1VarArr);
        this.f9357c = b5VarCopyOf;
        this.f9356b = m1VarArr.length;
        int i10 = 0;
        while (i10 < b5VarCopyOf.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < b5VarCopyOf.size(); i12++) {
                if (((m1) b5VarCopyOf.get(i10)).equals(b5VarCopyOf.get(i12))) {
                    com.google.android.exoplayer2.util.f0.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f9356b == n1Var.f9356b && this.f9357c.equals(n1Var.f9357c)) {
                return true;
            }
        }
        return false;
    }

    public m1 get(int i10) {
        return (m1) this.f9357c.get(i10);
    }

    public int hashCode() {
        if (this.f9358e == 0) {
            this.f9358e = this.f9357c.hashCode();
        }
        return this.f9358e;
    }

    public int indexOf(m1 m1Var) {
        int iIndexOf = this.f9357c.indexOf(m1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f9356b == 0;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f9355g, com.google.android.exoplayer2.util.c.toBundleArrayList(this.f9357c));
        return bundle;
    }
}
