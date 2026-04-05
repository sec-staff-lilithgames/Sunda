package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.s0;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws IOException {
        f fVar = (f) this.f26618a;
        if (str == null) {
            str = null;
        } else {
            s0 s0Var = s0.f26809c;
            s0Var.getClass();
            int iIndexOf = str.indexOf(38);
            if (iIndexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((str.length() * 0.1d) + str.length()));
                try {
                    s0Var.a(stringWriter, str, iIndexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String strB = o.b(property);
            if (!TextUtils.isEmpty(strB)) {
                str = strB;
            }
        }
        fVar.N = str;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean c() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        f fVar = new f();
        this.f26618a = fVar;
        return fVar;
    }
}
