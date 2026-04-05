package su;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a extends Error {

    /* renamed from: b, reason: collision with root package name */
    public final Exception f86115b;

    public a() {
    }

    public Exception getException() {
        return this.f86115b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f86115b) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? exc.getClass().toString() : message2;
    }

    public a(Exception exc) {
        this.f86115b = exc;
    }

    public a(Exception exc, String str) {
        super(str);
        this.f86115b = exc;
    }

    public a(String str, Exception exc) {
        super(str);
        this.f86115b = exc;
    }

    public a(String str) {
        super(str);
    }
}
