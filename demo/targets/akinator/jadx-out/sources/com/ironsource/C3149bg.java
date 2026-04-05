package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3149bg {

    /* renamed from: b, reason: collision with root package name */
    private NetworkSettings f36094b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f36093a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f36095c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36096d = true;

    public void a(NetworkSettings networkSettings) {
        this.f36094b = networkSettings;
    }

    public JSONObject b() {
        return this.f36095c;
    }

    public NetworkSettings c() {
        return this.f36094b;
    }

    public ArrayList<String> d() {
        return this.f36093a;
    }

    public boolean e() {
        return this.f36096d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36093a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f36095c = jSONObject;
    }

    public void a(boolean z10) {
        this.f36096d = z10;
    }

    public static C3149bg a() {
        return new C3149bg();
    }
}
