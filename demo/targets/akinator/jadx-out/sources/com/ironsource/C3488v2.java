package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3460t8;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3488v2 {

    /* renamed from: a, reason: collision with root package name */
    public static C3488v2 f39101a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.v2$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39102a;

        static {
            int[] iArr = new int[C3460t8.a.values().length];
            f39102a = iArr;
            try {
                iArr[C3460t8.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39102a[C3460t8.a.Device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39102a[C3460t8.a.Controller.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static C3488v2 a() {
        C3488v2 c3488v2 = f39101a;
        return c3488v2 == null ? new C3488v2() : c3488v2;
    }

    public boolean a(Activity activity) throws NumberFormatException {
        if (a.f39102a[C3197ea.e().b().ordinal()] != 3) {
            return false;
        }
        try {
            com.ironsource.sdk.controller.v vVar = (com.ironsource.sdk.controller.v) Q9.b((Context) activity).a().k();
            if (vVar == null) {
                return true;
            }
            vVar.k("back");
            return true;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
