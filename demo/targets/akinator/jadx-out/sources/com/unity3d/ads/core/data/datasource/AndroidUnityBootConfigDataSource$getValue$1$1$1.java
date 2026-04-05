package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import sv.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends f0 implements l {
    final /* synthetic */ String $prefix;
    final /* synthetic */ b1 $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, b1 b1Var) {
        super(1);
        this.$prefix = str;
        this.$value = b1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return x0.f87415a;
    }

    public final void invoke(String line) {
        e0.checkNotNullParameter(line, "line");
        if (k0.startsWith$default(line, this.$prefix, false, 2, null)) {
            b1 b1Var = this.$value;
            String strSubstring = line.substring(this.$prefix.length());
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            b1Var.f71816b = strSubstring;
        }
    }
}
