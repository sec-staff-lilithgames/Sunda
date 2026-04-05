package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.Ob;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ob {

    /* renamed from: a, reason: collision with root package name */
    public C3041vb f32095a;

    /* renamed from: b, reason: collision with root package name */
    public BillingClient f32096b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f32097c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final C3092yb f32098d = new C3092yb();

    /* renamed from: e, reason: collision with root package name */
    public final int f32099e = 2;

    public static final void a(BillingResult billingResult, List list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
    }

    public static final void b(BillingResult billingResult, List list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new y3.f(7)).build();
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        } catch (NoClassDefFoundError e11) {
            Y5 y53 = Y5.f32563a;
            C2796h2 event = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return null;
        }
    }

    public final void a(Context context, C3041vb onComplete) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.f32095a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new Ab((short) 2236), (C3092yb) null);
                return;
            }
            BillingClient billingClient = (BillingClient) (sv.k0.startsWith$default(string, "6", false, 2, null) ? new Lb(this) : sv.k0.startsWith$default(string, com.ironsource.Hc.f34588e, false, 2, null) ? new Mb(this) : new Nb(this)).invoke(context);
            if (billingClient == null) {
                a(new Ab((short) 2233), (C3092yb) null);
                return;
            }
            this.f32096b = billingClient;
            Kb onComplete2 = new Kb(this);
            kotlin.jvm.internal.e0.checkNotNullParameter(onComplete2, "onComplete");
            BillingClient billingClient2 = this.f32096b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new Ib(this, onComplete2));
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            a(new Ab((short) 2237), (C3092yb) null);
        }
    }

    public static final void b(Ob this$0, kv.l onComplete, BillingResult billingResult, List purchasesResult) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
        kotlin.jvm.internal.e0.checkNotNullParameter(purchasesResult, "purchasesResult");
        C3092yb c3092yb = this$0.f32098d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3092yb.f33609b = arrayList.size();
        C2925od.a(new zk.o(onComplete, this$0, 2));
    }

    public static final void b(kv.l onComplete, Ob this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        onComplete.invoke(this$0.f32098d);
    }

    public final void a(Db db2, C3092yb c3092yb) {
        Eb.a(db2);
        C3041vb c3041vb = this.f32095a;
        if (c3041vb != null) {
            c3041vb.invoke(c3092yb);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new y3.f(6)).build();
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            return null;
        } catch (NoClassDefFoundError e11) {
            Y5 y53 = Y5.f32563a;
            C2796h2 event = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            return null;
        }
    }

    public final void a(final Jb onComplete) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.f32096b;
        if (billingClient != null) {
            final int i10 = 0;
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener(this) { // from class: zk.w

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ob f98199c;

                {
                    this.f98199c = this;
                }

                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    switch (i10) {
                        case 0:
                            Ob.a(this.f98199c, onComplete, billingResult, list);
                            break;
                        default:
                            Ob.b(this.f98199c, onComplete, billingResult, list);
                            break;
                    }
                }
            });
        }
        BillingClient billingClient2 = this.f32096b;
        if (billingClient2 != null) {
            final int i11 = 1;
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener(this) { // from class: zk.w

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Ob f98199c;

                {
                    this.f98199c = this;
                }

                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    switch (i11) {
                        case 0:
                            Ob.a(this.f98199c, onComplete, billingResult, list);
                            break;
                        default:
                            Ob.b(this.f98199c, onComplete, billingResult, list);
                            break;
                    }
                }
            });
        }
    }

    public static final void a(Ob this$0, kv.l onComplete, BillingResult billingResult, List purchasesResult) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(billingResult, "<anonymous parameter 0>");
        kotlin.jvm.internal.e0.checkNotNullParameter(purchasesResult, "purchasesResult");
        C3092yb c3092yb = this$0.f32098d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c3092yb.f33608a = arrayList.size();
        C2925od.a(new zk.o(onComplete, this$0, 1));
    }

    public static final void a(kv.l onComplete, Ob this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        onComplete.invoke(this$0.f32098d);
    }
}
