package com.android.billingclient.api;

import b0.e2;
import com.android.billingclient.api.BillingResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class t {
    public static final BillingResult A;
    public static final BillingResult B;
    public static final BillingResult C;
    public static final BillingResult D;
    public static final BillingResult E;
    public static final BillingResult F;
    public static final BillingResult G;

    /* renamed from: a, reason: collision with root package name */
    public static final BillingResult f12760a = e2.f(3, "Google Play In-app Billing API version is less than 3");

    /* renamed from: b, reason: collision with root package name */
    public static final BillingResult f12761b = e2.f(3, "Google Play In-app Billing API version is less than 9");

    /* renamed from: c, reason: collision with root package name */
    public static final BillingResult f12762c = e2.f(3, "Billing service unavailable on device.");

    /* renamed from: d, reason: collision with root package name */
    public static final BillingResult f12763d = e2.f(2, "Billing service unavailable on device.");

    /* renamed from: e, reason: collision with root package name */
    public static final BillingResult f12764e = e2.f(5, "Client is already in the process of connecting to billing service.");

    /* renamed from: f, reason: collision with root package name */
    public static final BillingResult f12765f = e2.f(5, "The list of SKUs can't be empty.");

    /* renamed from: g, reason: collision with root package name */
    public static final BillingResult f12766g = e2.f(5, "SKU type can't be empty.");

    /* renamed from: h, reason: collision with root package name */
    public static final BillingResult f12767h = e2.f(5, "Product type can't be empty.");

    /* renamed from: i, reason: collision with root package name */
    public static final BillingResult f12768i = e2.f(-2, "Client does not support extra params.");

    /* renamed from: j, reason: collision with root package name */
    public static final BillingResult f12769j = e2.f(5, "Invalid purchase token.");

    /* renamed from: k, reason: collision with root package name */
    public static final BillingResult f12770k = e2.f(6, "An internal error occurred.");

    /* renamed from: l, reason: collision with root package name */
    public static final BillingResult f12771l;

    /* renamed from: m, reason: collision with root package name */
    public static final BillingResult f12772m;

    /* renamed from: n, reason: collision with root package name */
    public static final BillingResult f12773n;

    /* renamed from: o, reason: collision with root package name */
    public static final BillingResult f12774o;

    /* renamed from: p, reason: collision with root package name */
    public static final BillingResult f12775p;

    /* renamed from: q, reason: collision with root package name */
    public static final BillingResult f12776q;

    /* renamed from: r, reason: collision with root package name */
    public static final BillingResult f12777r;

    /* renamed from: s, reason: collision with root package name */
    public static final BillingResult f12778s;

    /* renamed from: t, reason: collision with root package name */
    public static final BillingResult f12779t;

    /* renamed from: u, reason: collision with root package name */
    public static final BillingResult f12780u;

    /* renamed from: v, reason: collision with root package name */
    public static final BillingResult f12781v;

    /* renamed from: w, reason: collision with root package name */
    public static final BillingResult f12782w;

    /* renamed from: x, reason: collision with root package name */
    public static final BillingResult f12783x;

    /* renamed from: y, reason: collision with root package name */
    public static final BillingResult f12784y;

    /* renamed from: z, reason: collision with root package name */
    public static final BillingResult f12785z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(5);
        builderNewBuilder.setDebugMessage("SKU can't be null.");
        builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(0);
        f12771l = builderNewBuilder2.build();
        f12772m = e2.f(-1, "Service connection is disconnected.");
        f12773n = e2.f(2, "Timeout communicating with service.");
        f12774o = e2.f(-2, "Client does not support subscriptions.");
        f12775p = e2.f(-2, "Client does not support subscriptions update.");
        f12776q = e2.f(-2, "Client does not support get purchase history.");
        f12777r = e2.f(-2, "Client does not support price change confirmation.");
        f12778s = e2.f(-2, "Play Store version installed does not support cross selling products.");
        f12779t = e2.f(-2, "Client does not support multi-item purchases.");
        f12780u = e2.f(-2, "Client does not support offer_id_token.");
        f12781v = e2.f(-2, "Client does not support ProductDetails.");
        f12782w = e2.f(-2, "Client does not support in-app messages.");
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(-2);
        builderNewBuilder3.setDebugMessage("Client does not support user choice billing.");
        builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(-2);
        builderNewBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        f12783x = builderNewBuilder4.build();
        f12784y = e2.f(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        f12785z = e2.f(5, "Unknown feature");
        A = e2.f(-2, "Play Store version installed does not support get billing config.");
        B = e2.f(-2, "Query product details with serialized docid is not supported.");
        C = e2.f(4, "Item is unavailable for purchase.");
        D = e2.f(-2, "Query product details with developer specified account is not supported.");
        E = e2.f(-2, "Play Store version installed does not support alternative billing only.");
        F = e2.f(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        G = e2.f(6, "An error occurred while retrieving billing override.");
    }

    public static BillingResult a(int i10, String str) {
        return e2.f(i10, str);
    }
}
