package com.applovin.impl.sdk;

import android.adservices.topics.GetTopicsRequest;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15692c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15693e;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f15691b = i10;
        this.f15693e = obj;
        this.f15692c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15691b) {
            case 0:
                ((AppLovinAdServiceImpl.c) this.f15693e).adReceived((com.applovin.impl.sdk.ad.b) this.f15692c);
                break;
            case 1:
                ((AppLovinAdLoadListener) this.f15693e).adReceived((com.applovin.impl.sdk.ad.b) this.f15692c);
                break;
            case 2:
                ((k) this.f15693e).a((AppLovinSdkInitializationConfiguration) this.f15692c);
                break;
            case 3:
                ((k) this.f15693e).b((String) this.f15692c);
                break;
            case 4:
                ((l) this.f15693e).b((AppLovinBidTokenCollectionListener) this.f15692c);
                break;
            case 5:
                ((n) this.f15693e).a((Long) this.f15692c);
                break;
            case 6:
                ((r) this.f15693e).a((GetTopicsRequest) this.f15692c);
                break;
            case 7:
                ((r) this.f15693e).a((List) this.f15692c);
                break;
            default:
                ((r) this.f15693e).a((String) this.f15692c);
                break;
        }
    }
}
