package com.fyber.inneractive.sdk.dv.handler;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends QueryInfoGenerationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23439a;

    public b(c cVar) {
        this.f23439a = cVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) throws JSONException {
        c cVar = this.f23439a;
        e eVar = cVar.f23441b;
        if (eVar.f23445b) {
            return;
        }
        AdFormat adFormat = cVar.f23440a;
        IAlog.a(a.b.k("Firing Event 1000 - Fetch error DV - msg  ", str), new Object[0]);
        w wVar = new w(t.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        wVar.f24329f.put(new x().a(str, PglCryptUtils.KEY_MESSAGE).a(e.b(), "version").a(adFormat.name(), "adFormat").a(Integer.valueOf(eVar.f23447d), "success_count").f24331a);
        wVar.a((String) null);
        this.f23439a.f23441b.f23445b = true;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        IAlog.a("DVHanlder - %s - put query: %s", this.f23439a.f23440a.toString(), queryInfo.getQuery());
        synchronized (this.f23439a.f23441b.f23446c) {
            c cVar = this.f23439a;
            e eVar = cVar.f23441b;
            eVar.f23447d++;
            eVar.f23444a.put(cVar.f23440a, queryInfo);
        }
    }
}
