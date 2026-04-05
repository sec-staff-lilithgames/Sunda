package ki;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final q f71414a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71415b = ui.e.of(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71416c = ui.e.of("symbol");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71417d = ui.e.of(C3191e4.h.f36473b);

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71418e = ui.e.of("offset");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71419f = ui.e.of("importance");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b.AbstractC0725e.AbstractC0727b abstractC0727b, ui.g gVar) throws IOException {
        gVar.add(f71415b, abstractC0727b.getPc());
        gVar.add(f71416c, abstractC0727b.getSymbol());
        gVar.add(f71417d, abstractC0727b.getFile());
        gVar.add(f71418e, abstractC0727b.getOffset());
        gVar.add(f71419f, abstractC0727b.getImportance());
    }
}
