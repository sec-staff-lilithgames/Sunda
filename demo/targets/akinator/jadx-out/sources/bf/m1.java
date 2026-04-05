package bf;

import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m1 implements com.google.android.exoplayer2.i {

    /* renamed from: h, reason: collision with root package name */
    public static final String f9329h = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f9330i = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final a2.o f9331j = new a2.o(12);

    /* renamed from: b, reason: collision with root package name */
    public final int f9332b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9333c;

    /* renamed from: e, reason: collision with root package name */
    public final int f9334e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.z0[] f9335f;

    /* renamed from: g, reason: collision with root package name */
    public int f9336g;

    public m1(com.google.android.exoplayer2.z0... z0VarArr) {
        this("", z0VarArr);
    }

    public static void a(int i10, String str, String str2, String str3) {
        StringBuilder sbB = b3.h.b("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbB.append(str3);
        sbB.append("' (track ");
        sbB.append(i10);
        sbB.append(")");
        com.google.android.exoplayer2.util.f0.e("TrackGroup", "", new IllegalStateException(sbB.toString()));
    }

    public m1 copyWithId(String str) {
        return new m1(str, this.f9335f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f9333c.equals(m1Var.f9333c) && Arrays.equals(this.f9335f, m1Var.f9335f)) {
                return true;
            }
        }
        return false;
    }

    public com.google.android.exoplayer2.z0 getFormat(int i10) {
        return this.f9335f[i10];
    }

    public int hashCode() {
        if (this.f9336g == 0) {
            this.f9336g = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f9333c) + Arrays.hashCode(this.f9335f);
        }
        return this.f9336g;
    }

    public int indexOf(com.google.android.exoplayer2.z0 z0Var) {
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.z0[] z0VarArr = this.f9335f;
            if (i10 >= z0VarArr.length) {
                return -1;
            }
            if (z0Var == z0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        com.google.android.exoplayer2.z0[] z0VarArr = this.f9335f;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(z0VarArr.length);
        for (com.google.android.exoplayer2.z0 z0Var : z0VarArr) {
            arrayList.add(z0Var.toBundle(true));
        }
        bundle.putParcelableArrayList(f9329h, arrayList);
        bundle.putString(f9330i, this.f9333c);
        return bundle;
    }

    public m1(String str, com.google.android.exoplayer2.z0... z0VarArr) {
        com.google.android.exoplayer2.util.a.checkArgument(z0VarArr.length > 0);
        this.f9333c = str;
        this.f9335f = z0VarArr;
        this.f9332b = z0VarArr.length;
        int trackType = com.google.android.exoplayer2.util.l0.getTrackType(z0VarArr[0].f28802n);
        this.f9334e = trackType == -1 ? com.google.android.exoplayer2.util.l0.getTrackType(z0VarArr[0].f28801m) : trackType;
        String str2 = z0VarArr[0].f28793e;
        str2 = (str2 == null || str2.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str2;
        int i10 = z0VarArr[0].f28795g | 16384;
        for (int i11 = 1; i11 < z0VarArr.length; i11++) {
            String str3 = z0VarArr[i11].f28793e;
            if (!str2.equals((str3 == null || str3.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str3)) {
                a(i11, "languages", z0VarArr[0].f28793e, z0VarArr[i11].f28793e);
                return;
            } else {
                if (i10 != (z0VarArr[i11].f28795g | 16384)) {
                    a(i11, "role flags", Integer.toBinaryString(z0VarArr[0].f28795g), Integer.toBinaryString(z0VarArr[i11].f28795g));
                    return;
                }
            }
        }
    }
}
