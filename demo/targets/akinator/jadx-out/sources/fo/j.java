package fo;

import gn.v1;
import io.bidmachine.media3.common.util.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f55908a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f55909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55910c;

    public j(v1 v1Var, int... iArr) {
        this(v1Var, iArr, 0);
    }

    public j(v1 v1Var, int[] iArr, int i10) {
        if (iArr.length == 0) {
            b0.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f55908a = v1Var;
        this.f55909b = iArr;
        this.f55910c = i10;
    }
}
