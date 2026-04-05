package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f23549a;

    public d0(h0 h0Var) {
        this.f23549a = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        h0 h0Var = this.f23549a;
        h0Var.f23658m.set(true);
        Iterator it = h0Var.f23652g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        h0Var.f23652g.clear();
        h0Var.a((x) null);
        h0Var.f23647b = null;
        h0Var.a();
        InneractiveAdSpotManager.get().removeSpot(h0Var);
    }
}
