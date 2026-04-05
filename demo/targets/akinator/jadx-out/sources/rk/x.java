package rk;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import ds.k0;
import wr.a6;
import wr.f6;
import wr.h4;
import wr.k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile k4 f84512a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile f6 f84513b;

    public static final a6 bindService(s sVar) {
        return a6.builder(getServiceDescriptor()).addMethod(getFetchEligibleCampaignsMethod(), k0.asyncUnaryCall(new w())).build();
    }

    public static k4 getFetchEligibleCampaignsMethod() {
        k4 k4VarBuild;
        k4 k4Var = f84512a;
        if (k4Var != null) {
            return k4Var;
        }
        synchronized (x.class) {
            try {
                k4VarBuild = f84512a;
                if (k4VarBuild == null) {
                    k4VarBuild = k4.newBuilder().setType(h4.f90954b).setFullMethodName(k4.generateFullMethodName("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns")).setSampledToLocalTracing(true).setRequestMarshaller(cs.d.marshaller(FetchEligibleCampaignsRequest.getDefaultInstance())).setResponseMarshaller(cs.d.marshaller(FetchEligibleCampaignsResponse.getDefaultInstance())).build();
                    f84512a = k4VarBuild;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k4VarBuild;
    }

    public static f6 getServiceDescriptor() {
        f6 f6VarBuild;
        f6 f6Var = f84513b;
        if (f6Var != null) {
            return f6Var;
        }
        synchronized (x.class) {
            try {
                f6VarBuild = f84513b;
                if (f6VarBuild == null) {
                    f6VarBuild = f6.newBuilder("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing").addMethod(getFetchEligibleCampaignsMethod()).build();
                    f84513b = f6VarBuild;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f6VarBuild;
    }

    public static t newBlockingStub(wr.j jVar) {
        return (t) ds.b.newStub(new q(), jVar);
    }

    public static u newFutureStub(wr.j jVar) {
        return (u) ds.c.newStub(new r(), jVar);
    }

    public static v newStub(wr.j jVar) {
        return (v) ds.a.newStub(new p(), jVar);
    }
}
