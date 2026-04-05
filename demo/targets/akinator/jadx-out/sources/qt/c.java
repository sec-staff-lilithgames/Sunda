package qt;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final List f83491b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83492c;

    /* renamed from: e, reason: collision with root package name */
    public a f83493e;

    public c(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public static void a(String str, StringBuilder sb2, Throwable th2) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a("", sb2, th2.getCause());
        }
    }

    public final void b(p pVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f83491b) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a("\t", sb2, th2);
            i10++;
        }
        pVar.L(sb2.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f83493e == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                a aVar2 = aVar;
                for (Throwable runtimeException : this.f83491b) {
                    if (!hashSet.contains(runtimeException)) {
                        hashSet.add(runtimeException);
                        ArrayList arrayList = new ArrayList();
                        Throwable cause = runtimeException.getCause();
                        if (cause != null && cause != runtimeException) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Throwable th2 = (Throwable) it.next();
                            if (hashSet.contains(th2)) {
                                runtimeException = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            aVar2.initCause(runtimeException);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = aVar2.getCause();
                        if (cause3 != null && aVar2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            aVar2 = cause3;
                        }
                    }
                }
                this.f83493e = aVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f83493e;
    }

    public List<Throwable> getExceptions() {
        return this.f83491b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f83492c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.f83491b.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        b(new b(printStream, 0));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        b(new b(printWriter, 1));
    }

    public c(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof c) {
                    linkedHashSet.addAll(((c) th2).getExceptions());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f83491b = listUnmodifiableList;
            this.f83492c = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
