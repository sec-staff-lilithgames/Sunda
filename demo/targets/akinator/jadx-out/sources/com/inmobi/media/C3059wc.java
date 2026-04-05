package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3059wc extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3059wc(String str) {
        super(0);
        this.f33549a = str;
    }

    @Override // kv.a
    public final Object invoke() {
        String errorCode = this.f33549a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(errorCode, "$errorCode");
        return Short.valueOf(Short.parseShort(errorCode));
    }
}
