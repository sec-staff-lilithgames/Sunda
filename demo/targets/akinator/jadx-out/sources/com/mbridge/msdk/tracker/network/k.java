package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.tracker.network.v;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class k extends h<String> implements v.a {
    private final j<String> C;

    public k(int i10, String str, String str2, long j10, j<String> jVar) {
        super(i10, str, 0, str2, j10);
        this.C = jVar;
        a((v.a) this);
    }

    private void b(v<String> vVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.b(this, vVar, vVar.f44079c.f43946a);
            } catch (Exception e10) {
                p0.b(h.B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public v<String> a(q qVar) {
        try {
            v<String> vVarA = v.a(new String(qVar.f44002b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(qVar));
            a(vVarA, qVar);
            return vVarA;
        } catch (Throwable th2) {
            p0.b(h.B, "parseNetworkResponse error: ", th2);
            v<String> vVarA2 = v.a(new a0(th2));
            b(vVarA2);
            return vVarA2;
        }
    }

    private void a(v<String> vVar, q qVar) {
        j<String> jVar = this.C;
        if (jVar != null) {
            try {
                jVar.a(this, vVar, qVar);
            } catch (Exception e10) {
                p0.b(h.B, "parseNetworkResponse error: ", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.v.a
    public void a(b0 b0Var) {
        b(v.a(b0Var));
    }

    @Override // com.mbridge.msdk.tracker.network.t
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
    }
}
