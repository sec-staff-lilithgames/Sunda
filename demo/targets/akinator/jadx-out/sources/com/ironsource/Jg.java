package com.ironsource;

import com.ironsource.AbstractC3438s3;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Jg<Smash extends AbstractC3438s3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final Kg<Smash> f34726a;

    public Jg(Kg<Smash> smashPicker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(smashPicker, "smashPicker");
        this.f34726a = smashPicker;
    }

    public final List<Smash> a() {
        return this.f34726a.c();
    }

    public final boolean b() {
        return this.f34726a.c().isEmpty() && this.f34726a.a().isEmpty();
    }

    public final boolean c() {
        return this.f34726a.d() == 0;
    }
}
