package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends a {
    public final Context G;
    public volatile int H;
    public volatile com.google.android.gms.internal.play_billing.zzav I;
    public volatile q J;
    public volatile zzew K;

    public r(Context context) {
        super(context);
        this.H = 0;
        this.G = context;
    }

    public final /* synthetic */ void G(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        super.acknowledgePurchase(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
    }

    public final /* synthetic */ void H(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        super.consumeAsync(consumeParams, consumeResponseListener);
    }

    public final /* synthetic */ void I(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) {
        super.queryProductDetailsAsync(queryProductDetailsParams, productDetailsResponseListener);
    }

    public final /* synthetic */ void J(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListener skuDetailsResponseListener) {
        super.querySkuDetailsAsync(skuDetailsParams, skuDetailsResponseListener);
    }

    public final zzeu K(int i10) {
        if (zzaG()) {
            return com.google.android.gms.internal.play_billing.zzv.zza(new zzbs(this, i10));
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        L(106, 28, t.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    public final void L(int i10, int i11, BillingResult billingResult) {
        zzjz zzjzVarZzb = zzcg.zzb(i10, i11, billingResult);
        Objects.requireNonNull(zzjzVarZzb, "ApiFailure should not be null");
        this.f12699g.zza(zzjzVarZzb);
    }

    public final void M(int i10, Consumer consumer, Runnable runnable) {
        zzew zzewVar;
        zzev zzevVar;
        zzeu zzeuVarK = K(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.K == null) {
                    this.K = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
                }
                zzewVar = this.K;
            } finally {
            }
        }
        zzeu zzeuVarZzb = zzel.zzb(zzeuVarK, 28500L, timeUnit, zzewVar);
        o oVar = new o(this, i10, consumer, runnable);
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = zzfb.zza(e());
                }
                zzevVar = this.E;
            } finally {
            }
        }
        zzel.zzc(zzeuVarZzb, oVar, zzevVar);
    }

    public final /* synthetic */ BillingResult N(Activity activity, BillingFlowParams billingFlowParams) {
        return super.launchBillingFlow(activity, billingFlowParams);
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Objects.requireNonNull(acknowledgePurchaseResponseListener);
        M(3, new Consumer() { // from class: com.android.billingclient.api.zzbv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse((BillingResult) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.G(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        M(4, new Consumer() { // from class: com.android.billingclient.api.zzbq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                consumeResponseListener.onConsumeResponse((BillingResult) obj, consumeParams.getPurchaseToken());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.H(consumeParams, consumeResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void endConnection() {
        synchronized (this) {
            zzkd zzkdVarZzd = zzcg.zzd(27);
            Objects.requireNonNull(zzkdVarZzd, "ApiSuccess should not be null");
            this.f12699g.zzc(zzkdVarZzd);
            try {
                try {
                    if (this.J != null && this.I != null) {
                        com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.G.unbindService(this.J);
                        this.J = new q(this);
                    }
                    this.I = null;
                    if (this.K != null) {
                        this.K.shutdownNow();
                        this.K = null;
                    }
                } catch (RuntimeException e10) {
                    com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
                }
                this.H = 3;
            } catch (Throwable th2) {
                this.H = 3;
                throw th2;
            }
        }
        super.endConnection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final BillingResult launchBillingFlow(final Activity activity, final BillingFlowParams billingFlowParams) {
        Consumer consumer = new Consumer() { // from class: com.android.billingclient.api.zzbx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.zza.F((BillingResult) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzbo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.N(activity, billingFlowParams);
            }
        };
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) K(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            L(114, 28, t.G);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            L(107, 28, t.G);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            BillingResult billingResultA = t.a(iIntValue, "Billing override value was set by a license tester.");
            L(105, 2, billingResultA);
            consumer.accept(billingResultA);
            return billingResultA;
        }
        try {
            return (BillingResult) callable.call();
        } catch (Exception e12) {
            BillingResult billingResult = t.f12770k;
            L(115, 2, billingResult);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An internal error occurred.", e12);
            return billingResult;
        }
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        M(7, new Consumer() { // from class: com.android.billingclient.api.zzbn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                productDetailsResponseListener.onProductDetailsResponse((BillingResult) obj, arrayList);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.I(queryProductDetailsParams, productDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(final SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        M(8, new Consumer() { // from class: com.android.billingclient.api.zzbt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                skuDetailsResponseListener.onSkuDetailsResponse((BillingResult) obj, null);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.J(skuDetailsParams, skuDetailsResponseListener);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        synchronized (this) {
            if (zzaG()) {
                com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                zzkd zzkdVarZzd = zzcg.zzd(26);
                Objects.requireNonNull(zzkdVarZzd, "ApiSuccess should not be null");
                this.f12699g.zzc(zzkdVarZzd);
            } else {
                int i10 = 1;
                if (this.H == 1) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.H == 3) {
                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    L(38, 26, t.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.H = 1;
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.J = new q(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> listQueryIntentServices = this.G.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i10 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.G.bindService(intent2, this.J, 1)) {
                                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    com.google.android.gms.internal.play_billing.zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i10 = 39;
                        }
                    }
                    this.H = 0;
                    com.google.android.gms.internal.play_billing.zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
                    L(i10, 26, t.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.startConnection(billingClientStateListener);
    }

    public final synchronized boolean zzaG() {
        if (this.H == 2 && this.I != null) {
            if (this.J != null) {
                return true;
            }
        }
        return false;
    }

    public r(PendingPurchasesParams pendingPurchasesParams, Context context) {
        super(pendingPurchasesParams, context);
        this.H = 0;
        this.G = context;
    }

    public r(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener);
        this.H = 0;
        this.G = context;
    }

    public r(PendingPurchasesParams pendingPurchasesParams, Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener) {
        super(pendingPurchasesParams, context, purchasesUpdatedListener, userChoiceBillingListener);
        this.H = 0;
        this.G = context;
    }
}
