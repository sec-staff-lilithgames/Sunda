package com.moloco.sdk.internal.services.events;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;
import com.moloco.sdk.hb;
import com.moloco.sdk.jb;
import com.moloco.sdk.pa;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {
    public static final pa a(a.c.EnumC0490a enumC0490a) {
        e0.checkNotNullParameter(enumC0490a, "<this>");
        switch (b.f47031a[enumC0490a.ordinal()]) {
            case 1:
                return pa.NONE;
            case 2:
                return pa.CLOSE;
            case 3:
                return pa.SKIP;
            case 4:
                return pa.DEC_SKIP;
            case 5:
                return pa.MUTE;
            case 6:
                return pa.UNMUTE;
            case 7:
                return pa.CTA;
            case 8:
                return pa.REPLAY;
            case 9:
                return pa.AD_BADGE;
            default:
                throw new t();
        }
    }

    public static final UserIntent$UserAdInteractionExt.Position a(a.f fVar) {
        e0.checkNotNullParameter(fVar, "<this>");
        hb hbVarNewBuilder = UserIntent$UserAdInteractionExt.Position.newBuilder();
        hbVarNewBuilder.setX(fVar.c());
        hbVarNewBuilder.setY(fVar.d());
        GeneratedMessageLite generatedMessageLiteBuild = hbVarNewBuilder.build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Position) generatedMessageLiteBuild;
    }

    public static final UserIntent$UserAdInteractionExt.Size a(a.g gVar) {
        e0.checkNotNullParameter(gVar, "<this>");
        jb jbVarNewBuilder = UserIntent$UserAdInteractionExt.Size.newBuilder();
        jbVarNewBuilder.setW(gVar.d());
        jbVarNewBuilder.setH(gVar.c());
        GeneratedMessageLite generatedMessageLiteBuild = jbVarNewBuilder.build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Size) generatedMessageLiteBuild;
    }

    public static final UserIntent$UserAdInteractionExt.Size a(com.moloco.sdk.internal.services.e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        jb jbVarNewBuilder = UserIntent$UserAdInteractionExt.Size.newBuilder();
        jbVarNewBuilder.setW(eVar.m());
        jbVarNewBuilder.setH(eVar.k());
        GeneratedMessageLite generatedMessageLiteBuild = jbVarNewBuilder.build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        return (UserIntent$UserAdInteractionExt.Size) generatedMessageLiteBuild;
    }
}
