package zw;

import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f98869a;

    public n(Class<Date> cls) throws Exception {
        this.f98869a = new m(cls);
    }

    @Override // zw.h0
    public synchronized Date read(String str) throws Exception {
        return this.f98869a.getInstance(Long.valueOf(p.getDate(str).getTime()));
    }

    @Override // zw.h0
    public synchronized String write(Date date) throws Exception {
        return p.getText(date);
    }
}
