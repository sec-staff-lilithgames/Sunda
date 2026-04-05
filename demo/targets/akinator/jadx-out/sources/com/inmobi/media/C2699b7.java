package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2699b7 extends Re {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f32682d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f32683e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f32684f;

    /* renamed from: g, reason: collision with root package name */
    public short f32685g;

    /* renamed from: h, reason: collision with root package name */
    public String f32686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699b7(U0 adUnit, C2888ma oAManager, byte[] response, F5 f52) {
        super(adUnit, (byte) 3);
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(oAManager, "oAManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        this.f32682d = response;
        this.f32683e = f52;
        this.f32684f = new WeakReference(oAManager);
    }

    @Override // com.inmobi.media.Re
    public final void a(Object obj) {
        A0 a02 = (A0) obj;
        F5 f52 = this.f32683e;
        if (f52 != null) {
            ((G5) f52).c("LoadWithResponseWorker", "onComplete");
        }
        C2888ma c2888ma = (C2888ma) this.f32684f.get();
        if (c2888ma == null) {
            F5 f53 = this.f32683e;
            if (f53 != null) {
                ((G5) f53).b("LoadWithResponseWorker", "oAManager is null");
                return;
            }
            return;
        }
        if (a02 != null) {
            F5 f54 = this.f32683e;
            if (f54 != null) {
                ((G5) f54).c("LoadWithResponseWorker", "loading response");
            }
            c2888ma.f33094a.b(a02);
            return;
        }
        short s10 = this.f32685g;
        if (s10 != 0) {
            HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
            String str = this.f32686h;
            if (str != null) {
                mapHashMapOf.put("reason", str);
            }
            c2888ma.f33094a.b((Map<String, Object>) mapHashMapOf);
        }
        c2888ma.f33094a.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        F5 f55 = this.f32683e;
        if (f55 != null) {
            ((G5) f55).b("LoadWithResponseWorker", "adSet null. fail with error code - " + ((int) this.f32685g));
        }
    }

    @Override // com.inmobi.media.I1
    public final void c() {
        U0 u02;
        super.c();
        F5 f52 = this.f32683e;
        if (f52 != null) {
            ((G5) f52).b("LoadWithResponseWorker", "Encountered OOM");
        }
        C2888ma c2888ma = (C2888ma) this.f32684f.get();
        if (c2888ma == null || (u02 = c2888ma.f33094a) == null) {
            return;
        }
        u02.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.LOW_MEMORY), (short) 2146);
    }

    @Override // com.inmobi.media.I1
    public final void a() throws JSONException {
        String str = QCmNMSGd.OTOflRX;
        F5 f52 = this.f32683e;
        if (f52 != null) {
            ((G5) f52).c("LoadWithResponseWorker", "execute task start");
        }
        C2888ma c2888ma = (C2888ma) this.f32684f.get();
        if (c2888ma == null) {
            F5 f53 = this.f32683e;
            if (f53 != null) {
                ((G5) f53).b("LoadWithResponseWorker", "OAManager null. failing.");
            }
            this.f32685g = (short) 2142;
            b(null);
            return;
        }
        F5 f54 = this.f32683e;
        if (f54 != null) {
            ((G5) f54).a("LoadWithResponseWorker", "getting network response from byte array");
        }
        byte[] value = this.f32682d;
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "response");
        Z9 mResponse = new Z9();
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (value.length == 0) {
            mResponse.f32600b = new byte[0];
        } else {
            byte[] bArr = new byte[value.length];
            mResponse.f32600b = bArr;
            System.arraycopy(value, 0, bArr, 0, value.length);
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(mResponse, "mResponse");
        S9 s92 = mResponse.f32602d;
        if (s92 != null) {
            switch (V.f32380a[s92.f32266a.ordinal()]) {
                case 1:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
                    break;
                case 2:
                    InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID);
                    S9 s93 = mResponse.f32602d;
                    String str2 = s93 != null ? s93.f32267b : null;
                    if (str2 != null) {
                        inMobiAdRequestStatus.setCustomMessage(str2);
                        break;
                    }
                    break;
                case 3:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.SERVER_ERROR);
                    break;
                case 9:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED);
                    break;
                default:
                    new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
                    break;
            }
        }
        try {
            F5 f55 = this.f32683e;
            if (f55 != null) {
                ((G5) f55).a("LoadWithResponseWorker", "start parsing response");
            }
            JSONObject jsonResponse = new JSONObject(mResponse.a());
            long j10 = jsonResponse.getLong("placementId");
            F5 f56 = this.f32683e;
            if (f56 != null) {
                ((G5) f56).e("placementID", String.valueOf(j10));
            }
            F5 f57 = this.f32683e;
            if (f57 != null) {
                ((G5) f57).a("LoadWithResponseWorker", str + j10);
            }
            D0 d0P = c2888ma.f33094a.p();
            d0P.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonResponse, "jsonResponse");
            b(d0P.a(jsonResponse));
        } catch (L e10) {
            this.f32685g = e10.f31981b;
            F5 f58 = this.f32683e;
            if (f58 != null) {
                String strE = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                ((G5) f58).a(strE, "Exception while parsing OAResponse", e10);
            }
            b(null);
        } catch (JSONException e11) {
            this.f32685g = (short) 2145;
            this.f32686h = e11.getMessage();
            F5 f59 = this.f32683e;
            if (f59 != null) {
                String strE2 = U0.e();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                ((G5) f59).a(strE2, "Exception while parsing OAResponse", e11);
            }
            b(null);
        }
    }
}
