package qi;

import java.util.Stack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f83267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83268b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f83269c;

    /* renamed from: d, reason: collision with root package name */
    public final e f83270d;

    public e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f83267a = str;
        this.f83268b = str2;
        this.f83269c = stackTraceElementArr;
        this.f83270d = eVar;
    }

    public static e makeTrimmedThrowableData(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.getTrimmedStackTrace(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
