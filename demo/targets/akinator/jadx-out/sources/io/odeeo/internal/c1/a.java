package io.odeeo.internal.c1;

import io.odeeo.internal.b2.a;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.common.LogLevel;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends a.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0597a f63308c = new C0597a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f63309d = "OdeeoSDK";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.c1.a$a, reason: collision with other inner class name */
    public static final class C0597a {
        public C0597a() {
        }

        public final String getTAG() {
            return a.f63309d;
        }

        public /* synthetic */ C0597a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63310a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            iArr[LogLevel.None.ordinal()] = 1;
            iArr[LogLevel.Info.ordinal()] = 2;
            iArr[LogLevel.Debug.ordinal()] = 3;
            f63310a = iArr;
        }
    }

    @Override // io.odeeo.internal.b2.a.b, io.odeeo.internal.b2.a.c
    public void a(int i10, String str, String message, Throwable th2) {
        int i11;
        e0.checkNotNullParameter(message, "message");
        int i12 = b.f63310a[OdeeoSDK.INSTANCE.getLevel$odeeoSdk_release().ordinal()];
        if (i12 == 1) {
            i11 = 6;
        } else if (i12 != 2) {
            i11 = 3;
            if (i12 != 3) {
                throw new t();
            }
        } else {
            i11 = 4;
        }
        if (i10 >= i11) {
            printLog$odeeoSdk_release(i10, f63309d, message, th2);
        }
    }

    public final void printLog$odeeoSdk_release(int i10, String str, String message, Throwable th2) {
        e0.checkNotNullParameter(message, "message");
        super.a(i10, str, message, th2);
    }
}
