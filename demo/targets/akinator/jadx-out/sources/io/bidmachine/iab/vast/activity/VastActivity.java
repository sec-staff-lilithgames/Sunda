package io.bidmachine.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.iab.vast.t;
import io.bidmachine.iab.vast.v;
import ir.n;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastActivity extends io.bidmachine.rendering.internal.a {

    /* renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f60404k = new ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f60405l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static WeakReference f60406m;

    /* renamed from: n, reason: collision with root package name */
    public static WeakReference f60407n;

    /* renamed from: o, reason: collision with root package name */
    public static WeakReference f60408o;

    /* renamed from: e, reason: collision with root package name */
    public t f60410e;

    /* renamed from: f, reason: collision with root package name */
    public VastView f60411f;

    /* renamed from: g, reason: collision with root package name */
    public io.bidmachine.iab.vast.b f60412g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f60414i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f60415j;

    /* renamed from: c, reason: collision with root package name */
    public final vm.a f60409c = new vm.a(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f60413h = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public t f60416a;

        /* renamed from: b, reason: collision with root package name */
        public io.bidmachine.iab.vast.b f60417b;

        /* renamed from: c, reason: collision with root package name */
        public VastView f60418c;

        /* renamed from: d, reason: collision with root package name */
        public io.bidmachine.iab.vast.f f60419d;

        /* renamed from: e, reason: collision with root package name */
        public sm.c f60420e;

        /* renamed from: f, reason: collision with root package name */
        public sm.b f60421f;

        public qm.b display(Context context) {
            t tVar = this.f60416a;
            if (tVar == null) {
                io.bidmachine.iab.vast.e.e("VastActivity", "VastRequest is null", new Object[0]);
                return qm.b.internal("VastRequest is null");
            }
            try {
                v.store(tVar);
                Intent intent = new Intent(context, (Class<?>) VastActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra("vast_request_id", this.f60416a.getId());
                io.bidmachine.iab.vast.b bVar = this.f60417b;
                if (bVar != null) {
                    VastActivity.f60404k.put(this.f60416a.getId(), new WeakReference(bVar));
                }
                VastView vastView = this.f60418c;
                if (vastView != null) {
                    VastActivity.f60405l.put(this.f60416a.getId(), new WeakReference(vastView));
                }
                if (this.f60419d != null) {
                    VastActivity.f60406m = new WeakReference(this.f60419d);
                } else {
                    VastActivity.f60406m = null;
                }
                if (this.f60420e != null) {
                    VastActivity.f60407n = new WeakReference(this.f60420e);
                } else {
                    VastActivity.f60407n = null;
                }
                if (this.f60421f != null) {
                    VastActivity.f60408o = new WeakReference(this.f60421f);
                } else {
                    VastActivity.f60408o = null;
                }
                context.startActivity(intent);
                return null;
            } catch (Throwable th2) {
                io.bidmachine.iab.vast.e.e("VastActivity", th2);
                VastActivity.f60404k.remove(this.f60416a.getId());
                VastActivity.f60405l.remove(this.f60416a.getId());
                VastActivity.f60406m = null;
                VastActivity.f60407n = null;
                VastActivity.f60408o = null;
                return qm.b.throwable("Exception during displaying VastActivity", th2);
            }
        }

        public a setAdMeasurer(sm.c cVar) {
            this.f60420e = cVar;
            return this;
        }

        public a setListener(io.bidmachine.iab.vast.b bVar) {
            this.f60417b = bVar;
            return this;
        }

        public a setPlaybackListener(io.bidmachine.iab.vast.f fVar) {
            this.f60419d = fVar;
            return this;
        }

        public a setPostBannerAdMeasurer(sm.b bVar) {
            this.f60421f = bVar;
            return this;
        }

        public a setRequest(t tVar) {
            this.f60416a = tVar;
            return this;
        }

        public a setVastView(VastView vastView) {
            this.f60418c = vastView;
            return this;
        }
    }

    @Override // io.bidmachine.rendering.internal.a
    public final void a() throws IllegalStateException {
        VastView vastView = this.f60411f;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    public final void b(int i10) {
        setRequestedOrientation(i10 == 1 ? 7 : i10 == 2 ? 6 : 4);
    }

    public final void c(t tVar, boolean z10) {
        io.bidmachine.iab.vast.b bVar = this.f60412g;
        if (bVar != null && !this.f60415j) {
            ((lm.d) bVar).onVastDismiss(this, tVar, z10);
        }
        this.f60415j = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            io.bidmachine.iab.vast.e.e("VastActivity", e10.getMessage(), new Object[0]);
        }
        if (tVar != null) {
            b(tVar.getRequestedOrientation());
        }
        n.finishActivityWithoutAnimation(this);
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        io.bidmachine.iab.vast.b bVar;
        Integer numValueOf;
        super.onCreate(bundle);
        this.f60410e = v.get(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        t tVar = this.f60410e;
        VastView vastView = null;
        if (tVar == null) {
            qm.b bVarInternal = qm.b.internal("VastRequest is null");
            io.bidmachine.iab.vast.b bVar2 = this.f60412g;
            if (bVar2 != null) {
                ((lm.d) bVar2).onVastShowFailed(null, bVarInternal);
            }
            c(null, false);
            return;
        }
        if (bundle == null) {
            int forceOrientation = tVar.getForceOrientation();
            if (forceOrientation > -1) {
                numValueOf = Integer.valueOf(forceOrientation);
            } else {
                int preferredVideoOrientation = tVar.getPreferredVideoOrientation();
                numValueOf = (preferredVideoOrientation == 0 || preferredVideoOrientation == getResources().getConfiguration().orientation) ? null : Integer.valueOf(preferredVideoOrientation);
            }
            if (numValueOf != null) {
                b(numValueOf.intValue());
                try {
                    if ((getPackageManager().getActivityInfo(getComponentName(), C.DEFAULT_BUFFER_SEGMENT_SIZE).configChanges & 128) == 0) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        t tVar2 = this.f60410e;
        String id2 = tVar2.getId();
        ConcurrentHashMap concurrentHashMap = f60404k;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(id2);
        if (weakReference == null || weakReference.get() == null) {
            concurrentHashMap.remove(tVar2.getId());
            bVar = null;
        } else {
            bVar = (io.bidmachine.iab.vast.b) weakReference.get();
        }
        this.f60412g = bVar;
        t tVar3 = this.f60410e;
        String id3 = tVar3.getId();
        ConcurrentHashMap concurrentHashMap2 = f60405l;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap2.get(id3);
        if (weakReference2 == null || weakReference2.get() == null) {
            concurrentHashMap2.remove(tVar3.getId());
        } else {
            vastView = (VastView) weakReference2.get();
        }
        this.f60411f = vastView;
        if (vastView == null) {
            this.f60413h = true;
            this.f60411f = new VastView(this);
        }
        this.f60411f.setId(1);
        this.f60411f.setListener(this.f60409c);
        WeakReference weakReference3 = f60406m;
        if (weakReference3 != null) {
            this.f60411f.setPlaybackListener((io.bidmachine.iab.vast.f) weakReference3.get());
        }
        WeakReference weakReference4 = f60407n;
        if (weakReference4 != null) {
            this.f60411f.setAdMeasurer((sm.c) weakReference4.get());
        }
        WeakReference weakReference5 = f60408o;
        if (weakReference5 != null) {
            this.f60411f.setPostBannerAdMeasurer((sm.b) weakReference5.get());
        }
        if (bundle != null && bundle.getBoolean("isLoadPerformed")) {
            VastView vastView2 = this.f60411f;
            h0.applyFullscreenActivityFlags(this);
            h0.removeFromParent(vastView2);
            setContentView(vastView2);
            h0.applyWindowInsets(this);
            return;
        }
        this.f60414i = true;
        if (this.f60411f.display(this.f60410e, Boolean.TRUE)) {
            VastView vastView3 = this.f60411f;
            h0.applyFullscreenActivityFlags(this);
            h0.removeFromParent(vastView3);
            setContentView(vastView3);
            h0.applyWindowInsets(this);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        t tVar;
        VastView vastView;
        super.onDestroy();
        if (isChangingConfigurations() || (tVar = this.f60410e) == null) {
            return;
        }
        VastView vastView2 = this.f60411f;
        c(tVar, vastView2 != null && vastView2.isFinished());
        if (this.f60413h && (vastView = this.f60411f) != null) {
            vastView.destroy();
        }
        f60404k.remove(this.f60410e.getId());
        f60405l.remove(this.f60410e.getId());
        f60406m = null;
        f60407n = null;
        f60408o = null;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f60414i);
        bundle.putBoolean("isFinishedPerformed", this.f60415j);
    }
}
