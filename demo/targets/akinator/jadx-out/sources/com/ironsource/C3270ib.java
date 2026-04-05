package com.ironsource;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3270ib {

    /* renamed from: a, reason: collision with root package name */
    private final String f36941a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36942b;

    public C3270ib(String str, int i10) {
        this.f36941a = str;
        this.f36942b = i10;
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(stackTrace, "stackTrace");
        return b0.e2.m("%s %s", "format(format, *args)", 2, new Object[]{a(stackTrace, 4), b(stackTrace, 4)});
    }

    public final int a() {
        return this.f36942b;
    }

    public final String c() {
        String str = this.f36941a;
        return (str == null || str.length() == 0) ? b() : w0.i.d(b(), " - ", this.f36941a);
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List listEmptyList;
        List listEmptyList2;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new sv.x("\\.").split(className, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = uu.p0.emptyList();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listEmptyList = uu.y0.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList = uu.p0.emptyList();
        }
        String str = ((String[]) listEmptyList.toArray(new String[0]))[r4.length - 1];
        if (!sv.n0.contains$default((CharSequence) str, (CharSequence) "$", false, 2, (Object) null)) {
            return str;
        }
        List<String> listSplit2 = new sv.x("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listEmptyList2 = uu.p0.emptyList();
        } else {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listEmptyList2 = uu.y0.take(listSplit2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList2 = uu.p0.emptyList();
        }
        return ((String[]) listEmptyList2.toArray(new String[0]))[0];
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List listEmptyList;
        int i11;
        List listEmptyList2;
        List listEmptyList3;
        if (stackTraceElementArr.length > i10) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List<String> listSplit = new sv.x("\\.").split(className, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = uu.y0.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = uu.p0.emptyList();
            } else {
                listEmptyList = uu.p0.emptyList();
            }
            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            if (sv.n0.contains$default((CharSequence) str, (CharSequence) "$", false, 2, (Object) null)) {
                List<String> listSplit2 = new sv.x("\\$").split(str, 0);
                if (!listSplit2.isEmpty()) {
                    ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            listEmptyList3 = uu.y0.take(listSplit2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList3 = uu.p0.emptyList();
                } else {
                    listEmptyList3 = uu.p0.emptyList();
                }
                return w0.i.d(((String[]) listEmptyList3.toArray(new String[0]))[1], ".", stackTraceElementArr[i10].getMethodName());
            }
            String methodName = stackTraceElementArr[i10].getMethodName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            if (sv.n0.contains$default((CharSequence) methodName, (CharSequence) "$", false, 2, (Object) null) && stackTraceElementArr.length > (i11 = i10 + 1)) {
                String className2 = stackTraceElementArr[i11].getClassName();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
                List<String> listSplit3 = new sv.x("\\$").split(className2, 0);
                if (!listSplit3.isEmpty()) {
                    ListIterator<String> listIterator3 = listSplit3.listIterator(listSplit3.size());
                    while (listIterator3.hasPrevious()) {
                        if (listIterator3.previous().length() != 0) {
                            listEmptyList2 = uu.y0.take(listSplit3, listIterator3.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList2 = uu.p0.emptyList();
                } else {
                    listEmptyList2 = uu.p0.emptyList();
                }
                String[] strArr2 = (String[]) listEmptyList2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    return w0.i.d(strArr2[1], ".", stackTraceElementArr[i11].getMethodName());
                }
                String methodName2 = stackTraceElementArr[i11].getMethodName();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(methodName2, "{\n              stackTra….methodName\n            }");
                return methodName2;
            }
            String methodName3 = stackTraceElementArr[i10].getMethodName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(methodName3, "stackTrace[depth].methodName");
            return methodName3;
        }
        return "";
    }
}
