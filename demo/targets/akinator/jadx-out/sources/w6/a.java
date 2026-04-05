package w6;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f90387a = new a();

    public final String getProcessName() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(processName, "getProcessName(...)");
        return processName;
    }
}
