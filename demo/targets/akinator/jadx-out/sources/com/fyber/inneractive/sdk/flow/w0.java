package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* renamed from: g, reason: collision with root package name */
    public String f23926g;

    /* renamed from: h, reason: collision with root package name */
    public String f23927h;

    /* renamed from: i, reason: collision with root package name */
    public String f23928i;

    /* renamed from: j, reason: collision with root package name */
    public String f23929j;

    /* renamed from: k, reason: collision with root package name */
    public String f23930k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f23931l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f23932m;

    /* renamed from: n, reason: collision with root package name */
    public MediaView f23933n;

    /* renamed from: o, reason: collision with root package name */
    public Float f23934o;

    /* renamed from: p, reason: collision with root package name */
    public Float f23935p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f23936q;

    /* renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f23937r;

    /* renamed from: s, reason: collision with root package name */
    public t0 f23938s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f23939t;

    /* renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f23940u;

    /* renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f23941v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f23942w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f23943x;

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f23936q = new ArrayList();
        this.f23939t = new HashMap();
        this.f23942w = new ArrayList();
        this.f23943x = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "OTHER"
            if (r6 == 0) goto Lf
            java.lang.String r1 = r6.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r6 = r0
        L10:
            java.lang.String r1 = "w0"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r6}
            java.lang.String r2 = "%s : handleClick(): %s"
            com.fyber.inneractive.sdk.util.IAlog.c(r2, r1)
            com.fyber.inneractive.sdk.flow.nativead.j r1 = r5.f23940u
            if (r1 == 0) goto Lb4
            int r1 = r6.hashCode()
            switch(r1) {
                case -1884772963: goto L77;
                case -1840402880: goto L63;
                case 67056: goto L58;
                case 2241657: goto L4d;
                case 2521314: goto L42;
                case 75532016: goto L3d;
                case 79833656: goto L32;
                case 428414940: goto L27;
                default: goto L26;
            }
        L26:
            goto L82
        L27:
            java.lang.String r0 = "DESCRIPTION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION
            goto L84
        L32:
            java.lang.String r0 = "TITLE"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE
            goto L84
        L3d:
            boolean r0 = r6.equals(r0)
            goto L82
        L42:
            java.lang.String r0 = "ROOT"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT
            goto L84
        L4d:
            java.lang.String r0 = "ICON"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON
            goto L84
        L58:
            java.lang.String r0 = "CTA"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_CTA
            goto L84
        L63:
            java.lang.String r0 = "MEDIA_VIEW"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            boolean r0 = r5.isVideoAd()
            if (r0 == 0) goto L74
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO
            goto L84
        L74:
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE
            goto L84
        L77:
            java.lang.String r0 = "RATING"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L82
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING
            goto L84
        L82:
            com.fyber.inneractive.sdk.util.g r0 = com.fyber.inneractive.sdk.util.g.NATIVE
        L84:
            java.util.HashMap r1 = r5.f23939t
            java.lang.Object r6 = r1.get(r6)
            com.fyber.inneractive.sdk.flow.nativead.i r6 = (com.fyber.inneractive.sdk.flow.nativead.i) r6
            com.fyber.inneractive.sdk.flow.nativead.j r1 = r5.f23940u
            if (r6 == 0) goto L91
            goto L93
        L91:
            com.fyber.inneractive.sdk.flow.nativead.i r6 = r1.f23711a
        L93:
            if (r6 != 0) goto La4
            r1.getClass()
            java.lang.String r6 = com.fyber.inneractive.sdk.flow.nativead.j.f23710d
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "%s : No active link (no root and object related links), origin: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r6)
            return
        La4:
            com.fyber.inneractive.sdk.flow.nativead.p r1 = r1.f23713c
            r1.getClass()
            java.util.concurrent.ThreadPoolExecutor r2 = com.fyber.inneractive.sdk.util.r.f26803a
            com.fyber.inneractive.sdk.flow.nativead.m r3 = new com.fyber.inneractive.sdk.flow.nativead.m
            r4 = 0
            r3.<init>(r1, r6, r4, r0)
            r2.execute(r3)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.w0.b(java.lang.String):void");
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f23933n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f23941v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f23938s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f23938s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f23940u;
        if (jVar != null) {
            jVar.f23712b = null;
            jVar.f23713c.f23741a = null;
            this.f23940u = null;
        }
        if (this.f23941v != null) {
            this.f23941v = null;
        }
        Iterator it = this.f23936q.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        Iterator it2 = this.f23936q.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f23937r = null;
        this.f23936q.clear();
        this.f23930k = null;
        this.f23934o = null;
        this.f23931l = null;
        this.f23926g = null;
        this.f23932m = null;
        this.f23933n = null;
        this.f23927h = null;
        this.f23929j = null;
        this.f23928i = null;
        this.f23935p = null;
        this.f23939t.clear();
        this.f23942w.clear();
        this.f23943x.clear();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return (this.f23932m == null && this.f23933n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f23928i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f23927h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f23926g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f23929j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f23931l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f23935p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f23933n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f23930k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f23934o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f23938s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f23936q.clear();
        if (collection != null) {
            this.f23936q.addAll(collection);
        }
        if (viewGroup != null && !this.f23936q.contains(viewGroup)) {
            this.f23936q.add(viewGroup);
        }
        if (mediaView != null && !this.f23936q.contains(mediaView)) {
            this.f23936q.add(mediaView);
        }
        if (imageView != null && !this.f23936q.contains(imageView)) {
            this.f23936q.add(imageView);
        }
        MediaView mediaView2 = this.f23933n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f23937r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f23933n.getContext(), this);
        Iterator it = this.f23936q.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view != null) {
                view.setOnTouchListener(this.f23937r);
            }
        }
    }
}
