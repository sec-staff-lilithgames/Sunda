package v6;

import java.util.List;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import n6.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    public static final Flow<List<w0>> getWorkInfoPojosFlow(i iVar, CoroutineDispatcher dispatcher, y5.i query) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        return d0.dedup(iVar.getWorkInfoPojosFlow(query), dispatcher);
    }
}
