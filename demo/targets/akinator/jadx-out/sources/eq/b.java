package eq;

import android.content.Context;
import ar.d;
import ar.f;
import ar.g;
import br.d1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final vq.b f55002a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55003b;

    public b(Context context, vq.b repository) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        this.f55002a = repository;
        this.f55003b = context.getApplicationContext();
    }

    public final a a(br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        int iOrdinal = adElementParams.getAdElementType().ordinal();
        if (iOrdinal == 0) {
            Context applicationContext = this.f55003b;
            e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new gq.b(applicationContext, this.f55002a, adElementParams, adFormListener, eventCallback, aVar, a(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()));
        }
        if (iOrdinal == 1) {
            Context applicationContext2 = this.f55003b;
            e0.checkNotNullExpressionValue(applicationContext2, "applicationContext");
            return new kq.c(applicationContext2, this.f55002a, adElementParams, adFormListener, eventCallback, aVar, b(adElementParams.getMeasurerFactory(), adElementParams.getMeasurerParamsList()));
        }
        if (iOrdinal == 2) {
            Context applicationContext3 = this.f55003b;
            e0.checkNotNullExpressionValue(applicationContext3, "applicationContext");
            return new hq.a(applicationContext3, this.f55002a, adElementParams, adFormListener, eventCallback, aVar);
        }
        if (iOrdinal == 3) {
            Context applicationContext4 = this.f55003b;
            e0.checkNotNullExpressionValue(applicationContext4, "applicationContext");
            return new iq.a(applicationContext4, this.f55002a, adElementParams, adFormListener, eventCallback, aVar);
        }
        if (iOrdinal == 4) {
            Context applicationContext5 = this.f55003b;
            e0.checkNotNullExpressionValue(applicationContext5, "applicationContext");
            return new fq.a(applicationContext5, this.f55002a, adElementParams, adFormListener, eventCallback, aVar);
        }
        if (iOrdinal != 5) {
            throw new t();
        }
        Context applicationContext6 = this.f55003b;
        e0.checkNotNullExpressionValue(applicationContext6, "applicationContext");
        return new jq.a(applicationContext6, this.f55002a, adElementParams, adFormListener, eventCallback, aVar);
    }

    public final g b(f fVar, List<d1> list) {
        g gVarCreateVideoMeasurer;
        if (fVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (d1 d1Var : list) {
            try {
                gVarCreateVideoMeasurer = fVar.createVideoMeasurer(this.f55003b, d1Var.getName(), d1Var.getParameters());
            } catch (Throwable unused) {
                gVarCreateVideoMeasurer = null;
            }
            if (gVarCreateVideoMeasurer != null) {
                arrayList.add(gVarCreateVideoMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ar.c(arrayList);
    }

    public final d a(f fVar, List<d1> list) {
        d dVarCreateHtmlMeasurer;
        if (fVar == null || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (d1 d1Var : list) {
            try {
                dVarCreateHtmlMeasurer = fVar.createHtmlMeasurer(this.f55003b, d1Var.getName(), d1Var.getParameters());
            } catch (Throwable unused) {
                dVarCreateHtmlMeasurer = null;
            }
            if (dVarCreateHtmlMeasurer != null) {
                arrayList.add(dVarCreateHtmlMeasurer);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ar.b(arrayList);
    }
}
