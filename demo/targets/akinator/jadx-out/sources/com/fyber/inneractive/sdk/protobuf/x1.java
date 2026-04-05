package com.fyber.inneractive.sdk.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f26532b = new v1();

    /* renamed from: a, reason: collision with root package name */
    public final b2 f26533a;

    public x1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = f26532b;
        }
        w1 w1Var = new w1(r0.f26464a, b2Var);
        Charset charset = l1.f26429a;
        this.f26533a = w1Var;
    }
}
