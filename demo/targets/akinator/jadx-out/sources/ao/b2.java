package ao;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import nh.b5;
import nh.p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final b2 f7550d = new b2(new gn.v1[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f7551e = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f7552a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f7553b;

    /* renamed from: c, reason: collision with root package name */
    public int f7554c;

    public b2(gn.v1... v1VarArr) {
        b5 b5VarCopyOf = b5.copyOf(v1VarArr);
        this.f7553b = b5VarCopyOf;
        this.f7552a = v1VarArr.length;
        int i10 = 0;
        while (i10 < b5VarCopyOf.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < b5VarCopyOf.size(); i12++) {
                if (((gn.v1) b5VarCopyOf.get(i10)).equals(b5VarCopyOf.get(i12))) {
                    io.bidmachine.media3.common.util.b0.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public static b2 fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f7551e);
        return parcelableArrayList == null ? new b2(new gn.v1[0]) : new b2((gn.v1[]) io.bidmachine.media3.common.util.f.fromBundleList(new c(2), parcelableArrayList).toArray(new gn.v1[0]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b2.class == obj.getClass()) {
            b2 b2Var = (b2) obj;
            if (this.f7552a == b2Var.f7552a && this.f7553b.equals(b2Var.f7553b)) {
                return true;
            }
        }
        return false;
    }

    public gn.v1 get(int i10) {
        return (gn.v1) this.f7553b.get(i10);
    }

    public b5 getTrackTypes() {
        return b5.copyOf((Collection) p8.transform(this.f7553b, new c(4)));
    }

    public int hashCode() {
        if (this.f7554c == 0) {
            this.f7554c = this.f7553b.hashCode();
        }
        return this.f7554c;
    }

    public int indexOf(gn.v1 v1Var) {
        int iIndexOf = this.f7553b.indexOf(v1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f7552a == 0;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f7551e, io.bidmachine.media3.common.util.f.toBundleArrayList(this.f7553b, new c(3)));
        return bundle;
    }

    public String toString() {
        return this.f7553b.toString();
    }
}
