package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import io.bidmachine.protobuf.InitResponse;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v2 implements t2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f62034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2 f62035b;

    public v2(y2 y2Var, String str) {
        this.f62035b = y2Var;
        this.f62034a = str;
    }

    @Override // io.bidmachine.t2, nm.b
    public void onFail(pr.a aVar) {
        InitResponse from;
        y2 y2Var = this.f62035b;
        w2 w2Var = y2Var.f62053c;
        Objects.requireNonNull(w2Var);
        Context context = y2Var.f62051a;
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
            ((l1) w2Var).onLoadFromRemoteFailed(new u2(from, strOptString));
        }
    }

    @Override // io.bidmachine.t2, nm.b
    public void onSuccess(InitResponse initResponse) {
        String str = this.f62034a;
        y2 y2Var = this.f62035b;
        y2Var.a();
        if (initResponse == null) {
            return;
        }
        Context context = y2Var.f62051a;
        try {
            pr.m.putString(jh.i.E(context), "initData", Base64.encodeToString(initResponse.toByteArray(), 0));
            pr.m.putString(jh.i.E(context), "init_data_session_id", str);
        } catch (Exception unused) {
        }
        ((l1) y2Var.f62053c).onLoadFromRemoteSuccess(new u2(initResponse, str));
    }
}
