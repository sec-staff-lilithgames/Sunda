package wi;

import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ui.h;
import ui.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f90630a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f90630a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // ui.h, ui.b
    public void encode(Date date, i iVar) throws IOException {
        iVar.add(f90630a.format(date));
    }
}
