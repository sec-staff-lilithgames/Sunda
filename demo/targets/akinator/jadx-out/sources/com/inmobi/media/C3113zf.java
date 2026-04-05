package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3113zf extends AbstractC3062wf {

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3093yc f33730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3113zf(GestureDetectorOnGestureListenerC3093yc mRenderView) {
        super(mRenderView);
        kotlin.jvm.internal.e0.checkNotNullParameter(mRenderView, "mRenderView");
        this.f33730e = mRenderView;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        this.f33553c = new WeakReference(this.f33730e);
        return this.f33730e;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f33730e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        J exposureTracker = this.f33730e.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
        this.f33730e.getWebViewFactory().b(new C3079xf(childView));
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f33730e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        J exposureTracker = this.f33730e.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
        this.f33730e.getWebViewFactory().b(new C3096yf(childView));
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
    }
}
