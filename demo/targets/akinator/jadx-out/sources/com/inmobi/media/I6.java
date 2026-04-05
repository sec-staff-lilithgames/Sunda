package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I6 {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f31865b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31866a;

    public I6(Context context, String str) {
        this.f31866a = context.getSharedPreferences(str, 0);
    }

    public static final I6 a(Context context, String str) {
        return H6.a(context, str);
    }

    public final void b() {
        SharedPreferences.Editor editorEdit = this.f31866a.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final boolean a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        if (!this.f31866a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f31866a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public static /* synthetic */ void a(I6 i62, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        i62.a(str, str2, z10);
    }

    public final void a(String key, String str, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f31866a.edit();
        editorEdit.putString(key, str);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void a(I6 i62, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        i62.a(str, i10, z10);
    }

    public final void a(String key, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f31866a.edit();
        editorEdit.putInt(key, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void a(I6 i62, String str, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        i62.a(str, j10, z10);
    }

    public final void a(String key, long j10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f31866a.edit();
        editorEdit.putLong(key, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static void a(I6 i62, String key, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        i62.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = i62.f31866a.edit();
        editorEdit.putBoolean(key, z10);
        if (z11) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
