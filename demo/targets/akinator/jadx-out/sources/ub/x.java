package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x extends h {

    /* renamed from: b, reason: collision with root package name */
    public p f88377b;

    public x(String str, p pVar, Throwable th2) {
        super(str, th2);
        this.f88377b = pVar;
    }

    public void clearLocation() {
        this.f88377b = null;
    }

    @Override // ub.h
    public p getLocation() {
        return this.f88377b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        p location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (messageSuffix != null) {
            sb2.append(messageSuffix);
        }
        if (location != null) {
            sb2.append("\n at ");
            sb2.append(location.toString());
        }
        return sb2.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    @Override // ub.h
    public String getOriginalMessage() {
        return super.getMessage();
    }

    @Override // ub.h
    public Object getProcessor() {
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
