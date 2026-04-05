package zw;

import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f98870a;

    public o(String str) {
        this.f98870a = new SimpleDateFormat(str);
    }

    public synchronized Date getDate(String str) throws Exception {
        return this.f98870a.parse(str);
    }

    public synchronized String getText(Date date) throws Exception {
        return this.f98870a.format(date);
    }
}
