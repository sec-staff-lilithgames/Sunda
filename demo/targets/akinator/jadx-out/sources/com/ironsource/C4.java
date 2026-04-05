package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C4 implements F4 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f33912a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f33913b;

    public C4(Context context, String fileName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f33912a = sharedPreferences;
        this.f33913b = sharedPreferences.edit();
    }

    @Override // com.ironsource.F4
    public String a(String key, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        try {
            return this.f33912a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.F4
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f33912a.getAll();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.F4
    public void b(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f33913b.putString(key, value).apply();
    }

    @Override // com.ironsource.F4
    public void a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.f33913b.remove(key).apply();
    }
}
