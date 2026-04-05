package com.inmobi.media;

import com.ironsource.C3271ic;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Uc extends X9 {
    public final AtomicBoolean A;

    /* renamed from: y, reason: collision with root package name */
    public final int f32374y;

    /* renamed from: z, reason: collision with root package name */
    public final int f32375z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uc(String url, Te te2, String str, int i10, int i11) {
        super(C3271ic.f36944b, url, te2, M4.a(M4.f32021a, false, 1, null), (F5) null, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.e0.checkNotNullParameter(C3271ic.f36944b, "requestType");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter("application/x-www-form-urlencoded", "requestContentType");
        this.f32374y = i10;
        this.f32375z = i11;
        this.f32504m = str;
        this.A = new AtomicBoolean(false);
    }
}
