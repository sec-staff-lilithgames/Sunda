package pf;

import bf.m1;
import com.google.android.exoplayer2.util.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f81119a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f81120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81121c;

    public i(m1 m1Var, int... iArr) {
        this(m1Var, iArr, 0);
    }

    public i(m1 m1Var, int[] iArr, int i10) {
        if (iArr.length == 0) {
            f0.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f81119a = m1Var;
        this.f81120b = iArr;
        this.f81121c = i10;
    }
}
