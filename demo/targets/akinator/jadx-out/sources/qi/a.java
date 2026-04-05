package qi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f83262a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f83263b;

    /* renamed from: c, reason: collision with root package name */
    public final b f83264c;

    public a(int i10, d... dVarArr) {
        this.f83262a = i10;
        this.f83263b = dVarArr;
        this.f83264c = new b(i10);
    }

    @Override // qi.d
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f83262a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (d dVar : this.f83263b) {
            if (trimmedStackTrace.length <= i10) {
                break;
            }
            trimmedStackTrace = dVar.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > i10 ? this.f83264c.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
