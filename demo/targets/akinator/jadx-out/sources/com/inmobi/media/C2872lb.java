package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.lb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2872lb extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2872lb f33056a = new C2872lb();

    public C2872lb() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        kotlin.jvm.internal.e0.checkNotNull(str);
        return Boolean.valueOf(sv.k0.startsWith$default(str, "auto_", false, 2, null));
    }
}
