package v6;

import androidx.lifecycle.l1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import o5.u1;
import o5.w1;
import o5.y0;
import p0.o2;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f89140b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89141a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public m(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89141a = __db;
    }

    public final void a(x5.b bVar, z.f fVar) {
        Set<Object> setKeySet = fVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (fVar.size() > 999) {
            u5.o.recursiveFetchArrayMap(fVar, true, new l(this, bVar, 0));
            return;
        }
        StringBuilder sbU = o2.u("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        u5.y.appendPlaceholders(sbU, setKeySet.size());
        sbU.append(")");
        String string = sbU.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        x5.d dVarPrepare = bVar.prepare(string);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            dVarPrepare.bindText(i10, (String) it.next());
            i10++;
        }
        try {
            int columnIndex = u5.s.getColumnIndex(dVarPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (dVarPrepare.step()) {
                List list = (List) fVar.get(dVarPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(0)));
                }
            }
        } finally {
            dVarPrepare.close();
        }
    }

    public final void b(x5.b bVar, z.f fVar) {
        Set<Object> setKeySet = fVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (fVar.size() > 999) {
            u5.o.recursiveFetchArrayMap(fVar, true, new l(this, bVar, 1));
            return;
        }
        StringBuilder sbU = o2.u("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        u5.y.appendPlaceholders(sbU, setKeySet.size());
        sbU.append(")");
        String string = sbU.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        x5.d dVarPrepare = bVar.prepare(string);
        Iterator<Object> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            dVarPrepare.bindText(i10, (String) it.next());
            i10++;
        }
        try {
            int columnIndex = u5.s.getColumnIndex(dVarPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (dVarPrepare.step()) {
                List list = (List) fVar.get(dVarPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(dVarPrepare.getText(0));
                }
            }
        } finally {
            dVarPrepare.close();
        }
    }

    @Override // v6.i
    public List<b0.c> getWorkInfoPojos(y5.i query) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        u1 roomRawQuery = w1.f77763k.copyFrom(query).toRoomRawQuery();
        return (List) u5.c.performBlocking(this.f89141a, true, false, new k(roomRawQuery.getSql(), roomRawQuery, this, 0));
    }

    @Override // v6.i
    public Flow<List<b0.c>> getWorkInfoPojosFlow(y5.i query) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        u1 roomRawQuery = w1.f77763k.copyFrom(query).toRoomRawQuery();
        k kVar = new k(roomRawQuery.getSql(), roomRawQuery, this, 1);
        return q5.o.createFlow(this.f89141a, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, kVar);
    }

    @Override // v6.i
    public l1 getWorkInfoPojosLiveData(y5.i query) {
        kotlin.jvm.internal.e0.checkNotNullParameter(query, "query");
        u1 roomRawQuery = w1.f77763k.copyFrom(query).toRoomRawQuery();
        return this.f89141a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, (kv.l) new k(roomRawQuery.getSql(), roomRawQuery, this, 2));
    }
}
