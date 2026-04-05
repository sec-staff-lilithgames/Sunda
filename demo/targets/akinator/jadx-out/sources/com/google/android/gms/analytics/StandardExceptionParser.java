package com.google.android.gms.analytics;

import android.content.Context;
import b3.h;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet zza = new TreeSet();

    public StandardExceptionParser(Context context, Collection<String> collection) {
        setIncludedPackages(context, collection);
    }

    public StackTraceElement getBestStackTraceElement(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        if (stackTrace == null || (stackTrace.length) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                if (className.startsWith((String) it.next())) {
                    return stackTraceElement;
                }
            }
        }
        return stackTrace[0];
    }

    public Throwable getCause(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    public String getDescription(String str, Throwable th2) {
        return getDescription(getCause(th2), getBestStackTraceElement(getCause(th2)), str);
    }

    public void setIncludedPackages(Context context, Collection<String> collection) {
        this.zza.clear();
        HashSet hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = this.zza.iterator();
            boolean z10 = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (str.startsWith(str2)) {
                    z10 = false;
                } else if (str2.startsWith(str)) {
                    this.zza.remove(str2);
                }
            }
            if (z10) {
                this.zza.add(str);
            }
        }
    }

    public String getDescription(Throwable th2, StackTraceElement stackTraceElement, String str) {
        int length;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] strArrSplit = stackTraceElement.getClassName().split("\\.");
            String str2 = (strArrSplit == null || (length = strArrSplit.length) <= 0) ? "unknown" : strArrSplit[length - 1];
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringBuilder sbB = h.b(" (@", str2, ":", methodName, ":");
            sbB.append(lineNumber);
            sbB.append(")");
            sb2.append(sbB.toString());
        }
        if (str != null) {
            sb2.append(" {" + str + "}");
        }
        return sb2.toString();
    }
}
