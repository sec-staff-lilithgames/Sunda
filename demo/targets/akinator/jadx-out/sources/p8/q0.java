package p8;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q0 extends Exception {

    /* renamed from: i, reason: collision with root package name */
    public static final StackTraceElement[] f80848i = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public final List f80849b;

    /* renamed from: c, reason: collision with root package name */
    public n8.q f80850c;

    /* renamed from: e, reason: collision with root package name */
    public n8.a f80851e;

    /* renamed from: f, reason: collision with root package name */
    public Class f80852f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80853g;

    /* renamed from: h, reason: collision with root package name */
    public Exception f80854h;

    public q0(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof q0)) {
            arrayList.add(th2);
            return;
        }
        Iterator<Throwable> it = ((q0) th2).getCauses().iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, p0 p0Var) {
        try {
            c(list, p0Var);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, p0 p0Var) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            p0Var.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof q0) {
                q0 q0Var = (q0) th2;
                d(q0Var, p0Var);
                b(q0Var.getCauses(), new p0(p0Var));
            } else {
                d(th2, p0Var);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) throws IOException {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public List<Throwable> getCauses() {
        return this.f80849b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f80853g);
        sb2.append(this.f80852f != null ? ", " + this.f80852f : "");
        sb2.append(this.f80851e != null ? ", " + this.f80851e : "");
        sb2.append(this.f80850c != null ? ", " + this.f80850c : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : rootCauses) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public Exception getOrigin() {
        return this.f80854h;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), rootCauses.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() throws IOException {
        printStackTrace(System.err);
    }

    public void setOrigin(Exception exc) {
        this.f80854h = exc;
    }

    public q0(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) throws IOException {
        d(this, printStream);
        b(getCauses(), new p0(printStream));
    }

    public q0(String str, List<Throwable> list) {
        this.f80853g = str;
        setStackTrace(f80848i);
        this.f80849b = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) throws IOException {
        d(this, printWriter);
        b(getCauses(), new p0(printWriter));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
