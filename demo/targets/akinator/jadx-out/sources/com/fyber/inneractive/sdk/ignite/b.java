package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23969a;

    public b(h hVar) {
        this.f23969a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) throws JSONException {
        IgniteResponseOuterClass$IgniteResponse igniteResponseOuterClass$IgniteResponse = (IgniteResponseOuterClass$IgniteResponse) obj;
        this.f23969a.getClass();
        if (exc == null && igniteResponseOuterClass$IgniteResponse != null && igniteResponseOuterClass$IgniteResponse.hasClientId() && igniteResponseOuterClass$IgniteResponse.hasClientSecret()) {
            this.f23969a.onCredentialsRequestSuccess(igniteResponseOuterClass$IgniteResponse.getClientId(), igniteResponseOuterClass$IgniteResponse.getClientSecret());
            return;
        }
        String message = "";
        IAlog.a("Failed to fetch ignite client credentials with error: %s", exc != null ? exc.getMessage() : "");
        this.f23969a.getClass();
        if (!(exc instanceof k1) || ((k1) exc).f24236a != 204) {
            this.f23969a.a(j.FAILED_TO_RETRIEVE_CREDENTIALS, exc != null ? exc.getMessage() : null);
        }
        if (exc != null && exc.getMessage() != null) {
            message = exc.getMessage();
        }
        this.f23969a.onCredentialsRequestFailed(message);
    }
}
