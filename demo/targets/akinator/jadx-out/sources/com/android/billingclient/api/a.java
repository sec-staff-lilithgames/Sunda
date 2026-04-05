package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import be.nVUQ.UupKET;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzky;
import com.google.android.gms.internal.play_billing.zzlb;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.vungle.ads.internal.protos.Sdk;
import cv.BLca.YsiBvdpw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class a extends BillingClient {
    public boolean A;
    public final PendingPurchasesParams B;
    public final boolean C;
    public ExecutorService D;
    public volatile zzev E;
    public final Long F;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12693a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f12694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12695c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f12696d;

    /* renamed from: e, reason: collision with root package name */
    public volatile z f12697e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f12698f;

    /* renamed from: g, reason: collision with root package name */
    public final u f12699g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.zzan f12700h;

    /* renamed from: i, reason: collision with root package name */
    public volatile e f12701i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12702j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12703k;

    /* renamed from: l, reason: collision with root package name */
    public int f12704l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12705m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12706n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12707o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12708p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12709q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12710r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12711s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12712t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12713u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12714v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12715w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12716x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12717y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12718z;

    public a(Context context) {
        this.f12693a = new Object();
        this.f12694b = 0;
        this.f12696d = new Handler(Looper.getMainLooper());
        this.f12704l = 0;
        long jNextLong = new Random().nextLong();
        this.F = Long.valueOf(jNextLong);
        String strD = d();
        this.f12695c = strD;
        this.f12698f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strD);
        zzksVarZzc.zzn(this.f12698f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f12699g = new u(this.f12698f, (zzku) zzksVarZzc.zzf());
        this.f12698f.getPackageName();
    }

    public static Future a(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static String d() {
        try {
            return (String) j8.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    public final void A(AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 16, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
    }

    public final void B(int i10, int i11, Exception exc) {
        zzjz zzjzVar;
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "showInAppMessages error.", exc);
        String strZza = zzcg.zza(exc);
        try {
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(i10);
            zzkeVarZzc.zzo(i11);
            if (strZza != null) {
                zzkeVarZzc.zza(strZza);
            }
            zzjx zzjxVarZzc = zzjz.zzc();
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(30);
            zzjzVar = (zzjz) zzjxVarZzc.zzf();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", th2);
            zzjzVar = null;
        }
        this.f12699g.zza(zzjzVar);
    }

    public final void C(int i10, int i11, BillingResult billingResult) {
        try {
            f(zzcg.zzb(i10, i11, billingResult));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void D(int i10, int i11, BillingResult billingResult, String str) {
        try {
            f(zzcg.zzc(i10, i11, billingResult, str));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(int i10) {
        try {
            g(zzcg.zzd(i10));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void F(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return;
        }
        this.f12696d.post(new Runnable() { // from class: com.android.billingclient.api.zzp
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingResult billingResult2 = billingResult;
                if (aVar.f12697e.f12796b != null) {
                    aVar.f12697e.f12796b.onPurchasesUpdated(billingResult2, null);
                } else {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    @Override // com.android.billingclient.api.BillingClient
    public void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 3, billingResult);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
            return;
        }
        if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid purchase token.");
            BillingResult billingResult2 = t.f12769j;
            C(26, 3, billingResult2);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult2);
            return;
        }
        if (!this.f12707o) {
            BillingResult billingResult3 = t.f12761b;
            C(27, 3, billingResult3);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult3);
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                AcknowledgePurchaseParams acknowledgePurchaseParams2 = acknowledgePurchaseParams;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.q(acknowledgePurchaseResponseListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                    } else {
                        String packageName = aVar.f12698f.getPackageName();
                        String purchaseToken = acknowledgePurchaseParams2.getPurchaseToken();
                        String str = aVar.f12695c;
                        long jLongValue = aVar.F.longValue();
                        Bundle bundle = new Bundle();
                        com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, jLongValue);
                        Bundle bundleZzd = zzanVar.zzd(9, packageName, purchaseToken, bundle);
                        acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(t.a(com.google.android.gms.internal.play_billing.zze.zzb(bundleZzd, "BillingClient"), com.google.android.gms.internal.play_billing.zze.zzh(bundleZzd, "BillingClient")));
                    }
                } catch (DeadObjectException e10) {
                    aVar.q(acknowledgePurchaseResponseListener2, t.f12772m, 28, e10);
                } catch (Exception e11) {
                    aVar.q(acknowledgePurchaseResponseListener2, t.f12770k, 28, e11);
                }
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener2 = acknowledgePurchaseResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = t.f12773n;
                aVar.C(24, 3, billingResult4);
                acknowledgePurchaseResponseListener2.onAcknowledgePurchaseResponse(billingResult4);
            }
        }, w(), e()) == null) {
            BillingResult billingResultB = b();
            C(25, 3, billingResultB);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResultB);
        }
    }

    public final BillingResult b() {
        int[] iArr = {0, 3};
        synchronized (this.f12693a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f12694b == iArr[i10]) {
                    return t.f12772m;
                }
            }
            return t.f12770k;
        }
    }

    public final void c() {
        if (TextUtils.isEmpty(null)) {
            this.f12698f.getPackageName();
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 4, billingResult);
            consumeResponseListener.onConsumeResponse(billingResult, consumeParams.getPurchaseToken());
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzag
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                Exception exc;
                DeadObjectException deadObjectException;
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                String str;
                int iZza;
                String strZzh;
                a aVar = this.zza;
                ConsumeParams consumeParams2 = consumeParams;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                aVar.getClass();
                String str2 = "Error consuming purchase with token. Response code: ";
                String purchaseToken = consumeParams2.getPurchaseToken();
                try {
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Consuming purchase with token: " + purchaseToken);
                    try {
                        synchronized (aVar.f12693a) {
                            try {
                                zzanVar = aVar.f12700h;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        if (zzanVar == null) {
                            try {
                                str2 = purchaseToken;
                                try {
                                    aVar.s(consumeResponseListener2, str2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    aVar.s(consumeResponseListener2, str2, t.f12772m, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    aVar.s(consumeResponseListener2, str2, t.f12770k, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            } catch (DeadObjectException e12) {
                                e = e12;
                                str = purchaseToken;
                                deadObjectException = e;
                                str2 = str;
                                aVar.s(consumeResponseListener2, str2, t.f12772m, 29, "Error consuming purchase!", deadObjectException);
                                return null;
                            } catch (Exception e13) {
                                e = e13;
                                str = purchaseToken;
                                exc = e;
                                str2 = str;
                                aVar.s(consumeResponseListener2, str2, t.f12770k, 29, "Error consuming purchase!", exc);
                                return null;
                            }
                        }
                        str = purchaseToken;
                        try {
                            if (aVar.f12707o) {
                                try {
                                    String packageName = aVar.f12698f.getPackageName();
                                    boolean z10 = aVar.f12707o;
                                    String str3 = aVar.f12695c;
                                    long jLongValue = aVar.F.longValue();
                                    Bundle bundle = new Bundle();
                                    if (z10) {
                                        com.google.android.gms.internal.play_billing.zze.zzc(bundle, str3, jLongValue);
                                    }
                                    Bundle bundleZze = zzanVar.zze(9, packageName, str, bundle);
                                    iZza = bundleZze.getInt("RESPONSE_CODE");
                                    strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZze, "BillingClient");
                                } catch (DeadObjectException e14) {
                                    e = e14;
                                    deadObjectException = e;
                                    str2 = str;
                                    aVar.s(consumeResponseListener2, str2, t.f12772m, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e15) {
                                    e = e15;
                                    exc = e;
                                    str2 = str;
                                    aVar.s(consumeResponseListener2, str2, t.f12770k, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            } else {
                                iZza = zzanVar.zza(3, aVar.f12698f.getPackageName(), str);
                                strZzh = "";
                            }
                            BillingResult billingResultA = t.a(iZza, strZzh);
                            if (iZza == 0) {
                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Successfully consumed purchase.");
                                consumeResponseListener2.onConsumeResponse(billingResultA, str);
                                return null;
                            }
                            aVar.s(consumeResponseListener2, str, billingResultA, 23, "Error consuming purchase with token. Response code: " + iZza, null);
                            return null;
                        } catch (DeadObjectException e16) {
                            e = e16;
                            str2 = str;
                            deadObjectException = e;
                            aVar.s(consumeResponseListener2, str2, t.f12772m, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e17) {
                            e = e17;
                            str2 = str;
                            exc = e;
                            aVar.s(consumeResponseListener2, str2, t.f12770k, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e18) {
                        e = e18;
                    } catch (Exception e19) {
                        e = e19;
                    }
                } catch (DeadObjectException e20) {
                    e = e20;
                    str2 = purchaseToken;
                } catch (Exception e21) {
                    e = e21;
                    str2 = purchaseToken;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzah
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ConsumeResponseListener consumeResponseListener2 = consumeResponseListener;
                ConsumeParams consumeParams2 = consumeParams;
                aVar.getClass();
                BillingResult billingResult2 = t.f12773n;
                aVar.C(24, 4, billingResult2);
                consumeResponseListener2.onConsumeResponse(billingResult2, consumeParams2.getPurchaseToken());
            }
        }, w(), e()) == null) {
            BillingResult billingResultB = b();
            C(25, 4, billingResultB);
            consumeResponseListener.onConsumeResponse(billingResultB, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            t(alternativeBillingOnlyReportingDetailsListener, t.f12772m, 2, null);
            return;
        }
        if (!this.f12717y) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            t(alternativeBillingOnlyReportingDetailsListener, t.E, 66, null);
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.t(alternativeBillingOnlyReportingDetailsListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzm(21, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new f(alternativeBillingOnlyReportingDetailsListener2, aVar.f12699g, aVar.f12704l));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.t(alternativeBillingOnlyReportingDetailsListener2, t.f12772m, 70, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.t(alternativeBillingOnlyReportingDetailsListener2, t.f12770k, 70, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzy
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener2 = alternativeBillingOnlyReportingDetailsListener;
                aVar.getClass();
                aVar.t(alternativeBillingOnlyReportingDetailsListener2, t.f12773n, 24, null);
            }
        }, w(), e()) == null) {
            t(alternativeBillingOnlyReportingDetailsListener, b(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            u(externalOfferReportingDetailsListener, t.f12772m, 2, null);
            return;
        }
        if (!this.f12718z) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            u(externalOfferReportingDetailsListener, t.f12783x, 103, null);
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.u(externalOfferReportingDetailsListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzn(22, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new g(externalOfferReportingDetailsListener2, aVar.f12699g, aVar.f12704l));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.u(externalOfferReportingDetailsListener2, t.f12772m, 94, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.u(externalOfferReportingDetailsListener2, t.f12770k, 94, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener2 = externalOfferReportingDetailsListener;
                aVar.getClass();
                aVar.u(externalOfferReportingDetailsListener2, t.f12773n, 24, null);
            }
        }, w(), e()) == null) {
            u(externalOfferReportingDetailsListener, b(), 25, null);
        }
    }

    public final synchronized ExecutorService e() {
        try {
            if (this.D == null) {
                this.D = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zze.zza, new b());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void endConnection() {
        /*
            r5 = this;
            r0 = 12
            r5.E(r0)
            java.lang.Object r0 = r5.f12693a
            monitor-enter(r0)
            com.android.billingclient.api.z r1 = r5.f12697e     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L23
            com.android.billingclient.api.z r1 = r5.f12697e     // Catch: java.lang.Throwable -> L1b
            com.android.billingclient.api.zzm r2 = r1.f12799e     // Catch: java.lang.Throwable -> L1b
            android.content.Context r3 = r1.f12795a     // Catch: java.lang.Throwable -> L1b
            r2.zzc(r3)     // Catch: java.lang.Throwable -> L1b
            com.android.billingclient.api.zzm r1 = r1.f12800f     // Catch: java.lang.Throwable -> L1b
            r1.zzc(r3)     // Catch: java.lang.Throwable -> L1b
            goto L23
        L1b:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while shutting down broadcast manager while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r2, r3, r1)     // Catch: java.lang.Throwable -> L4c
        L23:
            java.lang.String r1 = "BillingClient"
            java.lang.String r2 = "Unbinding from service."
            com.google.android.gms.internal.play_billing.zze.zzk(r1, r2)     // Catch: java.lang.Throwable -> L2e
            r5.k()     // Catch: java.lang.Throwable -> L2e
            goto L36
        L2e:
            r1 = move-exception
            java.lang.String r2 = "BillingClient"
            java.lang.String r3 = "There was an exception while unbinding from the service while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r2, r3, r1)     // Catch: java.lang.Throwable -> L4c
        L36:
            r1 = 3
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L50
            java.util.concurrent.ExecutorService r2 = r5.D     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L44
            r2.shutdownNow()     // Catch: java.lang.Throwable -> L46
            r2 = 0
            r5.D = r2     // Catch: java.lang.Throwable -> L46
            r5.E = r2     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            goto L48
        L46:
            r2 = move-exception
            goto L4e
        L48:
            r5.j(r1)     // Catch: java.lang.Throwable -> L4c
            goto L59
        L4c:
            r1 = move-exception
            goto L60
        L4e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r2     // Catch: java.lang.Throwable -> L50
        L50:
            r2 = move-exception
            java.lang.String r3 = "BillingClient"
            java.lang.String r4 = "There was an exception while shutting down the executor service while ending connection!"
            com.google.android.gms.internal.play_billing.zze.zzm(r3, r4, r2)     // Catch: java.lang.Throwable -> L5b
            goto L48
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            return
        L5b:
            r2 = move-exception
            r5.j(r1)     // Catch: java.lang.Throwable -> L4c
            throw r2     // Catch: java.lang.Throwable -> L4c
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.endConnection():void");
    }

    public final void f(zzjz zzjzVar) {
        try {
            this.f12699g.zzb(zzjzVar, this.f12704l);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    public final void g(zzkd zzkdVar) {
        try {
            this.f12699g.zzd(zzkdVar, this.f12704l);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, final BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Service disconnected.");
            BillingResult billingResult = t.f12772m;
            C(2, 13, billingResult);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        if (!this.f12714v) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support get billing config.");
            BillingResult billingResult2 = t.A;
            C(32, 13, billingResult2);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
            return;
        }
        if (a(new Callable() { // from class: com.android.billingclient.api.zzv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.z(billingConfigResponseListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    String packageName = aVar.f12698f.getPackageName();
                    String str = aVar.f12695c;
                    long jLongValue = aVar.F.longValue();
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.zze.zzc(bundle, str, jLongValue);
                    zzanVar.zzp(18, packageName, bundle, new i(billingConfigResponseListener2, aVar.f12699g, aVar.f12704l));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.z(billingConfigResponseListener2, t.f12772m, 62, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.z(billingConfigResponseListener2, t.f12770k, 62, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzw
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                BillingConfigResponseListener billingConfigResponseListener2 = billingConfigResponseListener;
                aVar.getClass();
                BillingResult billingResult3 = t.f12773n;
                aVar.C(24, 13, billingResult3);
                billingConfigResponseListener2.onBillingConfigResponse(billingResult3, null);
            }
        }, w(), e()) == null) {
            BillingResult billingResultB = b();
            C(25, 13, billingResultB);
            billingConfigResponseListener.onBillingConfigResponse(billingResultB, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        int i10;
        synchronized (this.f12693a) {
            i10 = this.f12694b;
        }
        return i10;
    }

    public final void h(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 11, billingResult);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResult, null);
        } else if (a(new d(this, str, purchaseHistoryResponseListener), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                PurchaseHistoryResponseListener purchaseHistoryResponseListener2 = purchaseHistoryResponseListener;
                aVar.getClass();
                BillingResult billingResult2 = t.f12773n;
                aVar.C(24, 11, billingResult2);
                purchaseHistoryResponseListener2.onPurchaseHistoryResponse(billingResult2, null);
            }
        }, w(), e()) == null) {
            BillingResult billingResultB = b();
            C(25, 11, billingResultB);
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(billingResultB, null);
        }
    }

    public final void i(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 9, billingResult);
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzco.zzl());
        } else {
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please provide a valid product type.");
                BillingResult billingResult2 = t.f12767h;
                C(50, 9, billingResult2);
                purchasesResponseListener.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            if (a(new c(this, str, purchasesResponseListener), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzac
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    PurchasesResponseListener purchasesResponseListener2 = purchasesResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = t.f12773n;
                    aVar.C(24, 9, billingResult3);
                    purchasesResponseListener2.onQueryPurchasesResponse(billingResult3, com.google.android.gms.internal.play_billing.zzco.zzl());
                }
            }, w(), e()) == null) {
                BillingResult billingResultB = b();
                C(25, 9, billingResultB);
                purchasesResponseListener.onQueryPurchasesResponse(billingResultB, com.google.android.gms.internal.play_billing.zzco.zzl());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            r(alternativeBillingOnlyAvailabilityListener, t.f12772m, 2, null);
            return;
        }
        if (!this.f12717y) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support alternative billing only.");
            r(alternativeBillingOnlyAvailabilityListener, t.E, 66, null);
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.r(alternativeBillingOnlyAvailabilityListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzr(21, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new k(alternativeBillingOnlyAvailabilityListener2, aVar.f12699g, aVar.f12704l));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.r(alternativeBillingOnlyAvailabilityListener2, t.f12772m, 69, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.r(alternativeBillingOnlyAvailabilityListener2, t.f12770k, 69, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener2 = alternativeBillingOnlyAvailabilityListener;
                aVar.getClass();
                aVar.r(alternativeBillingOnlyAvailabilityListener2, t.f12773n, 24, null);
            }
        }, w(), e()) == null) {
            r(alternativeBillingOnlyAvailabilityListener, b(), 25, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            v(externalOfferAvailabilityListener, t.f12772m, 2, null);
            return;
        }
        if (!this.f12718z) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current client doesn't support external offer.");
            v(externalOfferAvailabilityListener, t.f12783x, 103, null);
        } else if (a(new Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.v(externalOfferAvailabilityListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzs(22, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new l(externalOfferAvailabilityListener2, aVar.f12699g, aVar.f12704l));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.v(externalOfferAvailabilityListener2, t.f12772m, 91, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.v(externalOfferAvailabilityListener2, t.f12770k, 91, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ExternalOfferAvailabilityListener externalOfferAvailabilityListener2 = externalOfferAvailabilityListener;
                aVar.getClass();
                aVar.v(externalOfferAvailabilityListener2, t.f12773n, 24, null);
            }
        }, w(), e()) == null) {
            v(externalOfferAvailabilityListener, b(), 25, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            if (billingResult.getResponseCode() != 0) {
                C(2, 5, billingResult);
                return billingResult;
            }
            E(5);
            return billingResult;
        }
        BillingResult billingResult2 = t.f12760a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    BillingResult billingResult3 = this.f12703k ? t.f12771l : t.f12775p;
                    p(10, 3, billingResult3);
                    return billingResult3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    BillingResult billingResult4 = this.f12711s ? t.f12771l : t.f12778s;
                    p(31, 6, billingResult4);
                    return billingResult4;
                }
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    BillingResult billingResult5 = this.f12709q ? t.f12771l : t.f12782w;
                    p(30, 5, billingResult5);
                    return billingResult5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    BillingResult billingResult6 = this.f12712t ? t.f12771l : t.f12779t;
                    p(19, 8, billingResult6);
                    return billingResult6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    BillingResult billingResult7 = this.f12710r ? t.f12771l : t.f12780u;
                    p(21, 7, billingResult7);
                    return billingResult7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    BillingResult billingResult8 = this.f12712t ? t.f12771l : t.f12779t;
                    p(61, 9, billingResult8);
                    return billingResult8;
                }
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    BillingResult billingResult9 = this.f12713u ? t.f12771l : t.f12781v;
                    p(20, 10, billingResult9);
                    return billingResult9;
                }
                break;
            case 102279:
                if (str.equals(BillingClient.FeatureType.BILLING_CONFIG)) {
                    BillingResult billingResult10 = this.f12714v ? t.f12771l : t.A;
                    p(32, 11, billingResult10);
                    return billingResult10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    BillingResult billingResult11 = this.f12714v ? t.f12771l : t.B;
                    p(33, 12, billingResult11);
                    return billingResult11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    BillingResult billingResult12 = this.f12716x ? t.f12771l : t.D;
                    p(60, 13, billingResult12);
                    return billingResult12;
                }
                break;
            case 105258:
                if (str.equals(BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    BillingResult billingResult13 = this.f12717y ? t.f12771l : t.E;
                    p(66, 14, billingResult13);
                    return billingResult13;
                }
                break;
            case 106251:
                if (str.equals(BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    BillingResult billingResult14 = this.f12718z ? t.f12771l : t.f12783x;
                    p(103, 18, billingResult14);
                    return billingResult14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    BillingResult billingResult15 = this.A ? t.f12771l : t.f12784y;
                    p(116, 19, billingResult15);
                    return billingResult15;
                }
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    BillingResult billingResult16 = this.f12706n ? t.f12771l : t.f12777r;
                    p(35, 4, billingResult16);
                    return billingResult16;
                }
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    BillingResult billingResult17 = this.f12702j ? t.f12771l : t.f12774o;
                    p(9, 2, billingResult17);
                    return billingResult17;
                }
                break;
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unsupported feature: ".concat(str));
        BillingResult billingResult18 = t.f12785z;
        p(34, 1, billingResult18);
        return billingResult18;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        boolean z10;
        synchronized (this.f12693a) {
            try {
                z10 = false;
                if (this.f12694b == 2 && this.f12700h != null && this.f12701i != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final void j(int i10) {
        synchronized (this.f12693a) {
            try {
                if (this.f12694b == 3) {
                    return;
                }
                int i11 = this.f12694b;
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Setting clientState from " + (i11 != 0 ? i11 != 1 ? i11 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f12694b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        synchronized (this.f12693a) {
            if (this.f12701i != null) {
                try {
                    this.f12698f.unbindService(this.f12701i);
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f12700h = null;
                        this.f12701i = null;
                    } finally {
                        this.f12700h = null;
                        this.f12701i = null;
                    }
                }
            }
        }
    }

    public final n l(BillingResult billingResult, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        D(i10, 7, billingResult, zzcg.zza(exc));
        return new n(billingResult.getResponseCode(), billingResult.getDebugMessage(), new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x065d A[Catch: Exception -> 0x0669, CancellationException -> 0x066c, TimeoutException -> 0x066f, TRY_ENTER, TryCatch #6 {CancellationException -> 0x066c, TimeoutException -> 0x066f, Exception -> 0x0669, blocks: (B:252:0x065d, B:260:0x0672, B:262:0x0687, B:286:0x0711, B:285:0x06ff, B:275:0x06dc, B:288:0x0718), top: B:307:0x065b }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0672 A[Catch: Exception -> 0x0669, CancellationException -> 0x066c, TimeoutException -> 0x066f, TryCatch #6 {CancellationException -> 0x066c, TimeoutException -> 0x066f, Exception -> 0x0669, blocks: (B:252:0x065d, B:260:0x0672, B:262:0x0687, B:286:0x0711, B:285:0x06ff, B:275:0x06dc, B:288:0x0718), top: B:307:0x065b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity r33, final com.android.billingclient.api.BillingFlowParams r34) {
        /*
            Method dump skipped, instructions count: 1909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.launchBillingFlow(android.app.Activity, com.android.billingclient.api.BillingFlowParams):com.android.billingclient.api.BillingResult");
    }

    public final androidx.localbroadcastmanager.content.b m(BillingResult billingResult, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        D(i10, 11, billingResult, zzcg.zza(exc));
        return new androidx.localbroadcastmanager.content.b(billingResult, (ArrayList) null);
    }

    public final zzcv n(BillingResult billingResult, int i10, String str, Exception exc) {
        D(i10, 9, billingResult, zzcg.zza(exc));
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        return new zzcv(billingResult, null);
    }

    public final y o(BillingResult billingResult, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str, exc);
        D(i10, 8, billingResult, zzcg.zza(exc));
        return new y(billingResult.getResponseCode(), billingResult.getDebugMessage(), null);
    }

    public final void p(int i10, int i11, BillingResult billingResult) {
        zzkd zzkdVar = null;
        zzjz zzjzVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i12 = zzcg.zza;
            try {
                zzkb zzkbVarZzc = zzkd.zzc();
                zzkbVarZzc.zzn(5);
                zzky zzkyVarZzc = zzlb.zzc();
                zzkyVarZzc.zza(i11);
                zzkbVarZzc.zza((zzlb) zzkyVarZzc.zzf());
                zzkdVar = (zzkd) zzkbVarZzc.zzf();
            } catch (Exception e10) {
                com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e10);
            }
            g(zzkdVar);
            return;
        }
        int i13 = zzcg.zza;
        try {
            zzjx zzjxVarZzc = zzjz.zzc();
            zzke zzkeVarZzc = zzki.zzc();
            zzkeVarZzc.zzn(billingResult.getResponseCode());
            zzkeVarZzc.zzm(billingResult.getDebugMessage());
            zzkeVarZzc.zzo(i10);
            zzjxVarZzc.zza(zzkeVarZzc);
            zzjxVarZzc.zzn(5);
            zzky zzkyVarZzc2 = zzlb.zzc();
            zzkyVarZzc2.zza(i11);
            zzjxVarZzc.zzm((zzlb) zzkyVarZzc2.zzf());
            zzjzVar = (zzjz) zzjxVarZzc.zzf();
        } catch (Exception e11) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to create logging payload", e11);
        }
        f(zzjzVar);
    }

    public final void q(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener, BillingResult billingResult, int i10, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Error in acknowledge purchase!", exc);
        D(i10, 3, billingResult, zzcg.zza(exc));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(billingResult);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 7, billingResult);
            productDetailsResponseListener.onProductDetailsResponse(billingResult, new ArrayList());
        } else {
            if (!this.f12713u) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Querying product details is not supported.");
                BillingResult billingResult2 = t.f12781v;
                C(20, 7, billingResult2);
                productDetailsResponseListener.onProductDetailsResponse(billingResult2, new ArrayList());
                return;
            }
            if (a(new Callable() { // from class: com.android.billingclient.api.zzam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    n nVar;
                    com.google.android.gms.internal.play_billing.zzan zzanVar;
                    a aVar = this.zza;
                    QueryProductDetailsParams queryProductDetailsParams2 = queryProductDetailsParams;
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    String strZzb = queryProductDetailsParams2.zzb();
                    com.google.android.gms.internal.play_billing.zzco zzcoVarZza = queryProductDetailsParams2.zza();
                    int size = zzcoVarZza.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            nVar = new n(0, "", arrayList);
                            break;
                        }
                        int i11 = i10 + 20;
                        ArrayList arrayList2 = new ArrayList(zzcoVarZza.subList(i10, i11 > size ? size : i11));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i12)).zza());
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", aVar.f12695c);
                        try {
                            synchronized (aVar.f12693a) {
                                zzanVar = aVar.f12700h;
                            }
                            if (zzanVar == null) {
                                nVar = aVar.l(t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null.", null);
                                break;
                            }
                            int i13 = true != aVar.f12716x ? 17 : 20;
                            String packageName = aVar.f12698f.getPackageName();
                            boolean z10 = aVar.f12715w && aVar.B.f12613a;
                            String str = aVar.f12695c;
                            aVar.c();
                            aVar.c();
                            aVar.c();
                            aVar.c();
                            int i14 = size;
                            long jLongValue = aVar.F.longValue();
                            Bundle bundle2 = new Bundle();
                            com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str, jLongValue);
                            bundle2.putBoolean("enablePendingPurchases", true);
                            bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            if (z10) {
                                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                            }
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            com.google.android.gms.internal.play_billing.zzco zzcoVar = zzcoVarZza;
                            int i15 = 0;
                            boolean z11 = false;
                            boolean z12 = false;
                            while (i15 < size3) {
                                QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList2.get(i15);
                                com.google.android.gms.internal.play_billing.zzan zzanVar2 = zzanVar;
                                arrayList4.add(null);
                                z12 |= !TextUtils.isEmpty(null);
                                String strZzb2 = product.zzb();
                                int i16 = i15;
                                if (strZzb2.equals("first_party")) {
                                    zzbe.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    arrayList5.add(null);
                                    z11 = true;
                                }
                                i15 = i16 + 1;
                                zzanVar = zzanVar2;
                            }
                            com.google.android.gms.internal.play_billing.zzan zzanVar3 = zzanVar;
                            if (z12) {
                                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            if (z11 && !TextUtils.isEmpty(null)) {
                                bundle2.putString("accountName", null);
                            }
                            Bundle bundleZzl = zzanVar3.zzl(i13, packageName, strZzb, bundle, bundle2);
                            if (bundleZzl == null) {
                                nVar = aVar.l(t.C, 44, "queryProductDetailsAsync got empty product details response.", null);
                                break;
                            }
                            if (bundleZzl.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    nVar = aVar.l(t.C, 46, "queryProductDetailsAsync got null response list", null);
                                    break;
                                }
                                for (int i17 = 0; i17 < stringArrayList.size(); i17++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i17));
                                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e10) {
                                        nVar = aVar.l(t.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                    }
                                }
                                i10 = i11;
                                size = i14;
                                zzcoVarZza = zzcoVar;
                            } else {
                                int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundleZzl, "BillingClient");
                                String strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZzl, "BillingClient");
                                nVar = iZzb != 0 ? aVar.l(t.a(iZzb, strZzh), 23, a.b.e(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : aVar.l(t.a(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                            }
                        } catch (DeadObjectException e11) {
                            nVar = aVar.l(t.f12772m, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
                        } catch (Exception e12) {
                            nVar = aVar.l(t.f12770k, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
                        }
                    }
                    productDetailsResponseListener.onProductDetailsResponse(t.a(nVar.f12750a, (String) nVar.f12752c), (ArrayList) nVar.f12751b);
                    return null;
                }
            }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.zza;
                    ProductDetailsResponseListener productDetailsResponseListener2 = productDetailsResponseListener;
                    aVar.getClass();
                    BillingResult billingResult3 = t.f12773n;
                    aVar.C(24, 7, billingResult3);
                    productDetailsResponseListener2.onProductDetailsResponse(billingResult3, new ArrayList());
                }
            }, w(), e()) == null) {
                BillingResult billingResultB = b();
                C(25, 7, billingResultB);
                productDetailsResponseListener.onProductDetailsResponse(billingResultB, new ArrayList());
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        i(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 8, billingResult);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. SKU type can't be empty.");
            BillingResult billingResult2 = t.f12766g;
            C(49, 8, billingResult2);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult2, null);
            return;
        }
        if (skusList == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            BillingResult billingResult3 = t.f12765f;
            C(48, 8, billingResult3);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResult3, null);
            return;
        }
        final String str = null;
        if (a(new Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzz
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                int i10;
                Bundle bundleZzk;
                a aVar = this.zza;
                String str2 = this.zzb;
                List list = this.zzc;
                aVar.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        yVar = new y(0, "", arrayList);
                        break;
                    }
                    int i12 = i11 + 20;
                    ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i11, i12 > size ? size : i12));
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
                    bundle.putString("playBillingLibraryVersion", aVar.f12695c);
                    try {
                        synchronized (aVar.f12693a) {
                            zzanVar = aVar.f12700h;
                        }
                        if (zzanVar == null) {
                            yVar = aVar.o(t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "Service has been reset to null.", null);
                            break;
                        }
                        if (aVar.f12708p) {
                            String packageName = aVar.f12698f.getPackageName();
                            int i13 = aVar.f12704l;
                            aVar.B.getClass();
                            boolean z10 = aVar.f12715w && aVar.B.f12613a;
                            String str3 = aVar.f12695c;
                            i10 = i12;
                            long jLongValue = aVar.F.longValue();
                            boolean z11 = z10;
                            Bundle bundle2 = new Bundle();
                            if (i13 >= 9) {
                                com.google.android.gms.internal.play_billing.zze.zzc(bundle2, str3, jLongValue);
                            }
                            if (i13 >= 9) {
                                bundle2.putBoolean("enablePendingPurchases", true);
                            }
                            if (z11) {
                                bundle2.putBoolean(UupKET.ShyhGK, true);
                            }
                            bundleZzk = zzanVar.zzl(10, packageName, str2, bundle, bundle2);
                        } else {
                            i10 = i12;
                            bundleZzk = zzanVar.zzk(3, aVar.f12698f.getPackageName(), str2, bundle);
                        }
                        if (bundleZzk == null) {
                            yVar = aVar.o(t.C, 44, "querySkuDetailsAsync got null sku details list", null);
                            break;
                        }
                        if (bundleZzk.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                yVar = aVar.o(t.C, 46, "querySkuDetailsAsync got null response list", null);
                                break;
                            }
                            for (int i14 = 0; i14 < stringArrayList.size(); i14++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i14));
                                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList.add(skuDetails);
                                } catch (JSONException e10) {
                                    yVar = aVar.o(t.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e10);
                                }
                            }
                            i11 = i10;
                        } else {
                            int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundleZzk, "BillingClient");
                            String strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundleZzk, "BillingClient");
                            yVar = iZzb != 0 ? aVar.o(t.a(iZzb, strZzh), 23, a.b.e(iZzb, "getSkuDetails() failed. Response code: "), null) : aVar.o(t.a(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                        }
                    } catch (DeadObjectException e11) {
                        yVar = aVar.o(t.f12772m, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e11);
                    } catch (Exception e12) {
                        yVar = aVar.o(t.f12770k, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e12);
                    }
                }
                this.zzd.onSkuDetailsResponse(t.a(yVar.zza(), yVar.zzb()), yVar.zzc());
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzab
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                SkuDetailsResponseListener skuDetailsResponseListener2 = skuDetailsResponseListener;
                aVar.getClass();
                BillingResult billingResult4 = t.f12773n;
                aVar.C(24, 8, billingResult4);
                skuDetailsResponseListener2.onSkuDetailsResponse(billingResult4, null);
            }
        }, w(), e()) == null) {
            BillingResult billingResultB = b();
            C(25, 8, billingResultB);
            skuDetailsResponseListener.onSkuDetailsResponse(billingResultB, null);
        }
    }

    public final void r(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 14, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
    }

    public final void s(ConsumeResponseListener consumeResponseListener, String str, BillingResult billingResult, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", str2, exc);
        D(i10, 4, billingResult, zzcg.zza(exc));
        consumeResponseListener.onConsumeResponse(billingResult, str);
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showAlternativeBillingOnlyInformationDialog(final Activity activity, final AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 16, billingResult);
            return billingResult;
        }
        if (!this.f12717y) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            BillingResult billingResult2 = t.E;
            C(66, 16, billingResult2);
            return billingResult2;
        }
        Handler handler = this.f12696d;
        final zzaw zzawVar = new zzaw(this, handler, alternativeBillingOnlyInformationDialogListener);
        if (a(new Callable() { // from class: com.android.billingclient.api.zzr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzawVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.A(alternativeBillingOnlyInformationDialogListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzo(21, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new h(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.A(alternativeBillingOnlyInformationDialogListener2, t.f12772m, 74, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.A(alternativeBillingOnlyInformationDialogListener2, t.f12770k, 74, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzs
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener2 = alternativeBillingOnlyInformationDialogListener;
                aVar.getClass();
                aVar.A(alternativeBillingOnlyInformationDialogListener2, t.f12773n, 24, null);
            }
        }, handler, e()) != null) {
            return t.f12771l;
        }
        BillingResult billingResultB = b();
        C(25, 16, billingResultB);
        return billingResultB;
    }

    @Override // com.android.billingclient.api.BillingClient
    public BillingResult showExternalOfferInformationDialog(final Activity activity, final ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            BillingResult billingResult = t.f12772m;
            C(2, 25, billingResult);
            return billingResult;
        }
        if (!this.f12718z) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Current Play Store version doesn't support external offer.");
            BillingResult billingResult2 = t.f12783x;
            C(103, 25, billingResult2);
            return billingResult2;
        }
        Handler handler = this.f12696d;
        final zzax zzaxVar = new zzax(this, handler, externalOfferInformationDialogListener);
        if (a(new Callable() { // from class: com.android.billingclient.api.zzai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzaxVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.y(externalOfferInformationDialogListener2, t.f12772m, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzq(22, aVar.f12698f.getPackageName(), com.google.android.gms.internal.play_billing.zze.zze(aVar.f12695c, aVar.F.longValue()), new j(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.y(externalOfferInformationDialogListener2, t.f12772m, 98, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.y(externalOfferInformationDialogListener2, t.f12770k, 98, e11);
                    return null;
                }
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.zza;
                ExternalOfferInformationDialogListener externalOfferInformationDialogListener2 = externalOfferInformationDialogListener;
                aVar.getClass();
                aVar.y(externalOfferInformationDialogListener2, t.f12773n, 24, null);
            }
        }, handler, e()) != null) {
            return t.f12771l;
        }
        BillingResult billingResultB = b();
        C(25, 25, billingResultB);
        return billingResultB;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void startConnection(BillingClientStateListener billingClientStateListener) {
        BillingResult billingResultX;
        synchronized (this.f12693a) {
            try {
                if (isReady()) {
                    billingResultX = x();
                } else if (this.f12694b == 1) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    billingResultX = t.f12764e;
                    C(37, 6, billingResultX);
                } else if (this.f12694b == 3) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    billingResultX = t.f12772m;
                    C(38, 6, billingResultX);
                } else {
                    j(1);
                    k();
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f12701i = new e(this, billingClientStateListener);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.f12698f.getPackageManager().queryIntentServices(intent, 0);
                    int i10 = 41;
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        j(0);
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service unavailable on device.");
                        billingResultX = t.f12762c;
                        C(i10, 6, billingResultX);
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i10 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f12695c);
                                synchronized (this.f12693a) {
                                    try {
                                        if (this.f12694b == 2) {
                                            billingResultX = x();
                                        } else if (this.f12694b != 1) {
                                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            billingResultX = t.f12772m;
                                            C(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 6, billingResultX);
                                        } else {
                                            e eVar = this.f12701i;
                                            if (this.f12698f.bindService(intent2, eVar, 1)) {
                                                com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service was bonded successfully.");
                                                billingResultX = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i10 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                        j(0);
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Billing service unavailable on device.");
                        billingResultX = t.f12762c;
                        C(i10, 6, billingResultX);
                    }
                }
            } finally {
            }
        }
        if (billingResultX != null) {
            billingClientStateListener.onBillingSetupFinished(billingResultX);
        }
    }

    public final void t(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 15, billingResult, zzcg.zza(exc));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
    }

    public final void u(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 24, billingResult, zzcg.zza(exc));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
    }

    public final void v(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 23, billingResult, zzcg.zza(exc));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
    }

    public final Handler w() {
        return Looper.myLooper() == null ? this.f12696d : new Handler(Looper.myLooper());
    }

    public final BillingResult x() {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzkbVarZzc = zzkd.zzc();
        zzkbVarZzc.zzn(6);
        zzlv zzlvVarZzc = zzlx.zzc();
        zzlvVarZzc.zza(true);
        zzkbVarZzc.zzm(zzlvVarZzc);
        g((zzkd) zzkbVarZzc.zzf());
        return t.f12771l;
    }

    public final void y(ExternalOfferInformationDialogListener externalOfferInformationDialogListener, BillingResult billingResult, int i10, Exception exc) {
        D(i10, 25, billingResult, zzcg.zza(exc));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(billingResult);
    }

    public final void z(BillingConfigResponseListener billingConfigResponseListener, BillingResult billingResult, int i10, Exception exc) {
        com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "getBillingConfig got an exception.", exc);
        D(i10, 13, billingResult, zzcg.zza(exc));
        billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        h(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        i(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        boolean zIsReady = isReady();
        String str = PcrIk.pwXHMTeKic;
        if (!zIsReady) {
            com.google.android.gms.internal.play_billing.zze.zzl(str, "Service disconnected.");
            return t.f12772m;
        }
        if (!this.f12709q) {
            com.google.android.gms.internal.play_billing.zze.zzl(str, YsiBvdpw.qyFqVSsJwln);
            return t.f12782w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        k3.p.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f12695c);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.f12609a);
        Handler handler = this.f12696d;
        final zzav zzavVar = new zzav(handler, inAppMessageResponseListener);
        a(new Callable() { // from class: com.android.billingclient.api.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.internal.play_billing.zzan zzanVar;
                a aVar = this.zza;
                Bundle bundle2 = bundle;
                Activity activity2 = activity;
                ResultReceiver resultReceiver = zzavVar;
                aVar.getClass();
                try {
                    synchronized (aVar.f12693a) {
                        zzanVar = aVar.f12700h;
                    }
                    if (zzanVar == null) {
                        aVar.B(-1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, null);
                        return null;
                    }
                    zzanVar.zzt(12, aVar.f12698f.getPackageName(), bundle2, new m(new WeakReference(activity2), resultReceiver));
                    return null;
                } catch (DeadObjectException e10) {
                    aVar.B(-1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, e10);
                    return null;
                } catch (Exception e11) {
                    aVar.B(6, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, e11);
                    return null;
                }
            }
        }, 5000L, null, handler, e());
        return t.f12771l;
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context) {
        this.f12693a = new Object();
        this.f12694b = 0;
        this.f12696d = new Handler(Looper.getMainLooper());
        this.f12704l = 0;
        long jNextLong = new Random().nextLong();
        this.F = Long.valueOf(jNextLong);
        this.f12695c = d();
        this.f12698f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(d());
        zzksVarZzc.zzn(this.f12698f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f12699g = new u(this.f12698f, (zzku) zzksVarZzc.zzf());
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f12697e = new z(this.f12698f, null, null, this.f12699g);
        this.B = pendingPurchasesParams;
        this.f12698f.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        String strD = d();
        this.f12693a = new Object();
        this.f12694b = 0;
        this.f12696d = new Handler(Looper.getMainLooper());
        this.f12704l = 0;
        long jNextLong = new Random().nextLong();
        this.F = Long.valueOf(jNextLong);
        this.f12695c = strD;
        this.f12698f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strD);
        zzksVarZzc.zzn(this.f12698f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f12699g = new u(this.f12698f, (zzku) zzksVarZzc.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f12697e = new z(this.f12698f, purchasesUpdatedListener, null, this.f12699g);
        this.B = pendingPurchasesParams;
        this.C = false;
        this.f12698f.getPackageName();
    }

    public a(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        String strD = d();
        this.f12693a = new Object();
        this.f12694b = 0;
        this.f12696d = new Handler(Looper.getMainLooper());
        this.f12704l = 0;
        long jNextLong = new Random().nextLong();
        this.F = Long.valueOf(jNextLong);
        this.f12695c = strD;
        this.f12698f = context.getApplicationContext();
        zzks zzksVarZzc = zzku.zzc();
        zzksVarZzc.zzo(strD);
        zzksVarZzc.zzn(this.f12698f.getPackageName());
        zzksVarZzc.zzm(jNextLong);
        this.f12699g = new u(this.f12698f, (zzku) zzksVarZzc.zzf());
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f12697e = new z(this.f12698f, purchasesUpdatedListener, userChoiceBillingListener, this.f12699g);
        this.B = pendingPurchasesParams;
        this.C = userChoiceBillingListener != null;
    }
}
