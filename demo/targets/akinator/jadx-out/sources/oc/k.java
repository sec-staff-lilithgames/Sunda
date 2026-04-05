package oc;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f78877a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends l {

        /* renamed from: h, reason: collision with root package name */
        public final Constructor f78878h;

        public a() {
            super(Calendar.class);
            this.f78878h = null;
        }

        @Override // oc.l
        public final l V(DateFormat dateFormat, String str) {
            return new a(this, dateFormat, str);
        }

        @Override // oc.l, mc.k
        public /* bridge */ /* synthetic */ jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
            return super.createContextual(kVar, gVar);
        }

        @Override // jc.q
        public Object getEmptyValue(jc.k kVar) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // oc.l, oc.c1, jc.q
        public /* bridge */ /* synthetic */ cd.h logicalType() {
            return super.logicalType();
        }

        @Override // jc.q
        public Calendar deserialize(ub.u uVar, jc.k kVar) throws IOException {
            Date dateA = A(uVar, kVar);
            if (dateA == null) {
                return null;
            }
            Constructor constructor = this.f78878h;
            if (constructor == null) {
                return kVar.constructCalendar(dateA);
            }
            try {
                Calendar calendar = (Calendar) constructor.newInstance(null);
                calendar.setTimeInMillis(dateA.getTime());
                TimeZone timeZone = kVar.getTimeZone();
                if (timeZone == null) {
                    return calendar;
                }
                calendar.setTimeZone(timeZone);
                return calendar;
            } catch (Exception e10) {
                return (Calendar) kVar.handleInstantiationProblem(handledType(), dateA, e10);
            }
        }

        public a(Class<? extends Calendar> cls) {
            super(cls);
            this.f78878h = dd.i.findConstructor(cls, false);
        }

        public a(a aVar, DateFormat dateFormat, String str) {
            super(aVar, dateFormat, str);
            this.f78878h = aVar.f78878h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends l {

        /* renamed from: h, reason: collision with root package name */
        public static final b f78879h = new b();

        public b() {
            super(Date.class);
        }

        @Override // oc.l
        public final l V(DateFormat dateFormat, String str) {
            return new b(this, dateFormat, str);
        }

        @Override // oc.l, mc.k
        public /* bridge */ /* synthetic */ jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
            return super.createContextual(kVar, gVar);
        }

        @Override // jc.q
        public Object getEmptyValue(jc.k kVar) {
            return new Date(0L);
        }

        @Override // oc.l, oc.c1, jc.q
        public /* bridge */ /* synthetic */ cd.h logicalType() {
            return super.logicalType();
        }

        public b(b bVar, DateFormat dateFormat, String str) {
            super(bVar, dateFormat, str);
        }

        @Override // jc.q
        public Date deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return A(uVar, kVar);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f78877a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    public static jc.q find(Class<?> cls, String str) {
        if (!f78877a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new a();
        }
        if (cls == Date.class) {
            return b.f78879h;
        }
        if (cls == GregorianCalendar.class) {
            return new a(GregorianCalendar.class);
        }
        return null;
    }

    public static boolean hasDeserializerFor(Class<?> cls) {
        return f78877a.contains(cls.getName());
    }
}
