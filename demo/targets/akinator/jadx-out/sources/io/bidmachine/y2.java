package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import io.bidmachine.protobuf.InitResponse;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62052b;

    /* renamed from: c, reason: collision with root package name */
    public final w2 f62053c;

    /* renamed from: d, reason: collision with root package name */
    public s2 f62054d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f62055e;

    /* renamed from: f, reason: collision with root package name */
    public final v2 f62056f;

    public y2(Context context, String str, w2 w2Var) {
        x2 x2Var = new x2(this);
        this.f62054d = null;
        this.f62055e = new Object();
        SessionManager sessionManager = SessionManager.get();
        this.f62051a = context;
        this.f62052b = str;
        this.f62053c = w2Var;
        this.f62056f = new v2(this, sessionManager.getSessionId());
        sessionManager.addObserver(x2Var);
    }

    public final void a() {
        synchronized (this.f62055e) {
            try {
                s2 s2Var = this.f62054d;
                if (s2Var == null) {
                    return;
                }
                s2Var.f62012g = null;
                this.f62054d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f62055e) {
            a();
            s2 s2Var = new s2(this.f62051a, this.f62052b, UrlProvider.getInitUrlQueue());
            this.f62054d = s2Var;
            s2Var.f62012g = this.f62056f;
            s2Var.f62008c.eventStart(TrackEventType.InitLoading, null);
            nm.j.onBackgroundThread(new r2(s2Var));
        }
    }

    public final void c() {
        InitResponse from;
        w2 w2Var = this.f62053c;
        Objects.requireNonNull(w2Var);
        Context context = this.f62051a;
        SharedPreferences sharedPreferencesE = jh.i.E(context);
        try {
            from = InitResponse.parseFrom(Base64.decode(sharedPreferencesE.getString("initData", null), 0));
        } catch (Exception unused) {
            pr.m.remove(sharedPreferencesE, "initData");
            from = null;
        }
        String strOptString = pr.m.optString(jh.i.E(context), "init_data_session_id", null);
        if (strOptString == null) {
            strOptString = "";
        }
        if (from != null) {
            ((l1) w2Var).onLoadFromStoreSuccess(new u2(from, strOptString));
        }
    }
}
