package com.pgl.ssdk;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f50414a;

    /* renamed from: b, reason: collision with root package name */
    private int f50415b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f50416c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f50414a = context;
        this.f50415b = i10;
        this.f50416c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f50415b == 222) {
                ak.a(this.f50414a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f50415b, this.f50414a, this.f50416c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f50414a, this.f50415b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
