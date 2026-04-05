package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f24208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24209c;

    public e(String str, JSONArray jSONArray, long j10) {
        this.f24207a = str;
        this.f24208b = jSONArray;
        this.f24209c = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Event Request: Hitting URL finished: %s, body: %s", this.f24207a, this.f24208b);
        if (exc == null) {
            IAlog.a("Event Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Event Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Event Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f24209c));
    }
}
