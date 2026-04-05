package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.nb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3361nb extends FrameLayout implements NativeAdViewBinderInterface {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdViewHolder f37980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3361nb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f37980a = new NativeAdViewHolder();
    }

    public final void a(C3305kb nativeAd) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listA = a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        a(frameLayout, listA);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderF = nativeAd.f();
        if (adapterNativeAdViewBinderF != null) {
            adapterNativeAdViewBinderF.setBodyView(this.f37980a.getBodyView());
            adapterNativeAdViewBinderF.setMediaView(this.f37980a.getMediaView());
            adapterNativeAdViewBinderF.setCallToActionView(this.f37980a.getCallToActionView());
            adapterNativeAdViewBinderF.setTitleView(this.f37980a.getTitleView());
            adapterNativeAdViewBinderF.setIconView(this.f37980a.getIconView());
            adapterNativeAdViewBinderF.setAdvertiserView(this.f37980a.getAdvertiserView());
            adapterNativeAdViewBinderF.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderF.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f37980a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f37980a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f37980a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f37980a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f37980a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f37980a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3361nb(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f37980a = new NativeAdViewHolder();
    }

    private final void a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    private final List<View> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View child = viewGroup.getChildAt(i10);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
