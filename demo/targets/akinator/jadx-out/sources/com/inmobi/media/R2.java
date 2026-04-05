package com.inmobi.media;

import android.content.ContentValues;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class R2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final R2 f32182a = new R2();

    public R2() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        if (contentValues.getAsString("config_value") != null) {
            return contentValues.getAsLong("update_ts");
        }
        return null;
    }
}
