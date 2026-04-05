package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.g1;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public d f26301a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26303c = false;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26302b = new ConcurrentHashMap();

    public e(d dVar) {
        this.f26301a = dVar;
    }

    public final void a(String str, String str2, boolean z10) {
        if (!z10) {
            this.f26302b.put(str, str2);
            return;
        }
        d dVar = this.f26301a;
        if (dVar != null) {
            dVar.f26288b.a(str2);
        }
    }

    public final void a(int i10, g1 g1Var) throws JSONException {
        n nVar;
        d dVar = this.f26301a;
        if (dVar == null || (nVar = dVar.f26291e) == null) {
            return;
        }
        ((z) nVar).a(i10, g1Var);
    }
}
