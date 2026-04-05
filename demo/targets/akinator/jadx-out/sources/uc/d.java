package uc;

import java.util.HashMap;
import tb.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* JADX INFO: Fake field, exist only in values array */
    d EF5;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f88405c = {new d("STRING", 0), new d("NUMBER", 1), new d("INTEGER", 2), new d("BOOLEAN", 3), new d("OBJECT", 4), new d("ARRAY", 5), new d("NULL", 6), new d("ANY", 7)};

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f88404b = new HashMap();

    static {
        for (d dVar : values()) {
            f88404b.put(dVar.name().toLowerCase(), dVar);
        }
    }

    @tb.n
    public static d forValue(String str) {
        return (d) f88404b.get(str);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f88405c.clone();
    }

    @c1
    public String value() {
        return name().toLowerCase();
    }
}
