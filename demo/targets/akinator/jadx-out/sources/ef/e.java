package ef;

import android.os.Bundle;
import com.google.android.exoplayer2.util.n1;
import java.util.Collection;
import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements com.google.android.exoplayer2.i {

    /* renamed from: e, reason: collision with root package name */
    public static final e f54308e = new e(b5.of(), 0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f54309f = n1.intToStringMaxRadix(0);

    /* renamed from: g, reason: collision with root package name */
    public static final String f54310g = n1.intToStringMaxRadix(1);

    /* renamed from: b, reason: collision with root package name */
    public final b5 f54311b;

    /* renamed from: c, reason: collision with root package name */
    public final long f54312c;

    public e(List<b> list, long j10) {
        this.f54311b = b5.copyOf((Collection) list);
        this.f54312c = j10;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        x4 x4VarBuilder = b5.builder();
        int i10 = 0;
        while (true) {
            b5 b5Var = this.f54311b;
            if (i10 >= b5Var.size()) {
                bundle.putParcelableArrayList(f54309f, com.google.android.exoplayer2.util.c.toBundleArrayList(x4VarBuilder.build()));
                bundle.putLong(f54310g, this.f54312c);
                return bundle;
            }
            if (((b) b5Var.get(i10)).f54294f == null) {
                x4VarBuilder.add(b5Var.get(i10));
            }
            i10++;
        }
    }
}
