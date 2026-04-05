package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.util.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface g0 extends com.fyber.inneractive.sdk.ui.controller.c {
    com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar);

    com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z10);

    void a(View view);

    void a(View view, String str);

    void a(String str, String str2);

    void a(boolean z10);

    void a(boolean z10, Orientation orientation);

    void d();

    void f();

    void g();

    void i();

    void j();

    void k();

    void onCompleted();

    void onPlayerError();

    void onProgress(int i10, int i11);

    com.fyber.inneractive.sdk.ignite.m p();
}
