package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.work.b;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {
    public static final androidx.work.b a(String str) {
        e0.checkNotNullParameter(str, "<this>");
        try {
            v[] vVarArr = {tu.e0.to("url", str)};
            b.a aVar = new b.a();
            v vVar = vVarArr[0];
            aVar.put((String) vVar.getFirst(), vVar.getSecond());
            androidx.work.b bVarBuild = aVar.build();
            e0.checkNotNullExpressionValue(bVarBuild, "dataBuilder.build()");
            return bVarBuild;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", e10.getMessage() + ". Url: " + str, null, false, 12, null);
            return null;
        }
    }
}
