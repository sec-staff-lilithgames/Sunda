package in;

import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f59796c = new d(b5.of(), 0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f59797d = a1.intToStringMaxRadix(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f59798e = a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final b5 f59799a;

    /* renamed from: b, reason: collision with root package name */
    public final long f59800b;

    public d(List<b> list, long j10) {
        this.f59799a = b5.copyOf((Collection) list);
        this.f59800b = j10;
    }

    public static d fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f59797d);
        return new d(parcelableArrayList == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(new c(0), parcelableArrayList), bundle.getLong(f59798e));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        x4 x4VarBuilder = b5.builder();
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f59799a;
            if (i10 >= b5Var.size()) {
                bundle.putParcelableArrayList(f59797d, io.bidmachine.media3.common.util.f.toBundleArrayList(x4VarBuilder.build(), new c(1)));
                bundle.putLong(f59798e, this.f59800b);
                return bundle;
            }
            if (((b) b5Var.get(i10)).f59781d == null) {
                x4VarBuilder.add(b5Var.get(i10));
            }
            i10++;
        }
    }
}
