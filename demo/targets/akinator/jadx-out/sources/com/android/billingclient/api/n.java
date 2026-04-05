package com.android.billingclient.api;

import java.util.ArrayList;
import p8.a0;
import p8.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f12750a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12751b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12752c;

    public n(int i10, String str, ArrayList arrayList) {
        this.f12750a = i10;
        this.f12752c = str;
        this.f12751b = arrayList;
    }

    public n(c0 c0Var) {
        this.f12752c = k9.h.threadSafe(150, new a0(this));
        this.f12751b = c0Var;
    }

    public n(n nVar, int i10, String str) {
        this.f12751b = nVar;
        this.f12750a = i10;
        this.f12752c = str;
    }
}
