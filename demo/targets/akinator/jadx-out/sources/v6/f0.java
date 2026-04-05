package v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.x0;
import uu.p1;
import v6.b0;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f89116c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f89117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f89118f;

    public /* synthetic */ f0(String str, List list, m0 m0Var, int i10) {
        this.f89115b = i10;
        this.f89116c = str;
        this.f89117e = list;
        this.f89118f = m0Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f89115b;
        int i11 = 15;
        int i12 = 14;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        String str = "getValue(...)";
        m0 m0Var = this.f89118f;
        List list = this.f89117e;
        String str2 = this.f89116c;
        switch (i10) {
            case 0:
                x5.b _connection = (x5.b) obj;
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                x5.d dVarPrepare = _connection.prepare(str2);
                try {
                    Iterator it = list.iterator();
                    int i18 = 1;
                    while (it.hasNext()) {
                        dVarPrepare.bindText(i18, (String) it.next());
                        i18++;
                    }
                    z.f fVar = new z.f();
                    z.f fVar2 = new z.f();
                    while (dVarPrepare.step()) {
                        String text = dVarPrepare.getText(0);
                        if (!fVar.containsKey(text)) {
                            fVar.put(text, new ArrayList());
                        }
                        String text2 = dVarPrepare.getText(0);
                        if (!fVar2.containsKey(text2)) {
                            fVar2.put(text2, new ArrayList());
                        }
                    }
                    dVarPrepare.reset();
                    m0Var.b(_connection, fVar);
                    m0Var.a(_connection, fVar2);
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        String text3 = dVarPrepare.getText(0);
                        x0 x0VarIntToState = t0.intToState((int) dVarPrepare.getLong(1));
                        androidx.work.b bVarFromByteArray = androidx.work.b.f7480b.fromByteArray(dVarPrepare.getBlob(2));
                        int i19 = (int) dVarPrepare.getLong(3);
                        int i20 = (int) dVarPrepare.getLong(4);
                        long j10 = dVarPrepare.getLong(14);
                        long j11 = dVarPrepare.getLong(15);
                        long j12 = dVarPrepare.getLong(16);
                        n6.a aVarIntToBackoffPolicy = t0.intToBackoffPolicy((int) dVarPrepare.getLong(17));
                        long j13 = dVarPrepare.getLong(18);
                        long j14 = dVarPrepare.getLong(19);
                        int i21 = (int) dVarPrepare.getLong(20);
                        long j15 = dVarPrepare.getLong(21);
                        int i22 = (int) dVarPrepare.getLong(22);
                        n6.f fVar3 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare.getBlob(6)), t0.intToNetworkType((int) dVarPrepare.getLong(5)), ((int) dVarPrepare.getLong(7)) != 0, ((int) dVarPrepare.getLong(8)) != 0, ((int) dVarPrepare.getLong(9)) != 0, ((int) dVarPrepare.getLong(10)) != 0, dVarPrepare.getLong(11), dVarPrepare.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare.getBlob(13)));
                        Object value = p1.getValue(fVar, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "getValue(...)");
                        List list2 = (List) value;
                        Object value2 = p1.getValue(fVar2, dVarPrepare.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "getValue(...)");
                        arrayList.add(new b0.c(text3, x0VarIntToState, bVarFromByteArray, j10, j11, j12, fVar3, i19, aVarIntToBackoffPolicy, j13, j14, i21, i20, j15, i22, list2, (List) value2));
                    }
                    dVarPrepare.close();
                    return arrayList;
                } catch (Throwable th2) {
                    dVarPrepare.close();
                    throw th2;
                }
            case 1:
                x5.b _connection2 = (x5.b) obj;
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection2, "_connection");
                x5.d dVarPrepare2 = _connection2.prepare(str2);
                try {
                    Iterator it2 = list.iterator();
                    int i23 = 1;
                    while (it2.hasNext()) {
                        dVarPrepare2.bindText(i23, (String) it2.next());
                        i23++;
                    }
                    z.f fVar4 = new z.f();
                    z.f fVar5 = new z.f();
                    while (dVarPrepare2.step()) {
                        String text4 = dVarPrepare2.getText(0);
                        if (!fVar4.containsKey(text4)) {
                            fVar4.put(text4, new ArrayList());
                        }
                        String text5 = dVarPrepare2.getText(0);
                        if (!fVar5.containsKey(text5)) {
                            fVar5.put(text5, new ArrayList());
                        }
                    }
                    dVarPrepare2.reset();
                    m0Var.b(_connection2, fVar4);
                    m0Var.a(_connection2, fVar5);
                    ArrayList arrayList2 = new ArrayList();
                    while (dVarPrepare2.step()) {
                        String text6 = dVarPrepare2.getText(0);
                        x0 x0VarIntToState2 = t0.intToState((int) dVarPrepare2.getLong(i16));
                        androidx.work.b bVarFromByteArray2 = androidx.work.b.f7480b.fromByteArray(dVarPrepare2.getBlob(i15));
                        int i24 = (int) dVarPrepare2.getLong(3);
                        int i25 = (int) dVarPrepare2.getLong(4);
                        long j16 = dVarPrepare2.getLong(i12);
                        long j17 = dVarPrepare2.getLong(15);
                        long j18 = dVarPrepare2.getLong(16);
                        n6.a aVarIntToBackoffPolicy2 = t0.intToBackoffPolicy((int) dVarPrepare2.getLong(17));
                        long j19 = dVarPrepare2.getLong(18);
                        long j20 = dVarPrepare2.getLong(19);
                        int i26 = (int) dVarPrepare2.getLong(20);
                        long j21 = dVarPrepare2.getLong(21);
                        int i27 = (int) dVarPrepare2.getLong(22);
                        z.f fVar6 = fVar5;
                        n6.f fVar7 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare2.getBlob(6)), t0.intToNetworkType((int) dVarPrepare2.getLong(5)), ((int) dVarPrepare2.getLong(7)) != 0, ((int) dVarPrepare2.getLong(8)) != 0, ((int) dVarPrepare2.getLong(9)) != 0, ((int) dVarPrepare2.getLong(10)) != 0, dVarPrepare2.getLong(11), dVarPrepare2.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare2.getBlob(13)));
                        Object value3 = p1.getValue(fVar4, dVarPrepare2.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value3, "getValue(...)");
                        List list3 = (List) value3;
                        Object value4 = p1.getValue(fVar6, dVarPrepare2.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value4, "getValue(...)");
                        arrayList2.add(new b0.c(text6, x0VarIntToState2, bVarFromByteArray2, j16, j17, j18, fVar7, i24, aVarIntToBackoffPolicy2, j19, j20, i26, i25, j21, i27, list3, (List) value4));
                        fVar5 = fVar6;
                        i12 = 14;
                        i15 = 2;
                        i16 = 1;
                    }
                    dVarPrepare2.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    dVarPrepare2.close();
                    throw th3;
                }
            default:
                x5.b _connection3 = (x5.b) obj;
                m0.a aVar3 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection3, "_connection");
                x5.d dVarPrepare3 = _connection3.prepare(str2);
                try {
                    Iterator it3 = list.iterator();
                    int i28 = 1;
                    while (it3.hasNext()) {
                        dVarPrepare3.bindText(i28, (String) it3.next());
                        i28++;
                    }
                    z.f fVar8 = new z.f();
                    z.f fVar9 = new z.f();
                    while (dVarPrepare3.step()) {
                        String text7 = dVarPrepare3.getText(0);
                        if (!fVar8.containsKey(text7)) {
                            fVar8.put(text7, new ArrayList());
                        }
                        String text8 = dVarPrepare3.getText(0);
                        if (!fVar9.containsKey(text8)) {
                            fVar9.put(text8, new ArrayList());
                        }
                    }
                    dVarPrepare3.reset();
                    m0Var.b(_connection3, fVar8);
                    m0Var.a(_connection3, fVar9);
                    ArrayList arrayList3 = new ArrayList();
                    while (dVarPrepare3.step()) {
                        String text9 = dVarPrepare3.getText(i17);
                        String str3 = str;
                        x0 x0VarIntToState3 = t0.intToState((int) dVarPrepare3.getLong(1));
                        androidx.work.b bVarFromByteArray3 = androidx.work.b.f7480b.fromByteArray(dVarPrepare3.getBlob(2));
                        int i29 = (int) dVarPrepare3.getLong(i14);
                        int i30 = (int) dVarPrepare3.getLong(i13);
                        long j22 = dVarPrepare3.getLong(14);
                        long j23 = dVarPrepare3.getLong(i11);
                        long j24 = dVarPrepare3.getLong(16);
                        n6.a aVarIntToBackoffPolicy3 = t0.intToBackoffPolicy((int) dVarPrepare3.getLong(17));
                        long j25 = dVarPrepare3.getLong(18);
                        long j26 = dVarPrepare3.getLong(19);
                        int i31 = (int) dVarPrepare3.getLong(20);
                        long j27 = dVarPrepare3.getLong(21);
                        int i32 = (int) dVarPrepare3.getLong(22);
                        n6.f fVar10 = new n6.f(t0.toNetworkRequest$work_runtime_release(dVarPrepare3.getBlob(6)), t0.intToNetworkType((int) dVarPrepare3.getLong(5)), ((int) dVarPrepare3.getLong(7)) != 0, ((int) dVarPrepare3.getLong(8)) != 0, ((int) dVarPrepare3.getLong(9)) != 0, ((int) dVarPrepare3.getLong(10)) != 0, dVarPrepare3.getLong(11), dVarPrepare3.getLong(12), t0.byteArrayToSetOfTriggers(dVarPrepare3.getBlob(13)));
                        Object value5 = p1.getValue(fVar8, dVarPrepare3.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value5, str3);
                        List list4 = (List) value5;
                        Object value6 = p1.getValue(fVar9, dVarPrepare3.getText(0));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value6, str3);
                        arrayList3.add(new b0.c(text9, x0VarIntToState3, bVarFromByteArray3, j22, j23, j24, fVar10, i29, aVarIntToBackoffPolicy3, j25, j26, i31, i30, j27, i32, list4, (List) value6));
                        str = str3;
                        i11 = 15;
                        i17 = 0;
                        i13 = 4;
                        i14 = 3;
                    }
                    dVarPrepare3.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    dVarPrepare3.close();
                    throw th4;
                }
        }
    }
}
