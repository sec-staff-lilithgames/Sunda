package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdViewHolder f37283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        this.f37283a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    public final void registerNativeAdViews(LevelPlayNativeAd nativeAd) {
        e0.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f37283a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f37283a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f37283a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f37283a.getTitleView());
            nativeAdViewBinder.setIconView(this.f37283a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f37283a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f37283a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f37283a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f37283a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f37283a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f37283a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f37283a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        this.f37283a = new NativeAdViewHolder();
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            e0.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
