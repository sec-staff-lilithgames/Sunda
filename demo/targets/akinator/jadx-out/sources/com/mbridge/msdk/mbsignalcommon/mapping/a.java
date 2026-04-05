package com.mbridge.msdk.mbsignalcommon.mapping;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f41882a;

    /* renamed from: b, reason: collision with root package name */
    private String f41883b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f41882a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f41883b = str;
    }
}
