package io.odeeo.sdk;

import com.explorestack.protobuf.openrtb.LossReason;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.sdk.AdUnitBase;
import kotlin.jvm.internal.e0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f68081c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f68082d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f68083e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f68084f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f68085g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f68086h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f68087i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f68088j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f68089k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f68090l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f68091m;

    /* renamed from: n, reason: collision with root package name */
    public static final h f68092n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f68093o;

    /* renamed from: p, reason: collision with root package name */
    public static final h f68094p;

    /* renamed from: q, reason: collision with root package name */
    public static final h f68095q;

    /* renamed from: r, reason: collision with root package name */
    public static final h f68096r;

    /* renamed from: s, reason: collision with root package name */
    public static final h f68097s;

    /* renamed from: t, reason: collision with root package name */
    public static final h f68098t;

    /* renamed from: u, reason: collision with root package name */
    public static final h f68099u;

    /* renamed from: v, reason: collision with root package name */
    public static final h f68100v;

    /* renamed from: w, reason: collision with root package name */
    public static final h f68101w;

    /* renamed from: x, reason: collision with root package name */
    public static final h f68102x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h[] f68103y;

    /* renamed from: a, reason: collision with root package name */
    public final AdUnitBase.EventType f68104a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68105b;

    public h(String str, int i10, AdUnitBase.EventType eventType, int i11) {
        this.f68104a = eventType;
        this.f68105b = i11;
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f68081c, f68082d, f68083e, f68084f, f68085g, f68086h, f68087i, f68088j, f68089k, f68090l, f68091m, f68092n, f68093o, f68094p, f68095q, f68096r, f68097s, f68098t, f68099u, f68100v, f68101w, f68102x};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f68103y.clone();
    }

    public final String eventId() {
        return this.f68104a.getValue();
    }

    public final int getCode() {
        return this.f68105b;
    }

    public final AdUnitBase.EventType getEventType() {
        return this.f68104a;
    }

    public final void sendCustomEvent$odeeoSdk_release(AdUnitBase block) {
        e0.checkNotNullParameter(block, "block");
        this.f68104a.sendCustomEvent(block, this.f68105b);
    }

    static {
        AdUnitBase.EventType eventType = AdUnitBase.EventType.INTERNAL_PAUSE;
        f68081c = new h("EVENT_APPLICATION_BACKGROUND", 0, eventType, 200);
        AdUnitBase.EventType eventType2 = AdUnitBase.EventType.INTERNAL_RESUME;
        f68082d = new h("EVENT_APPLICATION_FOREGROUND", 1, eventType2, 201);
        f68083e = new h("EVENT_REWARDED_POPUP_APPEAR", 2, eventType, 202);
        f68084f = new h("EVENT_REWARDED_POPUP_DISAPPEAR", 3, eventType2, 203);
        f68085g = new h(KerkSviMAy.MNLu, 4, eventType, 204);
        f68086h = new h("EVENT_AUDIOSESSION_INTERUPTION_ENDED", 5, eventType2, 205);
        f68087i = new h("EVENT_AUDIOSESSION_PAUSED_BY_CLICK", 6, eventType, 206);
        f68088j = new h("EVENT_AUDIOSESSION_RESUMED_AFTER_CLICK", 7, eventType2, 209);
        f68089k = new h("EVENT_USER_CHANGE_VOLUME_BY_BUTTON", 8, AdUnitBase.EventType.INTERNAL_VOLUME_CHANGE, 210);
        AdUnitBase.EventType eventType3 = AdUnitBase.EventType.INTERNAL_ELIMINATE_AD;
        f68090l = new h("EVENT_DEVELOPER_CLOSED_AD_BY_METHOD", 9, eventType3, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE);
        f68091m = new h("EVENT_DEVELOPER_CLOSED_AD_BY_BUTTON", 10, eventType3, 212);
        f68092n = new h("EVENT_AD_EXPIRED", 11, eventType3, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        f68093o = new h("EVENT_REWARDED_OFFER", 12, AdUnitBase.EventType.REWARDED_OFFER, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
        f68094p = new h("EVENT_AD_NOT_SERVED_DUE_TO_RECT", 13, AdUnitBase.EventType.AD_NOT_SERVED, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
        f68095q = new h("EVENT_INTERNAL_REWARD_GRANTED", 14, AdUnitBase.EventType.INTERNAL_REWARD_GRANTED, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        f68096r = new h("EVENT_INTERNAL_REWARD_REJECTED", 15, AdUnitBase.EventType.INTERNAL_REWARD_REJECTED, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
        f68097s = new h("INTERNAL_AUDIBLE_IMPRESSION", 16, AdUnitBase.EventType.INTERNAL_AUDIBLE_IMPRESSION, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);
        f68098t = new h("EVENT_INTERNAL_CURRENT_VOLUME_LEVEL", 17, AdUnitBase.EventType.INTERNAL_CURRENT_VOLUME_LEVEL, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
        f68099u = new h("EVENT_REWARDED_AD_BEGAN", 18, eventType, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
        f68100v = new h("EVENT_REWARDED_AD_ENDED", 19, eventType2, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        f68101w = new h("EVENT_AD_COVERAGE_BEGAN", 20, eventType, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        f68102x = new h("EVENT_AD_COVERAGE_ENDED", 21, eventType2, 224);
        f68103y = a();
    }
}
