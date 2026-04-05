package com.inmobi.media;

import android.os.Message;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final K2 f32383a;

    /* renamed from: b, reason: collision with root package name */
    public final W2 f32384b;

    /* renamed from: c, reason: collision with root package name */
    public final W2 f32385c;

    public V2(K2 callback, W2 request, W2 w22) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        this.f32383a = callback;
        this.f32384b = request;
        this.f32385c = w22;
    }

    public final boolean a(W2 w22, int i10, LinkedHashMap linkedHashMap) throws InterruptedException {
        if (i10 <= w22.f32430z) {
            Thread.sleep(w22.A * 1000);
            return false;
        }
        Iterator it = w22.f32429y.entrySet().iterator();
        while (it.hasNext()) {
            Y2 response = (Y2) linkedHashMap.get((String) ((Map.Entry) it.next()).getKey());
            if (response != null) {
                K2 k22 = this.f32383a;
                kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
                Message messageObtain = Message.obtain();
                messageObtain.what = 6;
                messageObtain.obj = response;
                k22.sendMessage(messageObtain);
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (InterruptedException unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("V2", "TAG");
        }
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        List list;
        String str;
        W2 mRequest;
        int i10 = 0;
        int i11 = 0;
        do {
            W2 mRequest2 = this.f32384b;
            if (i11 > mRequest2.f32430z) {
                break;
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(mRequest2, "mRequest");
            C2712c3 c2712c3 = new C2712c3(mRequest2, mRequest2.b());
            linkedHashMap = c2712c3.f32704c;
            if (c2712c3.a() && (mRequest = this.f32385c) != null) {
                while (i10 <= mRequest.f32430z) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
                    C2712c3 c2712c32 = new C2712c3(mRequest, mRequest.b());
                    LinkedHashMap linkedHashMap2 = c2712c32.f32704c;
                    if (!c2712c32.a()) {
                        a(mRequest, linkedHashMap2);
                        if (mRequest.f32429y.isEmpty()) {
                            break;
                        }
                        i10++;
                        if (a(mRequest, i10, linkedHashMap2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                K2 k22 = this.f32383a;
                String accountId = mRequest.B;
                kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = accountId;
                k22.sendMessage(messageObtain);
                return;
            }
            if (this.f32384b.C) {
                K2 k23 = this.f32383a;
                Map map = c2712c3.f32702a.f32604f;
                Object ipAddress = (map == null || (list = (List) map.get("cip")) == null || (str = (String) uu.y0.firstOrNull(list)) == null) ? Z2.f32590a : new C2678a3(str);
                kotlin.jvm.internal.e0.checkNotNullParameter(ipAddress, "ipAddress");
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 7;
                messageObtain2.obj = ipAddress;
                k23.sendMessage(messageObtain2);
            }
            a(this.f32384b, linkedHashMap);
            if (this.f32384b.f32429y.isEmpty()) {
                break;
            } else {
                i11++;
            }
        } while (!a(this.f32384b, i11, linkedHashMap));
        K2 k24 = this.f32383a;
        String accountId2 = this.f32384b.B;
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId2, "accountId");
        Message messageObtain3 = Message.obtain();
        messageObtain3.what = 4;
        messageObtain3.obj = accountId2;
        k24.sendMessage(messageObtain3);
    }

    public final void a(W2 w22, LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Y2 response = (Y2) entry.getValue();
            String configType = (String) entry.getKey();
            if (response.f32534c == null) {
                K2 k22 = this.f32383a;
                kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
                Message messageObtain = Message.obtain();
                messageObtain.what = 6;
                messageObtain.obj = response;
                k22.sendMessage(messageObtain);
                w22.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(configType, "configType");
                w22.f32429y.remove(configType);
            }
        }
    }
}
