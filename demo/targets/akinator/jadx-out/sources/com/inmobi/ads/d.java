package com.inmobi.ads;

import com.inmobi.media.F5;
import com.inmobi.media.G5;
import com.inmobi.media.T1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f31585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f31586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InMobiBanner inMobiBanner, byte[] bArr) {
        super(0);
        this.f31585a = inMobiBanner;
        this.f31586b = bArr;
    }

    @Override // kv.a
    public final Object invoke() {
        F5 f5P;
        T1 mAdManager$media_release = this.f31585a.getMAdManager$media_release();
        if (mAdManager$media_release != null && (f5P = mAdManager$media_release.p()) != null) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            ((G5) f5P).c(strAccess$getTAG$cp, "load with response");
        }
        T1 mAdManager$media_release2 = this.f31585a.getMAdManager$media_release();
        if (mAdManager$media_release2 != null) {
            mAdManager$media_release2.a(this.f31586b, this.f31585a.f31550e);
        }
        return x0.f87415a;
    }
}
