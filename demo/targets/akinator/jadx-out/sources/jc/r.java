package jc;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r extends i {

    /* renamed from: c, reason: collision with root package name */
    public LinkedList f69391c;

    /* renamed from: e, reason: collision with root package name */
    public final transient Closeable f69392e;

    public r(Closeable closeable, String str) {
        super(str);
        this.f69392e = closeable;
        if (closeable instanceof ub.u) {
            this.f88377b = ((ub.u) closeable).currentTokenLocation();
        }
    }

    public static r from(ub.u uVar, String str) {
        return new r(uVar, str);
    }

    public static r fromUnexpectedIOE(IOException iOException) {
        return new r((Closeable) null, a.b.m("Unexpected IOException (of type ", iOException.getClass().getName(), "): ", dd.i.exceptionMessage(iOException)));
    }

    public static r wrapWithPath(Throwable th2, Object obj, String str) {
        return wrapWithPath(th2, new a(obj, str));
    }

    public final String a() {
        String message = super.getMessage();
        if (this.f69391c == null) {
            return message;
        }
        StringBuilder sb2 = message == null ? new StringBuilder() : new StringBuilder(message);
        sb2.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb2);
        pathReference.append(')');
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return a();
    }

    @Override // ub.x, java.lang.Throwable
    public String getMessage() {
        return a();
    }

    public List<a> getPath() {
        LinkedList linkedList = this.f69391c;
        return linkedList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // ub.x, ub.h
    @tb.y
    public Object getProcessor() {
        return this.f69392e;
    }

    @Override // jc.i
    public void prependPath(Object obj, String str) {
        prependPath(new a(obj, str));
    }

    @Override // ub.x, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public r withCause(Throwable th2) {
        initCause(th2);
        return this;
    }

    public static r from(ub.u uVar, String str, Throwable th2) {
        return new r(uVar, str, th2);
    }

    public static r wrapWithPath(Throwable th2, Object obj, int i10) {
        return wrapWithPath(th2, new a(obj, i10));
    }

    public StringBuilder getPathReference(StringBuilder sb2) {
        LinkedList linkedList = this.f69391c;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb2.append(((a) it.next()).toString());
                if (it.hasNext()) {
                    sb2.append("->");
                }
            }
        }
        return sb2;
    }

    @Override // jc.i
    public void prependPath(Object obj, int i10) {
        prependPath(new a(obj, i10));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final transient Object f69393b;

        /* renamed from: c, reason: collision with root package name */
        public final String f69394c;

        /* renamed from: e, reason: collision with root package name */
        public final int f69395e;

        /* renamed from: f, reason: collision with root package name */
        public String f69396f;

        public a(Object obj) {
            this.f69395e = -1;
            this.f69393b = obj;
        }

        public String getDescription() {
            if (this.f69396f == null) {
                StringBuilder sb2 = new StringBuilder();
                Object obj = this.f69393b;
                if (obj != null) {
                    Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i10 = 0;
                    while (componentType.isArray()) {
                        componentType = componentType.getComponentType();
                        i10++;
                    }
                    sb2.append(componentType.getName());
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb2.append("UNKNOWN");
                }
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                String str = this.f69394c;
                if (str != null) {
                    sb2.append(AbstractJsonLexerKt.STRING);
                    sb2.append(str);
                    sb2.append(AbstractJsonLexerKt.STRING);
                } else {
                    int i11 = this.f69395e;
                    if (i11 >= 0) {
                        sb2.append(i11);
                    } else {
                        sb2.append('?');
                    }
                }
                sb2.append(AbstractJsonLexerKt.END_LIST);
                this.f69396f = sb2.toString();
            }
            return this.f69396f;
        }

        public String getFieldName() {
            return this.f69394c;
        }

        @tb.y
        public Object getFrom() {
            return this.f69393b;
        }

        public int getIndex() {
            return this.f69395e;
        }

        public String toString() {
            return getDescription();
        }

        public a(Object obj, String str) {
            this.f69395e = -1;
            this.f69393b = obj;
            if (str != null) {
                this.f69394c = str;
                return;
            }
            throw new NullPointerException("Cannot pass null fieldName");
        }

        public a(Object obj, int i10) {
            this.f69393b = obj;
            this.f69395e = i10;
        }
    }

    public static r from(ub.o oVar, String str) {
        return new r(oVar, str, (Throwable) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static jc.r wrapWithPath(java.lang.Throwable r3, jc.r.a r4) {
        /*
            boolean r0 = r3 instanceof jc.r
            if (r0 == 0) goto L7
            jc.r r3 = (jc.r) r3
            goto L48
        L7:
            java.lang.String r0 = dd.i.exceptionMessage(r3)
            if (r0 == 0) goto L13
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 0
            java.lang.String r1 = hr.kNq.ikJMrW.WRbotNXXNKISm
            r0.<init>(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L2f:
            boolean r1 = r3 instanceof ub.h
            if (r1 == 0) goto L41
            r1 = r3
            ub.h r1 = (ub.h) r1
            java.lang.Object r1 = r1.getProcessor()
            boolean r2 = r1 instanceof java.io.Closeable
            if (r2 == 0) goto L41
            java.io.Closeable r1 = (java.io.Closeable) r1
            goto L42
        L41:
            r1 = 0
        L42:
            jc.r r2 = new jc.r
            r2.<init>(r1, r0, r3)
            r3 = r2
        L48:
            r3.prependPath(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jc.r.wrapWithPath(java.lang.Throwable, jc.r$a):jc.r");
    }

    public void prependPath(a aVar) {
        if (this.f69391c == null) {
            this.f69391c = new LinkedList();
        }
        if (this.f69391c.size() < 1000) {
            this.f69391c.addFirst(aVar);
        }
    }

    public static r from(ub.o oVar, String str, Throwable th2) {
        return new r(oVar, str, th2);
    }

    @Deprecated
    public r(String str) {
        super(str);
    }

    public static r from(k kVar, String str) {
        return new r(kVar == null ? null : kVar.getParser(), str);
    }

    public r(Closeable closeable, String str, Throwable th2) {
        super(str, null, th2);
        this.f69392e = closeable;
        if (th2 instanceof ub.h) {
            this.f88377b = ((ub.h) th2).getLocation();
        } else if (closeable instanceof ub.u) {
            this.f88377b = ((ub.u) closeable).currentTokenLocation();
        }
    }

    public static r from(k kVar, String str, Throwable th2) {
        return new r(kVar == null ? null : kVar.getParser(), str, th2);
    }

    public static r from(u0 u0Var, String str) {
        return new r(u0Var == null ? null : u0Var.getGenerator(), str);
    }

    public r(Closeable closeable, String str, ub.p pVar) {
        super(str, pVar, null);
        this.f69392e = closeable;
    }

    @Deprecated
    public r(String str, Throwable th2) {
        super(str, null, th2);
    }

    public static r from(u0 u0Var, String str, Throwable th2) {
        return new r(u0Var == null ? null : u0Var.getGenerator(), str, th2);
    }

    @Deprecated
    public r(String str, ub.p pVar) {
        super(str, pVar, null);
    }

    @Deprecated
    public r(String str, ub.p pVar, Throwable th2) {
        super(str, pVar, th2);
    }
}
