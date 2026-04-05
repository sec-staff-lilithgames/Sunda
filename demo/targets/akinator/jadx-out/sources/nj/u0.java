package nj;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class u0 implements yh.d {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f77015a;

    public u0(sj.b bVar) {
        this.f77015a = bVar;
        ((bi.y) bVar).whenAvailable(new ha.a(this, 24));
    }

    @Override // yh.d
    public List<yh.c> getConditionalUserProperties(String str, String str2) {
        return Collections.EMPTY_LIST;
    }

    @Override // yh.d
    public int getMaxUserProperties(String str) {
        return 0;
    }

    @Override // yh.d
    public Map<String, Object> getUserProperties(boolean z10) {
        return Collections.EMPTY_MAP;
    }

    @Override // yh.d
    public void logEvent(String str, String str2, Bundle bundle) {
        Object obj = this.f77015a;
        yh.d dVar = obj instanceof yh.d ? (yh.d) obj : null;
        if (dVar != null) {
            dVar.logEvent(str, str2, bundle);
        }
    }

    @Override // yh.d
    public yh.a registerAnalyticsConnectorListener(String str, yh.b bVar) {
        Object obj = this.f77015a;
        if (obj instanceof yh.d) {
            return ((yh.d) obj).registerAnalyticsConnectorListener(str, bVar);
        }
        t0 t0Var = new t0();
        t0Var.f77012a = new HashSet();
        ((bi.y) ((sj.b) obj)).whenAvailable(new ao.q0(t0Var, 16, str, bVar));
        return t0Var;
    }

    @Override // yh.d
    public void setUserProperty(String str, String str2, Object obj) {
        Object obj2 = this.f77015a;
        yh.d dVar = obj2 instanceof yh.d ? (yh.d) obj2 : null;
        if (dVar != null) {
            dVar.setUserProperty(str, str2, obj);
        }
    }

    @Override // yh.d
    public void setConditionalUserProperty(yh.c cVar) {
    }

    @Override // yh.d
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }
}
