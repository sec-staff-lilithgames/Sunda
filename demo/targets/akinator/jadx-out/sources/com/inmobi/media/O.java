package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f32081a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32082b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32083c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f32084d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32085e;

    /* renamed from: f, reason: collision with root package name */
    public F5 f32086f;

    public O(WeakReference adUnitEventListener, String adtype, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adtype, "adtype");
        this.f32081a = adUnitEventListener;
        this.f32082b = adtype;
        this.f32083c = z10;
        this.f32084d = new AtomicBoolean(false);
        this.f32085e = String.valueOf(kotlin.jvm.internal.c1.getOrCreateKotlinClass(O.class).getSimpleName());
    }

    public final void a(C3078xe c3078xe) {
        C3095ye c3095ye;
        AtomicBoolean atomicBoolean;
        if (!this.f32084d.getAndSet(true)) {
            C3009td c3009td = C3009td.f33390a;
            String str = this.f32082b;
            Boolean boolValueOf = Boolean.valueOf(this.f32083c);
            c3009td.getClass();
            C3009td.a(str, boolValueOf);
            H0 h02 = (H0) this.f32081a.get();
            if (h02 != null) {
                h02.a(c3078xe);
            } else if (c3078xe != null) {
                c3078xe.c();
            }
            F5 f52 = this.f32086f;
            if (f52 != null) {
                ((G5) f52).a(this.f32085e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            F5 f53 = this.f32086f;
            if (f53 != null) {
                ((G5) f53).b();
                return;
            }
            return;
        }
        F5 f54 = this.f32086f;
        if (f54 != null) {
            ((G5) f54).c(this.f32085e, "skipping as Impression is already Called");
        }
        if (c3078xe != null) {
            W0 w02 = c3078xe.f33582a;
            if (w02 == null || (c3095ye = w02.f32416b) == null || (atomicBoolean = c3095ye.f33665a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c3078xe.a();
                linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c3078xe.f33585d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                C2926oe c2926oe = C2926oe.f33217a;
                C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
            }
        }
    }
}
