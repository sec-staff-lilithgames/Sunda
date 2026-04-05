package vp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.AdObjectImpl;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.RendererConfiguration;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l extends AdObjectImpl implements o, r, n, p, View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public static final WeakHashMap f89527s = new WeakHashMap(3);

    /* renamed from: b, reason: collision with root package name */
    public final dn.b f89528b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f89529c;

    /* renamed from: e, reason: collision with root package name */
    public yp.k f89530e;

    /* renamed from: f, reason: collision with root package name */
    public View f89531f;

    /* renamed from: g, reason: collision with root package name */
    public ProgressDialog f89532g;

    /* renamed from: h, reason: collision with root package name */
    public er.f f89533h;

    /* renamed from: i, reason: collision with root package name */
    public j f89534i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f89535j;

    /* renamed from: k, reason: collision with root package name */
    public i f89536k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f89537l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f89538m;

    /* renamed from: n, reason: collision with root package name */
    public ImageDataImpl f89539n;

    /* renamed from: o, reason: collision with root package name */
    public ImageDataImpl f89540o;

    /* renamed from: p, reason: collision with root package name */
    public Uri f89541p;

    /* renamed from: q, reason: collision with root package name */
    public io.bidmachine.iab.vast.t f89542q;

    /* renamed from: r, reason: collision with root package name */
    public t f89543r;

    public l(ContextProvider contextProvider, AdProcessCallback adProcessCallback, x xVar, up.b bVar, hr.l lVar) {
        super(contextProvider, adProcessCallback, xVar, bVar, lVar);
        this.f89528b = new dn.b();
    }

    public static void a(l lVar, Context context, t tVar) {
        ImageData mainImage;
        ImageData icon;
        e eVar = new e((m) ((x) lVar.getAdRequest()).getAdRequestParameters(), lVar.getProcessCallback(), tVar, lVar);
        o oVar = eVar.f89518d;
        String videoUrl = oVar.getVideoUrl();
        String videoAdm = oVar.getVideoAdm();
        MediaAssetType mediaAssetType = MediaAssetType.Icon;
        m mVar = eVar.f89516b;
        boolean zContainsAssetType = mVar.containsAssetType(mediaAssetType);
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f89515a;
        if (zContainsAssetType && (icon = oVar.getIcon()) != null && icon.getImage() == null) {
            String remoteUrl = icon.getRemoteUrl();
            if (!TextUtils.isEmpty(remoteUrl)) {
                copyOnWriteArrayList.add(wp.d.newBuilder(context, remoteUrl).setOnCacheImageListener(new a(eVar)).build());
            }
        }
        if (mVar.containsAssetType(MediaAssetType.Image) && (mainImage = oVar.getMainImage()) != null && mainImage.getImage() == null) {
            String remoteUrl2 = mainImage.getRemoteUrl();
            if (!TextUtils.isEmpty(remoteUrl2)) {
                copyOnWriteArrayList.add(wp.d.newBuilder(context, remoteUrl2).setOnCacheImageListener(new b(eVar)).build());
            }
        }
        if (mVar.containsAssetType(MediaAssetType.Video)) {
            if (TextUtils.isEmpty(videoUrl)) {
                if (!TextUtils.isEmpty(videoAdm) && !TextUtils.isEmpty(videoAdm)) {
                    copyOnWriteArrayList.add(new wp.g(context, new d(eVar, context), videoAdm));
                }
            } else if (!TextUtils.isEmpty(videoUrl)) {
                copyOnWriteArrayList.add(new wp.j(context, new c(eVar, context), videoUrl));
            }
        }
        if (copyOnWriteArrayList.isEmpty()) {
            eVar.c();
        } else {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                xp.f.getInstance().execute((Runnable) it.next());
            }
        }
        eVar.c();
    }

    public static void e(ViewGroup viewGroup) {
        WeakHashMap weakHashMap = f89527s;
        WeakHashMap weakHashMap2 = (WeakHashMap) weakHashMap.get(viewGroup);
        if (weakHashMap2 != null) {
            for (Map.Entry entry : weakHashMap2.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    ((View) entry.getKey()).setOnClickListener(null);
                }
            }
            weakHashMap.remove(viewGroup);
        }
    }

    public final ImageView b(View view) {
        ImageView imageView;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else if (view instanceof ViewGroup) {
            ImageView imageView2 = new ImageView(view.getContext());
            imageView2.setId(100);
            imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(imageView2, new ViewGroup.LayoutParams(-1, -1));
            imageView = imageView2;
        } else {
            imageView = null;
        }
        if (imageView != null && this.f89539n != null) {
            xp.e.fillImageView(imageView.getContext(), imageView, this.f89539n.getLocalUri(), this.f89539n.getImage());
        }
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(yp.n r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r5.getContext()
            vp.t r1 = r4.f89543r
            if (r1 == 0) goto L12
            android.view.View r1 = r1.createCustomMediaView(r0)
            if (r1 == 0) goto L12
            goto L3d
        L12:
            yp.k r1 = new yp.k
            r1.<init>(r0)
            r0 = 200(0xc8, float:2.8E-43)
            r1.setId(r0)
            io.bidmachine.AdRequest r0 = r4.getAdRequest()
            vp.x r0 = (vp.x) r0
            io.bidmachine.AdRequestParameters r0 = r0.getAdRequestParameters()
            vp.m r0 = (vp.m) r0
            io.bidmachine.MediaAssetType r2 = io.bidmachine.MediaAssetType.Image
            boolean r2 = r0.containsAssetType(r2)
            if (r2 != 0) goto L38
            io.bidmachine.MediaAssetType r2 = io.bidmachine.MediaAssetType.Video
            boolean r0 = r0.containsAssetType(r2)
            if (r0 == 0) goto L3b
        L38:
            r1.setNativeAdObject(r4)
        L3b:
            r4.f89530e = r1
        L3d:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r3 = 13
            r0.addRule(r3, r2)
            ir.t.addSingleViewSafely(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.l.c(yp.n):void");
    }

    public final void d(ViewGroup viewGroup, RendererConfiguration rendererConfiguration) {
        Drawable watermarkDrawable;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f89534i;
        if (onLayoutChangeListener != null) {
            viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.f89534i = null;
        }
        er.f fVar = this.f89533h;
        if (fVar != null) {
            ir.t.removeFromParent(fVar);
            this.f89533h = null;
        }
        if (rendererConfiguration == null || (watermarkDrawable = rendererConfiguration.getWatermarkDrawable(getApplicationContext())) == null) {
            return;
        }
        er.f fVar2 = new er.f(viewGroup.getContext().getApplicationContext());
        fVar2.setLayoutParams(ir.t.createMatchParentParams());
        fVar2.setWatermark(watermarkDrawable);
        this.f89533h = fVar2;
        j jVar = new j(fVar2);
        this.f89534i = jVar;
        viewGroup.addOnLayoutChangeListener(jVar);
        viewGroup.addView(fVar2);
    }

    @Override // vp.p
    public void dispatchClick() {
        getProcessCallback().processClicked();
    }

    @Override // vp.p
    public void dispatchFillAd() {
        getProcessCallback().processFillAd();
    }

    @Override // vp.p
    public void dispatchImpression() {
        getProcessCallback().processVisibilityTrackerImpression();
    }

    @Override // vp.p
    public boolean dispatchShown() {
        return getProcessCallback().processVisibilityTrackerShown();
    }

    public final void f() {
        Handler handler;
        ProgressDialog progressDialog = this.f89532g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f89532g.dismiss();
            this.f89532g = null;
        }
        i iVar = this.f89536k;
        if (iVar == null || (handler = this.f89535j) == null) {
            return;
        }
        handler.removeCallbacks(iVar);
        this.f89535j = null;
        this.f89536k = null;
    }

    public final void g(ViewGroup viewGroup, View view, yp.n nVar, Set set, RendererConfiguration rendererConfiguration) {
        try {
            if (viewGroup == null) {
                nm.a.d("NativeAdView cannot be null. NativeAd is NOT registered");
            } else {
                if (view != null || nVar != null) {
                    if (view != null && !pr.p.belongTo(viewGroup, view)) {
                        nm.a.d("ImageView should belong to NativeAdView");
                    }
                    if (nVar != null && !pr.p.belongTo(viewGroup, nVar)) {
                        nm.a.d("NativeMediaView should belong to NativeAdView");
                    }
                    e(viewGroup);
                    if (set != null && !set.isEmpty()) {
                        WeakHashMap weakHashMap = new WeakHashMap();
                        f89527s.put(viewGroup, weakHashMap);
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            View view2 = (View) it.next();
                            if (view2 != null) {
                                view2.setOnClickListener(this);
                                weakHashMap.put(view2, this);
                            }
                        }
                    }
                    ImageView imageViewB = b(view);
                    c(nVar);
                    this.f89529c = viewGroup;
                    if (!this.f89537l) {
                        getProcessCallback().processStartVisibilityTracker();
                        this.f89528b.startTracking(viewGroup, getParams().getVisibilityParams(), new g(this));
                        dispatchFillAd();
                    }
                    yp.k kVar = this.f89530e;
                    if (kVar != null) {
                        kVar.onViewAppearOnScreen();
                        this.f89530e.startVideoVisibilityCheckerTimer();
                    }
                    t tVar = this.f89543r;
                    if (tVar != null) {
                        tVar.registerNative(viewGroup, imageViewB, nVar, set);
                    }
                    d(viewGroup, rendererConfiguration);
                    er.f fVar = this.f89533h;
                    if (fVar != null) {
                        fVar.bringToFront();
                    }
                    this.f89538m = true;
                    return;
                }
                nm.a.d("ImageView or NativeMediaView cannot be null. NativeAd is NOT registered");
            }
            getProcessCallback().processShowFail(pr.a.internal("Native ad views are invalid"));
        } catch (Throwable th2) {
            nm.a.w(th2);
            unregisterView();
            getProcessCallback().processShowFail(pr.a.throwable("Exception registering view for native ad object", th2));
        }
    }

    @Override // vp.o
    public LabelData getAdLabelData() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getAdLabelData();
        }
        return null;
    }

    @Override // vp.o, vp.u
    public String getCallToAction() {
        t tVar = this.f89543r;
        String callToAction = tVar != null ? tVar.getCallToAction() : null;
        return TextUtils.isEmpty(callToAction) ? "Install" : callToAction;
    }

    @Override // vp.o
    public String getClickUrl() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getClickUrl();
        }
        return null;
    }

    @Override // vp.o, vp.u
    public String getDescription() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getDescription();
        }
        return null;
    }

    @Override // vp.o, vp.u
    public ImageData getIcon() {
        return this.f89539n;
    }

    @Override // vp.r, vp.s
    public Drawable getIconDrawable() {
        ImageDataImpl imageDataImpl = this.f89539n;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // vp.r, vp.s
    public Uri getIconUri() {
        ImageDataImpl imageDataImpl = this.f89539n;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // vp.r, vp.s
    public Drawable getImageDrawable() {
        ImageDataImpl imageDataImpl = this.f89540o;
        if (imageDataImpl != null) {
            return imageDataImpl.getImage();
        }
        return null;
    }

    @Override // vp.r, vp.s
    public Uri getImageUri() {
        ImageDataImpl imageDataImpl = this.f89540o;
        if (imageDataImpl != null) {
            return imageDataImpl.getLocalUri();
        }
        return null;
    }

    @Override // vp.o, vp.u
    public ImageData getMainImage() {
        return this.f89540o;
    }

    @Override // vp.o
    public PrivacySheetData getPrivacySheetData() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getPrivacySheetData();
        }
        return null;
    }

    @Override // vp.n
    public View getProviderView(Context context) {
        t tVar;
        if (this.f89531f == null && (tVar = this.f89543r) != null) {
            this.f89531f = tVar.createProviderView(context);
        }
        return this.f89531f;
    }

    @Override // vp.o, vp.u
    public float getRating() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getRating();
        }
        return -1.0f;
    }

    @Override // vp.o, vp.u
    public String getTitle() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getTitle();
        }
        return null;
    }

    @Override // vp.r
    public io.bidmachine.iab.vast.t getVastRequest() {
        return this.f89542q;
    }

    @Override // vp.o
    public String getVideoAdm() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getVideoAdm();
        }
        return null;
    }

    @Override // vp.r, vp.s
    public Uri getVideoUri() {
        return this.f89541p;
    }

    @Override // vp.o
    public String getVideoUrl() {
        t tVar = this.f89543r;
        if (tVar != null) {
            return tVar.getVideoUrl();
        }
        return null;
    }

    @Override // vp.o, vp.u
    public boolean hasVideo() {
        if (this.f89541p != null) {
            return true;
        }
        t tVar = this.f89543r;
        return tVar != null && tVar.hasVideo();
    }

    @Override // vp.n
    public boolean isViewRegistered() {
        return this.f89538m;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dispatchClick();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onClicked() {
        ProgressDialog progressDialog;
        super.onClicked();
        String clickUrl = getClickUrl();
        if (TextUtils.isEmpty(clickUrl)) {
            return;
        }
        Activity activity = getActivity();
        if (this.f89529c != null && (((progressDialog = this.f89532g) == null || !progressDialog.isShowing()) && nm.j.canAddWindowToActivity(activity))) {
            this.f89529c.addOnAttachStateChangeListener(new h(this));
            ProgressDialog progressDialogShow = ProgressDialog.show(activity, "", "Loading...");
            this.f89532g = progressDialogShow;
            progressDialogShow.setProgressStyle(0);
            this.f89532g.setCancelable(false);
            this.f89536k = new i(this);
            Handler handler = new Handler(Looper.getMainLooper());
            this.f89535j = handler;
            handler.postDelayed(this.f89536k, 5000L);
        }
        cr.r.openUrl(getApplicationContext(), clickUrl, new jm.d(this, 7));
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onDestroy() {
        try {
            super.onDestroy();
            unregisterView();
            ImageDataImpl imageDataImpl = this.f89539n;
            if (imageDataImpl != null) {
                imageDataImpl.destroy();
                this.f89539n = null;
            }
            ImageDataImpl imageDataImpl2 = this.f89540o;
            if (imageDataImpl2 != null) {
                imageDataImpl2.destroy();
                this.f89540o = null;
            }
            Uri uri = this.f89541p;
            if (uri != null && uri.getPath() != null) {
                File file = new File(this.f89541p.getPath());
                if (file.exists()) {
                    file.delete();
                }
                this.f89541p = null;
            }
            t tVar = this.f89543r;
            if (tVar != null) {
                tVar.destroy();
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    @Override // vp.n
    public void registerView(ViewGroup viewGroup, View view, yp.n nVar, Set<View> set) {
        g(viewGroup, view, nVar, set, null);
    }

    @Override // vp.r
    public void setIconBitmap(Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.f89539n;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    @Override // vp.r
    public void setIconUri(Uri uri) {
        ImageDataImpl imageDataImpl = this.f89539n;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    @Override // vp.r
    public void setImageBitmap(Bitmap bitmap) {
        ImageDataImpl imageDataImpl = this.f89540o;
        if (imageDataImpl != null) {
            imageDataImpl.setImage(new BitmapDrawable(getApplicationContext().getResources(), bitmap));
        }
    }

    @Override // vp.r
    public void setImageUri(Uri uri) {
        ImageDataImpl imageDataImpl = this.f89540o;
        if (imageDataImpl != null) {
            imageDataImpl.setLocalUri(uri);
        }
    }

    public void setNativeNetworkAdapter(t tVar) {
        this.f89543r = tVar;
        if (tVar != null) {
            this.f89539n = new ImageDataImpl(tVar.getIcon());
            this.f89540o = new ImageDataImpl(tVar.getMainImage());
        }
    }

    @Override // vp.r
    public void setVastRequest(io.bidmachine.iab.vast.t tVar) {
        this.f89542q = tVar;
    }

    @Override // vp.r
    public void setVideoUri(Uri uri) {
        this.f89541p = uri;
    }

    @Override // vp.n
    public void unregisterView() {
        try {
            this.f89528b.stopTracking();
            ViewGroup viewGroup = this.f89529c;
            if (viewGroup != null) {
                j jVar = this.f89534i;
                if (jVar != null) {
                    viewGroup.removeOnLayoutChangeListener(jVar);
                    this.f89534i = null;
                }
                e(this.f89529c);
                this.f89529c = null;
            }
            yp.k kVar = this.f89530e;
            if (kVar != null) {
                kVar.stopVideoVisibilityCheckerTimer();
                this.f89530e.release();
                this.f89530e = null;
            }
            t tVar = this.f89543r;
            if (tVar != null) {
                tVar.unregisterNative();
            }
            er.f fVar = this.f89533h;
            if (fVar != null) {
                ir.t.removeFromParent(fVar);
                this.f89533h = null;
            }
            this.f89538m = false;
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public hr.m createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new k(this, adProcessCallback);
    }

    @Override // vp.p
    public void dispatchVideoPlayFinished() {
    }
}
