package com.google.gson.internal.sql;

import com.google.gson.l0;
import java.sql.Date;
import java.sql.Timestamp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f30050a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f30051b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f30052c;

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f30053d;

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f30054e;

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f30055f;

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f30050a = z10;
        if (z10) {
            f30051b = new b(Date.class, 0);
            f30052c = new b(Timestamp.class, 1);
            f30053d = SqlDateTypeAdapter.f30043b;
            f30054e = SqlTimeTypeAdapter.f30045b;
            f30055f = a.f30047b;
            return;
        }
        f30051b = null;
        f30052c = null;
        f30053d = null;
        f30054e = null;
        f30055f = null;
    }
}
