package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.ui.e;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j;
import kotlin.jvm.internal.u;
import kv.l;
import sv.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements NativeAd.Assets {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46440a;

    /* renamed from: b, reason: collision with root package name */
    public final j f46441b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f46442c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f46443d;

    /* renamed from: e, reason: collision with root package name */
    public final l f46444e;

    /* renamed from: f, reason: collision with root package name */
    public kv.a f46445f;

    /* renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.nativead.model.c f46446g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f46447h;

    /* renamed from: i, reason: collision with root package name */
    public ViewGroup f46448i;

    /* renamed from: j, reason: collision with root package name */
    public e f46449j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C0375a {
        public /* synthetic */ C0375a(u uVar) {
            this();
        }

        public C0375a() {
        }
    }

    static {
        new C0375a(null);
    }

    public a(Context context, j viewVisibilityTracker, com.moloco.sdk.internal.a viewLifecycleOwner, e0 watermark, l vastAdPlaylistController) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        this.f46440a = context;
        this.f46441b = viewVisibilityTracker;
        this.f46442c = viewLifecycleOwner;
        this.f46443d = watermark;
        this.f46444e = vastAdPlaylistController;
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        this.f46447h = cVar != null ? cVar.b(1) : null;
    }

    public final void a(kv.a aVar) {
        this.f46445f = aVar;
    }

    public final kv.a b() {
        return this.f46445f;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.c c() {
        return this.f46446g;
    }

    public final e d() {
        return this.f46449j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null) {
            return cVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null) {
            return cVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null) {
            return cVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getMainImageUri() {
        return this.f46447h;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public View getMediaView() {
        Uri uriB;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVarD;
        e eVar = this.f46449j;
        if (eVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached video view", null, false, 12, null);
            a((ViewGroup) eVar);
            return eVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null && (aVarD = cVar.d(2)) != null) {
            e eVarA = a(aVarD);
            this.f46449j = eVarA;
            return eVarA;
        }
        ViewGroup viewGroup = this.f46448i;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached image view", null, false, 12, null);
            a(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.c cVar2 = this.f46446g;
        if (cVar2 == null || (uriB = cVar2.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup viewGroupA = a(uriB);
        this.f46448i = viewGroupA;
        return viewGroupA;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Float getRating() {
        String strA;
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar == null || (strA = cVar.a(6)) == null) {
            return null;
        }
        return i0.toFloatOrNull(strA);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null) {
            return cVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.c cVar = this.f46446g;
        if (cVar != null) {
            return cVar.c(3);
        }
        return null;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.model.c cVar) {
        this.f46446g = cVar;
    }

    public final void a(e eVar) {
        this.f46449j = eVar;
    }

    public final e a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.f46444e.invoke(aVar);
        aVar2.d();
        return new e(this.f46440a, aVar2, this.f46441b, this.f46442c, this.f46443d, this.f46445f);
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.d(this.f46440a, uri, this.f46443d, this.f46445f, null, null, 48, null);
    }

    public final void a() {
        e eVar = this.f46449j;
        if (eVar != null) {
            eVar.a();
        }
        this.f46449j = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }

    public static /* synthetic */ void e() {
    }
}
