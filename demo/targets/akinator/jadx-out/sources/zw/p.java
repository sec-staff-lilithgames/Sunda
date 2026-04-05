package zw;

import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum p {
    FULL("yyyy-MM-dd HH:mm:ss.S z"),
    LONG("yyyy-MM-dd HH:mm:ss z"),
    NORMAL("yyyy-MM-dd z"),
    SHORT("yyyy-MM-dd");


    /* renamed from: b, reason: collision with root package name */
    public final o f98876b;

    p(String str) {
        this.f98876b = new o(str);
    }

    public static Date getDate(String str) throws Exception {
        return getType(str).f98876b.getDate(str);
    }

    public static String getText(Date date) throws Exception {
        return FULL.f98876b.getText(date);
    }

    public static p getType(String str) {
        int length = str.length();
        return length > 23 ? FULL : length > 20 ? LONG : length > 11 ? NORMAL : SHORT;
    }
}
