package zi;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class k {
    public static k create(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> getUsedDates();

    public abstract String getUserAgent();
}
