package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3078xe {

    /* renamed from: a, reason: collision with root package name */
    public final W0 f33582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33584c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33585d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33586e;

    /* renamed from: f, reason: collision with root package name */
    public String f33587f;

    public C3078xe(W0 w02, String str, String str2, String str3, String markupType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(markupType, "markupType");
        this.f33582a = w02;
        this.f33583b = str;
        this.f33584c = str2;
        this.f33585d = str3;
        this.f33586e = markupType;
    }

    public final LinkedHashMap a() {
        String strM;
        String strQ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        W0 w02 = this.f33582a;
        if (w02 != null && (strQ = w02.f32415a.q()) != null) {
            linkedHashMap.put("adType", strQ);
        }
        W0 w03 = this.f33582a;
        if (w03 != null) {
            linkedHashMap.put("plId", Long.valueOf(w03.f32415a.J().l()));
        }
        W0 w04 = this.f33582a;
        if (w04 != null && (strM = w04.f32415a.J().m()) != null) {
            linkedHashMap.put("plType", strM);
        }
        W0 w05 = this.f33582a;
        String str = null;
        if (w05 != null) {
            A0 a0Z = w05.f32415a.z();
            Boolean boolO = a0Z != null ? a0Z.o() : null;
            if (boolO != null) {
                linkedHashMap.put("isRewarded", boolO);
            }
        }
        String str2 = this.f33584c;
        if (str2 != null) {
            linkedHashMap.put("creativeId", str2);
        }
        String str3 = this.f33583b;
        if (str3 != null) {
            linkedHashMap.put("creativeType", str3);
        }
        linkedHashMap.put("markupType", this.f33586e);
        String str4 = this.f33587f;
        if (str4 != null) {
            str = str4;
        } else {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("triggerSource");
        }
        linkedHashMap.put("trigger", str);
        W0 w06 = this.f33582a;
        if (w06 != null && w06.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f33582a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C3095ye c3095ye;
        AtomicBoolean atomicBoolean;
        W0 w02 = this.f33582a;
        if (w02 == null || (c3095ye = w02.f32416b) == null || (atomicBoolean = c3095ye.f33665a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2180);
            String str = this.f33585d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
        }
    }

    public final void c() {
        C3095ye c3095ye;
        AtomicBoolean atomicBoolean;
        W0 w02 = this.f33582a;
        if (w02 == null || (c3095ye = w02.f32416b) == null || (atomicBoolean = c3095ye.f33665a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.f33585d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
        }
    }

    public final void d() {
        C3095ye c3095ye;
        AtomicBoolean atomicBoolean;
        W0 w02 = this.f33582a;
        if (w02 == null || (c3095ye = w02.f32416b) == null || (atomicBoolean = c3095ye.f33665a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.f33585d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("AdImpressionSuccessful", linkedHashMapA, EnumC2993se.f33373a);
        }
    }
}
