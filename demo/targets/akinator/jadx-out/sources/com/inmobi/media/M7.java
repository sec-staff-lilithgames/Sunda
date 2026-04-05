package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class M7 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f32027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(int[] iArr) {
        super(1);
        this.f32027a = iArr;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 event = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        return Boolean.valueOf(uu.k0.contains(this.f32027a, event.f32830a));
    }
}
