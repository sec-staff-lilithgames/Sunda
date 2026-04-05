package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.ironsource.G5;
import gv.d;
import gv.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import sv.g;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String key) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(key, "key");
        try {
            int i10 = z.f87419c;
            String str = key + G5.T;
            b1 b1Var = new b1();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                e0.checkNotNullExpressionValue(stream, "stream");
                y.forEachLine(new BufferedReader(new InputStreamReader(stream, g.f86134b), Segment.SIZE), new AndroidUnityBootConfigDataSource$getValue$1$1$1(str, b1Var));
                d.closeFinally(stream, null);
                objM7131constructorimpl = z.m7131constructorimpl((String) b1Var.f71816b);
            } finally {
            }
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        return (String) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }
}
