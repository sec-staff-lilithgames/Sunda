package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import i1.h;
import kotlin.jvm.internal.e0;
import s2.v;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f48771a = new c();

    public final float a(int i10) {
        return i10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public final a.g b(d0 d0Var) {
        e0.checkNotNullParameter(d0Var, "<this>");
        return new a.g(a(v.m6972getWidthimpl(d0Var.mo7827getSizeYbymL2g())), a(v.m6971getHeightimpl(d0Var.mo7827getSizeYbymL2g())));
    }

    public final a.f a(d0 d0Var) {
        e0.checkNotNullParameter(d0Var, KerkSviMAy.UOAppScEUxcVuc);
        return new a.f(a((int) h.m4185getXimpl(x1.e0.positionInRoot(d0Var))), a((int) h.m4186getYimpl(x1.e0.positionInRoot(d0Var))));
    }

    public final a.f a(long j10) {
        return new a.f(a((int) h.m4185getXimpl(j10)), a((int) h.m4186getYimpl(j10)));
    }

    public final a.c a(d0 d0Var, a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(d0Var, "<this>");
        e0.checkNotNullParameter(buttonType, "buttonType");
        return new a.c(buttonType, a(d0Var), b(d0Var));
    }

    public final boolean a(a.c cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        return cVar.f().c() > 0.0f && cVar.f().d() > 0.0f;
    }
}
