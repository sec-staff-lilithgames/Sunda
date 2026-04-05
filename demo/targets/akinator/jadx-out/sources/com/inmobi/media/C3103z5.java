package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3103z5 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f33695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublisherCallbacks f33696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103z5(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z10) {
        super(0);
        this.f33695a = inMobiBanner;
        this.f33696b = publisherCallbacks;
        this.f33697c = z10;
    }

    @Override // kv.a
    public final Object invoke() {
        T1 mAdManager$media_release;
        this.f33695a.a();
        if (InMobiBanner.access$checkForRefreshRate(this.f33695a) && (mAdManager$media_release = this.f33695a.getMAdManager$media_release()) != null) {
            mAdManager$media_release.a(this.f33696b, this.f33695a.getFrameSizeString(), this.f33697c);
        }
        return tu.x0.f87415a;
    }
}
