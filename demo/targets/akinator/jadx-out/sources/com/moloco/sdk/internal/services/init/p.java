package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.MetricsRequest$SDKInitFailureTrackingRequest;
import com.moloco.sdk.MetricsRequest$SDKInitSuccessTrackingRequest;
import com.moloco.sdk.MetricsRequest$SDKInitTrackingRequest;
import com.moloco.sdk.ba;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.q9;
import com.moloco.sdk.r9;
import com.moloco.sdk.u9;
import com.moloco.sdk.x9;
import io.ktor.http.ContentType;
import kotlin.jvm.internal.e0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f47150a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e f47151b;

    public p(String endpoint, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e httpRequestClient) {
        e0.checkNotNullParameter(endpoint, "endpoint");
        e0.checkNotNullParameter(httpRequestClient, "httpRequestClient");
        this.f47150a = endpoint;
        this.f47151b = httpRequestClient;
    }

    @Override // com.moloco.sdk.internal.services.init.n
    public Object a(long j10, zu.d<? super x0> dVar) {
        MolocoLogger molocoLogger;
        x0 x0Var = x0.f87415a;
        String str = this.f47150a;
        try {
            molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "Reporting InitTracking success", false, 4, null);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifySuccess post request", e10, false, 8, null);
        }
        if (str.length() == 0) {
            MolocoLogger.debug$default(molocoLogger, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return x0Var;
        }
        Uri uriBuild = Uri.parse(str).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = this.f47151b;
        String string = uriBuild.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a(eVar, string, a(j10), ContentType.Application.INSTANCE.getProtoBuf(), null, 8, null);
        return x0Var;
    }

    @Override // com.moloco.sdk.internal.services.init.n
    public Object a(j jVar, long j10, zu.d<? super x0> dVar) {
        x0 x0Var = x0.f87415a;
        String str = this.f47150a;
        try {
            if (jVar instanceof j.a) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking client failure: " + ((j.a) jVar).a(), false, 4, null);
            } else {
                if (!(jVar instanceof j.b)) {
                    throw new t();
                }
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking server failure: " + ((j.b) jVar).a(), false, 4, null);
            }
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifyFailure post request", e10, false, 8, null);
        }
        if (str.length() == 0) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "SDK InitTracking disabled", false, 4, null);
            return x0Var;
        }
        Uri uriBuild = Uri.parse(str).buildUpon().build();
        byte[] bArrA = a(jVar, j10);
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = this.f47151b;
        String string = uriBuild.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.a(eVar, string, bArrA, ContentType.Application.INSTANCE.getProtoBuf(), null, 8, null);
        return x0Var;
    }

    public final byte[] a(long j10) {
        ba baVarNewBuilder = MetricsRequest$SDKInitTrackingRequest.newBuilder();
        baVarNewBuilder.setLatencyMs(j10);
        baVarNewBuilder.setSuccess((MetricsRequest$SDKInitSuccessTrackingRequest) MetricsRequest$SDKInitSuccessTrackingRequest.newBuilder().build());
        byte[] byteArray = ((MetricsRequest$SDKInitTrackingRequest) baVarNewBuilder.build()).toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final byte[] a(j jVar, long j10) {
        ba baVarNewBuilder = MetricsRequest$SDKInitTrackingRequest.newBuilder();
        q9 q9VarNewBuilder = MetricsRequest$SDKInitFailureTrackingRequest.newBuilder();
        if (jVar instanceof j.a) {
            r9 r9VarNewBuilder = MetricsRequest$SDKInitFailureTrackingRequest.ClientError.newBuilder();
            r9VarNewBuilder.setClientFailureType(a(((j.a) jVar).a()));
            q9VarNewBuilder.setClientError((MetricsRequest$SDKInitFailureTrackingRequest.ClientError) r9VarNewBuilder.build());
        } else if (jVar instanceof j.b) {
            x9 x9VarNewBuilder = MetricsRequest$SDKInitFailureTrackingRequest.ServerError.newBuilder();
            x9VarNewBuilder.setServerHttpStatus(((j.b) jVar).a());
            q9VarNewBuilder.setServerError((MetricsRequest$SDKInitFailureTrackingRequest.ServerError) x9VarNewBuilder.build());
        } else {
            throw new t();
        }
        baVarNewBuilder.setFailure((MetricsRequest$SDKInitFailureTrackingRequest) q9VarNewBuilder.build());
        baVarNewBuilder.setLatencyMs(j10);
        byte[] byteArray = ((MetricsRequest$SDKInitTrackingRequest) baVarNewBuilder.build()).toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final u9 a(b bVar) {
        switch (o.f47149a[bVar.ordinal()]) {
            case 1:
                return u9.UNKNOWN;
            case 2:
                return u9.HTTP_REQUEST_TIMEOUT;
            case 3:
                return u9.HTTP_UKNOWN_HOST;
            case 4:
                return u9.HTTP_SOCKET;
            case 5:
                return u9.HTTP_SSL_ERROR;
            case 6:
                return u9.ANDROID_WORK_MANAGER_ISSUE;
            default:
                throw new t();
        }
    }
}
