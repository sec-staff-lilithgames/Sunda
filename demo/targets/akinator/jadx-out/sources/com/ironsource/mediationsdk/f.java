package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C3261i2;
import com.ironsource.C3387p2;
import com.ironsource.S1;
import com.ironsource.mediationsdk.e;
import java.net.URL;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    private final C3387p2 f37519a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37520b;

    public f(C3387p2 settings, String sessionId) {
        e0.checkNotNullParameter(settings, "settings");
        e0.checkNotNullParameter(sessionId, "sessionId");
        this.f37519a = settings;
        this.f37520b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    public e.a a(Context context, i auctionRequestParams, S1 auctionListener) throws JSONException {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        e0.checkNotNullParameter(auctionListener, "auctionListener");
        JSONObject jSONObjectA = a(context, auctionRequestParams);
        String strA = this.f37519a.a(auctionRequestParams.s());
        return auctionRequestParams.s() ? new C3261i2(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.f37519a) : new e.a(auctionListener, new URL(strA), jSONObjectA, auctionRequestParams.t(), this.f37519a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f37519a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f37519a.n();
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(iVar);
        e0.checkNotNullExpressionValue(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }
}
