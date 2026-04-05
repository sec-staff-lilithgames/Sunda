package com.fyber.inneractive.sdk.flow.nativead.trackers;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.m;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public w0 f23749a;

    /* renamed from: b, reason: collision with root package name */
    public b f23750b;

    public a(w0 w0Var) {
        this.f23749a = w0Var;
    }

    public final void a(c cVar) {
        Iterator it = this.f23749a.f23942w.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("%sHitting URL: %s", IAlog.a(this), str);
                z0.b(str);
            }
        }
        b bVar = new b(this.f23749a.f23943x, cVar);
        this.f23750b = bVar;
        if (bVar.f23755d == null || bVar.f23754c == null) {
            IAlog.b("%sWas destroyed, create a new instance", b.f23751e);
        } else {
            bVar.a();
        }
    }

    public final void a() {
        b bVar = this.f23750b;
        if (bVar != null) {
            IAlog.a("%sDestroy called", b.f23751e);
            Handler handler = bVar.f23755d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                bVar.f23755d = null;
            }
            m mVar = bVar.f23754c;
            if (mVar != null) {
                v.a(mVar);
                mVar.destroy();
                bVar.f23754c = null;
            }
            bVar.f23753b = null;
            this.f23750b = null;
        }
        this.f23749a = null;
    }
}
