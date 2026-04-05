package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.v0;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public v0 f23172a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23173b;

    /* renamed from: c, reason: collision with root package name */
    public f f23174c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f23175d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g f23176e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23177f = false;

    public g(f fVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.f23174c = fVar;
        this.f23175d = g1Var;
        this.f23176e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.f23204l;
            this.f23173b = rVar.f23203k;
            this.f23172a = rVar.f23202j;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && IAConfigManager.O.E.n() && (v0Var = this.f23172a) != null && v0Var.f26969l;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f23177f = true;
        this.f23174c = null;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) throws JSONException {
        d0 d0Var;
        v0 v0Var = this.f23172a;
        if (v0Var != null) {
            boolean z10 = this.f23173b;
            if (v0Var.C) {
                g0 g0Var = g0.FAILED;
                IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
                context.getClass();
                d0Var = new d0(g0Var, illegalStateException);
            } else {
                v0Var.C = true;
                try {
                    context.getClass();
                } catch (Throwable unused) {
                }
                v0Var.D = true;
                if (v0Var.f26967j.equals("invalid_task_id") && !v0Var.f26983z) {
                    v0Var.f26961d = z10 ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
                }
                v0Var.B = z10;
                if (v0Var.A) {
                    v0Var.d("onInstallationSuccess();");
                } else if (!v0Var.f26983z) {
                    String str = v0Var.f26960c;
                    PackageInfo packageInfo = !TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.o.f26796a.getPackageManager().getPackageInfo(str, 0) : null;
                    if (packageInfo != null) {
                        v0Var.d("onInstallationSuccess();");
                    } else if (z10) {
                        v0Var.f26959b.a(v0Var.f26960c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f26963f, v0Var.f26961d, v0Var.f26965h.f23897a));
                        v0Var.d("onShowInstallStarted();");
                    }
                }
                try {
                    InternalStoreWebpageActivity.startActivity(context, v0Var.f26962e);
                    d0Var = new d0(g0.OPENED_INTERNAL_STORE, null);
                } catch (ActivityNotFoundException e10) {
                    d0Var = new d0(g0.FAILED, e10);
                }
            }
            Throwable th2 = d0Var.f26770b;
            if (th2 == null) {
                IAConfigManager.O.f23224s.a(new h1(new e(this, list, uri), uri.toString()));
                return new b(uri.toString(), q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
            }
            if (list != null) {
                list.add(new j(this.f23172a.f26968k, false, q.OPEN_INTERNAL_STORE, th2.toString()));
            }
            return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
        }
        return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
    }
}
