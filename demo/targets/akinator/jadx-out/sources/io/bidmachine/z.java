package io.bidmachine;

import com.explorestack.protobuf.Message;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om.l f62059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContextProvider f62060c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr.d f62061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Collection f62062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f62063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdPlacementConfig f62064h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62065i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f62066j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f62067k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdsType f62068l;

    public z(AdsType adsType, om.l lVar, ContextProvider contextProvider, hr.d dVar, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10, List list2, CountDownLatch countDownLatch) {
        this.f62068l = adsType;
        this.f62059b = lVar;
        this.f62060c = contextProvider;
        this.f62061e = dVar;
        this.f62062f = collection;
        this.f62063g = list;
        this.f62064h = adPlacementConfig;
        this.f62065i = i10;
        this.f62066j = list2;
        this.f62067k = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Message.Builder builderCreatePlacement = this.f62059b.createPlacement(this.f62060c, this.f62061e, this.f62068l, this.f62062f, this.f62063g, this.f62064h, this.f62065i);
            synchronized (this.f62066j) {
                this.f62066j.add(builderCreatePlacement);
            }
            this.f62067k.countDown();
        } catch (Exception e10) {
            nm.a.w(e10);
            this.f62067k.countDown();
        }
    }
}
