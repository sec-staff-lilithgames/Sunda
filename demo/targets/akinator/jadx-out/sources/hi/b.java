package hi;

import java.io.File;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f58789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58790b;

    /* renamed from: c, reason: collision with root package name */
    public final File f58791c;

    public b(f2 f2Var, String str, File file) {
        if (f2Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f58789a = f2Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f58790b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f58791c = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f58789a.equals(c0Var.getReport()) && this.f58790b.equals(c0Var.getSessionId()) && this.f58791c.equals(c0Var.getReportFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // hi.c0
    public f2 getReport() {
        return this.f58789a;
    }

    @Override // hi.c0
    public File getReportFile() {
        return this.f58791c;
    }

    @Override // hi.c0
    public String getSessionId() {
        return this.f58790b;
    }

    public int hashCode() {
        return ((((this.f58789a.hashCode() ^ 1000003) * 1000003) ^ this.f58790b.hashCode()) * 1000003) ^ this.f58791c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f58789a + ", sessionId=" + this.f58790b + ", reportFile=" + this.f58791c + "}";
    }
}
