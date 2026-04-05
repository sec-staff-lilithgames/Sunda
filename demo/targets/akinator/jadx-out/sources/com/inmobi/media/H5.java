package com.inmobi.media;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H5 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f31839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5(ArrayList arrayList) {
        super(1);
        this.f31839a = arrayList;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2766f6 it = (C2766f6) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f31839a.add(new C2833j6(it));
        return tu.x0.f87415a;
    }
}
