package l0;

import c0.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final d1 f72072e = new d1(1);

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((r0.b) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(r0.b keyframes) {
        kotlin.jvm.internal.e0.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1000);
        Float fValueOf = Float.valueOf(1.0f);
        keyframes.at(fValueOf, 0);
        keyframes.at(fValueOf, 499);
        Float fValueOf2 = Float.valueOf(0.0f);
        keyframes.at(fValueOf2, 500);
        keyframes.at(fValueOf2, 999);
    }
}
