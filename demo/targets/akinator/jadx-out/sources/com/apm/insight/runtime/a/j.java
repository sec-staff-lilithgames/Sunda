package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class j extends c {
    public j(Context context, b bVar, d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.a aVarA = super.a(i10, aVar);
        if (i10 == 0) {
            aVarA.a("app_count", (Object) 1);
            aVarA.a("magic_tag", "ss_app_log");
            Header headerA = Header.a(this.f13271b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f13270a);
            return aVarA;
        }
        if (i10 == 1) {
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        if (i10 == 2) {
            Header.a(aVarA.d());
            return aVarA;
        }
        if (i10 != 5) {
            return aVarA;
        }
        Header.b(aVarA.d());
        return aVarA;
    }
}
