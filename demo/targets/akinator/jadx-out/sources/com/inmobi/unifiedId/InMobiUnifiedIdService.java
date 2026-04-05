package com.inmobi.unifiedId;

import a2.s;
import al.b;
import android.content.Context;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC3024ub;
import com.inmobi.media.AbstractC3035v5;
import com.inmobi.media.C2925od;
import com.inmobi.media.C2926oe;
import com.inmobi.media.EnumC2993se;
import com.inmobi.media.H6;
import com.inmobi.media.I6;
import com.inmobi.media.Q2;
import com.inmobi.media.R4;
import com.inmobi.media.Se;
import com.inmobi.media.W5;
import com.inmobi.media.We;
import com.inmobi.media.Ye;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class InMobiUnifiedIdService {
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f33733a = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.inmobi.unifiedId.InMobiUnifiedIdInterface r14) throws org.json.JSONException {
        /*
            java.lang.String r0 = "InMobiUnifiedIdService"
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            org.json.JSONObject r0 = com.inmobi.media.W5.b()
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "ufids"
            if (r0 != 0) goto L14
            goto L76
        L14:
            boolean r5 = r0.has(r4)     // Catch: org.json.JSONException -> L76
            if (r5 == 0) goto L1f
            org.json.JSONArray r5 = r0.getJSONArray(r4)     // Catch: org.json.JSONException -> L76
            goto L20
        L1f:
            r5 = r3
        L20:
            if (r5 == 0) goto L76
            int r5 = r5.length()
            if (r5 != 0) goto L29
            goto L76
        L29:
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r4)
            boolean r5 = r0.has(r4)     // Catch: org.json.JSONException -> L59
            if (r5 == 0) goto L57
            org.json.JSONArray r5 = r0.getJSONArray(r4)     // Catch: org.json.JSONException -> L59
            int r6 = r5.length()     // Catch: org.json.JSONException -> L59
            r7 = r1
            r8 = r2
        L3c:
            if (r7 >= r6) goto L5d
            org.json.JSONObject r9 = r5.getJSONObject(r7)     // Catch: org.json.JSONException -> L5a
            long r10 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L5a
            java.lang.String r12 = "expiry"
            long r12 = r9.getLong(r12)     // Catch: org.json.JSONException -> L5a
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 > 0) goto L52
            r9 = r2
            goto L53
        L52:
            r9 = r1
        L53:
            r8 = r8 & r9
            int r7 = r7 + 1
            goto L3c
        L57:
            r8 = r2
            goto L5d
        L59:
            r8 = r2
        L5a:
            java.util.Objects.toString(r0)
        L5d:
            if (r8 != 0) goto L76
            org.json.JSONObject r0 = com.inmobi.media.We.f32469a
            if (r14 == 0) goto L68
            java.util.LinkedHashSet r0 = com.inmobi.media.We.f32470b
            r0.add(r14)
        L68:
            boolean r0 = com.inmobi.media.We.b()
            if (r0 == 0) goto L72
            java.util.Objects.toString(r14)
            goto Lbb
        L72:
            com.inmobi.media.We.d()
            goto Lbb
        L76:
            if (r14 == 0) goto Lbb
            if (r0 != 0) goto L7b
            goto L8f
        L7b:
            boolean r5 = r0.has(r4)     // Catch: org.json.JSONException -> L8f
            if (r5 == 0) goto L86
            org.json.JSONArray r4 = r0.getJSONArray(r4)     // Catch: org.json.JSONException -> L8f
            goto L87
        L86:
            r4 = r3
        L87:
            if (r4 == 0) goto L8f
            int r4 = r4.length()
            if (r4 != 0) goto L90
        L8f:
            r1 = r2
        L90:
            if (r1 == 0) goto Lb8
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.unifiedId.InMobiUnifiedIdService.f33733a
            boolean r0 = r0.get()
            if (r0 == 0) goto Lad
            java.util.LinkedHashSet r0 = com.inmobi.media.We.f32470b
            r0.add(r14)
            boolean r0 = com.inmobi.media.We.b()
            if (r0 == 0) goto La9
            java.util.Objects.toString(r14)
            goto Lbb
        La9:
            com.inmobi.media.We.d()
            goto Lbb
        Lad:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Push api needs to called prior to fetch"
            r0.<init>(r1)
            com.inmobi.media.Ye.a(r14, r3, r0)
            goto Lbb
        Lb8:
            com.inmobi.media.Ye.a(r14, r0, r3)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUnifiedIdInterface):void");
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface);
    }

    public static final void fetchUnifiedIds(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (C2925od.q()) {
            C2925od.a(new s(inMobiUnifiedIdInterface, 5));
        } else {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void fetchUnifiedIdsInternal$media_release(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean zBooleanValue;
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        HashMap map = new HashMap();
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("FetchApiInvoked", map, EnumC2993se.f33373a);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        boolean zIsEnabled = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (!zIsEnabled) {
            reset();
        }
        if (!zIsEnabled) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            Ye.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
            return;
        }
        Boolean boolC = Se.f32278a.c();
        boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue2) {
            reset();
        }
        if (zBooleanValue2) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            Ye.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
            return;
        }
        Boolean bool = AbstractC3024ub.f33454b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context contextD = C2925od.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "user_info_store");
                e0.checkNotNullParameter("user_age_restricted", C3191e4.h.W);
                AbstractC3024ub.f33454b = Boolean.valueOf(i6A.f31866a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3024ub.f33454b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            Ye.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
            return;
        }
        synchronized (We.class) {
            try {
                if (We.b()) {
                    if (inMobiUnifiedIdInterface != null) {
                        We.f32470b.add(inMobiUnifiedIdInterface);
                    }
                    if (We.b()) {
                        Objects.toString(inMobiUnifiedIdInterface);
                    } else {
                        We.d();
                    }
                } else {
                    a(inMobiUnifiedIdInterface);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void push(InMobiUserDataModel inMobiUserDataModel) {
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (C2925od.q()) {
            C2925od.a(new s(inMobiUserDataModel, 4));
        } else {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (C2925od.q()) {
            C2925od.a(new b(1));
        } else {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public final AtomicBoolean isPushCalled() {
        return f33733a;
    }

    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final void a(InMobiUserDataModel inMobiUserDataModel) {
        boolean zBooleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        LinkedHashMap linkedHashMap = Q2.f32149a;
        boolean zIsEnabled = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (!zIsEnabled) {
            reset();
        }
        if (!zIsEnabled) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        Boolean boolC = Se.f32278a.c();
        boolean zBooleanValue2 = boolC != null ? boolC.booleanValue() : true;
        if (zBooleanValue2) {
            reset();
        }
        if (zBooleanValue2) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        Boolean bool = AbstractC3024ub.f33454b;
        boolean zAreEqual = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context contextD = C2925od.d();
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A = H6.a(contextD, "user_info_store");
                e0.checkNotNullParameter("user_age_restricted", C3191e4.h.W);
                AbstractC3024ub.f33454b = Boolean.valueOf(i6A.f31866a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3024ub.f33454b;
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (zBooleanValue) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        InMobiUserDataModel inMobiUserDataModel3 = R4.f32200a;
        if (inMobiUserDataModel == null && R4.f32200a == null) {
            zAreEqual = true;
        } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = R4.f32200a) != null) {
            zAreEqual = e0.areEqual(inMobiUserDataModel, inMobiUserDataModel2);
        }
        if (zAreEqual && f33733a.get()) {
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        synchronized (R4.class) {
            Objects.toString(R4.f32200a);
            Objects.toString(inMobiUserDataModel);
            R4.f32200a = inMobiUserDataModel;
        }
        f33733a.set(true);
        We.c();
    }

    public static final void a() {
        e0.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        f33733a.set(false);
        synchronized (R4.class) {
            Objects.toString(R4.f32200a);
            R4.f32200a = null;
        }
        We.e();
        W5.b(null);
        W5.a(null);
        W5.f32440d = false;
        W5.f32439c = false;
    }
}
