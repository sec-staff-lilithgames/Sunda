package com.mbridge.msdk.tracker;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f44122w;

    /* renamed from: x, reason: collision with root package name */
    private t.a f44123x;

    /* renamed from: y, reason: collision with root package name */
    private v.b<T> f44124y;

    /* renamed from: z, reason: collision with root package name */
    private w f44125z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public v.b<T> C() {
        return this.f44124y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Charset", C.UTF8_NAME);
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f44122w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public t.a l() {
        return this.f44123x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f44125z = wVar;
    }

    public void a(t.a aVar) {
        this.f44123x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f44122w = map;
    }

    public void a(v.b<T> bVar) {
        this.f44124y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f44125z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        v.b<T> bVarC = C();
        this.f44124y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
