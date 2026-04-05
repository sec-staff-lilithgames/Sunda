package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2837ja {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32974a;

    /* renamed from: b, reason: collision with root package name */
    public final F5 f32975b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32976c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32977d;

    /* renamed from: e, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f32978e;

    public C2837ja(Context context, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f32974a = context;
        this.f32975b = f52;
        this.f32976c = "";
        LinkedHashMap linkedHashMap = Q2.f32149a;
        SignalsConfig.NovatiqConfig novatiqConfig = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getNovatiqConfig();
        this.f32978e = novatiqConfig;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (novatiqConfig.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            String str = networkOperatorName != null ? networkOperatorName : "";
            List<String> carrierNames = novatiqConfig.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                Iterator<T> it = carrierNames.iterator();
                while (it.hasNext()) {
                    if (sv.n0.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                        try {
                            Context context2 = this.f32974a;
                            kotlin.jvm.internal.e0.checkNotNullParameter(context2, "context");
                            String str2 = sv.k0.replace$default(context2.getPackageManager().getApplicationLabel(context2.getApplicationInfo()).toString(), ' ', '_', false, 4, (Object) null) + "_app";
                            this.f32977d = true;
                            StringBuilder sb2 = new StringBuilder();
                            Random random = new Random();
                            for (int i10 = 0; i10 < 40; i10++) {
                                char cCharAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i10);
                                if (cCharAt == 'x') {
                                    sb2.append(Character.forDigit(random.nextInt(16), 16));
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            String string = sb2.toString();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                            this.f32976c = string;
                            new C2871la(new C2854ka(string, str2, this.f32978e), this.f32975b).a(new C2821ia(this));
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            }
        }
        F5 f53 = this.f32975b;
        if (f53 != null) {
            ((G5) f53).a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
