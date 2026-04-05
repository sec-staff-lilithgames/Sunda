package io.odeeo.internal.a0;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.z1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements io.odeeo.internal.b.g {

    /* renamed from: d, reason: collision with root package name */
    public static final g.a<k0> f62394d = new e6.h0(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f62395a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.b.t[] f62396b;

    /* renamed from: c, reason: collision with root package name */
    public int f62397c;

    public k0(io.odeeo.internal.b.t... tVarArr) {
        io.odeeo.internal.q0.a.checkArgument(tVarArr.length > 0);
        this.f62396b = tVarArr;
        this.f62395a = tVarArr.length;
        a();
    }

    public static /* synthetic */ k0 a(Bundle bundle) {
        return new k0((io.odeeo.internal.b.t[]) io.odeeo.internal.q0.c.fromBundleNullableList(io.odeeo.internal.b.t.H, bundle.getParcelableArrayList(a(0)), h1.of()).toArray(new io.odeeo.internal.b.t[0]));
    }

    public static int b(int i10) {
        return i10 | 16384;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f62395a == k0Var.f62395a && Arrays.equals(this.f62396b, k0Var.f62396b)) {
                return true;
            }
        }
        return false;
    }

    public io.odeeo.internal.b.t getFormat(int i10) {
        return this.f62396b[i10];
    }

    public int hashCode() {
        if (this.f62397c == 0) {
            this.f62397c = Arrays.hashCode(this.f62396b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f62397c;
    }

    public int indexOf(io.odeeo.internal.b.t tVar) {
        int i10 = 0;
        while (true) {
            io.odeeo.internal.b.t[] tVarArr = this.f62396b;
            if (i10 >= tVarArr.length) {
                return -1;
            }
            if (tVar == tVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a(0), io.odeeo.internal.q0.c.toBundleArrayList(z1.newArrayList(this.f62396b)));
        return bundle;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public final void a() {
        String strA = a(this.f62396b[0].f62962c);
        int iB = b(this.f62396b[0].f62964e);
        int i10 = 1;
        while (true) {
            io.odeeo.internal.b.t[] tVarArr = this.f62396b;
            if (i10 >= tVarArr.length) {
                return;
            }
            if (!strA.equals(a(tVarArr[i10].f62962c))) {
                io.odeeo.internal.b.t[] tVarArr2 = this.f62396b;
                a("languages", tVarArr2[0].f62962c, tVarArr2[i10].f62962c, i10);
                return;
            } else {
                if (iB != b(this.f62396b[i10].f62964e)) {
                    a("role flags", Integer.toBinaryString(this.f62396b[0].f62964e), Integer.toBinaryString(this.f62396b[i10].f62964e), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public static String a(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    public static void a(String str, String str2, String str3, int i10) {
        StringBuilder sbB = b3.h.b("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbB.append(str3);
        sbB.append("' (track ");
        sbB.append(i10);
        sbB.append(")");
        io.odeeo.internal.q0.p.e("TrackGroup", "", new IllegalStateException(sbB.toString()));
    }
}
