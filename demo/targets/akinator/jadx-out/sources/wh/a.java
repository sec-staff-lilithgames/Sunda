package wh;

import android.content.Context;
import java.util.HashMap;
import sj.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f90624a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f90625b;

    /* renamed from: c, reason: collision with root package name */
    public final c f90626c;

    public a(Context context, c cVar) {
        this.f90625b = context;
        this.f90626c = cVar;
    }

    public synchronized vh.c get(String str) {
        try {
            if (!this.f90624a.containsKey(str)) {
                this.f90624a.put(str, new vh.c(this.f90625b, this.f90626c, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (vh.c) this.f90624a.get(str);
    }
}
