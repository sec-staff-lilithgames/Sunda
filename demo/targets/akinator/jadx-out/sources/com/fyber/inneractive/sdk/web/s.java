package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26952a;

    public s(i0 i0Var) {
        this.f26952a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i0 i0Var = this.f26952a;
            if (i0Var.V != null) {
                IAlog.a("%sunregistering orientation broadcast receiver", IAlog.a(i0Var));
                this.f26952a.V.a();
            }
        } catch (IllegalArgumentException e10) {
            if (e10.getMessage() != null && !e10.getMessage().contains("Receiver not registered")) {
                throw e10;
            }
        }
        this.f26952a.V = null;
    }
}
