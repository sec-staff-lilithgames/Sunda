package com.inmobi.media;

import com.inmobi.commons.core.configs.RootConfig;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3066x2 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3066x2 f33556a = new C3066x2();

    public C3066x2() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        return Boolean.valueOf(!((RootConfig) AbstractC3035v5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null)).isMonetizationDisabled());
    }
}
