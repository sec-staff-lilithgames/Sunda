package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.network.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a, reason: collision with root package name */
    public final InneractiveErrorCode f23498a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23499b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f23500c;

    /* renamed from: d, reason: collision with root package name */
    public Exception f23501d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23502e;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar) {
        this(inneractiveErrorCode, iVar, null);
    }

    public void addReportedError(t tVar) {
        this.f23502e.add(tVar);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23498a);
        if (this.f23500c != null) {
            sb2.append(" : ");
            sb2.append(this.f23500c);
        }
        return sb2.toString();
    }

    public Throwable getCause() {
        Exception exc = this.f23501d;
        return exc == null ? this.f23500c : exc;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f23498a;
    }

    public i getFyberMarketplaceAdLoadFailureReason() {
        return this.f23499b;
    }

    public boolean isErrorAlreadyReported(t tVar) {
        return this.f23502e.contains(tVar);
    }

    public void setCause(Exception exc) {
        this.f23501d = exc;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, i iVar, Throwable th2) {
        this.f23502e = new ArrayList();
        this.f23498a = inneractiveErrorCode;
        this.f23499b = iVar;
        this.f23500c = th2;
    }
}
