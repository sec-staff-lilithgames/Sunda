package zw;

import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f98882a;

    public v() throws Exception {
        this(Date.class);
    }

    public v(Class cls) throws Exception {
        this.f98882a = new n(cls);
    }

    @Override // zw.h0
    public GregorianCalendar read(String str) throws Exception {
        Date date = this.f98882a.read(str);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }

    @Override // zw.h0
    public String write(GregorianCalendar gregorianCalendar) throws Exception {
        return this.f98882a.write(gregorianCalendar.getTime());
    }
}
