package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class qg {

    /* renamed from: b, reason: collision with root package name */
    private int f38239b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f38240c = 4;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f38238a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C3284j8.f37010k, Boolean.valueOf(qg.this.f38239b == 0));
            put(C3284j8.f37011l, Boolean.valueOf(qg.this.f38240c == 0));
            Boolean bool = Boolean.FALSE;
            put(C3284j8.f37012m, bool);
            put(C3284j8.f37013n, bool);
        }
    }

    public void a(String str, int i10, boolean z10) {
        boolean z11 = false;
        if (this.f38238a.containsKey(str)) {
            this.f38238a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f38238a.put(C3284j8.f37012m, Boolean.valueOf(z10));
        if ((this.f38238a.get(C3284j8.f37011l).booleanValue() || this.f38238a.get(C3284j8.f37010k).booleanValue()) && this.f38238a.get(C3284j8.f37012m).booleanValue()) {
            z11 = true;
        }
        this.f38238a.put(C3284j8.f37013n, Boolean.valueOf(z11));
    }

    public JSONObject a() {
        return new JSONObject(this.f38238a);
    }
}
