package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Bf {

    /* renamed from: a, reason: collision with root package name */
    public static final Bf f33908a = new Bf();

    private Bf() {
    }

    public final void a(int i10) {
        a(D5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i10), null);
    }

    public final void b() {
        a(this, D5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, D5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, D5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    public final void a(String errorReason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorReason, "errorReason");
        a(D5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    public static /* synthetic */ void a(Bf bf2, D5 d52, Integer num, String str, int i10, Object obj) throws JSONException {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        bf2.a(d52, num, str);
    }

    private final void a(D5 d52, Integer num, String str) throws JSONException {
        Kf kf2 = Kf.f34769a;
        JSONObject jSONObjectA = kf2.a(false);
        if (num != null) {
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f37600f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        kf2.a(d52, jSONObjectA);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = Kf.f34769a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f37600f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f37600f));
        }
        return null;
    }
}
